package com.facebook.aura.agentpermission.pastapprovals;

import X.AGI;
import X.AHH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionJson extends C06G {
    public static final int $stable = 8;
    public final ActivePermissionDisplayJson display;
    public final String kind;
    public final String lifetime;
    public final String mode;
    public final List<String> mode_options;
    public final String permissionId;
    public final boolean revocable;
    public final ActivePermissionScopeJson scope;
    public final ActivePermissionTargetJson target;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ActivePermissionJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<ActivePermissionJson> serializer() {
            return ActivePermissionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivePermissionJson(String str, String str2, String str3, boolean z, String str4, List<String> list, ActivePermissionDisplayJson activePermissionDisplayJson, ActivePermissionTargetJson activePermissionTargetJson, ActivePermissionScopeJson activePermissionScopeJson) {
        C7384Etj.A0Y(str, 0);
        this.permissionId = str;
        this.kind = str2;
        this.lifetime = str3;
        this.revocable = z;
        this.mode = str4;
        this.mode_options = list;
        this.display = activePermissionDisplayJson;
        this.target = activePermissionTargetJson;
        this.scope = activePermissionScopeJson;
    }

    public final ActivePermissionJson copy(String str, String str2, String str3, boolean z, String str4, List<String> list, ActivePermissionDisplayJson activePermissionDisplayJson, ActivePermissionTargetJson activePermissionTargetJson, ActivePermissionScopeJson activePermissionScopeJson) {
        C7384Etj.A0Y(str, 0);
        return new ActivePermissionJson(str, str2, str3, z, str4, list, activePermissionDisplayJson, activePermissionTargetJson, activePermissionScopeJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionJson) {
                ActivePermissionJson activePermissionJson = (ActivePermissionJson) obj;
                if (!C7384Etj.areEqual(this.permissionId, activePermissionJson.permissionId) || !C7384Etj.areEqual(this.kind, activePermissionJson.kind) || !C7384Etj.areEqual(this.lifetime, activePermissionJson.lifetime) || this.revocable != activePermissionJson.revocable || !C7384Etj.areEqual(this.mode, activePermissionJson.mode) || !C7384Etj.areEqual(this.mode_options, activePermissionJson.mode_options) || !C7384Etj.areEqual(this.display, activePermissionJson.display) || !C7384Etj.areEqual(this.target, activePermissionJson.target) || !C7384Etj.areEqual(this.scope, activePermissionJson.scope)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivePermissionJson copy$default(ActivePermissionJson activePermissionJson, String str, String str2, String str3, boolean z, String str4, List list, ActivePermissionDisplayJson activePermissionDisplayJson, ActivePermissionTargetJson activePermissionTargetJson, ActivePermissionScopeJson activePermissionScopeJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermissionJson.permissionId;
        }
        if ((i & 2) != 0) {
            str2 = activePermissionJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = activePermissionJson.lifetime;
        }
        if ((i & 8) != 0) {
            z = activePermissionJson.revocable;
        }
        if ((i & 16) != 0) {
            str4 = activePermissionJson.mode;
        }
        if ((i & 32) != 0) {
            list = activePermissionJson.mode_options;
        }
        if ((i & 64) != 0) {
            activePermissionDisplayJson = activePermissionJson.display;
        }
        if ((i & 128) != 0) {
            activePermissionTargetJson = activePermissionJson.target;
        }
        if ((i & 256) != 0) {
            activePermissionScopeJson = activePermissionJson.scope;
        }
        return activePermissionJson.copy(str, str2, str3, z, str4, list, activePermissionDisplayJson, activePermissionTargetJson, activePermissionScopeJson);
    }

    public static /* synthetic */ void getPermissionId$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionJson activePermissionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(activePermissionJson.permissionId)) {
            c9j5.AAV(activePermissionJson.permissionId, c9iZ, 0);
        }
        if (zAfR || activePermissionJson.kind != null) {
            c9j5.AAP(activePermissionJson.kind, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activePermissionJson.lifetime != null) {
            c9j5.AAP(activePermissionJson.lifetime, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activePermissionJson.revocable) {
            c9j5.AA7(c9iZ, 3, activePermissionJson.revocable);
        }
        if (zAfR || activePermissionJson.mode != null) {
            c9j5.AAP(activePermissionJson.mode, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || activePermissionJson.mode_options != null) {
            c9j5.AAP(activePermissionJson.mode_options, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || activePermissionJson.display != null) {
            c9j5.AAP(activePermissionJson.display, ActivePermissionDisplayJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || activePermissionJson.target != null) {
            c9j5.AAP(activePermissionJson.target, ActivePermissionTargetJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || activePermissionJson.scope != null) {
            c9j5.AAP(activePermissionJson.scope, ActivePermissionScopeJson$$serializer.INSTANCE, c9iZ, 8);
        }
    }

    public final String component1() {
        return this.permissionId;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.lifetime;
    }

    public final boolean component4() {
        return this.revocable;
    }

    public final String component5() {
        return this.mode;
    }

    public final List<String> component6() {
        return this.mode_options;
    }

    public final ActivePermissionDisplayJson component7() {
        return this.display;
    }

    public final ActivePermissionTargetJson component8() {
        return this.target;
    }

    public final ActivePermissionScopeJson component9() {
        return this.scope;
    }

    public final ActivePermissionDisplayJson getDisplay() {
        return this.display;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLifetime() {
        return this.lifetime;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getMode_options() {
        return this.mode_options;
    }

    public final String getPermissionId() {
        return this.permissionId;
    }

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final ActivePermissionScopeJson getScope() {
        return this.scope;
    }

    public final ActivePermissionTargetJson getTarget() {
        return this.target;
    }

    public int hashCode() {
        return ((((((((C0KA.A01((((AnonymousClass001.A0G(this.permissionId) + AnonymousClass006.A0G(this.kind)) * 31) + AnonymousClass006.A0G(this.lifetime)) * 31, this.revocable) + AnonymousClass006.A0G(this.mode)) * 31) + AnonymousClass006.A0D(this.mode_options)) * 31) + AnonymousClass006.A0D(this.display)) * 31) + AnonymousClass006.A0D(this.target)) * 31) + C3cH.A02(this.scope);
    }

    public final ActivePermission toDomain() {
        ActivePermissionKind activePermissionKindFromWire;
        ActivePermissionDisplayJson activePermissionDisplayJson;
        ActivePermissionDisplay domain;
        String str = this.permissionId;
        if (C7BY.A0j(str) || str == null || (activePermissionKindFromWire = ActivePermissionKind.Companion.fromWire(this.kind)) == null || (activePermissionDisplayJson = this.display) == null || (domain = activePermissionDisplayJson.toDomain()) == null) {
            return null;
        }
        ActivePermissionLifetime activePermissionLifetimeFromWire = ActivePermissionLifetime.Companion.fromWire(this.lifetime);
        boolean z = this.revocable;
        String str2 = this.mode;
        ConnectorPermissionMode connectorPermissionModeOrNull = str2 != null ? ActivePermissionsRepositoryJsonKt.toConnectorPermissionModeOrNull(str2) : null;
        List list = this.mode_options;
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConnectorPermissionMode connectorPermissionModeOrNull2 = ActivePermissionsRepositoryJsonKt.toConnectorPermissionModeOrNull(AnonymousClass005.A0j(it));
            if (connectorPermissionModeOrNull2 != null) {
                arrayListA0h.add(connectorPermissionModeOrNull2);
            }
        }
        AHH ahhA0C = AGI.A0C(arrayListA0h);
        ActivePermissionTargetJson activePermissionTargetJson = this.target;
        String strConnectorKey = activePermissionTargetJson != null ? activePermissionTargetJson.connectorKey() : null;
        ActivePermissionScopeJson activePermissionScopeJson = this.scope;
        return new ActivePermission(str, activePermissionKindFromWire, activePermissionLifetimeFromWire, z, connectorPermissionModeOrNull, ahhA0C, domain, strConnectorKey, activePermissionScopeJson != null ? activePermissionScopeJson.toDomain() : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionJson(String str, String str2, String str3, boolean z, String str4, List list, ActivePermissionDisplayJson activePermissionDisplayJson, ActivePermissionTargetJson activePermissionTargetJson, ActivePermissionScopeJson activePermissionScopeJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : activePermissionDisplayJson, (i & 128) != 0 ? null : activePermissionTargetJson, (i & 256) != 0 ? null : activePermissionScopeJson);
    }

    public /* synthetic */ ActivePermissionJson(int i, String str, String str2, String str3, boolean z, String str4, List list, ActivePermissionDisplayJson activePermissionDisplayJson, ActivePermissionTargetJson activePermissionTargetJson, ActivePermissionScopeJson activePermissionScopeJson, C2hx c2hx) {
        this.permissionId = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.kind = null;
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.lifetime = null;
        } else {
            this.lifetime = str3;
        }
        if ((i & 8) == 0) {
            this.revocable = false;
        } else {
            this.revocable = z;
        }
        if ((i & 16) == 0) {
            this.mode = null;
        } else {
            this.mode = str4;
        }
        if ((i & 32) == 0) {
            this.mode_options = null;
        } else {
            this.mode_options = list;
        }
        if ((i & 64) == 0) {
            this.display = null;
        } else {
            this.display = activePermissionDisplayJson;
        }
        if ((i & 128) == 0) {
            this.target = null;
        } else {
            this.target = activePermissionTargetJson;
        }
        if ((i & 256) == 0) {
            this.scope = null;
        } else {
            this.scope = activePermissionScopeJson;
        }
    }

    public ActivePermissionJson() {
        this("", null, null, false, null, null, null, null, null);
    }
}
