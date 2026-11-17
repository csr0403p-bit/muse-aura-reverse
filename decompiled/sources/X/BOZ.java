package X;

import java.util.Iterator;
import kotlin.Unit;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes4.dex */
public final class BOZ<T> implements Iterator<T>, HtJ<Unit>, BOA {
    public int A00;
    public Iterator<? extends T> A01;
    public HtJ<? super Unit> A02;
    public T A03;

    public final Object A00(T t, HtJ<? super Unit> htJ) {
        this.A03 = t;
        this.A00 = 3;
        this.A02 = htJ;
        return EnumC10460Hji.A02;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return C6ys.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw C3cG.A0Q("Iterator has failed.");
                }
                Iterator<? extends T> it = this.A01;
                C7384Etj.A0X(it);
                if (it.hasNext()) {
                    this.A00 = 2;
                    return true;
                }
                this.A01 = null;
            }
            this.A00 = 5;
            HtJ<? super Unit> htJ = this.A02;
            C7384Etj.A0X(htJ);
            this.A02 = null;
            htJ.resumeWith(Unit.INSTANCE);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw C8j3.A1D();
        }
        if (i == 2) {
            this.A00 = 1;
            Iterator<? extends T> it = this.A01;
            C7384Etj.A0X(it);
            return it.next();
        }
        if (i != 3) {
            if (i != 4) {
                throw C3cG.A0Q("Iterator has failed.");
            }
            throw C8j3.A1D();
        }
        this.A00 = 0;
        T t = this.A03;
        this.A03 = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        Hwg.A00(obj);
        this.A00 = 4;
    }

    public BOZ(int i) {
    }

    public BOZ() {
    }
}
