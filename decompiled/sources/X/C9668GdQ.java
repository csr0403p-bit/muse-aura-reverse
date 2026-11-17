package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.GdQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9668GdQ implements Iterable<AbstractC9915Gl5>, Serializable {
    public static final long serialVersionUID = 2;
    public final Map<String, List<C10009Gnh>> _aliasDefs;
    public final Map<String, String> _aliasMapping;
    public final boolean _caseInsensitive;
    public Object[] _hashArea;
    public int _hashMask;
    public final Locale _locale;
    public final AbstractC9915Gl5[] _propsInOrder;
    public int _size;
    public int _spillCount;

    public static final int A00(AbstractC9915Gl5 abstractC9915Gl5, C9668GdQ c9668GdQ) {
        AbstractC9915Gl5[] abstractC9915Gl5Arr = c9668GdQ._propsInOrder;
        int length = abstractC9915Gl5Arr.length;
        for (int i = 0; i < length; i++) {
            if (abstractC9915Gl5Arr[i] == abstractC9915Gl5) {
                return i;
            }
        }
        throw BV5.A0V("Illegal state: property '", abstractC9915Gl5._propName._simpleName, "' missing from _propsInOrder");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9915Gl5 A02(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L98
            boolean r0 = r8._caseInsensitive
            if (r0 == 0) goto Lc
            java.util.Locale r0 = r8._locale
            java.lang.String r9 = r9.toLowerCase(r0)
        Lc:
            int r5 = r9.hashCode()
            int r3 = r8._hashMask
            r5 = r5 & r3
            int r2 = r5 << 1
            java.lang.Object[] r4 = r8._hashArea
            r1 = r4[r2]
            if (r1 == r9) goto L91
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L91
            if (r1 == 0) goto L4b
            int r3 = r3 + 1
            int r0 = r5 >> 1
            int r0 = r0 + r3
            int r2 = r0 << 1
            r1 = r4[r2]
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L91
            if (r1 == 0) goto L4b
            int r0 = r3 >> 1
            int r3 = r3 + r0
            int r2 = r3 << 1
            int r1 = r8._spillCount
            int r1 = r1 + r2
        L3c:
            if (r2 >= r1) goto L4b
            r0 = r4[r2]
            if (r0 == r9) goto L91
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L91
            int r2 = r2 + 2
            goto L3c
        L4b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8._aliasMapping
            java.lang.String r5 = X.C60O.A0p(r9, r0)
            r7 = 0
            if (r5 == 0) goto L97
            int r6 = r5.hashCode()
            int r3 = r8._hashMask
            r6 = r6 & r3
            int r2 = r6 << 1
            java.lang.Object[] r4 = r8._hashArea
            r1 = r4[r2]
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L91
            if (r1 == 0) goto L97
            int r3 = r3 + 1
            int r0 = r6 >> 1
            int r0 = r0 + r3
            int r2 = r0 << 1
            r1 = r4[r2]
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L91
            if (r1 == 0) goto L97
            int r0 = r3 >> 1
            int r3 = r3 + r0
            int r2 = r3 << 1
            int r1 = r8._spillCount
            int r1 = r1 + r2
        L82:
            if (r2 >= r1) goto L97
            r0 = r4[r2]
            if (r0 == r5) goto L91
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L91
            int r2 = r2 + 2
            goto L82
        L91:
            int r0 = r2 + 1
            r7 = r4[r0]
            X.Gl5 r7 = (X.AbstractC9915Gl5) r7
        L97:
            return r7
        L98:
            java.lang.String r0 = "Cannot pass null property name"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9668GdQ.A02(java.lang.String):X.Gl5");
    }

    public final C9668GdQ A03(AbstractC9915Gl5 abstractC9915Gl5) {
        boolean z = this._caseInsensitive;
        String lowerCase = abstractC9915Gl5._propName._simpleName;
        if (z) {
            lowerCase = lowerCase.toLowerCase(this._locale);
        }
        Object[] objArr = this._hashArea;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            AbstractC9915Gl5 abstractC9915Gl52 = (AbstractC9915Gl5) objArr[i];
            if (abstractC9915Gl52 != null && abstractC9915Gl52._propName._simpleName.equals(lowerCase)) {
                return new C9668GdQ(abstractC9915Gl5, this, i, A00(abstractC9915Gl52, this));
            }
        }
        return new C9668GdQ(abstractC9915Gl5, this, lowerCase, lowerCase.hashCode() & this._hashMask);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC9915Gl5> iterator() {
        ArrayList arrayListA11 = C60O.A11(this._size);
        Object[] objArr = this._hashArea;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            Object obj = objArr[i];
            if (obj != null) {
                arrayListA11.add(obj);
            }
        }
        return arrayListA11.iterator();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Properties=[");
        Iterator<AbstractC9915Gl5> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC9915Gl5 next = it.next();
            int i2 = i + 1;
            if (i > 0) {
                C8j3.A1K(sbA0x);
            }
            sbA0x.append(next._propName._simpleName);
            sbA0x.append('(');
            sbA0x.append(next._type);
            sbA0x.append(')');
            i = i2;
        }
        sbA0x.append(']');
        if (!this._aliasDefs.isEmpty()) {
            sbA0x.append("(aliases: ");
            sbA0x.append(this._aliasDefs);
            sbA0x.append(")");
        }
        return sbA0x.toString();
    }

    public C9668GdQ(C9668GdQ c9668GdQ, boolean z) {
        this._caseInsensitive = z;
        this._locale = c9668GdQ._locale;
        this._aliasDefs = c9668GdQ._aliasDefs;
        this._aliasMapping = c9668GdQ._aliasMapping;
        AbstractC9915Gl5[] abstractC9915Gl5Arr = c9668GdQ._propsInOrder;
        AbstractC9915Gl5[] abstractC9915Gl5Arr2 = (AbstractC9915Gl5[]) Arrays.copyOf(abstractC9915Gl5Arr, abstractC9915Gl5Arr.length);
        this._propsInOrder = abstractC9915Gl5Arr2;
        A01(this, Arrays.asList(abstractC9915Gl5Arr2));
    }

    public static final void A01(C9668GdQ c9668GdQ, Collection collection) {
        int i;
        int size = collection.size();
        c9668GdQ._size = size;
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                i = 32;
                while (i < size + (size >> 2)) {
                    i += i;
                }
            }
        }
        c9668GdQ._hashMask = i - 1;
        int i2 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i2 * 2];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AbstractC9915Gl5 abstractC9915Gl5 = (AbstractC9915Gl5) it.next();
            if (abstractC9915Gl5 != null) {
                boolean z = c9668GdQ._caseInsensitive;
                String lowerCase = abstractC9915Gl5._propName._simpleName;
                if (z) {
                    lowerCase = lowerCase.toLowerCase(c9668GdQ._locale);
                }
                int iHashCode = lowerCase.hashCode() & c9668GdQ._hashMask;
                int i4 = iHashCode << 1;
                if (objArrCopyOf[i4] != null) {
                    i4 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i4] = lowerCase;
                objArrCopyOf[i4 + 1] = abstractC9915Gl5;
            }
        }
        c9668GdQ._hashArea = objArrCopyOf;
        c9668GdQ._spillCount = i3;
    }

    public C9668GdQ(AbstractC9915Gl5 abstractC9915Gl5, C9668GdQ c9668GdQ, int i, int i2) {
        this._caseInsensitive = c9668GdQ._caseInsensitive;
        this._locale = c9668GdQ._locale;
        this._hashMask = c9668GdQ._hashMask;
        this._size = c9668GdQ._size;
        this._spillCount = c9668GdQ._spillCount;
        this._aliasDefs = c9668GdQ._aliasDefs;
        this._aliasMapping = c9668GdQ._aliasMapping;
        Object[] objArr = c9668GdQ._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        AbstractC9915Gl5[] abstractC9915Gl5Arr = c9668GdQ._propsInOrder;
        AbstractC9915Gl5[] abstractC9915Gl5Arr2 = (AbstractC9915Gl5[]) Arrays.copyOf(abstractC9915Gl5Arr, abstractC9915Gl5Arr.length);
        this._propsInOrder = abstractC9915Gl5Arr2;
        this._hashArea[i] = abstractC9915Gl5;
        abstractC9915Gl5Arr2[i2] = abstractC9915Gl5;
    }

    /* JADX WARN: Incorrect types in method signature: (ZLjava/util/Collection<LX/Gl5;>;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<LX/Gnh;>;>;Ljava/util/Locale;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public C9668GdQ(Collection collection, Locale locale, Map map, boolean z) {
        ?? A0u;
        this._caseInsensitive = z;
        this._propsInOrder = (AbstractC9915Gl5[]) collection.toArray(new AbstractC9915Gl5[collection.size()]);
        this._aliasDefs = map;
        this._locale = locale;
        if (map != null && !map.isEmpty()) {
            A0u = BV4.A0u();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                strA0t = z ? strA0t.toLowerCase(locale) : strA0t;
                Iterator itA13 = AbstractC7607F5u.A13(entryA0l.getValue());
                while (itA13.hasNext()) {
                    String lowerCase = ((C10009Gnh) itA13.next())._simpleName;
                    if (z) {
                        lowerCase = lowerCase.toLowerCase(locale);
                    }
                    A0u.put(lowerCase, strA0t);
                }
            }
        } else {
            A0u = Collections.EMPTY_MAP;
        }
        this._aliasMapping = A0u;
        A01(this, collection);
    }

    public C9668GdQ(AbstractC9915Gl5 abstractC9915Gl5, C9668GdQ c9668GdQ, String str, int i) {
        this._caseInsensitive = c9668GdQ._caseInsensitive;
        this._locale = c9668GdQ._locale;
        this._hashMask = c9668GdQ._hashMask;
        this._size = c9668GdQ._size;
        this._spillCount = c9668GdQ._spillCount;
        this._aliasDefs = c9668GdQ._aliasDefs;
        this._aliasMapping = c9668GdQ._aliasMapping;
        Object[] objArr = c9668GdQ._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        AbstractC9915Gl5[] abstractC9915Gl5Arr = c9668GdQ._propsInOrder;
        int length = abstractC9915Gl5Arr.length;
        AbstractC9915Gl5[] abstractC9915Gl5Arr2 = (AbstractC9915Gl5[]) Arrays.copyOf(abstractC9915Gl5Arr, length + 1);
        this._propsInOrder = abstractC9915Gl5Arr2;
        abstractC9915Gl5Arr2[length] = abstractC9915Gl5;
        int i2 = this._hashMask + 1;
        int i3 = i << 1;
        Object[] objArrCopyOf = this._hashArea;
        if (objArrCopyOf[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArrCopyOf[i3] != null) {
                int i4 = this._spillCount;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this._spillCount = i4 + 2;
                int length2 = objArrCopyOf.length;
                if (i3 >= length2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2 + 4);
                    this._hashArea = objArrCopyOf;
                }
            }
        }
        objArrCopyOf[i3] = str;
        objArrCopyOf[i3 + 1] = abstractC9915Gl5;
    }
}
