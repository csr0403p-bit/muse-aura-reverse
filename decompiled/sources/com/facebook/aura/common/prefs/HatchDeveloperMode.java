package com.facebook.aura.common.prefs;

import X.A3q;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BGK;
import X.BLG;
import X.BzK;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchDeveloperMode {
    public static final String COMMUNITY_DEVICE_NODE_IDS_KEY = "community_device_node_ids";
    public static final String DEVELOPER_MODE_KEY = "developer_mode_enabled";
    public static final HatchDeveloperMode INSTANCE = new HatchDeveloperMode();
    public static final C1BN<Integer> changeCount;
    public static final BLG<Integer> mutableChangeCount;

    public final Set<String> communityDeviceNodeIds(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        A3q a3q = A3q.A00;
        Set<String> stringSet = c4oTUserPrefs.getStringSet(COMMUNITY_DEVICE_NODE_IDS_KEY, a3q);
        return stringSet == null ? a3q : stringSet;
    }

    public final boolean isEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz).getBoolean(DEVELOPER_MODE_KEY, false);
    }

    public final void setEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        Integer value;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz).A9q();
        bzKA9q.A0A(DEVELOPER_MODE_KEY, z);
        bzKA9q.apply();
        BLG<Integer> blg = mutableChangeCount;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, Integer.valueOf(AnonymousClass001.A0F(value) + 1)));
    }

    static {
        C9286GCn c9286GCn = new C9286GCn(0);
        mutableChangeCount = c9286GCn;
        changeCount = C3Pi.A00(c9286GCn);
    }

    public final C1BN<Integer> getChangeCount() {
        return changeCount;
    }

    private final String normalize(String str) {
        return AnonymousClass001.A0u(AnonymousClass002.A0l(str));
    }

    public final boolean isCommunityDevice(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        return communityDeviceNodeIds(abstractC3358CGz).contains(AnonymousClass001.A0u(AnonymousClass002.A0l(str)));
    }

    public final void markCommunityDevice(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        Set<String> setCommunityDeviceNodeIds = communityDeviceNodeIds(abstractC3358CGz);
        String strA0u = AnonymousClass001.A0u(AnonymousClass002.A0l(str));
        if (setCommunityDeviceNodeIds.contains(strA0u)) {
            return;
        }
        BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz).A9q();
        bzKA9q.A09(COMMUNITY_DEVICE_NODE_IDS_KEY, BGK.A02(strA0u, setCommunityDeviceNodeIds));
        bzKA9q.apply();
    }

    public final void unmarkCommunityDevice(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        Set<String> setCommunityDeviceNodeIds = communityDeviceNodeIds(abstractC3358CGz);
        String strA0u = AnonymousClass001.A0u(AnonymousClass002.A0l(str));
        if (setCommunityDeviceNodeIds.contains(strA0u)) {
            BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz).A9q();
            bzKA9q.A09(COMMUNITY_DEVICE_NODE_IDS_KEY, BGK.A04(strA0u, setCommunityDeviceNodeIds));
            bzKA9q.apply();
        }
    }
}
