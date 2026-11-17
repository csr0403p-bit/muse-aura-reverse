package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.icu.text.ListFormatter;
import com.facebook.aura.R;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.DeliveryCheckoutLegalLink;
import com.facebook.aura.gateway.DeliveryCheckoutLegalRole;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutLegalFooterKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutLegalFooterKt$DeliveryCheckoutLegalFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeliveryCheckoutApproval deliveryCheckoutApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = deliveryCheckoutApproval;
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
            DeliveryCheckoutLegalFooterKt.DeliveryCheckoutLegalFooter(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutLegalFooterKt$DeliveryCheckoutLegalFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeliveryCheckoutApproval deliveryCheckoutApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = deliveryCheckoutApproval;
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
            DeliveryCheckoutLegalFooterKt.DeliveryCheckoutLegalFooter(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DeliveryCheckoutLegalFooter(DeliveryCheckoutApproval deliveryCheckoutApproval, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        int i3;
        Object[] objArr;
        C7384Etj.A0Y(deliveryCheckoutApproval, 0);
        bfm.AgG(1450472790);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(deliveryCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            String strA02 = deliveryCheckoutApproval.legalNotice;
            if (deliveryCheckoutApproval.legalLinks.isEmpty() && strA02 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(deliveryCheckoutApproval, bRg, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            bfm.AgE(-1960012142);
            List<DeliveryCheckoutLegalLink> list = deliveryCheckoutApproval.legalLinks;
            ArrayList arrayListA0m = AnonymousClass002.A0m(list);
            for (DeliveryCheckoutLegalLink deliveryCheckoutLegalLink : list) {
                arrayListA0m.add(new LegalLink(legalLabel(deliveryCheckoutLegalLink.role, bfm, 0), deliveryCheckoutLegalLink.url));
            }
            BBI bbiA07 = C3cG.A07(bfm);
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
            Iterator it = arrayListA0m.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(((LegalLink) it.next()).label);
            }
            boolean zA1K = AnonymousClass003.A1K(bfm, arrayListA0m2, localeA0b);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = ListFormatter.getInstance(localeA0b).format(arrayListA0m2);
                bfm.Ai0(objAaT);
            }
            if (arrayListA0m.isEmpty()) {
                bfm.AgE(-1960002113);
                BBI.A0R(bbiA07, false);
                if (strA02 == null) {
                    strA02 = "";
                }
            } else {
                if (strA02 == null) {
                    bfm.AgE(-1960000409);
                    i3 = R.string._name_removed__res_0x7f1200b7;
                    String str = deliveryCheckoutApproval.providerName;
                    C7384Etj.A0X(objAaT);
                    objArr = new Object[]{str, objAaT};
                } else {
                    bfm.AgE(-1959993781);
                    i3 = R.string._name_removed__res_0x7f1200b8;
                    String str2 = deliveryCheckoutApproval.providerName;
                    C7384Etj.A0X(objAaT);
                    objArr = new Object[]{str2, objAaT, strA02};
                }
                strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
                BBI.A0R(bbiA07, false);
            }
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(strA02, arrayListA0m, C3cH.A0W(bfm).accent, bfm, 0), bRg, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(deliveryCheckoutApproval, bRg, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryCheckoutLegalRole.values().length];
            try {
                AnonymousClass002.A13(DeliveryCheckoutLegalRole.TERMS_OF_SERVICE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DeliveryCheckoutLegalRole.PRIVACY_STATEMENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DeliveryCheckoutLegalRole.CANCELLATION_POLICY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String legalLabel(DeliveryCheckoutLegalRole deliveryCheckoutLegalRole, BFM bfm, int i) {
        int i2;
        int iOrdinal = deliveryCheckoutLegalRole.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f1200b3;
        } else if (iOrdinal == 1) {
            i2 = R.string._name_removed__res_0x7f1200b2;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f1200b1;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }
}
