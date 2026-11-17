package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class Ck0 implements Runnable {
    public static final String __redex_internal_original_name = "RequestRunner$InternalRequestRunnable";
    public final C4019Ck1 A00;
    public final /* synthetic */ C4035Ckb A01;

    public Ck0(C4019Ck1 c4019Ck1, C4035Ckb c4035Ckb) {
        this.A01 = c4035Ckb;
        this.A00 = c4019Ck1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        C4019Ck1 c4019Ck1 = this.A00;
        threadCurrentThread.setName(FGI.A0M("RequestRunner ", c4019Ck1.A04));
        try {
            try {
                try {
                    for (C4033CkZ c4033CkZ = c4019Ck1.A01; c4033CkZ != null; c4033CkZ = c4033CkZ.A00) {
                        InterfaceC4037Ckd interfaceC4037Ckd = c4033CkZ.A01;
                        if (c4019Ck1.A06) {
                            throw C3cG.A0Q("Request has already been executed and may not be re-used");
                        }
                        if (c4019Ck1.A05 != null) {
                            throw C3cG.A0Q("must be called before AppRequest.buildRequest");
                        }
                        interfaceC4037Ckd.AR3(c4019Ck1.A03);
                    }
                } finally {
                    threadCurrentThread.setName(name);
                }
            } catch (IOException e) {
                c4019Ck1.A00.ATK(e);
            }
            if (c4019Ck1.A06) {
                throw C3cG.A0Q("Request has already been executed and may not be re-used");
            }
            if (c4019Ck1.A05 != null) {
                throw C3cG.A0Q("Request has already been built.");
            }
            c4019Ck1.A05 = new CYB(c4019Ck1.A03);
            if (c4019Ck1.A06) {
                throw C3cG.A0Q("Request has already been executed and may not be re-used");
            }
            if (c4019Ck1.A05 == null) {
                throw C3cG.A0Q("must call AppRequest.buildRequest");
            }
            CYB cyb = c4019Ck1.A05;
            if (c4019Ck1.A06) {
                throw C3cG.A0Q("Request has already been executed and may not be re-used");
            }
            C7416EvJ c7416EvJA00 = this.A01.A00.A01.A00(cyb);
            CGu cGu = c4019Ck1.A02;
            if (cGu != null) {
                cGu.AVV(c4019Ck1, c7416EvJA00);
            }
            c4019Ck1.A00.AVX(c7416EvJA00);
        } finally {
            c4019Ck1.A00();
        }
    }
}
