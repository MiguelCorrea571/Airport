/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author pc
 */
public class LoadController {
    public static void Load(JComboBox<String> FlightRegistrationPlane,JComboBox<String> FlightRegistrationLocation,JComboBox<String> FlightRegistrationArrivalLocation,JComboBox<String> FlightRegistrationScaleLocation,JComboBox<String> DelayID,JComboBox<String> AddFlightFlight){
        FlightRegistrationPlane.removeAllItems();
        FlightRegistrationLocation.removeAllItems();
        FlightRegistrationArrivalLocation.removeAllItems();
        FlightRegistrationScaleLocation.removeAllItems();

// Cargar aviones desde planes.json
        File planesFile = new File("json/planes.json");
        if (planesFile.exists()) {
            try (InputStream is = new FileInputStream(planesFile)) {
                JSONArray airplanesArray = new JSONArray(new JSONTokener(is));
                for (int i = 0; i < airplanesArray.length(); i++) {
                    JSONObject obj = airplanesArray.getJSONObject(i);
                    if (obj.has("id")) {
                        String id = obj.getString("id");
                        FlightRegistrationPlane.addItem(id);
                    }
                }
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        }

// Cargar ubicaciones desde locations.json
        File locationsFile = new File("json/locations.json");
        if (locationsFile.exists()) {
            try (InputStream is = new FileInputStream(locationsFile)) {
                JSONArray locationsArray = new JSONArray(new JSONTokener(is));
                for (int i = 0; i < locationsArray.length(); i++) {
                    JSONObject obj = locationsArray.getJSONObject(i);

                    if (!obj.has("airportId") || !obj.has("airportLatitude") || !obj.has("airportLongitude")) {
                        continue;
                    }

                    String id = obj.getString("airportId");
                    double lat, lon;

                    try {
                        lat = Double.parseDouble(obj.get("airportLatitude").toString().replace(',', '.'));
                        lon = Double.parseDouble(obj.get("airportLongitude").toString().replace(',', '.'));
                    } catch (NumberFormatException e) {
                        continue;
                    }

                    // Agregar ID a los combos de locations
                    FlightRegistrationLocation.addItem(id);
                    FlightRegistrationArrivalLocation.addItem(id);
                    FlightRegistrationScaleLocation.addItem(id);
                }
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        }

        DelayID.removeAllItems(); // Limpiar primero

        File file = new File("json/flights.json");
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo flights.json", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (InputStream is = new FileInputStream(file)) {
            JSONArray flightsArray = new JSONArray(new JSONTokener(is));
            for (int i = 0; i < flightsArray.length(); i++) {
                JSONObject obj = flightsArray.getJSONObject(i);
                if (obj.has("id")) {
                    String id = obj.getString("id");
                    DelayID.addItem(id);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error leyendo flights.json: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (JSONException e) {
            JOptionPane.showMessageDialog(null, "Error al procesar el JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        AddFlightFlight.removeAllItems(); // Limpiar primero

        try (InputStream is = new FileInputStream(file)) {
            JSONArray flightsArray = new JSONArray(new JSONTokener(is));

            for (int i = 0; i < flightsArray.length(); i++) {
                JSONObject obj = flightsArray.getJSONObject(i);
                if (obj.has("id")) {
                    String id = obj.getString("id");
                    AddFlightFlight.addItem(id);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error leyendo flights.json: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (JSONException e) {
            JOptionPane.showMessageDialog(null, "Error al procesar el JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
