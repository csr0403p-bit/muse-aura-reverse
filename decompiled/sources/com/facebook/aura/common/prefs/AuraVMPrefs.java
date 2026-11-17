package com.facebook.aura.common.prefs;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7cU;
import X.Ey9;
import X.FGI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AuraVMPrefs {
    public static final String DEFAULT_VM_ID = "default";
    public static final AuraVMPrefs INSTANCE = new AuraVMPrefs();

    public final C4oT get(String str, AuraVMPrefStoreKey auraVMPrefStoreKey) {
        C7384Etj.A0Y(auraVMPrefStoreKey, 1);
        if (str == null) {
            str = "default";
        }
        AuraPrefsKt.rememberScopedId(AuraDevicePrefStore.VM_IDS, str);
        return AuraPrefsStorage.INSTANCE.get(FGI.A0M("vm_", str), auraVMPrefStoreKey.getKey());
    }

    public final void clearAll() {
        Iterator<String> it = AuraPrefsKt.getScopedIds(AuraDevicePrefStore.VM_IDS).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            AuraPrefsStorage auraPrefsStorage = AuraPrefsStorage.INSTANCE;
            String strA0M = FGI.A0M("vm_", strA0j);
            Ey9<AuraVMPrefStore> entries = AuraVMPrefStore.getEntries();
            ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
            Iterator<AuraVMPrefStore> it2 = entries.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(it2.next().getKey());
            }
            auraPrefsStorage.clearScope(strA0M, arrayListA0i);
        }
    }

    public final Set<String> scopedVmIds() {
        return AuraPrefsKt.getScopedIds(AuraDevicePrefStore.VM_IDS);
    }

    public final C7cU getFactory() {
        return C60O.A0E();
    }
}
