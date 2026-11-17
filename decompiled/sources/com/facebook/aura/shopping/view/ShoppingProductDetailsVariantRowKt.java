package com.facebook.aura.shopping.view;

import X.AEk;
import X.AHD;
import X.AKO;
import X.AKQ;
import X.ARD;
import X.AXN;
import X.AbstractC0878AGe;
import X.AbstractC1564Ale;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BG3;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0v5;
import X.C10G;
import X.C1110AYw;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.PdpVariantDimensionKind;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantOptionState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDetailsVariantRowKt {
    public static final float ChipHorizontalPadding;
    public static final float CircleCellSpacing;
    public static final float CircleSwatchSize = 24.0f;
    public static final float InteractiveMinHeight = 48.0f;
    public static final float MinChipWidth = 56.0f;
    public static final float OptionSpacing = AuraDimensKt.SpacingXsmall;
    public static final float PhotoTileSize = 56.0f;
    public static final float SelectionStrokeWidth = 1.5f;

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt$ColorCircle$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isAvailable;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $rgb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, boolean z, boolean z2, BRg bRg, int i2, int i3) {
            super(2);
            this.$rgb = i;
            this.$isSelected = z;
            this.$isAvailable = z2;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsVariantRowKt.ColorCircle(this.$rgb, this.$isSelected, this.$isAvailable, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt$PhotoTile$2, reason: invalid class name and case insensitive filesystem */
    public final class C137682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isAvailable;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137682(String str, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$isSelected = z;
            this.$isAvailable = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsVariantRowKt.PhotoTile(this.$url, this.$isSelected, this.$isAvailable, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt$VariantHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingProductDetailsVariantGroupState $group;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, BRg bRg, int i, int i2) {
            super(2);
            this.$group = shoppingProductDetailsVariantGroupState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsVariantRowKt.VariantHeader(this.$group, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt$variantOption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ boolean $isSelected;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
            AbstractC1564Ale.A06(interfaceC0857A6e, 0);
            AbstractC1564Ale.A0E(interfaceC0857A6e, this.$isSelected);
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, String str) {
            super(1);
            this.$isSelected = z;
            this.$description = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            invoke2(interfaceC0857A6e);
            return Unit.INSTANCE;
        }
    }

    public static final BRg variantOption(BRg bRg, String str, boolean z, boolean z2, Function0<Unit> function0) {
        return ARD.A00(C0v5.A04(bRg, C3cG.A0A(0), null, function0, z2), new AnonymousClass1(z, str));
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PdpVariantDimensionKind.values().length];
            try {
                AnonymousClass002.A13(PdpVariantDimensionKind.COLOR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PdpVariantDimensionKind.SIZE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = AuraDimensKt.SpacingSmall;
        ChipHorizontalPadding = f;
        CircleCellSpacing = (f + 24.0f) - 48.0f;
    }

    public static final void ColorCircle(int i, boolean z, boolean z2, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-625087540);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0p(bfm, z2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0W = C3cH.A0W(bfm);
            BRg bRgA07 = C10G.A07(bRg2, InteractiveMinHeight);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA02);
            BS0 bs0 = BRg.A00;
            float f = CircleSwatchSize;
            BRg bRgA072 = C10G.A07(bs0, f);
            float f2 = z2 ? 1.0f : 0.3f;
            long j = B6A.A01;
            C1D3 c1d3 = C1D8.A00;
            C3Ue.A04(C1DI.A02(C1b8.A03(C11S.A00(bRgA072, f2), c1d3, ((-16777216) | i) << 32), c1d3, 1.0f, auraColorsA0W.fillDivider), bfm, 0);
            if (z2) {
                bfm.AgE(1484663452);
            } else {
                bfm.AgE(1484158927);
                BRg bRgA073 = C10G.A07(bs0, f);
                boolean zA67 = bfm.A67(auraColorsA0W);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ShoppingProductDetailsVariantRowKt$ColorCircle$1$1$1(auraColorsA0W);
                    BBI.A0O(bbi, objAaT);
                }
                C3Ue.A04(AEk.A01(bRgA073, (G0U) objAaT), bfm, 0);
            }
            BBI.A0R(bbi, false);
            if (z) {
                bfm.AgE(1484688779);
                C3Ue.A04(C1DI.A02(C10G.A07(bs0, 29.0f), c1d3, SelectionStrokeWidth, auraColorsA0W.primaryText), bfm, 0);
            } else {
                bfm.AgE(1484828124);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, z, z2, bRg2, i2, i3);
        }
    }

    public static final void PhotoTile(String str, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1292122447);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            C1DM c1dm = auraTheme.getShapes(bfm, 6).small;
            BRg bRgThen = C1b8.A01(C11U.A03(C11S.A00(C10G.A07(bRg2, PhotoTileSize), z2 ? 1.0f : 0.3f), c1dm), colors.highlight).then(z ? C1DI.A02(BRg.A00, c1dm, SelectionStrokeWidth, colors.primaryText) : BRg.A00);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            if (str != null) {
                bfm.AgE(136895878);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 3504, 0, 32752);
            } else {
                bfm.AgE(137060395);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137682(str, z, z2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* renamed from: ShoppingProductDetailsVariantRow--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2077ShoppingProductDetailsVariantRowjt2gSs(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState r26, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r27, X.BRg r28, float r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt.m2077ShoppingProductDetailsVariantRowjt2gSs(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState, X.G0V, X.BRg, float, X.BFM, int, int):void");
    }

    /* renamed from: ShoppingProductDetailsVariantSelector--jt2gSs, reason: not valid java name */
    public static final void m2078ShoppingProductDetailsVariantSelectorjt2gSs(AHD<ShoppingProductDetailsVariantGroupState> ahd, G0V<? super String, ? super String, Unit> g0v, BRg bRg, float f, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object shoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3;
        BRg bRg2 = bRg;
        float f2 = f;
        boolean zA1a = AnonymousClass002.A1a(ahd, g0v);
        bfm.AgG(-643249149);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    shoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3 = new ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$1(ahd, g0v, bRg2, f2, i, i2);
                    C3cG.A1D(bBbAAc, shoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingLargePlusMicro);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1387191985);
            while (itA0w.hasNext()) {
                ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState = (ShoppingProductDetailsVariantGroupState) itA0w.next();
                bfm.Ag8(-206121961, shoppingProductDetailsVariantGroupState.dimension);
                C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingSmall);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                VariantHeader(shoppingProductDetailsVariantGroupState, C3U4.A07(bs0, f2), bfm, 0, 0);
                if (shoppingProductDetailsVariantGroupState.kind == PdpVariantDimensionKind.COLOR) {
                    bfm.AgE(568418204);
                    m2080VariantSwatchRow942rkJo(shoppingProductDetailsVariantGroupState, g0v, f2, null, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d >> 3) & 896), 8);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(568532749);
                    m2077ShoppingProductDetailsVariantRowjt2gSs(shoppingProductDetailsVariantGroupState, g0v, null, f2, bfm, iA0d & 7280, 4);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, zA1a);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            shoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3 = new ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3(ahd, g0v, bRg2, f2, i, i2);
            C3cG.A1D(bBbAAc, shoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$3);
        }
    }

    public static final void VariantHeader(ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        int iOrdinal;
        int i3;
        Object next;
        BRg bRg2 = bRg;
        bfm.AgG(883434872);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingProductDetailsVariantGroupState) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            PdpVariantDimensionKind pdpVariantDimensionKind = shoppingProductDetailsVariantGroupState.kind;
            if (pdpVariantDimensionKind == null || (iOrdinal = pdpVariantDimensionKind.ordinal()) == -1) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new ShoppingProductDetailsVariantRowKt$VariantHeader$title$1(shoppingProductDetailsVariantGroupState, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f120de6;
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                i3 = R.string._name_removed__res_0x7f120deb;
            }
            Iterator it = shoppingProductDetailsVariantGroupState.options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C7384Etj.areEqual(((ShoppingProductDetailsVariantOptionState) next).id, shoppingProductDetailsVariantGroupState.selectedOptionId)) {
                        break;
                    }
                }
            }
            ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState = (ShoppingProductDetailsVariantOptionState) next;
            if (shoppingProductDetailsVariantOptionState == null) {
                BBb bBbAAc2 = bfm.AAc();
                if (bBbAAc2 != null) {
                    bBbAAc2.A06 = new ShoppingProductDetailsVariantRowKt$VariantHeader$selected$2(shoppingProductDetailsVariantGroupState, bRg2, i, i2);
                    return;
                }
                return;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingProductDetailsVariantRowKt$VariantHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingMicroPlusNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i3), null, colors.secondaryText, C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(shoppingProductDetailsVariantOptionState.label, null, colors.primaryText, auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(shoppingProductDetailsVariantGroupState, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    /* renamed from: VariantOptionChip-EUb7tLY, reason: not valid java name */
    public static final void m2079VariantOptionChipEUb7tLY(String str, float f, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        long jA04;
        BRg bRg2 = bRg;
        bfm.AgG(978832129);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            BRg bRgA09 = C10G.A09(C10G.A08(bRg2, f), Float.NaN, InteractiveMinHeight);
            Alignment alignment = C2VU.A09;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA00 = C11S.A00(C10G.A0A(C10G.A02, 36.0f, Float.NaN), z2 ? 1.0f : 0.3f);
            if (z) {
                long j = colors.accent;
                jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.1f);
            } else {
                jA04 = colors.highlight;
            }
            BRg bRgA03 = C1b8.A03(bRgA00, C1D8.A00, jA04);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C1822Arm c1822ArmA00 = z ? C3cH.A0X(bfm, auraTheme, -1685060566).subheadlineEmphasized : C3cH.A0X(bfm, auraTheme, -1685058714).subheadlineMedium;
            BBI.A0R(bbi, false);
            if (!z2) {
                c1822ArmA00 = C1822Arm.A00(null, c1822ArmA00, null, null, null, null, BG3.A01, null, null, null, 0, 0, 0, 16773119, 0L, 0L, 0L, 0L);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, z ? colors.accent : colors.primaryText, c1822ArmA00, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ShoppingProductDetailsVariantRowKt$VariantOptionChip$2(str, f, z, z2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* renamed from: VariantSwatchRow-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2080VariantSwatchRow942rkJo(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState r24, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r25, float r26, X.BRg r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt.m2080VariantSwatchRow942rkJo(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState, X.G0V, float, X.BRg, X.BFM, int, int):void");
    }

    public static final String optionDescription(ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState, boolean z, BFM bfm, int i) {
        int i2;
        if (!shoppingProductDetailsVariantGroupState.availableOptionIds.contains(shoppingProductDetailsVariantOptionState.id)) {
            bfm.AgE(-1487064147);
            i2 = R.string._name_removed__res_0x7f120dea;
        } else if (z) {
            bfm.AgE(-1487061366);
            i2 = R.string._name_removed__res_0x7f120de9;
        } else {
            bfm.AgE(-1487058879);
            i2 = R.string._name_removed__res_0x7f120de7;
        }
        return AbstractC2271BQs.A02(bfm, new Object[]{shoppingProductDetailsVariantGroupState.displayName, shoppingProductDetailsVariantOptionState.label, AnonymousClass003.A0e(bfm, i2)}, R.string._name_removed__res_0x7f120de8);
    }

    /* renamed from: CentreOnSelection-CGg2A0w, reason: not valid java name */
    public static final void m2076CentreOnSelectionCGg2A0w(C1110AYw c1110AYw, List<C1DG> list, float f, Integer num, float f2, float f3, Object obj, BFM bfm, int i) {
        BBb bBbAAc;
        Object shoppingProductDetailsVariantRowKt$CentreOnSelection$3;
        Float fValueOf;
        int iIntValue;
        bfm.AgG(-18663426);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1110AYw) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, num);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f2);
        }
        float f4 = f3;
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A09(bfm, f3);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, obj);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            boolean zA65 = bfm.A65(obj);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A05(bbi, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (C1DG.A01(f2, 0.0f) <= 0) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    shoppingProductDetailsVariantRowKt$CentreOnSelection$3 = new ShoppingProductDetailsVariantRowKt$CentreOnSelection$1(c1110AYw, list, f, num, f2, f3, obj, i);
                    C3cG.A1D(bBbAAc, shoppingProductDetailsVariantRowKt$CentreOnSelection$3);
                }
                return;
            }
            if (num == null || (iIntValue = num.intValue()) < 0 || iIntValue >= list.size()) {
                fValueOf = null;
            } else {
                Iterator it = AbstractC0878AGe.A0a(list, iIntValue).iterator();
                while (it.hasNext()) {
                    f4 = f4 + ((C1DG) it.next()).A00 + f;
                }
                fValueOf = Float.valueOf(axnA04.Ah4((f4 + (list.get(iIntValue).A00 / 2.0f)) - (f2 / 2.0f)));
            }
            Integer numValueOf = Integer.valueOf(c1110AYw.A01.AGd());
            boolean zA1K = AnonymousClass003.A1K(bfm, fValueOf, mutableState) | AnonymousClass004.A1F(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                objAaT2 = new ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1(fValueOf, c1110AYw, mutableState, null);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, fValueOf, numValueOf);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            shoppingProductDetailsVariantRowKt$CentreOnSelection$3 = new ShoppingProductDetailsVariantRowKt$CentreOnSelection$3(c1110AYw, list, f, num, f2, f3, obj, i);
            C3cG.A1D(bBbAAc, shoppingProductDetailsVariantRowKt$CentreOnSelection$3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[LOOP:0: B:11:0x0027->B:12:0x0029, LOOP_END] */
    /* renamed from: rowFillingWidths-VpY3zN4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C1DG> m2085rowFillingWidthsVpY3zN4(java.util.List<X.C1DG> r5, float r6, float r7) {
        /*
            int r1 = r5.size()
            r0 = 2
            if (r1 < r0) goto L72
            int r0 = X.C1DG.A01(r6, r7)
            if (r0 > 0) goto L72
            int r0 = r5.size()
            float r0 = (float) r0
            float r4 = r7 / r0
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L33
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L33
        L1e:
            int r3 = r5.size()
            java.util.ArrayList r2 = X.C60O.A11(r3)
            r1 = 0
        L27:
            if (r1 >= r3) goto L71
            X.1DG r0 = X.C8j3.A0k(r4)
            r2.add(r0)
            int r1 = r1 + 1
            goto L27
        L33:
            java.util.Iterator r1 = r5.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            int r0 = X.C1DG.A01(r0, r4)
            if (r0 <= 0) goto L37
            float r7 = r7 - r6
            int r0 = r5.size()
            float r0 = (float) r0
            float r7 = r7 / r0
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r5)
            java.util.Iterator r1 = r5.iterator()
        L5a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.next()
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            float r0 = r0 + r7
            X.1DG r0 = X.C8j3.A0k(r0)
            r2.add(r0)
            goto L5a
        L71:
            return r2
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt.m2085rowFillingWidthsVpY3zN4(java.util.List, float, float):java.util.List");
    }
}
