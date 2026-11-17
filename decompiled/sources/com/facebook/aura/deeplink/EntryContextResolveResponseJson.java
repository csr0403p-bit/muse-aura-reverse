package com.facebook.aura.deeplink;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class EntryContextResolveResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean found;
    public final String prompt_text;
    public final Boolean retryable;

    public final class Companion {
        public final C9hr<EntryContextResolveResponseJson> serializer() {
            return EntryContextResolveResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(EntryContextResolveResponseJson entryContextResolveResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || entryContextResolveResponseJson.found != null) {
            c9j5.AAP(entryContextResolveResponseJson.found, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || entryContextResolveResponseJson.retryable != null) {
            c9j5.AAP(entryContextResolveResponseJson.retryable, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || entryContextResolveResponseJson.prompt_text != null) {
            c9j5.AAP(entryContextResolveResponseJson.prompt_text, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EntryContextResolveResponseJson) {
                EntryContextResolveResponseJson entryContextResolveResponseJson = (EntryContextResolveResponseJson) obj;
                if (!C7384Etj.areEqual(this.found, entryContextResolveResponseJson.found) || !C7384Etj.areEqual(this.retryable, entryContextResolveResponseJson.retryable) || !C7384Etj.areEqual(this.prompt_text, entryContextResolveResponseJson.prompt_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EntryContextResolveResponseJson copy$default(EntryContextResolveResponseJson entryContextResolveResponseJson, Boolean bool, Boolean bool2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = entryContextResolveResponseJson.found;
        }
        if ((i & 2) != 0) {
            bool2 = entryContextResolveResponseJson.retryable;
        }
        if ((i & 4) != 0) {
            str = entryContextResolveResponseJson.prompt_text;
        }
        return new EntryContextResolveResponseJson(bool, bool2, str);
    }

    public final Boolean component1() {
        return this.found;
    }

    public final Boolean component2() {
        return this.retryable;
    }

    public final String component3() {
        return this.prompt_text;
    }

    public final EntryContextResolveResponseJson copy(Boolean bool, Boolean bool2, String str) {
        return new EntryContextResolveResponseJson(bool, bool2, str);
    }

    public final Boolean getFound() {
        return this.found;
    }

    public final String getPrompt_text() {
        return this.prompt_text;
    }

    public final Boolean getRetryable() {
        return this.retryable;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.found) * 31) + AnonymousClass006.A0D(this.retryable)) * 31) + AnonymousClass005.A0H(this.prompt_text);
    }

    public EntryContextResolveResponseJson(Boolean bool, Boolean bool2, String str) {
        this.found = bool;
        this.retryable = bool2;
        this.prompt_text = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EntryContextResolveResponseJson(int i, Boolean bool, Boolean bool2, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.found = null;
        } else {
            this.found = bool;
        }
        if ((i & 2) == 0) {
            this.retryable = null;
        } else {
            this.retryable = bool2;
        }
        if ((i & 4) == 0) {
            this.prompt_text = null;
        } else {
            this.prompt_text = str;
        }
    }

    public /* synthetic */ EntryContextResolveResponseJson(Boolean bool, Boolean bool2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str);
    }

    public EntryContextResolveResponseJson() {
        this(null, null, null);
    }
}
