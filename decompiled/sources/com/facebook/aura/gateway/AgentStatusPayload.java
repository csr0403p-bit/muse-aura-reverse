package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.utils.HatchUtil;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentStatusPayload extends C06G {
    public static final int $stable = 0;
    public final String activityDetail;
    public final String activityEmoji;
    public final AgentActivityStatus activityStatus;
    public final String activityText;
    public final int count;
    public final AgentStatusCta cta;
    public final long sequence;
    public final String sessionId;

    /* renamed from: com.facebook.aura.gateway.AgentStatusPayload$activityStatusForCurrentSubscription$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchUtil.INSTANCE.isSubscriptionEnabled());
        }
    }

    public static /* synthetic */ AgentStatusPayload copy$default(AgentStatusPayload agentStatusPayload, long j, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, AgentStatusCta agentStatusCta, String str4, int i2, Object obj) {
        long j2 = j;
        AgentActivityStatus agentActivityStatus2 = agentActivityStatus;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        int i3 = i;
        AgentStatusCta agentStatusCta2 = agentStatusCta;
        String str8 = str4;
        if ((i2 & 1) != 0) {
            j2 = agentStatusPayload.sequence;
        }
        if ((i2 & 2) != 0) {
            agentActivityStatus2 = agentStatusPayload.activityStatus;
        }
        if ((i2 & 4) != 0) {
            str5 = agentStatusPayload.activityText;
        }
        if ((i2 & 8) != 0) {
            str6 = agentStatusPayload.activityEmoji;
        }
        if ((i2 & 16) != 0) {
            str7 = agentStatusPayload.sessionId;
        }
        if ((i2 & 32) != 0) {
            i3 = agentStatusPayload.count;
        }
        if ((i2 & 64) != 0) {
            agentStatusCta2 = agentStatusPayload.cta;
        }
        if ((i2 & 128) != 0) {
            str8 = agentStatusPayload.activityDetail;
        }
        AnonymousClass003.A0x(agentActivityStatus2, str5);
        return new AgentStatusPayload(j2, agentActivityStatus2, str5, str6, str7, i3, agentStatusCta2, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentStatusPayload) {
                AgentStatusPayload agentStatusPayload = (AgentStatusPayload) obj;
                if (this.sequence != agentStatusPayload.sequence || this.activityStatus != agentStatusPayload.activityStatus || !C7384Etj.areEqual(this.activityText, agentStatusPayload.activityText) || !C7384Etj.areEqual(this.activityEmoji, agentStatusPayload.activityEmoji) || !C7384Etj.areEqual(this.sessionId, agentStatusPayload.sessionId) || this.count != agentStatusPayload.count || !C7384Etj.areEqual(this.cta, agentStatusPayload.cta) || !C7384Etj.areEqual(this.activityDetail, agentStatusPayload.activityDetail)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AgentStatusPayload(long j, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, AgentStatusCta agentStatusCta, String str4, int i2, C06H c06h) {
        this(j, agentActivityStatus, str, str2, str3, i, (i2 & 64) != 0 ? null : agentStatusCta, (i2 & 128) != 0 ? null : str4);
    }

    public final AgentActivityStatus activityStatusForCurrentSubscription() {
        return this.activityStatus.withSubscriptionGate(AnonymousClass1.INSTANCE);
    }

    public final long component1() {
        return this.sequence;
    }

    public final AgentActivityStatus component2() {
        return this.activityStatus;
    }

    public final String component3() {
        return this.activityText;
    }

    public final String component4() {
        return this.activityEmoji;
    }

    public final String component5() {
        return this.sessionId;
    }

    public final int component6() {
        return this.count;
    }

    public final AgentStatusCta component7() {
        return this.cta;
    }

    public final String component8() {
        return this.activityDetail;
    }

    public final String getActivityDetail() {
        return this.activityDetail;
    }

    public final String getActivityEmoji() {
        return this.activityEmoji;
    }

    public final AgentActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    public final String getActivityText() {
        return this.activityText;
    }

    public final int getCount() {
        return this.count;
    }

    public final AgentStatusCta getCta() {
        return this.cta;
    }

    public final long getSequence() {
        return this.sequence;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.activityText, AnonymousClass005.A0F(this.activityStatus, C3cI.A01(this.sequence))) + AnonymousClass006.A0G(this.activityEmoji)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + this.count) * 31) + AnonymousClass006.A0D(this.cta)) * 31) + AnonymousClass005.A0H(this.activityDetail);
    }

    public final AgentStatusPayload copy(long j, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, AgentStatusCta agentStatusCta, String str4) {
        AnonymousClass003.A0x(agentActivityStatus, str);
        return new AgentStatusPayload(j, agentActivityStatus, str, str2, str3, i, agentStatusCta, str4);
    }

    public String toString() {
        return super.toString();
    }

    public AgentStatusPayload(long j, AgentActivityStatus agentActivityStatus, String str, String str2, String str3, int i, AgentStatusCta agentStatusCta, String str4) {
        AnonymousClass003.A0x(agentActivityStatus, str);
        this.sequence = j;
        this.activityStatus = agentActivityStatus;
        this.activityText = str;
        this.activityEmoji = str2;
        this.sessionId = str3;
        this.count = i;
        this.cta = agentStatusCta;
        this.activityDetail = str4;
    }
}
