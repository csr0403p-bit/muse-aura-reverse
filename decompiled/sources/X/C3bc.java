package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bc, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bc implements Ht9, G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C3bc(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        BFM bfm;
        boolean z;
        BBI bbi;
        if (this.$t != 0) {
            MutableState mutableState = (MutableState) this.A00;
            Object obj3 = this.A01;
            G0V g0v = (G0V) this.A02;
            bfm = (BFM) obj;
            int iA0F = AnonymousClass001.A0F(obj2);
            z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm, iA0F)) {
                BRg bRgA00 = C1Z4.A00(BRg.A00, "border");
                long j = ((AWA) mutableState.getValue()).A00;
                AbstractC045819r abstractC045819r = AbstractC045819r.$redex_init_class;
                BRg bRgA03 = AEk.A03(bRgA00, new BT1(obj3, j, 1));
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
                bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA03);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass003.A0o(bfm, interfaceC1380AiAA0c, akqA04);
                    G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
                    if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0J)) {
                        AnonymousClass006.A1U(g0v2, bfm, iA0J);
                    }
                    AnonymousClass001.A16(bfm, bRgA01);
                    if (g0v == null) {
                        bfm.AgE(-1295979683);
                    } else {
                        bfm.AgE(235288868);
                        AnonymousClass001.A1H(bfm, g0v, 0);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, z);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.Afo();
        } else {
            BRg bRg = (BRg) this.A00;
            Object obj4 = this.A01;
            G0V g0v3 = (G0V) this.A02;
            bfm = (BFM) obj;
            int iA0F2 = AnonymousClass001.A0F(obj2);
            z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F2 & 3, 2), bfm, iA0F2)) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C3bS(obj4, 7);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA002 = ASZ.A00(bRg, (G0U) objAaT);
                InterfaceC1380AiA interfaceC1380AiAA0c2 = AnonymousClass001.A0c(true);
                bbi = (BBI) bfm;
                int iA0J2 = AnonymousClass003.A0J(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA002);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c2, akqA042, bRgA012, iA0J2);
                    AnonymousClass001.A1H(bfm, g0v3, 0);
                    BBI.A0R(bbi, z);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }
}
