package X;

import kotlin.Unit;

/* renamed from: X.9WP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WP extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $last;
    public final /* synthetic */ boolean $leading;
    public final /* synthetic */ C9VX $row;
    public final /* synthetic */ C9WN $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WP(C9VX c9vx, C9WN c9wn, int i, boolean z, boolean z2) {
        super(2);
        this.$row = c9vx;
        this.$leading = z;
        this.$last = z2;
        this.$style = c9wn;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9WM.A04(AnonymousClass005.A0P(bfm, num), this.$row, this.$style, AnonymousClass011.A00(this.$$changed), this.$leading, this.$last);
        return Unit.INSTANCE;
    }
}
