package com.facebook.aura.utils;

import X.AGI;
import X.AHD;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BDi;
import X.C00r;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import X.G0U;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class SnapshotStateListUtilsKt {
    public static final <ListType> void updateList(SnapshotStateList<ListType> snapshotStateList, AHD<RecordedListOperation<ListType>> ahd) {
        boolean zA1a = AnonymousClass002.A1a(snapshotStateList, ahd);
        if (ahd.isEmpty()) {
            return;
        }
        BDi bDiA00 = Snapshot.A00(null, null);
        try {
            Snapshot snapshotA0A = bDiA00.A0A();
            try {
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    RecordedListOperation recordedListOperation = (RecordedListOperation) it.next();
                    int iOrdinal = recordedListOperation.operation.ordinal();
                    if (iOrdinal == 0) {
                        snapshotStateList.add(recordedListOperation.index, recordedListOperation.item);
                    } else if (iOrdinal == zA1a) {
                        snapshotStateList.remove(recordedListOperation.index);
                    } else {
                        if (iOrdinal != 2) {
                            throw C3cG.A0q();
                        }
                        snapshotStateList.set(recordedListOperation.index, recordedListOperation.item);
                    }
                }
                bDiA00.A0T().A00();
            } finally {
                Snapshot.A06(snapshotA0A);
            }
        } finally {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListOperation.values().length];
            try {
                AnonymousClass002.A13(ListOperation.ADD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ListOperation.REMOVE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ListOperation.UPDATE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <MapKey, ListType> AHD<RecordedListOperation<ListType>> calculateDiff(List<? extends ListType> list, Map<MapKey, ? extends ListType> map, G0U<? super ListType, ? extends MapKey> g0u) {
        int iIntValue;
        boolean zA1Z = AnonymousClass005.A1Z(list, map, g0u);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayList = new ArrayList(list);
        Set<MapKey> setKeySet = map.keySet();
        Collection<? extends ListType> collectionValues = map.values();
        for (int size = arrayList.size() - (zA1Z ? 1 : 0); -1 < size; size--) {
            if (!setKeySet.contains(g0u.invoke((Object) arrayList.get(size)))) {
                arrayListA0h.add(new RecordedListOperation(ListOperation.REMOVE, size, arrayList.get(size)));
                arrayList.remove(size);
            }
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int i = 0;
        boolean z = true;
        for (ListType listtype : collectionValues) {
            int i2 = i + 1;
            if (i >= 0) {
                if (z) {
                    linkedHashMapA0j = C3cG.A0j();
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        C00r c00r = (Object) it.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            linkedHashMapA0j.put(g0u.invoke(c00r), Integer.valueOf(i3));
                            i3 = i4;
                        }
                    }
                    z = false;
                }
                Number number = (Number) linkedHashMapA0j.get(g0u.invoke(listtype));
                if (number == null || (iIntValue = number.intValue()) < 0) {
                    arrayList.add(i, listtype);
                    arrayListA0h.add(new RecordedListOperation(ListOperation.ADD, i, listtype));
                    z = true;
                } else if (iIntValue != i) {
                    arrayListA0h.add(new RecordedListOperation(ListOperation.REMOVE, iIntValue, arrayList.get(iIntValue)));
                    arrayList.remove(iIntValue);
                    arrayList.add(i, listtype);
                    arrayListA0h.add(new RecordedListOperation(ListOperation.ADD, i, listtype));
                    z = true;
                } else if (!C7384Etj.areEqual(arrayList.get(iIntValue), listtype)) {
                    arrayList.set(iIntValue, listtype);
                    arrayListA0h.add(new RecordedListOperation(ListOperation.UPDATE, iIntValue, listtype));
                }
                i = i2;
            }
            AbstractC0885AGm.A14();
            throw F60.createAndThrow();
        }
        return AGI.A07(arrayListA0h);
    }
}
