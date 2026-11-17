package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutInitRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String otc_session_id;
    public final String otc_type;
    public final String product_id;
    public final String receiver_id;
    public final String session_id;

    public final class Companion {
        public final C9hr<HatchCheckoutInitRequestJson> serializer() {
            return HatchCheckoutInitRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutInitRequestJson hatchCheckoutInitRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCheckoutInitRequestJson.session_id, c9iZ, 0);
        c9j5.AAV(hatchCheckoutInitRequestJson.product_id, c9iZ, 1);
        c9j5.AAV(hatchCheckoutInitRequestJson.receiver_id, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutInitRequestJson.amount != null) {
            c9j5.AAP(hatchCheckoutInitRequestJson.amount, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchCheckoutInitRequestJson.currency != null) {
            c9j5.AAP(hatchCheckoutInitRequestJson.currency, C07779iq.A01, c9iZ, 4);
        }
        c9j5.AAV(hatchCheckoutInitRequestJson.otc_session_id, c9iZ, 5);
        c9j5.AAV(hatchCheckoutInitRequestJson.otc_type, c9iZ, 6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutInitRequestJson) {
                HatchCheckoutInitRequestJson hatchCheckoutInitRequestJson = (HatchCheckoutInitRequestJson) obj;
                if (!C7384Etj.areEqual(this.session_id, hatchCheckoutInitRequestJson.session_id) || !C7384Etj.areEqual(this.product_id, hatchCheckoutInitRequestJson.product_id) || !C7384Etj.areEqual(this.receiver_id, hatchCheckoutInitRequestJson.receiver_id) || !C7384Etj.areEqual(this.amount, hatchCheckoutInitRequestJson.amount) || !C7384Etj.areEqual(this.currency, hatchCheckoutInitRequestJson.currency) || !C7384Etj.areEqual(this.otc_session_id, hatchCheckoutInitRequestJson.otc_session_id) || !C7384Etj.areEqual(this.otc_type, hatchCheckoutInitRequestJson.otc_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutInitRequestJson copy$default(HatchCheckoutInitRequestJson hatchCheckoutInitRequestJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutInitRequestJson.session_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutInitRequestJson.product_id;
        }
        if ((i & 4) != 0) {
            str3 = hatchCheckoutInitRequestJson.receiver_id;
        }
        if ((i & 8) != 0) {
            str4 = hatchCheckoutInitRequestJson.amount;
        }
        if ((i & 16) != 0) {
            str5 = hatchCheckoutInitRequestJson.currency;
        }
        if ((i & 32) != 0) {
            str6 = hatchCheckoutInitRequestJson.otc_session_id;
        }
        if ((i & 64) != 0) {
            str7 = hatchCheckoutInitRequestJson.otc_type;
        }
        return hatchCheckoutInitRequestJson.copy(str, str2, str3, str4, str5, str6, str7);
    }

    public final String component1() {
        return this.session_id;
    }

    public final String component2() {
        return this.product_id;
    }

    public final String component3() {
        return this.receiver_id;
    }

    public final String component4() {
        return this.amount;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.otc_session_id;
    }

    public final String component7() {
        return this.otc_type;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOtc_session_id() {
        return this.otc_session_id;
    }

    public final String getOtc_type() {
        return this.otc_type;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getReceiver_id() {
        return this.receiver_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.otc_type, AnonymousClass005.A0I(this.otc_session_id, (((AnonymousClass005.A0I(this.receiver_id, AnonymousClass005.A0I(this.product_id, AnonymousClass001.A0G(this.session_id))) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass005.A0H(this.currency)) * 31));
    }

    public HatchCheckoutInitRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0z(str6, str7);
        this.session_id = str;
        this.product_id = str2;
        this.receiver_id = str3;
        this.amount = str4;
        this.currency = str5;
        this.otc_session_id = str6;
        this.otc_type = str7;
    }

    public final HatchCheckoutInitRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0z(str6, str7);
        return new HatchCheckoutInitRequestJson(str, str2, str3, str4, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutInitRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, str7);
    }

    public /* synthetic */ HatchCheckoutInitRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if (103 != (i & 103)) {
            C9iI.A00(HatchCheckoutInitRequestJson$$serializer.descriptor, i, 103);
            throw F60.createAndThrow();
        }
        this.session_id = str;
        this.product_id = str2;
        this.receiver_id = str3;
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str4;
        }
        if ((i & 16) == 0) {
            this.currency = null;
        } else {
            this.currency = str5;
        }
        this.otc_session_id = str6;
        this.otc_type = str7;
    }
}
