package X;

import kotlin.Unit;

/* renamed from: X.0mu, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0mu extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ float $crossAxisSpacing;
    public final /* synthetic */ float $mainAxisSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (FFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C0mu(G0V g0v, float f, float f2, int i) {
        super(2);
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
        this.$content = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C0mt.A01(AnonymousClass005.A0P(bfm, num), this.$content, this.$mainAxisSpacing, this.$crossAxisSpacing, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
