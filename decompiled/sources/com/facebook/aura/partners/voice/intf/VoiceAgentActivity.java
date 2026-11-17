package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.AgentActivityStatus;

/* loaded from: classes2.dex */
public final class VoiceAgentActivity extends C06G {
    public static final int $stable = 0;
    public final String activityDetail;
    public final String activityEmoji;
    public final String activityText;
    public final AgentActivityStatus status;

    public VoiceAgentActivity(AgentActivityStatus agentActivityStatus, String str, String str2, String str3) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        this.status = agentActivityStatus;
        this.activityText = str;
        this.activityEmoji = str2;
        this.activityDetail = str3;
    }

    public final VoiceAgentActivity copy(AgentActivityStatus agentActivityStatus, String str, String str2, String str3) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        return new VoiceAgentActivity(agentActivityStatus, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceAgentActivity) {
                VoiceAgentActivity voiceAgentActivity = (VoiceAgentActivity) obj;
                if (this.status != voiceAgentActivity.status || !C7384Etj.areEqual(this.activityText, voiceAgentActivity.activityText) || !C7384Etj.areEqual(this.activityEmoji, voiceAgentActivity.activityEmoji) || !C7384Etj.areEqual(this.activityDetail, voiceAgentActivity.activityDetail)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceAgentActivity copy$default(VoiceAgentActivity voiceAgentActivity, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            agentActivityStatus = voiceAgentActivity.status;
        }
        if ((i & 2) != 0) {
            str = voiceAgentActivity.activityText;
        }
        if ((i & 4) != 0) {
            str2 = voiceAgentActivity.activityEmoji;
        }
        if ((i & 8) != 0) {
            str3 = voiceAgentActivity.activityDetail;
        }
        C7384Etj.A0Y(agentActivityStatus, 0);
        return new VoiceAgentActivity(agentActivityStatus, str, str2, str3);
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
        return this.activityDetail;
    }

    public final String getActivityDetail() {
        return this.activityDetail;
    }

    public final String getActivityEmoji() {
        return this.activityEmoji;
    }

    public final String getActivityText() {
        return this.activityText;
    }

    public final AgentActivityStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0G(this.activityText)) * 31) + AnonymousClass006.A0G(this.activityEmoji)) * 31) + AnonymousClass005.A0H(this.activityDetail);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceAgentActivity(AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? AgentActivityStatus.ONLINE : agentActivityStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public VoiceAgentActivity() {
        this(AgentActivityStatus.ONLINE, null, null, null);
    }
}
