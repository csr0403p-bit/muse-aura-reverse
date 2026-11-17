package X;

import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.16M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16M extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $animateToDismiss;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, C1Ny> $contentWindowInsets;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dragHandle;
    public final /* synthetic */ AT5<Float, AOW> $predictiveBackProgress;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ C1Pn $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Pn;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/3UX;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C16M(AT5 at5, C1Pn c1Pn, Function0 function0, G0V g0v, G0V g0v2, G0W g0w, C3UX c3ux) {
        super(2);
        this.$contentWindowInsets = g0v;
        this.$predictiveBackProgress = at5;
        this.$dragHandle = g0v2;
        this.$sheetState = c1Pn;
        this.$animateToDismiss = function0;
        this.$scope = c3ux;
        this.$content = g0w;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgA00 = BNH.A00(this.$contentWindowInsets.invoke(bfm2, 0), C10G.A02);
            boolean zA67 = bfm2.A67(this.$predictiveBackProgress);
            AT5<Float, AOW> at5 = this.$predictiveBackProgress;
            Object objAaT = bfm2.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new C05463bs(at5, 16);
                bfm2.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA00, objAaT);
            G0V<BFM, Integer, Unit> g0v = this.$dragHandle;
            C1Pn c1Pn = this.$sheetState;
            Function0<Unit> function0 = this.$animateToDismiss;
            C3UX c3ux = this.$scope;
            G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm2);
            BBI bbi = (BBI) bfm2;
            long j = bbi.A06;
            int i = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm2, bRgA0W);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm2, interfaceC1380AiAA0U, akqA04, g0v2);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v3 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, i)) {
                AnonymousClass006.A1U(g0v3, bfm2, i);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v4 = C1515AkP.A05;
            BPg.A02(bfm2, bRgA01, g0v4);
            C90l c90l = C90l.A00;
            bfm2.AgE(-1636564008);
            if (g0v != null) {
                String strA00 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cb1);
                String strA002 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cb2);
                String strA003 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cb4);
                AQC aqc = new AQC(C2VU.A00);
                boolean zA1O = AnonymousClass003.A1O(bfm2, c3ux, strA00, AnonymousClass005.A1T(bfm2, strA002, function0, strA003, bfm2.A65(c1Pn)));
                Object objAaT2 = bfm2.AaT();
                if (zA1O || objAaT2 == C78N.A00) {
                    objAaT2 = new C1rP(c1Pn, strA002, strA003, strA00, function0, c3ux);
                    bfm2.Ai0(objAaT2);
                }
                BRg bRgA012 = ARD.A01(aqc, (G0U) objAaT2, true);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm2, bRgA012);
                AnonymousClass005.A0n(bfm2, bbi, function02);
                BPg.A02(bfm2, interfaceC1380AiAA0c, g0v2);
                BPg.A02(bfm2, akqA042, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0D)) {
                    AnonymousClass006.A1U(g0v3, bfm2, iA0D);
                }
                BPg.A02(bfm2, bRgA013, g0v4);
                g0v.invoke(bfm2, 0);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            AnonymousClass004.A1B(bbi, c90l, bfm2, g0w, 6);
        }
        return Unit.INSTANCE;
    }
}
