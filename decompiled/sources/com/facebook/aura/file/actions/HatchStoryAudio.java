package com.facebook.aura.file.actions;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchStoryAudio extends C06G {
    public final String assetId;
    public final String clusterId;
    public final Integer durationMs;
    public final int startMs;

    public HatchStoryAudio(String str, String str2, int i, Integer num) {
        C7384Etj.A0Y(str2, 1);
        this.assetId = str;
        this.clusterId = str2;
        this.startMs = i;
        this.durationMs = num;
    }

    public final HatchStoryAudio copy(String str, String str2, int i, Integer num) {
        C7384Etj.A0Y(str2, 1);
        return new HatchStoryAudio(str, str2, i, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStoryAudio) {
                HatchStoryAudio hatchStoryAudio = (HatchStoryAudio) obj;
                if (!C7384Etj.areEqual(this.assetId, hatchStoryAudio.assetId) || !C7384Etj.areEqual(this.clusterId, hatchStoryAudio.clusterId) || this.startMs != hatchStoryAudio.startMs || !C7384Etj.areEqual(this.durationMs, hatchStoryAudio.durationMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStoryAudio copy$default(HatchStoryAudio hatchStoryAudio, String str, String str2, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchStoryAudio.assetId;
        }
        if ((i2 & 2) != 0) {
            str2 = hatchStoryAudio.clusterId;
        }
        if ((i2 & 4) != 0) {
            i = hatchStoryAudio.startMs;
        }
        if ((i2 & 8) != 0) {
            num = hatchStoryAudio.durationMs;
        }
        C7384Etj.A0Y(str2, 1);
        return new HatchStoryAudio(str, str2, i, num);
    }

    public final String component1() {
        return this.assetId;
    }

    public final String component2() {
        return this.clusterId;
    }

    public final int component3() {
        return this.startMs;
    }

    public final Integer component4() {
        return this.durationMs;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getClusterId() {
        return this.clusterId;
    }

    public final Integer getDurationMs() {
        return this.durationMs;
    }

    public final int getStartMs() {
        return this.startMs;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.clusterId, AnonymousClass006.A0G(this.assetId) * 31) + this.startMs) * 31) + C3cH.A02(this.durationMs);
    }

    public String toString() {
        return super.toString();
    }
}
