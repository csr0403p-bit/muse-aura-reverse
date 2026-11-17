package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Ck, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ck extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<Unit> $animateToDismiss;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ G0V<BFM, Integer, C1Ny> $contentWindowInsets;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dragHandle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AT5<Float, AOW> $predictiveBackProgress;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ G0U<Float, Unit> $settleToDismiss;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $sheetMaxWidth;
    public final /* synthetic */ C1Pn $sheetState;
    public final /* synthetic */ InterfaceC05151eP $this_ModalBottomSheetContent;
    public final /* synthetic */ float $tonalElevation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1eP;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/3UX;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/BRg;LX/1Pn;FLX/1DM;JJFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;III)V */
    public C1Ck(AT5 at5, InterfaceC05151eP interfaceC05151eP, C1Pn c1Pn, BRg bRg, C1DM c1dm, Function0 function0, G0U g0u, G0V g0v, G0V g0v2, G0W g0w, C3UX c3ux, float f, float f2, int i, int i2, int i3, long j, long j2) {
        super(2);
        this.$this_ModalBottomSheetContent = interfaceC05151eP;
        this.$predictiveBackProgress = at5;
        this.$scope = c3ux;
        this.$animateToDismiss = function0;
        this.$settleToDismiss = g0u;
        this.$modifier = bRg;
        this.$sheetState = c1Pn;
        this.$sheetMaxWidth = f;
        this.$shape = c1dm;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$tonalElevation = f2;
        this.$dragHandle = g0v;
        this.$contentWindowInsets = g0v2;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        InterfaceC05151eP interfaceC05151eP = this.$this_ModalBottomSheetContent;
        AT5<Float, AOW> at5 = this.$predictiveBackProgress;
        C3UX c3ux = this.$scope;
        Function0<Unit> function0 = this.$animateToDismiss;
        G0U<Float, Unit> g0u = this.$settleToDismiss;
        BRg bRg = this.$modifier;
        C1Pn c1Pn = this.$sheetState;
        float f = this.$sheetMaxWidth;
        C1DM c1dm = this.$shape;
        long j = this.$containerColor;
        long j2 = this.$contentColor;
        C1Co.A03(at5, interfaceC05151eP, c1Pn, bfmA0P, bRg, c1dm, function0, g0u, this.$dragHandle, this.$contentWindowInsets, this.$content, c3ux, f, this.$tonalElevation, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default, j, j2);
        return Unit.INSTANCE;
    }
}
