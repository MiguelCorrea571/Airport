/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model;

/**
 *
 * @author pc
 */
public class ContactInfo {
    private final int countryPhoneCode;
    private final long phone;

    public ContactInfo(int countryPhoneCode, long phone) {
        this.countryPhoneCode = countryPhoneCode;
        this.phone = phone;
    }

    public String getFormattedPhone() {
        return "+" + countryPhoneCode + " " + phone;
    }
}

