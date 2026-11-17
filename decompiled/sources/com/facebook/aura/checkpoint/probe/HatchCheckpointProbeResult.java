package com.facebook.aura.checkpoint.probe;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchCheckpointProbeResult extends C06G {
    public final String flowId;
    public final Integer nextCheckAfterSeconds;
    public final HatchCheckpointProbeStatus status;
    public final String url;

    public HatchCheckpointProbeResult(HatchCheckpointProbeStatus hatchCheckpointProbeStatus, String str, String str2, Integer num) {
        C7384Etj.A0Y(hatchCheckpointProbeStatus, 0);
        this.status = hatchCheckpointProbeStatus;
        this.url = str;
        this.flowId = str2;
        this.nextCheckAfterSeconds = num;
    }

    public final HatchCheckpointProbeResult copy(HatchCheckpointProbeStatus hatchCheckpointProbeStatus, String str, String str2, Integer num) {
        C7384Etj.A0Y(hatchCheckpointProbeStatus, 0);
        return new HatchCheckpointProbeResult(hatchCheckpointProbeStatus, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckpointProbeResult) {
                HatchCheckpointProbeResult hatchCheckpointProbeResult = (HatchCheckpointProbeResult) obj;
                if (this.status != hatchCheckpointProbeResult.status || !C7384Etj.areEqual(this.url, hatchCheckpointProbeResult.url) || !C7384Etj.areEqual(this.flowId, hatchCheckpointProbeResult.flowId) || !C7384Etj.areEqual(this.nextCheckAfterSeconds, hatchCheckpointProbeResult.nextCheckAfterSeconds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckpointProbeResult copy$default(HatchCheckpointProbeResult hatchCheckpointProbeResult, HatchCheckpointProbeStatus hatchCheckpointProbeStatus, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchCheckpointProbeStatus = hatchCheckpointProbeResult.status;
        }
        if ((i & 2) != 0) {
            str = hatchCheckpointProbeResult.url;
        }
        if ((i & 4) != 0) {
            str2 = hatchCheckpointProbeResult.flowId;
        }
        if ((i & 8) != 0) {
            num = hatchCheckpointProbeResult.nextCheckAfterSeconds;
        }
        C7384Etj.A0Y(hatchCheckpointProbeStatus, 0);
        return new HatchCheckpointProbeResult(hatchCheckpointProbeStatus, str, str2, num);
    }

    public final HatchCheckpointProbeStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.flowId;
    }

    public final Integer component4() {
        return this.nextCheckAfterSeconds;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final Integer getNextCheckAfterSeconds() {
        return this.nextCheckAfterSeconds;
    }

    public final HatchCheckpointProbeStatus getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.flowId)) * 31) + C3cH.A02(this.nextCheckAfterSeconds);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckpointProbeResult(HatchCheckpointProbeStatus hatchCheckpointProbeStatus, String str, String str2, Integer num, int i, C06H c06h) {
        this(hatchCheckpointProbeStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
