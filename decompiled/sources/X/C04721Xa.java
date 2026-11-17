package X;

import kotlin.Unit;

/* renamed from: X.1Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04721Xa extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ int $displayMode;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ C1XI $tmp9_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04721Xa(C1XI c1xi, C1X9 c1x9, BRg bRg, Long l, int i, int i2, int i3) {
        super(2);
        this.$tmp9_rcvr = c1xi;
        this.$selectedDateMillis = l;
        this.$displayMode = i;
        this.$dateFormatter = c1x9;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        this.$tmp9_rcvr.A02(this.$dateFormatter, bfmA0P, this.$modifier, this.$selectedDateMillis, this.$displayMode, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
