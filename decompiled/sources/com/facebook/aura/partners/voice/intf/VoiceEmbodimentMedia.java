package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface VoiceEmbodimentMedia {

    public final class LiveRtc extends C06G implements VoiceEmbodimentMedia {
        public static final int $stable = 0;
        public final StaticAvatar fallbackAvatar;
        public final String idleVideoUri;
        public final ReferenceFraming liveFraming;
        public final ReferenceFraming previewFraming;
        public final String referenceAssetId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LiveRtc) {
                    LiveRtc liveRtc = (LiveRtc) obj;
                    if (!C7384Etj.areEqual(this.idleVideoUri, liveRtc.idleVideoUri) || !C7384Etj.areEqual(this.referenceAssetId, liveRtc.referenceAssetId) || !C7384Etj.areEqual(this.fallbackAvatar, liveRtc.fallbackAvatar) || !C7384Etj.areEqual(this.previewFraming, liveRtc.previewFraming) || !C7384Etj.areEqual(this.liveFraming, liveRtc.liveFraming)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LiveRtc copy$default(LiveRtc liveRtc, String str, String str2, StaticAvatar staticAvatar, ReferenceFraming referenceFraming, ReferenceFraming referenceFraming2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = liveRtc.idleVideoUri;
            }
            if ((i & 2) != 0) {
                str2 = liveRtc.referenceAssetId;
            }
            if ((i & 4) != 0) {
                staticAvatar = liveRtc.fallbackAvatar;
            }
            if ((i & 8) != 0) {
                referenceFraming = liveRtc.previewFraming;
            }
            if ((i & 16) != 0) {
                referenceFraming2 = liveRtc.liveFraming;
            }
            return liveRtc.copy(str, str2, staticAvatar, referenceFraming, referenceFraming2);
        }

        public final String component1() {
            return this.idleVideoUri;
        }

        public final String component2() {
            return this.referenceAssetId;
        }

        public final StaticAvatar component3() {
            return this.fallbackAvatar;
        }

        public final ReferenceFraming component4() {
            return this.previewFraming;
        }

        public final ReferenceFraming component5() {
            return this.liveFraming;
        }

        public final LiveRtc copy(String str, String str2, StaticAvatar staticAvatar, ReferenceFraming referenceFraming, ReferenceFraming referenceFraming2) {
            return new LiveRtc(str, str2, staticAvatar, referenceFraming, referenceFraming2);
        }

        public final StaticAvatar getFallbackAvatar() {
            return this.fallbackAvatar;
        }

        public final String getIdleVideoUri() {
            return this.idleVideoUri;
        }

        public final ReferenceFraming getLiveFraming() {
            return this.liveFraming;
        }

        public final ReferenceFraming getLiveVideoFraming() {
            ReferenceFraming referenceFraming = this.liveFraming;
            return referenceFraming == null ? this.previewFraming : referenceFraming;
        }

        public final ReferenceFraming getPreviewFraming() {
            return this.previewFraming;
        }

        public final String getReferenceAssetId() {
            return this.referenceAssetId;
        }

        public int hashCode() {
            return (((((((AnonymousClass006.A0G(this.idleVideoUri) * 31) + AnonymousClass006.A0G(this.referenceAssetId)) * 31) + AnonymousClass006.A0D(this.fallbackAvatar)) * 31) + AnonymousClass006.A0D(this.previewFraming)) * 31) + C3cH.A02(this.liveFraming);
        }

        public LiveRtc(String str, String str2, StaticAvatar staticAvatar, ReferenceFraming referenceFraming, ReferenceFraming referenceFraming2) {
            this.idleVideoUri = str;
            this.referenceAssetId = str2;
            this.fallbackAvatar = staticAvatar;
            this.previewFraming = referenceFraming;
            this.liveFraming = referenceFraming2;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ LiveRtc(String str, String str2, StaticAvatar staticAvatar, ReferenceFraming referenceFraming, ReferenceFraming referenceFraming2, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : staticAvatar, (i & 8) != 0 ? null : referenceFraming, (i & 16) != 0 ? null : referenceFraming2);
        }

        public LiveRtc() {
            this(null, null, null, null, null);
        }
    }

    public final class ReferenceFraming extends C06G {
        public static final int $stable = 0;
        public final float cropBottomFraction;
        public final float cropTopFraction;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReferenceFraming) {
                    ReferenceFraming referenceFraming = (ReferenceFraming) obj;
                    if (Float.compare(this.cropTopFraction, referenceFraming.cropTopFraction) != 0 || Float.compare(this.cropBottomFraction, referenceFraming.cropBottomFraction) != 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ReferenceFraming copy$default(ReferenceFraming referenceFraming, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = referenceFraming.cropTopFraction;
            }
            if ((i & 2) != 0) {
                f2 = referenceFraming.cropBottomFraction;
            }
            return new ReferenceFraming(f, f2);
        }

        public final float component1() {
            return this.cropTopFraction;
        }

        public final float component2() {
            return this.cropBottomFraction;
        }

        public final ReferenceFraming copy(float f, float f2) {
            return new ReferenceFraming(f, f2);
        }

        public final float getCropBottomFraction() {
            return this.cropBottomFraction;
        }

        public final float getCropTopFraction() {
            return this.cropTopFraction;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.cropTopFraction) * 31) + Float.floatToIntBits(this.cropBottomFraction);
        }

        public ReferenceFraming(float f, float f2) {
            this.cropTopFraction = f;
            this.cropBottomFraction = f2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StaticAvatar extends C06G implements VoiceEmbodimentMedia {
        public static final int $stable = 0;
        public final String imageUri;
        public final ReferenceFraming referenceFraming;

        public StaticAvatar(String str, ReferenceFraming referenceFraming) {
            C7384Etj.A0Y(str, 0);
            this.imageUri = str;
            this.referenceFraming = referenceFraming;
        }

        public final StaticAvatar copy(String str, ReferenceFraming referenceFraming) {
            C7384Etj.A0Y(str, 0);
            return new StaticAvatar(str, referenceFraming);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StaticAvatar) {
                    StaticAvatar staticAvatar = (StaticAvatar) obj;
                    if (!C7384Etj.areEqual(this.imageUri, staticAvatar.imageUri) || !C7384Etj.areEqual(this.referenceFraming, staticAvatar.referenceFraming)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ StaticAvatar copy$default(StaticAvatar staticAvatar, String str, ReferenceFraming referenceFraming, int i, Object obj) {
            if ((i & 1) != 0) {
                str = staticAvatar.imageUri;
            }
            if ((i & 2) != 0) {
                referenceFraming = staticAvatar.referenceFraming;
            }
            C7384Etj.A0Y(str, 0);
            return new StaticAvatar(str, referenceFraming);
        }

        public final String component1() {
            return this.imageUri;
        }

        public final ReferenceFraming component2() {
            return this.referenceFraming;
        }

        public final String getImageUri() {
            return this.imageUri;
        }

        public final ReferenceFraming getReferenceFraming() {
            return this.referenceFraming;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.imageUri) + AnonymousClass006.A0D(this.referenceFraming);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ StaticAvatar(String str, ReferenceFraming referenceFraming, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : referenceFraming);
        }
    }
}
