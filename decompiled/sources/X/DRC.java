package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class DRC extends DRD implements List {
    public final /* synthetic */ Ce3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRC(DRD drd, Ce3 ce3, Object obj, List list) {
        super(drd, ce3, obj, list);
        this.A00 = ce3;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        A01();
        boolean zIsEmpty = super.A00.isEmpty();
        ((List) super.A00).add(i, obj);
        this.A00.A00++;
        if (zIsEmpty) {
            A00();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) super.A00).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = super.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        A00();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        A01();
        return ((List) super.A00).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        A01();
        return ((List) super.A00).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        A01();
        return ((List) super.A00).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        A01();
        return new DRE(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        A01();
        Object objRemove = ((List) super.A00).remove(i);
        Ce3 ce3 = this.A00;
        ce3.A00--;
        A02();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        A01();
        return ((List) super.A00).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        A01();
        Ce3 ce3 = this.A00;
        Object obj = this.A02;
        List listSubList = ((List) super.A00).subList(i, i2);
        DRD drd = this.A01;
        if (drd == null) {
            drd = this;
        }
        return listSubList instanceof RandomAccess ? new C3740Cdd(drd, ce3, obj, listSubList) : new DRC(drd, ce3, obj, listSubList);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        A01();
        return new DRE(this);
    }
}
