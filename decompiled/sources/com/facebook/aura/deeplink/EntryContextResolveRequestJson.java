package com.facebook.aura.deeplink;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class EntryContextResolveRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String entry_context_token;

    public final class Companion {
        public final C9hr<EntryContextResolveRequestJson> serializer() {
            return EntryContextResolveRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EntryContextResolveRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EntryContextResolveRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EntryContextResolveRequestJson) && C7384Etj.areEqual(this.entry_context_token, ((EntryContextResolveRequestJson) obj).entry_context_token));
    }

    public /* synthetic */ EntryContextResolveRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EntryContextResolveRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.entry_context_token = str;
    }

    public static /* synthetic */ EntryContextResolveRequestJson copy$default(EntryContextResolveRequestJson entryContextResolveRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryContextResolveRequestJson.entry_context_token;
        }
        C7384Etj.A0Y(str, 0);
        return new EntryContextResolveRequestJson(str);
    }

    public final String component1() {
        return this.entry_context_token;
    }

    public final String getEntry_context_token() {
        return this.entry_context_token;
    }

    public int hashCode() {
        return this.entry_context_token.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EntryContextResolveRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.entry_context_token = str;
    }
}
