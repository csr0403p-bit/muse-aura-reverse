package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.analytics.hatch.HatchShoppingSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingCartCardUiModel;
import com.facebook.aura.shopping.model.ShoppingCartItem;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.model.ShoppingCartSummary;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchShoppingCartCardKt {

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCartCardKt$ShoppingCartCardHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingCartSummary $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, ShoppingCartSummary shoppingCartSummary, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = shoppingCartSummary;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCartCardKt.ShoppingCartCardHeader(this.$title, this.$summary, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCartCardKt$ShoppingCartCardItems$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $hiddenCount;
        public final /* synthetic */ List<ShoppingCartItem> $items;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<ShoppingCartItem> list, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$items = list;
            this.$hiddenCount = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCartCardKt.ShoppingCartCardItems(this.$items, this.$hiddenCount, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCartCardKt$ShoppingCartCardItems$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $hiddenCount;
        public final /* synthetic */ List<ShoppingCartItem> $items;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<ShoppingCartItem> list, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$items = list;
            this.$hiddenCount = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCartCardKt.ShoppingCartCardItems(this.$items, this.$hiddenCount, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingCartCardKt$ShoppingCartViewCartButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C137282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingCartPresentation $cart;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137282(ShoppingCartPresentation shoppingCartPresentation, String str, String str2, String str3, ShoppingCheckoutLogContext shoppingCheckoutLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$cart = shoppingCartPresentation;
            this.$presentationId = str;
            this.$hostMessageId = str2;
            this.$sessionId = str3;
            this.$logContext = shoppingCheckoutLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingCartCardKt.ShoppingCartViewCartButton(this.$cart, this.$presentationId, this.$hostMessageId, this.$sessionId, this.$logContext, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: HatchShoppingCartCard-1YH7lEI, reason: not valid java name */
    public static final void m2034HatchShoppingCartCard1YH7lEI(ShoppingCartPresentation shoppingCartPresentation, ShoppingCartCardUiModel shoppingCartCardUiModel, String str, String str2, String str3, long j, C1D3 c1d3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(shoppingCartPresentation, 0);
        AnonymousClass005.A11(shoppingCartCardUiModel, str, str2, 1);
        C7384Etj.A0Y(c1d3, 6);
        bfm.AgG(-1470441378);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingCartPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, shoppingCartCardUiModel);
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
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass002.A02(bfm.A64(j) ? 1 : 0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1d3);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchShoppingSurface hatchShoppingSurface = HatchShoppingSurface.CART_WIDGET;
            HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(str3));
            String str4 = shoppingCartPresentation.widgetId;
            ShoppingResultsAttribution shoppingResultsAttribution = shoppingCartPresentation.cart.attribution;
            ShoppingCheckoutLogContext shoppingCheckoutLogContextRememberShoppingCheckoutLogContext = ShoppingCheckoutImpressionKt.rememberShoppingCheckoutLogContext(hatchShoppingSurface, hatchScreenChatScreen, str4, str2, shoppingResultsAttribution != null ? shoppingResultsAttribution.provider : null, null, null, bfm, (iA0d & 7168) | 6, 96);
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(bRg2.then(ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(shoppingCheckoutLogContextRememberShoppingCheckoutLogContext, null, null, bfm, 0, 6)), c1d3), j), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            ShoppingCartCardHeader(shoppingCartPresentation.title, shoppingCartCardUiModel.summary, null, bfm, 0, 4);
            ShoppingCartCardItems(shoppingCartCardUiModel.visibleItems, shoppingCartCardUiModel.hiddenItemCount, null, bfm, 0, 4);
            int i4 = iA0d >> 3;
            ShoppingCartViewCartButton(shoppingCartPresentation, str, str2, str3, shoppingCheckoutLogContextRememberShoppingCheckoutLogContext, C10G.A02, bfm, (i4 & 7168) | AnonymousClass002.A07(i4, (iA0d & 14) | 196608), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShoppingCartCardKt$HatchShoppingCartCard$2(shoppingCartPresentation, shoppingCartCardUiModel, str, str2, str3, j, c1d3, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartCardHeader(String str, ShoppingCartSummary shoppingCartSummary, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-224913714);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, shoppingCartSummary);
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
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
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
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.shoppingcart_outline_24_wght400, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            BS0 bs0 = BRg.A00;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A02(C2VU.A09, C1b8.A01(C11U.A03(C10G.A07(bs0, 40.0f), auraTheme.getShapes(bfm, 6).small), auraTheme.getColors(bfm, 6).secondaryElevated), false), aVyA00, auraIconSize, null, j, null, bfm, AnonymousClass001.A04(), 32);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchShoppingCartCardKt$ShoppingCartCardHeader$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            AuraTextKt.m2639AuraTextUY9GdpU(shoppingCartSummaryText(shoppingCartSummary, bfm, (iA0d >> 3) & 14), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, shoppingCartSummary, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartCardItems(List<ShoppingCartItem> list, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(498014693);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(list, i, bRg2, i2, i3);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
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
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 411989479);
            while (itA0w.hasNext()) {
                ShoppingCartItem shoppingCartItem = (ShoppingCartItem) itA0w.next();
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicro);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, C2VU.A05, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                String str = shoppingCartItem.name;
                BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, false);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0O, C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, ShoppingCartRowsKt.formatCartQuantity(shoppingCartItem.quantity, bfm, 0), R.string._name_removed__res_0x7f1205f6), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            if (i > 0) {
                bfm.AgE(-112453936);
                String strA0Y = AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100019);
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0Y, null, C3cH.A07(bfm, auraTheme2), C3cH.A0E(bfm, auraTheme2), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-112137581);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(list, i, bRg2, i2, i3);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void ShoppingCartViewCartButton(ShoppingCartPresentation shoppingCartPresentation, String str, String str2, String str3, ShoppingCheckoutLogContext shoppingCheckoutLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2055553979);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingCartPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, shoppingCheckoutLogContext);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120600);
            BRg bRgThen = bRg2.then(ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(shoppingCheckoutLogContext, HatchShoppingControl.CART_OPEN, null, bfm, ((iA0d >> 12) & 14) | 48, 4));
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.PILL, bfm, 54, 0);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass003.A1E(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass003.A1B(iA0d), AnonymousClass005.A1L(iA0d)) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchShoppingCartCardKt$ShoppingCartViewCartButton$1$1(str3, str2, shoppingCartPresentation, shoppingCheckoutLogContext, auraNavigatorA0b, str);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgThen, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137282(shoppingCartPresentation, str, str2, str3, shoppingCheckoutLogContext, bRg2, i, i2);
        }
    }

    public static final String shoppingCartSummaryText(ShoppingCartSummary shoppingCartSummary, BFM bfm, int i) throws Resources.NotFoundException {
        int i2;
        int i3;
        Object[] objArr;
        String strA00;
        if (C7384Etj.areEqual(shoppingCartSummary, ShoppingCartSummary.Empty.INSTANCE)) {
            bfm.AgE(2095015272);
            strA00 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f8);
        } else {
            if (shoppingCartSummary instanceof ShoppingCartSummary.Subtotal) {
                bfm.AgE(2095018771);
                i2 = R.plurals._name_removed__res_0x7f10001a;
                ShoppingCartSummary.Subtotal subtotal = (ShoppingCartSummary.Subtotal) shoppingCartSummary;
                i3 = subtotal.itemCount;
                objArr = new Object[]{subtotal.subtotal, Integer.valueOf(i3)};
            } else {
                if (!(shoppingCartSummary instanceof ShoppingCartSummary.ItemCount)) {
                    throw AnonymousClass005.A0k(bfm, 2095014121);
                }
                bfm.AgE(2095026577);
                i2 = R.plurals._name_removed__res_0x7f10001b;
                i3 = ((ShoppingCartSummary.ItemCount) shoppingCartSummary).itemCount;
                objArr = new Object[]{Integer.valueOf(i3)};
            }
            strA00 = AbstractC2271BQs.A00(i2, objArr, bfm, i3);
        }
        AnonymousClass001.A1D(bfm);
        return strA00;
    }
}
