package X;

import kotlin.Unit;

/* renamed from: X.1AB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AB extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $focusedBorderThickness;
    public final /* synthetic */ C0dy $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ C1A9 $tmp0_rcvr;
    public final /* synthetic */ float $unfocusedBorderThickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AB(C0dy c0dy, C1A9 c1a9, C046319x c046319x, BRg bRg, C1DM c1dm, float f, float f2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$tmp0_rcvr = c1a9;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = c0dy;
        this.$modifier = bRg;
        this.$colors = c046319x;
        this.$shape = c1dm;
        this.$focusedBorderThickness = f;
        this.$unfocusedBorderThickness = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C1A9 c1a9 = this.$tmp0_rcvr;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        c1a9.A02(this.$interactionSource, this.$colors, bfmA0P, this.$modifier, this.$shape, this.$focusedBorderThickness, this.$unfocusedBorderThickness, AnonymousClass011.A00(this.$$changed), this.$$default, z, z2);
        return Unit.INSTANCE;
    }
}
