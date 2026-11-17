package com.facebook.aura.nudge;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.nudge.NudgeState;

/* loaded from: classes2.dex */
public abstract class ConversationNudgeCoordinatorKt {
    public static final ConversationNudge getActiveNudge(NudgeState nudgeState) {
        C7384Etj.A0Y(nudgeState, 0);
        if (nudgeState instanceof NudgeState.Offered) {
            return ((NudgeState.Offered) nudgeState).nudge;
        }
        if (nudgeState instanceof NudgeState.Visible) {
            return ((NudgeState.Visible) nudgeState).nudge;
        }
        if (nudgeState instanceof NudgeState.AwaitingOutcome) {
            return ((NudgeState.AwaitingOutcome) nudgeState).nudge;
        }
        if (nudgeState.equals(NudgeState.Idle.INSTANCE)) {
            return null;
        }
        throw C3cG.A0q();
    }
}
