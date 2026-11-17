package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BT4 implements Iterator, BOA {
    public final int $t = 3;
    public int A00;
    public final Object A01;

    public BT4(A3b<T> a3b) {
        this.A00 = a3b.A00;
        this.A01 = a3b.A01.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$t) {
            case 0:
                return this.A00 < ((ViewGroup) this.A01).getChildCount();
            case 1:
                break;
            case 2:
                return this.A00 > 0 && ((Iterator) this.A01).hasNext();
            default:
                return this.A00 > 0;
        }
        while (this.A00 > 0) {
            Iterator it = (Iterator) this.A01;
            if (!it.hasNext()) {
                return ((Iterator) this.A01).hasNext();
            }
            it.next();
            this.A00--;
        }
        return ((Iterator) this.A01).hasNext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ T next() {
        switch (this.$t) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                int i = this.A00;
                this.A00 = i + 1;
                ?? childAt = viewGroup.getChildAt(i);
                if (childAt == 0) {
                    throw new IndexOutOfBoundsException();
                }
                return childAt;
            case 1:
                while (this.A00 > 0) {
                    Iterator it = (Iterator) this.A01;
                    if (!it.hasNext()) {
                        return ((Iterator) this.A01).next();
                    }
                    it.next();
                    this.A00--;
                }
                return ((Iterator) this.A01).next();
            case 2:
                int i2 = this.A00;
                if (i2 == 0) {
                    throw C8j3.A1D();
                }
                this.A00 = i2 - 1;
                return ((Iterator) this.A01).next();
            default:
                C9iZ c9iZ = (C9iZ) this.A01;
                int iAF6 = c9iZ.AF6();
                int i3 = this.A00;
                this.A00 = i3 - 1;
                return c9iZ.AF5(iAF6 - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$t) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                int i = this.A00 - 1;
                this.A00 = i;
                viewGroup.removeViewAt(i);
                return;
            case 1:
                throw C8j4.A10();
            case 2:
                throw C8j4.A10();
            default:
                throw C8j4.A10();
        }
    }

    public BT4(A3c<T> a3c) {
        this.A01 = a3c.A01.iterator();
        this.A00 = a3c.A00;
    }

    public BT4(C9iZ c9iZ) {
        this.A01 = c9iZ;
        this.A00 = c9iZ.AF6();
    }

    public BT4(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }
}
