package X;

import kotlin.Unit;

/* renamed from: X.9WL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WL extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C9WH $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WL(C9WH c9wh, String str, int i, boolean z) {
        super(2);
        this.$label = str;
        this.$isAvailable = z;
        this.$style = c9wh;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9WG.A05(AnonymousClass005.A0P(bfm, num), this.$style, this.$label, AnonymousClass011.A00(this.$$changed), this.$isAvailable);
        return Unit.INSTANCE;
    }
}
