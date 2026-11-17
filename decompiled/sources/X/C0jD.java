package X;

import kotlin.Unit;

/* renamed from: X.0jD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0jD extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C0jF $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $text;
    public final /* synthetic */ C08R $this_Row;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/0jF;ZLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/08R;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C0jD(C08R c08r, C0jF c0jF, G0V g0v, G0V g0v2, G0V g0v3, boolean z) {
        super(2);
        this.$leadingIcon = g0v;
        this.$colors = c0jF;
        this.$enabled = z;
        this.$trailingIcon = g0v2;
        this.$this_Row = c08r;
        this.$text = g0v3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            bfm2.AgE(1264683960);
            G0V<BFM, Integer, Unit> g0v = this.$leadingIcon;
            if (g0v != null) {
                AKH<B6A> akh = C1AZ.A00;
                C0jF c0jF = this.$colors;
                AnonymousClass003.A0m(bfm2, AnonymousClass003.A0T(akh, this.$enabled ? c0jF.A03 : c0jF.A00), new C05473bt(g0v, 7), 2035552199);
            }
            AnonymousClass002.A19(bfm2);
            AKH<B6A> akh2 = C1AZ.A00;
            C0jF c0jF2 = this.$colors;
            AKT.A01(bfm2, AnonymousClass003.A0T(akh2, this.$enabled ? c0jF2.A04 : c0jF2.A01), B1V.A00(bfm2, new C3c8(this.$leadingIcon, this.$trailingIcon, this.$this_Row, this.$text, 2), -1728894036), 56);
            G0V<BFM, Integer, Unit> g0v2 = this.$trailingIcon;
            if (g0v2 != null) {
                C0jF c0jF3 = this.$colors;
                AKT.A01(bfm2, AnonymousClass003.A0T(akh2, this.$enabled ? c0jF3.A05 : c0jF3.A02), B1V.A00(bfm2, new C05473bt(g0v2, 8), 580312062), 56);
            }
        }
        return Unit.INSTANCE;
    }
}
