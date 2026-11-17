package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* renamed from: X.AiK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1389AiK extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj {
    public G0U<? super C2av, Unit> A00;

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        C1DM c1dm;
        boolean z;
        AbstractC1387AiH abstractC1387AiHA06 = AbstractC1414Aij.A06(this, 2);
        if (abstractC1387AiHA06.A0K) {
            c1dm = abstractC1387AiHA06.A04;
            z = abstractC1387AiHA06.A0H;
        } else {
            C1390AiL c1390AiL = AbstractC1396AiR.A00;
            if (c1390AiL == null) {
                AbstractC1396AiR.A00 = new C1390AiL();
            } else {
                c1390AiL.A00();
            }
            C1390AiL c1390AiL2 = AbstractC1396AiR.A00;
            C7384Etj.A0X(c1390AiL2);
            c1390AiL2.A0J = abstractC1387AiHA06.A0P.A0F;
            c1390AiL2.A0D = AQY.A01(((AZE) abstractC1387AiHA06).A03);
            Snapshot snapshotA03 = Snapshot.A03();
            G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            try {
                this.A00.invoke(c1390AiL2);
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                c1dm = c1390AiL2.A0I;
                z = c1390AiL2.A0L;
            } catch (Throwable th) {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                throw th;
            }
        }
        if (z) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A0Y, c1dm);
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AOU() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("BlockGraphicsLayerModifier(block="));
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        int i = azeAQW.A01;
        int i2 = azeAQW.A00;
        return axy.APV(C9jH.A00, new C2334BUi(11, azeAQW, this), i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
