package com.facebook.aura.marketplacemap;

import X.AKO;
import X.AKQ;
import X.ARK;
import X.AbstractC0878AGe;
import X.AbstractC1730ApR;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BG3;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0881AGi;
import X.C0dm;
import X.C0v5;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1733ApU;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C8j3;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class MarketplaceMapListingRowKt {
    public static final float LARGE_FONT_SCALE = 1.3f;

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$ListingText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MarketplaceMapListing $listing;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarketplaceMapListing marketplaceMapListing, BRg bRg, int i, int i2) {
            super(2);
            this.$listing = marketplaceMapListing;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MarketplaceMapListingRowKt.ListingText(this.$listing, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$ListingThumbnail$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MarketplaceMapListingRowKt.ListingThumbnail(this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$ListingThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C126862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126862(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MarketplaceMapListingRowKt.ListingThumbnail(this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$ListingThumbnailPlaceholder$2, reason: invalid class name and case insensitive filesystem */
    public final class C126872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126872(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MarketplaceMapListingRowKt.ListingThumbnailPlaceholder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$MarketplaceMapListingRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ MarketplaceMapListing $listing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MarketplaceMapListing marketplaceMapListing, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$listing = marketplaceMapListing;
            this.$isSelected = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MarketplaceMapListingRowKt.MarketplaceMapListingRow(this.$listing, this.$isSelected, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void MarketplaceMapListingRow(MarketplaceMapListing marketplaceMapListing, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        long j;
        AnonymousClass002.A1A(marketplaceMapListing, 0, function0);
        bfm.AgG(-2125796721);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapListing, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            int i4 = iA05 & 14;
            String strListingAccessibilityLabel = listingAccessibilityLabel(marketplaceMapListing, bfm, MarketplaceMapListing.$stable | i4);
            BRg bRgA01 = C11U.A01(AnonymousClass001.A0R(bRg), 8.0f);
            if (z) {
                bfm.AgE(1513797064);
                j = C3cH.A0W(bfm).secondaryButtonBackground;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1513798234);
                j = B6A.A06;
            }
            BRg bRgA05 = C0v5.A05(C1b8.A01(bRgA01, j), null, function0, !marketplaceMapListing.isUnavailable);
            boolean zA65 = bfm.A65(strListingAccessibilityLabel) | AnonymousClass003.A1C(iA05) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(marketplaceMapListing))) | AnonymousClass004.A1K(iA05);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new MarketplaceMapListingRowKt$MarketplaceMapListingRow$1$1(strListingAccessibilityLabel, z, marketplaceMapListing, function0);
                BBI.A0O(bbiA0M, objAaT);
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0X(bRgA05, objAaT), AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA012, iA0D);
            String str = marketplaceMapListing.imageUrl;
            BS0 bs0 = BRg.A00;
            ListingThumbnail(str, C11S.A00(bs0, marketplaceMapListing.isUnavailable ? 0.5f : 1.0f), bfm, 0, 0);
            ListingText(marketplaceMapListing, ARK.A01(bs0, 1.0f, true), bfm, MarketplaceMapListing.$stable | i4, 0);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(marketplaceMapListing, z, function0, bRg, i, i2);
        }
    }

    public static final void ListingText(MarketplaceMapListing marketplaceMapListing, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(325252149);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapListing, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            boolean zA1Q = C8j3.A1Q((((C0dm) AKO.A07(Am0.A04, bbi)).AFo() > 1.3f ? 1 : (((C0dm) AKO.A07(Am0.A04, bbi)).AFo() == 1.3f ? 0 : -1)));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str = marketplaceMapListing.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, zA1Q ? Integer.MAX_VALUE : 1, 2, null, null, null, bfm, 0, 6, 14834);
            ApQ apQListingDetailText = listingDetailText(marketplaceMapListing, bfm, MarketplaceMapListing.$stable | (iA05 & 14));
            if (apQListingDetailText == null) {
                bfm.AgE(-1666790699);
            } else {
                AuraTextKt.m2640AuraTextVmYn7U0(apQListingDetailText, null, 0L, C3cH.A0X(bfm, auraTheme, -1666790698).footnoteRegular, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32758);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(marketplaceMapListing, bRg2, i, i2);
        }
    }

    public static final void ListingThumbnail(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c126862;
        BRg bRg2 = bRg;
        bfm.AgG(1458042570);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bRg2, 56.0f), 8.0f), C3cH.A0W(bfm).elevated);
            if (str == null) {
                bfm.AgE(1542158090);
                ListingThumbnailPlaceholder(bRgA01, bfm, 0, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c126862 = new AnonymousClass1(str, bRg2, i, i2);
                    bBbAAc.A06 = c126862;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1542233048);
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA01, B18.A00, null, null, false, C8j3.A0k(56.0f), 0L, false, false, false, ComposableSingletons$MarketplaceMapListingRowKt.f83lambda$2030507265, null, null, null, bfm, (iA0d & 14) | 1576320, 48, 30640);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c126862 = new C126862(str, bRg2, i, i2);
            bBbAAc.A06 = c126862;
        }
    }

    public static final String listingAccessibilityLabel(MarketplaceMapListing marketplaceMapListing, BFM bfm, int i) {
        List listA0F;
        if (marketplaceMapListing.isUnavailable) {
            bfm.AgE(-1787561357);
            listA0F = Collections.singletonList(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120445));
        } else {
            bfm.AgE(-1787455244);
            String str = marketplaceMapListing.price;
            String str2 = marketplaceMapListing.salePrice;
            String strA0t = null;
            if (str2 != null) {
                if (str != null) {
                    bfm.AgE(-1787297268);
                    strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120447);
                }
                AnonymousClass001.A1D(bfm);
                listA0F = BFI.A0F(new String[]{str2, strA0t});
            } else {
                str2 = str;
            }
            bfm.AgE(-1787297269);
            AnonymousClass001.A1D(bfm);
            listA0F = BFI.A0F(new String[]{str2, strA0t});
        }
        AnonymousClass001.A1D(bfm);
        return C3cH.A0e(", ", AbstractC0878AGe.A0P(listA0F, Collections.singletonList(marketplaceMapListing.name)));
    }

    public static final void ListingThumbnailPlaceholder(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(2035258952);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A0W(bfm).secondaryText, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126872(bRg, i, i2);
        }
    }

    public static final ApQ listingDetailText(MarketplaceMapListing marketplaceMapListing, BFM bfm, int i) {
        BBI bbiA07;
        ApQ apQA04;
        bfm.AgE(652844444);
        if (marketplaceMapListing.isUnavailable) {
            bfm.AgE(1277022581);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120445);
            long jA07 = C3cH.A07(bfm, AuraTheme.INSTANCE);
            long j = C1809ArT.A01;
            C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA07, j, j, B6A.A07);
            ApQ apQ = AbstractC1730ApR.A00;
            apQA04 = new ApQ(strA01, Collections.singletonList(new C1733ApU(c1824Aro, 0, strA01.length())), C0881AGi.A00);
            bbiA07 = C3cG.A07(bfm);
        } else {
            bfm.AgE(1277192678);
            bbiA07 = (BBI) bfm;
            BBI.A0R(bbiA07, false);
            String str = marketplaceMapListing.salePrice;
            if (str == null && (str = marketplaceMapListing.price) == null) {
                BBI.A0R(bbiA07, false);
                return null;
            }
            String str2 = marketplaceMapListing.price;
            if (str == null) {
                str2 = null;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            long j2 = auraTheme.getColors(bfm, 6).tertiaryText;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            int iA00 = C1731ApS.A00(c1731ApSA0W, C1824Aro.A01(c1822Arm.A02, 65534, jA06, 0L));
            try {
                c1731ApSA0W.A0E(str);
                c1731ApSA0W.A06(iA00);
                if (str2 != null) {
                    c1731ApSA0W.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                    BG3 bg3 = BG3.A01;
                    long j3 = C1809ArT.A01;
                    iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, j2, j3, j3, B6A.A07));
                    try {
                        c1731ApSA0W.A0E(str2);
                    } finally {
                    }
                }
                apQA04 = c1731ApSA0W.A04();
            } finally {
            }
        }
        BBI.A0R(bbiA07, false);
        return apQA04;
    }
}
