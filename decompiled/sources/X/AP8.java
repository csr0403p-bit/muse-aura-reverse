package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AP8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<AP1, BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AP8(BRg bRg, G0W<? super AP1, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        AP9.A01(this.$modifier, this.$content, AnonymousClass005.A0P(bfm, num), AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
