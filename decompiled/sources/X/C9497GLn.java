package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9497GLn implements GKY<EX9, EX9> {
    public static final C9497GLn A00 = new C9497GLn();
    public static final GLE<C9475GKr, EX9> A01 = new GLE(new I0R(3), C9475GKr.class, EX9.class);

    @Override // X.GKY
    public final Class<EX9> AGX() {
        return EX9.class;
    }

    @Override // X.GKY
    public final Class<EX9> AJ6() {
        return EX9.class;
    }

    @Override // X.GKY
    public final /* bridge */ /* synthetic */ EX9 AiZ(GMS keysetHandle, C10458Hjg annotations, InterfaceC9462GKe<EX9> factory) throws GeneralSecurityException {
        C6966EdO c6966EdOA00;
        HjN hjN = new HjN();
        for (int i = 0; i < ((GKR) keysetHandle).A02.size(); i++) {
            GKW gkwACV = keysetHandle.ACV(i);
            if (gkwACV.A02.equals(C9461GKd.A03)) {
                AbstractC9465GKh abstractC9465GKh = gkwACV.A01;
                if (abstractC9465GKh instanceof GMT) {
                    GMT gmt = (GMT) abstractC9465GKh;
                    c6966EdOA00 = gmt instanceof GM0 ? ((GM0) gmt).A01 : gmt instanceof C9507GLy ? ((C9507GLy) gmt).A01 : gmt instanceof GM2 ? ((GM2) gmt).A01 : gmt instanceof GM1 ? ((GM1) gmt).A01 : gmt instanceof C9508GLz ? ((C9508GLz) gmt).A01 : gmt instanceof HjH ? ((HjH) gmt).A01 : gmt instanceof GMI ? ((GMI) gmt).A01 : gmt instanceof Hnc ? ((Hnc) gmt).A01 : ((C10536Hqh) gmt).A01;
                } else {
                    if (!(abstractC9465GKh instanceof C9475GKr)) {
                        throw AbstractC9465GKh.A00(abstractC9465GKh);
                    }
                    c6966EdOA00 = ((C9475GKr) abstractC9465GKh).A00();
                }
                hjN.A00(c6966EdOA00, new Esz((EX9) factory.A7W(gkwACV)));
            }
        }
        annotations.A00.isEmpty();
        GMV gmv = GMU.A00;
        EX9 ex9 = (EX9) factory.A7W(keysetHandle.AJ5());
        keysetHandle.AJ5();
        return new Esy(new Esz(ex9), gmv, gmv, new C7334ElC(hjN.A00));
    }
}
