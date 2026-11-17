package X;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class F5O implements Iterator {
    public final int $t = 1;
    public Object A00;
    public final Object A01;

    public F5O(HwJ hwJ) {
        this.A01 = hwJ;
        this.A00 = hwJ.A00.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((Iterator) (this.$t != 0 ? this.A01 : this.A00)).hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.$t == 0) {
            return ((Iterator) this.A00).next();
        }
        AbstractC3371CHp abstractC3371CHp = (AbstractC3371CHp) this.A00;
        File file = (File) ((Iterator) this.A01).next();
        if (abstractC3371CHp instanceof C3374CHs) {
            C3370CHo c3370CHo = new C3370CHo(file, abstractC3371CHp.A02);
            ((AbstractC3371CHp) c3370CHo).A00 = C3369CHn.A03;
            return c3370CHo;
        }
        if (abstractC3371CHp instanceof C3375CHt) {
            C3374CHs c3374CHs = new C3374CHs(file, abstractC3371CHp.A02);
            ((AbstractC3371CHp) c3374CHs).A00 = C3369CHn.A03;
            return c3374CHs;
        }
        if (abstractC3371CHp instanceof C3373CHr) {
            C3375CHt c3375CHt = new C3375CHt(file, abstractC3371CHp.A02);
            ((AbstractC3371CHp) c3375CHt).A00 = C3369CHn.A03;
            return c3375CHt;
        }
        if (abstractC3371CHp instanceof C3376CHv) {
            return new CHx(file);
        }
        C3376CHv c3376CHv = new C3376CHv(file, abstractC3371CHp.A02);
        ((AbstractC3371CHp) c3376CHv).A00 = CEe.A00;
        return c3376CHv;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$t == 0) {
            throw C8j3.A17();
        }
        ((Iterator) this.A01).remove();
        throw null;
    }

    public F5O(AbstractC3371CHp abstractC3371CHp, Iterator it) {
        this.A01 = it;
        this.A00 = abstractC3371CHp;
    }
}
