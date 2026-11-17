package com.facebook.aura.notifications.push;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface AuraCvmPushEnvelopeParseResult {

    public final class Absent implements AuraCvmPushEnvelopeParseResult {
        public static final Absent INSTANCE = new Absent();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Absent);
        }

        public String toString() {
            return "Absent";
        }

        public int hashCode() {
            return 269477818;
        }
    }

    public final class Malformed implements AuraCvmPushEnvelopeParseResult {
        public static final Malformed INSTANCE = new Malformed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Malformed);
        }

        public String toString() {
            return "Malformed";
        }

        public int hashCode() {
            return 1169382298;
        }
    }

    public final class Present extends C06G implements AuraCvmPushEnvelopeParseResult {
        public final AuraCvmPushEnvelope envelope;

        public Present(AuraCvmPushEnvelope auraCvmPushEnvelope) {
            C7384Etj.A0Y(auraCvmPushEnvelope, 0);
            this.envelope = auraCvmPushEnvelope;
        }

        public final Present copy(AuraCvmPushEnvelope auraCvmPushEnvelope) {
            C7384Etj.A0Y(auraCvmPushEnvelope, 0);
            return new Present(auraCvmPushEnvelope);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Present) && C7384Etj.areEqual(this.envelope, ((Present) obj).envelope));
        }

        public static /* synthetic */ Present copy$default(Present present, AuraCvmPushEnvelope auraCvmPushEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                auraCvmPushEnvelope = present.envelope;
            }
            C7384Etj.A0Y(auraCvmPushEnvelope, 0);
            return new Present(auraCvmPushEnvelope);
        }

        public final AuraCvmPushEnvelope component1() {
            return this.envelope;
        }

        public final AuraCvmPushEnvelope getEnvelope() {
            return this.envelope;
        }

        public int hashCode() {
            return this.envelope.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
