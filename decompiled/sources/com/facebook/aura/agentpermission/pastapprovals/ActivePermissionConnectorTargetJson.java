package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionConnectorTargetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String key;

    public final class Companion {
        public final C9hr<ActivePermissionConnectorTargetJson> serializer() {
            return ActivePermissionConnectorTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || activePermissionConnectorTargetJson.key != null) {
            c9j5.AAP(activePermissionConnectorTargetJson.key, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ActivePermissionConnectorTargetJson) && C7384Etj.areEqual(this.key, ((ActivePermissionConnectorTargetJson) obj).key));
    }

    public static /* synthetic */ ActivePermissionConnectorTargetJson copy$default(ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermissionConnectorTargetJson.key;
        }
        return new ActivePermissionConnectorTargetJson(str);
    }

    public final String component1() {
        return this.key;
    }

    public final ActivePermissionConnectorTargetJson copy(String str) {
        return new ActivePermissionConnectorTargetJson(str);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.key);
    }

    public /* synthetic */ ActivePermissionConnectorTargetJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key = null;
        } else {
            this.key = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ActivePermissionConnectorTargetJson(String str) {
        this.key = str;
    }

    public /* synthetic */ ActivePermissionConnectorTargetJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ActivePermissionConnectorTargetJson() {
        this(null);
    }
}
