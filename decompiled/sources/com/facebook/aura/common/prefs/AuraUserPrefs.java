package com.facebook.aura.common.prefs;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7cU;
import X.Ey9;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AuraUserPrefs {
    public static final AuraUserPrefs INSTANCE = new AuraUserPrefs();

    public final C4oT get(String str, AuraUserPrefStoreKey auraUserPrefStoreKey) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(auraUserPrefStoreKey, 1);
        AuraPrefsKt.rememberScopedId(AuraDevicePrefStore.USER_IDS, str);
        return AuraPrefsStorage.INSTANCE.get(str, auraUserPrefStoreKey.getKey());
    }

    public final void clearAll() {
        Iterator<String> it = AuraPrefsKt.getScopedIds(AuraDevicePrefStore.USER_IDS).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            AuraPrefsStorage auraPrefsStorage = AuraPrefsStorage.INSTANCE;
            Ey9<AuraUserPrefStore> entries = AuraUserPrefStore.getEntries();
            ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
            Iterator<AuraUserPrefStore> it2 = entries.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(it2.next().getKey());
            }
            auraPrefsStorage.clearScope(strA0j, arrayListA0i);
        }
    }

    public final C7cU getFactory() {
        return C60O.A0E();
    }
}
