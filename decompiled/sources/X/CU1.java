package X;

/* loaded from: classes5.dex */
public abstract class CU1 {
    public static final Integer A00;

    static {
        Integer num = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            if (obj instanceof Integer) {
                Integer num2 = (Integer) obj;
                if (num2 != null && num2.intValue() > 0) {
                    num = num2;
                }
            }
        } catch (Throwable unused) {
        }
        A00 = num;
    }
}
