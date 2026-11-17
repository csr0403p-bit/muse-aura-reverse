package com.facebook.aura.nodes.snapshot;

import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeHitlCatalog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class NodeCommandTimeoutsKt {
    public static final long DEFAULT_INVOKE_TIMEOUT_MS = 10000;
    public static final long INTERACTIVE_COMMAND_TIMEOUT_MS = 120000;

    public static final long advertisedCommandTimeoutMs(NodeCommandId nodeCommandId, NodeCommandSpec nodeCommandSpec) {
        C7384Etj.A0Y(nodeCommandSpec, 1);
        long j = nodeCommandSpec.timeoutMs;
        if (j > 0) {
            return j;
        }
        if (nodeCommandId != null && (NodeHitlCatalog.INSTANCE.forCommand(nodeCommandId) != null || !NodeCommandDevicePermissionsKt.devicePermissionsCommandMayRequest(nodeCommandId).isEmpty())) {
            return 120000L;
        }
        List<String> list = nodeCommandSpec.permissionRequired;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0L;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (HatchPermissionCatalogKt.permissionEntryForTag(it.next()) != null) {
                return 120000L;
            }
        }
        return 0L;
    }

    public static final long declaredCommandTimeoutMs(NodeCommandId nodeCommandId, NodeCommandSpec nodeCommandSpec) {
        C7384Etj.A0Y(nodeCommandSpec, 1);
        long jAdvertisedCommandTimeoutMs = advertisedCommandTimeoutMs(nodeCommandId, nodeCommandSpec);
        if (jAdvertisedCommandTimeoutMs <= 0) {
            return 10000L;
        }
        return jAdvertisedCommandTimeoutMs;
    }
}
