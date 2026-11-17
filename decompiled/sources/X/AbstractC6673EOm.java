package X;

/* renamed from: X.EOm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6673EOm extends Enum<AbstractC6673EOm> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "BARCELONA";
            case 1:
                return "FACEBOOK";
            case 2:
                return "FACEBOOK_LITE";
            case 3:
                return "INSTAGRAM";
            case 4:
                return "INSTAGRAM_LITE";
            case 5:
                return "MESSENGER";
            case 6:
                return "MLITE";
            case 7:
                return "OCULUS";
            case 8:
                return "VIBES";
            case 9:
                return "AURA";
            case 10:
                return "GIZMO";
            case 11:
                return "ECLIPSE";
            case 12:
                return "WEARABLES";
            case 13:
                return "WHATSAPP";
            default:
                return "UNKNOWN";
        }
    }

    public static String A01(EPL epl) {
        return A00(EPR.A00(EPR.A01(epl)));
    }
}
