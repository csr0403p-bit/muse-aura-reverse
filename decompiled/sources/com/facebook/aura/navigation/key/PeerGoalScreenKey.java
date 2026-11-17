package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerGoalScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String goalId;
    public final String hostMuse;
    public final String title;

    public final class Companion {
        public final C9hr<PeerGoalScreenKey> serializer() {
            return PeerGoalScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PeerGoalScreenKey peerGoalScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerGoalScreenKey.hostMuse, c9iZ, 0);
        c9j5.AAV(peerGoalScreenKey.goalId, c9iZ, 1);
        if (c9j5.AfR() || !C3cH.A1Q(peerGoalScreenKey.title)) {
            c9j5.AAV(peerGoalScreenKey.title, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerGoalScreenKey) {
                PeerGoalScreenKey peerGoalScreenKey = (PeerGoalScreenKey) obj;
                if (!C7384Etj.areEqual(this.hostMuse, peerGoalScreenKey.hostMuse) || !C7384Etj.areEqual(this.goalId, peerGoalScreenKey.goalId) || !C7384Etj.areEqual(this.title, peerGoalScreenKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerGoalScreenKey copy$default(PeerGoalScreenKey peerGoalScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerGoalScreenKey.hostMuse;
        }
        if ((i & 2) != 0) {
            str2 = peerGoalScreenKey.goalId;
        }
        if ((i & 4) != 0) {
            str3 = peerGoalScreenKey.title;
        }
        return peerGoalScreenKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.hostMuse;
    }

    public final String component2() {
        return this.goalId;
    }

    public final String component3() {
        return this.title;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getHostMuse() {
        return this.hostMuse;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.goalId, AnonymousClass001.A0G(this.hostMuse)));
    }

    public PeerGoalScreenKey(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.hostMuse = str;
        this.goalId = str2;
        this.title = str3;
    }

    public final PeerGoalScreenKey copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PeerGoalScreenKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerGoalScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerGoalScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.hostMuse = str;
        this.goalId = str2;
        this.title = (i & 4) == 0 ? "" : str3;
    }

    public /* synthetic */ PeerGoalScreenKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }
}
