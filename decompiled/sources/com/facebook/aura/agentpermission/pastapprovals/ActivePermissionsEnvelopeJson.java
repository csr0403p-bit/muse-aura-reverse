package com.facebook.aura.agentpermission.pastapprovals;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionsEnvelopeJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final ActivePermissionsPageJson activePermissions;

    public final class Companion {
        public final C9hr<ActivePermissionsEnvelopeJson> serializer() {
            return ActivePermissionsEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ActivePermissionsEnvelopeJson copy(ActivePermissionsPageJson activePermissionsPageJson) {
        C7384Etj.A0Y(activePermissionsPageJson, 0);
        return new ActivePermissionsEnvelopeJson(activePermissionsPageJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ActivePermissionsEnvelopeJson) && C7384Etj.areEqual(this.activePermissions, ((ActivePermissionsEnvelopeJson) obj).activePermissions));
    }

    public /* synthetic */ ActivePermissionsEnvelopeJson(int i, ActivePermissionsPageJson activePermissionsPageJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ActivePermissionsEnvelopeJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.activePermissions = activePermissionsPageJson;
    }

    public static /* synthetic */ ActivePermissionsEnvelopeJson copy$default(ActivePermissionsEnvelopeJson activePermissionsEnvelopeJson, ActivePermissionsPageJson activePermissionsPageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            activePermissionsPageJson = activePermissionsEnvelopeJson.activePermissions;
        }
        C7384Etj.A0Y(activePermissionsPageJson, 0);
        return new ActivePermissionsEnvelopeJson(activePermissionsPageJson);
    }

    public static /* synthetic */ void getActivePermissions$annotations() {
    }

    public final ActivePermissionsPageJson component1() {
        return this.activePermissions;
    }

    public final ActivePermissionsPageJson getActivePermissions() {
        return this.activePermissions;
    }

    public int hashCode() {
        return this.activePermissions.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ActivePermissionsEnvelopeJson(ActivePermissionsPageJson activePermissionsPageJson) {
        C7384Etj.A0Y(activePermissionsPageJson, 0);
        this.activePermissions = activePermissionsPageJson;
    }
}
