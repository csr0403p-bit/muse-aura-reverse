package com.facebook.aura.commands.geofence;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C2nw;
import X.C60O;
import X.C60R;
import X.FGI;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;

/* loaded from: classes3.dex */
public final class GeofenceListHandler implements HatchNodeCommandHandler {
    public static final GeofenceListHandler INSTANCE = new GeofenceListHandler();

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        NodeCommandResponse nodeCommandResponseA0P;
        try {
            List<NodeGeofence> all = GeofenceStore.Companion.getInstance(hatchNodeCommandContext.context).getAll();
            ArrayList arrayListA0i = AnonymousClass003.A0i(all);
            Iterator<NodeGeofence> it = all.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().toJson());
            }
            JsonArray jsonArray = new JsonArray(arrayListA0i);
            C2nw c2nwA1K = C60O.A1K();
            c2nwA1K.A01(GeofenceStore.KEY_GEOFENCES, jsonArray);
            nodeCommandResponseA0P = C60R.A0R(c2nwA1K);
        } catch (Exception e) {
            nodeCommandResponseA0P = C60R.A0P(FGI.A0M("Failed to list geofences: ", e.getMessage()));
        }
        return NodeExecutionKt.deliver(nodeExecutionContext, nodeCommandResponseA0P, htJ);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.GEOFENCE_LIST;
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
        return GeofenceCommandSpecs.GEOFENCE_LIST;
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
