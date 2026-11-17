package com.facebook.aura.sharesheet;

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
public final class ShareSendRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String client_request_id;
    public final String contact_target_id;
    public final int contact_type;
    public final String sender_account_id;
    public final String text;
    public final String upload_id;

    public final class Companion {
        public final C9hr<ShareSendRequestJson> serializer() {
            return ShareSendRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(ShareSendRequestJson shareSendRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, shareSendRequestJson.contact_type);
        c9j5.AAV(shareSendRequestJson.contact_target_id, c9iZ, 1);
        c9j5.AAV(shareSendRequestJson.sender_account_id, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shareSendRequestJson.text != null) {
            c9j5.AAP(shareSendRequestJson.text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shareSendRequestJson.upload_id != null) {
            c9j5.AAP(shareSendRequestJson.upload_id, C07779iq.A01, c9iZ, 4);
        }
        c9j5.AAV(shareSendRequestJson.client_request_id, c9iZ, 5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareSendRequestJson) {
                ShareSendRequestJson shareSendRequestJson = (ShareSendRequestJson) obj;
                if (this.contact_type != shareSendRequestJson.contact_type || !C7384Etj.areEqual(this.contact_target_id, shareSendRequestJson.contact_target_id) || !C7384Etj.areEqual(this.sender_account_id, shareSendRequestJson.sender_account_id) || !C7384Etj.areEqual(this.text, shareSendRequestJson.text) || !C7384Etj.areEqual(this.upload_id, shareSendRequestJson.upload_id) || !C7384Etj.areEqual(this.client_request_id, shareSendRequestJson.client_request_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShareSendRequestJson(int i, int i2, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (39 != (i & 39)) {
            C9iI.A00(ShareSendRequestJson$$serializer.descriptor, i, 39);
            throw F60.createAndThrow();
        }
        this.contact_type = i2;
        this.contact_target_id = str;
        this.sender_account_id = str2;
        if ((i & 8) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        if ((i & 16) == 0) {
            this.upload_id = null;
        } else {
            this.upload_id = str4;
        }
        this.client_request_id = str5;
    }

    public static /* synthetic */ ShareSendRequestJson copy$default(ShareSendRequestJson shareSendRequestJson, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareSendRequestJson.contact_type;
        }
        if ((i2 & 2) != 0) {
            str = shareSendRequestJson.contact_target_id;
        }
        if ((i2 & 4) != 0) {
            str2 = shareSendRequestJson.sender_account_id;
        }
        if ((i2 & 8) != 0) {
            str3 = shareSendRequestJson.text;
        }
        if ((i2 & 16) != 0) {
            str4 = shareSendRequestJson.upload_id;
        }
        if ((i2 & 32) != 0) {
            str5 = shareSendRequestJson.client_request_id;
        }
        return shareSendRequestJson.copy(i, str, str2, str3, str4, str5);
    }

    public final int component1() {
        return this.contact_type;
    }

    public final String component2() {
        return this.contact_target_id;
    }

    public final String component3() {
        return this.sender_account_id;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.upload_id;
    }

    public final String component6() {
        return this.client_request_id;
    }

    public final String getClient_request_id() {
        return this.client_request_id;
    }

    public final String getContact_target_id() {
        return this.contact_target_id;
    }

    public final int getContact_type() {
        return this.contact_type;
    }

    public final String getSender_account_id() {
        return this.sender_account_id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUpload_id() {
        return this.upload_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.client_request_id, (((AnonymousClass005.A0I(this.sender_account_id, AnonymousClass005.A0I(this.contact_target_id, this.contact_type * 31)) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass005.A0H(this.upload_id)) * 31);
    }

    public final ShareSendRequestJson copy(int i, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(str5, 5);
        return new ShareSendRequestJson(i, str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public ShareSendRequestJson(int i, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(str5, 5);
        this.contact_type = i;
        this.contact_target_id = str;
        this.sender_account_id = str2;
        this.text = str3;
        this.upload_id = str4;
        this.client_request_id = str5;
    }

    public /* synthetic */ ShareSendRequestJson(int i, String str, String str2, String str3, String str4, String str5, int i2, C06H c06h) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, str5);
    }
}
