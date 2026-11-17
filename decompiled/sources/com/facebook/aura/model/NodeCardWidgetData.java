package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class NodeCardWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String envelopeJson;

    public final class Companion {
        public final C9hr<NodeCardWidgetData> serializer() {
            return NodeCardWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final NodeCardWidgetData copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new NodeCardWidgetData(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NodeCardWidgetData) && C7384Etj.areEqual(this.envelopeJson, ((NodeCardWidgetData) obj).envelopeJson));
    }

    public /* synthetic */ NodeCardWidgetData(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(NodeCardWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.envelopeJson = str;
    }

    public static /* synthetic */ NodeCardWidgetData copy$default(NodeCardWidgetData nodeCardWidgetData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeCardWidgetData.envelopeJson;
        }
        C7384Etj.A0Y(str, 0);
        return new NodeCardWidgetData(str);
    }

    public final String component1() {
        return this.envelopeJson;
    }

    public final String getEnvelopeJson() {
        return this.envelopeJson;
    }

    public int hashCode() {
        return this.envelopeJson.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public NodeCardWidgetData(String str) {
        C7384Etj.A0Y(str, 0);
        this.envelopeJson = str;
    }
}
