package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C3cI;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CheckoutLegalPresentation;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalLegalTextKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalLegalTextKt$CheckoutApprovalLegalFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutLegalPresentation $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheckoutLegalPresentation checkoutLegalPresentation, BRg bRg, int i, int i2) {
            super(2);
            this.$data = checkoutLegalPresentation;
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
            CheckoutApprovalLegalTextKt.CheckoutApprovalLegalFooter(this.$data, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: merchantCheckoutLegalText-XO-JAsU, reason: not valid java name */
    public static final ApQ m186merchantCheckoutLegalTextXOJAsU(List<LegalLink> list, String str, long j, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        List listA0a = AbstractC0878AGe.A0a(list, 3);
        int size = listA0a.size();
        if (size == 1) {
            bfm.AgE(-1563883686);
            i2 = R.string._name_removed__res_0x7f12013f;
            objArr = new Object[]{str, str, C3cI.A0d(listA0a, 0)};
        } else if (size != 2) {
            bfm.AgE(-1563869444);
            i2 = R.string._name_removed__res_0x7f120140;
            objArr = new Object[]{str, str, C3cI.A0d(listA0a, 0), C3cI.A0d(listA0a, 1), C3cI.A0d(listA0a, 2)};
        } else {
            bfm.AgE(-1563877126);
            i2 = R.string._name_removed__res_0x7f120141;
            objArr = new Object[]{str, str, C3cI.A0d(listA0a, 0), C3cI.A0d(listA0a, 1)};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(strA02, listA0a, j, bfm, i & 896);
    }

    public static final String checkoutDisclosureMerchantName(String str, BFM bfm, int i) {
        if (str == null) {
            bfm.AgE(559788146);
            str = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12013e);
        } else {
            bfm.AgE(559787185);
        }
        AnonymousClass002.A19(bfm);
        return str;
    }

    public static final void CheckoutApprovalLegalFooter(CheckoutLegalPresentation checkoutLegalPresentation, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass1;
        ApQ apQM186merchantCheckoutLegalTextXOJAsU;
        bfm.AgG(103692348);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutLegalPresentation, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (checkoutLegalPresentation == null) {
                AnonymousClass003.A0l(bfm, 1017411360);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new CheckoutApprovalLegalTextKt$CheckoutApprovalLegalFooter$text$1(checkoutLegalPresentation, bRg, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass1);
                }
                return;
            }
            if (checkoutLegalPresentation instanceof CheckoutLegalPresentation.Booking) {
                bfm.AgE(864105907);
                apQM186merchantCheckoutLegalTextXOJAsU = m185bookingCheckoutLegalTextRPmYEkk((CheckoutLegalPresentation.Booking) checkoutLegalPresentation, AuraTheme.INSTANCE.getColors(bfm, 6).accent, bfm, CheckoutLegalPresentation.Booking.$stable | (iA05 & 14));
            } else {
                if (!(checkoutLegalPresentation instanceof CheckoutLegalPresentation.Merchant)) {
                    throw AnonymousClass005.A0k(bfm, 864103138);
                }
                bfm.AgE(864109764);
                CheckoutLegalPresentation.Merchant merchant = (CheckoutLegalPresentation.Merchant) checkoutLegalPresentation;
                apQM186merchantCheckoutLegalTextXOJAsU = m186merchantCheckoutLegalTextXOJAsU(merchant.links, checkoutDisclosureMerchantName(merchant.name, bfm, 0), AuraTheme.INSTANCE.getColors(bfm, 6).accent, bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(apQM186merchantCheckoutLegalTextXOJAsU, bRg, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(checkoutLegalPresentation, bRg, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    /* renamed from: bookingCheckoutLegalText-RPmYEkk, reason: not valid java name */
    public static final ApQ m185bookingCheckoutLegalTextRPmYEkk(CheckoutLegalPresentation.Booking booking, long j, BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200d4);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200d2);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200d3);
        return CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value, strA01, strA012, strA013}, R.string._name_removed__res_0x7f1200d1), Arrays.asList(new LegalLink(strA01, booking.termsUrl), new LegalLink(strA012, booking.privacyUrl), new LegalLink(strA013, booking.propertyUrl)), j, bfm, (LegalLink.$stable << 3) | ((i << 3) & 896));
    }
}
