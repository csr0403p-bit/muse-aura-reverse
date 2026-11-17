package X;

/* loaded from: classes5.dex */
public abstract class EQB extends Enum<EQB> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "PROVIDER_NOT_RESOLVABLE";
            case 1:
                return "PROVIDER_UNTRUSTED";
            case 2:
                return "TRANSPORT_DISABLED";
            case 3:
                return "NO_CACHED_CREDENTIAL";
            case 4:
                return "INCOMPLETE_RECORD";
            case 5:
                return "EXPIRED";
            case 6:
                return "SELECTION_UNSUPPORTED";
            case 7:
                return "CALLER_REJECTED";
            case 8:
                return "UNREADABLE_RESPONSE";
            default:
                return "READ_FAILED";
        }
    }
}
