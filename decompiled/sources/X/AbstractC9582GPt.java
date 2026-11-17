package X;

/* renamed from: X.GPt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9582GPt extends Enum<AbstractC9582GPt> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
            case 2:
                return "USER_INELIGIBLE";
            case 3:
                return "UNKNOWN";
            default:
                return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
    }
}
