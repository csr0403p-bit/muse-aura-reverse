package com.facebook.aura.login.credentials;

import X.AnonymousClass005;

/* loaded from: classes2.dex */
public final class SealedRecord {
    public final AuraRememberedAccount account;
    public final String sealed;
    public final String slot;

    public final AuraRememberedAccount getAccount() {
        return this.account;
    }

    public final String getSealed() {
        return this.sealed;
    }

    public final String getSlot() {
        return this.slot;
    }

    public SealedRecord(String str, String str2, AuraRememberedAccount auraRememberedAccount) {
        AnonymousClass005.A0x(str, str2, auraRememberedAccount);
        this.slot = str;
        this.sealed = str2;
        this.account = auraRememberedAccount;
    }
}
