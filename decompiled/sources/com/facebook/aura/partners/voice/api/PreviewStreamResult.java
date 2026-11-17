package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PreviewStreamResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PreviewStreamResult[] $VALUES;
    public static final PreviewStreamResult COMPLETED;
    public static final PreviewStreamResult HTTP_STATUS;
    public static final PreviewStreamResult OFFLINE;
    public static final PreviewStreamResult TIMEOUT;
    public static final PreviewStreamResult TRANSPORT;
    public static final PreviewStreamResult UNEXPECTED;
    public final String value;

    static {
        PreviewStreamResult previewStreamResult = new PreviewStreamResult("COMPLETED", 0, "completed");
        COMPLETED = previewStreamResult;
        PreviewStreamResult previewStreamResult2 = new PreviewStreamResult("HTTP_STATUS", 1, "http_status");
        HTTP_STATUS = previewStreamResult2;
        PreviewStreamResult previewStreamResult3 = new PreviewStreamResult("OFFLINE", 2, "offline");
        OFFLINE = previewStreamResult3;
        PreviewStreamResult previewStreamResult4 = new PreviewStreamResult("TRANSPORT", 3, HatchDataExportRepositoryKt.FAILURE_TRANSPORT);
        TRANSPORT = previewStreamResult4;
        PreviewStreamResult previewStreamResult5 = new PreviewStreamResult("TIMEOUT", 4, "timeout");
        TIMEOUT = previewStreamResult5;
        PreviewStreamResult previewStreamResult6 = new PreviewStreamResult("UNEXPECTED", 5, "unexpected");
        UNEXPECTED = previewStreamResult6;
        PreviewStreamResult[] previewStreamResultArr = {previewStreamResult, previewStreamResult2, previewStreamResult3, previewStreamResult4, previewStreamResult5, previewStreamResult6};
        $VALUES = previewStreamResultArr;
        $ENTRIES = C3cG.A0w(previewStreamResultArr);
    }

    public static Ey9<PreviewStreamResult> getEntries() {
        return $ENTRIES;
    }

    public static PreviewStreamResult valueOf(String str) {
        return (PreviewStreamResult) Enum.valueOf(PreviewStreamResult.class, str);
    }

    public static PreviewStreamResult[] values() {
        return (PreviewStreamResult[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public PreviewStreamResult(String str, int i, String str2) {
        this.value = str2;
    }
}
