package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9496GLm implements GKY<FWR, FWR> {
    public static final C9496GLm A01 = new C9496GLm();
    public static final GLE<C9475GKr, FWR> A00 = new GLE(new I0R(8), C9475GKr.class, FWR.class);

    @Override // X.GKY
    public final Class<FWR> AGX() {
        return FWR.class;
    }

    @Override // X.GKY
    public final Class<FWR> AJ6() {
        return FWR.class;
    }

    @Override // X.GKY
    public final /* bridge */ /* synthetic */ FWR AiZ(GMS keysetHandle, C10458Hjg annotations, InterfaceC9462GKe<FWR> factory) throws GeneralSecurityException {
        C6966EdO c6966EdOA00;
        HjN hjN = new HjN();
        for (int i = 0; i < ((GKR) keysetHandle).A02.size(); i++) {
            GKW gkwACV = keysetHandle.ACV(i);
            if (gkwACV.A02.equals(C9461GKd.A03)) {
                FWR fwr = (FWR) factory.A7W(gkwACV);
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
                hjN.A00(c6966EdOA00, new C10593Hxj(fwr));
            }
        }
        annotations.A00.isEmpty();
        GMV gmv = GMU.A00;
        FWR fwr2 = (FWR) factory.A7W(keysetHandle.AJ5());
        keysetHandle.AJ5();
        return new HuM(gmv, gmv, new C7334ElC(hjN.A00), new C10593Hxj(fwr2));
    }
}
