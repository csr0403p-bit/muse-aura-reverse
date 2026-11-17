package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
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
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0A8;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1822Arm;
import X.C1824Aro;
import X.C1AC;
import X.C1D8;
import X.C1DG;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C31u;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7462Ewq;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.MC;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchUrlHostKt;
import com.facebook.aura.payments.cardvalidation.HatchCardBrandAssets;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
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
public abstract class CheckoutApprovalSharedKt {
    public static final float CheckoutPaymentLeadingSlotSize = 32.0f;
    public static final String SHOP_PAY_PAYMENT_METHOD = "shop_pay";
    public static final String STRIPE_LINK_PAYMENT_METHOD = "stripe_link";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(CheckoutApprovalSharedKt.class, "showCheckoutBetaLabel", "getShowCheckoutBetaLabel()Z", 1), new C7462Ewq(CheckoutApprovalSharedKt.class, "isCheckoutDiscountLineEnabled", "isCheckoutDiscountLineEnabled()Z", 1)};
    public static final C31u showCheckoutBetaLabel$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.show_checkout_beta_label);
    public static final C31u isCheckoutDiscountLineEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.muse_checkout_promos.checkout_discount_line_enabled_android);

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutActions$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$options = list;
            this.$enabled = z;
            this.$onDecision = g0u;
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
            CheckoutApprovalSharedKt.CheckoutActions(this.$options, this.$enabled, this.$onDecision, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutActions$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$options = list;
            this.$enabled = z;
            this.$onDecision = g0u;
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
            CheckoutApprovalSharedKt.CheckoutActions(this.$options, this.$enabled, this.$onDecision, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutFaviconHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C107941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $faviconUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107941(String str) {
            super(2);
            this.$faviconUri = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                CheckoutApprovalSharedKt.CheckoutMerchantFavicon(this.$faviconUri, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutFaviconHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUri;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, ApQ apQ, BRg bRg, int i, int i2) {
            super(2);
            this.$faviconUri = str;
            this.$headline = apQ;
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
            CheckoutApprovalSharedKt.CheckoutFaviconHeader(this.$faviconUri, this.$headline, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutHeaderRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107952(ApQ apQ, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$headline = apQ;
            this.$modifier = bRg;
            this.$leadingIcon = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalSharedKt.CheckoutHeaderRow(this.$headline, this.$modifier, this.$leadingIcon, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutMaxTotal$1, reason: invalid class name and case insensitive filesystem */
    public final class C107961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $amount;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onInfoClick;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107961(String str, BRg bRg, Function0<Unit> function0, String str2, int i, int i2) {
            super(2);
            this.$amount = str;
            this.$modifier = bRg;
            this.$onInfoClick = function0;
            this.$totalPromoCaption = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalSharedKt.CheckoutMaxTotal(this.$amount, this.$modifier, this.$onInfoClick, this.$totalPromoCaption, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutMaxTotal$3, reason: invalid class name and case insensitive filesystem */
    public final class C107973 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $amount;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onInfoClick;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107973(String str, BRg bRg, Function0<Unit> function0, String str2, int i, int i2) {
            super(2);
            this.$amount = str;
            this.$modifier = bRg;
            this.$onInfoClick = function0;
            this.$totalPromoCaption = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalSharedKt.CheckoutMaxTotal(this.$amount, this.$modifier, this.$onInfoClick, this.$totalPromoCaption, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutMerchantFavicon$2, reason: invalid class name and case insensitive filesystem */
    public final class C107982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUri;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107982(String str, BRg bRg, int i, int i2) {
            super(2);
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
            CheckoutApprovalSharedKt.CheckoutMerchantFavicon(this.$faviconUri, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutPaymentRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cardBrand;
        public final /* synthetic */ String $cardLast4;
        public final /* synthetic */ boolean $emphasizeProvider;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $paymentMethod;
        public final /* synthetic */ String $paymentMethodLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107992(String str, String str2, String str3, String str4, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$cardBrand = str;
            this.$cardLast4 = str2;
            this.$paymentMethodLabel = str3;
            this.$paymentMethod = str4;
            this.$modifier = bRg;
            this.$emphasizeProvider = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalSharedKt.CheckoutPaymentRow(this.$cardBrand, this.$cardLast4, this.$paymentMethodLabel, this.$paymentMethod, this.$modifier, this.$emphasizeProvider, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$CheckoutTotalPromoCaption$1, reason: invalid class name and case insensitive filesystem */
    public final class C108001 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108001(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            CheckoutApprovalSharedKt.CheckoutTotalPromoCaption(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSharedKt$PaymentCardBrandLogo$1, reason: invalid class name and case insensitive filesystem */
    public final class C108011 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cardBrand;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108011(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$cardBrand = str;
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
            CheckoutApprovalSharedKt.PaymentCardBrandLogo(this.$cardBrand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutFaviconHeader(String str, ApQ apQ, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(apQ, 1);
        bfm.AgG(-1069781696);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, apQ);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d >> 3;
            CheckoutHeaderRow(apQ, bRg2, B1V.A00(bfm, new C107941(str), -1747679430), bfm, (i4 & 14) | 384 | (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, apQ, bRg2, i, i2);
        }
    }

    public static final String checkoutApprovalTitleSentenceForMerchant(String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        String strAgentPermissionAgentName = AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0);
        if (str != null) {
            bfm.AgE(-1456015370);
            i2 = R.string._name_removed__res_0x7f120096;
            objArr = new Object[]{strAgentPermissionAgentName, str};
        } else {
            bfm.AgE(-1456012524);
            i2 = R.string._name_removed__res_0x7f120097;
            objArr = new Object[]{strAgentPermissionAgentName};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }

    public static final ApQ checkoutApprovalTitleWithLabel(String str, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(str, 0);
        if (getShowCheckoutBetaLabel()) {
            bfm.AgE(1736344776);
            i2 = R.string._name_removed__res_0x7f120083;
        } else {
            bfm.AgE(1736432909);
            i2 = R.string._name_removed__res_0x7f12008a;
        }
        String strA0e = AnonymousClass003.A0e(bfm, i2);
        String strA0w = AnonymousClass006.A0w(bfm, strA0e, str, R.string._name_removed__res_0x7f120098);
        C1824Aro c1824Aro = AuraTheme.INSTANCE.getTypography(bfm, 6).subheadlineEmphasized.A02;
        int iA0B = C7BY.A0B(strA0w, strA0e, 0, false);
        C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0w);
        if (iA0B >= 0) {
            c1731ApSA0X.A0A(c1824Aro, iA0B, strA0e.length() + iA0B);
        }
        return c1731ApSA0X.A04();
    }

    public static final String checkoutFormattedAmount(String str, String str2) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            return null;
        }
        return strA0l;
    }

    public static final String checkoutPaymentMethodLabel(String str, String str2, BFM bfm, int i) {
        String strA0l;
        String strA0l2;
        int i2;
        Object[] objArr;
        String strA02 = null;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            strA0l = null;
        }
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || C7BY.A0j(strA0l2)) {
            strA0l2 = null;
        }
        if (strA0l != null) {
            if (strA0l2 == null) {
                AnonymousClass003.A0l(bfm, -1044837405);
                return strA0l;
            }
            bfm.AgE(-1044840563);
            i2 = R.string._name_removed__res_0x7f120084;
            objArr = new Object[]{strA0l, strA0l2};
        } else {
            if (strA0l2 == null) {
                bfm.AgE(1969888895);
                AnonymousClass001.A1D(bfm);
                return strA02;
            }
            bfm.AgE(-1044836475);
            i2 = R.string._name_removed__res_0x7f120085;
            objArr = new Object[]{strA0l2};
        }
        strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }

    public static final String gatedTotalPromoCaption(String str) {
        if (str == null || !isCheckoutDiscountLineEnabled()) {
            return null;
        }
        return str;
    }

    public static final void CheckoutActions(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        AuraLabelButtonStyle auraLabelButtonStyleSecondary;
        BRg bRgA0Q = bRg;
        int iA0C = AnonymousClass002.A0C(list, g0u, 0);
        bfm.AgG(742923235);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (list.size() != iA0C) {
                bfm.AgE(459835436);
                AgentPermissionPendingCardKt.m169AgentPermissionDecisionButtonsWHejsw(list, z, g0u, bRgA0Q, 0.0f, null, bfm, iA05 & 8190, 48);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(list, z, g0u, bRgA0Q, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 460007455);
            Object objA0F = AbstractC0878AGe.A0F(list);
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            bfm.AgE(-224046221);
            Iterator it = AbstractC0878AGe.A0Q(objA0F, AbstractC0878AGe.A0Z(list, 1)).iterator();
            while (it.hasNext()) {
                AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) it.next();
                String str = agentPermissionDecisionOption.labelText;
                if (agentPermissionDecisionOption.equals(objA0F)) {
                    bfm.AgE(311945246);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                } else {
                    bfm.AgE(311946720);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                }
                BBI.A0R(bbiA0M, false);
                AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
                boolean zA1T = AnonymousClass001.A1T(bfm, agentPermissionDecisionOption, AnonymousClass003.A1D(iA05));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new CheckoutApprovalSharedKt$CheckoutActions$2$1$1$1(g0u, agentPermissionDecisionOption);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = CheckoutApprovalSharedKt$CheckoutActions$2$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0O, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, z, false, false, null, null, function02, null, null, null, null, null, null, (Function0) objAaT2, null, false, iA0C, false, 0, bfm, ((iA05 << 24) & 1879048192) | 196608, 0, 24624, 115326405);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA0M, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(list, z, g0u, bRgA0Q, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void CheckoutHeaderRow(ApQ apQ, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(apQ, 0, g0v);
        bfm.AgG(-104939538);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
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
            AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutApprovalSharedKt$CheckoutHeaderRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822ArmA0B, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 32752);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107952(apQ, bRg2, g0v, i, i2);
        }
    }

    public static final void CheckoutMaxTotal(String str, BRg bRg, Function0<Unit> function0, String str2, BFM bfm, int i, int i2) {
        String str3;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c107973;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        bfm.AgG(1208733977);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            str3 = i5 == 0 ? str2 : null;
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c107973 = new C107961(str, bRg2, function02, str3, i, i2);
                    bBbAAc.A06 = c107973;
                }
                return;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall);
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12008c);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, c90m.AiP(bs0, 1.0f, false), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (function02 != null) {
                bfm.AgE(-4954526);
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.circle_info_wght400_outline_20, 0), AuraIconButtonSizeV2.MEDIUM, AuraIconButtonStyle.SECONDARY, AuraIconButtonBackground.NO_BACKGROUND, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120086), function02, null, false, new B6A(C3cH.A05(bfm, auraTheme)), new C1DG(20.0f), null, null, bfm, AnonymousClass001.A0C(iA0d << 15, (AVy.$stable << 3) | 28032), 48, 13089);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-4392341);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (str3 != null) {
                bfm.AgE(1844890730);
                CheckoutTotalPromoCaption(str3, null, bfm, (iA0d >> 9) & 14, 2);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1844957039);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            str3 = str2;
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107973 = new C107973(str, bRg2, function02, str3, i, i2);
            bBbAAc.A06 = c107973;
        }
    }

    public static final void CheckoutMerchantFavicon(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-663672824);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            BRg bRgA01 = C11U.A01(C10G.A07(bRg2, 36.0f), 8.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA012 = C1b8.A01(bRgA01, auraTheme.getColors(bfm, 6).background);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA013, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (str != null) {
                AuraImageKt.m2573AuraImageXRP3Ue8(str, c0z7.AQJ(C3cG.A09(bfm, -1168806950)), B18.A00, null, null, false, null, 0L, true, false, false, null, null, null, null, bfm, (iA0d & 14) | 100666752, 0, 32496);
            } else {
                bfm.AgE(-1168576620);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.globe_wght400_outline_24, 0), AuraIconSize.SMALL, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107982(str, bRg2, i, i2);
        }
    }

    public static final void CheckoutPaymentRow(String str, String str2, String str3, String str4, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        String strCheckoutPaymentProviderLabel;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        bfm.AgG(-1176077575);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1K);
            iA0d |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            String strCheckoutPaymentMethodLabel = checkoutPaymentMethodLabel(str3, str2, bfm, ((iA0d >> 6) & 14) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            if (strCheckoutPaymentMethodLabel == null) {
                bfm.AgE(-634140802);
                strCheckoutPaymentMethodLabel = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12008f);
            } else {
                bfm.AgE(-634143003);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            float f = CheckoutPaymentLeadingSlotSize;
            BRg bRgA07 = C10G.A07(bs0, f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (zA1K) {
                bfm.AgE(-437328375);
                C1SA.A00(bfm, null, C10G.A07(bs0, f), null, BOf.A00(bfm, checkoutPaymentProviderIconRes(str4), 0), B18.A02, null, 0.0f, AVy.$stable | 25008, 104);
            } else {
                bfm.AgE(-14098514);
                PaymentCardBrandLogo(str, null, bfm, iA0d & 14, 2);
            }
            boolean zA1V = AnonymousClass003.A1V(bbiA07);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, zA1V);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbiA07);
            AKQ akqA043 = BBI.A04(bbiA07);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (zA1K) {
                bfm.AgE(481481726);
                strCheckoutPaymentProviderLabel = checkoutPaymentProviderLabel(str4, bfm, (iA0d >> 9) & 14);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(481483261);
                BBI.A0R(bbiA07, false);
                strCheckoutPaymentProviderLabel = strCheckoutPaymentMethodLabel;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strCheckoutPaymentProviderLabel, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (zA1K) {
                AuraTextKt.m2639AuraTextUY9GdpU(strCheckoutPaymentMethodLabel, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 2041309039).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(481497126);
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D3 = AnonymousClass001.A0D(bbiA07);
                AKQ akqA044 = BBI.A04(bbiA07);
                BRg bRgA014 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbiA07, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0vA0u);
                C1SA.A00(bfm, null, C11U.A03(C10G.A07(bs0, 12.0f), C1D8.A02(33)), null, BOf.A00(bfm, checkoutPaymentProviderIconRes(str4), 0), B18.A02, null, 0.0f, AVy.$stable | 24624, 104);
                C01N.A09(bfm, bs0, AuraDimensKt.SpacingMicro);
                AuraTextKt.m2639AuraTextUY9GdpU(checkoutPaymentProviderLabel(str4, bfm, (iA0d >> 9) & 14), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbiA07, zA1V);
                BBI.A0R(bbiA07, false);
            }
            BBI.A0R(bbiA07, zA1V);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbiA07, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107992(str, str2, str3, str4, bRg2, zA1K, i, i2);
        }
    }

    public static final void CheckoutTotalPromoCaption(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-954297257);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108001(str, bRg2, i, i2);
        }
    }

    public static final void PaymentCardBrandLogo(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1646262566);
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
            Integer numForAssociationName = HatchCardBrandAssets.INSTANCE.forAssociationName(str);
            if (numForAssociationName != null) {
                bfm.AgE(423600414);
                C1SA.A00(bfm, null, C10G.A04(C10G.A08(bRg2, 32.0f), 20.0f), null, BOf.A00(bfm, numForAssociationName.intValue(), 0), B18.A02, null, 0.0f, AVy.$stable | 24624, 104);
            } else {
                bfm.AgE(423813725);
                AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.credit_card_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A0W(bfm).primaryText, null, bfm, ((iA0d >> 3) & 14) | 3456 | (AVy.$stable << 3), 32);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108011(str, bRg2, i, i2);
        }
    }

    public static final Integer cardBrandLogoRes(String str) {
        return HatchCardBrandAssets.INSTANCE.forAssociationName(str);
    }

    public static final boolean getShowCheckoutBetaLabel() {
        return AnonymousClass001.A1X(C31u.A00(showCheckoutBetaLabel$delegate, $$delegatedProperties));
    }

    public static final boolean isCheckoutDiscountLineEnabled() {
        return AnonymousClass001.A1X(isCheckoutDiscountLineEnabled$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final boolean isShopPayPaymentMethod(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("shop_pay");
    }

    public static final String checkoutApprovalTitleSentence(String str, BFM bfm, int i) {
        return checkoutApprovalTitleSentenceForMerchant(HatchUrlHostKt.toDisplayHost(str), bfm, 0);
    }

    public static final String checkoutFaviconUri(String str, String str2) {
        Uri uriBuild;
        String host = HatchUrlHostKt.toHost(str);
        if ((host == null && (host = HatchUrlHostKt.toHost(str2)) == null) || (uriBuild = new Uri.Builder().scheme("https").authority(host).appendPath("favicon.ico").build()) == null) {
            return null;
        }
        return uriBuild.toString();
    }

    public static final ApQ checkoutHeadline(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, BFM bfm, int i) {
        AnonymousClass003.A0u(agentPermissionApproval, str);
        String str2 = agentPermissionApproval.cardTitle;
        if (str2 != null && !C7BY.A0j(str2)) {
            AnonymousClass004.A1A(bfm, -1326500282);
            return AnonymousClass005.A0X(str);
        }
        bfm.AgE(-1326501867);
        ApQ apQCheckoutApprovalTitleWithLabel = checkoutApprovalTitleWithLabel(str, bfm, (i >> 3) & 14);
        AnonymousClass002.A19(bfm);
        return apQCheckoutApprovalTitleWithLabel;
    }

    public static final int checkoutPaymentProviderIconRes(String str) {
        return isShopPayPaymentMethod(str) ? R.drawable.hatch_connector_logos_connectorshoppay : R.drawable.hatch_connector_logos_connectorstripe;
    }

    public static final String checkoutPaymentProviderLabel(String str, BFM bfm, int i) {
        boolean zIsShopPayPaymentMethod = isShopPayPaymentMethod(str);
        int i2 = R.string._name_removed__res_0x7f12008e;
        if (zIsShopPayPaymentMethod) {
            i2 = R.string._name_removed__res_0x7f120156;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }
}
