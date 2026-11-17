package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0v1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0v1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/1DM;JFLX/1DH;FLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C0v1(C1DH c1dh, BRg bRg, C1DM c1dm, G0V g0v, float f, float f2, long j) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = c1dh;
        this.$shadowElevation = f2;
        this.$content = g0v;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRg = this.$modifier;
            C1DM c1dm = this.$shape;
            long jA00 = C11R.A00(bfm2, this.$absoluteElevation, this.$color);
            BRg bRgA01 = ARD.A01(C11R.A01(this.$border, bRg, c1dm, ((AXN) bfm2.A6v(Am0.A04)).Ah4(this.$shadowElevation), jA00), new C05433bp(22), false);
            Unit unit = Unit.INSTANCE;
            C3bg c3bg = new C3bg(1, null);
            C1247Afe c1247Afe = AaM.A00;
            BRg bRgThen = bRgA01.then(new AaL(new C5KQ(c3bg), unit, null, null));
            G0V<BFM, Integer, Unit> g0v = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm2, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA0c, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                AnonymousClass006.A1U(g0v2, bfm2, iA0J);
            }
            AnonymousClass001.A16(bfm2, bRgA012);
            AnonymousClass001.A1H(bfm2, g0v, 0);
            BBI.A0R(bbi, true);
        }
        return Unit.INSTANCE;
    }
}
