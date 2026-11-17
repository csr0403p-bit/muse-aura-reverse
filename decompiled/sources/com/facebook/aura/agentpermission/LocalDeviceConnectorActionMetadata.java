package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeHitlSpec;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorActionMetadata extends C06G {
    public static final int $stable = 8;
    public final String key;
    public final int labelRes;
    public final NodeHitlSpec spec;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalDeviceConnectorActionMetadata) {
                LocalDeviceConnectorActionMetadata localDeviceConnectorActionMetadata = (LocalDeviceConnectorActionMetadata) obj;
                if (!C7384Etj.areEqual(this.key, localDeviceConnectorActionMetadata.key) || this.labelRes != localDeviceConnectorActionMetadata.labelRes || !C7384Etj.areEqual(this.spec, localDeviceConnectorActionMetadata.spec)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalDeviceConnectorActionMetadata copy$default(LocalDeviceConnectorActionMetadata localDeviceConnectorActionMetadata, String str, int i, NodeHitlSpec nodeHitlSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = localDeviceConnectorActionMetadata.key;
        }
        if ((i2 & 2) != 0) {
            i = localDeviceConnectorActionMetadata.labelRes;
        }
        if ((i2 & 4) != 0) {
            nodeHitlSpec = localDeviceConnectorActionMetadata.spec;
        }
        return localDeviceConnectorActionMetadata.copy(str, i, nodeHitlSpec);
    }

    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.labelRes;
    }

    public final NodeHitlSpec component3() {
        return this.spec;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final NodeHitlSpec getSpec() {
        return this.spec;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.spec, (AnonymousClass001.A0G(this.key) + this.labelRes) * 31);
    }

    public LocalDeviceConnectorActionMetadata(String str, int i, NodeHitlSpec nodeHitlSpec) {
        AnonymousClass003.A0v(str, nodeHitlSpec);
        this.key = str;
        this.labelRes = i;
        this.spec = nodeHitlSpec;
    }

    public final LocalDeviceConnectorActionMetadata copy(String str, int i, NodeHitlSpec nodeHitlSpec) {
        AnonymousClass003.A0v(str, nodeHitlSpec);
        return new LocalDeviceConnectorActionMetadata(str, i, nodeHitlSpec);
    }

    public String toString() {
        return super.toString();
    }
}
