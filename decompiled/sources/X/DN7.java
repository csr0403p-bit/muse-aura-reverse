package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DN7<K, V> extends ImmutableMap.Builder<K, V> {
    public final Comparator<? super K> A00;
    public transient Object[] A01;
    public transient Object[] A02;

    public DN7(Comparator<? super K> comparator) {
        super(4);
        comparator.getClass();
        this.A00 = comparator;
        this.A01 = new Object[4];
        this.A02 = new Object[4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.common.collect.ImmutableMap.Builder
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ImmutableSortedMap<K, V> buildOrThrow() {
        RegularImmutableSortedSet regularImmutableSortedSet;
        ImmutableList immutableListOf;
        int i = this.size;
        if (i == 0) {
            return ImmutableSortedMap.A02(this.A00);
        }
        if (i != 1) {
            Object[] objArrCopyOf = Arrays.copyOf(this.A01, i);
            Comparator<? super K> comparator = this.A00;
            Arrays.sort(objArrCopyOf, comparator);
            Object[] objArr = new Object[this.size];
            for (int i2 = 0; i2 < this.size; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (comparator.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        StringBuilder sbA0x = C60O.A0x("keys required to be distinct but compared as equal: ");
                        sbA0x.append(objArrCopyOf[i3]);
                        sbA0x.append(" and ");
                        throw C60O.A0i(C8j3.A14(objArrCopyOf[i2], sbA0x));
                    }
                }
                objArr[Arrays.binarySearch(objArrCopyOf, BV6.A0n(this.A01, i2), comparator)] = BV6.A0n(this.A02, i2);
            }
            ImmutableSortedMap<Comparable<?>, Object> immutableSortedMap = ImmutableSortedMap.A03;
            RegularImmutableSortedSet<Comparable> regularImmutableSortedSet2 = RegularImmutableSortedSet.A01;
            regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArrCopyOf), comparator);
            immutableListOf = ImmutableList.asImmutableList(objArr);
        } else {
            Comparator<? super K> comparator2 = this.A00;
            Object objA0n = BV6.A0n(this.A01, 0);
            Object objA0n2 = BV6.A0n(this.A02, 0);
            ImmutableSortedMap<Comparable<?>, Object> immutableSortedMap2 = ImmutableSortedMap.A03;
            RegularImmutableSortedSet<Comparable> regularImmutableSortedSet3 = RegularImmutableSortedSet.A01;
            regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.of(objA0n), comparator2);
            immutableListOf = ImmutableList.of(objA0n2);
        }
        return new ImmutableSortedMap<>(immutableListOf, null, regularImmutableSortedSet);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Map.Entry entry) {
        super.put(entry);
        return this;
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object key, Object value) {
        int i = this.size + 1;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i > length) {
            int iA02 = DOJ.A02(length, i);
            this.A01 = Arrays.copyOf(objArr, iA02);
            this.A02 = Arrays.copyOf(this.A02, iA02);
        }
        AbstractC3830CfJ.A01(key, value);
        Object[] objArr2 = this.A01;
        int i2 = this.size;
        objArr2[i2] = key;
        this.A02[i2] = value;
        this.size = i2 + 1;
        return this;
    }
}
