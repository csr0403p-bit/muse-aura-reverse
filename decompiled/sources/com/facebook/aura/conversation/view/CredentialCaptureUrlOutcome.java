package com.facebook.aura.conversation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CredentialCaptureUrlOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CredentialCaptureUrlOutcome[] $VALUES;
    public static final CredentialCaptureUrlOutcome NAVIGATED;
    public static final CredentialCaptureUrlOutcome NOT_CREDENTIAL_CAPTURE;
    public static final CredentialCaptureUrlOutcome UNSUPPORTED_REQUEST;

    static {
        CredentialCaptureUrlOutcome credentialCaptureUrlOutcome = new CredentialCaptureUrlOutcome("NOT_CREDENTIAL_CAPTURE", 0);
        NOT_CREDENTIAL_CAPTURE = credentialCaptureUrlOutcome;
        CredentialCaptureUrlOutcome credentialCaptureUrlOutcome2 = new CredentialCaptureUrlOutcome("NAVIGATED", 1);
        NAVIGATED = credentialCaptureUrlOutcome2;
        CredentialCaptureUrlOutcome credentialCaptureUrlOutcome3 = new CredentialCaptureUrlOutcome("UNSUPPORTED_REQUEST", 2);
        UNSUPPORTED_REQUEST = credentialCaptureUrlOutcome3;
        CredentialCaptureUrlOutcome[] credentialCaptureUrlOutcomeArr = {credentialCaptureUrlOutcome, credentialCaptureUrlOutcome2, credentialCaptureUrlOutcome3};
        $VALUES = credentialCaptureUrlOutcomeArr;
        $ENTRIES = C3cG.A0w(credentialCaptureUrlOutcomeArr);
    }

    public static Ey9<CredentialCaptureUrlOutcome> getEntries() {
        return $ENTRIES;
    }

    public static CredentialCaptureUrlOutcome valueOf(String str) {
        return (CredentialCaptureUrlOutcome) Enum.valueOf(CredentialCaptureUrlOutcome.class, str);
    }

    public static CredentialCaptureUrlOutcome[] values() {
        return (CredentialCaptureUrlOutcome[]) $VALUES.clone();
    }

    public CredentialCaptureUrlOutcome(String str, int i) {
    }
}
