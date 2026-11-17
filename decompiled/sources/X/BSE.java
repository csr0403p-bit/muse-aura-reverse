package X;

/* loaded from: classes4.dex */
public final class BSE implements ARL {
    public final int $t;

    public BSE(int i) {
        this.$t = i;
    }

    @Override // X.ARL
    public final long A6j(long j, long j2) {
        long j3;
        long j4;
        long jA0P;
        long jA0P2;
        switch (this.$t) {
            case 0:
                long jA0P3 = C8j3.A0P(Math.max(AnonymousClass001.A00(j2) / AnonymousClass001.A00(j), AnonymousClass001.A01(j2, 4294967295L) / AnonymousClass001.A01(j, 4294967295L)));
                j3 = jA0P3 << 32;
                j4 = 4294967295L & jA0P3;
                return j3 | j4;
            case 1:
                float fA00 = AnonymousClass001.A00(j2) / AnonymousClass001.A00(j);
                jA0P = 4294967295L;
                float fA01 = AnonymousClass001.A01(j2, 4294967295L) / AnonymousClass001.A01(j, 4294967295L);
                long jA0P4 = C8j3.A0P(fA00);
                jA0P2 = C8j3.A0P(fA01);
                j3 = jA0P4 << 32;
                break;
            case 2:
                jA0P = C8j3.A0P(B1B.A00(j, j2));
                j3 = jA0P << 32;
                jA0P2 = 4294967295L;
                break;
            case 3:
                jA0P = 4294967295L;
                jA0P2 = C8j3.A0P((AnonymousClass001.A00(j) > AnonymousClass001.A00(j2) || AnonymousClass001.A01(j, 4294967295L) > AnonymousClass001.A01(j2, 4294967295L)) ? B1B.A00(j, j2) : 1.0f);
                j3 = jA0P2 << 32;
                break;
            default:
                return 0L;
        }
        j4 = jA0P2 & jA0P;
        return j3 | j4;
    }
}
