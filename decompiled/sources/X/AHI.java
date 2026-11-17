package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public final class AHI<E> extends AHF<E> {
    public static final AHI A01 = new AHI(new Object[0]);
    public final Object[] A00;

    @Override // X.AHF, X.AHH
    @Deprecated(message = "Use addingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAll(elements)", imports = {}))
    public final AHH<E> A3M(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        if (collection.isEmpty()) {
            return this;
        }
        if (size() + collection.size() > 32) {
            AGK<E> agkA5c = A5c();
            agkA5c.addAll(collection);
            return agkA5c.A5R();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.A00, size() + collection.size());
        C7384Etj.A0U(objArrCopyOf);
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new AHI(objArrCopyOf);
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.length;
    }

    @Override // X.AHH
    public final AGK<E> A5c() {
        return new AHL(this, null, this.A00, 0);
    }

    @Override // X.AH7, java.util.List
    public final int indexOf(Object obj) {
        return BFI.A09(this.A00, obj);
    }

    @Override // X.AH7, java.util.List
    public final int lastIndexOf(Object obj) {
        return BFI.A0A(this.A00, obj);
    }

    public AHI(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.AHH
    @Deprecated(message = "Use adding() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "adding(element)", imports = {}))
    public final AHH<E> A34(E e) {
        if (size() < 32) {
            Object[] objArrA1a = C8j3.A1a(this.A00, size() + 1);
            objArrA1a[size()] = e;
            return new AHI(objArrA1a);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return new AHJ(this.A00, objArr, size() + 1, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (ITE;)LX/AHH<TE;>; */
    @Override // X.AHH
    @Deprecated(message = "Use addingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAt(index, element)", imports = {}))
    public final AHH A3D(Object obj, int i) {
        AHB.A01(i, size());
        if (i == size()) {
            return A34(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[size() + 1];
            Object[] objArr2 = this.A00;
            AbstractC0903AHf.A05(objArr2, objArr, 0, 0, i);
            AbstractC0903AHf.A05(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new AHI(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr3, objArr3.length);
        System.arraycopy(objArr3, i, objArrA1a, i + 1, (size() - 1) - i);
        objArrA1a[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new AHJ(objArrA1a, objArr4, size() + 1, 0);
    }

    @Override // X.AHH
    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(predicate)", imports = {}))
    public final AHH<E> Aaj(G0U<? super E, Boolean> g0u) {
        int size = size();
        int size2 = size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            if (AnonymousClass003.A1X(this.A00[i2], g0u)) {
                size--;
                i |= 1 << i2;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr, size);
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        int size3 = size();
        for (int i3 = iNumberOfTrailingZeros + 1; i3 < size3; i3++) {
            if (((i >>> i3) & 1) == 0) {
                objArrA1a[iNumberOfTrailingZeros] = objArr[i3];
                iNumberOfTrailingZeros++;
            }
        }
        return new AHI(objArrA1a);
    }

    @Override // X.AHH
    @Deprecated(message = "Use removingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAt(index)", imports = {}))
    public final AHH<E> Aam(int i) {
        AHB.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] objArrA1a = C8j3.A1a(objArr, size() - 1);
        AbstractC0903AHf.A05(objArr, objArrA1a, i, i + 1, size());
        return new AHI(objArrA1a);
    }

    @Override // X.AH7, java.util.List
    public final E get(int i) {
        AHB.A00(i, size());
        return (E) this.A00[i];
    }

    @Override // X.AH7, java.util.List
    public final ListIterator<E> listIterator(int i) {
        AHB.A01(i, size());
        return new AHQ(this.A00, i, size());
    }
}
