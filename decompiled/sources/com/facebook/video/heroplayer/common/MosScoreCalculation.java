package com.facebook.video.heroplayer.common;

import X.AnonymousClass001;
import X.BV6;
import X.BV7;
import X.C60Q;
import X.C6154Dwx;
import X.Dl5;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public abstract class MosScoreCalculation {
    public static TreeMap<Integer, Float> A02(String str) {
        TreeMap<Integer, Float> treeMap = new TreeMap<>();
        try {
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    throw C60Q.A0U("Ill formatted string:", str2);
                }
                BV6.A1D(Integer.valueOf(BV6.A0F(strArrSplit, 0)), treeMap, Float.parseFloat(strArrSplit[1]));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
            treeMap.clear();
        }
        return treeMap;
    }

    public static float A00(C6154Dwx c6154Dwx, int i, boolean z) {
        Dl5 dl5A00 = Dl5.A00(c6154Dwx);
        String str = dl5A00.A07;
        String str2 = str != null ? str : "";
        String str3 = dl5A00.A08;
        String str4 = str3 != null ? str3 : "";
        if (!z || str2.isEmpty()) {
            str2 = str4;
        }
        return A01(A02(str2), i);
    }

    public static float A01(TreeMap<Integer, Float> treeMap, int i) {
        Float value;
        if (treeMap.isEmpty()) {
            return 0.0f;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (treeMap.containsKey(numValueOf)) {
            value = treeMap.get(numValueOf);
        } else {
            Map.Entry<Integer, Float> entryLowerEntry = treeMap.lowerEntry(numValueOf);
            Map.Entry<Integer, Float> entryHigherEntry = treeMap.higherEntry(numValueOf);
            if (entryLowerEntry == null) {
                value = entryHigherEntry.getValue();
            } else {
                if (entryHigherEntry != null) {
                    return AnonymousClass001.A02(entryHigherEntry.getValue()) + (((BV7.A0N(entryHigherEntry) - i) * (AnonymousClass001.A02(entryLowerEntry.getValue()) - AnonymousClass001.A02(entryHigherEntry.getValue()))) / (BV7.A0N(entryHigherEntry) - BV7.A0N(entryLowerEntry)));
                }
                value = entryLowerEntry.getValue();
            }
        }
        return AnonymousClass001.A02(value);
    }
}
