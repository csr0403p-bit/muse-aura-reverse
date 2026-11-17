package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* renamed from: X.1A6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A6 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ C046319x $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $prefix;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $suffix;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $supportingText;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
    public final /* synthetic */ C1805ArO $value;
    public final /* synthetic */ C19h $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ArO;ZZLX/19h;LX/AWd;ZLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/19x;LX/1DM;)V */
    public C1A6(InterfaceC1072AWd interfaceC1072AWd, C046319x c046319x, C1DM c1dm, C1805ArO c1805ArO, C19h c19h, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, boolean z, boolean z2, boolean z3) {
        super(3);
        this.$value = c1805ArO;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = c19h;
        this.$interactionSource = interfaceC1072AWd;
        this.$isError = z3;
        this.$label = g0v;
        this.$placeholder = g0v2;
        this.$leadingIcon = g0v3;
        this.$trailingIcon = g0v4;
        this.$prefix = g0v5;
        this.$suffix = g0v6;
        this.$supportingText = g0v7;
        this.$colors = c046319x;
        this.$shape = c1dm;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        G0V<? super BFM, ? super Integer, ? extends Unit> g0v2 = g0v;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        if ((iA0F & 6) == 0) {
            iA0F |= AnonymousClass004.A0T(bfm2, g0v2);
        }
        if ((iA0F & 19) == 18 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            C1A9 c1a9 = C1A9.A00;
            String str = this.$value.A01.A00;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            C19h c19h = this.$visualTransformation;
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            boolean z3 = this.$isError;
            G0V<BFM, Integer, Unit> g0v3 = this.$label;
            G0V<BFM, Integer, Unit> g0v4 = this.$placeholder;
            G0V<BFM, Integer, Unit> g0v5 = this.$leadingIcon;
            G0V<BFM, Integer, Unit> g0v6 = this.$trailingIcon;
            G0V<BFM, Integer, Unit> g0v7 = this.$prefix;
            G0V<BFM, Integer, Unit> g0v8 = this.$suffix;
            G0V<BFM, Integer, Unit> g0v9 = this.$supportingText;
            C046319x c046319x = this.$colors;
            c1a9.A01(interfaceC1072AWd, null, c046319x, bfm2, c19h, str, g0v2, g0v3, g0v4, g0v5, g0v6, g0v7, g0v8, g0v9, B1V.A00(bfm2, new C1A7(interfaceC1072AWd, c046319x, this.$shape, z, z3), 255570733), (iA0F << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 14155776, 32768, z, z2, z3);
        }
        return Unit.INSTANCE;
    }
}
