package com.facebook.aura.productactions.lightbox;

import X.AKO;
import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC3358CGz;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C0eO;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C1qN;
import X.C2VU;
import X.C2av;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.productactions.lightbox.FeaturedProductLightboxViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingDisplayPrices;
import com.facebook.aura.shopping.model.ShoppingEyebrowTextKt;
import com.facebook.aura.shopping.model.ShoppingProductPriceKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class FeaturedProductLightboxChipKt {
    public static final Unit FeaturedProductChip$lambda$2$0(C1BO c1bo, C2av c2av) {
        C7384Etj.A0Y(c2av, 1);
        c2av.Acj(C1BO.A0F(c1bo) ? 0.7f : 1.0f);
        return Unit.INSTANCE;
    }

    public static final void ThumbnailPlaceholder(BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(1775964079);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A0W(bfm).secondaryText, null, bfm, (iA0d & 14) | 384 | (AVy.$stable << 3), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    int i5 = i2;
                    AnonymousClass001.A0F(obj2);
                    FeaturedProductLightboxChipKt.ThumbnailPlaceholder(bRg3, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void FeaturedProductChip(final FeaturedProductLightboxAccessory featuredProductLightboxAccessory, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1413854311);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, featuredProductLightboxAccessory) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1DM c1dm = auraTheme.getShapes(bfm, 6).card;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) objAaT;
            final C1BO<Boolean> c1boA00 = C0eO.A00(interfaceC1072AWd, bfm, 6);
            BRg bRgA00 = AbstractC07539Wl.A00(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(C1b8.A01(C11U.A03(HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.PRODUCT_CARD, featuredProductLightboxAccessory.componentId, featuredProductLightboxAccessory.analyticsMetadata, null, 500L, 0.0f, featuredProductLightboxAccessory.impressionDedupeKey, null, null), c1dm), auraTheme.getColors(bfm, 6).secondaryElevated), function0, null, 0, interfaceC1072AWd), "lobster-pdp-chip");
            boolean zA65 = bfm.A65(c1boA00);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new G0U() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return FeaturedProductLightboxChipKt.FeaturedProductChip$lambda$2$0(c1boA00, (C2av) obj2);
                    }
                };
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0W(bRgA00, objAaT2), AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingXsmallPlusNano), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = featuredProductLightboxAccessory.thumbnailUrl;
            BS0 bs0 = BRg.A00;
            ProductThumbnail(str, C10G.A07(bs0, 60.0f), bfm, 48, 0);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A02, bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(featuredProductLightboxAccessory.product.name, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            String strShoppingSubtitleText = ShoppingEyebrowTextKt.shoppingSubtitleText(ShoppingEyebrowTextKt.pdpEyebrowParts(featuredProductLightboxAccessory.brand, featuredProductLightboxAccessory.merchant), bfm, 0);
            if (strShoppingSubtitleText == null) {
                bfm.AgE(668675806);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strShoppingSubtitleText, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 668675807).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            FeaturedProductPrice(featuredProductLightboxAccessory.product, null, bfm, ShoppingResultProduct.$stable, 2);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    FeaturedProductLightboxAccessory featuredProductLightboxAccessory2 = featuredProductLightboxAccessory;
                    Function0 function03 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    FeaturedProductLightboxChipKt.FeaturedProductChip(featuredProductLightboxAccessory2, function03, bRg4, (BFM) obj2, AnonymousClass011.A02(obj3, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void FeaturedProductPrice(final ShoppingResultProduct shoppingResultProduct, BRg bRg, BFM bfm, final int i, final int i2) {
        Locale locale;
        final BRg bRg2 = bRg;
        bfm.AgG(1724730606);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
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
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            LocaleList localeListA02 = AKO.A02(AndroidCompositionLocals_androidKt.A00, bbi);
            if (localeListA02.isEmpty() || (locale = localeListA02.get(0)) == null) {
                locale = Locale.getDefault();
            }
            int i4 = FeaturedProductLightboxInputs.$stable;
            C7384Etj.A0X(locale);
            FeaturedProductLightboxInputs featuredProductLightboxInputs = new FeaturedProductLightboxInputs(shoppingResultProduct, locale);
            String identity = featuredProductLightboxInputs.getIdentity();
            FeaturedProductLightboxViewModel.Factory factory = new FeaturedProductLightboxViewModel.Factory(abstractC3358CGzA06, featuredProductLightboxInputs);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ShoppingProductPriceKt.m2012ShoppingProductPricecf5BqRc((ShoppingDisplayPrices) C1BO.A07(bfm, ((FeaturedProductLightboxViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), FeaturedProductLightboxViewModel.class, identity)).uiState), bRg2, 0L, C3cH.A0E(bfm, AuraTheme.INSTANCE), bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ShoppingResultProduct shoppingResultProduct2 = shoppingResultProduct;
                    BRg bRg3 = bRg2;
                    int i5 = i;
                    FeaturedProductLightboxChipKt.FeaturedProductPrice(shoppingResultProduct2, bRg3, (BFM) obj, AnonymousClass011.A00(i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ProductThumbnail(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRgA0Q = bRg;
        bfm.AgG(1766167332);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1DM c1dm = auraTheme.getShapes(bfm, 6).small;
            BRg bRgA02 = C1DI.A02(C1b8.A01(C11U.A03(bRgA0Q, c1dm), auraTheme.getColors(bfm, 6).elevated), c1dm, 0.0f, auraTheme.getColors(bfm, 6).photoBorder);
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
            if (str == null) {
                bfm.AgE(642365812);
                ThumbnailPlaceholder(null, bfm, 0, 1);
            } else {
                bfm.AgE(642413676);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A00, null, null, false, C8j3.A0k(60.0f), 0L, false, false, false, ComposableSingletons$FeaturedProductLightboxChipKt.f227lambda$997225405, null, null, null, bfm, (iA0d & 14) | 1573296, 48, 30648);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChipKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg2 = bRgA0Q;
                    int i4 = i;
                    FeaturedProductLightboxChipKt.ProductThumbnail(str2, bRg2, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit FeaturedProductChip$lambda$4(FeaturedProductLightboxAccessory featuredProductLightboxAccessory, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        FeaturedProductChip(featuredProductLightboxAccessory, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit FeaturedProductPrice$lambda$2(ShoppingResultProduct shoppingResultProduct, BRg bRg, int i, int i2, BFM bfm, int i3) {
        FeaturedProductPrice(shoppingResultProduct, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ProductThumbnail$lambda$1(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        ProductThumbnail(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ThumbnailPlaceholder$lambda$0(BRg bRg, int i, int i2, BFM bfm, int i3) {
        ThumbnailPlaceholder(bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
