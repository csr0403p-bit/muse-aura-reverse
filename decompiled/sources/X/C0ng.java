package X;

import kotlin.Unit;

/* renamed from: X.0ng, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ng extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ ARL $contentScale;
    public final /* synthetic */ boolean $disableDefaultSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ng(BRg bRg, AVy aVy, ARL arl, String str, int i, int i2, long j, boolean z) {
        super(2);
        this.$painter = aVy;
        this.$contentDescription = str;
        this.$modifier = bRg;
        this.$tint = j;
        this.$contentScale = arl;
        this.$disableDefaultSize = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        AVy aVy = this.$painter;
        String str = this.$contentDescription;
        BRg bRg = this.$modifier;
        long j = this.$tint;
        C0nh.A00(bfmA0P, bRg, aVy, this.$contentScale, str, AnonymousClass011.A00(this.$$changed), this.$$default, j, this.$disableDefaultSize);
        return Unit.INSTANCE;
    }
}
