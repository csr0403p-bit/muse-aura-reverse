package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class APZ implements InterfaceC1009APa, AP1 {
    public InterfaceC1497Ak4 A00;
    public InterfaceC1497Ak4 A01;
    public Function0<Unit> A02;
    public final C3UX A07;
    public final /* synthetic */ InterfaceC1009APa A08;
    public final MutableState A03 = AbstractC1798ArH.A08(false);
    public final Function0<Unit> A06 = C2328BUc.A00(this, 3);
    public final SnapshotStateList<APo> A04 = new SnapshotStateList();
    public final C0981AMm<Object, APc> A05 = new C0981AMm<>();

    public final void A00() {
        int i;
        C0981AMm<Object, APc> c0981AMm = this.A05;
        Collection<APc> collectionValues = ((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A01.values();
        boolean z = false;
        for (APc aPc : collectionValues) {
            z = z || (aPc.A02() && aPc.A03());
            aPc.A01();
        }
        if (z != APC()) {
            MutableState.A09(z, this.A03);
            if (z) {
                return;
            }
            for (APc aPc2 : collectionValues) {
                MutableState mutableState = aPc2.A05;
                if (((List) mutableState.getValue()).size() > 1) {
                    List list = (List) mutableState.getValue();
                    C1003AOr<AWx> c1003AOr = C22x.A00;
                    int size = list.size();
                    while (i < size) {
                        i = ((C1008AOz) ((APh) list.get(i)).A04.getValue()).A03() ? 0 : i + 1;
                    }
                }
                APd aPd = aPc2.A02;
                aPd.A03 = C79.A00;
                aPd.A00 = aPd.A05.AGd();
                aPd.A07.Af8(C1018AQb.A00);
            }
        }
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 AHI(AYU ayu) {
        return this.A08.AHI(ayu);
    }

    @Override // X.AP1
    public final boolean APC() {
        return ((Boolean) this.A03.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1009APa
    public final long APl(InterfaceC1497Ak4 interfaceC1497Ak4, InterfaceC1497Ak4 interfaceC1497Ak42, long j, boolean z) {
        return this.A08.APl(interfaceC1497Ak4, interfaceC1497Ak42, j, z);
    }

    @Override // X.InterfaceC1009APa
    public final InterfaceC1497Ak4 Ah1(InterfaceC1497Ak4 interfaceC1497Ak4) {
        return this.A08.Ah1(interfaceC1497Ak4);
    }

    public APZ(InterfaceC1009APa interfaceC1009APa, C3UX c3ux) {
        this.A08 = interfaceC1009APa;
        this.A07 = c3ux;
    }

    @Override // X.AP1
    public final /* synthetic */ APL AaS(BFM bfm, Object obj) {
        bfm.AgE(800730162);
        APb aPb = APb.A00;
        boolean zA1Y = AnonymousClass001.A1Y(obj, bfm, -148945892);
        Object objAaT = bfm.AaT();
        if (zA1Y || objAaT == C78N.A00) {
            objAaT = new APL(aPb, obj);
            BBI.A0T(bfm, objAaT);
        }
        APL apl = (APL) objAaT;
        apl.A00.Af8(aPb);
        AnonymousClass006.A1M(bfm);
        return apl;
    }
}
