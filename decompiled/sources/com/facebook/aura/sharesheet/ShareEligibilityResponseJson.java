package com.facebook.aura.sharesheet;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShareEligibilityResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean can_broadcast_share;

    public final class Companion {
        public final C9hr<ShareEligibilityResponseJson> serializer() {
            return ShareEligibilityResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShareEligibilityResponseJson) && this.can_broadcast_share == ((ShareEligibilityResponseJson) obj).can_broadcast_share);
    }

    public /* synthetic */ ShareEligibilityResponseJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShareEligibilityResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.can_broadcast_share = z;
    }

    public static /* synthetic */ ShareEligibilityResponseJson copy$default(ShareEligibilityResponseJson shareEligibilityResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shareEligibilityResponseJson.can_broadcast_share;
        }
        return new ShareEligibilityResponseJson(z);
    }

    public final boolean component1() {
        return this.can_broadcast_share;
    }

    public final ShareEligibilityResponseJson copy(boolean z) {
        return new ShareEligibilityResponseJson(z);
    }

    public final boolean getCan_broadcast_share() {
        return this.can_broadcast_share;
    }

    public int hashCode() {
        return this.can_broadcast_share ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public ShareEligibilityResponseJson(boolean z) {
        this.can_broadcast_share = z;
    }
}
