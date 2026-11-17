package com.facebook.aura.pairs;

import X.AnonymousClass005;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ConnectionsCanonicalRules {
    public static final int $stable = 0;
    public final String connectionId;
    public final long revision;
    public final List<ConnectionsSharingRule> rules;
    public final Set<String> unconfirmedRuleIds;

    public ConnectionsCanonicalRules(String str, long j, List<ConnectionsSharingRule> list, Set<String> set) {
        AnonymousClass005.A11(str, list, set, 0);
        this.connectionId = str;
        this.revision = j;
        this.rules = list;
        this.unconfirmedRuleIds = set;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final List<ConnectionsSharingRule> getRules() {
        return this.rules;
    }

    public final Set<String> getUnconfirmedRuleIds() {
        return this.unconfirmedRuleIds;
    }
}
