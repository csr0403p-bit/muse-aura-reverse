package X;

/* loaded from: classes4.dex */
public abstract class AI2 {
    public static final int A00(long j, long j2) {
        boolean zA1L = AnonymousClass002.A1L(((j & 1) > 0L ? 1 : ((j & 1) == 0L ? 0 : -1)));
        if (zA1L == AnonymousClass002.A1L(((j2 & 1) > 0L ? 1 : ((j2 & 1) == 0L ? 0 : -1)))) {
            float fA00 = AnonymousClass001.A00(j);
            float fA002 = AnonymousClass001.A00(j2);
            int iSignum = (int) Math.signum(fA00 - fA002);
            if (Math.min(fA00, fA002) < 0.0f || (zA1L = AnonymousClass002.A1L(((j & 2) > 0L ? 1 : ((j & 2) == 0L ? 0 : -1)))) == AnonymousClass002.A1L(((j2 & 2) > 0L ? 1 : ((j2 & 2) == 0L ? 0 : -1)))) {
                return iSignum;
            }
        }
        return zA1L ? -1 : 1;
    }
}
