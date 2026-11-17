package X;

/* renamed from: X.1Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04701Bu extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ APu $enter;
    public final /* synthetic */ APt $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C1Cd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04701Bu(C1Cd c1Cd, APu aPu, APt aPt, String str) {
        super(3);
        this.this$0 = c1Cd;
        this.$enter = aPu;
        this.$exit = aPt;
        this.$label = str;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        bfmA0P.AgE(1840112047);
        BRg bRgThen = bRg.then(AbstractC1011APs.A0K(this.$enter, this.$exit, this.this$0.AM0(), bfmA0P, this.$label, null, 12));
        AnonymousClass001.A1D(bfmA0P);
        return bRgThen;
    }
}
