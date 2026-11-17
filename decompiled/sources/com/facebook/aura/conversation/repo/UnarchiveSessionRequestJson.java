package com.facebook.aura.conversation.repo;

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
/* loaded from: classes3.dex */
public final class UnarchiveSessionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String method;
    public final String session_id;

    public final class Companion {
        public final C9hr<UnarchiveSessionRequestJson> serializer() {
            return UnarchiveSessionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(UnarchiveSessionRequestJson unarchiveSessionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(unarchiveSessionRequestJson.method, c9iZ, 0);
        c9j5.AAV(unarchiveSessionRequestJson.session_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnarchiveSessionRequestJson) {
                UnarchiveSessionRequestJson unarchiveSessionRequestJson = (UnarchiveSessionRequestJson) obj;
                if (!C7384Etj.areEqual(this.method, unarchiveSessionRequestJson.method) || !C7384Etj.areEqual(this.session_id, unarchiveSessionRequestJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UnarchiveSessionRequestJson copy$default(UnarchiveSessionRequestJson unarchiveSessionRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unarchiveSessionRequestJson.method;
        }
        if ((i & 2) != 0) {
            str2 = unarchiveSessionRequestJson.session_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new UnarchiveSessionRequestJson(str, str2);
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.session_id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.session_id, AnonymousClass001.A0G(this.method));
    }

    public UnarchiveSessionRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.method = str;
        this.session_id = str2;
    }

    public final UnarchiveSessionRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new UnarchiveSessionRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UnarchiveSessionRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(UnarchiveSessionRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.method = str;
        this.session_id = str2;
    }
}
