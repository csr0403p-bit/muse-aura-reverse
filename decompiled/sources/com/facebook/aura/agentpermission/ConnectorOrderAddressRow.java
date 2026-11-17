package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ConnectorOrderAddressRow extends C06G {
    public static final int $stable = 0;
    public final String subtitle;
    public final String title;

    public ConnectorOrderAddressRow(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.subtitle = str2;
    }

    public final ConnectorOrderAddressRow copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ConnectorOrderAddressRow(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorOrderAddressRow) {
                ConnectorOrderAddressRow connectorOrderAddressRow = (ConnectorOrderAddressRow) obj;
                if (!C7384Etj.areEqual(this.title, connectorOrderAddressRow.title) || !C7384Etj.areEqual(this.subtitle, connectorOrderAddressRow.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorOrderAddressRow copy$default(ConnectorOrderAddressRow connectorOrderAddressRow, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorOrderAddressRow.title;
        }
        if ((i & 2) != 0) {
            str2 = connectorOrderAddressRow.subtitle;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectorOrderAddressRow(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle);
    }

    public String toString() {
        return super.toString();
    }
}
