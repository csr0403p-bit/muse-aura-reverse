package X;

/* renamed from: X.Blv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2818Blv extends Enum<AbstractC2818Blv> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNINITIALIZED";
            case 1:
                return "INITIALIZED";
            case 2:
                return "GET_SURFACE";
            case 3:
                return "OPENING";
            case 4:
                return "OPENED";
            case 5:
                return "CLOSED";
            case 6:
                return "RELEASING";
            default:
                return "RELEASED";
        }
    }
}
