package com.facebook.aura.commands.battery;

import X.AbstractC3358CGz;
import X.C2nw;
import X.C3cG;
import X.C60R;
import X.C7qW;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;

/* loaded from: classes3.dex */
public final class BatteryGetHandler implements HatchNodeCommandHandler {
    public static final BatteryGetHandler INSTANCE = new BatteryGetHandler();

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        BatteryState currentBatteryState = BatteryStateKt.readCurrentBatteryState(hatchNodeCommandContext.context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2nw c2nwA02 = C7qW.A02();
        C7qW.A05(C3cG.A0S(jCurrentTimeMillis), "syncedAt", c2nwA02);
        c2nwA02.A01("state", currentBatteryState.toJson());
        return NodeExecutionKt.deliver(nodeExecutionContext, C60R.A0R(c2nwA02), htJ);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.BATTERY_GET;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return BatteryCommandSpecs.BATTERY_GET;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
