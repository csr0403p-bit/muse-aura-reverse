package com.facebook.aura.composer.upload;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C27k;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HsJ;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchPendingAttachment extends C06G {
    public final AttachmentCategory category;
    public final String filename;
    public final UploadLogAttachment logAttachment;
    public final String mimeType;
    public final File stagedFile;
    public final C27k<HsJ<Unit>> uploadJob;
    public final String uploadPath;
    public final boolean uploadSucceeded;

    public HatchPendingAttachment(File file, String str, String str2, AttachmentCategory attachmentCategory, String str3, C27k<HsJ<Unit>> c27k, boolean z, UploadLogAttachment uploadLogAttachment) {
        AnonymousClass005.A11(str, str2, attachmentCategory, 1);
        C7384Etj.A0Y(str3, 4);
        C7384Etj.A0Y(uploadLogAttachment, 7);
        this.stagedFile = file;
        this.filename = str;
        this.mimeType = str2;
        this.category = attachmentCategory;
        this.uploadPath = str3;
        this.uploadJob = c27k;
        this.uploadSucceeded = z;
        this.logAttachment = uploadLogAttachment;
    }

    public final HatchPendingAttachment copy(File file, String str, String str2, AttachmentCategory attachmentCategory, String str3, C27k<HsJ<Unit>> c27k, boolean z, UploadLogAttachment uploadLogAttachment) {
        AnonymousClass005.A11(str, str2, attachmentCategory, 1);
        C7384Etj.A0Y(str3, 4);
        C7384Etj.A0Y(uploadLogAttachment, 7);
        return new HatchPendingAttachment(file, str, str2, attachmentCategory, str3, c27k, z, uploadLogAttachment);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPendingAttachment) {
                HatchPendingAttachment hatchPendingAttachment = (HatchPendingAttachment) obj;
                if (!C7384Etj.areEqual(this.stagedFile, hatchPendingAttachment.stagedFile) || !C7384Etj.areEqual(this.filename, hatchPendingAttachment.filename) || !C7384Etj.areEqual(this.mimeType, hatchPendingAttachment.mimeType) || this.category != hatchPendingAttachment.category || !C7384Etj.areEqual(this.uploadPath, hatchPendingAttachment.uploadPath) || !C7384Etj.areEqual(this.uploadJob, hatchPendingAttachment.uploadJob) || this.uploadSucceeded != hatchPendingAttachment.uploadSucceeded || !C7384Etj.areEqual(this.logAttachment, hatchPendingAttachment.logAttachment)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchPendingAttachment copy$default(HatchPendingAttachment hatchPendingAttachment, File file, String str, String str2, AttachmentCategory attachmentCategory, String str3, C27k c27k, boolean z, UploadLogAttachment uploadLogAttachment, int i, Object obj) {
        if ((i & 1) != 0) {
            file = hatchPendingAttachment.stagedFile;
        }
        if ((i & 2) != 0) {
            str = hatchPendingAttachment.filename;
        }
        if ((i & 4) != 0) {
            str2 = hatchPendingAttachment.mimeType;
        }
        if ((i & 8) != 0) {
            attachmentCategory = hatchPendingAttachment.category;
        }
        if ((i & 16) != 0) {
            str3 = hatchPendingAttachment.uploadPath;
        }
        if ((i & 32) != 0) {
            c27k = hatchPendingAttachment.uploadJob;
        }
        if ((i & 64) != 0) {
            z = hatchPendingAttachment.uploadSucceeded;
        }
        if ((i & 128) != 0) {
            uploadLogAttachment = hatchPendingAttachment.logAttachment;
        }
        return hatchPendingAttachment.copy(file, str, str2, attachmentCategory, str3, c27k, z, uploadLogAttachment);
    }

    public final File component1() {
        return this.stagedFile;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final AttachmentCategory component4() {
        return this.category;
    }

    public final String component5() {
        return this.uploadPath;
    }

    public final C27k<HsJ<Unit>> component6() {
        return this.uploadJob;
    }

    public final boolean component7() {
        return this.uploadSucceeded;
    }

    public final UploadLogAttachment component8() {
        return this.logAttachment;
    }

    public final AttachmentCategory getCategory() {
        return this.category;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final UploadLogAttachment getLogAttachment() {
        return this.logAttachment;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean getShouldUpload() {
        return AnonymousClass002.A1X(this.uploadJob);
    }

    public final File getStagedFile() {
        return this.stagedFile;
    }

    public final C27k<HsJ<Unit>> getUploadJob() {
        return this.uploadJob;
    }

    public final String getUploadPath() {
        return this.uploadPath;
    }

    public final boolean getUploadSucceeded() {
        return this.uploadSucceeded;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.logAttachment, C0KA.A01((AnonymousClass005.A0I(this.uploadPath, AnonymousClass005.A0F(this.category, AnonymousClass005.A0I(this.mimeType, AnonymousClass005.A0I(this.filename, AnonymousClass006.A0D(this.stagedFile) * 31)))) + C3cH.A02(this.uploadJob)) * 31, this.uploadSucceeded));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPendingAttachment(File file, String str, String str2, AttachmentCategory attachmentCategory, String str3, C27k c27k, boolean z, UploadLogAttachment uploadLogAttachment, int i, C06H c06h) {
        this((i & 1) != 0 ? null : file, str, str2, attachmentCategory, str3, (i & 32) != 0 ? null : c27k, C3cG.A1K(i & 64, z), uploadLogAttachment);
    }
}
