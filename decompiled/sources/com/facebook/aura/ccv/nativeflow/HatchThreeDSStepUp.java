package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchThreeDSStepUp extends C06G {
    public final HatchThreeDSHttpMethod method;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchThreeDSStepUp) {
                HatchThreeDSStepUp hatchThreeDSStepUp = (HatchThreeDSStepUp) obj;
                if (!C7384Etj.areEqual(this.url, hatchThreeDSStepUp.url) || this.method != hatchThreeDSStepUp.method) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchThreeDSStepUp copy$default(HatchThreeDSStepUp hatchThreeDSStepUp, String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchThreeDSStepUp.url;
        }
        if ((i & 2) != 0) {
            hatchThreeDSHttpMethod = hatchThreeDSStepUp.method;
        }
        AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
        return new HatchThreeDSStepUp(str, hatchThreeDSHttpMethod);
    }

    public final String component1() {
        return this.url;
    }

    public final HatchThreeDSHttpMethod component2() {
        return this.method;
    }

    public final HatchThreeDSHttpMethod getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.method, AnonymousClass001.A0G(this.url));
    }

    public HatchThreeDSStepUp(String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod) {
        AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
        this.url = str;
        this.method = hatchThreeDSHttpMethod;
    }

    public final HatchThreeDSStepUp copy(String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod) {
        AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
        return new HatchThreeDSStepUp(str, hatchThreeDSHttpMethod);
    }

    public String toString() {
        return super.toString();
    }
}
