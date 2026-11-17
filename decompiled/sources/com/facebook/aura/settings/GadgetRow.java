package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.nodes.json.NodeListEntry;

/* loaded from: classes.dex */
public final class GadgetRow extends C06G {
    public static final int $stable = 8;
    public final NodeListEntry device;
    public final String gadgetId;

    public GadgetRow(NodeListEntry nodeListEntry, String str) {
        C7384Etj.A0Y(nodeListEntry, 0);
        this.device = nodeListEntry;
        this.gadgetId = str;
    }

    public final GadgetRow copy(NodeListEntry nodeListEntry, String str) {
        C7384Etj.A0Y(nodeListEntry, 0);
        return new GadgetRow(nodeListEntry, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GadgetRow) {
                GadgetRow gadgetRow = (GadgetRow) obj;
                if (!C7384Etj.areEqual(this.device, gadgetRow.device) || !C7384Etj.areEqual(this.gadgetId, gadgetRow.gadgetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GadgetRow copy$default(GadgetRow gadgetRow, NodeListEntry nodeListEntry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nodeListEntry = gadgetRow.device;
        }
        if ((i & 2) != 0) {
            str = gadgetRow.gadgetId;
        }
        C7384Etj.A0Y(nodeListEntry, 0);
        return new GadgetRow(nodeListEntry, str);
    }

    public final NodeListEntry component1() {
        return this.device;
    }

    public final String component2() {
        return this.gadgetId;
    }

    public final NodeListEntry getDevice() {
        return this.device;
    }

    public final String getGadgetId() {
        return this.gadgetId;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.device) + AnonymousClass006.A0G(this.gadgetId);
    }

    public String toString() {
        return super.toString();
    }
}
