package com.facebook.aura.settings;

import X.A3q;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BGK;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import X.CH0;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchDismissedDevicesStore {
    public static final int $stable = 0;
    public static final HatchDismissedDevicesStore INSTANCE = new HatchDismissedDevicesStore();
    public static final String KEY_DISMISSED_NODE_IDS = "dismissed_node_ids";

    public final Set<String> getDismissedNodeIds(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C4oT c4oT = AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.DISMISSED_DEVICES);
        A3q a3q = A3q.A00;
        Set<String> stringSet = c4oT.getStringSet(KEY_DISMISSED_NODE_IDS, a3q);
        return stringSet == null ? a3q : stringSet;
    }

    public static /* synthetic */ void getKEY_DISMISSED_NODE_IDS$annotations() {
    }

    public final void dismiss(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        String strNormalizeNodeId = HatchConnectedDevicesViewModelKt.normalizeNodeId(str);
        if (strNormalizeNodeId != null) {
            Set<String> dismissedNodeIds = getDismissedNodeIds(abstractC3358CGz);
            if (dismissedNodeIds.contains(strNormalizeNodeId)) {
                return;
            }
            BzK bzKA9q = AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.DISMISSED_DEVICES).A9q();
            bzKA9q.A09(KEY_DISMISSED_NODE_IDS, BGK.A02(strNormalizeNodeId, dismissedNodeIds));
            bzKA9q.apply();
        }
    }

    public final void undismiss(AbstractC3358CGz abstractC3358CGz, Collection<String> collection) {
        AnonymousClass003.A0u(abstractC3358CGz, collection);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String strNormalizeNodeId = HatchConnectedDevicesViewModelKt.normalizeNodeId(AnonymousClass005.A0j(it));
            if (strNormalizeNodeId != null) {
                arrayList.add(strNormalizeNodeId);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayList);
        if (setA0g.isEmpty()) {
            return;
        }
        Set<String> dismissedNodeIds = getDismissedNodeIds(abstractC3358CGz);
        Set setA03 = BGK.A03(setA0g, dismissedNodeIds);
        if (setA03.size() != dismissedNodeIds.size()) {
            BzK bzKA9q = AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.DISMISSED_DEVICES).A9q();
            bzKA9q.A09(KEY_DISMISSED_NODE_IDS, setA03);
            bzKA9q.apply();
        }
    }
}
