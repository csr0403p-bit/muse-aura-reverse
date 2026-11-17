package com.facebook.aura.partners.voice.intf;

import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface VoiceCallSurfaceState {

    public final class Hidden extends C06G implements VoiceCallSurfaceState {
        public static final int $stable = 0;
        public final VoiceEmbodimentMedia media;

        public Hidden(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            this.media = voiceEmbodimentMedia;
        }

        public final Hidden copy(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Hidden(voiceEmbodimentMedia);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Hidden) && C7384Etj.areEqual(this.media, ((Hidden) obj).media));
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, VoiceEmbodimentMedia voiceEmbodimentMedia, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceEmbodimentMedia = hidden.media;
            }
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Hidden(voiceEmbodimentMedia);
        }

        public final VoiceEmbodimentMedia component1() {
            return this.media;
        }

        public final VoiceEmbodimentMedia getMedia() {
            return this.media;
        }

        public int hashCode() {
            return this.media.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading extends C06G implements VoiceCallSurfaceState {
        public static final int $stable = 0;
        public final VoiceEmbodimentMedia media;

        public Loading(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            this.media = voiceEmbodimentMedia;
        }

        public final Loading copy(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Loading(voiceEmbodimentMedia);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loading) && C7384Etj.areEqual(this.media, ((Loading) obj).media));
        }

        public static /* synthetic */ Loading copy$default(Loading loading, VoiceEmbodimentMedia voiceEmbodimentMedia, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceEmbodimentMedia = loading.media;
            }
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Loading(voiceEmbodimentMedia);
        }

        public final VoiceEmbodimentMedia component1() {
            return this.media;
        }

        public final VoiceEmbodimentMedia getMedia() {
            return this.media;
        }

        public int hashCode() {
            return this.media.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unavailable extends C06G implements VoiceCallSurfaceState {
        public static final int $stable = 0;
        public final boolean displayEnabled;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unavailable) && this.displayEnabled == ((Unavailable) obj).displayEnabled);
        }

        public /* synthetic */ Unavailable(boolean z, int i, C06H c06h) {
            this((i & 1) != 0 ? true : z);
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unavailable.displayEnabled;
            }
            return new Unavailable(z);
        }

        public final boolean component1() {
            return this.displayEnabled;
        }

        public final Unavailable copy(boolean z) {
            return new Unavailable(z);
        }

        public final boolean getDisplayEnabled() {
            return this.displayEnabled;
        }

        public int hashCode() {
            return this.displayEnabled ? 1231 : 1237;
        }

        public String toString() {
            return super.toString();
        }

        public Unavailable(boolean z) {
            this.displayEnabled = z;
        }

        public Unavailable() {
            this(true);
        }
    }

    public final class Visible extends C06G implements VoiceCallSurfaceState {
        public static final int $stable = 0;
        public final VoiceEmbodimentMedia media;

        public Visible(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            this.media = voiceEmbodimentMedia;
        }

        public final Visible copy(VoiceEmbodimentMedia voiceEmbodimentMedia) {
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Visible(voiceEmbodimentMedia);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Visible) && C7384Etj.areEqual(this.media, ((Visible) obj).media));
        }

        public static /* synthetic */ Visible copy$default(Visible visible, VoiceEmbodimentMedia voiceEmbodimentMedia, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceEmbodimentMedia = visible.media;
            }
            C7384Etj.A0Y(voiceEmbodimentMedia, 0);
            return new Visible(voiceEmbodimentMedia);
        }

        public final VoiceEmbodimentMedia component1() {
            return this.media;
        }

        public final VoiceEmbodimentMedia getMedia() {
            return this.media;
        }

        public int hashCode() {
            return this.media.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
