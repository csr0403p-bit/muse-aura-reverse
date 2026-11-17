package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0c1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0c1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $headline;
    public final /* synthetic */ C1822Arm $headlineTextStyle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $modeToggleButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Wz;LX/Arm;)V */
    public C0c1(C1Wz c1Wz, C1822Arm c1822Arm, G0V g0v, G0V g0v2, G0V g0v3) {
        super(2);
        this.$headline = g0v;
        this.$modeToggleButton = g0v2;
        this.$title = g0v3;
        this.$colors = c1Wz;
        this.$headlineTextStyle = c1822Arm;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1062ATq c1062ATq = C10G.A02;
            G0V<BFM, Integer, Unit> g0v = this.$headline;
            G0V<BFM, Integer, Unit> g0v2 = this.$modeToggleButton;
            G0V<BFM, Integer, Unit> g0v3 = this.$title;
            C1Wz c1Wz = this.$colors;
            C1822Arm c1822Arm = this.$headlineTextStyle;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm2, C2VU.A02, 0);
            BBI bbi = (BBI) bfm2;
            long j = bbi.A06;
            int i = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm2, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v4 = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm2, interfaceC1380AiAA00, akqA04, g0v4);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v5 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, i)) {
                AnonymousClass006.A1U(g0v5, bfm2, i);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v6 = C1515AkP.A05;
            BPg.A02(bfm2, bRgA01, g0v6);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(g0v != null ? g0v2 != null ? AcQ.A03 : AcQ.A01 : AcQ.A00, bfm2, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm2, c1062ATq);
            AnonymousClass005.A0n(bfm2, bbi, function0);
            BPg.A02(bfm2, interfaceC1380AiAA002, g0v4);
            BPg.A02(bfm2, akqA042, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0D)) {
                AnonymousClass006.A1U(g0v5, bfm2, iA0D);
            }
            BPg.A02(bfm2, bRgA012, g0v6);
            C90m c90m = C90m.A00;
            bfm2.AgE(-1287344744);
            if (g0v != null) {
                C0yq.A01(c1822Arm, B1V.A00(bfm2, new C05503bw(4, c90m, g0v), -962031352), bfm2, 48);
            }
            BBI.A0R(bbi, false);
            bfm2.AgE(-1287336668);
            if (g0v2 != null) {
                AnonymousClass001.A1H(bfm2, g0v2, 0);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            bfm2.AgE(1995137078);
            if (g0v3 != null || g0v != null || g0v2 != null) {
                C0xs.A00(0.0f, c1Wz.A0B, null, bfm2, 0, 3);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1V);
        }
        return Unit.INSTANCE;
    }
}
