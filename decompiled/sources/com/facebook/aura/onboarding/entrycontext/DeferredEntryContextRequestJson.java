package com.facebook.aura.onboarding.entrycontext;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeferredEntryContextRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String entry_context_token;
    public final String timezone;

    public final class Companion {
        public final C9hr<DeferredEntryContextRequestJson> serializer() {
            return DeferredEntryContextRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_entrycontext_entrycontext(DeferredEntryContextRequestJson deferredEntryContextRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deferredEntryContextRequestJson.entry_context_token, c9iZ, 0);
        c9j5.AAV(deferredEntryContextRequestJson.timezone, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeferredEntryContextRequestJson) {
                DeferredEntryContextRequestJson deferredEntryContextRequestJson = (DeferredEntryContextRequestJson) obj;
                if (!C7384Etj.areEqual(this.entry_context_token, deferredEntryContextRequestJson.entry_context_token) || !C7384Etj.areEqual(this.timezone, deferredEntryContextRequestJson.timezone)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeferredEntryContextRequestJson copy$default(DeferredEntryContextRequestJson deferredEntryContextRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deferredEntryContextRequestJson.entry_context_token;
        }
        if ((i & 2) != 0) {
            str2 = deferredEntryContextRequestJson.timezone;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeferredEntryContextRequestJson(str, str2);
    }

    public final String component1() {
        return this.entry_context_token;
    }

    public final String component2() {
        return this.timezone;
    }

    public final String getEntry_context_token() {
        return this.entry_context_token;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.timezone, AnonymousClass001.A0G(this.entry_context_token));
    }

    public DeferredEntryContextRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.entry_context_token = str;
        this.timezone = str2;
    }

    public final DeferredEntryContextRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeferredEntryContextRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeferredEntryContextRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeferredEntryContextRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.entry_context_token = str;
        this.timezone = str2;
    }
}
