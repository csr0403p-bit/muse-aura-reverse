package com.facebook.aura.sharesheet;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ShareRecipientJson extends C06G {
    public static final int $stable = 8;
    public final String app_target;
    public final String label;
    public final String name;
    public final List<String> profile_pic_url;
    public final String recipient_id;
    public final JsonPrimitive recipient_type;
    public final String sender_account_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, ShareRecipientJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<ShareRecipientJson> serializer() {
            return ShareRecipientJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShareRecipientJson copy(String str, String str2, List<String> list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5) {
        AnonymousClass005.A11(str, list, str3, 0);
        AnonymousClass003.A0z(str4, str5);
        return new ShareRecipientJson(str, str2, list, str3, jsonPrimitive, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareRecipientJson) {
                ShareRecipientJson shareRecipientJson = (ShareRecipientJson) obj;
                if (!C7384Etj.areEqual(this.name, shareRecipientJson.name) || !C7384Etj.areEqual(this.label, shareRecipientJson.label) || !C7384Etj.areEqual(this.profile_pic_url, shareRecipientJson.profile_pic_url) || !C7384Etj.areEqual(this.app_target, shareRecipientJson.app_target) || !C7384Etj.areEqual(this.recipient_type, shareRecipientJson.recipient_type) || !C7384Etj.areEqual(this.recipient_id, shareRecipientJson.recipient_id) || !C7384Etj.areEqual(this.sender_account_id, shareRecipientJson.sender_account_id)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareRecipientJson copy$default(ShareRecipientJson shareRecipientJson, String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareRecipientJson.name;
        }
        if ((i & 2) != 0) {
            str2 = shareRecipientJson.label;
        }
        if ((i & 4) != 0) {
            list = shareRecipientJson.profile_pic_url;
        }
        if ((i & 8) != 0) {
            str3 = shareRecipientJson.app_target;
        }
        if ((i & 16) != 0) {
            jsonPrimitive = shareRecipientJson.recipient_type;
        }
        if ((i & 32) != 0) {
            str4 = shareRecipientJson.recipient_id;
        }
        if ((i & 64) != 0) {
            str5 = shareRecipientJson.sender_account_id;
        }
        return shareRecipientJson.copy(str, str2, list, str3, jsonPrimitive, str4, str5);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(ShareRecipientJson shareRecipientJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shareRecipientJson.name)) {
            c9j5.AAV(shareRecipientJson.name, c9iZ, 0);
        }
        if (zAfR || shareRecipientJson.label != null) {
            c9j5.AAP(shareRecipientJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(shareRecipientJson.profile_pic_url)) {
            c9j5.AAQ(shareRecipientJson.profile_pic_url, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !"".equals(shareRecipientJson.app_target)) {
            c9j5.AAV(shareRecipientJson.app_target, c9iZ, 3);
        }
        if (zAfR || shareRecipientJson.recipient_type != null) {
            c9j5.AAP(shareRecipientJson.recipient_type, JsonPrimitiveSerializer.A01, c9iZ, 4);
        }
        if (zAfR || !"".equals(shareRecipientJson.recipient_id)) {
            c9j5.AAV(shareRecipientJson.recipient_id, c9iZ, 5);
        }
        if (zAfR || !"".equals(shareRecipientJson.sender_account_id)) {
            c9j5.AAV(shareRecipientJson.sender_account_id, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.name;
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
        return AnonymousClass001.A0H(this.sender_account_id, AnonymousClass005.A0I(this.recipient_id, (AnonymousClass005.A0I(this.app_target, AnonymousClass005.A0F(this.profile_pic_url, (AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.label)) * 31)) + C3cH.A02(this.recipient_type)) * 31));
    }

    public /* synthetic */ ShareRecipientJson(int i, String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.profile_pic_url = C0881AGi.A00;
        } else {
            this.profile_pic_url = list;
        }
        if ((i & 8) == 0) {
            this.app_target = "";
        } else {
            this.app_target = str3;
        }
        if ((i & 16) == 0) {
            this.recipient_type = null;
        } else {
            this.recipient_type = jsonPrimitive;
        }
        if ((i & 32) == 0) {
            this.recipient_id = "";
        } else {
            this.recipient_id = str4;
        }
        if ((i & 64) == 0) {
            this.sender_account_id = "";
        } else {
            this.sender_account_id = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShareRecipientJson(String str, String str2, List list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, C3cI.A12(list, i), (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : jsonPrimitive, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }

    public ShareRecipientJson(String str, String str2, List<String> list, String str3, JsonPrimitive jsonPrimitive, String str4, String str5) {
        AnonymousClass005.A11(str, list, str3, 0);
        AnonymousClass003.A0z(str4, str5);
        this.name = str;
        this.label = str2;
        this.profile_pic_url = list;
        this.app_target = str3;
        this.recipient_type = jsonPrimitive;
        this.recipient_id = str4;
        this.sender_account_id = str5;
    }

    public ShareRecipientJson() {
        this("", null, C0881AGi.A00, "", null, "", "");
    }
}
