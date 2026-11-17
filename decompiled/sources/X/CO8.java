package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CO8 extends COD implements Set {
    public transient COO A00;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if ((!(obj instanceof CO8) || !(this instanceof CO7) || !(((CO8) obj) instanceof CO7) || hashCode() == obj.hashCode()) && (obj instanceof Set)) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (!containsAll(set)) {
                            return false;
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final COO A07() {
        COO com2;
        if (this instanceof COK) {
            Object obj = ((COK) this).A00;
            COR cor = COO.A00;
            Object[] objArr = {obj};
            if (objArr[0] != null) {
                return new COM(1, objArr);
            }
            throw BV8.A0n(0);
        }
        if (this instanceof COC) {
            return ((COC) this).A01;
        }
        COO coo = this.A00;
        if (coo != null) {
            return coo;
        }
        if (!(this instanceof CO7)) {
            if (this instanceof CO6) {
                com2 = new CO9((CO6) this);
            } else {
                Object[] array = toArray();
                int length = array.length;
                COR cor2 = COO.A00;
                if (length != 0) {
                    com2 = new COM(length, array);
                }
            }
            this.A00 = com2;
            return com2;
        }
        COR cor3 = COO.A00;
        com2 = COM.A02;
        this.A00 = com2;
        return com2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }
}
