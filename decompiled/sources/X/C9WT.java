package X;

import kotlin.Unit;

/* renamed from: X.9WT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WT extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $containerSize;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ C9WZ $icon;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WT(BRg bRg, C9WZ c9wz, float f, float f2, float f3, float f4, int i, int i2, long j) {
        super(2);
        this.$icon = c9wz;
        this.$size = f;
        this.$color = j;
        this.$strokeWidth = f2;
        this.$cornerRadius = f3;
        this.$modifier = bRg;
        this.$containerSize = f4;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C9WZ c9wz = this.$icon;
        float f = this.$size;
        long j = this.$color;
        C9WU.A00(bfmA0P, this.$modifier, c9wz, f, this.$strokeWidth, this.$cornerRadius, this.$containerSize, AnonymousClass011.A00(this.$$changed), this.$$default, j);
        return Unit.INSTANCE;
    }
}
