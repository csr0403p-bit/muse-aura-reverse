package com.facebook.aura.partners.voice.ui;

import X.C7384Etj;

/* loaded from: classes4.dex */
public interface VoiceEmbodimentMediaControllerEvent {

    public final class ActivityFailed implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 8;
        public final EmbodimentClip clip;
        public final int loadGeneration;

        public ActivityFailed(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            this.clip = embodimentClip;
            this.loadGeneration = i;
        }

        public final EmbodimentClip getClip() {
            return this.clip;
        }

        public final int getLoadGeneration() {
            return this.loadGeneration;
        }
    }

    public final class ActivityFramePainted implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 8;
        public final EmbodimentClip clip;
        public final int loadGeneration;

        public ActivityFramePainted(EmbodimentClip embodimentClip, int i) {
            C7384Etj.A0Y(embodimentClip, 0);
            this.clip = embodimentClip;
            this.loadGeneration = i;
        }

        public final EmbodimentClip getClip() {
            return this.clip;
        }

        public final int getLoadGeneration() {
            return this.loadGeneration;
        }
    }

    public final class InputsChanged implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 8;
        public final VoiceEmbodimentMediaControllerInput input;

        public InputsChanged(VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput) {
            C7384Etj.A0Y(voiceEmbodimentMediaControllerInput, 0);
            this.input = voiceEmbodimentMediaControllerInput;
        }

        public final VoiceEmbodimentMediaControllerInput getInput() {
            return this.input;
        }
    }

    public final class LifecycleChanged implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 0;
        public final boolean resumed;

        public final boolean getResumed() {
            return this.resumed;
        }

        public LifecycleChanged(boolean z) {
            this.resumed = z;
        }
    }

    public final class RtcFramePainted implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 0;
        public static final RtcFramePainted INSTANCE = new RtcFramePainted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RtcFramePainted);
        }

        public String toString() {
            return "RtcFramePainted";
        }

        public int hashCode() {
            return 34552508;
        }
    }

    public final class StillPainted implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 0;
        public final boolean painted;
        public final String stillKey;

        public StillPainted(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.stillKey = str;
            this.painted = z;
        }

        public final boolean getPainted() {
            return this.painted;
        }

        public final String getStillKey() {
            return this.stillKey;
        }
    }

    public final class Wake implements VoiceEmbodimentMediaControllerEvent {
        public static final int $stable = 0;
        public final int timerGeneration;

        public final int getTimerGeneration() {
            return this.timerGeneration;
        }

        public Wake(int i) {
            this.timerGeneration = i;
        }
    }
}
