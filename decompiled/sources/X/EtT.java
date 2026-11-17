package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EtT {
    public ArrayList<Object> A00 = new ArrayList<>();
    public ArrayList<String> A01 = new ArrayList<>();

    public static void A00(EtT etT) {
        ArrayList<String> arrayList = etT.A01;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.get(size) == null) {
            return;
        }
        arrayList.remove(size);
    }

    public static final void A01(EtT etT, Object obj, String str) {
        ArrayList<String> arrayList = etT.A01;
        if (arrayList.isEmpty()) {
            throw C3cG.A0Q("Adding entries can be only done after category is started. Call startCategory first");
        }
        ArrayList<Object> arrayList2 = etT.A00;
        arrayList2.add(str);
        arrayList2.add(obj);
        arrayList.add(null);
    }

    public final Map<String, Map<String, String>> A02() {
        HashMap map = new HashMap();
        HashMap map2 = null;
        A00(this);
        ArrayList<String> arrayList = this.A01;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayList.get(i2);
            if (str != null) {
                map2 = new HashMap();
                map.put(str, map2);
            } else {
                ArrayList<Object> arrayList2 = this.A00;
                int i3 = i + 1;
                Object obj = arrayList2.get(i);
                i += 2;
                Object string = arrayList2.get(i3);
                if (string instanceof String) {
                    map2.put(obj, string);
                } else {
                    if (string instanceof Integer) {
                        string = String.valueOf(((Number) string).intValue());
                    } else if (string instanceof Long) {
                        string = String.valueOf(((Number) string).longValue());
                    } else if (string instanceof Double) {
                        string = String.valueOf(((Number) string).doubleValue());
                    } else if (string instanceof Boolean) {
                        string = String.valueOf(((Boolean) string).booleanValue());
                    } else if (string instanceof String[]) {
                        string = Arrays.toString((Object[]) string);
                    } else if (string instanceof int[]) {
                        string = Arrays.toString((int[]) string);
                    } else if (string instanceof long[]) {
                        string = Arrays.toString((long[]) string);
                    }
                    map2.put(obj, string);
                }
            }
        }
        return map;
    }
}
