package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public interface CallIdleSelection {

    public final class Live extends C06G implements CallIdleSelection {
        public static final int $stable = 8;
        public final VoiceEmbodimentMedia.ReferenceFraming framing;
        public final HatchAvatarIdlePoster poster;
        public final String stillUri;
        public final String videoUri;

        public Live(String str, HatchAvatarIdlePoster hatchAvatarIdlePoster, String str2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
            C7384Etj.A0Y(referenceFraming, 3);
            this.videoUri = str;
            this.poster = hatchAvatarIdlePoster;
            this.stillUri = str2;
            this.framing = referenceFraming;
        }

        public final Live copy(String str, HatchAvatarIdlePoster hatchAvatarIdlePoster, String str2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
            C7384Etj.A0Y(referenceFraming, 3);
            return new Live(str, hatchAvatarIdlePoster, str2, referenceFraming);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Live) {
                    Live live = (Live) obj;
                    if (!C7384Etj.areEqual(this.videoUri, live.videoUri) || !C7384Etj.areEqual(this.poster, live.poster) || !C7384Etj.areEqual(this.stillUri, live.stillUri) || !C7384Etj.areEqual(this.framing, live.framing)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Live copy$default(Live live, String str, HatchAvatarIdlePoster hatchAvatarIdlePoster, String str2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, int i, Object obj) {
            if ((i & 1) != 0) {
                str = live.videoUri;
            }
            if ((i & 2) != 0) {
                hatchAvatarIdlePoster = live.poster;
            }
            if ((i & 4) != 0) {
                str2 = live.stillUri;
            }
            if ((i & 8) != 0) {
                referenceFraming = live.framing;
            }
            C7384Etj.A0Y(referenceFraming, 3);
            return new Live(str, hatchAvatarIdlePoster, str2, referenceFraming);
        }

        public final String component1() {
            return this.videoUri;
        }

        public final HatchAvatarIdlePoster component2() {
            return this.poster;
        }

        public final String component3() {
            return this.stillUri;
        }

        public final VoiceEmbodimentMedia.ReferenceFraming component4() {
            return this.framing;
        }

        public final VoiceEmbodimentMedia.ReferenceFraming getFraming() {
            return this.framing;
        }

        public final HatchAvatarIdlePoster getPoster() {
            return this.poster;
        }

        public final String getStillUri() {
            return this.stillUri;
        }

        public final String getVideoUri() {
            return this.videoUri;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.framing, ((((AnonymousClass006.A0G(this.videoUri) * 31) + AnonymousClass006.A0D(this.poster)) * 31) + AnonymousClass005.A0H(this.stillUri)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Ready extends C06G implements CallIdleSelection {
        public static final int $stable = 8;
        public final HatchReadyCallIdle idle;

        public Ready(HatchReadyCallIdle hatchReadyCallIdle) {
            C7384Etj.A0Y(hatchReadyCallIdle, 0);
            this.idle = hatchReadyCallIdle;
        }

        public final Ready copy(HatchReadyCallIdle hatchReadyCallIdle) {
            C7384Etj.A0Y(hatchReadyCallIdle, 0);
            return new Ready(hatchReadyCallIdle);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Ready) && C7384Etj.areEqual(this.idle, ((Ready) obj).idle));
        }

        public static /* synthetic */ Ready copy$default(Ready ready, HatchReadyCallIdle hatchReadyCallIdle, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchReadyCallIdle = ready.idle;
            }
            C7384Etj.A0Y(hatchReadyCallIdle, 0);
            return new Ready(hatchReadyCallIdle);
        }

        public final HatchReadyCallIdle component1() {
            return this.idle;
        }

        public final HatchReadyCallIdle getIdle() {
            return this.idle;
        }

        public int hashCode() {
            return this.idle.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Reference extends C06G implements CallIdleSelection {
        public static final int $stable = 8;
        public final PreparedHatchAvatar avatar;
        public final HatchAvatarIdlePoster poster;

        public Reference(PreparedHatchAvatar preparedHatchAvatar, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
            C7384Etj.A0Y(preparedHatchAvatar, 0);
            this.avatar = preparedHatchAvatar;
            this.poster = hatchAvatarIdlePoster;
        }

        public final Reference copy(PreparedHatchAvatar preparedHatchAvatar, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
            C7384Etj.A0Y(preparedHatchAvatar, 0);
            return new Reference(preparedHatchAvatar, hatchAvatarIdlePoster);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Reference) {
                    Reference reference = (Reference) obj;
                    if (!C7384Etj.areEqual(this.avatar, reference.avatar) || !C7384Etj.areEqual(this.poster, reference.poster)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Reference copy$default(Reference reference, PreparedHatchAvatar preparedHatchAvatar, HatchAvatarIdlePoster hatchAvatarIdlePoster, int i, Object obj) {
            if ((i & 1) != 0) {
                preparedHatchAvatar = reference.avatar;
            }
            if ((i & 2) != 0) {
                hatchAvatarIdlePoster = reference.poster;
            }
            C7384Etj.A0Y(preparedHatchAvatar, 0);
            return new Reference(preparedHatchAvatar, hatchAvatarIdlePoster);
        }

        public final PreparedHatchAvatar component1() {
            return this.avatar;
        }

        public final HatchAvatarIdlePoster component2() {
            return this.poster;
        }

        public final PreparedHatchAvatar getAvatar() {
            return this.avatar;
        }

        public final HatchAvatarIdlePoster getPoster() {
            return this.poster;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.avatar) + AnonymousClass006.A0D(this.poster);
        }

        public String toString() {
            return super.toString();
        }
    }
}
