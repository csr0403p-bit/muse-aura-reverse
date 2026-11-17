package com.facebook.aura.conversation.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UploadChipAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UploadChipAction[] $VALUES;
    public static final UploadChipAction RemovedFailed;
    public static final UploadChipAction RemovedImporting;
    public static final UploadChipAction RemovedUploading;
    public static final UploadChipAction RetryTapped;
    public static final UploadChipAction SentWithoutFailed;
    public final String value;

    static {
        UploadChipAction uploadChipAction = new UploadChipAction("RetryTapped", 0, "retry_tapped");
        RetryTapped = uploadChipAction;
        UploadChipAction uploadChipAction2 = new UploadChipAction("RemovedFailed", 1, "removed_failed");
        RemovedFailed = uploadChipAction2;
        UploadChipAction uploadChipAction3 = new UploadChipAction("RemovedUploading", 2, "removed_uploading");
        RemovedUploading = uploadChipAction3;
        UploadChipAction uploadChipAction4 = new UploadChipAction("RemovedImporting", 3, "removed_importing");
        RemovedImporting = uploadChipAction4;
        UploadChipAction uploadChipAction5 = new UploadChipAction("SentWithoutFailed", 4, "sent_without_failed");
        SentWithoutFailed = uploadChipAction5;
        UploadChipAction[] uploadChipActionArr = {uploadChipAction, uploadChipAction2, uploadChipAction3, uploadChipAction4, uploadChipAction5};
        $VALUES = uploadChipActionArr;
        $ENTRIES = C3cG.A0w(uploadChipActionArr);
    }

    public static Ey9<UploadChipAction> getEntries() {
        return $ENTRIES;
    }

    public static UploadChipAction valueOf(String str) {
        return (UploadChipAction) Enum.valueOf(UploadChipAction.class, str);
    }

    public static UploadChipAction[] values() {
        return (UploadChipAction[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public UploadChipAction(String str, int i, String str2) {
        this.value = str2;
    }
}
