package X;

import kotlin.Unit;

/* renamed from: X.8sV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sV extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $horizontalPadding;
    public final /* synthetic */ float $spacing;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $tag;
    public final /* synthetic */ String $text;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8sV(C1822Arm c1822Arm, String str, String str2, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.$text = str;
        this.$style = c1822Arm;
        this.$spacing = f;
        this.$tag = str2;
        this.$topPadding = f2;
        this.$horizontalPadding = f3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        String str = this.$text;
        C8sU.A00(bfmA0P, this.$style, str, this.$tag, this.$spacing, this.$topPadding, this.$horizontalPadding, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
