package com.facebook.aura.activation.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DebugResetInviteCodeRedemptionResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int redemptions_deleted;

    public final class Companion {
        public final C9hr<DebugResetInviteCodeRedemptionResponseJson> serializer() {
            return DebugResetInviteCodeRedemptionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(DebugResetInviteCodeRedemptionResponseJson debugResetInviteCodeRedemptionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || debugResetInviteCodeRedemptionResponseJson.redemptions_deleted != 0) {
            c9j5.AAK(c9iZ, 0, debugResetInviteCodeRedemptionResponseJson.redemptions_deleted);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DebugResetInviteCodeRedemptionResponseJson) && this.redemptions_deleted == ((DebugResetInviteCodeRedemptionResponseJson) obj).redemptions_deleted);
    }

    public static /* synthetic */ DebugResetInviteCodeRedemptionResponseJson copy$default(DebugResetInviteCodeRedemptionResponseJson debugResetInviteCodeRedemptionResponseJson, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = debugResetInviteCodeRedemptionResponseJson.redemptions_deleted;
        }
        return new DebugResetInviteCodeRedemptionResponseJson(i);
    }

    public final int component1() {
        return this.redemptions_deleted;
    }

    public final DebugResetInviteCodeRedemptionResponseJson copy(int i) {
        return new DebugResetInviteCodeRedemptionResponseJson(i);
    }

    public final int getRedemptions_deleted() {
        return this.redemptions_deleted;
    }

    public int hashCode() {
        return this.redemptions_deleted;
    }

    public /* synthetic */ DebugResetInviteCodeRedemptionResponseJson(int i, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.redemptions_deleted = 0;
        } else {
            this.redemptions_deleted = i2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DebugResetInviteCodeRedemptionResponseJson(int i) {
        this.redemptions_deleted = i;
    }

    public /* synthetic */ DebugResetInviteCodeRedemptionResponseJson(int i, int i2, C06H c06h) {
        this(C3cI.A00(i2, i));
    }

    public DebugResetInviteCodeRedemptionResponseJson() {
        this(0);
    }
}
