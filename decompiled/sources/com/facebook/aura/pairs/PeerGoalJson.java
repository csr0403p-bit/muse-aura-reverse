package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerGoalJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SharedGoalJson goal;
    public final String host_muse;

    public final class Companion {
        public final C9hr<PeerGoalJson> serializer() {
            return PeerGoalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerGoalJson(String str, SharedGoalJson sharedGoalJson) {
        C7384Etj.A0Y(str, 0);
        this.host_muse = str;
        this.goal = sharedGoalJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerGoalJson peerGoalJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerGoalJson.host_muse)) {
            c9j5.AAV(peerGoalJson.host_muse, c9iZ, 0);
        }
        if (zAfR || peerGoalJson.goal != null) {
            c9j5.AAP(peerGoalJson.goal, SharedGoalJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final PeerGoalJson copy(String str, SharedGoalJson sharedGoalJson) {
        C7384Etj.A0Y(str, 0);
        return new PeerGoalJson(str, sharedGoalJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerGoalJson) {
                PeerGoalJson peerGoalJson = (PeerGoalJson) obj;
                if (!C7384Etj.areEqual(this.host_muse, peerGoalJson.host_muse) || !C7384Etj.areEqual(this.goal, peerGoalJson.goal)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerGoalJson copy$default(PeerGoalJson peerGoalJson, String str, SharedGoalJson sharedGoalJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerGoalJson.host_muse;
        }
        if ((i & 2) != 0) {
            sharedGoalJson = peerGoalJson.goal;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerGoalJson(str, sharedGoalJson);
    }

    public final String component1() {
        return this.host_muse;
    }

    public final SharedGoalJson component2() {
        return this.goal;
    }

    public final SharedGoalJson getGoal() {
        return this.goal;
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.host_muse) + AnonymousClass006.A0D(this.goal);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerGoalJson(int i, String str, SharedGoalJson sharedGoalJson, C2hx c2hx) {
        this.host_muse = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.goal = null;
        } else {
            this.goal = sharedGoalJson;
        }
    }

    public /* synthetic */ PeerGoalJson(String str, SharedGoalJson sharedGoalJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : sharedGoalJson);
    }

    public PeerGoalJson() {
        this("", null);
    }
}
