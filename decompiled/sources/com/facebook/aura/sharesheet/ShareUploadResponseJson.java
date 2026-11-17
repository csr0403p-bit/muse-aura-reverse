package com.facebook.aura.sharesheet;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShareUploadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String upload_id;

    public final class Companion {
        public final C9hr<ShareUploadResponseJson> serializer() {
            return ShareUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(ShareUploadResponseJson shareUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(shareUploadResponseJson.upload_id)) {
            c9j5.AAV(shareUploadResponseJson.upload_id, c9iZ, 0);
        }
    }

    public final ShareUploadResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ShareUploadResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShareUploadResponseJson) && C7384Etj.areEqual(this.upload_id, ((ShareUploadResponseJson) obj).upload_id));
    }

    public static /* synthetic */ ShareUploadResponseJson copy$default(ShareUploadResponseJson shareUploadResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareUploadResponseJson.upload_id;
        }
        C7384Etj.A0Y(str, 0);
        return new ShareUploadResponseJson(str);
    }

    public final String component1() {
        return this.upload_id;
    }

    public final String getUpload_id() {
        return this.upload_id;
    }

    public int hashCode() {
        return this.upload_id.hashCode();
    }

    public /* synthetic */ ShareUploadResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.upload_id = "";
        } else {
            this.upload_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShareUploadResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.upload_id = str;
    }

    public /* synthetic */ ShareUploadResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ShareUploadResponseJson() {
        this("");
    }
}
