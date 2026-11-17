package X;

import kotlin.Unit;

/* renamed from: X.0yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04550yr extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ AbstractC1996Aw5 $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ B0A $fontStyle;
    public final /* synthetic */ C1736ApY $fontWeight;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ BG3 $textDecoration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BRg;JJLX/B0A;LX/ApY;LX/Aw5;JLX/BG3;LX/1YL;JIZIILX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/Arm;III)V */
    public C04550yr(BRg bRg, C1822Arm c1822Arm, AbstractC1996Aw5 abstractC1996Aw5, B0A b0a, C1736ApY c1736ApY, C1YL c1yl, BG3 bg3, String str, G0U g0u, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = bRg;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = b0a;
        this.$fontWeight = c1736ApY;
        this.$fontFamily = abstractC1996Aw5;
        this.$letterSpacing = j3;
        this.$textDecoration = bg3;
        this.$textAlign = c1yl;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$onTextLayout = g0u;
        this.$style = c1822Arm;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        String str = this.$text;
        BRg bRg = this.$modifier;
        long j = this.$color;
        long j2 = this.$fontSize;
        B0A b0a = this.$fontStyle;
        C1736ApY c1736ApY = this.$fontWeight;
        AbstractC1996Aw5 abstractC1996Aw5 = this.$fontFamily;
        long j3 = this.$letterSpacing;
        BG3 bg3 = this.$textDecoration;
        C1YL c1yl = this.$textAlign;
        long j4 = this.$lineHeight;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        int i2 = this.$maxLines;
        int i3 = this.$minLines;
        C0yq.A00(bfmA0P, bRg, this.$style, abstractC1996Aw5, b0a, c1736ApY, c1yl, bg3, str, this.$onTextLayout, i, i2, i3, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default, j, j2, j3, j4, z);
        return Unit.INSTANCE;
    }
}
