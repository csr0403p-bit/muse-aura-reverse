package com.facebook.aura.explore.repo;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaFeedbackResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaFeedbackResult[] $VALUES;
    public static final IdeaFeedbackResult FAILED;
    public static final IdeaFeedbackResult NOT_FOUND;
    public static final IdeaFeedbackResult SUCCESS;

    static {
        IdeaFeedbackResult ideaFeedbackResult = new IdeaFeedbackResult("SUCCESS", 0);
        SUCCESS = ideaFeedbackResult;
        IdeaFeedbackResult ideaFeedbackResult2 = new IdeaFeedbackResult("NOT_FOUND", 1);
        NOT_FOUND = ideaFeedbackResult2;
        IdeaFeedbackResult ideaFeedbackResult3 = new IdeaFeedbackResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = ideaFeedbackResult3;
        IdeaFeedbackResult[] ideaFeedbackResultArr = {ideaFeedbackResult, ideaFeedbackResult2, ideaFeedbackResult3};
        $VALUES = ideaFeedbackResultArr;
        $ENTRIES = new F3w(ideaFeedbackResultArr);
    }

    public static Ey9<IdeaFeedbackResult> getEntries() {
        return $ENTRIES;
    }

    public static IdeaFeedbackResult valueOf(String str) {
        return (IdeaFeedbackResult) Enum.valueOf(IdeaFeedbackResult.class, str);
    }

    public static IdeaFeedbackResult[] values() {
        return (IdeaFeedbackResult[]) $VALUES.clone();
    }

    public IdeaFeedbackResult(String str, int i) {
    }
}
