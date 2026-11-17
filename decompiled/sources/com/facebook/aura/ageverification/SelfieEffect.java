package com.facebook.aura.ageverification;

import X.C7384Etj;
import com.facebook.aura.ageverification.SelfieStep;

/* loaded from: classes3.dex */
public interface SelfieEffect {

    public final class CameraUnavailable implements SelfieEffect {
        public static final int $stable = 0;
        public static final CameraUnavailable INSTANCE = new CameraUnavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraUnavailable);
        }

        public String toString() {
            return "CameraUnavailable";
        }

        public int hashCode() {
            return -915857350;
        }
    }

    public final class Captured implements SelfieEffect {
        public static final int $stable = CapturedPhoto.$stable | CapturedVideo.$stable;
        public final SelfieStep.Complete capture;

        public Captured(SelfieStep.Complete complete) {
            C7384Etj.A0Y(complete, 0);
            this.capture = complete;
        }

        public final SelfieStep.Complete getCapture() {
            return this.capture;
        }
    }

    public final class FaceLost implements SelfieEffect {
        public static final int $stable = 0;
        public static final FaceLost INSTANCE = new FaceLost();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FaceLost);
        }

        public String toString() {
            return "FaceLost";
        }

        public int hashCode() {
            return -1595647502;
        }
    }

    public final class RecordingFailed implements SelfieEffect {
        public static final int $stable = 0;
        public static final RecordingFailed INSTANCE = new RecordingFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecordingFailed);
        }

        public String toString() {
            return "RecordingFailed";
        }

        public int hashCode() {
            return 53946781;
        }
    }

    public final class TrackingUnavailable implements SelfieEffect {
        public static final int $stable = 0;
        public static final TrackingUnavailable INSTANCE = new TrackingUnavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackingUnavailable);
        }

        public String toString() {
            return "TrackingUnavailable";
        }

        public int hashCode() {
            return 1595694504;
        }
    }
}
