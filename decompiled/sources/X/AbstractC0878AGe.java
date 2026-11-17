package X;

import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: X.AGe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0878AGe extends AbstractC0879AGf {
    public static final <T> int A05(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC0885AGm.A13();
                throw F60.createAndThrow();
            }
        }
        return i;
    }

    public static final <T> C3b6<T> A06(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        return new C8iN(iterable, 0);
    }

    public static final <T extends Comparable<? super T>> T A07(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T extends Comparable<? super T>> T A08(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/List<+TT;>;I)TT; */
    public static final Object A0A(int i, List list) {
        C7384Etj.A0Y(list, 0);
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final <T> T A0B(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof List) {
            return (T) A0F((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T A0C(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T A0D(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (!it.hasNext()) {
                    return next;
                }
            }
        }
        return null;
    }

    public static final <T> T A0F(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T A0G(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T A0H(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static final <T> T A0I(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> T A0J(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw C60O.A0i("List has more than one element.");
    }

    public static final <T> T A0K(List<? extends T> list) {
        C7384Etj.A0Y(list, 0);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final String A0L(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, G0U g0u) {
        C7384Etj.A0Y(iterable, 0);
        C7384Etj.A0Y(charSequence, 1);
        StringBuilder sb = new StringBuilder();
        A0i(sb, charSequence, charSequence2, charSequence3, iterable, g0u);
        return sb.toString();
    }

    public static final <T> List<List<T>> A0N(Iterable<? extends T> iterable, int i) {
        ArrayList arrayListA0h;
        C7384Etj.A0Y(iterable, 0);
        if (i <= 0) {
            throw C60O.A0i(FGI.A0I("size ", i, " must be greater than zero."));
        }
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayListA0h = C60O.A11((size / i) + (C8j3.A1S(size % i) ? 1 : 0));
            int i2 = 0;
            while (i2 < size) {
                int i3 = size - i2;
                if (i <= i3) {
                    i3 = i;
                }
                ArrayList arrayListA11 = C60O.A11(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayListA11.add(list.get(i4 + i2));
                }
                arrayListA0h.add(arrayListA11);
                i2 += i;
                if (i2 < 0) {
                    break;
                }
            }
        } else {
            arrayListA0h = C3cG.A0h();
            Iterator<? extends T> it = iterable.iterator();
            C7384Etj.A0Y(it, 0);
            Iterator itA0C = !it.hasNext() ? A3p.A00 : BL3.A0C(new C0887AGo(it, null, i, i, false, true));
            while (itA0C.hasNext()) {
                arrayListA0h.add(itA0C.next());
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> A0P(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        C7384Etj.A0Y(collection, 1);
        if (!(collection instanceof Collection)) {
            ArrayList arrayList = new ArrayList((Collection) iterable);
            AbstractC0882AGj.A0r(collection, arrayList);
            return arrayList;
        }
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(iterable.size() + collection2.size());
        arrayList2.addAll(iterable);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/Collection<+TT;>;TT;)Ljava/util/List<TT;>; */
    public static final ArrayList A0Q(Object obj, Collection collection) {
        C7384Etj.A0Y(collection, 0);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final <T> List<T> A0R(Collection<? extends T> collection) {
        C7384Etj.A0Y(collection, 0);
        return new ArrayList(collection);
    }

    public static final <T> List<T> A0T(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        return A0X(A0f(iterable));
    }

    public static final <T> List<T> A0U(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        for (T t : iterable) {
            if (t != null) {
                arrayListA0h.add(t);
            }
        }
        return arrayListA0h;
    }

    public static final <T> List<T> A0V(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0X(iterable);
        }
        List<T> listA0Y = A0Y(iterable);
        Collections.reverse(listA0Y);
        return listA0Y;
    }

    public static final <T extends Comparable<? super T>> List<T> A0W(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (!(iterable instanceof Collection)) {
            List<T> listA0Y = A0Y(iterable);
            if (listA0Y.size() <= 1) {
                return listA0Y;
            }
            Collections.sort(listA0Y);
            return listA0Y;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return A0X(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C7384Etj.A0Y(array, 0);
        if (array.length > 1) {
            Arrays.sort(array);
        }
        return Arrays.asList(array);
    }

    public static final <T> List<T> A0X(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (!(iterable instanceof Collection)) {
            return AbstractC0885AGm.A10(A0Y(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C0881AGi.A00;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> List<T> A0Z(Iterable<? extends T> iterable, int i) {
        ArrayList arrayListA0h;
        Object next;
        C7384Etj.A0Y(iterable, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0I("Requested element count ", i, " is less than zero."));
        }
        if (i == 0) {
            return A0X(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return C0881AGi.A00;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    next = A0H((List) iterable);
                } else {
                    Iterator<? extends T> it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    do {
                        next = it.next();
                    } while (it.hasNext());
                }
                return Collections.singletonList(next);
            }
            arrayListA0h = C60O.A11(size);
            if (iterable instanceof List) {
                boolean z = iterable instanceof RandomAccess;
                List list = (List) iterable;
                if (z) {
                    int size2 = list.size();
                    while (i < size2) {
                        arrayListA0h.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = list.listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayListA0h.add(listIterator.next());
                    }
                }
                return arrayListA0h;
            }
        } else {
            arrayListA0h = C3cG.A0h();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayListA0h.add(t);
            } else {
                i2++;
            }
        }
        return AbstractC0885AGm.A10(arrayListA0h);
    }

    public static final <T> List<T> A0a(Iterable<? extends T> iterable, int i) {
        C7384Etj.A0Y(iterable, 0);
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0I("Requested element count ", i, " is less than zero."));
        }
        if (i == 0) {
            return C0881AGi.A00;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return A0X(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(A0B(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC0885AGm.A10(arrayList);
    }

    public static final <T> List<T> A0b(Iterable<? extends T> iterable, T t) {
        C7384Etj.A0Y(iterable, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(iterable);
        boolean z = false;
        for (T t2 : iterable) {
            if (z || !C7384Etj.areEqual(t2, t)) {
                arrayListA0i.add(t2);
            } else {
                z = true;
            }
        }
        return arrayListA0i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> A0c(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C7384Etj.A0Y(iterable, 0);
        C7384Etj.A0Y(comparator, 1);
        if (!(iterable instanceof Collection)) {
            List<T> listA0Y = A0Y(iterable);
            AbstractC06907md.A04(listA0Y, comparator);
            return listA0Y;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return A0X(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C7384Etj.A0Y(array, 0);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static final <T> List<T> A0d(List<? extends T> list, int i) {
        C7384Etj.A0Y(list, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0I("Requested element count ", i, " is less than zero."));
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return A0a(list, size);
    }

    public static final <T> List<T> A0e(List<? extends T> list, int i) {
        C7384Etj.A0Y(list, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0I("Requested element count ", i, " is less than zero."));
        }
        if (i == 0) {
            return C0881AGi.A00;
        }
        int size = list.size();
        if (i >= size) {
            return A0X(list);
        }
        if (i == 1) {
            return Collections.singletonList(A0H(list));
        }
        ArrayList arrayListA11 = C60O.A11(i);
        if (list instanceof RandomAccess) {
            int iA0G = size - i;
            while (iA0G < size) {
                iA0G = C8j4.A0G(arrayListA11, list, iA0G);
            }
            return arrayListA11;
        }
        ListIterator<? extends T> listIterator = list.listIterator(size - i);
        while (listIterator.hasNext()) {
            arrayListA11.add(listIterator.next());
        }
        return arrayListA11;
    }

    public static final <T> Set<T> A0f(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A0j(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> A0g(Iterable<? extends T> iterable) {
        Iterator it;
        Object next;
        C7384Etj.A0Y(iterable, 0);
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            A0j(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                if (size != 1) {
                    return linkedHashSet;
                }
                it = linkedHashSet.iterator();
                next = it.next();
            }
            return A3q.A00;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 != 0) {
            if (size2 != 1) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(AIW.A0H(collection.size()));
                A0j(iterable, linkedHashSet2);
                return linkedHashSet2;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                it = collection.iterator();
                next = it.next();
            }
        }
        return A3q.A00;
        return Collections.singleton(next);
    }

    public static final <T> Iterable<C2273BRq<T>> A0h(Iterable<? extends T> iterable) {
        C7384Etj.A0Y(iterable, 0);
        return new AbK(C2293BSt.A00(iterable, 40));
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;A::Ljava/lang/Appendable;>(Ljava/lang/Iterable<+TT;>;TA;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LX/G0U<-TT;+Ljava/lang/CharSequence;>;)TA; */
    public static final void A0i(Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, G0U g0u) {
        C7384Etj.A0Y(iterable, 0);
        appendable.append(charSequence2);
        int i = 0;
        for (T t : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            BMv.A13(appendable, t, g0u);
        }
        appendable.append(charSequence3);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;C::Ljava/util/Collection<-TT;>;>(Ljava/lang/Iterable<+TT;>;TC;)TC; */
    public static final void A0j(Iterable iterable, Collection collection) {
        C7384Etj.A0Y(iterable, 0);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final <T> boolean A0k(Iterable<? extends T> iterable, T t) {
        C7384Etj.A0Y(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t) >= 0;
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            if (C7384Etj.areEqual(t, t2)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static final byte[] A0l(Collection<Byte> collection) {
        C7384Etj.A0Y(collection, 0);
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final int[] A0n(Collection<Integer> collection) {
        C7384Etj.A0Y(collection, 0);
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static final <T> T A0E(Iterable<? extends T> iterable, int i) {
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        if (i >= 0) {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
        }
        throw new IndexOutOfBoundsException(FGI.A0G("Collection doesn't contain element at index ", '.', i));
    }

    public static final <T> List<T> A0Y(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return A0R((Collection) iterable);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        A0j(iterable, arrayListA0h);
        return arrayListA0h;
    }

    public static final <T extends Comparable<? super T>> T A09(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static String A0M(List list) {
        AuraInline.Custom custom;
        InlineMathPayload inlineMathPayload;
        Object objA0K = A0K(list);
        if (!(objA0K instanceof AuraInline.Custom) || (custom = (AuraInline.Custom) objA0K) == null || !AuraCustomInlineNames.MATH.equals(custom.name)) {
            return null;
        }
        Object obj = custom.payload;
        if (!(obj instanceof InlineMathPayload) || (inlineMathPayload = (InlineMathPayload) obj) == null) {
            return null;
        }
        return inlineMathPayload.expression;
    }

    public static final <T, R> List<HxE<T, R>> A0O(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        AnonymousClass003.A0u(iterable, iterable2);
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayListA11 = C60O.A11(Math.min(Hr7.A1D(iterable, 10), Hr7.A1D(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            AnonymousClass002.A1J(it.next(), it2.next(), arrayListA11);
        }
        return arrayListA11;
    }

    public static final <T> Set<T> A0S(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        AnonymousClass003.A0u(iterable, iterable2);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0X(iterable2);
        }
        Collection collection = (Collection) iterable2;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (T t : iterable) {
            if (collection.contains(t)) {
                linkedHashSetA0k.add(t);
            }
        }
        return linkedHashSetA0k;
    }

    public static final float[] A0m(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static final long[] A0o(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = C3cG.A05(it.next());
            i++;
        }
        return jArr;
    }
}
