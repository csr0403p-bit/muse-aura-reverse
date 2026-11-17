package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AgentStatusCta extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentStatusCta) {
                AgentStatusCta agentStatusCta = (AgentStatusCta) obj;
                if (!C7384Etj.areEqual(this.label, agentStatusCta.label) || !C7384Etj.areEqual(this.url, agentStatusCta.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentStatusCta copy$default(AgentStatusCta agentStatusCta, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentStatusCta.label;
        }
        if ((i & 2) != 0) {
            str2 = agentStatusCta.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new AgentStatusCta(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
    }

    public AgentStatusCta(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.url = str2;
    }

    public final AgentStatusCta copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AgentStatusCta(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
