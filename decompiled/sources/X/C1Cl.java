package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Cl, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Cl extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $animateToDismiss;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ G0V<BFM, Integer, C1Ny> $contentWindowInsets;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dragHandle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AT5<Float, AOW> $predictiveBackProgress;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ G0U<Float, Unit> $settleToDismiss;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $sheetMaxWidth;
    public final /* synthetic */ C1Pn $sheetState;
    public final /* synthetic */ float $tonalElevation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/1Pn;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/3UX;LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/BRg;FLX/1DM;JJFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C1Cl(AT5 at5, C1Pn c1Pn, BRg bRg, C1DM c1dm, Function0 function0, G0U g0u, G0V g0v, G0V g0v2, G0W g0w, C3UX c3ux, float f, float f2, long j, long j2, long j3) {
        super(2);
        this.$scrimColor = j;
        this.$animateToDismiss = function0;
        this.$sheetState = c1Pn;
        this.$predictiveBackProgress = at5;
        this.$scope = c3ux;
        this.$settleToDismiss = g0u;
        this.$modifier = bRg;
        this.$sheetMaxWidth = f;
        this.$shape = c1dm;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f2;
        this.$dragHandle = g0v;
        this.$contentWindowInsets = g0v2;
        this.$content = g0w;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgA01 = ARD.A01(AbstractC1754Apr.A00(C10G.A01), new C05433bp(18), false);
            long j = this.$scrimColor;
            Function0<Unit> function0 = this.$animateToDismiss;
            C1Pn c1Pn = this.$sheetState;
            AT5<Float, AOW> at5 = this.$predictiveBackProgress;
            C3UX c3ux = this.$scope;
            G0U<Float, Unit> g0u = this.$settleToDismiss;
            BRg bRg = this.$modifier;
            float f = this.$sheetMaxWidth;
            C1DM c1dm = this.$shape;
            long j2 = this.$containerColor;
            long j3 = this.$contentColor;
            float f2 = this.$tonalElevation;
            G0V<BFM, Integer, Unit> g0v = this.$dragHandle;
            G0V<BFM, Integer, C1Ny> g0v2 = this.$contentWindowInsets;
            G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm2, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function02);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA0c, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v3 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                AnonymousClass006.A1U(g0v3, bfm2, iA0J);
            }
            AnonymousClass001.A16(bfm2, bRgA012);
            C0z7 c0z7 = C0z7.A00;
            C1Co.A05(bfm2, function0, 0, j, AnonymousClass006.A1Z(c1Pn.A00.A0A.getValue(), C1Vj.Hidden));
            C1Co.A03(at5, c0z7, c1Pn, bfm2, bRg, c1dm, function0, g0u, g0v, g0v2, g0w, c3ux, f, f2, 70, 0, 0, j2, j3);
            BBI.A0R(bbi, true);
        }
        return Unit.INSTANCE;
    }
}
