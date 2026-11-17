package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface VoiceEmbodimentMediaEvent {

    public final class ActivityFailed extends C06G implements VoiceEmbodimentMediaEvent {
        public static final int $stable = 8;
        public final EmbodimentClip clip;
        public final int loadGeneration;

        public ActivityFailed(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            this.clip = embodimentClip;
            this.loadGeneration = i;
        }

        public final ActivityFailed copy(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            return new ActivityFailed(embodimentClip, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActivityFailed) {
                    ActivityFailed activityFailed = (ActivityFailed) obj;
                    if (!C7384Etj.areEqual(this.clip, activityFailed.clip) || this.loadGeneration != activityFailed.loadGeneration) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActivityFailed copy$default(ActivityFailed activityFailed, EmbodimentClip embodimentClip, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                embodimentClip = activityFailed.clip;
            }
            if ((i2 & 2) != 0) {
                i = activityFailed.loadGeneration;
            }
            C7384Etj.A0Y(embodimentClip, 0);
            return new ActivityFailed(embodimentClip, i);
        }

        public final EmbodimentClip component1() {
            return this.clip;
        }

        public final int component2() {
            return this.loadGeneration;
        }

        public final EmbodimentClip getClip() {
            return this.clip;
        }

        public final int getLoadGeneration() {
            return this.loadGeneration;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.clip) + this.loadGeneration;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ActivityFramePainted extends C06G implements VoiceEmbodimentMediaEvent {
        public static final int $stable = 8;
        public final EmbodimentClip clip;
        public final int loadGeneration;

        public ActivityFramePainted(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            this.clip = embodimentClip;
            this.loadGeneration = i;
        }

        public final ActivityFramePainted copy(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            return new ActivityFramePainted(embodimentClip, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActivityFramePainted) {
                    ActivityFramePainted activityFramePainted = (ActivityFramePainted) obj;
                    if (!C7384Etj.areEqual(this.clip, activityFramePainted.clip) || this.loadGeneration != activityFramePainted.loadGeneration) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActivityFramePainted copy$default(ActivityFramePainted activityFramePainted, EmbodimentClip embodimentClip, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                embodimentClip = activityFramePainted.clip;
            }
            if ((i2 & 2) != 0) {
                i = activityFramePainted.loadGeneration;
            }
            C7384Etj.A0Y(embodimentClip, 0);
            return new ActivityFramePainted(embodimentClip, i);
        }

        public final EmbodimentClip component1() {
            return this.clip;
        }

        public final int component2() {
            return this.loadGeneration;
        }

        public final EmbodimentClip getClip() {
            return this.clip;
        }

        public final int getLoadGeneration() {
            return this.loadGeneration;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.clip) + this.loadGeneration;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class InputsChanged implements VoiceEmbodimentMediaEvent {
        public static final int $stable = 0;
        public static final InputsChanged INSTANCE = new InputsChanged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InputsChanged);
        }

        public String toString() {
            return "InputsChanged";
        }

        public int hashCode() {
            return 1696445618;
        }
    }
}
