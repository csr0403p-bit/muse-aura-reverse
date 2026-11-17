package com.facebook.aura.shopping.view;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AKO;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Ad7;
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
import X.BO6;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1DD;
import X.C1DG;
import X.C1DP;
import X.C1YZ;
import X.C2VU;
import X.C31u;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import android.content.Context;
import android.os.SystemClock;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.productactions.impl.ConversationItemActionContext;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.navigation.ShoppingProductDetailsNavigationKt;
import com.facebook.aura.shopping.view.MC;
import com.facebook.aura.shopping.view.ProductItemsGridItem;
import com.facebook.aura.shopping.viewmodel.ProductItemsNavText;
import com.facebook.aura.shopping.viewmodel.ProductItemsSection;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import com.facebook.aura.ui.adaptive.AuraGridKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ProductItemsScreenKt {
    public static final float ProductItemsGridColumnSpacing = 8.0f;
    public static final int ProductItemsGridColumns = 2;
    public static final float ProductItemsGridRowSpacing = 16.0f;
    public static final float ProductItemsMinCellWidth = 180.0f;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(ProductItemsScreenKt.class, "shoppingResultPdpEnabled", "getShoppingResultPdpEnabled()Z", 1);
    public static final C31u shoppingResultPdpEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp);

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ ProductItemsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ProductItemsUiState productItemsUiState, String str, String str2) {
            super(4);
            this.$uiState = productItemsUiState;
            this.$sessionId = str;
            this.$messageId = str2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2059invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2059invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            ProductItemsUiState productItemsUiState = this.$uiState;
            if (productItemsUiState instanceof ProductItemsUiState.Loading) {
                bfm.AgE(844597967);
                ProductItemsScreenKt.m2053ProductItemsLoadingorJrPs(f, null, bfm, iA04 & 14, 2);
            } else if (productItemsUiState instanceof ProductItemsUiState.Empty) {
                bfm.AgE(844600621);
                ProductItemsScreenKt.m2051ProductItemsEmptyorJrPs(f, null, bfm, iA04 & 14, 2);
            } else {
                if (!(productItemsUiState instanceof ProductItemsUiState.Loaded)) {
                    AnonymousClass004.A1A(bfm, 844596567);
                    throw C3cG.A0q();
                }
                bfm.AgE(844603753);
                ProductItemsScreenKt.m2052ProductItemsGridnSlTg7c(((ProductItemsUiState.Loaded) this.$uiState).sections, this.$sessionId, this.$messageId, f, f2, null, bfm, AnonymousClass003.A07(iA04 << 9, ProductItemsSection.$stable), 32);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ ProductItemsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ProductItemsUiState productItemsUiState, Function0<Unit> function0, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = productItemsUiState;
            this.$onBack = function0;
            this.$sessionId = str;
            this.$messageId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductItemsScreenKt.ProductItemsScreen(this.$uiState, this.$onBack, this.$sessionId, this.$messageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsSectionHeader$3, reason: invalid class name and case insensitive filesystem */
    public final class C137513 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137513(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductItemsScreenKt.ProductItemsSectionHeader(this.$label, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsTile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingResultProductUiModel $displayProduct;
        public final /* synthetic */ long $gridInstanceKey;
        public final /* synthetic */ int $index;
        public final /* synthetic */ ShoppingMerchantRanking $merchantRanking;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<ShoppingResultProduct> $rawProducts;
        public final /* synthetic */ ProductItemsSection $section;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ProductItemsSection productItemsSection, AHD<ShoppingResultProduct> ahd, ShoppingMerchantRanking shoppingMerchantRanking, ShoppingResultProductUiModel shoppingResultProductUiModel, int i, String str, String str2, long j, BRg bRg, int i2, int i3) {
            super(2);
            this.$section = productItemsSection;
            this.$rawProducts = ahd;
            this.$merchantRanking = shoppingMerchantRanking;
            this.$displayProduct = shoppingResultProductUiModel;
            this.$index = i;
            this.$sessionId = str;
            this.$messageId = str2;
            this.$gridInstanceKey = j;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ProductItemsScreenKt.ProductItemsTile(this.$section, this.$rawProducts, this.$merchantRanking, this.$displayProduct, this.$index, this.$sessionId, this.$messageId, this.$gridInstanceKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsWebsiteMenuButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C137522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $website;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137522(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$website = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductItemsScreenKt.ProductItemsWebsiteMenuButton(this.$website, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ProductItemsEmpty--orJrPs, reason: not valid java name */
    public static final void m2051ProductItemsEmptyorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2033746339);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0T(bRg2), 0.0f, f, 0.0f, 0.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bRgA0C, auraTheme.getDimensions(bfm, 6).gutterWidth, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e6f), null, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e6e), C3U4.A0C(BRg.A00, 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ProductItemsScreenKt$ProductItemsEmpty$2(f, bRg2, i, i2);
        }
    }

    /* renamed from: ProductItemsGrid-nSlTg7c, reason: not valid java name */
    public static final void m2052ProductItemsGridnSlTg7c(AHD<ProductItemsSection> ahd, String str, String str2, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2059696198);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A08(bfm, f2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = Long.valueOf(SystemClock.elapsedRealtimeNanos());
                bfm.Ai0(objAaT);
            }
            long jA05 = C3cG.A05(objAaT);
            LazyGridState lazyGridStateA00 = Ad7.A00(bfm, 0, 3);
            String str3 = ((ProductItemsSection) AbstractC0878AGe.A0F(ahd)).presentationId;
            boolean zA65 = bfm.A65(lazyGridStateA00);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new ProductItemsScreenKt$ProductItemsGrid$1$1(lazyGridStateA00);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, str3);
            int i4 = iA05 & 14;
            boolean z = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(ahd));
            Object objAaT3 = bfm.AaT();
            if (z || objAaT3 == obj) {
                objAaT3 = toGridItems(ahd);
                bfm.Ai0(objAaT3);
            }
            List list = (List) objAaT3;
            int i5 = iA05 & 896;
            boolean zA19 = (i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(ahd))) | AnonymousClass003.A19(i5);
            Object objAaT4 = bfm.AaT();
            if (zA19 || objAaT4 == obj) {
                ProductItemsSection productItemsSection = (ProductItemsSection) AbstractC0878AGe.A0F(ahd);
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    AHD<ShoppingResultProductUiModel> ahd2 = ((ProductItemsSection) it.next()).products;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(ahd2);
                    Iterator it2 = ahd2.iterator();
                    while (it2.hasNext()) {
                        arrayListA0i.add(((ShoppingResultProductUiModel) it2.next()).product);
                    }
                    AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
                }
                objAaT4 = gridScreenImpression(productItemsSection, str2, arrayListA0h, jA05);
                bfm.Ai0(objAaT4);
            }
            C1DD c1dd = new C1DD(AuraGridKt.m2362auraGridColumnsWMci_g0(2, ProductItemsMinCellWidth, 0.0f, bfm, 54, 4));
            BRg bRgA0B = C3U4.A0B(C8j3.A0e(bRg2, C10G.A01, (BRg) objAaT4), C8j4.A01(bfm), 0.0f);
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, f2);
            C9m9 c9m9A00 = AcQ.A00(ProductItemsGridColumnSpacing);
            C9m9 c9m9A002 = AcQ.A00(ProductItemsGridRowSpacing);
            boolean zA1I = AnonymousClass004.A1I(iA05) | bfm.A67(list) | AnonymousClass003.A19(i5);
            Object objAaT5 = bfm.AaT();
            if (zA1I || objAaT5 == obj) {
                objAaT5 = new ProductItemsScreenKt$ProductItemsGrid$2$1(list, str, str2, jA05);
                BBI.A0T(bfm, objAaT5);
            }
            C1YZ.A00(null, null, c9m9A00, c9m9A002, c1dp, c1dd, lazyGridStateA00, bfm, bRgA0B, (G0U) objAaT5, 1769472, 0, 912, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ProductItemsScreenKt$ProductItemsGrid$3(ahd, str, str2, f, f2, bRg2, i, i2);
        }
    }

    /* renamed from: ProductItemsLoading--orJrPs, reason: not valid java name */
    public static final void m2053ProductItemsLoadingorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1464711156);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e70);
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0T(bRg2), f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ProductItemsScreenKt$ProductItemsLoading$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ProductItemsScreenKt$ProductItemsLoading$3(f, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ProductItemsScreen(com.facebook.aura.shopping.viewmodel.ProductItemsUiState r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, java.lang.String r46, java.lang.String r47, X.BRg r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ProductItemsScreenKt.ProductItemsScreen(com.facebook.aura.shopping.viewmodel.ProductItemsUiState, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void ProductItemsSectionHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(2091158348);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ProductItemsScreenKt$ProductItemsSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0Q, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str2 == null) {
                bfm.AgE(-2107297307);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -2107297306).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137513(str, str2, bRgA0Q, i, i2);
        }
    }

    public static final void ProductItemsTile(ProductItemsSection productItemsSection, AHD<ShoppingResultProduct> ahd, ShoppingMerchantRanking shoppingMerchantRanking, ShoppingResultProductUiModel shoppingResultProductUiModel, int i, String str, String str2, long j, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(233761742);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(productItemsSection, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, shoppingMerchantRanking);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, shoppingResultProductUiModel);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, i);
        }
        if ((i2 & 196608) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str);
        }
        if ((i2 & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0j(bfm, str2);
        }
        if ((i2 & 12582912) == 0) {
            iA05 |= AnonymousClass004.A0S(bfm, j);
        }
        int i4 = i3 & 256;
        int iA0l = 100663296;
        if (i4 != 0) {
            iA05 |= iA0l;
        } else if ((i2 & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 38347923, 38347922), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            Context contextA01 = AKO.A01(bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            ShoppingResultProduct shoppingResultProduct = shoppingResultProductUiModel.product;
            String str3 = productItemsSection.presentationId;
            String str4 = productItemsSection.presentationEventId;
            String str5 = str3;
            if (str3 == null) {
                str5 = str2;
            }
            boolean zA63 = bfm.A63(ahd.size()) | bfm.A65(str5);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = AnonymousClass007.A0d(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(ahd.size()), C3cG.A0r(HatchMetadataKey.PRESENTATION_ID.getValue(), str5));
                bfm.Ai0(objAaT);
            }
            Map map = (Map) objAaT;
            HatchComponent hatchComponent = HatchComponent.PRODUCT_GRID_CARD;
            String strA0K = FGI.A0K(str5, j, ":");
            int i5 = iA05 & 3670016;
            boolean zA1W = AnonymousClass002.A1W(bfm, map, AnonymousClass004.A1K(iA05), AnonymousClass002.A1W(bfm, str5, bfm.A65(shoppingResultProduct), AnonymousClass002.A1Q(i5, 1048576)));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str2, ShoppingFormat.GRID, str5, shoppingMerchantRanking, map);
                bfm.Ai0(objAaT2);
            }
            BRg bRgRememberShoppingTileImpression = HatchShoppingResultsCardKt.rememberShoppingTileImpression(hatchComponent, shoppingResultProduct, i, strA0K, (BO6) objAaT2, bfm, (ShoppingResultProduct.$stable << 3) | 6 | ((iA05 >> 6) & 896));
            int i6 = ConversationItemActionContext.$stable;
            ConversationItemActionContext conversationItemActionContext = new ConversationItemActionContext(shoppingResultProduct, new ShoppingProductSource(str3, str4, i, productItemsSection.widgetId, shoppingResultProduct.wireIndex, productItemsSection.kind, null, null), str, str2, true, false, Integer.valueOf(i));
            ShoppingProductCardStyle shoppingProductCardStyle = ShoppingProductCardStyle.PARTNER;
            ShoppingFormat shoppingFormat = ShoppingFormat.GRID;
            String strShoppingProductSharedElementKey = ShoppingProductDetailsNavigationKt.shoppingProductSharedElementKey(shoppingFormat, str3, i);
            ShoppingCardClickLogging shoppingCardClickLogging = new ShoppingCardClickLogging(HatchScreen.PRODUCT_LIST, hatchComponent, ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str2, shoppingFormat, str5, shoppingMerchantRanking, AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i))));
            BRg bRgThen = bRg2.then(bRgRememberShoppingTileImpression);
            int i7 = iA05 >> 9;
            BRg bRgStaggeredEntrance = StaggeredEntranceKt.staggeredEntrance(bRgThen, i, 250L, bfm, (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
            boolean zA1W2 = AnonymousClass002.A1W(bfm, str3, AnonymousClass003.A1P(bfm, str5, str4, AnonymousClass003.A1M(bfm, auraNavigatorA05, abstractC3358CGzA06) | AnonymousClass003.A1F(iA05, 458752, 131072) | AnonymousClass002.A1Q(i5, 1048576)), (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(productItemsSection))) | AnonymousClass005.A1M(iA05);
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(ahd))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA01, zA1W2, z);
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == C78N.A00) {
                objAaT3 = new ProductItemsScreenKt$ProductItemsTile$1$1(auraNavigatorA05, abstractC3358CGzA06, str, str2, str5, str4, productItemsSection, str3, i, ahd, contextA01);
                BBI.A0O(bbi, objAaT3);
            }
            HatchShoppingResultsCardKt.ShoppingResultProductCard(shoppingResultProductUiModel, (G0U) objAaT3, bRgStaggeredEntrance, false, null, 2, false, shoppingCardClickLogging, conversationItemActionContext, strShoppingProductSharedElementKey, shoppingProductCardStyle, bfm, (i7 & 14) | 196608 | (ConversationItemActionContext.$stable << 24), 6, 88);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(productItemsSection, ahd, shoppingMerchantRanking, shoppingResultProductUiModel, i, str, str2, j, bRg2, i2, i3);
        }
    }

    public static final String cardWidgetId(ProductItemsSection productItemsSection, String str) {
        String str2 = productItemsSection.presentationId;
        return str2 == null ? str : str2;
    }

    public static final boolean getShoppingResultPdpEnabled() {
        return AnonymousClass001.A1X(C31u.A00(shoppingResultPdpEnabled$delegate, $$delegatedProperties));
    }

    public static final BRg gridScreenImpression(ProductItemsSection productItemsSection, String str, List<ShoppingResultProduct> list, long j) {
        String str2 = productItemsSection.presentationId;
        if (str2 == null) {
            str2 = str;
        }
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_LIST, HatchComponent.PRODUCT_GRID_SCREEN, str2, ShoppingAnalyticsMetadataKt.shoppingWidgetMetadata(str, ShoppingFormat.GRID, str2, new ShoppingMerchantRanking(list), AnonymousClass006.A10(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(list.size()))), null, 500L, 0.0f, FGI.A0B(j, "product_grid_screen:"), null, null);
    }

    public static final String text(ProductItemsNavText productItemsNavText, BFM bfm, int i) {
        String strA01;
        if (productItemsNavText instanceof ProductItemsNavText.Text) {
            AnonymousClass004.A1A(bfm, -1428219338);
            return ((ProductItemsNavText.Text) productItemsNavText).value;
        }
        if (productItemsNavText instanceof ProductItemsNavText.ProductCount) {
            bfm.AgE(-1428217683);
            strA01 = AnonymousClass007.A0Y(((ProductItemsNavText.ProductCount) productItemsNavText).count, bfm, R.plurals._name_removed__res_0x7f100037);
        } else {
            if (!C7384Etj.areEqual(productItemsNavText, ProductItemsNavText.ResultsTitle.INSTANCE)) {
                throw AnonymousClass005.A0k(bfm, -1428220740);
            }
            bfm.AgE(-1428215383);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e71);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final void ProductItemsWebsiteMenuButton(String str, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-2101977065);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            Context contextA01 = AKO.A01(bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dee);
            boolean zA1S = AnonymousClass005.A1S(bfm, abstractC3358CGzA06, contextA01, auraNavigatorA05) | ((iA0d & 14) == 4);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new ProductItemsScreenKt$ProductItemsWebsiteMenuButton$1$1(abstractC3358CGzA06, contextA01, auraNavigatorA05, str);
                BBI.A0O(bbi, objAaT);
            }
            ShoppingLinkMenuButtonKt.ShoppingLinkMenuButton(strA01, (Function0) objAaT, bRg, bfm, (iA0d << 3) & 896, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137522(str, bRg, i, i2);
        }
    }

    public static final String productItemsCountText(int i, BFM bfm, int i2) {
        return AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100037);
    }

    public static final List<ProductItemsGridItem> toGridItems(List<ProductItemsSection> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ProductItemsSection> it = list.iterator();
        while (it.hasNext()) {
            AHD<ShoppingResultProductUiModel> ahd = it.next().products;
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            Iterator it2 = ahd.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(((ShoppingResultProductUiModel) it2.next()).product);
            }
            AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        ShoppingMerchantRanking shoppingMerchantRanking = new ShoppingMerchantRanking(ahdA07);
        AII aiiA17 = AIM.A17();
        int i = 0;
        int i2 = 0;
        for (ProductItemsSection productItemsSection : list) {
            int i3 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ProductItemsSection productItemsSection2 = productItemsSection;
            String str = productItemsSection2.label;
            if (str != null) {
                aiiA17.add(new ProductItemsGridItem.Header(FGI.A0H("header:", i), str, productItemsSection2.subtitle, AnonymousClass002.A1M(i)));
            }
            for (ShoppingResultProductUiModel shoppingResultProductUiModel : productItemsSection2.products) {
                int i4 = ProductItemsGridItem.Tile.$stable;
                String resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProductUiModel.product);
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(i2);
                aiiA17.add(new ProductItemsGridItem.Tile(C60P.A1M(":", resolvedProductId, sbA0w), productItemsSection2, ahdA07, shoppingMerchantRanking, shoppingResultProductUiModel, i2));
                i2++;
            }
            i = i3;
        }
        return AIM.A18(aiiA17);
    }
}
