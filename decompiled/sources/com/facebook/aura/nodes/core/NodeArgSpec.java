package com.facebook.aura.nodes.core;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class NodeArgSpec extends C06G {
    public final String description;
    public final NodeArgType type;

    public NodeArgSpec(NodeArgType nodeArgType, String str) {
        C7384Etj.A0Y(nodeArgType, 0);
        this.type = nodeArgType;
        this.description = str;
    }

    public final NodeArgSpec copy(NodeArgType nodeArgType, String str) {
        C7384Etj.A0Y(nodeArgType, 0);
        return C60O.A09(nodeArgType, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeArgSpec) {
                NodeArgSpec nodeArgSpec = (NodeArgSpec) obj;
                if (this.type != nodeArgSpec.type || !C7384Etj.areEqual(this.description, nodeArgSpec.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeArgSpec copy$default(NodeArgSpec nodeArgSpec, NodeArgType nodeArgType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nodeArgType = nodeArgSpec.type;
        }
        if ((i & 2) != 0) {
            str = nodeArgSpec.description;
        }
        C7384Etj.A0Y(nodeArgType, 0);
        return C60O.A09(nodeArgType, str);
    }

    public final NodeArgType component1() {
        return this.type;
    }

    public final String component2() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final NodeArgType getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.type) + AnonymousClass006.A0G(this.description);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("type", this.type.getJsonValue(), c2nwA1K);
        String str = this.description;
        if (str != null) {
            C7qW.A06(HatchWebPageParserKt.DESCRIPTION, str, c2nwA1K);
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeArgSpec(NodeArgType nodeArgType, String str, int i, C06H c06h) {
        this(nodeArgType, AnonymousClass006.A0s(i, str));
    }
}
