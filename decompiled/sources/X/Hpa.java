package X;

import java.math.BigDecimal;

/* loaded from: classes6.dex */
public abstract class Hpa {
    public static BigDecimal A02(char[] cArr, int i, int i2) {
        try {
            return i2 < 500 ? new BigDecimal(cArr, i, i2) : AbstractC6762EYw.A01(cArr, i, i2);
        } catch (ArithmeticException | NumberFormatException e) {
            throw A01(e, cArr, i, i2);
        }
    }

    public static NumberFormatException A00(Exception exc, String str) {
        Object[] objArr;
        String str2;
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        int length = str.length();
        if (length <= 1000) {
            objArr = new Object[]{str};
            str2 = "\"%s\"";
        } else {
            objArr = new Object[]{str.substring(0, 1000), 1000, Integer.valueOf(length)};
            str2 = "\"%s\" (truncated to %d chars (from %d))";
        }
        return new NumberFormatException(String.format("Value %s can not be deserialized as `java.math.BigDecimal`, reason:  %s", String.format(str2, objArr), message));
    }

    public static NumberFormatException A01(Exception exc, char[] cArr, int i, int i2) {
        Object[] objArr;
        String str;
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        if (i2 <= 1000) {
            objArr = new Object[]{new String(cArr, i, i2)};
            str = "\"%s\"";
        } else {
            objArr = new Object[]{new String(cArr, i, 1000), 1000, Integer.valueOf(i2)};
            str = "\"%s\" (truncated to %d chars (from %d))";
        }
        return new NumberFormatException(String.format("Value %s can not be deserialized as `java.math.BigDecimal`, reason:  %s", String.format(str, objArr), message));
    }
}
