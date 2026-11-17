package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchSubAgent extends C06G {
    public static final int $stable = 0;
    public final String currentTool;
    public final String id;
    public final String name;
    public final HatchSubAgentStatus status;
    public final String toolSummary;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSubAgent) {
                HatchSubAgent hatchSubAgent = (HatchSubAgent) obj;
                if (!C7384Etj.areEqual(this.id, hatchSubAgent.id) || !C7384Etj.areEqual(this.name, hatchSubAgent.name) || this.status != hatchSubAgent.status || !C7384Etj.areEqual(this.currentTool, hatchSubAgent.currentTool) || !C7384Etj.areEqual(this.toolSummary, hatchSubAgent.toolSummary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSubAgent copy$default(HatchSubAgent hatchSubAgent, String str, String str2, HatchSubAgentStatus hatchSubAgentStatus, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSubAgent.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchSubAgent.name;
        }
        if ((i & 4) != 0) {
            hatchSubAgentStatus = hatchSubAgent.status;
        }
        if ((i & 8) != 0) {
            str3 = hatchSubAgent.currentTool;
        }
        if ((i & 16) != 0) {
            str4 = hatchSubAgent.toolSummary;
        }
        return hatchSubAgent.copy(str, str2, hatchSubAgentStatus, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final HatchSubAgentStatus component3() {
        return this.status;
    }

    public final String component4() {
        return this.currentTool;
    }

    public final String component5() {
        return this.toolSummary;
    }

    public final String getCurrentTool() {
        return this.currentTool;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final HatchSubAgentStatus getStatus() {
        return this.status;
    }

    public final String getToolSummary() {
        return this.toolSummary;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.status, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.currentTool)) * 31) + AnonymousClass005.A0H(this.toolSummary);
    }

    public HatchSubAgent(String str, String str2, HatchSubAgentStatus hatchSubAgentStatus, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, hatchSubAgentStatus);
        this.id = str;
        this.name = str2;
        this.status = hatchSubAgentStatus;
        this.currentTool = str3;
        this.toolSummary = str4;
    }

    public final HatchSubAgent copy(String str, String str2, HatchSubAgentStatus hatchSubAgentStatus, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, hatchSubAgentStatus);
        return new HatchSubAgent(str, str2, hatchSubAgentStatus, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSubAgent(String str, String str2, HatchSubAgentStatus hatchSubAgentStatus, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? HatchSubAgentStatus.RUNNING : hatchSubAgentStatus, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
