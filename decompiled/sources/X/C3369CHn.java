package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.CHn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3369CHn implements Iterator<C3368CHm> {
    public C3368CHm A00;
    public boolean A01;
    public final ArrayDeque<CHu> A02 = BV4.A0s();
    public static final FileFilter A03 = new F5D(1);
    public static final Comparator<File> A05 = new C7572F4l(19);
    public static final Comparator<File> A04 = new C7572F4l(20);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C3368CHm c3368CHm;
        AbstractC3372CHq abstractC3372CHq;
        int i;
        if (!this.A01) {
            this.A01 = true;
            while (true) {
                ArrayDeque<CHu> arrayDeque = this.A02;
                c3368CHm = null;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                CHu first = arrayDeque.getFirst();
                abstractC3372CHq = first.A02;
                Iterator<AbstractC3372CHq> itA00 = first.A01;
                if (itA00 == null) {
                    itA00 = abstractC3372CHq.A00();
                    first.A01 = itA00;
                }
                if (itA00.hasNext()) {
                    first.A00++;
                    Iterator<AbstractC3372CHq> itA002 = first.A01;
                    if (itA002 == null) {
                        itA002 = abstractC3372CHq.A00();
                        first.A01 = itA002;
                    }
                    arrayDeque.addFirst(new CHu(itA002.next()));
                    if (first.A00 == 1) {
                        i = 1;
                        break;
                    }
                } else {
                    arrayDeque.removeFirst();
                    i = 3;
                    if (abstractC3372CHq instanceof AbstractC3371CHp) {
                        i = 2;
                    }
                }
            }
            c3368CHm = new C3368CHm(abstractC3372CHq, i);
            this.A00 = c3368CHm;
        }
        return this.A00 != null;
    }

    public C3369CHn(File file, boolean z) {
        C3373CHr c3373CHr = new C3373CHr(file, z);
        ((AbstractC3371CHp) c3373CHr).A00 = A03;
        Iterator<AbstractC3372CHq> itA00 = c3373CHr.A00();
        while (itA00.hasNext()) {
            this.A02.addLast(new CHu(itA00.next()));
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ C3368CHm next() {
        if (!hasNext()) {
            throw BV4.A0T();
        }
        C3368CHm c3368CHm = this.A00;
        this.A00 = null;
        this.A01 = false;
        return c3368CHm;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
