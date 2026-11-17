package X;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0t1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0t1 {
    public final Map<String, List<ComponentName>> A00;
    public final Map<ComponentName, String> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0t1) {
                C0t1 c0t1 = (C0t1) obj;
                if (!this.A01.equals(c0t1.A01) || !this.A00.equals(c0t1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(receiverToProviderName=");
        sb.append(this.A01);
        sb.append(", providerNameToReceivers=");
        return AnonymousClass007.A0Z(this.A00, sb);
    }

    public /* synthetic */ C0t1(Map map, Map map2, C06H c06h, int i) {
        C9jH c9jHA0E = AGH.A0E();
        this.A01 = c9jHA0E;
        this.A00 = c9jHA0E;
    }

    public C0t1(Map<ComponentName, String> map) {
        Set<Map.Entry<ComponentName, String>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<ComponentName, String> entry : setEntrySet) {
            String value = entry.getValue();
            Object arrayList = linkedHashMap.get(value);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(value, arrayList);
            }
            ((List) arrayList).add(entry.getKey());
        }
        this.A01 = map;
        this.A00 = linkedHashMap;
    }

    public C0t1() {
        C9jH c9jHA0E = AGH.A0E();
        this.A01 = c9jHA0E;
        this.A00 = c9jHA0E;
    }
}
