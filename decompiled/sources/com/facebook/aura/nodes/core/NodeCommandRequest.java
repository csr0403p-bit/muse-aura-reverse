package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes6.dex */
public final class NodeCommandRequest extends C06G {
    public final String commandId;
    public final JsonElement paramsJson;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeCommandRequest) {
                NodeCommandRequest nodeCommandRequest = (NodeCommandRequest) obj;
                if (!C7384Etj.areEqual(this.commandId, nodeCommandRequest.commandId) || !C7384Etj.areEqual(this.paramsJson, nodeCommandRequest.paramsJson)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeCommandRequest copy$default(NodeCommandRequest nodeCommandRequest, String str, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeCommandRequest.commandId;
        }
        if ((i & 2) != 0) {
            jsonElement = nodeCommandRequest.paramsJson;
        }
        AnonymousClass003.A0u(str, jsonElement);
        return new NodeCommandRequest(str, jsonElement);
    }

    public final String component1() {
        return this.commandId;
    }

    public final JsonElement component2() {
        return this.paramsJson;
    }

    public final String getCommandId() {
        return this.commandId;
    }

    public final JsonElement getParamsJson() {
        return this.paramsJson;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.paramsJson, AnonymousClass001.A0G(this.commandId));
    }

    public NodeCommandRequest(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        this.commandId = str;
        this.paramsJson = jsonElement;
    }

    public final NodeCommandRequest copy(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        return new NodeCommandRequest(str, jsonElement);
    }

    public String toString() {
        return super.toString();
    }
}
