package X;

/* renamed from: X.EuW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7393EuW extends Enum<AbstractC7393EuW> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MODERATE";
            case 2:
                return "HIGH";
            case 3:
                return "CRITICAL";
            default:
                return "LOW";
        }
    }
}
