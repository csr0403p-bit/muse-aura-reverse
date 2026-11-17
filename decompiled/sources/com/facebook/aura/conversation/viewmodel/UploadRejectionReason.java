package com.facebook.aura.conversation.viewmodel;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.commands.sms.SmsMediaUploader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UploadRejectionReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UploadRejectionReason[] $VALUES;
    public static final UploadRejectionReason AttachmentCap;
    public static final UploadRejectionReason ReadFailed;
    public static final UploadRejectionReason TooLarge;
    public final String value;

    static {
        UploadRejectionReason uploadRejectionReason = new UploadRejectionReason("TooLarge", 0, SmsMediaUploader.REASON_TOO_LARGE);
        TooLarge = uploadRejectionReason;
        UploadRejectionReason uploadRejectionReason2 = new UploadRejectionReason("AttachmentCap", 1, "attachment_cap");
        AttachmentCap = uploadRejectionReason2;
        UploadRejectionReason uploadRejectionReason3 = new UploadRejectionReason("ReadFailed", 2, "read_failed");
        ReadFailed = uploadRejectionReason3;
        UploadRejectionReason[] uploadRejectionReasonArr = {uploadRejectionReason, uploadRejectionReason2, uploadRejectionReason3};
        $VALUES = uploadRejectionReasonArr;
        $ENTRIES = C3cG.A0w(uploadRejectionReasonArr);
    }

    public static Ey9<UploadRejectionReason> getEntries() {
        return $ENTRIES;
    }

    public static UploadRejectionReason valueOf(String str) {
        return (UploadRejectionReason) Enum.valueOf(UploadRejectionReason.class, str);
    }

    public static UploadRejectionReason[] values() {
        return (UploadRejectionReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public UploadRejectionReason(String str, int i, String str2) {
        this.value = str2;
    }
}
