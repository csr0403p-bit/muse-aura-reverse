package com.facebook.aura.settings;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.nodes.registry.NodeRegistrationInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchNodeDebugUiState extends C06G {
    public static final int $stable = 8;
    public final Map<NodeCommandId, NodeCommandSpec> allCommandSpecs;
    public final HatchGatewayConnectionState connectionState;
    public final boolean isLoadingRemoteNodes;
    public final boolean isRegistered;
    public final NodeRegistrationInfo registrationInfo;
    public final List<NodeListEntry> remoteNodes;

    public final HatchNodeDebugUiState copy(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, NodeRegistrationInfo nodeRegistrationInfo, Map<NodeCommandId, NodeCommandSpec> map, List<NodeListEntry> list, boolean z2) {
        AnonymousClass005.A12(hatchGatewayConnectionState, map, list, 1);
        return new HatchNodeDebugUiState(z, hatchGatewayConnectionState, nodeRegistrationInfo, map, list, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNodeDebugUiState) {
                HatchNodeDebugUiState hatchNodeDebugUiState = (HatchNodeDebugUiState) obj;
                if (this.isRegistered != hatchNodeDebugUiState.isRegistered || !C7384Etj.areEqual(this.connectionState, hatchNodeDebugUiState.connectionState) || !C7384Etj.areEqual(this.registrationInfo, hatchNodeDebugUiState.registrationInfo) || !C7384Etj.areEqual(this.allCommandSpecs, hatchNodeDebugUiState.allCommandSpecs) || !C7384Etj.areEqual(this.remoteNodes, hatchNodeDebugUiState.remoteNodes) || this.isLoadingRemoteNodes != hatchNodeDebugUiState.isLoadingRemoteNodes) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNodeDebugUiState() {
        boolean z = false;
        this(z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchNodeDebugUiState copy$default(HatchNodeDebugUiState hatchNodeDebugUiState, boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, NodeRegistrationInfo nodeRegistrationInfo, Map map, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchNodeDebugUiState.isRegistered;
        }
        if ((i & 2) != 0) {
            hatchGatewayConnectionState = hatchNodeDebugUiState.connectionState;
        }
        if ((i & 4) != 0) {
            nodeRegistrationInfo = hatchNodeDebugUiState.registrationInfo;
        }
        if ((i & 8) != 0) {
            map = hatchNodeDebugUiState.allCommandSpecs;
        }
        if ((i & 16) != 0) {
            list = hatchNodeDebugUiState.remoteNodes;
        }
        if ((i & 32) != 0) {
            z2 = hatchNodeDebugUiState.isLoadingRemoteNodes;
        }
        return hatchNodeDebugUiState.copy(z, hatchGatewayConnectionState, nodeRegistrationInfo, map, list, z2);
    }

    public final boolean component1() {
        return this.isRegistered;
    }

    public final HatchGatewayConnectionState component2() {
        return this.connectionState;
    }

    public final NodeRegistrationInfo component3() {
        return this.registrationInfo;
    }

    public final Map<NodeCommandId, NodeCommandSpec> component4() {
        return this.allCommandSpecs;
    }

    public final List<NodeListEntry> component5() {
        return this.remoteNodes;
    }

    public final boolean component6() {
        return this.isLoadingRemoteNodes;
    }

    public final Map<NodeCommandId, NodeCommandSpec> getAllCommandSpecs() {
        return this.allCommandSpecs;
    }

    public final HatchGatewayConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final NodeRegistrationInfo getRegistrationInfo() {
        return this.registrationInfo;
    }

    public final List<NodeListEntry> getRemoteNodes() {
        return this.remoteNodes;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.remoteNodes, AnonymousClass005.A0F(this.allCommandSpecs, (AnonymousClass005.A0F(this.connectionState, C0KA.A02(this.isRegistered)) + AnonymousClass006.A0D(this.registrationInfo)) * 31)), this.isLoadingRemoteNodes);
    }

    public final boolean isLoadingRemoteNodes() {
        return this.isLoadingRemoteNodes;
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNodeDebugUiState(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, NodeRegistrationInfo nodeRegistrationInfo, Map map, List list, boolean z2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE) : hatchGatewayConnectionState, (i & 4) != 0 ? null : nodeRegistrationInfo, (i & 8) != 0 ? AGH.A0E() : map, (i & 16) != 0 ? C0881AGi.A00 : list, AnonymousClass002.A1R(i, z2));
    }

    public HatchNodeDebugUiState(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, NodeRegistrationInfo nodeRegistrationInfo, Map<NodeCommandId, NodeCommandSpec> map, List<NodeListEntry> list, boolean z2) {
        AnonymousClass005.A12(hatchGatewayConnectionState, map, list, 1);
        this.isRegistered = z;
        this.connectionState = hatchGatewayConnectionState;
        this.registrationInfo = nodeRegistrationInfo;
        this.allCommandSpecs = map;
        this.remoteNodes = list;
        this.isLoadingRemoteNodes = z2;
    }
}
