package com.facebook.aura.onboarding;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface OnboardingUiFlowEffect {

    public final class Failed implements OnboardingUiFlowEffect {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -1908042790;
        }
    }

    public final class OpenConnector extends C06G implements OnboardingUiFlowEffect {
        public final String connectorId;

        public OpenConnector(String str) {
            C7384Etj.A0Y(str, 0);
            this.connectorId = str;
        }

        public final OpenConnector copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenConnector(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenConnector) && C7384Etj.areEqual(this.connectorId, ((OpenConnector) obj).connectorId));
        }

        public static /* synthetic */ OpenConnector copy$default(OpenConnector openConnector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openConnector.connectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenConnector(str);
        }

        public final String component1() {
            return this.connectorId;
        }

        public final String getConnectorId() {
            return this.connectorId;
        }

        public int hashCode() {
            return this.connectorId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
