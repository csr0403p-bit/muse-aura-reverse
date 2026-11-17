package com.facebook.aura.model;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class WidgetStateMutationResult extends C06G {
    public static final int $stable = JSONState.$stable;
    public final boolean applied;
    public final JSONState state;

    public WidgetStateMutationResult(boolean z, JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 1);
        this.applied = z;
        this.state = jSONState;
    }

    public final WidgetStateMutationResult copy(boolean z, JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 1);
        return new WidgetStateMutationResult(z, jSONState);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WidgetStateMutationResult) {
                WidgetStateMutationResult widgetStateMutationResult = (WidgetStateMutationResult) obj;
                if (this.applied != widgetStateMutationResult.applied || !C7384Etj.areEqual(this.state, widgetStateMutationResult.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WidgetStateMutationResult copy$default(WidgetStateMutationResult widgetStateMutationResult, boolean z, JSONState jSONState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = widgetStateMutationResult.applied;
        }
        if ((i & 2) != 0) {
            jSONState = widgetStateMutationResult.state;
        }
        C7384Etj.A0Y(jSONState, 1);
        return new WidgetStateMutationResult(z, jSONState);
    }

    public final boolean component1() {
        return this.applied;
    }

    public final JSONState component2() {
        return this.state;
    }

    public final boolean getApplied() {
        return this.applied;
    }

    public final JSONState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, C0KA.A02(this.applied));
    }

    public String toString() {
        return super.toString();
    }
}
