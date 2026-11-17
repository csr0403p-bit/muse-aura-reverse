package X;

import kotlin.Unit;

/* renamed from: X.1XW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XW extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ long $headlineContentColor;
    public final /* synthetic */ float $minHeight;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $title;
    public final /* synthetic */ long $titleContentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;JJFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C1XW(BRg bRg, G0V g0v, G0V g0v2, float f, int i, long j, long j2) {
        super(2);
        this.$modifier = bRg;
        this.$title = g0v;
        this.$titleContentColor = j;
        this.$headlineContentColor = j2;
        this.$minHeight = f;
        this.$content = g0v2;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        G0V<BFM, Integer, Unit> g0v = this.$title;
        long j = this.$titleContentColor;
        long j2 = this.$headlineContentColor;
        C1XA.A0B(bfmA0P, bRg, g0v, this.$content, this.$minHeight, AnonymousClass011.A00(this.$$changed), j, j2);
        return Unit.INSTANCE;
    }
}
