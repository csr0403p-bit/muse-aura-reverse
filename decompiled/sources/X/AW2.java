package X;

/* loaded from: classes4.dex */
public abstract class AW2 {
    public static final boolean A01(AW7 aw7) {
        long j = aw7.A06;
        return (j >>> 32) == (j & 4294967295L) && j == aw7.A07 && j == aw7.A05 && j == aw7.A04;
    }

    public static final AW7 A00(float f, float f2, float f3, float f4, long j) {
        long jA0L = AnonymousClass005.A0L(AnonymousClass001.A00(j), AnonymousClass001.A01(j, 4294967295L));
        return new AW7(f, f2, f3, f4, jA0L, jA0L, jA0L, jA0L);
    }
}
