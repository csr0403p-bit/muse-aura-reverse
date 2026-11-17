package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkEncryptedDecryptFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkEncryptedDecryptFailure[] $VALUES;
    public static final LinkEncryptedDecryptFailure AUTHENTICATION_FAILED;
    public static final LinkEncryptedDecryptFailure INVALID_CIPHERTEXT;
    public static final LinkEncryptedDecryptFailure INVALID_COUNTER;
    public static final LinkEncryptedDecryptFailure SESSION_MISMATCH;
    public static final LinkEncryptedDecryptFailure UNEXPECTED_COUNTER;

    static {
        LinkEncryptedDecryptFailure linkEncryptedDecryptFailure = new LinkEncryptedDecryptFailure("SESSION_MISMATCH", 0);
        SESSION_MISMATCH = linkEncryptedDecryptFailure;
        LinkEncryptedDecryptFailure linkEncryptedDecryptFailure2 = new LinkEncryptedDecryptFailure("INVALID_COUNTER", 1);
        INVALID_COUNTER = linkEncryptedDecryptFailure2;
        LinkEncryptedDecryptFailure linkEncryptedDecryptFailure3 = new LinkEncryptedDecryptFailure("UNEXPECTED_COUNTER", 2);
        UNEXPECTED_COUNTER = linkEncryptedDecryptFailure3;
        LinkEncryptedDecryptFailure linkEncryptedDecryptFailure4 = new LinkEncryptedDecryptFailure("INVALID_CIPHERTEXT", 3);
        INVALID_CIPHERTEXT = linkEncryptedDecryptFailure4;
        LinkEncryptedDecryptFailure linkEncryptedDecryptFailure5 = new LinkEncryptedDecryptFailure("AUTHENTICATION_FAILED", 4);
        AUTHENTICATION_FAILED = linkEncryptedDecryptFailure5;
        LinkEncryptedDecryptFailure[] linkEncryptedDecryptFailureArr = {linkEncryptedDecryptFailure, linkEncryptedDecryptFailure2, linkEncryptedDecryptFailure3, linkEncryptedDecryptFailure4, linkEncryptedDecryptFailure5};
        $VALUES = linkEncryptedDecryptFailureArr;
        $ENTRIES = C3cG.A0w(linkEncryptedDecryptFailureArr);
    }

    public static Ey9<LinkEncryptedDecryptFailure> getEntries() {
        return $ENTRIES;
    }

    public static LinkEncryptedDecryptFailure valueOf(String str) {
        return (LinkEncryptedDecryptFailure) Enum.valueOf(LinkEncryptedDecryptFailure.class, str);
    }

    public static LinkEncryptedDecryptFailure[] values() {
        return (LinkEncryptedDecryptFailure[]) $VALUES.clone();
    }

    public LinkEncryptedDecryptFailure(String str, int i) {
    }
}
