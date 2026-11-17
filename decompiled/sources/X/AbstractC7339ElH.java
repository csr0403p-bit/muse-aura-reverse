package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.ElH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7339ElH extends AbstractMap {
    public int A00;
    public Map A01;
    public Map A02;
    public boolean A03;
    public Object[] A04;
    public volatile C7340ElI A05;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7339ElH)) {
            return super.equals(obj);
        }
        AbstractC7339ElH abstractC7339ElH = (AbstractC7339ElH) obj;
        int size = this.A01.size() + this.A00;
        if (size == abstractC7339ElH.A01.size() + abstractC7339ElH.A00) {
            int i = this.A00;
            if (i != abstractC7339ElH.A00) {
                return entrySet().equals(abstractC7339ElH.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (A01(i2).equals(abstractC7339ElH.A01(i2))) {
                }
            }
            if (i != size) {
                return this.A01.equals(abstractC7339ElH.A01);
            }
            return true;
        }
        return false;
    }

    public final C7342ElK A01(int i) {
        if (i < this.A00) {
            return (C7342ElK) this.A04[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void A03() {
        if (this.A03) {
            throw C8j3.A17();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        int i = this.A00 - 1;
        if (i < 0) {
            return AnonymousClass002.A1L(this.A01.containsKey(null) ? 1 : 0);
        }
        this.A04[i].getClass();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.A05 == null) {
            this.A05 = new C7340ElI(this);
        }
        return this.A05;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        int i = this.A00 - 1;
        if (i < 0) {
            return this.A01.get(null);
        }
        this.A04[i].getClass();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.A00;
        int iA0G = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA0G = AnonymousClass005.A0G(this.A04[i2], iA0G);
        }
        return this.A01.size() > 0 ? this.A01.hashCode() + iA0G : iA0G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A01.size() + this.A00;
    }

    public AbstractC7339ElH() {
        Map map = Collections.EMPTY_MAP;
        this.A01 = map;
        this.A02 = map;
    }

    public static final SortedMap A00(AbstractC7339ElH abstractC7339ElH) {
        abstractC7339ElH.A03();
        if (abstractC7339ElH.A01.isEmpty() && !(abstractC7339ElH.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            abstractC7339ElH.A01 = treeMap;
            abstractC7339ElH.A02 = treeMap.descendingMap();
        }
        return (SortedMap) abstractC7339ElH.A01;
    }

    public final Object A02(Object obj) {
        A03();
        int i = this.A00 - 1;
        if (i >= 0) {
            this.A04[i].getClass();
            throw null;
        }
        A03();
        Object[] objArr = this.A04;
        if (objArr == null) {
            objArr = new Object[16];
            this.A04 = objArr;
        }
        if (this.A00 == 16) {
            C7342ElK c7342ElK = (C7342ElK) objArr[15];
            this.A00 = 15;
            SortedMap sortedMapA00 = A00(this);
            c7342ElK.getClass();
            sortedMapA00.put(null, c7342ElK.A00);
        }
        Object[] objArr2 = this.A04;
        System.arraycopy(objArr2, 0, objArr2, 1, objArr2.length - 1);
        this.A04[0] = new C7342ElK(this, obj);
        this.A00++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        A03();
        if (this.A00 != 0) {
            this.A04 = null;
            this.A00 = 0;
        }
        if (this.A01.isEmpty()) {
            return;
        }
        this.A01.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        A03();
        if (obj != null) {
            throw new ClassCastException();
        }
        int i = this.A00 - 1;
        if (i >= 0) {
            this.A04[i].getClass();
            throw null;
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(null);
    }
}
