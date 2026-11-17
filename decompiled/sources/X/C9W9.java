package X;

import kotlin.Unit;

/* renamed from: X.9W9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9W9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $showStar;
    public final /* synthetic */ C9W7 $style;
    public final /* synthetic */ ApQ $subtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9W9(ApQ apQ, C9W7 c9w7, int i, boolean z) {
        super(2);
        this.$subtitle = apQ;
        this.$showStar = z;
        this.$style = c9w7;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9W6.A01(AnonymousClass005.A0P(bfm, num), this.$subtitle, this.$style, AnonymousClass011.A00(this.$$changed), this.$showStar);
        return Unit.INSTANCE;
    }
}
