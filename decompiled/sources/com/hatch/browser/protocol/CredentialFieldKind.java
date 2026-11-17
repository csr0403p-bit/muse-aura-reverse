package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CredentialFieldKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CredentialFieldKind[] $VALUES;
    public static final Companion Companion;
    public static final CredentialFieldKind PASSWORD;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        CredentialFieldKind credentialFieldKind = new CredentialFieldKind("PASSWORD", 0);
        PASSWORD = credentialFieldKind;
        CredentialFieldKind[] credentialFieldKindArr = {credentialFieldKind};
        $VALUES = credentialFieldKindArr;
        $ENTRIES = C3cG.A0w(credentialFieldKindArr);
        Companion = new Companion();
    }

    public static Ey9<CredentialFieldKind> getEntries() {
        return $ENTRIES;
    }

    public static CredentialFieldKind valueOf(String str) {
        return (CredentialFieldKind) Enum.valueOf(CredentialFieldKind.class, str);
    }

    public static CredentialFieldKind[] values() {
        return (CredentialFieldKind[]) $VALUES.clone();
    }

    public CredentialFieldKind(String str, int i) {
    }
}
