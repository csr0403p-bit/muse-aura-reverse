package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9499GLp implements GKY<Hwz, Hwz> {
    public static final C9499GLp A00 = new C9499GLp();

    @Override // X.GKY
    public final Class<Hwz> AGX() {
        return Hwz.class;
    }

    @Override // X.GKY
    public final Class<Hwz> AJ6() {
        return Hwz.class;
    }

    @Override // X.GKY
    public final /* bridge */ /* synthetic */ Hwz AiZ(GMS keysetHandle, C10458Hjg annotations, InterfaceC9462GKe<Hwz> factory) throws GeneralSecurityException {
        C6966EdO c6966EdOA00;
        GKW gkwAJ5 = keysetHandle.AJ5();
        if (gkwAJ5 == null) {
            throw BV6.A0u("no primary in primitive set");
        }
        HjN hjN = new HjN();
        for (int i = 0; i < ((GKR) keysetHandle).A02.size(); i++) {
            GKW gkwACV = keysetHandle.ACV(i);
            if (gkwACV.A02.equals(C9461GKd.A03)) {
                Object objA7W = factory.A7W(gkwACV);
                AbstractC9465GKh abstractC9465GKh = gkwACV.A01;
                if (abstractC9465GKh instanceof HoT) {
                    HoT hoT = (HoT) abstractC9465GKh;
                    c6966EdOA00 = hoT instanceof Ho4 ? ((Ho4) hoT).A01 : ((Htd) hoT).A01;
                } else {
                    if (!(abstractC9465GKh instanceof C9475GKr)) {
                        throw AbstractC9465GKh.A00(abstractC9465GKh);
                    }
                    c6966EdOA00 = ((C9475GKr) abstractC9465GKh).A00();
                }
                hjN.A00(c6966EdOA00, objA7W);
            }
        }
        return new C10497Hmq(new C7334ElC(hjN.A00), (Hwz) factory.A7W(gkwAJ5));
    }
}
