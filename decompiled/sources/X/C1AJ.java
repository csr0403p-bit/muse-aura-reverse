package X;

import kotlin.Unit;

/* renamed from: X.1AJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AJ extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $height;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ C1AG $tmp1_rcvr;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AJ(C1AG c1ag, BRg bRg, C1DM c1dm, float f, float f2, int i, int i2, long j) {
        super(2);
        this.$tmp1_rcvr = c1ag;
        this.$modifier = bRg;
        this.$width = f;
        this.$height = f2;
        this.$shape = c1dm;
        this.$color = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C1AG c1ag = this.$tmp1_rcvr;
        BRg bRg = this.$modifier;
        float f = this.$width;
        float f2 = this.$height;
        c1ag.A00(bfmA0P, bRg, this.$shape, f, f2, AnonymousClass011.A00(this.$$changed), this.$$default, this.$color);
        return Unit.INSTANCE;
    }
}
