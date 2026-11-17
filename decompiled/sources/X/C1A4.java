package X;

import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: X.1A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C2257BGr $keyboardActions;
    public final /* synthetic */ AuJ $keyboardOptions;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1822Arm $mergedTextStyle;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<C1805ArO, Unit> $onValueChange;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $prefix;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $suffix;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $supportingText;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
    public final /* synthetic */ C1805ArO $value;
    public final /* synthetic */ C19h $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/AXN;ZLX/19x;LX/ArO;LX/G0U<-LX/ArO;Lkotlin/Unit;>;ZZLX/Arm;LX/AuJ;LX/BGr;ZIILX/19h;LX/AWd;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1DM;)V */
    public C1A4(InterfaceC1072AWd interfaceC1072AWd, C2257BGr c2257BGr, AuJ auJ, C046319x c046319x, BRg bRg, C1DM c1dm, C1822Arm c1822Arm, C1805ArO c1805ArO, C19h c19h, AXN axn, G0U g0u, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.$modifier = bRg;
        this.$label = g0v;
        this.$density = axn;
        this.$isError = z;
        this.$colors = c046319x;
        this.$value = c1805ArO;
        this.$onValueChange = g0u;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = c1822Arm;
        this.$keyboardOptions = auJ;
        this.$keyboardActions = c2257BGr;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$visualTransformation = c19h;
        this.$interactionSource = interfaceC1072AWd;
        this.$placeholder = g0v2;
        this.$leadingIcon = g0v3;
        this.$trailingIcon = g0v4;
        this.$prefix = g0v5;
        this.$suffix = g0v6;
        this.$supportingText = g0v7;
        this.$shape = c1dm;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRg = this.$modifier;
            G0V<BFM, Integer, Unit> g0v = this.$label;
            BRg bRgA04 = BRg.A00;
            if (g0v != null) {
                bRgA04 = C3U4.A04(ARD.A01(bRgA04, new C05433bp(21), true), this.$density.Agw(C1A3.A00));
            }
            BRg bRgThen = bRg.then(bRgA04);
            boolean z = this.$isError;
            String strA00 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f1208cf);
            BRg bRg2 = AbstractC046219w.A01;
            if (z) {
                bRgThen = ARD.A01(bRgThen, new C3cE(strA00, 9), false);
            }
            BRg bRgA09 = C10G.A09(bRgThen, 280.0f, 56.0f);
            C046319x c046319x = this.$colors;
            boolean z2 = this.$isError;
            C1326AhD c1326AhD = new C1326AhD(z2 ? c046319x.A0C : c046319x.A00);
            C1805ArO c1805ArO = this.$value;
            G0U<C1805ArO, Unit> g0u = this.$onValueChange;
            boolean z3 = this.$enabled;
            boolean z4 = this.$readOnly;
            C1822Arm c1822Arm = this.$mergedTextStyle;
            AuJ auJ = this.$keyboardOptions;
            C2257BGr c2257BGr = this.$keyboardActions;
            boolean z5 = this.$singleLine;
            int i = this.$maxLines;
            int i2 = this.$minLines;
            C19h c19h = this.$visualTransformation;
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            AbstractC1874Aso.A02(interfaceC1072AWd, c2257BGr, auJ, bfm2, bRgA09, c1326AhD, c1822Arm, c1805ArO, c19h, g0u, null, B1V.A00(bfm2, new C1A6(interfaceC1072AWd, c046319x, this.$shape, c1805ArO, c19h, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, z3, z5, z2), -757328870), i, i2, 0, 196608, 4096, z3, z4, z5);
        }
        return Unit.INSTANCE;
    }
}
