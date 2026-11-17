package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionRuleSavedJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long revision;

    public final class Companion {
        public final C9hr<ConnectionRuleSavedJson> serializer() {
            return ConnectionRuleSavedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectionRuleSavedJson) && this.revision == ((ConnectionRuleSavedJson) obj).revision);
    }

    public /* synthetic */ ConnectionRuleSavedJson(int i, long j, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConnectionRuleSavedJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.revision = j;
    }

    public static /* synthetic */ ConnectionRuleSavedJson copy$default(ConnectionRuleSavedJson connectionRuleSavedJson, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = connectionRuleSavedJson.revision;
        }
        return new ConnectionRuleSavedJson(j);
    }

    public final long component1() {
        return this.revision;
    }

    public final ConnectionRuleSavedJson copy(long j) {
        return new ConnectionRuleSavedJson(j);
    }

    public final long getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.revision);
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionRuleSavedJson(long j) {
        this.revision = j;
    }
}
