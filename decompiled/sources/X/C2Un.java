package X;

/* renamed from: X.2Un, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Un {
    public static final AaC A00(BLU blu) {
        return new AaC(blu.A01, blu.A03, blu.A02, blu.A00);
    }

    public static final BLU A01(long j, long j2) {
        int i = (int) (j >> 32);
        int iA09 = AnonymousClass002.A09(j);
        return new BLU(i, iA09, i + ((int) (j2 >> 32)), iA09 + AnonymousClass002.A09(j2));
    }

    public static final BLU A02(AaC aaC) {
        return new BLU(Math.round(aaC.A01), Math.round(aaC.A03), Math.round(aaC.A02), Math.round(aaC.A00));
    }
}
