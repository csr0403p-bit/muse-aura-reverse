package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AZo {
    public static final long A00(InterfaceC1497Ak4 interfaceC1497Ak4, InterfaceC1497Ak4 interfaceC1497Ak42, InterfaceC1009APa interfaceC1009APa, long j, boolean z) {
        InterfaceC1497Ak4 interfaceC1497Ak4Ah1 = interfaceC1009APa.Ah1(interfaceC1497Ak4);
        InterfaceC1497Ak4 interfaceC1497Ak4Ah12 = interfaceC1009APa.Ah1(interfaceC1497Ak42);
        return interfaceC1497Ak4Ah1 instanceof C1384AiE ? ((C1384AiE) interfaceC1497Ak4Ah1).APn(interfaceC1497Ak4Ah12, j, z) : interfaceC1497Ak4Ah12 instanceof C1384AiE ? ((C1384AiE) interfaceC1497Ak4Ah12).APn(interfaceC1497Ak4Ah1, j, z) ^ (-9223372034707292160L) : interfaceC1497Ak4Ah1.APn(interfaceC1497Ak4Ah1, j, z);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0W<-LX/APa;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(BFM bfm, G0W g0w, int i) {
        bfm.AgG(441837433);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0w) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            Object obj2 = objAaT;
            if (objAaT == obj) {
                AZp aZp = new AZp();
                aZp.A00 = null;
                BBI.A0T(bfm, aZp);
                obj2 = aZp;
            }
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new BUS(13);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            BBI bbi = (BBI) bfm;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            BUT butA00 = BUT.A00(21);
            if (bbi.A0M) {
                bfm.A4P(Unit.INSTANCE, new C2296BSw(butA00, 14));
            }
            BPg.A00(bfm, obj2, 4);
            AnonymousClass004.A1B(bbi, obj2, bfm, g0w, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Gj(g0w, i);
        }
    }
}
