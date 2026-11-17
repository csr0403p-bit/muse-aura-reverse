package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.nodes.core.NodeHitlMode;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;

/* loaded from: classes3.dex */
public final class NodeHitlPermissionStore {
    public static final int $stable = 0;
    public final PermissionDefaultMode baseline;
    public final boolean synchronousWritesForTest;
    public final String vmId;

    public NodeHitlPermissionStore(String str, PermissionDefaultMode permissionDefaultMode, boolean z) {
        C7384Etj.A0Y(permissionDefaultMode, 1);
        this.vmId = str;
        this.baseline = permissionDefaultMode;
        this.synchronousWritesForTest = z;
    }

    public final void clearOverride(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        BzK bzKA9q = prefs().A9q();
        bzKA9q.Aae(prefKey(nodeHitlSpec));
        bzKA9q.apply();
    }

    public final NodeHitlMode getMode(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        String strA00 = C4oT.A00(prefs(), prefKey(nodeHitlSpec));
        NodeHitlMode.Companion companion = NodeHitlMode.Companion;
        NodeHitlMode nodeHitlModeFromWire = companion.fromWire(strA00);
        return (nodeHitlModeFromWire == null || (nodeHitlModeFromWire == NodeHitlMode.ALLOW && HatchNodeHitlGateKt.NO_ALLOW_ALWAYS_GROUPS.contains(nodeHitlSpec.group))) ? HatchNodeHitlGateKt.withBaseline(companion.defaultFor(nodeHitlSpec.access), this.baseline) : nodeHitlModeFromWire;
    }

    public final boolean hasOverride(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        return prefs().contains(prefKey(nodeHitlSpec));
    }

    private final String prefKey(NodeHitlSpec nodeHitlSpec) {
        return FGI.A0U(nodeHitlSpec.group.getWireValue(), "_", nodeHitlSpec.access.getWireValue());
    }

    private final C4oT prefs() {
        return AuraVMPrefs.INSTANCE.get(this.vmId, AuraVMPrefStore.NODE_HITL_PERMISSIONS);
    }

    public final void clearAllOverrides() {
        BzK bzKA9q = prefs().A9q();
        bzKA9q.A08();
        bzKA9q.apply();
    }

    public final void setMode(NodeHitlSpec nodeHitlSpec, NodeHitlMode nodeHitlMode) {
        AnonymousClass003.A0u(nodeHitlSpec, nodeHitlMode);
        BzK bzKA9q = prefs().A9q();
        bzKA9q.AYr(prefKey(nodeHitlSpec), nodeHitlMode.getWireValue());
        if (this.synchronousWritesForTest) {
            bzKA9q.commit();
        } else {
            bzKA9q.apply();
        }
    }

    public /* synthetic */ NodeHitlPermissionStore(String str, PermissionDefaultMode permissionDefaultMode, boolean z, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? PermissionDefaultMode.AUTO_ALLOW : permissionDefaultMode, AnonymousClass005.A1O(i, z));
    }
}
