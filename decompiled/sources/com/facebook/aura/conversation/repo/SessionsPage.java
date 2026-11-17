package com.facebook.aura.conversation.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchSessionItem;
import java.util.List;

/* loaded from: classes3.dex */
public final class SessionsPage extends C06G {
    public final String nextCursor;
    public final List<HatchSessionItem> sessions;

    public SessionsPage(List<HatchSessionItem> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.sessions = list;
        this.nextCursor = str;
    }

    public final SessionsPage copy(List<HatchSessionItem> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new SessionsPage(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionsPage) {
                SessionsPage sessionsPage = (SessionsPage) obj;
                if (!C7384Etj.areEqual(this.sessions, sessionsPage.sessions) || !C7384Etj.areEqual(this.nextCursor, sessionsPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SessionsPage copy$default(SessionsPage sessionsPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sessionsPage.sessions;
        }
        if ((i & 2) != 0) {
            str = sessionsPage.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new SessionsPage(list, str);
    }

    public final List<HatchSessionItem> component1() {
        return this.sessions;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<HatchSessionItem> getSessions() {
        return this.sessions;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.sessions) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
