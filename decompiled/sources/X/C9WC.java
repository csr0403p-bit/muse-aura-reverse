package X;

import kotlin.Unit;

/* renamed from: X.9WC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WC extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ float $height;
    public final /* synthetic */ C9W5 $loader;
    public final /* synthetic */ G0U<String, Unit> $onPhotoClick;
    public final /* synthetic */ G0U<String, Unit> $onShown;
    public final /* synthetic */ G0U<String, Unit> $onVideoClick;
    public final /* synthetic */ C9WD $photo;
    public final /* synthetic */ C9WB $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9WD;FFLX/9WB;LX/9W5;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;I)V */
    public C9WC(C9W5 c9w5, C9WD c9wd, C9WB c9wb, G0U g0u, G0U g0u2, G0U g0u3, float f, float f2, int i) {
        super(2);
        this.$photo = c9wd;
        this.$height = f;
        this.$cornerRadius = f2;
        this.$style = c9wb;
        this.$loader = c9w5;
        this.$onVideoClick = g0u;
        this.$onPhotoClick = g0u2;
        this.$onShown = g0u3;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C9WD c9wd = this.$photo;
        float f = this.$height;
        float f2 = this.$cornerRadius;
        C9WA.A02(bfmA0P, this.$loader, c9wd, this.$style, this.$onVideoClick, this.$onPhotoClick, this.$onShown, f, f2, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
