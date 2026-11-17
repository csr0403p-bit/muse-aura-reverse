package com.facebook.aura.nodes.core;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class NodeCommandResponse extends C06G {
    public final String cardEnvelopeJson;
    public final String description;
    public final String errorMessage;
    public final boolean ok;
    public final JsonElement payload;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeCommandResponse) {
                NodeCommandResponse nodeCommandResponse = (NodeCommandResponse) obj;
                if (this.ok != nodeCommandResponse.ok || !C7384Etj.areEqual(this.payload, nodeCommandResponse.payload) || !C7384Etj.areEqual(this.errorMessage, nodeCommandResponse.errorMessage) || !C7384Etj.areEqual(this.cardEnvelopeJson, nodeCommandResponse.cardEnvelopeJson) || !C7384Etj.areEqual(this.description, nodeCommandResponse.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeCommandResponse copy$default(NodeCommandResponse nodeCommandResponse, boolean z, JsonElement jsonElement, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nodeCommandResponse.ok;
        }
        if ((i & 2) != 0) {
            jsonElement = nodeCommandResponse.payload;
        }
        if ((i & 4) != 0) {
            str = nodeCommandResponse.errorMessage;
        }
        if ((i & 8) != 0) {
            str2 = nodeCommandResponse.cardEnvelopeJson;
        }
        if ((i & 16) != 0) {
            str3 = nodeCommandResponse.description;
        }
        return nodeCommandResponse.copy(z, jsonElement, str, str2, str3);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final JsonElement component2() {
        return this.payload;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final String component4() {
        return this.cardEnvelopeJson;
    }

    public final String component5() {
        return this.description;
    }

    public final NodeCommandResponse copy(boolean z, JsonElement jsonElement, String str, String str2, String str3) {
        return new NodeCommandResponse(z, jsonElement, str, str2, str3);
    }

    public final String getCardEnvelopeJson() {
        return this.cardEnvelopeJson;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final JsonElement getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return ((((((C0KA.A02(this.ok) + AnonymousClass006.A0D(this.payload)) * 31) + AnonymousClass006.A0G(this.errorMessage)) * 31) + AnonymousClass006.A0G(this.cardEnvelopeJson)) * 31) + AnonymousClass005.A0H(this.description);
    }

    public NodeCommandResponse(boolean z, JsonElement jsonElement, String str, String str2, String str3) {
        this.ok = z;
        this.payload = jsonElement;
        this.errorMessage = str;
        this.cardEnvelopeJson = str2;
        this.description = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeCommandResponse(boolean z, JsonElement jsonElement, String str, String str2, String str3, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
