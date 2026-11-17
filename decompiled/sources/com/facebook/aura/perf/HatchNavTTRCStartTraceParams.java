package com.facebook.aura.perf;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchNavTTRCStartTraceParams extends C06G {
    public final int instanceId;
    public final int markerId;
    public final String touchUpModule;
    public final Long touchUpTimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNavTTRCStartTraceParams) {
                HatchNavTTRCStartTraceParams hatchNavTTRCStartTraceParams = (HatchNavTTRCStartTraceParams) obj;
                if (this.markerId != hatchNavTTRCStartTraceParams.markerId || this.instanceId != hatchNavTTRCStartTraceParams.instanceId || !C7384Etj.areEqual(this.touchUpTimeMs, hatchNavTTRCStartTraceParams.touchUpTimeMs) || !C7384Etj.areEqual(this.touchUpModule, hatchNavTTRCStartTraceParams.touchUpModule)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchNavTTRCStartTraceParams(int i, int i2, Long l, String str, int i3, C06H c06h) {
        this(i, i2, (i3 & 4) != 0 ? null : l, (i3 & 8) != 0 ? null : str);
    }

    public static /* synthetic */ HatchNavTTRCStartTraceParams copy$default(HatchNavTTRCStartTraceParams hatchNavTTRCStartTraceParams, int i, int i2, Long l, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hatchNavTTRCStartTraceParams.markerId;
        }
        if ((i3 & 2) != 0) {
            i2 = hatchNavTTRCStartTraceParams.instanceId;
        }
        if ((i3 & 4) != 0) {
            l = hatchNavTTRCStartTraceParams.touchUpTimeMs;
        }
        if ((i3 & 8) != 0) {
            str = hatchNavTTRCStartTraceParams.touchUpModule;
        }
        return new HatchNavTTRCStartTraceParams(i, i2, l, str);
    }

    public final int component1() {
        return this.markerId;
    }

    public final int component2() {
        return this.instanceId;
    }

    public final Long component3() {
        return this.touchUpTimeMs;
    }

    public final String component4() {
        return this.touchUpModule;
    }

    public final HatchNavTTRCStartTraceParams copy(int i, int i2, Long l, String str) {
        return new HatchNavTTRCStartTraceParams(i, i2, l, str);
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final int getMarkerId() {
        return this.markerId;
    }

    public final String getTouchUpModule() {
        return this.touchUpModule;
    }

    public final Long getTouchUpTimeMs() {
        return this.touchUpTimeMs;
    }

    public int hashCode() {
        return (((((this.markerId * 31) + this.instanceId) * 31) + AnonymousClass006.A0D(this.touchUpTimeMs)) * 31) + AnonymousClass005.A0H(this.touchUpModule);
    }

    public String toString() {
        return super.toString();
    }

    public HatchNavTTRCStartTraceParams(int i, int i2, Long l, String str) {
        this.markerId = i;
        this.instanceId = i2;
        this.touchUpTimeMs = l;
        this.touchUpModule = str;
    }
}
