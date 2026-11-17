package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class DR8 extends DR9 implements List {
    public final /* synthetic */ AbstractC3759Cdw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DR8(DR9 dr9, AbstractC3759Cdw abstractC3759Cdw, Object obj, List list) {
        super(dr9, abstractC3759Cdw, obj, list);
        this.A00 = abstractC3759Cdw;
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
        return new DRA(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        A01();
        Object objRemove = ((List) super.A00).remove(i);
        AbstractC3759Cdw abstractC3759Cdw = this.A00;
        abstractC3759Cdw.A00--;
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
        AbstractC3759Cdw abstractC3759Cdw = this.A00;
        Object obj = this.A02;
        List listSubList = ((List) super.A00).subList(i, i2);
        DR9 dr9 = this.A01;
        if (dr9 == null) {
            dr9 = this;
        }
        return listSubList instanceof RandomAccess ? new C3735CdY(dr9, abstractC3759Cdw, obj, listSubList) : new DR8(dr9, abstractC3759Cdw, obj, listSubList);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        A01();
        return new DRA(this);
    }
}
