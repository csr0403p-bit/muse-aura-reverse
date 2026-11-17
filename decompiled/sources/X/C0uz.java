package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0uz, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0uz extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource = null;
    public final /* synthetic */ float $shadowElevation = 0.0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0uz(C1DH c1dh, BRg bRg, C1DM c1dm, Function0 function0, G0V g0v, float f, long j, boolean z, boolean z2) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = c1dh;
        this.$selected = z;
        this.$enabled = z2;
        this.$onClick = function0;
        this.$content = g0v;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BRg bRgA02;
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgThen = this.$modifier.then(ARV.A00);
            C1DM c1dm = this.$shape;
            long jA00 = C11R.A00(bfm2, this.$absoluteElevation, this.$color);
            BRg bRgA01 = C11R.A01(this.$border, bRgThen, c1dm, ((AXN) bfm2.A6v(Am0.A04)).Ah4(this.$shadowElevation), jA00);
            boolean z = this.$selected;
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            InterfaceC05011Yg interfaceC05011YgA00 = AbstractC05051Yk.A00(bfm2, 0.0f, 0, 7, false);
            boolean z2 = this.$enabled;
            Function0<Unit> function0 = this.$onClick;
            if (interfaceC05011YgA00 instanceof C3UH) {
                bRgA02 = new AX9((C3UH) interfaceC05011YgA00, interfaceC1072AWd, null, function0, z, false, z2);
            } else if (interfaceC05011YgA00 == null) {
                bRgA02 = new AX9(null, interfaceC1072AWd, null, function0, z, false, z2);
            } else if (interfaceC1072AWd != null) {
                bRgA02 = C0yB.A00(interfaceC05011YgA00, interfaceC1072AWd, BRg.A00).then(new AX9(null, interfaceC1072AWd, null, function0, z, false, z2));
            } else {
                bRgA02 = AxM.A02(BRg.A00, AbstractC2139Az7.A00, new C3bb(interfaceC05011YgA00, function0, 0, z, z2));
            }
            BRg bRgThen2 = bRgA01.then(bRgA02);
            G0V<BFM, Integer, Unit> g0v = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, true);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm2, bRgThen2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function02);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA01, akqA04);
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
