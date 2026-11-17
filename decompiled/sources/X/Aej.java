package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class Aej {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;ILX/A4A;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(A4A a4a, BFM bfm, Object obj, G0V g0v, int i, int i2) {
        bfm.AgG(872548579);
        int iA0T = (i2 & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0T |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, a4a);
        }
        if ((i2 & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            boolean zA1K = AnonymousClass003.A1K(bfm, obj, a4a);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new C1209Aek(a4a, obj);
                BBI.A0T(bfm, objAaT);
            }
            C1209Aek c1209Aek = (C1209Aek) objAaT;
            c1209Aek.A00 = i;
            AKH<InterfaceC1210Ael> akh = AbstractC1212Aep.A00;
            InterfaceC1210Ael interfaceC1210Ael = (InterfaceC1210Ael) AKO.A07(akh, (BBI) bfm);
            Snapshot snapshotA03 = Snapshot.A03();
            G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            try {
                MutableState mutableState = c1209Aek.A04;
                if (interfaceC1210Ael != ((InterfaceC1210Ael) mutableState.getValue())) {
                    mutableState.Af8(interfaceC1210Ael);
                    if (c1209Aek.A01 > 0) {
                        InterfaceC1211Aem interfaceC1211Aem = c1209Aek.A02;
                        if (interfaceC1211Aem != null) {
                            interfaceC1211Aem.release();
                        }
                        c1209Aek.A02 = interfaceC1210Ael != null ? interfaceC1210Ael.AXt() : null;
                    }
                }
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                boolean zA65 = bfm.A65(c1209Aek);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = C2295BSv.A00(c1209Aek, 37);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, c1209Aek);
                AKT.A01(bfm, akh.A04(c1209Aek), g0v, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
            } catch (Throwable th) {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                throw th;
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTU(obj, a4a, g0v, i, i2, 1);
        }
    }
}
