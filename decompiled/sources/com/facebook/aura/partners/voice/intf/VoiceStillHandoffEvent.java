package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public interface VoiceStillHandoffEvent {

    public final class Decoded extends C06G implements VoiceStillHandoffEvent {
        public static final int $stable = 0;
        public final long callGeneration;
        public final String stillKey;

        public Decoded(long j, String str) {
            C7384Etj.A0Y(str, 1);
            this.callGeneration = j;
            this.stillKey = str;
        }

        public final Decoded copy(long j, String str) {
            C7384Etj.A0Y(str, 1);
            return new Decoded(j, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Decoded) {
                    Decoded decoded = (Decoded) obj;
                    if (this.callGeneration != decoded.callGeneration || !C7384Etj.areEqual(this.stillKey, decoded.stillKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Decoded copy$default(Decoded decoded, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = decoded.callGeneration;
            }
            if ((i & 2) != 0) {
                str = decoded.stillKey;
            }
            C7384Etj.A0Y(str, 1);
            return new Decoded(j, str);
        }

        public final long component1() {
            return this.callGeneration;
        }

        public final String component2() {
            return this.stillKey;
        }

        @Override // com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent
        public long getCallGeneration() {
            return this.callGeneration;
        }

        public final String getStillKey() {
            return this.stillKey;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.stillKey, C3cI.A01(this.callGeneration));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Failed extends C06G implements VoiceStillHandoffEvent {
        public static final int $stable = 0;
        public final int attempt;
        public final long callGeneration;
        public final String stillKey;

        public Failed(long j, String str, int i) {
            C7384Etj.A0Y(str, 1);
            this.callGeneration = j;
            this.stillKey = str;
            this.attempt = i;
        }

        public final Failed copy(long j, String str, int i) {
            C7384Etj.A0Y(str, 1);
            return new Failed(j, str, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (this.callGeneration != failed.callGeneration || !C7384Etj.areEqual(this.stillKey, failed.stillKey) || this.attempt != failed.attempt) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, long j, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = failed.callGeneration;
            }
            if ((i2 & 2) != 0) {
                str = failed.stillKey;
            }
            if ((i2 & 4) != 0) {
                i = failed.attempt;
            }
            return failed.copy(j, str, i);
        }

        public final long component1() {
            return this.callGeneration;
        }

        public final String component2() {
            return this.stillKey;
        }

        public final int component3() {
            return this.attempt;
        }

        public final int getAttempt() {
            return this.attempt;
        }

        @Override // com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent
        public long getCallGeneration() {
            return this.callGeneration;
        }

        public final String getStillKey() {
            return this.stillKey;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.stillKey, C3cI.A01(this.callGeneration)) + this.attempt;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Retry extends C06G implements VoiceStillHandoffEvent {
        public static final int $stable = 0;
        public final long callGeneration;
        public final String stillKey;

        public Retry(long j, String str) {
            C7384Etj.A0Y(str, 1);
            this.callGeneration = j;
            this.stillKey = str;
        }

        public final Retry copy(long j, String str) {
            C7384Etj.A0Y(str, 1);
            return new Retry(j, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Retry) {
                    Retry retry = (Retry) obj;
                    if (this.callGeneration != retry.callGeneration || !C7384Etj.areEqual(this.stillKey, retry.stillKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Retry copy$default(Retry retry, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = retry.callGeneration;
            }
            if ((i & 2) != 0) {
                str = retry.stillKey;
            }
            C7384Etj.A0Y(str, 1);
            return new Retry(j, str);
        }

        public final long component1() {
            return this.callGeneration;
        }

        public final String component2() {
            return this.stillKey;
        }

        @Override // com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent
        public long getCallGeneration() {
            return this.callGeneration;
        }

        public final String getStillKey() {
            return this.stillKey;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.stillKey, C3cI.A01(this.callGeneration));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Target extends C06G implements VoiceStillHandoffEvent {
        public static final int $stable = 0;
        public final long callGeneration;
        public final VoiceEmbodimentMedia.StaticAvatar still;
        public final String stillKey;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Target) {
                    Target target = (Target) obj;
                    if (this.callGeneration != target.callGeneration || !C7384Etj.areEqual(this.still, target.still) || !C7384Etj.areEqual(this.stillKey, target.stillKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Target copy$default(Target target, long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = target.callGeneration;
            }
            if ((i & 2) != 0) {
                staticAvatar = target.still;
            }
            if ((i & 4) != 0) {
                str = target.stillKey;
            }
            return new Target(j, staticAvatar, str);
        }

        public final long component1() {
            return this.callGeneration;
        }

        public final VoiceEmbodimentMedia.StaticAvatar component2() {
            return this.still;
        }

        public final String component3() {
            return this.stillKey;
        }

        public final Target copy(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str) {
            return new Target(j, staticAvatar, str);
        }

        @Override // com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent
        public long getCallGeneration() {
            return this.callGeneration;
        }

        public final VoiceEmbodimentMedia.StaticAvatar getStill() {
            return this.still;
        }

        public final String getStillKey() {
            return this.stillKey;
        }

        public int hashCode() {
            return ((C3cI.A01(this.callGeneration) + AnonymousClass006.A0D(this.still)) * 31) + AnonymousClass005.A0H(this.stillKey);
        }

        public Target(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str) {
            this.callGeneration = j;
            this.still = staticAvatar;
            this.stillKey = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    long getCallGeneration();
}
