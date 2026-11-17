package com.facebook.aura.conversation.offline;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidget$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchPersistedAttachmentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String attachmentHandle;
    public final String fileName;
    public final String id;
    public final String mimeType;
    public final String type;
    public final String uploadedPath;
    public final String uri;
    public final HatchWidget widget;

    public final class Companion {
        public final HatchPersistedAttachmentJson fromDomain(HatchAttachment hatchAttachment) {
            C7384Etj.A0Y(hatchAttachment, 0);
            return new HatchPersistedAttachmentJson(hatchAttachment.id, hatchAttachment.uri, hatchAttachment.mimeType, hatchAttachment.fileName, hatchAttachment.type, hatchAttachment.attachmentHandle, hatchAttachment.uploadedPath, hatchAttachment.widget);
        }

        public final C9hr<HatchPersistedAttachmentJson> serializer() {
            return HatchPersistedAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPersistedAttachmentJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchWidget hatchWidget) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str3, str4, str5, str6, 2);
        this.id = str;
        this.uri = str2;
        this.mimeType = str3;
        this.fileName = str4;
        this.type = str5;
        this.attachmentHandle = str6;
        this.uploadedPath = str7;
        this.widget = hatchWidget;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_offline_offline(HatchPersistedAttachmentJson hatchPersistedAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchPersistedAttachmentJson.id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchPersistedAttachmentJson.uri != null) {
            c9j5.AAP(hatchPersistedAttachmentJson.uri, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(hatchPersistedAttachmentJson.mimeType)) {
            c9j5.AAV(hatchPersistedAttachmentJson.mimeType, c9iZ, 2);
        }
        if (zAfR || !"".equals(hatchPersistedAttachmentJson.fileName)) {
            c9j5.AAV(hatchPersistedAttachmentJson.fileName, c9iZ, 3);
        }
        if (zAfR || !"".equals(hatchPersistedAttachmentJson.type)) {
            c9j5.AAV(hatchPersistedAttachmentJson.type, c9iZ, 4);
        }
        if (zAfR || !"".equals(hatchPersistedAttachmentJson.attachmentHandle)) {
            c9j5.AAV(hatchPersistedAttachmentJson.attachmentHandle, c9iZ, 5);
        }
        if (zAfR || hatchPersistedAttachmentJson.uploadedPath != null) {
            c9j5.AAP(hatchPersistedAttachmentJson.uploadedPath, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || hatchPersistedAttachmentJson.widget != null) {
            c9j5.AAP(hatchPersistedAttachmentJson.widget, HatchWidget$$serializer.INSTANCE, c9iZ, 7);
        }
    }

    public final HatchPersistedAttachmentJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchWidget hatchWidget) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str3, str4, str5, str6, 2);
        return new HatchPersistedAttachmentJson(str, str2, str3, str4, str5, str6, str7, hatchWidget);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPersistedAttachmentJson) {
                HatchPersistedAttachmentJson hatchPersistedAttachmentJson = (HatchPersistedAttachmentJson) obj;
                if (!C7384Etj.areEqual(this.id, hatchPersistedAttachmentJson.id) || !C7384Etj.areEqual(this.uri, hatchPersistedAttachmentJson.uri) || !C7384Etj.areEqual(this.mimeType, hatchPersistedAttachmentJson.mimeType) || !C7384Etj.areEqual(this.fileName, hatchPersistedAttachmentJson.fileName) || !C7384Etj.areEqual(this.type, hatchPersistedAttachmentJson.type) || !C7384Etj.areEqual(this.attachmentHandle, hatchPersistedAttachmentJson.attachmentHandle) || !C7384Etj.areEqual(this.uploadedPath, hatchPersistedAttachmentJson.uploadedPath) || !C7384Etj.areEqual(this.widget, hatchPersistedAttachmentJson.widget)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPersistedAttachmentJson copy$default(HatchPersistedAttachmentJson hatchPersistedAttachmentJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchWidget hatchWidget, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPersistedAttachmentJson.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchPersistedAttachmentJson.uri;
        }
        if ((i & 4) != 0) {
            str3 = hatchPersistedAttachmentJson.mimeType;
        }
        if ((i & 8) != 0) {
            str4 = hatchPersistedAttachmentJson.fileName;
        }
        if ((i & 16) != 0) {
            str5 = hatchPersistedAttachmentJson.type;
        }
        if ((i & 32) != 0) {
            str6 = hatchPersistedAttachmentJson.attachmentHandle;
        }
        if ((i & 64) != 0) {
            str7 = hatchPersistedAttachmentJson.uploadedPath;
        }
        if ((i & 128) != 0) {
            hatchWidget = hatchPersistedAttachmentJson.widget;
        }
        return hatchPersistedAttachmentJson.copy(str, str2, str3, str4, str5, str6, str7, hatchWidget);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final String component4() {
        return this.fileName;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.attachmentHandle;
    }

    public final String component7() {
        return this.uploadedPath;
    }

    public final HatchWidget component8() {
        return this.widget;
    }

    public final String getAttachmentHandle() {
        return this.attachmentHandle;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUploadedPath() {
        return this.uploadedPath;
    }

    public final String getUri() {
        return this.uri;
    }

    public final HatchWidget getWidget() {
        return this.widget;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.attachmentHandle, AnonymousClass005.A0I(this.type, AnonymousClass005.A0I(this.fileName, AnonymousClass005.A0I(this.mimeType, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.uri)) * 31)))) + AnonymousClass006.A0G(this.uploadedPath)) * 31) + C3cH.A02(this.widget);
    }

    public final HatchAttachment toDomain() {
        return new HatchAttachment(this.id, null, this.uri, this.mimeType, this.fileName, this.type, this.attachmentHandle, null, this.widget, this.uploadedPath);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPersistedAttachmentJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchWidget hatchWidget, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : hatchWidget);
    }

    public /* synthetic */ HatchPersistedAttachmentJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchWidget hatchWidget, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchPersistedAttachmentJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.uri = null;
        } else {
            this.uri = str2;
        }
        if ((i & 4) == 0) {
            this.mimeType = "";
        } else {
            this.mimeType = str3;
        }
        if ((i & 8) == 0) {
            this.fileName = "";
        } else {
            this.fileName = str4;
        }
        if ((i & 16) == 0) {
            this.type = "";
        } else {
            this.type = str5;
        }
        if ((i & 32) == 0) {
            this.attachmentHandle = "";
        } else {
            this.attachmentHandle = str6;
        }
        if ((i & 64) == 0) {
            this.uploadedPath = null;
        } else {
            this.uploadedPath = str7;
        }
        if ((i & 128) == 0) {
            this.widget = null;
        } else {
            this.widget = hatchWidget;
        }
    }
}
