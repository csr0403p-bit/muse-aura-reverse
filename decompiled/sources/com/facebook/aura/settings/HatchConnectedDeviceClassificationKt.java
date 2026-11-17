package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.nodes.json.NodeListEntry;

/* loaded from: classes.dex */
public abstract class HatchConnectedDeviceClassificationKt {
    public static final boolean isMuseCharm(NodeListEntry nodeListEntry) {
        String strA0l;
        C7384Etj.A0Y(nodeListEntry, 0);
        String str = nodeListEntry.deviceFamily;
        String strA0u = (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l);
        return "coop_ai_device".equals(strA0u) || "muse_charm".equals(strA0u);
    }
}
