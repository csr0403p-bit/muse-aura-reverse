package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionOption extends C06G {
    public static final int $stable = 0;
    public final String alwaysScope;
    public final String kind;
    public final String labelText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionDecisionOption) {
                AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) obj;
                if (!C7384Etj.areEqual(this.kind, agentPermissionDecisionOption.kind) || !C7384Etj.areEqual(this.labelText, agentPermissionDecisionOption.labelText) || !C7384Etj.areEqual(this.alwaysScope, agentPermissionDecisionOption.alwaysScope)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentPermissionDecisionOption copy$default(AgentPermissionDecisionOption agentPermissionDecisionOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentPermissionDecisionOption.kind;
        }
        if ((i & 2) != 0) {
            str2 = agentPermissionDecisionOption.labelText;
        }
        if ((i & 4) != 0) {
            str3 = agentPermissionDecisionOption.alwaysScope;
        }
        return agentPermissionDecisionOption.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.labelText;
    }

    public final String component3() {
        return this.alwaysScope;
    }

    public final String getAlwaysScope() {
        return this.alwaysScope;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.labelText, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0G(this.alwaysScope);
    }

    public AgentPermissionDecisionOption(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.labelText = str2;
        this.alwaysScope = str3;
    }

    public final AgentPermissionDecisionOption copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new AgentPermissionDecisionOption(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgentPermissionDecisionOption(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
