package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.AgentStatusCta;
import com.facebook.aura.model.AgentActivityStatus;

/* loaded from: classes4.dex */
public final class AgentActivityInfo extends C06G {
    public final String activityEmoji;
    public final String activityText;
    public final AgentStatusCta outOfCreditsCta;
    public final String sessionId;
    public final AgentActivityStatus status;

    public final AgentActivityInfo copy(AgentActivityStatus agentActivityStatus, String str, String str2, String str3, AgentStatusCta agentStatusCta) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        return new AgentActivityInfo(agentActivityStatus, str, str2, str3, agentStatusCta);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentActivityInfo) {
                AgentActivityInfo agentActivityInfo = (AgentActivityInfo) obj;
                if (this.status != agentActivityInfo.status || !C7384Etj.areEqual(this.activityText, agentActivityInfo.activityText) || !C7384Etj.areEqual(this.activityEmoji, agentActivityInfo.activityEmoji) || !C7384Etj.areEqual(this.sessionId, agentActivityInfo.sessionId) || !C7384Etj.areEqual(this.outOfCreditsCta, agentActivityInfo.outOfCreditsCta)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AgentActivityInfo(AgentActivityStatus agentActivityStatus, String str, String str2, String str3, AgentStatusCta agentStatusCta, int i, C06H c06h) {
        this((i & 1) != 0 ? AgentActivityStatus.ONLINE : agentActivityStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : agentStatusCta);
    }

    public static /* synthetic */ AgentActivityInfo copy$default(AgentActivityInfo agentActivityInfo, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, AgentStatusCta agentStatusCta, int i, Object obj) {
        if ((i & 1) != 0) {
            agentActivityStatus = agentActivityInfo.status;
        }
        if ((i & 2) != 0) {
            str = agentActivityInfo.activityText;
        }
        if ((i & 4) != 0) {
            str2 = agentActivityInfo.activityEmoji;
        }
        if ((i & 8) != 0) {
            str3 = agentActivityInfo.sessionId;
        }
        if ((i & 16) != 0) {
            agentStatusCta = agentActivityInfo.outOfCreditsCta;
        }
        return agentActivityInfo.copy(agentActivityStatus, str, str2, str3, agentStatusCta);
    }

    public final AgentActivityStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.activityText;
    }

    public final String component3() {
        return this.activityEmoji;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final AgentStatusCta component5() {
        return this.outOfCreditsCta;
    }

    public final String getActivityEmoji() {
        return this.activityEmoji;
    }

    public final String getActivityText() {
        return this.activityText;
    }

    public final AgentStatusCta getOutOfCreditsCta() {
        return this.outOfCreditsCta;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final AgentActivityStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0G(this.activityText)) * 31) + AnonymousClass006.A0G(this.activityEmoji)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + C3cH.A02(this.outOfCreditsCta);
    }

    public String toString() {
        return super.toString();
    }

    public AgentActivityInfo(AgentActivityStatus agentActivityStatus, String str, String str2, String str3, AgentStatusCta agentStatusCta) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        this.status = agentActivityStatus;
        this.activityText = str;
        this.activityEmoji = str2;
        this.sessionId = str3;
        this.outOfCreditsCta = agentStatusCta;
    }

    public AgentActivityInfo() {
        this(AgentActivityStatus.ONLINE, null, null, null, null);
    }
}
