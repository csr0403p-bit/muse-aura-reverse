package X;

/* loaded from: classes4.dex */
public abstract class ATB {
    public static final AT7 A00(float f, float f2) {
        return new AT7(AOW.A00(f2), AVd.A02, Float.valueOf(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ AT7 A01(AT7 at7, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = C8j3.A07(at7.A05);
        }
        if ((i & 2) != 0) {
            f2 = ((AOW) at7.A02).A00;
        }
        long j = at7.A01;
        long j2 = at7.A00;
        boolean z = at7.A03;
        return new AT7(AOW.A00(f2), at7.A04, Float.valueOf(f), j, j2, z);
    }
}
