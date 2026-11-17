package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0v0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0v0 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/1DM;JFLX/1DH;LX/AWd;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;FLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C0v0(C1DH c1dh, InterfaceC1072AWd interfaceC1072AWd, BRg bRg, C1DM c1dm, Function0 function0, G0V g0v, float f, float f2, long j, boolean z) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = c1dh;
        this.$interactionSource = interfaceC1072AWd;
        this.$enabled = z;
        this.$onClick = function0;
        this.$shadowElevation = f2;
        this.$content = g0v;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgThen = this.$modifier.then(ARV.A00);
            C1DM c1dm = this.$shape;
            long jA00 = C11R.A00(bfm2, this.$absoluteElevation, this.$color);
            BRg bRgA01 = C11R.A01(this.$border, bRgThen, c1dm, ((AXN) bfm2.A6v(Am0.A04)).Ah4(this.$shadowElevation), jA00);
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            BRg bRgA012 = C0v5.A01(AbstractC05051Yk.A00(bfm2, 0.0f, 0, 7, false), interfaceC1072AWd, bRgA01, null, null, this.$onClick, this.$enabled);
            G0V<BFM, Integer, Unit> g0v = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, true);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm2, bRgA012);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA01, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                AnonymousClass006.A1U(g0v2, bfm2, iA0J);
            }
            AnonymousClass001.A16(bfm2, bRgA013);
            AnonymousClass001.A1H(bfm2, g0v, 0);
            BBI.A0R(bbi, true);
        }
        return Unit.INSTANCE;
    }
}
