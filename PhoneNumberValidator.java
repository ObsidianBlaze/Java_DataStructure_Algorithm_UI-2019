
import java.util.regex.Pattern;

public class PhoneNumberValidator {
     private void numberChecker(String countryCode, String phonenumber){
        String phone = "";
        String newCode = "";

        //Pattern for phone number
        boolean check = Pattern.compile("[0]*[\\d]{9,}").matcher(phonenumber).matches();

        //Pattern for country code
        boolean checker = Pattern.compile("[+][1-9]{1,3}").matcher(countryCode).matches();
        System.out.println(check);
        System.out.println(checker);

        if (check && checker) {
            phone = phonenumber;
            newCode = countryCode;
        } else {
            System.out.println("Country Code is wrong");
            System.out.println("Phone number is wrong");
        }
        System.out.print(newCode);
        System.out.println(phone);
    
    }
    
}
