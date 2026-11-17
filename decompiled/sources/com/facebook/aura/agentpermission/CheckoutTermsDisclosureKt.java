package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C0881AGi;
import X.C0jP;
import X.C1822Arm;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.payments.intf.PaymentTerms;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class CheckoutTermsDisclosureKt {
    public static final String LINK_TERMS_URL = "https://link.com/terms";
    public static final String STRIPE_TERMS_URL = "https://stripe.com/legal/consumer";
    public static final String TAG = "CheckoutTermsDisclosure";

    /* renamed from: com.facebook.aura.agentpermission.CheckoutTermsDisclosureKt$CheckoutTermsDisclosure$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Boolean $networkTokenEligible;
        public final /* synthetic */ Function0<Unit> $onLinkClick;
        public final /* synthetic */ String $paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Boolean bool, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$networkTokenEligible = bool;
            this.$paymentMethod = str;
            this.$onLinkClick = function0;
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
            CheckoutTermsDisclosureKt.CheckoutTermsDisclosure(this.$networkTokenEligible, this.$paymentMethod, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.BRg, com.facebook.aura.payments.intf.PaymentTerms] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.ApY, X.G0U] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.ArN, X.ArU] */
    /* JADX WARN: Type inference failed for: r30v0, types: [X.BG3, X.BO6] */
    public static final void CheckoutTermsDisclosure(Boolean bool, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean zA1P;
        String str2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(1054179378);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bool) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
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
            C0jP c0jP = (C0jP) bfm.A6v(Am0.A0G);
            long jA0D = C06G.A0D(bfm);
            if (AnonymousClass002.A1b(bool, true)) {
                bfm.AgE(257312449);
                bfm.AgE(257312448);
                BBI bbi = (BBI) bfm;
                zA1P = false;
                BBI.A0R(bbi, false);
                str2 = 0;
                BBI.A0R(bbi, false);
            } else {
                zA1P = AnonymousClass004.A1P(bfm, 257332939);
                str2 = 0;
            }
            int i4 = iA0d & 126;
            int i5 = PaymentTerms.$stable;
            ApQ apQM190checkoutTermsTextqFjXxE8 = m190checkoutTermsTextqFjXxE8(bool, str, str2, checkoutTermsLinks(bool, str, str2, bfm, i4 | (i5 << 6)), jA0D, bfm, i4 | (i5 << 6));
            ?? r28 = str2;
            ?? r29 = str2;
            ?? r30 = str2;
            C1822Arm c1822ArmA00 = C1822Arm.A00(str2, C06G.A0S(bfm), str2, str2, r28, r29, r30, str2, str2, str2, 3, zA1P ? 1 : 0, zA1P ? 1 : 0, 16744447, 0L, 0L, 0L, 0L);
            long jA08 = C06G.A08(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1V = AnonymousClass002.A1V(bfm, c0jP, bfm.A65(apQM190checkoutTermsTextqFjXxE8), AnonymousClass004.A1K(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new CheckoutTermsDisclosureKt$CheckoutTermsDisclosure$1$1(apQM190checkoutTermsTextqFjXxE8, function0, c0jP);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQM190checkoutTermsTextqFjXxE8, bRgA0R, (G0U) objAaT, str2, str2, str2, zA1P, jA08, c1822ArmA00, str2, str2, str2, 0L, zA1P, zA1P ? 1 : 0, zA1P ? 1 : 0, zA1P ? 1 : 0, r28, r29, r30, bfm, zA1P ? 1 : 0, zA1P ? 1 : 0, 1048184);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bool, str, function0, bRg2, i, i2);
        }
    }

    public static final List<LegalLink> checkoutTermsLinks(Boolean bool, String str, PaymentTerms paymentTerms, BFM bfm, int i) {
        if (CheckoutApprovalSharedKt.isShopPayPaymentMethod(str)) {
            AnonymousClass004.A1A(bfm, 2089304761);
        } else {
            if (!AnonymousClass001.A0i().equals(bool)) {
                bfm.AgE(2089487847);
                List<LegalLink> listAsList = Arrays.asList(new LegalLink(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120093), LINK_TERMS_URL), new LegalLink(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120095), STRIPE_TERMS_URL));
                AnonymousClass001.A1D(bfm);
                return listAsList;
            }
            AnonymousClass004.A1A(bfm, 2089371659);
            if (paymentTerms != null) {
                return Collections.singletonList(new LegalLink(paymentTerms.linkLabel, paymentTerms.linkUrl));
            }
        }
        return C0881AGi.A00;
    }

    /* renamed from: checkoutTermsText-qFjXxE8, reason: not valid java name */
    public static final ApQ m190checkoutTermsTextqFjXxE8(Boolean bool, String str, PaymentTerms paymentTerms, List<LegalLink> list, long j, BFM bfm, int i) {
        String strA0w;
        if (CheckoutApprovalSharedKt.isShopPayPaymentMethod(str)) {
            bfm.AgE(-462274534);
            strA0w = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12009a);
        } else if (AnonymousClass002.A1b(bool, true)) {
            bfm.AgE(-462137514);
            if (paymentTerms == null || (strA0w = paymentTerms.text) == null) {
                bfm.AgE(1924755670);
                strA0w = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12009a);
            } else {
                bfm.AgE(1924754988);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.AgE(-462029975);
            strA0w = AnonymousClass006.A0w(bfm, list.get(0).label, list.get(1).label, R.string._name_removed__res_0x7f120094);
        }
        AnonymousClass001.A1D(bfm);
        return CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(strA0w, list, j, bfm, (i >> 6) & 1008);
    }
}
