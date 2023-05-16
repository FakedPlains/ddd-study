package cloud.zfwproject.ddd.demo.pojo.type;

import javax.xml.bind.ValidationException;
import java.util.Arrays;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/16 4:31 PM
 */
public class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) throws ValidationException {
        if (number == null) {
            throw new ValidationException("number不能为空");
        } else if (isValid(number)) {
            throw new ValidationException("number格式错误");
        }
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public String getAreaCode() {
        for (int i = 0; i < number.length(); i++) {
            String prefix = number.substring(0, i);
            if (isAreaCode(prefix)) {
                return prefix;
            }
        }
        return null;
    }

    public static boolean isAreaCode(String prefix) {
        String[] areas = new String[]{"0571", "021", "010"};
        return Arrays.asList(areas).contains(prefix);
    }

    public static boolean isValid(String number) {
        String pattern = "^0[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }
}
