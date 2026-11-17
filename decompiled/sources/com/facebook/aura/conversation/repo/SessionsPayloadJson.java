package com.facebook.aura.conversation.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SessionsPayloadJson extends C06G {
    public final String next_cursor;
    public final List<SessionItemJson> sessions;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, SessionsPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SessionsPayloadJson> serializer() {
            return SessionsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionsPayloadJson) {
                SessionsPayloadJson sessionsPayloadJson = (SessionsPayloadJson) obj;
                if (!C7384Etj.areEqual(this.sessions, sessionsPayloadJson.sessions) || !C7384Etj.areEqual(this.next_cursor, sessionsPayloadJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SessionsPayloadJson copy$default(SessionsPayloadJson sessionsPayloadJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sessionsPayloadJson.sessions;
        }
        if ((i & 2) != 0) {
            str = sessionsPayloadJson.next_cursor;
        }
        return new SessionsPayloadJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(SessionsPayloadJson sessionsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || sessionsPayloadJson.sessions != null) {
            c9j5.AAP(sessionsPayloadJson.sessions, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || sessionsPayloadJson.next_cursor != null) {
            c9j5.AAP(sessionsPayloadJson.next_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<SessionItemJson> component1() {
        return this.sessions;
    }

    public final String component2() {
        return this.next_cursor;
    }

    public final SessionsPayloadJson copy(List<SessionItemJson> list, String str) {
        return new SessionsPayloadJson(list, str);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final List<SessionItemJson> getSessions() {
        return this.sessions;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.sessions) * 31) + AnonymousClass005.A0H(this.next_cursor);
    }

    public final SessionsPage toPage() {
        List<SessionItemJson> list = this.sessions;
        String str = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SessionItemJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        String str2 = this.next_cursor;
        if (str2 != null && !C7BY.A0j(str2)) {
            str = str2;
        }
        return new SessionsPage(arrayListA0i, str);
    }

    public SessionsPayloadJson(List<SessionItemJson> list, String str) {
        this.sessions = list;
        this.next_cursor = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SessionsPayloadJson(int i, List list, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.sessions = null;
        } else {
            this.sessions = list;
        }
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ SessionsPayloadJson(List list, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    public SessionsPayloadJson() {
        this(null, null);
    }
}
