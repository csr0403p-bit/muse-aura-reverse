package com.facebook.aura.commands.sms;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class SmsAttachment extends C06G {
    public final String attachmentId;
    public final String filename;
    public final String mimeType;
    public final String partUri;
    public final String type;
    public final String uploadedPath;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmsAttachment) {
                SmsAttachment smsAttachment = (SmsAttachment) obj;
                if (!C7384Etj.areEqual(this.attachmentId, smsAttachment.attachmentId) || !C7384Etj.areEqual(this.type, smsAttachment.type) || !C7384Etj.areEqual(this.mimeType, smsAttachment.mimeType) || !C7384Etj.areEqual(this.filename, smsAttachment.filename) || !C7384Etj.areEqual(this.partUri, smsAttachment.partUri) || !C7384Etj.areEqual(this.uploadedPath, smsAttachment.uploadedPath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SmsAttachment copy$default(SmsAttachment smsAttachment, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smsAttachment.attachmentId;
        }
        if ((i & 2) != 0) {
            str2 = smsAttachment.type;
        }
        if ((i & 4) != 0) {
            str3 = smsAttachment.mimeType;
        }
        if ((i & 8) != 0) {
            str4 = smsAttachment.filename;
        }
        if ((i & 16) != 0) {
            str5 = smsAttachment.partUri;
        }
        if ((i & 32) != 0) {
            str6 = smsAttachment.uploadedPath;
        }
        return smsAttachment.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.attachmentId;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final String component4() {
        return this.filename;
    }

    public final String component5() {
        return this.partUri;
    }

    public final String component6() {
        return this.uploadedPath;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPartUri() {
        return this.partUri;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUploadedPath() {
        return this.uploadedPath;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.partUri, AnonymousClass005.A0I(this.filename, AnonymousClass005.A0I(this.mimeType, AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.attachmentId))))) + AnonymousClass006.A0G(this.uploadedPath);
    }

    public SmsAttachment(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.attachmentId = str;
        this.type = str2;
        this.mimeType = str3;
        this.filename = str4;
        this.partUri = str5;
        this.uploadedPath = str6;
    }

    public final SmsAttachment copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new SmsAttachment(str, str2, str3, str4, str5, str6);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("attachmentId", this.attachmentId, c2nwA1K);
        C7qW.A06("type", this.type, c2nwA1K);
        C7qW.A06("mimeType", this.mimeType, c2nwA1K);
        String str = this.filename;
        if (str.length() > 0) {
            C7qW.A06("filename", str, c2nwA1K);
        }
        String str2 = this.uploadedPath;
        if (str2 != null) {
            C7qW.A06("uploadedPath", str2, c2nwA1K);
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SmsAttachment(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
    }
}
