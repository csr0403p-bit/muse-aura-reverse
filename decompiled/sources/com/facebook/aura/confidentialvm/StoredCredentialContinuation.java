package com.facebook.aura.confidentialvm;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StoredCredentialContinuation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StoredCredentialContinuation[] $VALUES;
    public static final StoredCredentialContinuation RETRIABLE_FAILURE;
    public static final StoredCredentialContinuation RETRY;
    public static final StoredCredentialContinuation SECURITY_FAILURE;
    public static final StoredCredentialContinuation SHOW_PROMPT;

    static {
        StoredCredentialContinuation storedCredentialContinuation = new StoredCredentialContinuation("SHOW_PROMPT", 0);
        SHOW_PROMPT = storedCredentialContinuation;
        StoredCredentialContinuation storedCredentialContinuation2 = new StoredCredentialContinuation("RETRY", 1);
        RETRY = storedCredentialContinuation2;
        StoredCredentialContinuation storedCredentialContinuation3 = new StoredCredentialContinuation("RETRIABLE_FAILURE", 2);
        RETRIABLE_FAILURE = storedCredentialContinuation3;
        StoredCredentialContinuation storedCredentialContinuation4 = new StoredCredentialContinuation("SECURITY_FAILURE", 3);
        SECURITY_FAILURE = storedCredentialContinuation4;
        StoredCredentialContinuation[] storedCredentialContinuationArr = {storedCredentialContinuation, storedCredentialContinuation2, storedCredentialContinuation3, storedCredentialContinuation4};
        $VALUES = storedCredentialContinuationArr;
        $ENTRIES = C3cG.A0w(storedCredentialContinuationArr);
    }

    public static Ey9<StoredCredentialContinuation> getEntries() {
        return $ENTRIES;
    }

    public static StoredCredentialContinuation valueOf(String str) {
        return (StoredCredentialContinuation) Enum.valueOf(StoredCredentialContinuation.class, str);
    }

    public static StoredCredentialContinuation[] values() {
        return (StoredCredentialContinuation[]) $VALUES.clone();
    }

    public StoredCredentialContinuation(String str, int i) {
    }
}
