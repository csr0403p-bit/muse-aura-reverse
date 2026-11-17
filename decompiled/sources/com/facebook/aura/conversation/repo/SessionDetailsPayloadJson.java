package com.facebook.aura.conversation.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SessionDetailsPayloadJson extends C06G {
    public final boolean archived;
    public final SessionItemJson session;
    public final List<SessionItemJson> sessions;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, SessionDetailsPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SessionDetailsPayloadJson> serializer() {
            return SessionDetailsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionDetailsPayloadJson) {
                SessionDetailsPayloadJson sessionDetailsPayloadJson = (SessionDetailsPayloadJson) obj;
                if (!C7384Etj.areEqual(this.session, sessionDetailsPayloadJson.session) || !C7384Etj.areEqual(this.sessions, sessionDetailsPayloadJson.sessions) || this.archived != sessionDetailsPayloadJson.archived) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SessionDetailsPayloadJson copy$default(SessionDetailsPayloadJson sessionDetailsPayloadJson, SessionItemJson sessionItemJson, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionItemJson = sessionDetailsPayloadJson.session;
        }
        if ((i & 2) != 0) {
            list = sessionDetailsPayloadJson.sessions;
        }
        if ((i & 4) != 0) {
            z = sessionDetailsPayloadJson.archived;
        }
        return new SessionDetailsPayloadJson(sessionItemJson, list, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(SessionDetailsPayloadJson sessionDetailsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || sessionDetailsPayloadJson.session != null) {
            c9j5.AAP(sessionDetailsPayloadJson.session, SessionItemJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || sessionDetailsPayloadJson.sessions != null) {
            c9j5.AAP(sessionDetailsPayloadJson.sessions, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || sessionDetailsPayloadJson.archived) {
            c9j5.AA7(c9iZ, 2, sessionDetailsPayloadJson.archived);
        }
    }

    public final SessionItemJson component1() {
        return this.session;
    }

    public final List<SessionItemJson> component2() {
        return this.sessions;
    }

    public final boolean component3() {
        return this.archived;
    }

    public final SessionDetailsPayloadJson copy(SessionItemJson sessionItemJson, List<SessionItemJson> list, boolean z) {
        return new SessionDetailsPayloadJson(sessionItemJson, list, z);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final SessionItemJson getSession() {
        return this.session;
    }

    public final List<SessionItemJson> getSessions() {
        return this.sessions;
    }

    public int hashCode() {
        return C0KA.A00(((AnonymousClass006.A0D(this.session) * 31) + C3cH.A02(this.sessions)) * 31, this.archived);
    }

    public SessionDetailsPayloadJson(SessionItemJson sessionItemJson, List<SessionItemJson> list, boolean z) {
        this.session = sessionItemJson;
        this.sessions = list;
        this.archived = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SessionDetailsPayloadJson(int i, SessionItemJson sessionItemJson, List list, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.session = null;
        } else {
            this.session = sessionItemJson;
        }
        if ((i & 2) == 0) {
            this.sessions = null;
        } else {
            this.sessions = list;
        }
        if ((i & 4) == 0) {
            this.archived = false;
        } else {
            this.archived = z;
        }
    }

    public /* synthetic */ SessionDetailsPayloadJson(SessionItemJson sessionItemJson, List list, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : sessionItemJson, (i & 2) != 0 ? null : list, AnonymousClass005.A1O(i, z));
    }

    public SessionDetailsPayloadJson() {
        this(null, null, false);
    }
}
