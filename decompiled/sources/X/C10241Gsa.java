package X;

import X.Gt4;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* renamed from: X.Gsa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10241Gsa<T extends Gt4> extends ArrayList<T> {
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        for (int i = 0; i < size(); i++) {
            set((Gt4) unaryOperator.apply(get(i)), i);
        }
    }

    @Override // java.util.ArrayList
    public /* bridge */ /* synthetic */ Object clone() {
        AbstractCollection c10241Gsa;
        boolean z = this instanceof C10242Gsb;
        int size = size();
        if (z) {
            c10241Gsa = new C10242Gsb(size);
            Iterator<T> it = iterator();
            while (it.hasNext()) {
                c10241Gsa.add(((Gt3) it.next()).clone());
            }
        } else {
            c10241Gsa = new C10241Gsa(size);
            Iterator<T> it2 = iterator();
            while (it2.hasNext()) {
                c10241Gsa.add(it2.next().clone());
            }
        }
        return c10241Gsa;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public T remove(int i) {
        T t = (T) super.remove(i);
        Gt3 gt3 = t.A01;
        if (gt3 != null) {
            gt3.A0O(t);
        }
        return t;
    }

    /* JADX WARN: Incorrect types in method signature: (ITT;)TT; */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public Gt4 set(Gt4 gt4, int i) {
        C10293Gtx.A00(gt4);
        Gt4 gt42 = (Gt4) super.set(i, gt4);
        gt42.A0P(gt4);
        return gt42;
    }

    /* JADX WARN: Incorrect return type in method signature: ()LX/Gsa<TT;>; */
    public void A02() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            T next = it.next();
            Gt3 gt3 = next.A01;
            if (gt3 != null) {
                gt3.A0O(next);
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A02();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = super.indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate<? super T> predicate) {
        Iterator<T> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        Iterator<T> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return (String) stream().map(new C10651I0v(7)).collect(Gt5.A02(PairsDiscretionDocument.TERMINATOR));
    }
}
