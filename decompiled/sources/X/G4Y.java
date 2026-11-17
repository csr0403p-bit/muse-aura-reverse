package X;

/* loaded from: classes6.dex */
public abstract class G4Y extends Enum<G4Y> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PRODUCT_ID_FORMAT";
            case 2:
                return "PRODUCT_NOT_FOUND";
            case 3:
                return "NO_ELIGIBLE_OFFER";
            default:
                return "UNKNOWN";
        }
    }
}
