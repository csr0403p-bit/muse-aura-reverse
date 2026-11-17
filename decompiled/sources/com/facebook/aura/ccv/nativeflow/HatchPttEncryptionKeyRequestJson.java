package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
public final class HatchPttEncryptionKeyRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final HatchOneTimeCheckoutInputJson one_time_checkout_input;
    public final String payment_product_id;
    public final String payment_type;
    public final String session_id;

    public final class Companion {
        public final C9hr<HatchPttEncryptionKeyRequestJson> serializer() {
            return HatchPttEncryptionKeyRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchPttEncryptionKeyRequestJson hatchPttEncryptionKeyRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchPttEncryptionKeyRequestJson.device_id, c9iZ, 0);
        c9j5.AAV(hatchPttEncryptionKeyRequestJson.payment_type, c9iZ, 1);
        c9j5.AAV(hatchPttEncryptionKeyRequestJson.session_id, c9iZ, 2);
        c9j5.AAV(hatchPttEncryptionKeyRequestJson.payment_product_id, c9iZ, 3);
        c9j5.AAQ(hatchPttEncryptionKeyRequestJson.one_time_checkout_input, HatchOneTimeCheckoutInputJson$$serializer.INSTANCE, c9iZ, 4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPttEncryptionKeyRequestJson) {
                HatchPttEncryptionKeyRequestJson hatchPttEncryptionKeyRequestJson = (HatchPttEncryptionKeyRequestJson) obj;
                if (!C7384Etj.areEqual(this.device_id, hatchPttEncryptionKeyRequestJson.device_id) || !C7384Etj.areEqual(this.payment_type, hatchPttEncryptionKeyRequestJson.payment_type) || !C7384Etj.areEqual(this.session_id, hatchPttEncryptionKeyRequestJson.session_id) || !C7384Etj.areEqual(this.payment_product_id, hatchPttEncryptionKeyRequestJson.payment_product_id) || !C7384Etj.areEqual(this.one_time_checkout_input, hatchPttEncryptionKeyRequestJson.one_time_checkout_input)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchPttEncryptionKeyRequestJson(int i, String str, String str2, String str3, String str4, HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(HatchPttEncryptionKeyRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.device_id = str;
        this.payment_type = str2;
        this.session_id = str3;
        this.payment_product_id = str4;
        this.one_time_checkout_input = hatchOneTimeCheckoutInputJson;
    }

    public static /* synthetic */ HatchPttEncryptionKeyRequestJson copy$default(HatchPttEncryptionKeyRequestJson hatchPttEncryptionKeyRequestJson, String str, String str2, String str3, String str4, HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPttEncryptionKeyRequestJson.device_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchPttEncryptionKeyRequestJson.payment_type;
        }
        if ((i & 4) != 0) {
            str3 = hatchPttEncryptionKeyRequestJson.session_id;
        }
        if ((i & 8) != 0) {
            str4 = hatchPttEncryptionKeyRequestJson.payment_product_id;
        }
        if ((i & 16) != 0) {
            hatchOneTimeCheckoutInputJson = hatchPttEncryptionKeyRequestJson.one_time_checkout_input;
        }
        return hatchPttEncryptionKeyRequestJson.copy(str, str2, str3, str4, hatchOneTimeCheckoutInputJson);
    }

    public final String component1() {
        return this.device_id;
    }

    public final String component2() {
        return this.payment_type;
    }

    public final String component3() {
        return this.session_id;
    }

    public final String component4() {
        return this.payment_product_id;
    }

    public final HatchOneTimeCheckoutInputJson component5() {
        return this.one_time_checkout_input;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final HatchOneTimeCheckoutInputJson getOne_time_checkout_input() {
        return this.one_time_checkout_input;
    }

    public final String getPayment_product_id() {
        return this.payment_product_id;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.one_time_checkout_input, AnonymousClass005.A0I(this.payment_product_id, AnonymousClass005.A0I(this.session_id, AnonymousClass005.A0I(this.payment_type, AnonymousClass001.A0G(this.device_id)))));
    }

    public final HatchPttEncryptionKeyRequestJson copy(String str, String str2, String str3, String str4, HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson) {
        AnonymousClass005.A17(str, str2, str3, str4, hatchOneTimeCheckoutInputJson);
        return new HatchPttEncryptionKeyRequestJson(str, str2, str3, str4, hatchOneTimeCheckoutInputJson);
    }

    public String toString() {
        return super.toString();
    }

    public HatchPttEncryptionKeyRequestJson(String str, String str2, String str3, String str4, HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson) {
        AnonymousClass005.A17(str, str2, str3, str4, hatchOneTimeCheckoutInputJson);
        this.device_id = str;
        this.payment_type = str2;
        this.session_id = str3;
        this.payment_product_id = str4;
        this.one_time_checkout_input = hatchOneTimeCheckoutInputJson;
    }
}
