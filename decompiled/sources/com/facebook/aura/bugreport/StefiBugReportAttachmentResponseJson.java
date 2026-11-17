package com.facebook.aura.bugreport;

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
/* loaded from: classes3.dex */
public final class StefiBugReportAttachmentResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String attachment_id;

    public final class Companion {
        public final C9hr<StefiBugReportAttachmentResponseJson> serializer() {
            return StefiBugReportAttachmentResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(StefiBugReportAttachmentResponseJson stefiBugReportAttachmentResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(stefiBugReportAttachmentResponseJson.attachment_id)) {
            c9j5.AAV(stefiBugReportAttachmentResponseJson.attachment_id, c9iZ, 0);
        }
    }

    public final StefiBugReportAttachmentResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new StefiBugReportAttachmentResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StefiBugReportAttachmentResponseJson) && C7384Etj.areEqual(this.attachment_id, ((StefiBugReportAttachmentResponseJson) obj).attachment_id));
    }

    public static /* synthetic */ StefiBugReportAttachmentResponseJson copy$default(StefiBugReportAttachmentResponseJson stefiBugReportAttachmentResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stefiBugReportAttachmentResponseJson.attachment_id;
        }
        C7384Etj.A0Y(str, 0);
        return new StefiBugReportAttachmentResponseJson(str);
    }

    public final String component1() {
        return this.attachment_id;
    }

    public final String getAttachment_id() {
        return this.attachment_id;
    }

    public int hashCode() {
        return this.attachment_id.hashCode();
    }

    public /* synthetic */ StefiBugReportAttachmentResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.attachment_id = "";
        } else {
            this.attachment_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StefiBugReportAttachmentResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.attachment_id = str;
    }

    public /* synthetic */ StefiBugReportAttachmentResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public StefiBugReportAttachmentResponseJson() {
        this("");
    }
}
