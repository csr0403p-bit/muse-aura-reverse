package com.facebook.aura.checkpoint;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchCheckpointBlock extends C06G {
    public final String url;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCheckpointBlock) && C7384Etj.areEqual(this.url, ((HatchCheckpointBlock) obj).url));
    }

    public static /* synthetic */ HatchCheckpointBlock copy$default(HatchCheckpointBlock hatchCheckpointBlock, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckpointBlock.url;
        }
        return new HatchCheckpointBlock(str);
    }

    public final String component1() {
        return this.url;
    }

    public final HatchCheckpointBlock copy(String str) {
        return new HatchCheckpointBlock(str);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.url);
    }

    public HatchCheckpointBlock(String str) {
        this.url = str;
    }

    public String toString() {
        return super.toString();
    }
}
