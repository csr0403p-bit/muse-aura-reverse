package X;

import kotlin.Unit;

/* renamed from: X.9WI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WI extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ HkU $category;
    public final /* synthetic */ C9WH $style;
    public final /* synthetic */ float $top;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WI(HkU hkU, C9WH c9wh, float f, int i) {
        super(2);
        this.$category = hkU;
        this.$top = f;
        this.$style = c9wh;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9WG.A03(AnonymousClass005.A0P(bfm, num), this.$category, this.$style, this.$top, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
