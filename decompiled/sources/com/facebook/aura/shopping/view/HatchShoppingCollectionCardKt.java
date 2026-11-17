package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1DM;
import X.C1OM;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.AttachmentPreviewShapeKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingCollection;
import com.facebook.aura.shopping.model.ShoppingCollectionLayout;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchShoppingCollectionCardKt {
    public static final float CollectionCardInset = AuraDimensKt.SpacingMicro;
    public static final float CollectionLeadPhotoWeight = 220.0f;
    public static final float CollectionPhotoDecodeSize = 216.0f;
    public static final float CollectionPhotoSpacing = 1.0f;
    public static final float CollectionPreviewAspectRatio = 1.5555556f;
    public static final float CollectionPreviewCornerRadius = 18.0f;
    public static final float CollectionSidePhotoWeight = 116.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCollectionCardKt$ShoppingCollectionCollage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<ShoppingResultProduct> $photos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<ShoppingResultProduct> list, BRg bRg, int i, int i2) {
            super(2);
            this.$photos = list;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCollectionCardKt.ShoppingCollectionCollage(this.$photos, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCollectionCardKt$ShoppingCollectionSummary$2, reason: invalid class name and case insensitive filesystem */
    public final class C137292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $productCount;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137292(String str, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$productCount = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCollectionCardKt.ShoppingCollectionSummary(this.$title, this.$productCount, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: CollectionPhoto-6a0pyJM, reason: not valid java name */
    public static final void m2035CollectionPhoto6a0pyJM(ShoppingResultProduct shoppingResultProduct, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        bfm.AgG(1809682174);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = CollectionPhotoDecodeSize;
            }
            HatchShoppingResultsCardKt.m2040ProductImageOrFallback942rkJo(shoppingResultProduct, AuraIconSize.LARGE, f2, bRg2, bfm, ShoppingResultProduct.$stable | 48 | (iA05 & 14) | (iA05 & 896) | ((iA05 << 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShoppingCollectionCardKt$CollectionPhoto$1(shoppingResultProduct, bRg2, f2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingCollectionLayout.values().length];
            try {
                AnonymousClass002.A13(ShoppingCollectionLayout.COLLAGE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: HatchShoppingCollectionCard-Ccamzx0, reason: not valid java name */
    public static final void m2036HatchShoppingCollectionCardCcamzx0(ShoppingResultsPresentation shoppingResultsPresentation, ShoppingCollection shoppingCollection, String str, String str2, String str3, long j, C1D3 c1d3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(shoppingResultsPresentation, shoppingCollection, str);
        C7384Etj.A0Y(str3, 4);
        C7384Etj.A0Y(c1d3, 6);
        bfm.AgG(1647593876);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingResultsPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, shoppingCollection);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass002.A02(bfm.A64(j) ? 1 : 0);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1d3);
        }
        if ((i & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, str4);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120604);
            int i4 = shoppingCollection.productCount;
            int i5 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new ShoppingMerchantRanking(shoppingResultsPresentation.products);
                bfm.Ai0(objAaT);
            }
            ShoppingMerchantRanking shoppingMerchantRanking = (ShoppingMerchantRanking) objAaT;
            int i6 = 57344 & iA0d;
            int i7 = iA0d & 896;
            boolean zA1W = AnonymousClass002.A1W(bfm, shoppingMerchantRanking, AnonymousClass002.A1Q(i6, 16384) | AnonymousClass003.A19(i7), bfm.A63(i4));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = HatchShoppingResultsCardKt.shoppingResultsCardImpression(str3, str, i4, shoppingMerchantRanking);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA03 = C11U.A03(bRg2.then((BRg) objAaT2), c1d3);
            C1DM c1dm = C1OM.A00;
            BRg bRgA032 = C1b8.A03(bRgA03, c1dm, j);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1M = AnonymousClass004.A1M(iA0d) | AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass005.A1X(bfm, shoppingMerchantRanking, abstractC3358CGzA0h, AnonymousClass002.A1Q(i6, 16384) | AnonymousClass003.A19(i7), bfm.A63(i4)), AnonymousClass002.A1Q(i5, 4)) | AnonymousClass005.A1J(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == C78N.A00) {
                objAaT3 = new HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$1$1(str3, str, i4, shoppingMerchantRanking, abstractC3358CGzA0h, shoppingResultsPresentation, auraNavigatorA0b, str4, str2);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA04 = C0v5.A04(bRgA032, c1ydA0A, strA01, (Function0) objAaT3, zA1Z);
            float f = CollectionCardInset;
            float f2 = AuraDimensKt.SpacingXsmallPlusNano;
            BRg bRgA0C = C3U4.A0C(bRgA04, f, f, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            ShoppingCollectionLayout shoppingCollectionLayout = shoppingCollection.layout;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (shoppingCollectionLayout.ordinal() != 0) {
                throw AnonymousClass003.A0k(bfm, bbi, -297542638);
            }
            bfm.AgE(-297540195);
            List<ShoppingResultProduct> list = shoppingResultsPresentation.shoppingCollectionPhotos;
            BS0 bs0 = BRg.A00;
            ShoppingCollectionCollage(list, C1b8.A03(C11U.A03(BJe.A00(C10G.A02, 1.5555556f, false), AttachmentPreviewShapeKt.m671attachmentPreviewShapeVpY3zN4(c1d3, f, CollectionPreviewCornerRadius)), c1dm, C60O.A01(bfm, AuraTheme.INSTANCE)), bfm, 0, 0);
            BBI.A0R(bbi, false);
            ShoppingCollectionSummary(shoppingCollection.title, i4, C3U4.A0C(bs0, AuraDimensKt.SpacingXsmall, 0.0f, AuraDimensKt.SpacingSmall, 0.0f), bfm, 0, 0);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$3(shoppingResultsPresentation, shoppingCollection, str, str2, str3, j, c1d3, str4, bRg2, i, i2);
        }
    }

    public static final void ShoppingCollectionCollage(List<ShoppingResultProduct> list, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1083702433);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
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
            float f = CollectionPhotoSpacing;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (list.size() < 3) {
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1151612187);
                while (itA0w.hasNext()) {
                    m2035CollectionPhoto6a0pyJM((ShoppingResultProduct) itA0w.next(), AnonymousClass001.A0O(c90m, BRg.A00, true).then(C10G.A00), 0.0f, bfm, ShoppingResultProduct.$stable, 4);
                }
            } else {
                bfm.AgE(1151774720);
                ShoppingResultProduct shoppingResultProduct = list.get(0);
                BS0 bs0 = BRg.A00;
                BRg bRgAiP = c90m.AiP(bs0, 220.0f, true);
                C1062ATq c1062ATq = C10G.A00;
                BRg bRgThen = bRgAiP.then(c1062ATq);
                int i4 = ShoppingResultProduct.$stable;
                m2035CollectionPhoto6a0pyJM(shoppingResultProduct, bRgThen, 0.0f, bfm, i4, 4);
                BRg bRgThen2 = c90m.AiP(bs0, 116.0f, true).then(c1062ATq);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 6);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgThen2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90l c90l = C90l.A00;
                ShoppingResultProduct shoppingResultProduct2 = list.get(1);
                float f2 = CollectionPhotoDecodeSize;
                BRg bRgAiP2 = c90l.AiP(bs0, 1.0f, true);
                C1062ATq c1062ATq2 = C10G.A02;
                BRg bRgThen3 = bRgAiP2.then(c1062ATq2);
                int i5 = i4 | 384;
                m2035CollectionPhoto6a0pyJM(shoppingResultProduct2, bRgThen3, f2 / 2.0f, bfm, i5, 0);
                m2035CollectionPhoto6a0pyJM(list.get(2), c90l.AiP(bs0, 1.0f, true).then(c1062ATq2), f2 / 2.0f, bfm, i5, 0);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(list, bRg2, i, i2);
        }
    }

    public static final void ShoppingCollectionSummary(String str, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1368689534);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 2, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100037), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137292(str, i, bRg2, i2, i3);
        }
    }

    public static final void logCollectionOpen(String str, String str2, int i, ShoppingMerchantRanking shoppingMerchantRanking) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_LIST, HatchComponent.VIEW_ALL_PRODUCTS_BUTTON, null, ShoppingAnalyticsMetadataKt.shoppingWidgetMetadata(str, ShoppingFormat.LIST, str2, shoppingMerchantRanking, AnonymousClass006.A10(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(i))), null);
    }
}
