package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HCF extends AbstractSet {
    public final /* synthetic */ HCD A00;

    public HCF(HCD hcd) {
        this.A00 = hcd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        if (mapA03 != null) {
            return mapA03.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA00 = HCD.A00(hcd, entry.getKey());
            if (iA00 != -1) {
                Object[] objArr = hcd.A05;
                objArr.getClass();
                if (AbstractC10555Hsi.A00(objArr[iA00], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        return mapA03 != null ? AnonymousClass002.A0n(mapA03) : new HCV(hcd);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        if (mapA03 != null) {
            return mapA03.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (hcd.A02 != null) {
                int i = (1 << (hcd.A00 & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = hcd.A02;
                obj2.getClass();
                int[] iArr = hcd.A03;
                iArr.getClass();
                Object[] objArr = hcd.A04;
                objArr.getClass();
                Object[] objArr2 = hcd.A05;
                objArr2.getClass();
                int iA06 = AbstractC7611F5y.A06(AnonymousClass006.A0D(key));
                int i2 = iA06 & i;
                int iA00 = HCP.A00(obj2, i2);
                if (iA00 != 0) {
                    int i3 = i ^ (-1);
                    int i4 = iA06 & i3;
                    int i5 = -1;
                    while (true) {
                        int i6 = iA00 - 1;
                        int i7 = iArr[i6];
                        if ((i7 & i3) != i4 || !AbstractC10555Hsi.A00(key, objArr[i6]) || !AbstractC10555Hsi.A00(value, objArr2[i6])) {
                            iA00 = i7 & i;
                            if (iA00 == 0) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            int i8 = i7 & i;
                            if (i5 == -1) {
                                HCP.A01(obj2, i2, i8);
                            } else {
                                iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                            }
                            if (i6 != -1) {
                                hcd.A04(i6, i);
                                hcd.A01--;
                                hcd.A00 += 32;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
