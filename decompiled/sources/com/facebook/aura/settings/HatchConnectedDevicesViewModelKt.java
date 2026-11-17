package com.facebook.aura.settings;

import X.AGH;
import X.AGI;
import X.AHG;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BQI;
import X.C0943AIw;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class HatchConnectedDevicesViewModelKt {
    public static final String WEARABLE_COMMS_COMMAND_PREFIX = "wearables.comms.";

    public static final String normalizeNodeId(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            if (strA0u.length() != 0) {
                return strA0u;
            }
        }
        return null;
    }

    public static final BQI<String> wearableCommsNodeIds(List<NodeListEntry> list) {
        ArrayList arrayList = new ArrayList();
        for (NodeListEntry nodeListEntry : list) {
            if (advertisesWearableComms(nodeListEntry)) {
                arrayList.add(nodeListEntry);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strNormalizeNodeId = normalizeNodeId(((NodeListEntry) it.next()).nodeId);
            if (strNormalizeNodeId != null) {
                arrayList2.add(strNormalizeNodeId);
            }
        }
        AHG ahgA0H = AGI.A0H(arrayList2);
        return (ahgA0H.isEmpty() || !HatchUtil.INSTANCE.isWearableDevicePageEnabled()) ? C0943AIw.A03 : ahgA0H;
    }

    public static final boolean advertisesWearableComms(NodeListEntry nodeListEntry) {
        if (nodeListEntry.isWearable()) {
            Map mapA0E = nodeListEntry.commands;
            if (mapA0E == null) {
                mapA0E = AGH.A0E();
            }
            Set setKeySet = mapA0E.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (AnonymousClass005.A1a(AnonymousClass005.A0j(it), WEARABLE_COMMS_COMMAND_PREFIX)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
