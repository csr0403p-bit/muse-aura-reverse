package com.facebook.aura.conversation.api.inlineentity;

import X.C7384Etj;

/* loaded from: classes4.dex */
public interface ConversationInlineEntityPreparation {

    public final class NotApplicable implements ConversationInlineEntityPreparation {
        public static final int $stable = 0;
        public static final NotApplicable INSTANCE = new NotApplicable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotApplicable);
        }

        public String toString() {
            return "NotApplicable";
        }

        public int hashCode() {
            return -845472231;
        }
    }

    public final class Ready implements ConversationInlineEntityPreparation {
        public static final int $stable = 0;
        public final ConversationInlineEntityPlan plan;

        public Ready(ConversationInlineEntityPlan conversationInlineEntityPlan) {
            C7384Etj.A0Y(conversationInlineEntityPlan, 0);
            this.plan = conversationInlineEntityPlan;
        }

        public final ConversationInlineEntityPlan getPlan() {
            return this.plan;
        }
    }

    public final class Rejected implements ConversationInlineEntityPreparation {
        public static final int $stable = 0;
        public static final Rejected INSTANCE = new Rejected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public String toString() {
            return "Rejected";
        }

        public int hashCode() {
            return -1926220585;
        }
    }
}
