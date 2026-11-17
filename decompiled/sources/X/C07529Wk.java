package X;

import kotlin.Unit;

/* renamed from: X.9Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07529Wk extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $res;
    public final /* synthetic */ C07509Wi $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07529Wk(C07509Wi c07509Wi, int i, int i2) {
        super(2);
        this.$res = i;
        this.$style = c07509Wi;
        this.$$changed = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        AbstractC07499Wh.A04(AnonymousClass005.A0P(bfm, num), this.$style, this.$res, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
