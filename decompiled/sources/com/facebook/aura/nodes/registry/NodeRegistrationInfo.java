package com.facebook.aura.nodes.registry;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Map;

/* loaded from: classes.dex */
public final class NodeRegistrationInfo extends C06G {
    public final Map<String, NodeCommandSpec> commands;
    public final String deliveryApp;
    public final String deviceFamily;
    public final String displayName;
    public final boolean isBackgroundingSupported;
    public final String modelId;
    public final String nodeId;
    public final String platform;
    public final String version;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeRegistrationInfo) {
                NodeRegistrationInfo nodeRegistrationInfo = (NodeRegistrationInfo) obj;
                if (!C7384Etj.areEqual(this.nodeId, nodeRegistrationInfo.nodeId) || !C7384Etj.areEqual(this.displayName, nodeRegistrationInfo.displayName) || !C7384Etj.areEqual(this.platform, nodeRegistrationInfo.platform) || !C7384Etj.areEqual(this.version, nodeRegistrationInfo.version) || !C7384Etj.areEqual(this.deviceFamily, nodeRegistrationInfo.deviceFamily) || !C7384Etj.areEqual(this.modelId, nodeRegistrationInfo.modelId) || !C7384Etj.areEqual(this.commands, nodeRegistrationInfo.commands) || this.isBackgroundingSupported != nodeRegistrationInfo.isBackgroundingSupported || !C7384Etj.areEqual(this.deliveryApp, nodeRegistrationInfo.deliveryApp)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NodeRegistrationInfo(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, String str7, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, map, z, (i & 256) != 0 ? null : str7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NodeRegistrationInfo copy$default(NodeRegistrationInfo nodeRegistrationInfo, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeRegistrationInfo.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = nodeRegistrationInfo.displayName;
        }
        if ((i & 4) != 0) {
            str3 = nodeRegistrationInfo.platform;
        }
        if ((i & 8) != 0) {
            str4 = nodeRegistrationInfo.version;
        }
        if ((i & 16) != 0) {
            str5 = nodeRegistrationInfo.deviceFamily;
        }
        if ((i & 32) != 0) {
            str6 = nodeRegistrationInfo.modelId;
        }
        if ((i & 64) != 0) {
            map = nodeRegistrationInfo.commands;
        }
        if ((i & 128) != 0) {
            z = nodeRegistrationInfo.isBackgroundingSupported;
        }
        if ((i & 256) != 0) {
            str7 = nodeRegistrationInfo.deliveryApp;
        }
        return nodeRegistrationInfo.copy(str, str2, str3, str4, str5, str6, map, z, str7);
    }

    public final String component1() {
        return this.nodeId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.platform;
    }

    public final String component4() {
        return this.version;
    }

    public final String component5() {
        return this.deviceFamily;
    }

    public final String component6() {
        return this.modelId;
    }

    public final Map<String, NodeCommandSpec> component7() {
        return this.commands;
    }

    public final boolean component8() {
        return this.isBackgroundingSupported;
    }

    public final String component9() {
        return this.deliveryApp;
    }

    public final Map<String, NodeCommandSpec> getCommands() {
        return this.commands;
    }

    public final String getDeliveryApp() {
        return this.deliveryApp;
    }

    public final String getDeviceFamily() {
        return this.deviceFamily;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getModelId() {
        return this.modelId;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.commands, AnonymousClass005.A0I(this.modelId, AnonymousClass005.A0I(this.deviceFamily, AnonymousClass005.A0I(this.version, AnonymousClass005.A0I(this.platform, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.nodeId))))))), this.isBackgroundingSupported) + AnonymousClass006.A0G(this.deliveryApp);
    }

    public final boolean isBackgroundingSupported() {
        return this.isBackgroundingSupported;
    }

    public final NodeRegistrationInfo copy(String str, String str2, String str3, String str4, String str5, String str6, Map<String, NodeCommandSpec> map, boolean z, String str7) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, map);
        return new NodeRegistrationInfo(str, str2, str3, str4, str5, str6, map, z, str7);
    }

    public String toString() {
        return super.toString();
    }

    public NodeRegistrationInfo(String str, String str2, String str3, String str4, String str5, String str6, Map<String, NodeCommandSpec> map, boolean z, String str7) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, map);
        this.nodeId = str;
        this.displayName = str2;
        this.platform = str3;
        this.version = str4;
        this.deviceFamily = str5;
        this.modelId = str6;
        this.commands = map;
        this.isBackgroundingSupported = z;
        this.deliveryApp = str7;
    }
}
