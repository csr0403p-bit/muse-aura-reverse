package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ahb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1350Ahb implements InterfaceC1380AiA {
    public final AaH A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1350Ahb) && C7384Etj.areEqual(this.A00, ((C1350Ahb) obj).A00));
    }

    public static final List<List<C3TG>> A00(C3TF c3tf) {
        C7384Etj.A0Z(c3tf, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        C1453AjM c1453AjMAGz = ((InterfaceC1351Ahc) c3tf).AGz();
        boolean zA01 = A01(c1453AjMAGz);
        List<C1453AjM> listA08 = c1453AjMAGz.A0e.A00.A08();
        ArrayList arrayListA0t = C60Q.A0t(listA08);
        int size = listA08.size();
        for (int i = 0; i < size; i++) {
            C1453AjM c1453AjM = listA08.get(i);
            arrayListA0t.add(zA01 ? c1453AjM.A0G() : c1453AjM.A0d.A0G.A0c());
        }
        return arrayListA0t;
    }

    public static final boolean A01(C1453AjM c1453AjM) {
        int iIntValue = c1453AjM.A0d.A05.intValue();
        if (iIntValue == 1 || iIntValue == 3) {
            return true;
        }
        if (iIntValue == 0 || iIntValue == 2) {
            return false;
        }
        if (iIntValue != 4) {
            throw C3cG.A0q();
        }
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if (c1453AjMA0E != null) {
            return A01(c1453AjMA0E);
        }
        throw C60O.A0i("no parent for idle node");
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.A00.maxIntrinsicHeight(c3tf, A00(c3tf), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.A00.maxIntrinsicWidth(c3tf, A00(c3tf), i);
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        return this.A00.mo14measure3p2s80s(axy, A00(axy), j);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.A00.minIntrinsicHeight(c3tf, A00(c3tf), i);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.A00.minIntrinsicWidth(c3tf, A00(c3tf), i);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("MultiContentMeasurePolicyImpl(measurePolicy="));
    }

    public C1350Ahb(AaH aaH) {
        this.A00 = aaH;
    }
}
