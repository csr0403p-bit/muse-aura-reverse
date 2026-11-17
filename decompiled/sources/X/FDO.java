package X;

/* loaded from: classes6.dex */
public abstract class FDO {
    public static boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 'x' || cCharAt < '\t' || (cCharAt > '\r' && (cCharAt < ' ' || cCharAt > '~'))) {
                return true;
            }
        }
        return false;
    }
}
