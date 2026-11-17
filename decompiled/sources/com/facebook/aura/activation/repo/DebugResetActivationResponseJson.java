package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DebugResetActivationResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int ccv_orders_deleted;
    public final boolean consent_revoked;
    public final int redemptions_deleted;
    public final boolean waitlist_reset;
    public final boolean wearables_link_reset;

    public final class Companion {
        public final C9hr<DebugResetActivationResponseJson> serializer() {
            return DebugResetActivationResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(DebugResetActivationResponseJson debugResetActivationResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || debugResetActivationResponseJson.waitlist_reset) {
            c9j5.AA7(c9iZ, 0, debugResetActivationResponseJson.waitlist_reset);
        }
        if (zAfR || debugResetActivationResponseJson.redemptions_deleted != 0) {
            c9j5.AAK(c9iZ, 1, debugResetActivationResponseJson.redemptions_deleted);
        }
        if (zAfR || debugResetActivationResponseJson.consent_revoked) {
            c9j5.AA7(c9iZ, 2, debugResetActivationResponseJson.consent_revoked);
        }
        if (zAfR || debugResetActivationResponseJson.ccv_orders_deleted != 0) {
            c9j5.AAK(c9iZ, 3, debugResetActivationResponseJson.ccv_orders_deleted);
        }
        if (zAfR || debugResetActivationResponseJson.wearables_link_reset) {
            c9j5.AA7(c9iZ, 4, debugResetActivationResponseJson.wearables_link_reset);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DebugResetActivationResponseJson) {
                DebugResetActivationResponseJson debugResetActivationResponseJson = (DebugResetActivationResponseJson) obj;
                if (this.waitlist_reset != debugResetActivationResponseJson.waitlist_reset || this.redemptions_deleted != debugResetActivationResponseJson.redemptions_deleted || this.consent_revoked != debugResetActivationResponseJson.consent_revoked || this.ccv_orders_deleted != debugResetActivationResponseJson.ccv_orders_deleted || this.wearables_link_reset != debugResetActivationResponseJson.wearables_link_reset) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DebugResetActivationResponseJson copy$default(DebugResetActivationResponseJson debugResetActivationResponseJson, boolean z, int i, boolean z2, int i2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = debugResetActivationResponseJson.waitlist_reset;
        }
        if ((i3 & 2) != 0) {
            i = debugResetActivationResponseJson.redemptions_deleted;
        }
        if ((i3 & 4) != 0) {
            z2 = debugResetActivationResponseJson.consent_revoked;
        }
        if ((i3 & 8) != 0) {
            i2 = debugResetActivationResponseJson.ccv_orders_deleted;
        }
        if ((i3 & 16) != 0) {
            z3 = debugResetActivationResponseJson.wearables_link_reset;
        }
        return debugResetActivationResponseJson.copy(z, i, z2, i2, z3);
    }

    public final boolean component1() {
        return this.waitlist_reset;
    }

    public final int component2() {
        return this.redemptions_deleted;
    }

    public final boolean component3() {
        return this.consent_revoked;
    }

    public final int component4() {
        return this.ccv_orders_deleted;
    }

    public final boolean component5() {
        return this.wearables_link_reset;
    }

    public final DebugResetActivationResponseJson copy(boolean z, int i, boolean z2, int i2, boolean z3) {
        return new DebugResetActivationResponseJson(z, i, z2, i2, z3);
    }

    public final int getCcv_orders_deleted() {
        return this.ccv_orders_deleted;
    }

    public final boolean getConsent_revoked() {
        return this.consent_revoked;
    }

    public final int getRedemptions_deleted() {
        return this.redemptions_deleted;
    }

    public final boolean getWaitlist_reset() {
        return this.waitlist_reset;
    }

    public final boolean getWearables_link_reset() {
        return this.wearables_link_reset;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01((C0KA.A02(this.waitlist_reset) + this.redemptions_deleted) * 31, this.consent_revoked) + this.ccv_orders_deleted) * 31, this.wearables_link_reset);
    }

    public /* synthetic */ DebugResetActivationResponseJson(int i, boolean z, int i2, boolean z2, int i3, boolean z3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.waitlist_reset = false;
        } else {
            this.waitlist_reset = z;
        }
        if ((i & 2) == 0) {
            this.redemptions_deleted = 0;
        } else {
            this.redemptions_deleted = i2;
        }
        if ((i & 4) == 0) {
            this.consent_revoked = false;
        } else {
            this.consent_revoked = z2;
        }
        if ((i & 8) == 0) {
            this.ccv_orders_deleted = 0;
        } else {
            this.ccv_orders_deleted = i3;
        }
        if ((i & 16) == 0) {
            this.wearables_link_reset = false;
        } else {
            this.wearables_link_reset = z3;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DebugResetActivationResponseJson(boolean z, int i, boolean z2, int i2, boolean z3) {
        this.waitlist_reset = z;
        this.redemptions_deleted = i;
        this.consent_revoked = z2;
        this.ccv_orders_deleted = i2;
        this.wearables_link_reset = z3;
    }

    public /* synthetic */ DebugResetActivationResponseJson(boolean z, int i, boolean z2, int i2, boolean z3, int i3, C06H c06h) {
        this(AnonymousClass001.A1P(i3, z), C3cG.A01(i3, i), AnonymousClass005.A1O(i3, z2), (i3 & 8) != 0 ? 0 : i2, C3cI.A1S(i3, z3));
    }

    public DebugResetActivationResponseJson() {
        this(false, 0, false, 0, false);
    }
}
