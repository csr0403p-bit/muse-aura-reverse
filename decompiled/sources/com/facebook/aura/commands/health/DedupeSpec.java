package com.facebook.aura.commands.health;

import X.AnonymousClass005;

/* loaded from: classes6.dex */
public final class DedupeSpec {
    public final String datatype;
    public final String fingerprint;
    public final String key;

    public final String getDatatype() {
        return this.datatype;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getKey() {
        return this.key;
    }

    public DedupeSpec(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.datatype = str;
        this.fingerprint = str2;
        this.key = str3;
    }
}
