package X;

import kotlin.Unit;

/* renamed from: X.1A5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C2257BGr $keyboardActions;
    public final /* synthetic */ AuJ $keyboardOptions;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
    public final /* synthetic */ int $maxLines;
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
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
    public final /* synthetic */ C1805ArO $value;
    public final /* synthetic */ C19h $visualTransformation;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C1805ArO c1805ArO = this.$value;
        G0U<C1805ArO, Unit> g0u = this.$onValueChange;
        BRg bRg = this.$modifier;
        boolean z = this.$enabled;
        boolean z2 = this.$readOnly;
        C1822Arm c1822Arm = this.$textStyle;
        G0V<BFM, Integer, Unit> g0v = this.$label;
        G0V<BFM, Integer, Unit> g0v2 = this.$placeholder;
        G0V<BFM, Integer, Unit> g0v3 = this.$leadingIcon;
        G0V<BFM, Integer, Unit> g0v4 = this.$trailingIcon;
        G0V<BFM, Integer, Unit> g0v5 = this.$prefix;
        G0V<BFM, Integer, Unit> g0v6 = this.$suffix;
        G0V<BFM, Integer, Unit> g0v7 = this.$supportingText;
        boolean z3 = this.$isError;
        C19h c19h = this.$visualTransformation;
        AuJ auJ = this.$keyboardOptions;
        C2257BGr c2257BGr = this.$keyboardActions;
        boolean z4 = this.$singleLine;
        int i = this.$maxLines;
        int i2 = this.$minLines;
        C1A3.A01(this.$interactionSource, c2257BGr, auJ, this.$colors, bfmA0P, bRg, this.$shape, c1822Arm, c1805ArO, c19h, g0u, g0v, g0v2, g0v3, g0v4, g0v5, g0v6, g0v7, i, i2, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default, z, z2, z3, z4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/G0U<-LX/ArO;Lkotlin/Unit;>;LX/BRg;ZZLX/Arm;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/19h;LX/AuJ;LX/BGr;ZIILX/AWd;LX/1DM;LX/19x;IIII)V */
    public C1A5(InterfaceC1072AWd interfaceC1072AWd, C2257BGr c2257BGr, AuJ auJ, C046319x c046319x, BRg bRg, C1DM c1dm, C1822Arm c1822Arm, C1805ArO c1805ArO, C19h c19h, G0U g0u, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.$value = c1805ArO;
        this.$onValueChange = g0u;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = c1822Arm;
        this.$label = g0v;
        this.$placeholder = g0v2;
        this.$leadingIcon = g0v3;
        this.$trailingIcon = g0v4;
        this.$prefix = g0v5;
        this.$suffix = g0v6;
        this.$supportingText = g0v7;
        this.$isError = z3;
        this.$visualTransformation = c19h;
        this.$keyboardOptions = auJ;
        this.$keyboardActions = c2257BGr;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$interactionSource = interfaceC1072AWd;
        this.$shape = c1dm;
        this.$colors = c046319x;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }
}
