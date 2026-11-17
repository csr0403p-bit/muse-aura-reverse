package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.AKn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0974AKn {
    public static final AKH<InterfaceC0976AKp> A00 = new AKK(C2278BSe.A00(24));

    public static final InterfaceC1260Afz A00(BFM bfm) {
        bfm.AgE(282942128);
        BBI bbi = (BBI) bfm;
        InterfaceC0976AKp interfaceC0976AKp = (InterfaceC0976AKp) AKO.A07(A00, bbi);
        if (interfaceC0976AKp == null) {
            BBI.A0R(bbi, false);
            return null;
        }
        boolean zA65 = bfm.A65(interfaceC0976AKp);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            C0975AKo c0975AKo = (C0975AKo) interfaceC0976AKp;
            objAaT = new AndroidEdgeEffectOverscrollEffect(c0975AKo.A01, c0975AKo.A02, c0975AKo.A03, c0975AKo.A00);
            BBI.A0O(bbi, objAaT);
        }
        InterfaceC1260Afz interfaceC1260Afz = (InterfaceC1260Afz) objAaT;
        BBI.A0R(bbi, false);
        return interfaceC1260Afz;
    }
}
