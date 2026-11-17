package X;

import kotlin.Unit;

/* renamed from: X.0xp, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xp extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $confirmButton;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dismissButton;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $tonalElevation;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgA0A = C10G.A0A(new C3UM(AbstractC2139Az7.A00, 360.0f, Float.NaN, 360.0f, Float.NaN, false), Float.NaN, 568.0f);
            C1DM c1dm = this.$shape;
            long j = this.$colors.A00;
            C11R.A02(null, bfm2, bRgA0A, c1dm, B1V.A00(bfm2, new C3c3(this.$dismissButton, this.$content, this.$confirmButton, 0), -1706202235), this.$tonalElevation, 0.0f, 104, j, 0L);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1DM;LX/1Wz;FLX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C0xp(C1Wz c1Wz, C1DM c1dm, G0V g0v, G0V g0v2, G0W g0w, float f) {
        super(2);
        this.$shape = c1dm;
        this.$colors = c1Wz;
        this.$tonalElevation = f;
        this.$content = g0w;
        this.$dismissButton = g0v;
        this.$confirmButton = g0v2;
    }
}
