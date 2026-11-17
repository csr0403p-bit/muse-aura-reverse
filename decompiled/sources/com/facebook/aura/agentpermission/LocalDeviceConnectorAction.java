package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeHitlSpec;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorAction extends C06G {
    public static final int $stable = 0;
    public final String key;
    public final String label;
    public final NodeHitlSpec spec;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalDeviceConnectorAction) {
                LocalDeviceConnectorAction localDeviceConnectorAction = (LocalDeviceConnectorAction) obj;
                if (!C7384Etj.areEqual(this.key, localDeviceConnectorAction.key) || !C7384Etj.areEqual(this.label, localDeviceConnectorAction.label) || !C7384Etj.areEqual(this.spec, localDeviceConnectorAction.spec)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalDeviceConnectorAction copy$default(LocalDeviceConnectorAction localDeviceConnectorAction, String str, String str2, NodeHitlSpec nodeHitlSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localDeviceConnectorAction.key;
        }
        if ((i & 2) != 0) {
            str2 = localDeviceConnectorAction.label;
        }
        if ((i & 4) != 0) {
            nodeHitlSpec = localDeviceConnectorAction.spec;
        }
        return localDeviceConnectorAction.copy(str, str2, nodeHitlSpec);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final NodeHitlSpec component3() {
        return this.spec;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final NodeHitlSpec getSpec() {
        return this.spec;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.spec, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key)));
    }

    public LocalDeviceConnectorAction(String str, String str2, NodeHitlSpec nodeHitlSpec) {
        AnonymousClass005.A0x(str, str2, nodeHitlSpec);
        this.key = str;
        this.label = str2;
        this.spec = nodeHitlSpec;
    }

    public final LocalDeviceConnectorAction copy(String str, String str2, NodeHitlSpec nodeHitlSpec) {
        AnonymousClass005.A0x(str, str2, nodeHitlSpec);
        return new LocalDeviceConnectorAction(str, str2, nodeHitlSpec);
    }

    public String toString() {
        return super.toString();
    }
}
