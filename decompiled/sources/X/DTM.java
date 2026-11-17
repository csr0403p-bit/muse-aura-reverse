package X;

import X.InterfaceC5064DTa;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DTM<E extends InterfaceC5064DTa<E>> extends AbstractCollection<E> implements Deque<E> {
    public E A00;
    public E A01;

    public final boolean A04(InterfaceC5064DTa<?> interfaceC5064DTa) {
        DTP dtp = (DTP) interfaceC5064DTa;
        return (dtp.prev == null && dtp.next == null && interfaceC5064DTa != this.A00) ? false : true;
    }

    private final void A01(E e) {
        E e2 = this.A00;
        this.A00 = e;
        if (e2 == null) {
            this.A01 = e;
            return;
        }
        DTP<K, V> dtp = (DTP) e2;
        DTP<K, V> dtp2 = (DTP) e;
        dtp.prev = dtp2;
        dtp2.next = dtp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(InterfaceC5064DTa interfaceC5064DTa, DTM dtm) {
        E e = dtm.A01;
        dtm.A01 = interfaceC5064DTa;
        if (e == null) {
            dtm.A00 = interfaceC5064DTa;
            return;
        }
        DTP<K, V> dtp = (DTP) e;
        DTP<K, V> dtp2 = (DTP) interfaceC5064DTa;
        dtp.next = dtp2;
        dtp2.prev = dtp;
    }

    public static final void A03(InterfaceC5064DTa interfaceC5064DTa, DTM dtm) {
        DTP dtp = (DTP) interfaceC5064DTa;
        DTP<K, V> dtp2 = (E) dtp.prev;
        DTP<K, V> dtp3 = (E) dtp.next;
        if (dtp2 == 0) {
            dtm.A00 = dtp3;
        } else {
            dtp2.next = dtp3;
            dtp.prev = null;
        }
        if (dtp3 == 0) {
            dtm.A01 = dtp2;
        } else {
            dtp3.prev = dtp2;
            dtp.next = null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            return false;
        }
        A02(interfaceC5064DTa, this);
        return true;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            throw BV4.A0P();
        }
        A01(interfaceC5064DTa);
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            throw BV4.A0P();
        }
        A02(interfaceC5064DTa, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        E e = this.A00;
        while (e != null) {
            DTP dtp = (DTP) e;
            E e2 = dtp.next;
            dtp.prev = null;
            dtp.next = null;
            e = e2;
        }
        this.A01 = null;
        this.A00 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        return (obj instanceof InterfaceC5064DTa) && A04((InterfaceC5064DTa) obj);
    }

    @Override // java.util.Deque
    public final Iterator<E> descendingIterator() {
        return new DTT(this.A01, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1Y(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator<E> iterator() {
        return new DTV(this.A00, this);
    }

    @Override // java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            return false;
        }
        A02(interfaceC5064DTa, this);
        return true;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ boolean offerFirst(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            return false;
        }
        A01(interfaceC5064DTa);
        return true;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ boolean offerLast(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            return false;
        }
        A02(interfaceC5064DTa, this);
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ Object peek() {
        return this.A00;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object peekFirst() {
        return this.A00;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object peekLast() {
        return this.A01;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ void push(Object obj) {
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (A04(interfaceC5064DTa)) {
            throw BV4.A0P();
        }
        A01(interfaceC5064DTa);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        if (!(obj instanceof InterfaceC5064DTa)) {
            return false;
        }
        InterfaceC5064DTa<?> interfaceC5064DTa = (InterfaceC5064DTa) obj;
        if (!A04(interfaceC5064DTa)) {
            return false;
        }
        A03(interfaceC5064DTa, this);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        int i = 0;
        for (DTP dtp = this.A00; dtp != null; dtp = dtp.next) {
            i++;
        }
        return i;
    }

    private final void A00() {
        if (isEmpty()) {
            throw C8j3.A1D();
        }
    }

    @Override // java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ Object element() {
        A00();
        return this.A00;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object getFirst() {
        A00();
        return this.A00;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object getLast() {
        A00();
        return this.A01;
    }

    @Override // java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        return BV8.A0f(this);
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object pollFirst() {
        return BV8.A0f(this);
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object pollLast() {
        if (isEmpty()) {
            return null;
        }
        E e = this.A01;
        DTP dtp = (DTP) e;
        DTP dtp2 = dtp.prev;
        dtp.prev = null;
        this.A01 = dtp2;
        if (dtp2 == null) {
            this.A00 = null;
            return e;
        }
        dtp2.next = null;
        return e;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object pop() {
        A00();
        return BV8.A0f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object removeFirst() {
        A00();
        return BV8.A0f(this);
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public final /* bridge */ /* synthetic */ Object removeLast() {
        A00();
        if (isEmpty()) {
            return null;
        }
        E e = this.A01;
        DTP dtp = (DTP) e;
        DTP dtp2 = dtp.prev;
        dtp.prev = null;
        this.A01 = dtp2;
        if (dtp2 == null) {
            this.A00 = null;
            return e;
        }
        dtp2.next = null;
        return e;
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque, java.util.Queue
    public final /* bridge */ /* synthetic */ Object remove() {
        A00();
        return BV8.A0f(this);
    }
}
