package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class HatchAttachment extends C06G {
    public static final int $stable = 8;
    public final String attachmentHandle;
    public final byte[] data;
    public final String fileName;
    public final String id;
    public final String mimeType;
    public final Bitmap previewBitmap;
    public final String type;
    public final String uploadedPath;
    public final String uri;
    public final HatchWidget widget;

    public HatchAttachment() {
        this(AnonymousClass002.A0k(), null, null, "", "", "", "", null, null, null);
    }

    public final HatchAttachment copy(String str, byte[] bArr, String str2, String str3, String str4, String str5, String str6, Bitmap bitmap, HatchWidget hatchWidget, String str7) {
        AnonymousClass005.A16(str, str3, str4, str5, 0);
        C7384Etj.A0Y(str6, 6);
        return new HatchAttachment(str, bArr, str2, str3, str4, str5, str6, bitmap, hatchWidget, str7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttachment) {
                HatchAttachment hatchAttachment = (HatchAttachment) obj;
                if (!C7384Etj.areEqual(this.id, hatchAttachment.id) || !C7384Etj.areEqual(this.data, hatchAttachment.data) || !C7384Etj.areEqual(this.uri, hatchAttachment.uri) || !C7384Etj.areEqual(this.mimeType, hatchAttachment.mimeType) || !C7384Etj.areEqual(this.fileName, hatchAttachment.fileName) || !C7384Etj.areEqual(this.type, hatchAttachment.type) || !C7384Etj.areEqual(this.attachmentHandle, hatchAttachment.attachmentHandle) || !C7384Etj.areEqual(this.previewBitmap, hatchAttachment.previewBitmap) || !C7384Etj.areEqual(this.widget, hatchAttachment.widget) || !C7384Etj.areEqual(this.uploadedPath, hatchAttachment.uploadedPath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAttachment copy$default(HatchAttachment hatchAttachment, String str, byte[] bArr, String str2, String str3, String str4, String str5, String str6, Bitmap bitmap, HatchWidget hatchWidget, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttachment.id;
        }
        if ((i & 2) != 0) {
            bArr = hatchAttachment.data;
        }
        if ((i & 4) != 0) {
            str2 = hatchAttachment.uri;
        }
        if ((i & 8) != 0) {
            str3 = hatchAttachment.mimeType;
        }
        if ((i & 16) != 0) {
            str4 = hatchAttachment.fileName;
        }
        if ((i & 32) != 0) {
            str5 = hatchAttachment.type;
        }
        if ((i & 64) != 0) {
            str6 = hatchAttachment.attachmentHandle;
        }
        if ((i & 128) != 0) {
            bitmap = hatchAttachment.previewBitmap;
        }
        if ((i & 256) != 0) {
            hatchWidget = hatchAttachment.widget;
        }
        if ((i & 512) != 0) {
            str7 = hatchAttachment.uploadedPath;
        }
        return hatchAttachment.copy(str, bArr, str2, str3, str4, str5, str6, bitmap, hatchWidget, str7);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.uploadedPath;
    }

    public final byte[] component2() {
        return this.data;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final String component5() {
        return this.fileName;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.attachmentHandle;
    }

    public final Bitmap component8() {
        return this.previewBitmap;
    }

    public final HatchWidget component9() {
        return this.widget;
    }

    public final String getAttachmentHandle() {
        return this.attachmentHandle;
    }

    public final byte[] getData() {
        return this.data;
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

    public final Bitmap getPreviewBitmap() {
        return this.previewBitmap;
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
        int iA0G = AnonymousClass001.A0G(this.id);
        byte[] bArr = this.data;
        return ((((AnonymousClass005.A0I(this.attachmentHandle, AnonymousClass005.A0I(this.type, AnonymousClass005.A0I(this.fileName, AnonymousClass005.A0I(this.mimeType, (((iA0G + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + AnonymousClass006.A0G(this.uri)) * 31)))) + AnonymousClass006.A0D(this.previewBitmap)) * 31) + AnonymousClass006.A0D(this.widget)) * 31) + AnonymousClass005.A0H(this.uploadedPath);
    }

    public final boolean isAudio() {
        return C60O.A1X(this.mimeType, "audio/");
    }

    public final boolean isImage() {
        return C60O.A1X(this.mimeType, "image/");
    }

    public final boolean isWidget() {
        return "widget".equals(this.type) || this.widget != null;
    }

    public final String getResolvedType() {
        return isWidget() ? "widget" : isImage() ? "image" : "file";
    }

    public String toString() {
        return super.toString();
    }

    public HatchAttachment(String str, byte[] bArr, String str2, String str3, String str4, String str5, String str6, Bitmap bitmap, HatchWidget hatchWidget, String str7) {
        AnonymousClass005.A16(str, str3, str4, str5, 0);
        C7384Etj.A0Y(str6, 6);
        this.id = str;
        this.data = bArr;
        this.uri = str2;
        this.mimeType = str3;
        this.fileName = str4;
        this.type = str5;
        this.attachmentHandle = str6;
        this.previewBitmap = bitmap;
        this.widget = hatchWidget;
        this.uploadedPath = str7;
    }

    public /* synthetic */ HatchAttachment(String str, byte[] bArr, String str2, String str3, String str4, String str5, String str6, Bitmap bitmap, HatchWidget hatchWidget, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass002.A0k() : str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? null : bitmap, (i & 256) != 0 ? null : hatchWidget, (i & 512) != 0 ? null : str7);
    }
}
