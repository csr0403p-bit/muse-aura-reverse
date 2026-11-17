package com.facebook.aura.browsertask.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.model.BrowserTaskDisplayStatus;

/* loaded from: classes.dex */
public final class AgentComputerTerminalOutcome {
    public static final int $stable = 0;
    public final String activityTitle;
    public final BrowserTaskDisplayStatus displayState;
    public final String displayStatus;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentComputerTerminalOutcome) {
                AgentComputerTerminalOutcome agentComputerTerminalOutcome = (AgentComputerTerminalOutcome) obj;
                if (this.displayState != agentComputerTerminalOutcome.displayState || !C7384Etj.areEqual(this.displayStatus, agentComputerTerminalOutcome.displayStatus) || !C7384Etj.areEqual(this.activityTitle, agentComputerTerminalOutcome.activityTitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentComputerTerminalOutcome copy$default(AgentComputerTerminalOutcome agentComputerTerminalOutcome, BrowserTaskDisplayStatus browserTaskDisplayStatus, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskDisplayStatus = agentComputerTerminalOutcome.displayState;
        }
        if ((i & 2) != 0) {
            str = agentComputerTerminalOutcome.displayStatus;
        }
        if ((i & 4) != 0) {
            str2 = agentComputerTerminalOutcome.activityTitle;
        }
        return agentComputerTerminalOutcome.copy(browserTaskDisplayStatus, str, str2);
    }

    public final BrowserTaskDisplayStatus component1() {
        return this.displayState;
    }

    public final String component2() {
        return this.displayStatus;
    }

    public final String component3() {
        return this.activityTitle;
    }

    public final String getActivityTitle() {
        return this.activityTitle;
    }

    public final BrowserTaskDisplayStatus getDisplayState() {
        return this.displayState;
    }

    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.displayStatus, AnonymousClass005.A0E(this.displayState)) + AnonymousClass006.A0G(this.activityTitle);
    }

    public String toString() {
        BrowserTaskDisplayStatus browserTaskDisplayStatus = this.displayState;
        String str = this.displayStatus;
        String str2 = this.activityTitle;
        StringBuilder sb = new StringBuilder("AgentComputerTerminalOutcome(displayState=");
        sb.append(browserTaskDisplayStatus);
        sb.append(", displayStatus=");
        sb.append(str);
        sb.append(", activityTitle=");
        sb.append(str2);
        return AnonymousClass001.A0v(")", sb);
    }

    public AgentComputerTerminalOutcome(BrowserTaskDisplayStatus browserTaskDisplayStatus, String str, String str2) {
        AnonymousClass003.A0u(browserTaskDisplayStatus, str);
        this.displayState = browserTaskDisplayStatus;
        this.displayStatus = str;
        this.activityTitle = str2;
    }

    public final AgentComputerTerminalOutcome copy(BrowserTaskDisplayStatus browserTaskDisplayStatus, String str, String str2) {
        AnonymousClass003.A0u(browserTaskDisplayStatus, str);
        return new AgentComputerTerminalOutcome(browserTaskDisplayStatus, str, str2);
    }
}
