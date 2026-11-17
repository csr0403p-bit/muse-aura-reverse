package com.facebook.aura.commands.calllogs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C60R;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class CanonicalCallLogPayload extends C06G {
    public final List<CanonicalCallLogEntry> entries;
    public final String platform;
    public final long syncedAt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalCallLogPayload) {
                CanonicalCallLogPayload canonicalCallLogPayload = (CanonicalCallLogPayload) obj;
                if (!C7384Etj.areEqual(this.platform, canonicalCallLogPayload.platform) || this.syncedAt != canonicalCallLogPayload.syncedAt || !C7384Etj.areEqual(this.entries, canonicalCallLogPayload.entries)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanonicalCallLogPayload copy$default(CanonicalCallLogPayload canonicalCallLogPayload, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = canonicalCallLogPayload.platform;
        }
        if ((i & 2) != 0) {
            j = canonicalCallLogPayload.syncedAt;
        }
        if ((i & 4) != 0) {
            list = canonicalCallLogPayload.entries;
        }
        return canonicalCallLogPayload.copy(str, j, list);
    }

    public final String component1() {
        return this.platform;
    }

    public final long component2() {
        return this.syncedAt;
    }

    public final List<CanonicalCallLogEntry> component3() {
        return this.entries;
    }

    public final List<CanonicalCallLogEntry> getEntries() {
        return this.entries;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getSyncedAt() {
        return this.syncedAt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.entries, C60R.A00(this.syncedAt, AnonymousClass001.A0G(this.platform)));
    }

    public CanonicalCallLogPayload(String str, long j, List<CanonicalCallLogEntry> list) {
        AnonymousClass003.A0v(str, list);
        this.platform = str;
        this.syncedAt = j;
        this.entries = list;
    }

    public final CanonicalCallLogPayload copy(String str, long j, List<CanonicalCallLogEntry> list) {
        AnonymousClass003.A0v(str, list);
        return new CanonicalCallLogPayload(str, j, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CanonicalCallLogPayload(String str, long j, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "android" : str, j, list);
    }
}
