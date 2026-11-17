package com.facebook.aura.pairs;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class TrustedCircleSourceJson extends C06G {
    public static final int $stable = 8;
    public final String account_center_key;
    public final String app_target;
    public final Boolean is_direct;
    public final Boolean is_hatch_onboarded;
    public final String label;
    public final String name;
    public final List<String> profile_pic_url;
    public final String recipient_id;
    public final JsonPrimitive recipient_type;
    public final String sender_account_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, TrustedCircleSourceJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<TrustedCircleSourceJson> serializer() {
            return TrustedCircleSourceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TrustedCircleSourceJson(String str, String str2, List<String> list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, Boolean bool, Boolean bool2, String str6) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(list, str3, jsonPrimitive, str4, 2);
        C7384Etj.A0Y(str5, 6);
        this.name = str;
        this.label = str2;
        this.profile_pic_url = list;
        this.app_target = str3;
        this.recipient_type = jsonPrimitive;
        this.recipient_id = str4;
        this.sender_account_id = str5;
        this.is_direct = bool;
        this.is_hatch_onboarded = bool2;
        this.account_center_key = str6;
    }

    public final TrustedCircleSourceJson copy(String str, String str2, List<String> list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, Boolean bool, Boolean bool2, String str6) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(list, str3, jsonPrimitive, str4, 2);
        C7384Etj.A0Y(str5, 6);
        return new TrustedCircleSourceJson(str, str2, list, str3, jsonPrimitive, str4, str5, bool, bool2, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrustedCircleSourceJson) {
                TrustedCircleSourceJson trustedCircleSourceJson = (TrustedCircleSourceJson) obj;
                if (!C7384Etj.areEqual(this.name, trustedCircleSourceJson.name) || !C7384Etj.areEqual(this.label, trustedCircleSourceJson.label) || !C7384Etj.areEqual(this.profile_pic_url, trustedCircleSourceJson.profile_pic_url) || !C7384Etj.areEqual(this.app_target, trustedCircleSourceJson.app_target) || !C7384Etj.areEqual(this.recipient_type, trustedCircleSourceJson.recipient_type) || !C7384Etj.areEqual(this.recipient_id, trustedCircleSourceJson.recipient_id) || !C7384Etj.areEqual(this.sender_account_id, trustedCircleSourceJson.sender_account_id) || !C7384Etj.areEqual(this.is_direct, trustedCircleSourceJson.is_direct) || !C7384Etj.areEqual(this.is_hatch_onboarded, trustedCircleSourceJson.is_hatch_onboarded) || !C7384Etj.areEqual(this.account_center_key, trustedCircleSourceJson.account_center_key)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustedCircleSourceJson copy$default(TrustedCircleSourceJson trustedCircleSourceJson, String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, Boolean bool, Boolean bool2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trustedCircleSourceJson.name;
        }
        if ((i & 2) != 0) {
            str2 = trustedCircleSourceJson.label;
        }
        if ((i & 4) != 0) {
            list = trustedCircleSourceJson.profile_pic_url;
        }
        if ((i & 8) != 0) {
            str3 = trustedCircleSourceJson.app_target;
        }
        if ((i & 16) != 0) {
            jsonPrimitive = trustedCircleSourceJson.recipient_type;
        }
        if ((i & 32) != 0) {
            str4 = trustedCircleSourceJson.recipient_id;
        }
        if ((i & 64) != 0) {
            str5 = trustedCircleSourceJson.sender_account_id;
        }
        if ((i & 128) != 0) {
            bool = trustedCircleSourceJson.is_direct;
        }
        if ((i & 256) != 0) {
            bool2 = trustedCircleSourceJson.is_hatch_onboarded;
        }
        if ((i & 512) != 0) {
            str6 = trustedCircleSourceJson.account_center_key;
        }
        return trustedCircleSourceJson.copy(str, str2, list, str3, jsonPrimitive, str4, str5, bool, bool2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(TrustedCircleSourceJson trustedCircleSourceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(trustedCircleSourceJson.name, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || trustedCircleSourceJson.label != null) {
            c9j5.AAP(trustedCircleSourceJson.label, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAQ(trustedCircleSourceJson.profile_pic_url, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAV(trustedCircleSourceJson.app_target, c9iZ, 3);
        c9j5.AAQ(trustedCircleSourceJson.recipient_type, JsonPrimitiveSerializer.A01, c9iZ, 4);
        c9j5.AAV(trustedCircleSourceJson.recipient_id, c9iZ, 5);
        c9j5.AAV(trustedCircleSourceJson.sender_account_id, c9iZ, 6);
        if (zAfR || trustedCircleSourceJson.is_direct != null) {
            c9j5.AAP(trustedCircleSourceJson.is_direct, C07839ix.A00, c9iZ, 7);
        }
        if (zAfR || trustedCircleSourceJson.is_hatch_onboarded != null) {
            c9j5.AAP(trustedCircleSourceJson.is_hatch_onboarded, C07839ix.A00, c9iZ, 8);
        }
        if (zAfR || trustedCircleSourceJson.account_center_key != null) {
            c9j5.AAP(trustedCircleSourceJson.account_center_key, C07779iq.A01, c9iZ, 9);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.account_center_key;
    }

    public final String component2() {
        return this.label;
    }

    public final List<String> component3() {
        return this.profile_pic_url;
    }

    public final String component4() {
        return this.app_target;
    }

    public final JsonPrimitive component5() {
        return this.recipient_type;
    }

    public final String component6() {
        return this.recipient_id;
    }

    public final String component7() {
        return this.sender_account_id;
    }

    public final Boolean component8() {
        return this.is_direct;
    }

    public final Boolean component9() {
        return this.is_hatch_onboarded;
    }

    public final String getAccount_center_key() {
        return this.account_center_key;
    }

    public final String getApp_target() {
        return this.app_target;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public final String getRecipient_id() {
        return this.recipient_id;
    }

    public final JsonPrimitive getRecipient_type() {
        return this.recipient_type;
    }

    public final String getSender_account_id() {
        return this.sender_account_id;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.sender_account_id, AnonymousClass005.A0I(this.recipient_id, AnonymousClass005.A0F(this.recipient_type, AnonymousClass005.A0I(this.app_target, AnonymousClass005.A0F(this.profile_pic_url, (AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.label)) * 31))))) + AnonymousClass006.A0D(this.is_direct)) * 31) + AnonymousClass006.A0D(this.is_hatch_onboarded)) * 31) + AnonymousClass005.A0H(this.account_center_key);
    }

    public final Boolean is_direct() {
        return this.is_direct;
    }

    public final Boolean is_hatch_onboarded() {
        return this.is_hatch_onboarded;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TrustedCircleSourceJson(String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, Boolean bool, Boolean bool2, String str6, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, list, str3, jsonPrimitive, str4, str5, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : str6);
    }

    public /* synthetic */ TrustedCircleSourceJson(int i, String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, Boolean bool, Boolean bool2, String str6, C2hx c2hx) {
        if (125 != (i & 125)) {
            C9iI.A00(TrustedCircleSourceJson$$serializer.descriptor, i, 125);
            throw F60.createAndThrow();
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        this.profile_pic_url = list;
        this.app_target = str3;
        this.recipient_type = jsonPrimitive;
        this.recipient_id = str4;
        this.sender_account_id = str5;
        if ((i & 128) == 0) {
            this.is_direct = null;
        } else {
            this.is_direct = bool;
        }
        if ((i & 256) == 0) {
            this.is_hatch_onboarded = null;
        } else {
            this.is_hatch_onboarded = bool2;
        }
        if ((i & 512) == 0) {
            this.account_center_key = null;
        } else {
            this.account_center_key = str6;
        }
    }
}
