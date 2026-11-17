package com.facebook.aura.auth.postconsolidation;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PostConsolidationCredentialRefreshResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PostConsolidationCredentialRefreshResult[] $VALUES;
    public static final PostConsolidationCredentialRefreshResult EXCHANGE_FAILED;
    public static final PostConsolidationCredentialRefreshResult IDENTITY_MISMATCH;
    public static final PostConsolidationCredentialRefreshResult MISSING_SURVIVOR_CREDENTIAL;
    public static final PostConsolidationCredentialRefreshResult NON_SESSION_OUTCOME;
    public static final PostConsolidationCredentialRefreshResult PERSISTENCE_FAILED;
    public static final PostConsolidationCredentialRefreshResult SESSION_CHANGED;
    public static final PostConsolidationCredentialRefreshResult SUCCESS;
    public static final PostConsolidationCredentialRefreshResult TEMP_TOKEN_UNAVAILABLE;
    public final String value;

    static {
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult = new PostConsolidationCredentialRefreshResult("SUCCESS", 0, "success");
        SUCCESS = postConsolidationCredentialRefreshResult;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult2 = new PostConsolidationCredentialRefreshResult("MISSING_SURVIVOR_CREDENTIAL", 1, "missing_survivor_credential");
        MISSING_SURVIVOR_CREDENTIAL = postConsolidationCredentialRefreshResult2;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult3 = new PostConsolidationCredentialRefreshResult("TEMP_TOKEN_UNAVAILABLE", 2, HatchCaaErrorType.TEMP_TOKEN_UNAVAILABLE);
        TEMP_TOKEN_UNAVAILABLE = postConsolidationCredentialRefreshResult3;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult4 = new PostConsolidationCredentialRefreshResult("EXCHANGE_FAILED", 3, "exchange_failed");
        EXCHANGE_FAILED = postConsolidationCredentialRefreshResult4;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult5 = new PostConsolidationCredentialRefreshResult("PERSISTENCE_FAILED", 4, "persistence_failed");
        PERSISTENCE_FAILED = postConsolidationCredentialRefreshResult5;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult6 = new PostConsolidationCredentialRefreshResult("NON_SESSION_OUTCOME", 5, "non_session_outcome");
        NON_SESSION_OUTCOME = postConsolidationCredentialRefreshResult6;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult7 = new PostConsolidationCredentialRefreshResult("IDENTITY_MISMATCH", 6, "identity_mismatch");
        IDENTITY_MISMATCH = postConsolidationCredentialRefreshResult7;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult8 = new PostConsolidationCredentialRefreshResult("SESSION_CHANGED", 7, "session_changed");
        SESSION_CHANGED = postConsolidationCredentialRefreshResult8;
        PostConsolidationCredentialRefreshResult[] postConsolidationCredentialRefreshResultArr = {postConsolidationCredentialRefreshResult, postConsolidationCredentialRefreshResult2, postConsolidationCredentialRefreshResult3, postConsolidationCredentialRefreshResult4, postConsolidationCredentialRefreshResult5, postConsolidationCredentialRefreshResult6, postConsolidationCredentialRefreshResult7, postConsolidationCredentialRefreshResult8};
        $VALUES = postConsolidationCredentialRefreshResultArr;
        $ENTRIES = C3cG.A0w(postConsolidationCredentialRefreshResultArr);
    }

    public static Ey9<PostConsolidationCredentialRefreshResult> getEntries() {
        return $ENTRIES;
    }

    public static PostConsolidationCredentialRefreshResult valueOf(String str) {
        return (PostConsolidationCredentialRefreshResult) Enum.valueOf(PostConsolidationCredentialRefreshResult.class, str);
    }

    public static PostConsolidationCredentialRefreshResult[] values() {
        return (PostConsolidationCredentialRefreshResult[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public PostConsolidationCredentialRefreshResult(String str, int i, String str2) {
        this.value = str2;
    }
}
