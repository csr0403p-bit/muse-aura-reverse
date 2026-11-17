package com.facebook.aura.nudge;

import X.C7384Etj;

/* loaded from: classes2.dex */
public interface NudgeState {

    public final class AwaitingOutcome implements NudgeState {
        public static final int $stable = 8;
        public final ConversationNudge nudge;

        public AwaitingOutcome(ConversationNudge conversationNudge) {
            C7384Etj.A0Y(conversationNudge, 0);
            this.nudge = conversationNudge;
        }

        public final ConversationNudge getNudge() {
            return this.nudge;
        }
    }

    public final class Idle implements NudgeState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -1809979479;
        }
    }

    public final class Offered implements NudgeState {
        public static final int $stable = 8;
        public final ConversationNudge nudge;

        public Offered(ConversationNudge conversationNudge) {
            C7384Etj.A0Y(conversationNudge, 0);
            this.nudge = conversationNudge;
        }

        public final ConversationNudge getNudge() {
            return this.nudge;
        }
    }

    public final class Visible implements NudgeState {
        public static final int $stable = 8;
        public final ConversationNudge nudge;
        public final long shownAtMs;

        public Visible(ConversationNudge conversationNudge, long j) {
            C7384Etj.A0Y(conversationNudge, 0);
            this.nudge = conversationNudge;
            this.shownAtMs = j;
        }

        public final ConversationNudge getNudge() {
            return this.nudge;
        }

        public final long getShownAtMs() {
            return this.shownAtMs;
        }
    }
}
