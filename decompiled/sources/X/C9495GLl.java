package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9495GLl implements GKY<EXA, EXA> {
    public static final C9495GLl A00 = new C9495GLl();
    public static final GLE<C9475GKr, EXA> A01 = new GLE(new I0R(7), C9475GKr.class, EXA.class);

    @Override // X.GKY
    public final Class<EXA> AGX() {
        return EXA.class;
    }

    @Override // X.GKY
    public final Class<EXA> AJ6() {
        return EXA.class;
    }

    @Override // X.GKY
    public final /* bridge */ /* synthetic */ EXA AiZ(GMS handle, C10458Hjg annotations, InterfaceC9462GKe<EXA> factory) throws GeneralSecurityException {
        C6966EdO c6966EdOA00;
        HjN hjN = new HjN();
        for (int i = 0; i < ((GKR) handle).A02.size(); i++) {
            GKW gkwACV = handle.ACV(i);
            if (gkwACV.A02.equals(C9461GKd.A03)) {
                EXA exa = (EXA) factory.A7W(gkwACV);
                AbstractC9465GKh abstractC9465GKh = gkwACV.A01;
                if (abstractC9465GKh instanceof AbstractC9493GLj) {
                    c6966EdOA00 = ((C9492GLi) ((AbstractC9493GLj) abstractC9465GKh)).A01;
                } else {
                    if (!(abstractC9465GKh instanceof C9475GKr)) {
                        throw AbstractC9465GKh.A00(abstractC9465GKh);
                    }
                    c6966EdOA00 = ((C9475GKr) abstractC9465GKh).A00();
                }
                hjN.A00(c6966EdOA00, new Et0(exa));
            }
        }
        annotations.A00.isEmpty();
        GMV gmv = GMU.A00;
        EXA exa2 = (EXA) factory.A7W(handle.AJ5());
        handle.AJ5();
        return new Esx(new Et0(exa2), gmv, gmv, new C7334ElC(hjN.A00));
    }
}
