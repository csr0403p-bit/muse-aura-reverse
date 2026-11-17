package com.facebook.acra.customdata;

import X.AnonymousClass002;
import X.BV4;
import X.C3cH;
import X.C60O;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class ProxyCustomDataStore implements CustomDataStore {
    public static CustomDataStore dataStore = new ACRACustomDataStore();

    public class Holder {
        public static final ProxyCustomDataStore CUSTOM_DATA = new ProxyCustomDataStore();
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public synchronized boolean containsKey(String str) {
        return dataStore.containsKey(str);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public synchronized String getCustomData(String str) {
        return dataStore.getCustomData(str);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public synchronized Map<String, String> getSnapshot() {
        return dataStore.getSnapshot();
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public synchronized void removeCustomData(String str) {
        dataStore.removeCustomData(str);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public synchronized void setCustomData(String str, String str2, Object... objArr) {
        dataStore.setCustomData(str, str2, objArr);
    }

    public synchronized void setDataStore(CustomDataStore customDataStore) {
        Iterator itA0n = AnonymousClass002.A0n(dataStore.getSnapshot());
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            customDataStore.setCustomData(C60O.A0t(entryA0l), (String) entryA0l.getValue(), BV4.A1W());
        }
        dataStore = customDataStore;
    }

    public static ProxyCustomDataStore getInstance() {
        return Holder.CUSTOM_DATA;
    }
}
