package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* loaded from: classes5.dex */
public final class COB extends CO5 implements NavigableMap {
    public static final Comparator A03;
    public static final COB A04;
    public final transient COO A00;
    public final transient COC A01;
    public final transient COB A02;

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A08(obj, true)).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A08(obj, false));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A08(obj, false)).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, obj2, true, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    static {
        COG cog = COG.A00;
        A03 = cog;
        COC cocA00 = COC.A00(cog);
        COR cor = COO.A00;
        A04 = new COB(COM.A02, null, cocA00);
    }

    private final COB A00(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A00.size()) {
                return this;
            }
            i = 0;
        }
        COC coc = this.A01;
        if (i == i2) {
            return A03(coc.A02);
        }
        COO coo = this.A00;
        return new COB(coo.subList(i, i2), null, coc.A0A(i, i2));
    }

    public static COB A03(Comparator comparator) {
        if (COG.A00.equals(comparator)) {
            return A04;
        }
        COC cocA00 = COC.A00(comparator);
        COR cor = COO.A00;
        return new COB(COM.A02, null, cocA00);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.A01.A02;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        COB cob = this.A02;
        if (cob != null) {
            return cob;
        }
        boolean zIsEmpty = isEmpty();
        COC coc = this.A01;
        if (!zIsEmpty) {
            return new COB(this.A00.A07(), this, coc.descendingSet());
        }
        Comparator comparator = coc.A02;
        COI coe = comparator instanceof COI ? (COI) comparator : new COE(comparator);
        return A03(coe instanceof COJ ? ((COJ) coe).zza : coe instanceof COH ? COG.A00 : coe instanceof COG ? COH.A00 : new COJ(coe));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.A01.first();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.A01.last();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    public COB(COO coo, COB cob, COC coc) {
        this.A01 = coc;
        this.A00 = coo;
        this.A02 = cob;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final COB subMap(Object obj, Object obj2, boolean z, boolean z2) {
        obj.getClass();
        obj2.getClass();
        COC coc = this.A01;
        if (coc.A02.compare(obj, obj2) <= 0) {
            return A00(0, coc.A08(obj2, z2)).tailMap(obj, z);
        }
        throw C60O.A0i(CL4.A00("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final COB tailMap(Object obj, boolean z) {
        obj.getClass();
        COC coc = this.A01;
        int iBinarySearch = Collections.binarySearch(coc.A01, obj, coc.A02);
        if (iBinarySearch < 0) {
            iBinarySearch ^= -1;
        } else if (!z) {
            iBinarySearch++;
        }
        return A00(iBinarySearch, this.A00.size());
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return BV7.A0u(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) C8j4.A0p(entrySet().A07());
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return BV7.A0u(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return BV7.A0u(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A07().get(C8j3.A0K(this.A00));
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return BV7.A0u(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        obj.getClass();
        return A00(0, this.A01.A08(obj, z));
    }
}
