package com.facebook.aura.commands.sms;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C60R;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class CanonicalSmsPayload extends C06G {
    public final List<CanonicalSmsMessage> messages;
    public final String platform;
    public final long syncedAtMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalSmsPayload) {
                CanonicalSmsPayload canonicalSmsPayload = (CanonicalSmsPayload) obj;
                if (!C7384Etj.areEqual(this.platform, canonicalSmsPayload.platform) || this.syncedAtMs != canonicalSmsPayload.syncedAtMs || !C7384Etj.areEqual(this.messages, canonicalSmsPayload.messages)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanonicalSmsPayload copy$default(CanonicalSmsPayload canonicalSmsPayload, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = canonicalSmsPayload.platform;
        }
        if ((i & 2) != 0) {
            j = canonicalSmsPayload.syncedAtMs;
        }
        if ((i & 4) != 0) {
            list = canonicalSmsPayload.messages;
        }
        return canonicalSmsPayload.copy(str, j, list);
    }

    public final String component1() {
        return this.platform;
    }

    public final long component2() {
        return this.syncedAtMs;
    }

    public final List<CanonicalSmsMessage> component3() {
        return this.messages;
    }

    public final List<CanonicalSmsMessage> getMessages() {
        return this.messages;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getSyncedAtMs() {
        return this.syncedAtMs;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.messages, C60R.A00(this.syncedAtMs, AnonymousClass001.A0G(this.platform)));
    }

    public CanonicalSmsPayload(String str, long j, List<CanonicalSmsMessage> list) {
        AnonymousClass003.A0v(str, list);
        this.platform = str;
        this.syncedAtMs = j;
        this.messages = list;
    }

    public final CanonicalSmsPayload copy(String str, long j, List<CanonicalSmsMessage> list) {
        AnonymousClass003.A0v(str, list);
        return new CanonicalSmsPayload(str, j, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CanonicalSmsPayload(String str, long j, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "android" : str, j, list);
    }
}
