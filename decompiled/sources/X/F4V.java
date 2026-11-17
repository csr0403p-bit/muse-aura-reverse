package X;

/* loaded from: classes5.dex */
public final class F4V implements InterfaceC2889Bnx {
    public final int $t;
    public final Object A00;

    public F4V(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC2889Bnx
    public final void ATY(InterfaceC2873Bng interfaceC2873Bng) {
        InterfaceC2889Bnx interfaceC2889Bnx;
        if (this.$t == 0) {
            final C2870Bnd c2870Bnd = ((C2878Bnl) this.A00).A00.get();
            if (c2870Bnd != null) {
                c2870Bnd.A03.execute(new Runnable() { // from class: X.Bnk
                    public static final String __redex_internal_original_name = "ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2870Bnd c2870Bnd2 = c2870Bnd;
                        synchronized (c2870Bnd2.A02) {
                            c2870Bnd2.A00 = null;
                            InterfaceC2873Bng interfaceC2873Bng2 = c2870Bnd2.A01;
                            if (interfaceC2873Bng2 != null) {
                                c2870Bnd2.A01 = null;
                                c2870Bnd2.A02(interfaceC2873Bng2);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        C2863BnN c2863BnN = (C2863BnN) this.A00;
        synchronized (c2863BnN.A05) {
            int i = c2863BnN.A00 - 1;
            c2863BnN.A00 = i;
            if (c2863BnN.A02 && i == 0) {
                c2863BnN.close();
            }
            interfaceC2889Bnx = c2863BnN.A01;
        }
        if (interfaceC2889Bnx != null) {
            interfaceC2889Bnx.ATY(interfaceC2873Bng);
        }
    }
}
