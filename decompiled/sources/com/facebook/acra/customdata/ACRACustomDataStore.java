package com.facebook.acra.customdata;

import X.C60O;
import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class ACRACustomDataStore implements CustomDataStore {
    public final Map<String, String> mInstanceCustomParameters = new TreeMap();

    @Override // com.facebook.acra.customdata.CustomDataStore
    public boolean containsKey(String str) {
        return this.mInstanceCustomParameters.containsKey(str);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public String getCustomData(String str) {
        return C60O.A0p(str, this.mInstanceCustomParameters);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public Map<String, String> getSnapshot() {
        return new TreeMap(this.mInstanceCustomParameters);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void removeCustomData(String str) {
        if (str != null) {
            this.mInstanceCustomParameters.remove(str);
        }
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void setCustomData(String str, String str2, Object... objArr) {
        if (str != null) {
            if (str2 == null) {
                removeCustomData(str);
                return;
            }
            if (objArr.length > 0) {
                StringBuilder sbA0w = C60O.A0w();
                Formatter formatter = new Formatter(sbA0w);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = sbA0w.toString();
            }
            this.mInstanceCustomParameters.put(str, str2);
        }
    }
}
