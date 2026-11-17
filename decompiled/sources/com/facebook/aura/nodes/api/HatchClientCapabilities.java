package com.facebook.aura.nodes.api;

import X.AbstractC5321DgF;
import X.C7384Etj;
import X.F0C;
import com.facebook.aura.nodes.core.NodeCommandId;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchClientCapabilities {
    public static final HatchClientCapabilities INSTANCE = new HatchClientCapabilities();
    public static final F0C policy$delegate = AbstractC5321DgF.A03(HatchClientCapabilities$policy$2.INSTANCE);

    public final boolean supportsDataSource(String str) {
        Set<String> dataSources;
        C7384Etj.A0Y(str, 0);
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy == null || (dataSources = hatchClientCapabilityPolicy.getDataSources()) == null) {
            return true;
        }
        return dataSources.contains(str);
    }

    public final boolean supportsDeviceCommand(NodeCommandId nodeCommandId) {
        Set<NodeCommandId> deviceCommands;
        C7384Etj.A0Y(nodeCommandId, 0);
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy == null || (deviceCommands = hatchClientCapabilityPolicy.getDeviceCommands()) == null) {
            return true;
        }
        return deviceCommands.contains(nodeCommandId);
    }

    public final boolean supportsUiCommand(String str) {
        Set<String> uiCommands;
        C7384Etj.A0Y(str, 0);
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy == null || (uiCommands = hatchClientCapabilityPolicy.getUiCommands()) == null) {
            return true;
        }
        return uiCommands.contains(str);
    }

    private final HatchClientCapabilityPolicy getPolicy() {
        return (HatchClientCapabilityPolicy) policy$delegate.getValue();
    }

    public final boolean getSupportsInAppAlarms() {
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy != null) {
            return hatchClientCapabilityPolicy.getInAppAlarms();
        }
        return true;
    }

    public final boolean getTagsNodeCardsWithClientId() {
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy != null) {
            return hatchClientCapabilityPolicy.getTagsNodeCardsWithClientId();
        }
        return false;
    }

    public final HatchUiHandoff getUiHandoff() {
        HatchClientCapabilityPolicy hatchClientCapabilityPolicy = (HatchClientCapabilityPolicy) policy$delegate.getValue();
        if (hatchClientCapabilityPolicy != null) {
            return hatchClientCapabilityPolicy.getUiHandoff();
        }
        return null;
    }
}
