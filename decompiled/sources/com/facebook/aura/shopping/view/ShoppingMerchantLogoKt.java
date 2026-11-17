package com.facebook.aura.shopping.view;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ShoppingMerchantLogoKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingMerchantLogoKt$ShoppingMerchantLogoFallback$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraIconSize $iconSize;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
            super(2);
            this.$iconSize = auraIconSize;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingMerchantLogoKt.ShoppingMerchantLogoFallback(this.$iconSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingMerchantLogoKt$ShoppingMerchantNavTitle$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $detail;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ String $merchant;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$merchant = str;
            this.$detail = str2;
            this.$iconUrl = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingMerchantLogoKt.ShoppingMerchantNavTitle(this.$merchant, this.$detail, this.$iconUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShoppingMerchantLogoFallback(AuraIconSize auraIconSize, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1175062421);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraIconSize) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).secondaryElevated;
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA02 = C1DI.A02(C1b8.A03(bRg2, c1d3, j), c1d3, 0.5f, C06G.A0E(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), auraIconSize, null, C06G.A0I(bfm, akh), null, bfm, (AVy.$stable << 3) | 3072 | ((iA08 << 6) & 896), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraIconSize, bRg2, i, i2);
        }
    }

    /* renamed from: ShoppingMerchantLabel-tOXsyB8, reason: not valid java name */
    public static final void m2069ShoppingMerchantLabeltOXsyB8(String str, C1822Arm c1822Arm, boolean z, String str2, float f, float f2, AuraIconSize auraIconSize, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, c1822Arm);
        C7384Etj.A0Y(auraIconSize, 6);
        bfm.AgG(-684057278);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A09(bfm, f2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0I(bfm, auraIconSize.ordinal());
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(1197725681);
                m2070ShoppingMerchantLogoDzVHIIc(str2, f, auraIconSize, null, bfm, ((iA0d >> 9) & 126) | ((iA0d >> 12) & 896), 8);
            } else {
                bfm.AgE(1197828508);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), c1822Arm, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | ((iA0d << 6) & 7168), 6, 14834);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ShoppingMerchantLogoKt$ShoppingMerchantLabel$2(str, c1822Arm, z, str2, f, f2, auraIconSize, bRg2, i, i2);
        }
    }

    /* renamed from: ShoppingMerchantLogo-DzVHIIc, reason: not valid java name */
    public static final void m2070ShoppingMerchantLogoDzVHIIc(String str, float f, AuraIconSize auraIconSize, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> shoppingMerchantLogoKt$ShoppingMerchantLogo$3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(auraIconSize, 2);
        bfm.AgG(1133800452);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, auraIconSize);
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
            BRg bRgA02 = C11U.A02(bRg2, f);
            if (str == null) {
                bfm.AgE(1426670231);
                ShoppingMerchantLogoFallback(auraIconSize, bRgA02, bfm, (iA0d >> 6) & 14, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    shoppingMerchantLogoKt$ShoppingMerchantLogo$3 = new ShoppingMerchantLogoKt$ShoppingMerchantLogo$1(str, f, auraIconSize, bRg2, i, i2);
                    bBbAAc.A06 = shoppingMerchantLogoKt$ShoppingMerchantLogo$3;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1426769214);
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA02, null, null, null, false, null, 0L, false, false, false, B1V.A00(bfm, new ShoppingMerchantLogoKt$ShoppingMerchantLogo$2(auraIconSize), -1406146769), null, null, null, bfm, iA0d & 14, 48, 30716);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            shoppingMerchantLogoKt$ShoppingMerchantLogo$3 = new ShoppingMerchantLogoKt$ShoppingMerchantLogo$3(str, f, auraIconSize, bRg2, i, i2);
            bBbAAc.A06 = shoppingMerchantLogoKt$ShoppingMerchantLogo$3;
        }
    }

    public static final void ShoppingMerchantNavTitle(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        String strA0w;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1468078561);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
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
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingMerchantLogoKt$ShoppingMerchantNavTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingNano), bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            m2070ShoppingMerchantLogoDzVHIIc(str3, 26.0f, AuraIconSize.TINY, null, bfm, ((iA0d >> 6) & 14) | 432, 8);
            if (str2 == null) {
                bfm.AgE(-1104871023);
                BBI.A0R(bbi, false);
                strA0w = str;
            } else {
                bfm.AgE(-1104869514);
                strA0w = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f120602);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0w, null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, str3, bRg2, i, i2);
        }
    }
}
