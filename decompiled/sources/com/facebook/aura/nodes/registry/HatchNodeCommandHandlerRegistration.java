package com.facebook.aura.nodes.registry;

import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public interface HatchNodeCommandHandlerRegistration {
    NodeCommandId getCommandId();

    HatchNodeCommandHandler getHandler();

    NodeCommandSpec getSpec();
}
