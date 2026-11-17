package X;

import kotlin.Unit;

/* renamed from: X.0nN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0nN extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $horizontal;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $thickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0nN(BRg bRg, float f, int i, int i2, long j, boolean z) {
        super(2);
        this.$modifier = bRg;
        this.$color = j;
        this.$thickness = f;
        this.$horizontal = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        long j = this.$color;
        C0nM.A00(bfmA0P, bRg, this.$thickness, AnonymousClass011.A00(this.$$changed), this.$$default, j, this.$horizontal);
        return Unit.INSTANCE;
    }
}
