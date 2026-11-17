package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AHT<E> extends AHE<E> implements AHC<E> {
    public static final AHT A01 = new AHT(new Object[0]);
    public final Object[] A00;

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.length;
    }

    @Override // X.InterfaceC0900AHc
    public final AHV A5a() {
        return new AHV(this, null, this.A00, 0);
    }

    @Override // X.InterfaceC0900AHc
    public final InterfaceC0900AHc<E> Aag(G0U<? super E, Boolean> g0u) {
        Object[] objArrA1a = this.A00;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArrA1a[i];
            if (AnonymousClass003.A1X(obj, g0u)) {
                if (!z) {
                    objArrA1a = C8j3.A1a(objArrA1a, objArrA1a.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrA1a[size] = obj;
                size++;
            }
        }
        return size != size() ? size == 0 ? A01 : new AHT(AbstractC0903AHf.A08(objArrA1a, 0, size)) : this;
    }

    @Override // X.AH7, java.util.List
    public final int indexOf(Object obj) {
        return BFI.A09(this.A00, obj);
    }

    @Override // X.AH7, java.util.List
    public final int lastIndexOf(Object obj) {
        return BFI.A0A(this.A00, obj);
    }

    public AHT(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.InterfaceC0900AHc
    public final InterfaceC0900AHc<E> A33(E e) {
        if (size() >= 32) {
            Object[] objArr = new Object[32];
            objArr[0] = e;
            return new AHU(this.A00, objArr, size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.A00, size() + 1);
        C7384Etj.A0U(objArrCopyOf);
        objArrCopyOf[size()] = e;
        return new AHT(objArrCopyOf);
    }

    /* JADX WARN: Incorrect types in method signature: (ITE;)LX/AHc<TE;>; */
    @Override // X.InterfaceC0900AHc
    public final InterfaceC0900AHc A3C(Object obj, int i) {
        AHA.A01(i, size());
        if (i == size()) {
            return A33(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[size() + 1];
            Object[] objArr2 = this.A00;
            AbstractC0903AHf.A05(objArr2, objArr, 0, 0, i);
            AbstractC0903AHf.A05(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new AHT(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr3, objArr3.length);
        System.arraycopy(objArr3, i, objArrA1a, i + 1, (size() - 1) - i);
        objArrA1a[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new AHU(objArrA1a, objArr4, size() + 1, 0);
    }

    @Override // X.AHE, X.InterfaceC0900AHc
    public final InterfaceC0900AHc<E> A3L(Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            AHV ahvA5a = A5a();
            ahvA5a.addAll(collection);
            return ahvA5a.A0U();
        }
        Object[] objArrA1a = C8j3.A1a(this.A00, size() + collection.size());
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrA1a[size] = it.next();
            size++;
        }
        return new AHT(objArrA1a);
    }

    @Override // X.InterfaceC0900AHc
    public final InterfaceC0900AHc<E> Aal(int i) {
        AHA.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr, size() - 1);
        AbstractC0903AHf.A05(objArr, objArrA1a, i, i + 1, size());
        return new AHT(objArrA1a);
    }

    /* JADX WARN: Incorrect types in method signature: (ITE;)LX/AHc<TE;>; */
    @Override // X.InterfaceC0900AHc
    public final InterfaceC0900AHc Acc(Object obj, int i) {
        AHA.A00(i, size());
        Object[] objArr = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr, objArr.length);
        objArrA1a[i] = obj;
        return new AHT(objArrA1a);
    }

    @Override // X.AH7, java.util.List
    public final E get(int i) {
        AHA.A00(i, size());
        return (E) this.A00[i];
    }

    @Override // X.AH7, java.util.List
    public final ListIterator<E> listIterator(int i) {
        AHA.A01(i, size());
        return new C0898AHa(this.A00, i, size());
    }
}
