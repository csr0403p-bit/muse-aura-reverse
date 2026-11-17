package com.facebook.aura.onboarding;

/* loaded from: classes3.dex */
public interface OnboardingGateDestination {

    public final class Conversation implements OnboardingGateDestination {
        public static final Conversation INSTANCE = new Conversation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Conversation);
        }

        public String toString() {
            return "Conversation";
        }

        public int hashCode() {
            return 165806444;
        }
    }

    public final class UiFlow implements OnboardingGateDestination {
        public static final UiFlow INSTANCE = new UiFlow();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UiFlow);
        }

        public String toString() {
            return "UiFlow";
        }

        public int hashCode() {
            return 1189634443;
        }
    }
}
