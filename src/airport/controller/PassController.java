/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.controller;

import airport.controller.utils.Response;
import airport.controller.utils.Status;
import airport.model.ContactInfo;
import airport.model.Passenger;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author pc
 */
public class PassController {
    private static ContactInfo contactInfo= new ContactInfo();

    public static Response createPassenger(String idStr, String firstName, String lastName, String yearStr, String monthStr, String dayStr, String phoneCodeStr, String phoneStr, String country) {

        if (idStr == null || idStr.trim().isEmpty()) {
            return new Response("No hay ID", Status.BAD_REQUEST);
        }
        if (firstName == null || firstName.trim().isEmpty()) {
            return new Response("No hay nombre", Status.BAD_REQUEST);
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            return new Response("No hay apellido", Status.BAD_REQUEST);
        }
        if (yearStr == null || yearStr.trim().isEmpty()) {
            return new Response("No hay año", Status.BAD_REQUEST);
        }
        if (monthStr == null || monthStr.trim().isEmpty()) {
            return new Response("No hay mes", Status.BAD_REQUEST);
        }
        if (dayStr == null || dayStr.trim().isEmpty()) {
            return new Response("No hay día", Status.BAD_REQUEST);
        }
        if (phoneCodeStr == null || phoneCodeStr.trim().isEmpty()) {
            return new Response("No hay indicativo telefónico", Status.BAD_REQUEST);
        }
        if (phoneStr == null || phoneStr.trim().isEmpty()) {
            return new Response("No hay teléfono", Status.BAD_REQUEST);
        }
        if (country == null || country.trim().isEmpty()) {
            return new Response("No hay país", Status.BAD_REQUEST);
        }

        long id;
        int year, month, day, phoneCode;
        long phone;
        try {
            id = Long.parseLong(idStr.trim());
        } catch (NumberFormatException e) {
            return new Response("ID inválido, debe ser numérico", Status.BAD_REQUEST);
        }
        try {
            year = Integer.parseInt(yearStr.trim());
            month = Integer.parseInt(monthStr.trim());
            day = Integer.parseInt(dayStr.trim());
        } catch (NumberFormatException e) {
            return new Response("Fecha inválida, año, mes y día deben ser números", Status.BAD_REQUEST);
        }
        try {
            phoneCode = Integer.parseInt(phoneCodeStr.trim());
            phone = Long.parseLong(phoneStr.trim());
        } catch (NumberFormatException e) {
            return new Response("Teléfono o indicativo inválido", Status.BAD_REQUEST);
        }

        LocalDate birthDate;
        try {
            birthDate = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            return new Response("Fecha de nacimiento inválida", Status.BAD_REQUEST);
        }

        int age = Period.between(birthDate, LocalDate.now()).getYears();
        if (age < 0 || age > 150) {
            return new Response("Edad inválida calculada", Status.BAD_REQUEST);
        }

        return new Response("Pasajero creado exitosamente", Status.CREATED);
    }
    public static Passenger createrPassenger(long id, String firstname, String lastname, LocalDate birthDate, int countryPhoneCode, long phone, String country){
        return new Passenger(id, firstname,lastname,birthDate,countryPhoneCode,phone,country);
    }
    public static int getAge(Passenger passenger){
        return passenger.getAge();
    }
    public static String getFullname(Passenger passenger) {
        return passenger.getFullName();
    }
    
    public static String generateFullPhone(Passenger passenger) {
        return contactInfo.getFormattedPhone(passenger);
    }
}
