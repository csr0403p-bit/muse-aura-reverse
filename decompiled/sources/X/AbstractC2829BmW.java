package X;

/* renamed from: X.BmW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2829BmW extends Enum<AbstractC2829BmW> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NOT_INITIALIZED";
            case 1:
                return "INITIALIZING";
            case 2:
                return "PENDING_RELEASE";
            case 3:
                return "READY";
            default:
                return "RELEASED";
        }
    }
}
