package com.facebook.aura.commands.network;

import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class NetworkCommandSpecs {
    public static final NetworkCommandSpecs INSTANCE = new NetworkCommandSpecs();
    public static final NodeCommandSpec NETWORK_STATE = new NodeCommandSpec("Reports the device's current network state \u2014 transport type (Wi-Fi, cellular, VPN, ethernet, other, or none), connectivity, whether the link is metered, and Wi-Fi or carrier details when available. Use when network connectivity context is needed.", null, null, null, null, "The current network connectivity state of the device.", 0, 94, null);

    public final NodeCommandSpec getNETWORK_STATE() {
        return NETWORK_STATE;
    }
}
