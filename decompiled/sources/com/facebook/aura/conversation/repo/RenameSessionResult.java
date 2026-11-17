package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RenameSessionResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RenameSessionResult[] $VALUES;
    public static final RenameSessionResult FAILED;
    public static final RenameSessionResult SUCCESS;
    public static final RenameSessionResult TITLE_TOO_LONG;

    static {
        RenameSessionResult renameSessionResult = new RenameSessionResult("SUCCESS", 0);
        SUCCESS = renameSessionResult;
        RenameSessionResult renameSessionResult2 = new RenameSessionResult("TITLE_TOO_LONG", 1);
        TITLE_TOO_LONG = renameSessionResult2;
        RenameSessionResult renameSessionResult3 = new RenameSessionResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = renameSessionResult3;
        RenameSessionResult[] renameSessionResultArr = {renameSessionResult, renameSessionResult2, renameSessionResult3};
        $VALUES = renameSessionResultArr;
        $ENTRIES = C3cG.A0w(renameSessionResultArr);
    }

    public static Ey9<RenameSessionResult> getEntries() {
        return $ENTRIES;
    }

    public static RenameSessionResult valueOf(String str) {
        return (RenameSessionResult) Enum.valueOf(RenameSessionResult.class, str);
    }

    public static RenameSessionResult[] values() {
        return (RenameSessionResult[]) $VALUES.clone();
    }

    public RenameSessionResult(String str, int i) {
    }
}
