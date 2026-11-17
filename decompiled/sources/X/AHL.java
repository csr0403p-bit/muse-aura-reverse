package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AHL<E> extends AIH<E> implements AGK<E> {
    public int A00;
    public int A01;
    public AHS A02;
    public Object[] A03;
    public Object[] A04;
    public AHH<? extends E> A05;

    public AHL(AHH<? extends E> ahh, Object[] objArr, Object[] objArr2, int i) {
        C7384Etj.A0Y(objArr2, 2);
        this.A00 = i;
        this.A05 = ahh;
        this.A02 = new AHS();
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = ahh.size();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-TE;Ljava/lang/Boolean;>;[Ljava/lang/Object;IILX/AHK;Ljava/util/List<[Ljava/lang/Object;>;Ljava/util/List<[Ljava/lang/Object;>;)I */
    private final int A01(List list, List list2, G0U g0u, AHK ahk, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = ahk.A00;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrA0D = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!AnonymousClass003.A1X(obj2, g0u)) {
                if (i2 == 32) {
                    objArrA0D = !list.isEmpty() ? (Object[]) list.remove(C60O.A00(list)) : A0D();
                    i2 = 0;
                }
                objArrA0D[i2] = obj2;
                i2++;
            }
        }
        ahk.A00 = objArrA0D;
        if (objArr2 != objArrA0D) {
            list2.add(objArr2);
        }
        return i2;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<+TE;>;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V */
    private final void A06(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] objArrA0D;
        if (i3 < 1) {
            throw C3cG.A0Q("Check failed.");
        }
        Object[] objArrA0J = A0J(objArr);
        objArr3[0] = objArrA0J;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC0903AHf.A05(objArrA0J, objArr2, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrA0D = objArrA0J;
            } else {
                objArrA0D = A0D();
                i3--;
                objArr3[i3] = objArrA0D;
            }
            int i7 = i2 - i6;
            AbstractC0903AHf.A05(objArrA0J, objArr2, 0, i7, i2);
            AbstractC0903AHf.A05(objArrA0J, objArrA0D, size + 1, i4, i7);
            objArr2 = objArrA0D;
        }
        Iterator<E> it = collection.iterator();
        A08(it, objArrA0J, i4);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrA0D2 = A0D();
            A08(it, objArrA0D2, 0);
            objArr3[i8] = objArrA0D2;
        }
        A08(it, objArr2, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<+TE;>;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V */
    private final void A07(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[] objArrPrevious;
        Object[] objArr3 = objArr;
        if (this.A03 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        int i4 = i >> 5;
        int i5 = i3;
        Object[] objArrA0K = objArr3;
        ListIterator<Object[]> listIteratorA04 = A04(A00() >> 5);
        while (true) {
            int iPreviousIndex = listIteratorA04.previousIndex();
            objArrPrevious = listIteratorA04.previous();
            if (iPreviousIndex == i4) {
                break;
            }
            AbstractC0903AHf.A05(objArrPrevious, objArrA0K, 0, 32 - i2, 32);
            objArrA0K = A0K(objArrPrevious, i2);
            i5--;
            objArr2[i5] = objArrA0K;
        }
        int iA00 = i3 - (((A00() >> 5) - 1) - i4);
        if (iA00 < i3) {
            objArr3 = objArr2[iA00];
            C7384Etj.A0X(objArr3);
        }
        A06(collection, objArrPrevious, objArr3, objArr2, i, 32, iA00);
    }

    private final void A0B(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            A09(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            A0A(objArr);
            this.A01 = i;
        } else {
            AHK ahk = new AHK();
            ahk.A00 = null;
            C7384Etj.A0X(objArr);
            Object[] objArrA0H = A0H(ahk, objArr, i2, i);
            C7384Etj.A0X(objArrA0H);
            Object obj = ahk.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A0A((Object[]) obj);
            this.A01 = i;
            if (objArrA0H[1] == null) {
                A09((Object[]) objArrA0H[0]);
                i2 -= 5;
            } else {
                A09(objArrA0H);
            }
        }
        this.A00 = i2;
    }

    private final Object[] A0K(Object[] objArr, int i) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrA0D = A0D();
        AbstractC0903AHf.A05(objArr, objArrA0D, i, 0, 32 - i);
        return objArrA0D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        Object[] objArrA0D;
        if (C8j4.A1Z(collection)) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int size = size();
        int iA0O = AIH.A0O(size, size);
        Iterator<? extends E> it = collection.iterator();
        if (32 - iA0O >= collection.size()) {
            objArrA0D = A0J(this.A04);
            A08(it, objArrA0D, iA0O);
        } else {
            int size2 = ((collection.size() + iA0O) - 1) / 32;
            Object[][] objArr = new Object[size2][];
            Object[] objArrA0J = A0J(this.A04);
            A08(it, objArrA0J, iA0O);
            objArr[0] = objArrA0J;
            for (int i = 1; i < size2; i++) {
                Object[] objArrA0D2 = A0D();
                A08(it, objArrA0D2, 0);
                objArr[i] = objArrA0D2;
            }
            A09(A0N(this.A03, objArr, A00()));
            objArrA0D = A0D();
            A08(it, objArrA0D, 0);
        }
        A0A(objArrA0D);
        this.A01 = AIH.A0P(this, collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        if (C8j4.A1Z(collection)) {
            return false;
        }
        return A0U(C2297BSx.A00(collection, 45));
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        AHB.A00(i, size());
        if (A00() > i) {
            AHK ahk = new AHK();
            ahk.A00 = null;
            Object[] objArr = this.A03;
            C7384Etj.A0X(objArr);
            A09(A0F(e, ahk, objArr, this.A00, i));
            return (E) ahk.A00;
        }
        Object[] objArrA0J = A0J(this.A04);
        if (objArrA0J != this.A04) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrA0J[i2];
        objArrA0J[i2] = e;
        A0A(objArrA0J);
        return e2;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-TE;Ljava/lang/Boolean;>;ILX/AHK;)I */
    private final int A02(G0U g0u, AHK ahk, int i) {
        Object[] objArr = this.A04;
        Object[] objArrA0J = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (AnonymousClass003.A1X(obj, g0u)) {
                if (!z) {
                    objArrA0J = A0J(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrA0J[i2] = obj;
                i2++;
            }
        }
        ahk.A00 = objArrA0J;
        if (i2 == i) {
            return i;
        }
        C7384Etj.A0Z(objArrA0J, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        AbstractC0903AHf.A04(objArrA0J, i2, i);
        A0A(objArrA0J);
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final ListIterator<Object[]> A04(int i) {
        if (this.A03 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        int iA00 = A00() >> 5;
        AHB.A01(i, iA00);
        int i2 = this.A00;
        if (i2 == 0) {
            Object[] objArr = this.A03;
            C7384Etj.A0X(objArr);
            return new AHR(objArr, i);
        }
        int i3 = i2 / 5;
        Object[] objArr2 = this.A03;
        C7384Etj.A0X(objArr2);
        return new AHO(objArr2, i, iA00, i3);
    }

    /* JADX WARN: Incorrect return type in method signature: ([Ljava/lang/Object;ILjava/util/Iterator<+Ljava/lang/Object;>;)[Ljava/lang/Object; */
    public static final void A08(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private final void A09(Object[] objArr) {
        if (objArr != this.A03) {
            this.A05 = null;
            this.A03 = objArr;
        }
    }

    private final void A0A(Object[] objArr) {
        if (objArr != this.A04) {
            this.A05 = null;
            this.A04 = objArr;
        }
    }

    private final Object[] A0D() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0E(Object obj, AHK ahk, Object[] objArr, int i, int i2) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            ahk.A00 = objArr[31];
            Object[] objArrA0J = A0J(objArr);
            AbstractC0903AHf.A05(objArr, objArrA0J, i3 + 1, i3, 31);
            objArrA0J[i3] = obj;
            return objArrA0J;
        }
        Object[] objArrA0J2 = A0J(objArr);
        int i4 = i - 5;
        Object obj3 = objArrA0J2[i3];
        C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj3;
        while (true) {
            objArrA0J2[i3] = A0E(obj, ahk, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || (obj2 = objArrA0J2[i3]) == null) {
                return objArrA0J2;
            }
            objArr2 = (Object[]) obj2;
            i2 = 0;
            obj = ahk.A00;
        }
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/Object;IITE;LX/AHK;)[Ljava/lang/Object; */
    private final Object[] A0F(Object obj, AHK ahk, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrA0J = A0J(objArr);
        if (i != 0) {
            Object obj2 = objArrA0J[i3];
            C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrA0J[i3] = A0F(obj, ahk, (Object[]) obj2, i - 5, i2);
            return objArrA0J;
        }
        if (objArrA0J != objArr) {
            ((AbstractList) this).modCount++;
        }
        ahk.A00 = objArrA0J[i3];
        objArrA0J[i3] = obj;
        return objArrA0J;
    }

    private final Object[] A0H(AHK ahk, Object[] objArr, int i, int i2) {
        Object[] objArrA0H;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i != 5) {
            objArrA0H = A0H(ahk, C8j4.A1a(objArr, i3), i - 5, i2);
            if (objArrA0H == null) {
            }
            Object[] objArrA0J = A0J(objArr);
            objArrA0J[i3] = objArrA0H;
            return objArrA0J;
        }
        ahk.A00 = objArr[i3];
        objArrA0H = null;
        if (i3 == 0) {
            return null;
        }
        Object[] objArrA0J2 = A0J(objArr);
        objArrA0J2[i3] = objArrA0H;
        return objArrA0J2;
    }

    private final Object[] A0I(AHK ahk, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrA0J = A0J(objArr);
            AbstractC0903AHf.A05(objArr, objArrA0J, i3, i3 + 1, 32);
            objArrA0J[31] = ahk.A00;
            ahk.A00 = obj;
            return objArrA0J;
        }
        int iA00 = objArr[31] == null ? ((A00() - 1) >> i) & 31 : 31;
        Object[] objArrA0J2 = A0J(objArr);
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iA00) {
            while (true) {
                objArrA0J2[iA00] = A0I(ahk, C8j4.A1b(objArrA0J2, iA00), i4, 0);
                if (iA00 == i5) {
                    break;
                }
                iA00--;
            }
        }
        objArrA0J2[i3] = A0I(ahk, C8j4.A1b(objArrA0J2, i3), i4, i2);
        return objArrA0J2;
    }

    private final Object[] A0J(Object[] objArr) {
        if (objArr == null) {
            return A0D();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A02) {
            return objArr;
        }
        Object[] objArrA0D = A0D();
        if (length > 32) {
            length = 32;
        }
        AbstractC0903AHf.A05(objArr, objArrA0D, 0, 0, length);
        return objArrA0D;
    }

    private final Object[] A0L(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw C3cG.A0Q("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = (i >> i2) & 31;
        Object objA0L = A0L(C8j4.A1a(objArr, i3), i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (objArr.length == 33 && objArr[32] == this.A02) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrA0D = A0D();
                AbstractC0903AHf.A05(objArr, objArrA0D, 0, 0, i4);
                objArr = objArrA0D;
            }
        }
        if (objA0L == objArr[i3]) {
            return objArr;
        }
        Object[] objArrA0J = A0J(objArr);
        objArrA0J[i3] = objA0L;
        return objArrA0J;
    }

    private final Object[] A0N(Object[] objArr, Object[][] objArr2, int i) {
        F3E f3e = new F3E(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        Object[] objArrA0G = i2 < (1 << i3) ? A0G(f3e, objArr, i, i3) : A0J(objArr);
        while (f3e.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            objArrA0G = AIH.A0Q(objArrA0G);
            objArrA0G[32] = this.A02;
            A0G(f3e, objArrA0G, 1 << i4, i4);
        }
        return objArrA0G;
    }

    public final int A0T() {
        return ((AbstractList) this).modCount;
    }

    public final boolean A0U(G0U<? super E, Boolean> g0u) {
        int iA02;
        int i;
        Object[] objArrA0L;
        int size = size();
        int iA0O = AIH.A0O(size, size);
        AHK ahk = new AHK();
        ahk.A00 = null;
        if (this.A03 == null) {
            iA02 = A02(g0u, ahk, iA0O);
        } else {
            ListIterator<Object[]> listIteratorA04 = A04(0);
            while (listIteratorA04.hasNext()) {
                Object[] next = listIteratorA04.next();
                int i2 = 0;
                Object[] objArrA0J = next;
                int iA01 = 32;
                boolean z = false;
                do {
                    Object obj = next[i2];
                    if (AnonymousClass003.A1X(obj, g0u)) {
                        if (!z) {
                            objArrA0J = A0J(next);
                            z = true;
                            iA01 = i2;
                        }
                    } else if (z) {
                        objArrA0J[iA01] = obj;
                        iA01++;
                    }
                    i2++;
                } while (i2 < 32);
                ahk.A00 = objArrA0J;
                if (iA01 != 32) {
                    int iPreviousIndex = listIteratorA04.previousIndex() << 5;
                    ArrayList arrayListA0h = C3cG.A0h();
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    while (listIteratorA04.hasNext()) {
                        iA01 = A01(arrayListA0h2, arrayListA0h, g0u, ahk, listIteratorA04.next(), 32, iA01);
                    }
                    int iA012 = A01(arrayListA0h2, arrayListA0h, g0u, ahk, this.A04, iA0O, iA01);
                    Object obj2 = ahk.A00;
                    C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    Object[] objArr = (Object[]) obj2;
                    AbstractC0903AHf.A04(objArr, iA012, 32);
                    boolean zIsEmpty = arrayListA0h.isEmpty();
                    Object[] objArrA0G = this.A03;
                    if (zIsEmpty) {
                        C7384Etj.A0X(objArrA0G);
                    } else {
                        objArrA0G = A0G(arrayListA0h.iterator(), objArrA0G, iPreviousIndex, this.A00);
                    }
                    int size2 = iPreviousIndex + (arrayListA0h.size() << 5);
                    if ((size2 & 31) != 0) {
                        throw C3cG.A0Q("Check failed.");
                    }
                    if (size2 == 0) {
                        this.A00 = 0;
                        objArrA0L = null;
                    } else {
                        int i3 = size2 - 1;
                        while (true) {
                            i = this.A00;
                            if ((i3 >> i) != 0) {
                                break;
                            }
                            this.A00 = i - 5;
                            objArrA0G = C8j4.A1b(objArrA0G, 0);
                        }
                        objArrA0L = A0L(objArrA0G, i3, i);
                    }
                    A09(objArrA0L);
                    A0A(objArr);
                    this.A01 = size2 + iA012;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
            iA02 = A02(g0u, ahk, iA0O);
            if (iA02 == 0) {
                A0B(this.A03, size(), this.A00);
            }
        }
        if (iA02 == iA0O) {
            return false;
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // X.AGK
    public final AHH<E> A5R() {
        AHJ ahi = this.A05;
        if (ahi == null) {
            Object[] objArr = this.A03;
            Object[] objArr2 = this.A04;
            this.A02 = new AHS();
            ahi = objArr == null ? objArr2.length == 0 ? AHI.A01 : new AHI(C8j3.A1a(objArr2, size())) : new AHJ(objArr, objArr2, size(), this.A00);
            this.A05 = (AHH<? extends E>) ahi;
        }
        return ahi;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & (-32);
        }
        if (size < 32) {
            Object[] objArrA0J = A0J(this.A04);
            objArrA0J[size] = e;
            A0A(objArrA0J);
            this.A01 = size() + 1;
            return true;
        }
        Object[] objArr = new Object[33];
        objArr[0] = e;
        objArr[32] = this.A02;
        A0C(this.A03, this.A04, objArr);
        return true;
    }

    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return C8j3.A0K(this) & (-32);
    }

    private final Object A03(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.A04;
        if (size == 1) {
            Object obj = objArr2[0];
            A0B(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrA0J = A0J(objArr2);
        AbstractC0903AHf.A05(objArr2, objArrA0J, i3, i3 + 1, size);
        objArrA0J[size - 1] = null;
        A09(objArr);
        A0A(objArrA0J);
        this.A01 = (i + size) - 1;
        this.A00 = i2;
        return obj2;
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/Object;ITE;)V */
    private final void A05(Object obj, Object[] objArr, int i) {
        int size = size();
        int iA0O = AIH.A0O(size, size);
        Object[] objArrA0J = A0J(this.A04);
        Object[] objArr2 = this.A04;
        if (iA0O < 32) {
            AbstractC0903AHf.A05(objArr2, objArrA0J, i + 1, i, iA0O);
            objArrA0J[i] = obj;
            A09(objArr);
            A0A(objArrA0J);
            this.A01 = size() + 1;
            return;
        }
        Object obj2 = objArr2[31];
        AbstractC0903AHf.A05(objArr2, objArrA0J, i + 1, i, 31);
        objArrA0J[i] = obj;
        Object[] objArrA0Q = AIH.A0Q(obj2);
        objArrA0Q[32] = this.A02;
        A0C(objArr, objArrA0J, objArrA0Q);
    }

    private final void A0C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArrA0Q = AIH.A0Q(objArr);
            objArrA0Q[32] = this.A02;
            A09(A0M(objArrA0Q, objArr2, i + 5));
            A0A(objArr3);
            this.A00 += 5;
        } else {
            if (objArr == null) {
                A09(objArr2);
            } else {
                A09(A0M(objArr, objArr2, i));
            }
            A0A(objArr3);
        }
        this.A01 = size() + 1;
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/Object;IILjava/util/Iterator<[Ljava/lang/Object;>;)[Ljava/lang/Object; */
    private final Object[] A0G(Iterator it, Object[] objArr, int i, int i2) {
        if (!it.hasNext()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (i2 < 0) {
            throw C3cG.A0Q("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrA0J = A0J(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        Object[] objArrA0G = A0G(it, (Object[]) objArrA0J[i3], i, i4);
        while (true) {
            objArrA0J[i3] = objArrA0G;
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                return objArrA0J;
            }
            objArrA0G = A0G(it, (Object[]) objArrA0J[i3], 0, i4);
        }
    }

    private final Object[] A0M(Object[] objArr, Object[] objArr2, int i) {
        int iA0K = (C8j3.A0K(this) >> i) & 31;
        Object[] objArrA0J = A0J(objArr);
        if (i != 5) {
            objArr2 = A0M((Object[]) objArrA0J[iA0K], objArr2, i - 5);
        }
        objArrA0J[iA0K] = objArr2;
        return objArrA0J;
    }

    @Override // X.AIH
    public final E A0S(int i) {
        AHB.A00(i, size());
        ((AbstractList) this).modCount++;
        int iA00 = A00();
        if (i >= iA00) {
            return (E) A03(this.A03, iA00, this.A00, i - iA00);
        }
        Object obj = this.A04[0];
        AHK ahk = new AHK();
        ahk.A00 = obj;
        Object[] objArr = this.A03;
        C7384Etj.A0X(objArr);
        A03(A0I(ahk, objArr, this.A00, i), iA00, this.A00, 0);
        return (E) ahk.A00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArrA1a;
        AHB.A00(i, size());
        if (A00() <= i) {
            objArrA1a = this.A04;
        } else {
            objArrA1a = this.A03;
            C7384Etj.A0X(objArrA1a);
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArrA1a = C8j4.A1a(objArrA1a, (i >> i2) & 31);
            }
        }
        return (E) objArrA1a[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        AHB.A01(i, size());
        return new AHM(this, i);
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        AHB.A01(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iA00 = A00();
        if (i >= iA00) {
            A05(e, this.A03, i - iA00);
            return;
        }
        AHK ahk = new AHK();
        ahk.A00 = null;
        Object[] objArr = this.A03;
        C7384Etj.A0X(objArr);
        A05(ahk.A00, A0E(e, ahk, objArr, this.A00, i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArrA0D;
        C7384Etj.A0Y(collection, 1);
        AHB.A01(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr = this.A04;
            objArrA0D = A0J(objArr);
            int i4 = size2 + 1;
            int size3 = size();
            AbstractC0903AHf.A05(objArr, objArrA0D, i4, i3, AIH.A0O(size3, size3));
            A08(collection.iterator(), objArrA0D, i3);
        } else {
            Object[][] objArr2 = new Object[size][];
            int size4 = size();
            int iA0O = AIH.A0O(size4, size4);
            int iA0P = AIH.A0P(this, collection);
            int iA0O2 = AIH.A0O(iA0P, iA0P);
            if (i >= A00()) {
                objArrA0D = A0D();
                A06(collection, this.A04, objArrA0D, objArr2, i, iA0O, size);
            } else {
                Object[] objArr3 = this.A04;
                if (iA0O2 > iA0O) {
                    int i5 = iA0O2 - iA0O;
                    objArrA0D = A0K(objArr3, i5);
                    A07(collection, objArrA0D, objArr2, i, i5, size);
                } else {
                    objArrA0D = A0D();
                    int i6 = iA0O - iA0O2;
                    AbstractC0903AHf.A05(objArr3, objArrA0D, 0, i6, iA0O);
                    int i7 = 32 - i6;
                    Object[] objArrA0K = A0K(this.A04, i7);
                    int i8 = size - 1;
                    objArr2[i8] = objArrA0K;
                    A07(collection, objArrA0K, objArr2, i, i7, i8);
                }
            }
            A09(A0N(this.A03, objArr2, i2));
        }
        A0A(objArrA0D);
        this.A01 = AIH.A0P(this, collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }
}
