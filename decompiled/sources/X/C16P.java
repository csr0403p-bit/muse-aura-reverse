package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.16P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16P extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ G0V<BFM, Integer, C1Ny> $contentWindowInsets;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dragHandle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ BA3 $properties;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $sheetMaxWidth;
    public final /* synthetic */ C1Pn $sheetState;
    public final /* synthetic */ float $tonalElevation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;LX/1Pn;FLX/1DM;JJFJLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/BA3;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;III)V */
    public C16P(BA3 ba3, C1Pn c1Pn, BRg bRg, C1DM c1dm, Function0 function0, G0V g0v, G0V g0v2, G0W g0w, float f, float f2, int i, int i2, int i3, long j, long j2, long j3) {
        super(2);
        this.$onDismissRequest = function0;
        this.$modifier = bRg;
        this.$sheetState = c1Pn;
        this.$sheetMaxWidth = f;
        this.$shape = c1dm;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$tonalElevation = f2;
        this.$scrimColor = j3;
        this.$dragHandle = g0v;
        this.$contentWindowInsets = g0v2;
        this.$properties = ba3;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Function0<Unit> function0 = this.$onDismissRequest;
        BRg bRg = this.$modifier;
        C1Pn c1Pn = this.$sheetState;
        float f = this.$sheetMaxWidth;
        C1DM c1dm = this.$shape;
        long j = this.$containerColor;
        long j2 = this.$contentColor;
        float f2 = this.$tonalElevation;
        long j3 = this.$scrimColor;
        C1Co.A04(this.$properties, c1Pn, bfmA0P, bRg, c1dm, function0, this.$dragHandle, this.$contentWindowInsets, this.$content, f, f2, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default, j, j2, j3);
        return Unit.INSTANCE;
    }
}
