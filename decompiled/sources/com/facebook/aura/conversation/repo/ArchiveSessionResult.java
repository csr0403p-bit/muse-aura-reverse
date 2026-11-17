package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ArchiveSessionResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArchiveSessionResult[] $VALUES;
    public static final ArchiveSessionResult FAILED;
    public static final ArchiveSessionResult SUCCESS;
    public static final ArchiveSessionResult VOICE_CALL_ACTIVE;

    static {
        ArchiveSessionResult archiveSessionResult = new ArchiveSessionResult("SUCCESS", 0);
        SUCCESS = archiveSessionResult;
        ArchiveSessionResult archiveSessionResult2 = new ArchiveSessionResult("VOICE_CALL_ACTIVE", 1);
        VOICE_CALL_ACTIVE = archiveSessionResult2;
        ArchiveSessionResult archiveSessionResult3 = new ArchiveSessionResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = archiveSessionResult3;
        ArchiveSessionResult[] archiveSessionResultArr = {archiveSessionResult, archiveSessionResult2, archiveSessionResult3};
        $VALUES = archiveSessionResultArr;
        $ENTRIES = C3cG.A0w(archiveSessionResultArr);
    }

    public static Ey9<ArchiveSessionResult> getEntries() {
        return $ENTRIES;
    }

    public static ArchiveSessionResult valueOf(String str) {
        return (ArchiveSessionResult) Enum.valueOf(ArchiveSessionResult.class, str);
    }

    public static ArchiveSessionResult[] values() {
        return (ArchiveSessionResult[]) $VALUES.clone();
    }

    public ArchiveSessionResult(String str, int i) {
    }
}
