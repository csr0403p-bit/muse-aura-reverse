package com.facebook.aura.gateway;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConnectorOrderItem extends C06G {
    public static final int $stable = 0;
    public final String name;

    public ConnectorOrderItem(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public final ConnectorOrderItem copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ConnectorOrderItem(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorOrderItem) && C7384Etj.areEqual(this.name, ((ConnectorOrderItem) obj).name));
    }

    public static /* synthetic */ ConnectorOrderItem copy$default(ConnectorOrderItem connectorOrderItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorOrderItem.name;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectorOrderItem(str);
    }

    public final String component1() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
