package X;

/* loaded from: classes5.dex */
public final class CSE<TResult> {
    public final CSC A00 = new CSC();

    public static void A00(CSE cse, Throwable th) {
        cse.A01(new RuntimeException(th));
    }

    public final void A01(Exception exc) {
        CSC csc = this.A00;
        CRy.A04(exc, "Exception must not be null");
        synchronized (csc.A04) {
            if (csc.A02) {
                return;
            }
            csc.A02 = true;
            csc.A00 = exc;
            csc.A03.A00(csc);
        }
    }

    public final void A02(TResult tresult) {
        this.A00.A0G(tresult);
    }

    public CSE(C3513CRn c3513CRn) {
        c3513CRn.A00.A06(new CSH(new CSG(this)), AbstractC3097ByB.A00);
    }

    public CSE() {
    }
}
