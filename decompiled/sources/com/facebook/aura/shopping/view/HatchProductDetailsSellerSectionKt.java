package com.facebook.aura.shopping.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C1AC;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.shopping.model.PdpRating;
import com.facebook.aura.shopping.model.PdpSeller;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchProductDetailsSellerSectionKt {
    public static final float SellerAvatarSize = 44.0f;
    public static final float SellerRatingStarSize = 14.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ProductDetailsAnalytics $analytics;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onOpenUrl;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ String $productUrl;
        public final /* synthetic */ PdpSeller $seller;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(PdpSeller pdpSeller, G0U<? super String, Unit> g0u, String str, String str2, ProductDetailsAnalytics productDetailsAnalytics, BRg bRg, int i, int i2) {
            super(2);
            this.$seller = pdpSeller;
            this.$onOpenUrl = g0u;
            this.$productId = str;
            this.$productUrl = str2;
            this.$analytics = productDetailsAnalytics;
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
            HatchProductDetailsSellerSectionKt.HatchProductDetailsSellerSection(this.$seller, this.$onOpenUrl, this.$productId, this.$productUrl, this.$analytics, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchProductDetailsSellerSection(PdpSeller pdpSeller, G0U<? super String, Unit> g0u, String str, String str2, ProductDetailsAnalytics productDetailsAnalytics, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA04;
        String strA0f;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(pdpSeller, g0u);
        C7384Etj.A0Y(productDetailsAnalytics, 4);
        bfm.AgG(-1423147579);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpSeller, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, productDetailsAnalytics);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 74899, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String str3 = pdpSeller.profileUrl;
            if (str3 == null || C7BY.A0j(str3)) {
                str3 = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingSmall;
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120de0);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0Y, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (str3 != null) {
                bfm.AgE(608986350);
                C1YD c1yd = new C1YD(0);
                boolean zA1W = AnonymousClass002.A1W(bfm, str3, AnonymousClass003.A1C(iA05), AnonymousClass003.A1D(iA05) | AnonymousClass005.A1L(iA05) | AnonymousClass004.A1M(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pdpSeller))));
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == obj) {
                    objAaT2 = new HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$1$2$1(str, productDetailsAnalytics, str2, pdpSeller, g0u, str3);
                    bfm.Ai0(objAaT2);
                }
                bRgA04 = C0v5.A04(bs0, c1yd, null, (Function0) objAaT2, zA1a);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(610032321);
                BBI.A0R(bbi, false);
                bRgA04 = bs0;
            }
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(f), bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA04);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            String str4 = pdpSeller.profilePicUrl;
            if (str4 == null || C7BY.A0j(str4)) {
                bfm.AgE(1379063335);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1379063336);
                AuraImageKt.m2573AuraImageXRP3Ue8(str4, C1b8.A01(C11U.A02(bs0, SellerAvatarSize), auraColorsA0c.background), B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 3456, 0, 32752);
                BBI.A0R(bbi, false);
            }
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, zA1a);
            float f2 = AuraDimensKt.SpacingNano;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f2, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA012 = pdpSeller.name;
            if (strA012 == null || C7BY.A0j(strA012)) {
                bfm.AgE(1033543498);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dd7);
            } else {
                bfm.AgE(1033541545);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            PdpRating pdpRating = pdpSeller.rating;
            if (pdpRating == null || pdpRating.value <= 0.0d) {
                bfm.AgE(1975437990);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1975437991);
                String str5 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(pdpRating.value)}, zA1a ? 1 : 0));
                int i5 = pdpRating.reviewCount;
                Integer numValueOf = Integer.valueOf(i5);
                if (i5 > 0) {
                    bfm.AgE(1069558394);
                    strA0f = AnonymousClass006.A0w(bfm, str5, numValueOf, R.string._name_removed__res_0x7f120ddc);
                    BBI.A0R(bbi, false);
                } else {
                    numValueOf = null;
                    bfm.AgE(1069782059);
                    strA0f = AnonymousClass003.A0f(bfm, bbi, str5, R.string._name_removed__res_0x7f120ddb);
                }
                bfm.AgE(1033573505);
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                long j2 = auraColorsA0c.secondaryText;
                long j3 = C1809ArT.A01;
                long j4 = B6A.A07;
                int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j2, j3, j3, j4));
                try {
                    c1731ApSA0W.A0E(str5);
                    if (numValueOf != null) {
                        bfm.AgE(-1892131437);
                        c1731ApSA0W.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                        iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, auraColorsA0c.tertiaryText, j3, j3, j4));
                        c1731ApSA0W.A0E(AbstractC2271BQs.A02(bfm, new Object[]{numValueOf}, R.string._name_removed__res_0x7f120dd2));
                        c1731ApSA0W.A06(iA02);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-1891913290);
                        BBI.A0R(bbi, false);
                    }
                    ApQ apQA04 = c1731ApSA0W.A04();
                    BBI.A0R(bbi, false);
                    boolean zA65 = bfm.A65(strA0f);
                    Object objAaT3 = bfm.AaT();
                    if (zA65 || objAaT3 == obj) {
                        objAaT3 = new HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$1$3$3$3$1$1(strA0f);
                        bfm.Ai0(objAaT3);
                    }
                    BRg bRgA0Y2 = AnonymousClass001.A0Y(bs0, objAaT3, zA1a);
                    InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(AcQ.A00(f2), bfm, c1ac, 48);
                    int iA0D3 = AnonymousClass001.A0D(bbi);
                    AKQ akqA044 = BBI.A04(bbi);
                    BRg bRgA014 = AxM.A01(bfm, bRgA0Y2);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                    BPg.A02(bfm, akqA044, g0v2);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D3);
                    BPg.A02(bfm, bRgA014, g0vA0u);
                    HatchStarRatingKt.m2044StarRatingRow6a0pyJM(pdpRating.value, null, SellerRatingStarSize, bfm, 384, 2);
                    AuraTextKt.m2640AuraTextVmYn7U0(apQA04, null, 0L, C06G.A0a(bfm, akh), null, null, null, 0L, false, 0, zA1a ? 1 : 0, 0, null, null, null, bfm, 0, 6, 31734);
                    BBI.A0R(bbi, zA1a);
                    BBI.A0R(bbi, false);
                } finally {
                    c1731ApSA0W.A06(iA02);
                }
            }
            Integer num = pdpSeller.joinYear;
            if (num == null || num.intValue() <= 0) {
                bfm.AgE(1977124514);
            } else {
                bfm.AgE(1977124515);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, String.valueOf(num.intValue()), R.string._name_removed__res_0x7f120dd8), null, auraColorsA0c.secondaryText, C06G.A0a(bfm, akh), null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass002.A10(bbi, false, zA1a);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pdpSeller, g0u, str, str2, productDetailsAnalytics, bRg2, i, i2);
        }
    }
}
