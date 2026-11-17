package X;

import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.HwA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10579HwA {
    public final long A00() {
        return this instanceof Huq ? ((Huq) this).A01 : ((Hz9) this).A01;
    }

    public final C10529Hpr A01() {
        return this instanceof Huq ? ((Huq) this).A02 : ((Hz9) this).A02;
    }

    public final Integer A02() {
        return this instanceof Huq ? ((Huq) this).A03 : ((Hz9) this).A03;
    }

    public final String A03() {
        return this instanceof Huq ? ((Huq) this).A05 : ((Hz9) this).A05;
    }

    public final String A04() {
        return this instanceof Huq ? ((Huq) this).A07 : ((Hz9) this).A07;
    }

    public final String A05() {
        return this instanceof Huq ? ((Huq) this).A09 : ((Hz9) this).A09;
    }

    public final boolean A06() {
        return this instanceof Huq ? ((Huq) this).A0A : ((Hz9) this).A0B;
    }

    public final String toString() {
        String str;
        String strA03 = A03();
        Integer numA02 = A02();
        C10529Hpr c10529HprA01 = A01();
        long jA00 = A00();
        String strA05 = A05();
        int i = this instanceof Huq ? ((Huq) this).A00 : ((Hz9) this).A00;
        StringBuilder sbA0x = C3cI.A0x("DcpPurchase(orderId='", strA03);
        sbA0x.append("', purchaseState='");
        if (numA02 != null) {
            switch (numA02.intValue()) {
                case 1:
                    str = "PURCHASED";
                    break;
                case 2:
                    str = "UNSPECIFIED_STATE";
                    break;
                default:
                    str = HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING;
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(str);
        sbA0x.append("',) accountIdentifiers='");
        sbA0x.append(c10529HprA01);
        sbA0x.append("', purchaseTime='");
        sbA0x.append(jA00);
        sbA0x.append("', sku='");
        sbA0x.append(strA05);
        sbA0x.append("', billingClientVersion='");
        sbA0x.append(i);
        return AnonymousClass001.A0v("'", sbA0x);
    }
}
