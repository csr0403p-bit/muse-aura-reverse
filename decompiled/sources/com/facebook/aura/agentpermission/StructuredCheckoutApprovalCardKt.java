package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.agentpermission.CheckoutReceiptRow;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicy;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class StructuredCheckoutApprovalCardKt {
    public static final C1D3 CheckoutItemImageShape = C1D8.A00(10.0f);
    public static final float CheckoutItemImageSize = 24.0f;

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$CheckoutApprovalHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUri;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApQ apQ, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$headline = apQ;
            this.$faviconUri = str;
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
            StructuredCheckoutApprovalCardKt.CheckoutApprovalHeader(this.$headline, this.$faviconUri, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$CheckoutItemsSummaryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $itemNames;
        public final /* synthetic */ List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> $items;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowCart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108582(List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> list, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$items = list;
            this.$itemNames = str;
            this.$onShowCart = function0;
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
            StructuredCheckoutApprovalCardKt.CheckoutItemsSummaryRow(this.$items, this.$itemNames, this.$onShowCart, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$CheckoutReceiptGroup$2, reason: invalid class name and case insensitive filesystem */
    public final class C108592 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowCart;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ List<CheckoutReceiptRow> $rows;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108592(List<? extends CheckoutReceiptRow> list, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$rows = list;
            this.$totalPromoCaption = str;
            this.$onShowCart = function0;
            this.$onShowSummary = function02;
            this.$onShowDetails = function03;
            this.$onShowTaxes = function04;
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
            StructuredCheckoutApprovalCardKt.CheckoutReceiptGroup(this.$rows, this.$totalPromoCaption, this.$onShowCart, this.$onShowSummary, this.$onShowDetails, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$CheckoutReceiptGroups$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowCart;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ CheckoutApprovalPresentation $presentation;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheckoutApprovalPresentation checkoutApprovalPresentation, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$presentation = checkoutApprovalPresentation;
            this.$totalPromoCaption = str;
            this.$onShowCart = function0;
            this.$onShowSummary = function02;
            this.$onShowDetails = function03;
            this.$onShowTaxes = function04;
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
            StructuredCheckoutApprovalCardKt.CheckoutReceiptGroups(this.$presentation, this.$totalPromoCaption, this.$onShowCart, this.$onShowSummary, this.$onShowDetails, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$CheckoutReceiptGroups$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowCart;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;
        public final /* synthetic */ CheckoutApprovalPresentation $presentation;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheckoutApprovalPresentation checkoutApprovalPresentation, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$presentation = checkoutApprovalPresentation;
            this.$totalPromoCaption = str;
            this.$onShowCart = function0;
            this.$onShowSummary = function02;
            this.$onShowDetails = function03;
            this.$onShowTaxes = function04;
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
            StructuredCheckoutApprovalCardKt.CheckoutReceiptGroups(this.$presentation, this.$totalPromoCaption, this.$onShowCart, this.$onShowSummary, this.$onShowDetails, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C108601 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ CheckoutApprovalPresentation $presentation;
        public final /* synthetic */ String $reviewText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108601(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, ApQ apQ, CheckoutApprovalPresentation checkoutApprovalPresentation, String str) {
            super(3);
            this.$checkout = shopifyCheckoutApproval;
            this.$headline = apQ;
            this.$presentation = checkoutApprovalPresentation;
            this.$reviewText = str;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strLodgingCheckoutTitle = LodgingCheckoutRowsKt.lodgingCheckoutTitle(this.$checkout, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutApproval.$stable);
            StructuredCheckoutApprovalCardKt.CheckoutApprovalHeader(strLodgingCheckoutTitle != null ? AnonymousClass005.A0X(strLodgingCheckoutTitle) : this.$headline, this.$presentation.faviconUri, null, bfm, 0, 4);
            if (this.$presentation.showReviewText) {
                bfm.AgE(-254106434);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$reviewText, null, false, bfm, 0, 6);
            } else {
                bfm.AgE(712670697);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C108612 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CheckoutApprovalPresentation $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108612(CheckoutApprovalPresentation checkoutApprovalPresentation) {
            super(3);
            this.$presentation = checkoutApprovalPresentation;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                CheckoutApprovalLegalTextKt.CheckoutApprovalLegalFooter(this.$presentation.legal, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C108623 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onShowCart;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ G0U<CheckoutLodgingPolicy, Unit> $onShowLodgingPolicy;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ CheckoutApprovalPresentation $presentation;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108623(CheckoutApprovalPresentation checkoutApprovalPresentation, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super CheckoutLodgingPolicy, Unit> g0u) {
            super(3);
            this.$presentation = checkoutApprovalPresentation;
            this.$totalPromoCaption = str;
            this.$onShowCart = function0;
            this.$onShowSummary = function02;
            this.$onShowDetails = function03;
            this.$onShowLodgingPolicy = g0u;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            CheckoutApprovalPresentation checkoutApprovalPresentation = this.$presentation;
            String str = this.$totalPromoCaption;
            Function0<Unit> function0 = this.$onShowCart;
            Function0<Unit> function02 = this.$onShowSummary;
            Function0<Unit> function03 = this.$onShowDetails;
            boolean zA65 = bfm.A65(this.$onShowLodgingPolicy);
            G0U<CheckoutLodgingPolicy, Unit> g0u = this.$onShowLodgingPolicy;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$3$1$1(g0u);
                bfm.Ai0(objAaT);
            }
            StructuredCheckoutApprovalCardKt.CheckoutReceiptGroups(checkoutApprovalPresentation, str, function0, function02, function03, (Function0) objAaT, null, bfm, CheckoutApprovalPresentation.$stable, 64);
            CheckoutLodgingCancellation checkoutLodgingCancellation = this.$presentation.cancellation;
            if (checkoutLodgingCancellation == null) {
                bfm.AgE(-1923601130);
            } else {
                bfm.AgE(-1923601129);
                G0U<CheckoutLodgingPolicy, Unit> g0u2 = this.$onShowLodgingPolicy;
                boolean zA652 = bfm.A65(g0u2);
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$3$2$1$1(g0u2);
                    bfm.Ai0(objAaT2);
                }
                LodgingCheckoutRowsKt.LodgingCheckoutCancellation(checkoutLodgingCancellation, (Function0) objAaT2, null, bfm, CheckoutLodgingCancellation.$stable, 4);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowCart;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ G0U<CheckoutLodgingPolicy, Unit> $onShowLodgingPolicy;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ String $recordIconUrl;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ RichApprovalSurface $surface;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, ApQ apQ, String str, String str2, String str3, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super CheckoutLodgingPolicy, Unit> g0u, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$checkout = shopifyCheckoutApproval;
            this.$headline = apQ;
            this.$reviewText = str;
            this.$totalPromoCaption = str2;
            this.$recordIconUrl = str3;
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
            this.$onShowCart = function0;
            this.$onShowSummary = function02;
            this.$onShowDetails = function03;
            this.$onShowLodgingPolicy = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            StructuredCheckoutApprovalCardKt.StructuredCheckoutApprovalCard(this.$checkout, this.$headline, this.$reviewText, this.$totalPromoCaption, this.$recordIconUrl, this.$decisionOptions, this.$surface, this.$onShowCart, this.$onShowSummary, this.$onShowDetails, this.$onShowLodgingPolicy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String deliveryTitle(com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutDelivery r3, X.BFM r4, int r5) {
        /*
            r2 = 0
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.label
            if (r0 == 0) goto L2f
            java.lang.String r1 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        Lb:
            java.lang.String r0 = r3.estimatedDelivery
            if (r0 == 0) goto L13
            java.lang.String r2 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        L13:
            if (r1 == 0) goto L31
            if (r2 == 0) goto L28
            r0 = -1890796544(0xffffffff8f4cbc00, float:-1.0094184E-29)
            r4.AgE(r0)
            r0 = 2131886395(0x7f12013b, float:1.9407368E38)
            java.lang.String r1 = X.AnonymousClass006.A0w(r4, r1, r2, r0)
        L24:
            X.AnonymousClass001.A1D(r4)
            return r1
        L28:
            r0 = -1890791216(0xffffffff8f4cd0d0, float:-1.0098192E-29)
            r4.AgE(r0)
            goto L24
        L2f:
            r1 = r2
            goto Lb
        L31:
            r0 = -1890790583(0xffffffff8f4cd349, float:-1.00986686E-29)
            r4.AgE(r0)
            r0 = 2131886394(0x7f12013a, float:1.9407366E38)
            java.lang.String r1 = X.AbstractC2271BQs.A01(r4, r0)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt.deliveryTitle(com.facebook.aura.gateway.HatchAgentPermissionsRepository$ShopifyCheckoutDelivery, X.BFM, int):java.lang.String");
    }

    public static final String shippingAddressText(HatchAgentPermissionsRepository.ShopifyCheckoutShippingAddress shopifyCheckoutShippingAddress) {
        if (shopifyCheckoutShippingAddress == null) {
            return null;
        }
        String strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", BFI.A0F(new String[]{C3cI.A0a(shopifyCheckoutShippingAddress.city), C3cI.A0a(shopifyCheckoutShippingAddress.state), C3cI.A0a(shopifyCheckoutShippingAddress.postalCode)}), null));
        String strA0a = C3cI.A0a(shopifyCheckoutShippingAddress.street1);
        String strA0a2 = C3cI.A0a(shopifyCheckoutShippingAddress.street2);
        String str = shopifyCheckoutShippingAddress.country;
        return CheckoutRowPrimitivesKt.trimToNonEmpty(AbstractC0878AGe.A0L(", ", "", "", BFI.A0F(new String[]{strA0a, strA0a2, strTrimToNonEmpty, str != null ? CheckoutRowPrimitivesKt.trimToNonEmpty(str) : null}), null));
    }

    public static final void CheckoutApprovalHeader(ApQ apQ, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1671525995);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = StructuredCheckoutApprovalCardKt$CheckoutApprovalHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822ArmA0B, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 32752);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            CheckoutApprovalSharedKt.CheckoutMerchantFavicon(str, null, bfm, (iA0d >> 3) & 14, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(apQ, str, bRg2, i, i2);
        }
    }

    /* renamed from: CheckoutItemRow-3IgeMak, reason: not valid java name */
    public static final void m193CheckoutItemRow3IgeMak(HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem, long j, BRg bRg, BFM bfm, int i, int i2) {
        String strA0l;
        boolean z;
        String strA01;
        String strA0t;
        String strTrimToNonEmpty;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(shopifyCheckoutItem, 0);
        bfm.AgG(-1467686900);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shopifyCheckoutItem, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0R, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            String str = shopifyCheckoutItem.imageUrl;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
                strA0l = null;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, CheckoutRowPrimitivesKt.CheckoutLeadingSlotSize);
            C1D3 c1d3 = CheckoutItemImageShape;
            BRg bRgA012 = C1b8.A01(C11U.A03(bRgA07, c1d3), j);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (strA0l != null) {
                bfm.AgE(738362865);
                z = true;
                AuraImageKt.m2573AuraImageXRP3Ue8(strA0l, C11U.A03(C10G.A07(bs0, CheckoutItemImageSize), c1d3), B18.A00, null, null, false, null, 0L, true, false, false, null, null, null, null, bfm, 100666800, 0, 32496);
            } else {
                z = true;
                bfm.AgE(738646453);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A0W(bfm).secondaryText, null, bfm, AnonymousClass001.A04(), 33);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
            C01N.A09(bfm, bs0, f2);
            String str2 = shopifyCheckoutItem.name;
            if (str2 == null || (strA01 = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null) {
                bfm.AgE(371812130);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12013c);
            } else {
                bfm.AgE(371810673);
            }
            BBI.A0R(bbi, false);
            String str3 = shopifyCheckoutItem.quantity;
            if (str3 == null || (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str3)) == null) {
                bfm.AgE(-1358601392);
                BBI.A0R(bbi, false);
                strA0t = null;
            } else {
                bfm.AgE(-1358601391);
                strA0t = AnonymousClass001.A0t(bfm, strTrimToNonEmpty, R.string._name_removed__res_0x7f12013d);
                BBI.A0R(bbi, false);
            }
            CheckoutRowPrimitivesKt.CheckoutRowText(strA01, strA0t, AnonymousClass001.A0O(c90m, bs0, z), 0, bfm, 0, 8);
            BBI.A0R(bbi, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new StructuredCheckoutApprovalCardKt$CheckoutItemRow$2(shopifyCheckoutItem, j, bRg2, i, i2);
        }
    }

    public static final void CheckoutItemsSummaryRow(List<HatchAgentPermissionsRepository.ShopifyCheckoutItem> list, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1748356086);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120144), function0, true);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, CheckoutRowPrimitivesKt.CheckoutLeadingSlotSize);
            int i4 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(bRgA07, aVyA00, auraIconSize, null, jA06, null, bfm, (i4 << 3) | 3456, 32);
            C01N.A09(bfm, bs0, f2);
            CheckoutRowPrimitivesKt.CheckoutRowText(C3cJ.A0I(bfm, list, R.plurals._name_removed__res_0x7f10000a, list.size()), str, AnonymousClass001.A0O(c90m, bs0, true), 1, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072, 0);
            C01N.A09(bfm, bs0, f2);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, (i4 << 3) | 3456, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108582(list, str, function0, bRg2, i, i2);
        }
    }

    public static final void CheckoutReceiptGroup(List<? extends CheckoutReceiptRow> list, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(922229547);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function03);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function04);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA03 = C11U.A03(bRg2.then(c1062ATq), CheckoutRowPrimitivesKt.CheckoutSectionShape);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).secondaryButtonBackground);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA02);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, -1522584788);
            while (itA0w.hasNext()) {
                CheckoutReceiptRow checkoutReceiptRow = (CheckoutReceiptRow) itA0w.next();
                if (checkoutReceiptRow instanceof CheckoutReceiptRow.Item) {
                    bfm.AgE(1380010296);
                    m193CheckoutItemRow3IgeMak(((CheckoutReceiptRow.Item) checkoutReceiptRow).item, auraTheme.getColors(bfm, 6).card, null, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutItem.$stable, 4);
                } else if (checkoutReceiptRow instanceof CheckoutReceiptRow.ItemsSummary) {
                    bfm.AgE(1380013729);
                    CheckoutReceiptRow.ItemsSummary itemsSummary = (CheckoutReceiptRow.ItemsSummary) checkoutReceiptRow;
                    CheckoutItemsSummaryRow(itemsSummary.items, itemsSummary.names, function0, null, bfm, iA05 & 896, 8);
                } else {
                    if (checkoutReceiptRow instanceof CheckoutReceiptRow.LodgingPrice) {
                        bfm.AgE(1380017049);
                        LodgingCheckoutRowsKt.LodgingCheckoutPriceLines(((CheckoutReceiptRow.LodgingPrice) checkoutReceiptRow).lines, function04, null, bfm, (iA05 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                    } else if (checkoutReceiptRow instanceof CheckoutReceiptRow.Delivery) {
                        bfm.AgE(1380020498);
                        CheckoutReceiptRow.Delivery delivery = (CheckoutReceiptRow.Delivery) checkoutReceiptRow;
                        CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.truck_outline_24, deliveryTitle(delivery.delivery, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutDelivery.$stable), shippingAddressText(delivery.address), null, null, null, bfm, 0, 56);
                    } else if (checkoutReceiptRow instanceof CheckoutReceiptRow.Contact) {
                        bfm.AgE(1380027650);
                        CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.shallow_v_rectangle_outline_24, contactTitle(((CheckoutReceiptRow.Contact) checkoutReceiptRow).contact, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutContact.$stable), null, null, null, null, bfm, 384, 56);
                    } else if (checkoutReceiptRow instanceof CheckoutReceiptRow.Text) {
                        bfm.AgE(1380033727);
                        CheckoutReceiptRow.Text text = (CheckoutReceiptRow.Text) checkoutReceiptRow;
                        LodgingCheckoutRowsKt.CheckoutFactRow(text.title, AbstractC0885AGm.A0z(text.subtitle), null, bfm, 0, 4);
                    } else {
                        Function0<Unit> function06 = null;
                        if (checkoutReceiptRow instanceof CheckoutReceiptRow.Payment) {
                            bfm.AgE(1380037712);
                            CheckoutPaymentPresentation checkoutPaymentPresentation = ((CheckoutReceiptRow.Payment) checkoutReceiptRow).data;
                            CheckoutApprovalSharedKt.CheckoutPaymentRow(checkoutPaymentPresentation.cardBrand, checkoutPaymentPresentation.cardLast4, checkoutPaymentPresentation.label, checkoutPaymentPresentation.method, C3U4.A0B(C3cI.A06(c1062ATq, null, function03), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall), false, bfm, 0, 32);
                        } else if (checkoutReceiptRow instanceof CheckoutReceiptRow.Amount) {
                            bfm.AgE(1380056891);
                            CheckoutReceiptRow.Amount amount = (CheckoutReceiptRow.Amount) checkoutReceiptRow;
                            CheckoutAmountPresentation checkoutAmountPresentation = amount.data;
                            if (amount.summaryAvailable) {
                                function06 = function02;
                            }
                            CheckoutAmountRowKt.CheckoutAmountRow(checkoutAmountPresentation, null, function06, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120145), amount.allowsPromo ? CheckoutApprovalSharedKt.gatedTotalPromoCaption(str) : null, bfm, CheckoutAmountPresentation.$stable, 2);
                            BBI.A0R(bbi, false);
                        } else {
                            if (!C7384Etj.areEqual(checkoutReceiptRow, CheckoutReceiptRow.Divider.INSTANCE)) {
                                throw AnonymousClass003.A0k(bfm, bbi, 1380010614);
                            }
                            C3cJ.A0Z(bfm, 1380070095);
                        }
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108592(list, str, function0, function02, function03, function04, bRg2, i, i2);
        }
    }

    public static final void CheckoutReceiptGroups(CheckoutApprovalPresentation checkoutApprovalPresentation, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(-457256781);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutApprovalPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function03);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function04);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (checkoutApprovalPresentation.receiptGroups.size() == 1) {
                bfm.AgE(1499813646);
                CheckoutReceiptGroup((List) AbstractC0878AGe.A0J(checkoutApprovalPresentation.receiptGroups), str, function0, function02, function03, function04, bRg2, bfm, iA05 & 4194288, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(checkoutApprovalPresentation, str, function0, function02, function03, function04, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1500029871);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, checkoutApprovalPresentation.kind == CheckoutPresentationKind.LODGING ? AuraDimensKt.SpacingSmall : AuraDimensKt.SpacingMedium, 0);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            bfm.AgE(-514508762);
            Iterator<List<CheckoutReceiptRow>> it = checkoutApprovalPresentation.receiptGroups.iterator();
            while (it.hasNext()) {
                CheckoutReceiptGroup(it.next(), str, function0, function02, function03, function04, null, bfm, iA05 & 524272, 64);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(checkoutApprovalPresentation, str, function0, function02, function03, function04, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final String contactTitle(HatchAgentPermissionsRepository.ShopifyCheckoutContact shopifyCheckoutContact, BFM bfm, int i) {
        String strA01;
        String str;
        String str2;
        if (shopifyCheckoutContact == null || (((str = shopifyCheckoutContact.email) == null || (strA01 = CheckoutRowPrimitivesKt.trimToNonEmpty(str)) == null) && ((str2 = shopifyCheckoutContact.phoneNumber) == null || (strA01 = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null))) {
            bfm.AgE(-18188144);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120139);
        } else {
            bfm.AgE(-18191058);
        }
        AnonymousClass002.A19(bfm);
        return strA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StructuredCheckoutApprovalCard(com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutApproval r23, X.ApQ r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List<com.facebook.aura.gateway.AgentPermissionDecisionOption> r28, com.facebook.aura.agentpermission.RichApprovalSurface r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.G0U<? super com.facebook.aura.navigation.key.CheckoutLodgingPolicy, kotlin.Unit> r33, X.BRg r34, X.BFM r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.StructuredCheckoutApprovalCardKt.StructuredCheckoutApprovalCard(com.facebook.aura.gateway.HatchAgentPermissionsRepository$ShopifyCheckoutApproval, X.ApQ, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.facebook.aura.agentpermission.RichApprovalSurface, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }
}
