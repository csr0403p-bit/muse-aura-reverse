package com.facebook.aura.conversation.viewmodel;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UploadStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UploadStage[] $VALUES;
    public static final UploadStage Cancelled;
    public static final UploadStage Compress;
    public static final UploadStage LoadFailed;
    public static final UploadStage ServerReject;
    public static final UploadStage Stage;
    public static final UploadStage Upload;
    public final String value;

    static {
        UploadStage uploadStage = new UploadStage("Compress", 0, "compress");
        Compress = uploadStage;
        UploadStage uploadStage2 = new UploadStage("Stage", 1, AgeCheckFunnelLogging.KEY_STAGE);
        Stage = uploadStage2;
        UploadStage uploadStage3 = new UploadStage("LoadFailed", 2, "load_failed");
        LoadFailed = uploadStage3;
        UploadStage uploadStage4 = new UploadStage("Upload", 3, "upload");
        Upload = uploadStage4;
        UploadStage uploadStage5 = new UploadStage("ServerReject", 4, "server_reject");
        ServerReject = uploadStage5;
        UploadStage uploadStage6 = new UploadStage("Cancelled", 5, "cancelled");
        Cancelled = uploadStage6;
        UploadStage[] uploadStageArr = {uploadStage, uploadStage2, uploadStage3, uploadStage4, uploadStage5, uploadStage6};
        $VALUES = uploadStageArr;
        $ENTRIES = C3cG.A0w(uploadStageArr);
    }

    public static Ey9<UploadStage> getEntries() {
        return $ENTRIES;
    }

    public static UploadStage valueOf(String str) {
        return (UploadStage) Enum.valueOf(UploadStage.class, str);
    }

    public static UploadStage[] values() {
        return (UploadStage[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public UploadStage(String str, int i, String str2) {
        this.value = str2;
    }
}
