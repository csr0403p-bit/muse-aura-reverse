package X;

/* loaded from: classes6.dex */
public abstract class FPI extends Enum<FPI> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ForceLightMode";
            case 2:
                return "Default";
            default:
                return "ForceDarkMode";
        }
    }
}
