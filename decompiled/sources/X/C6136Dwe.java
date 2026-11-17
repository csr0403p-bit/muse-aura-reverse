package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dwe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6136Dwe extends C6141Dwj {
    public static final C6136Dwe A0I;

    @Deprecated
    public static final C6136Dwe A0J;
    public final SparseArray A00;
    public final SparseBooleanArray A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    @Override // X.C6141Dwj
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6136Dwe c6136Dwe = (C6136Dwe) obj;
                if (super.equals(c6136Dwe) && this.A0G == c6136Dwe.A0G && this.A0A == c6136Dwe.A0A && this.A0B == c6136Dwe.A0B && this.A09 == c6136Dwe.A09 && this.A0D == c6136Dwe.A0D && this.A04 == c6136Dwe.A04 && this.A05 == c6136Dwe.A05 && this.A02 == c6136Dwe.A02 && this.A03 == c6136Dwe.A03 && this.A06 == c6136Dwe.A06 && this.A0C == c6136Dwe.A0C && this.A0F == c6136Dwe.A0F && this.A0H == c6136Dwe.A0H && this.A08 == c6136Dwe.A08 && this.A07 == c6136Dwe.A07) {
                    SparseBooleanArray sparseBooleanArray = this.A01;
                    SparseBooleanArray sparseBooleanArray2 = c6136Dwe.A01;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray sparseArray = this.A00;
                                SparseArray sparseArray2 = c6136Dwe.A00;
                                int size2 = sparseArray.size();
                                if (sparseArray2.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                        if (iIndexOfKey >= 0) {
                                            Map map = (Map) sparseArray.valueAt(i2);
                                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                            if (map2.size() == map.size()) {
                                                Iterator itA0n = AnonymousClass002.A0n(map);
                                                while (itA0n.hasNext()) {
                                                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                                                    Object key = entryA0l.getKey();
                                                    if (!map2.containsKey(key) || !C6xC.A00(entryA0l.getValue(), map2.get(key))) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        C6136Dwe c6136Dwe = new C6136Dwe(new C6137Dwf());
        A0I = c6136Dwe;
        A0J = c6136Dwe;
    }

    public C6136Dwe(C6137Dwf c6137Dwf) {
        super(c6137Dwf);
        this.A0G = c6137Dwf.A0E;
        this.A0A = c6137Dwf.A08;
        this.A0B = c6137Dwf.A09;
        this.A09 = c6137Dwf.A07;
        this.A0D = c6137Dwf.A0B;
        this.A04 = c6137Dwf.A02;
        this.A05 = c6137Dwf.A03;
        this.A02 = c6137Dwf.A00;
        this.A03 = c6137Dwf.A01;
        this.A06 = c6137Dwf.A04;
        this.A0C = c6137Dwf.A0A;
        this.A0F = c6137Dwf.A0D;
        this.A0H = c6137Dwf.A0F;
        this.A08 = c6137Dwf.A06;
        this.A07 = c6137Dwf.A05;
        this.A00 = c6137Dwf.A0G;
        this.A01 = c6137Dwf.A0H;
        this.A0E = c6137Dwf.A0C;
    }

    @Override // X.C6141Dwj
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0);
    }
}
