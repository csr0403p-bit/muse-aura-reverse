package com.facebook.aura.shopping.view;

import X.AGI;
import X.AKH;
import X.AKO;
import X.AKT;
import X.AbstractC0878AGe;
import X.AbstractC1798ArH;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C0981AMm;
import X.C0Hi;
import X.C11U;
import X.C19U;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C31u;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C9jH;
import X.C9tI;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7359EnW;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.productactions.impl.ConversationItemActionContext;
import com.facebook.aura.productactions.impl.ShoppingConversationItemActions;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.view.MC;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchProductPillProviderKt {
    public static final float IconBorderWidth = 0.5f;
    public static final float IconCornerRadius = 4.0f;
    public static final float IconTextGap = 4.0f;
    public static final float MAX_ASPECT_RATIO = 1.3333334f;
    public static final float MIN_ASPECT_RATIO = 0.75f;
    public static final float SQUARE_ASPECT_RATIO = 1.0f;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchProductPillProviderKt.class, "shoppingResultPdpEnabled", "getShoppingResultPdpEnabled()Z", 1);
    public static final long FallbackIconHeight = C19U.A03(16);
    public static final C31u shoppingResultPdpEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp);

    /* renamed from: com.facebook.aura.shopping.view.HatchProductPillProviderKt$HatchProductPillProvider$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BO6<String, ShoppingResultProduct> $productsByPillId;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BO6<String, ShoppingResultProduct> bo6, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$productsByPillId = bo6;
            this.$sessionId = str;
            this.$messageId = str2;
            this.$actionsEnabled = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductPillProviderKt.HatchProductPillProvider(this.$productsByPillId, this.$sessionId, this.$messageId, this.$actionsEnabled, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.AJp] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.BFM] */
    public static final void HatchProductPillProvider(BO6<String, ShoppingResultProduct> bo6, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        ConversationItemActionContext conversationItemActionContext;
        AnonymousClass002.A1A(bo6, 0, str2);
        C7384Etj.A0Y(g0v, 4);
        bfm.AgG(140828186);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(bo6, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0v);
        }
        boolean z2 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            boolean zIsEmpty = bo6.isEmpty();
            boolean z3 = !zIsEmpty;
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            boolean shoppingResultPdpEnabled = getShoppingResultPdpEnabled();
            int i2 = iA05 & 14;
            boolean z4 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6));
            Object objAaT = bfm.AaT();
            if (z4 || objAaT == C78N.A00) {
                objAaT = new C0981AMm();
                BBI.A0O(bbi, objAaT);
            }
            C0981AMm c0981AMm = (C0981AMm) objAaT;
            boolean z5 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6));
            Object objAaT2 = bfm.AaT();
            if (z5 || objAaT2 == C78N.A00) {
                objAaT2 = new ShoppingMerchantRanking(AbstractC0878AGe.A0X(bo6.values()));
                BBI.A0O(bbi, objAaT2);
            }
            ShoppingMerchantRanking shoppingMerchantRanking = (ShoppingMerchantRanking) objAaT2;
            int i3 = iA05 & 896;
            boolean zA1P = AnonymousClass003.A1P(bfm, c0981AMm, shoppingMerchantRanking, (i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6))) | AnonymousClass003.A19(i3));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == C78N.A00) {
                objAaT3 = new HatchProductPillProviderKt$HatchProductPillProvider$iconBuilder$1$1(bo6, str2, shoppingMerchantRanking, c0981AMm);
                BBI.A0O(bbi, objAaT3);
            }
            G0W g0w = (G0W) objAaT3;
            boolean z6 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6));
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1W = AnonymousClass004.A1W(bfm, shoppingMerchantRanking, shoppingResultPdpEnabled, AnonymousClass003.A1P(bfm, auraNavigatorA05, abstractC3358CGzA06, AnonymousClass003.A18(i4) | z6 | AnonymousClass003.A19(i3)));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == C78N.A00) {
                objAaT4 = !shoppingResultPdpEnabled ? null : new HatchProductPillProviderKt$HatchProductPillProvider$onEntityClick$1$1(bo6, str2, shoppingMerchantRanking, auraNavigatorA05, abstractC3358CGzA06, str);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            boolean zA18 = AnonymousClass003.A18(i4) | AnonymousClass003.A19(i3);
            Object objAaT5 = bfm.AaT();
            if (zA18 || objAaT5 == C78N.A00) {
                objAaT5 = AbstractC1798ArH.A04(bbi, null);
            }
            MutableState mutableState = (MutableState) objAaT5;
            ShoppingConversationItemActions shoppingConversationItemActions = ShoppingConversationItemActions.INSTANCE;
            if (!z) {
                shoppingConversationItemActions = null;
            }
            C0Hi c0Hi = (C0Hi) AKO.A07(Am0.A05, bbi);
            boolean zA1U = AnonymousClass001.A1U(bfm, z3, AnonymousClass003.A1P(bfm, c0Hi, shoppingConversationItemActions, i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6))));
            Object objAaT6 = bfm.AaT();
            if (zA1U || objAaT6 == C78N.A00) {
                objAaT6 = (shoppingConversationItemActions == null || zIsEmpty) ? null : new HatchProductPillProviderKt$HatchProductPillProvider$onProductLongPress$1$1(c0Hi, bo6, mutableState);
                bfm.Ai0(objAaT6);
            }
            G0U g0u2 = (G0U) objAaT6;
            if (shoppingConversationItemActions == null) {
                bfm.AgE(-766483836);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2102935267);
                ShoppingResultProduct shoppingResultProduct = (ShoppingResultProduct) mutableState.getValue();
                if (shoppingResultProduct != null) {
                    int i5 = ConversationItemActionContext.$stable;
                    conversationItemActionContext = new ConversationItemActionContext(shoppingResultProduct, new ShoppingProductSource(null, null, 0, null, null, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS, str2, shoppingResultProduct.citationId), str, str2, false, true, null);
                } else {
                    conversationItemActionContext = null;
                }
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT7 = bfm.AaT();
                if (zA65 || objAaT7 == C78N.A00) {
                    objAaT7 = new HatchProductPillProviderKt$HatchProductPillProvider$2$1(mutableState);
                    BBI.A0O(bbi, objAaT7);
                }
                shoppingConversationItemActions.Menu(conversationItemActionContext, (Function0) objAaT7, BRg.A00, bfm, ConversationItemActionContext.$stable | 384, 0);
                BBI.A0R(bbi, false);
            }
            if (i2 == 4 || ((iA05 & 8) != 0 && bfm.A65(bo6))) {
                z2 = true;
            }
            boolean zA1T = AnonymousClass005.A1T(bfm, g0u, g0u2, g0w, z2);
            Object objAaT8 = bfm.AaT();
            if (zA1T || objAaT8 == C78N.A00) {
                AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = zIsEmpty ? null : new AuraMarkdownInlineEntityHandler(new HatchProductPillProviderKt$HatchProductPillProvider$handler$1$1(bo6), g0u, g0u2, g0w, null, HatchProductPillProviderKt$HatchProductPillProvider$handler$1$2.INSTANCE, true, false);
                bfm.Ai0(auraMarkdownInlineEntityHandler);
                objAaT8 = auraMarkdownInlineEntityHandler;
            }
            AKH akh = AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineEntityHandlers;
            ?? AYj = (Map) AKO.A07(akh, bbi);
            boolean zA1K = AnonymousClass003.A1K(bfm, AYj, objAaT8);
            Object objAaT9 = bfm.AaT();
            if (zA1K || objAaT9 == C78N.A00) {
                if (objAaT8 != null) {
                    AYj = AGI.A0F(AYj).AYj(ShoppingProductEntityMarkdown.INLINE_NAME, objAaT8);
                }
                bfm.Ai0(AYj);
                objAaT9 = AYj;
            }
            AKT.A01(bfm, akh.A04(objAaT9), g0v, ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bo6, str, str2, z, g0v, i);
        }
    }

    /* renamed from: HatchProductEntityIcon-iHT-50w, reason: not valid java name */
    public static final void m2030HatchProductEntityIconiHT50w(ShoppingResultProduct shoppingResultProduct, String str, Integer num, ShoppingMerchantRanking shoppingMerchantRanking, float f, G0U<? super Float, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(466908673);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, num);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, shoppingMerchantRanking);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 599187, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            boolean zA1C = (i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(shoppingResultProduct))) | AnonymousClass003.A1C(iA05) | AnonymousClass004.A1K(iA05) | ((iA05 & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, HatchScreen.MAIN_CHAT, HatchComponent.SHOPPING_PRODUCT_ENTITY, shoppingResultProduct.productId, ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str, ShoppingFormat.CHIP, null, shoppingMerchantRanking, C9jH.A00), num, 500L, 0.0f, FGI.A0d("shopping_product_entity:", str, ":", ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct)), null, null);
                bfm.Ai0(objAaT);
            }
            C1D3 c1d3A00 = C1D8.A00(IconCornerRadius);
            BRg bRgA03 = C11U.A03(AnonymousClass001.A0T(bRg2.then((BRg) objAaT)), c1d3A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            m2031HatchProductEntityPictureDzVHIIc(shoppingResultProduct, f, g0u, C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).elevated), c1d3A00, IconBorderWidth, auraTheme.getColors(bfm, 6).border), bfm, AnonymousClass002.A07(iA05 >> 9, i4 | ShoppingResultProduct.$stable), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchProductPillProviderKt$HatchProductEntityIcon$1(shoppingResultProduct, str, num, shoppingMerchantRanking, f, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* renamed from: HatchProductEntityPicture-DzVHIIc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2031HatchProductEntityPictureDzVHIIc(com.facebook.aura.shopping.model.ShoppingResultProduct r25, float r26, X.G0U<? super java.lang.Float, kotlin.Unit> r27, X.BRg r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductPillProviderKt.m2031HatchProductEntityPictureDzVHIIc(com.facebook.aura.shopping.model.ShoppingResultProduct, float, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final boolean getShoppingResultPdpEnabled() {
        return AnonymousClass001.A1X(C31u.A00(shoppingResultPdpEnabled$delegate, $$delegatedProperties));
    }

    public static final Map<String, String> chipPositionMetadata(String str) {
        Integer numA0r = C9tI.A0r(str);
        if (numA0r != null) {
            Map<String, String> mapA10 = AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(numA0r.intValue()));
            if (mapA10 != null) {
                return mapA10;
            }
        }
        return C9jH.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BO6<java.lang.String, X.C14P> rememberHatchProductIconContent(X.AHD<com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot> r18, java.util.Map<java.lang.String, com.facebook.aura.shopping.model.ShoppingResultProduct> r19, java.lang.String r20, com.facebook.aura.shopping.model.ShoppingMerchantRanking r21, java.util.Map<java.lang.String, java.lang.Float> r22, X.BFM r23, int r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductPillProviderKt.rememberHatchProductIconContent(X.AHD, java.util.Map, java.lang.String, com.facebook.aura.shopping.model.ShoppingMerchantRanking, java.util.Map, X.BFM, int):X.BO6");
    }
}
