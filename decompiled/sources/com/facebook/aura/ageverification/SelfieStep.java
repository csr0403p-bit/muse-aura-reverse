package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import X.C7384Etj;
import java.io.File;

/* loaded from: classes3.dex */
public interface SelfieStep {

    public final class Complete implements SelfieStep {
        public static final int $stable = CapturedPhoto.$stable | CapturedVideo.$stable;
        public final CapturedPhoto snapshot;
        public final CapturedVideo video;

        public final CapturedPhoto getSnapshot() {
            return this.snapshot;
        }

        public final CapturedVideo getVideo() {
            return this.video;
        }

        public Complete(CapturedVideo capturedVideo, CapturedPhoto capturedPhoto) {
            AnonymousClass003.A0u(capturedVideo, capturedPhoto);
            this.video = capturedVideo;
            this.snapshot = capturedPhoto;
        }
    }

    public final class Finishing implements SelfieStep {
        public static final int $stable = 0;
        public static final Finishing INSTANCE = new Finishing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Finishing);
        }

        public String toString() {
            return "Finishing";
        }

        public int hashCode() {
            return 1071721529;
        }
    }

    public final class Positioning implements SelfieStep {
        public static final int $stable = 0;
        public static final Positioning INSTANCE = new Positioning();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Positioning);
        }

        public String toString() {
            return "Positioning";
        }

        public int hashCode() {
            return 1932821859;
        }
    }

    public final class Recording implements SelfieStep {
        public static final int $stable = 8;
        public final File video;

        public Recording(File file) {
            C7384Etj.A0Y(file, 0);
            this.video = file;
        }

        public final File getVideo() {
            return this.video;
        }
    }
}
