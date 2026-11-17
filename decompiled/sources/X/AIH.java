package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AIH extends AbstractList implements List, InterfaceC0884AGl {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    public static int A0O(int i, int i2) {
        return i > 32 ? i - ((i - 1) & (-32)) : i2;
    }

    public static Object[] A0Q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        return objArr;
    }

    public int A0R() {
        if (this instanceof AHL) {
            return ((AHL) this).A01;
        }
        if (!(this instanceof AIJ)) {
            return this instanceof C0894AGw ? ((C0894AGw) this).A00.size() : ((AHV) this).A01;
        }
        AIJ aij = (AIJ) this;
        AIJ.A06(aij);
        return aij.length;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [E, java.lang.Object] */
    public E A0S(int i) {
        if (this instanceof AII) {
            AII aii = (AII) this;
            AII.A06(aii);
            AH7.A01(i, aii.length);
            return AII.A02(aii, i);
        }
        if (!(this instanceof AIJ)) {
            C0894AGw c0894AGw = (C0894AGw) this;
            return c0894AGw.A00.remove(BHL.A19(c0894AGw, i));
        }
        AIJ aij = (AIJ) this;
        AIJ.A07(aij);
        AIJ.A06(aij);
        AH7.A01(i, aij.length);
        return AIJ.A02(aij, aij.offset + i);
    }

    public static int A0P(AbstractCollection abstractCollection, Collection collection) {
        return abstractCollection.size() + collection.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [E, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return A0S(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return A0R();
    }
}
