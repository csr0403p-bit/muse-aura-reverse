package com.facebook.aura.sharesheet;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShareSendResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String app_target;
    public final String client_request_id;
    public final String delivery_id;

    public final class Companion {
        public final C9hr<ShareSendResponseJson> serializer() {
            return ShareSendResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(ShareSendResponseJson shareSendResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shareSendResponseJson.app_target)) {
            c9j5.AAV(shareSendResponseJson.app_target, c9iZ, 0);
        }
        if (zAfR || shareSendResponseJson.delivery_id != null) {
            c9j5.AAP(shareSendResponseJson.delivery_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(shareSendResponseJson.client_request_id)) {
            c9j5.AAV(shareSendResponseJson.client_request_id, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareSendResponseJson) {
                ShareSendResponseJson shareSendResponseJson = (ShareSendResponseJson) obj;
                if (!C7384Etj.areEqual(this.app_target, shareSendResponseJson.app_target) || !C7384Etj.areEqual(this.delivery_id, shareSendResponseJson.delivery_id) || !C7384Etj.areEqual(this.client_request_id, shareSendResponseJson.client_request_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShareSendResponseJson copy$default(ShareSendResponseJson shareSendResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareSendResponseJson.app_target;
        }
        if ((i & 2) != 0) {
            str2 = shareSendResponseJson.delivery_id;
        }
        if ((i & 4) != 0) {
            str3 = shareSendResponseJson.client_request_id;
        }
        return shareSendResponseJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.app_target;
    }

    public final String component2() {
        return this.delivery_id;
    }

    public final String component3() {
        return this.client_request_id;
    }

    public final String getApp_target() {
        return this.app_target;
    }

    public final String getClient_request_id() {
        return this.client_request_id;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.client_request_id, (AnonymousClass001.A0G(this.app_target) + AnonymousClass006.A0G(this.delivery_id)) * 31);
    }

    public ShareSendResponseJson(String str, String str2, String str3) {
        AnonymousClass003.A0v(str, str3);
        this.app_target = str;
        this.delivery_id = str2;
        this.client_request_id = str3;
    }

    public final ShareSendResponseJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0v(str, str3);
        return new ShareSendResponseJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShareSendResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.app_target = "";
        } else {
            this.app_target = str;
        }
        if ((i & 2) == 0) {
            this.delivery_id = null;
        } else {
            this.delivery_id = str2;
        }
        if ((i & 4) == 0) {
            this.client_request_id = "";
        } else {
            this.client_request_id = str3;
        }
    }

    public /* synthetic */ ShareSendResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass006.A0s(i, str2), (i & 4) != 0 ? "" : str3);
    }

    public ShareSendResponseJson() {
        this("", null, "");
    }
}
