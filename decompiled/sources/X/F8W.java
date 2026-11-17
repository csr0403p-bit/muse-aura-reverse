package X;

/* loaded from: classes6.dex */
public final class F8W extends FS5 {
    public int A00 = -1;
    public boolean A01;
    public final FSF A02;
    public final FBB A03;
    public final FDW A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                F8W f8w = (F8W) obj;
                if (this.A02 != f8w.A02 || this.A04.A04 != f8w.A04.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(FBB fbb, FDW fdw, int i, boolean z) {
        C9115Fyg c9115FygA00;
        HsM hsMA0D = fdw.A0D(97);
        if (hsMA0D != null) {
            c9115FygA00 = C9115Fyg.A00();
            c9115FygA00.A06(Integer.valueOf(i), 0);
            c9115FygA00.A06(Boolean.valueOf(z), 1);
            c9115FygA00.A06(fbb, 2);
        } else {
            hsMA0D = fdw.A0D(51);
            if (hsMA0D == null) {
                return;
            }
            c9115FygA00 = C9115Fyg.A00();
            c9115FygA00.A06(Integer.valueOf(i), 0);
            c9115FygA00.A06(fbb, 1);
        }
        F9J.A02(fbb, fdw, c9115FygA00, hsMA0D);
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A02) + this.A04.A04;
    }

    public F8W(FSF fsf, FBB fbb, FDW fdw) {
        this.A03 = fbb;
        this.A04 = fdw;
        this.A02 = fsf;
    }
}
