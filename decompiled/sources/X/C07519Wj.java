package X;

import kotlin.Unit;

/* renamed from: X.9Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07519Wj extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C07509Wi $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07519Wj(BRg bRg, C07509Wi c07509Wi, String str, int i, int i2, long j) {
        super(2);
        this.$text = str;
        this.$color = j;
        this.$style = c07509Wi;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        String str = this.$text;
        long j = this.$color;
        AbstractC07499Wh.A02(bfmA0P, this.$modifier, this.$style, str, AnonymousClass011.A00(this.$$changed), this.$$default, j);
        return Unit.INSTANCE;
    }
}
