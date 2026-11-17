package X;

import java.util.ListIterator;

/* renamed from: X.AHy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0922AHy implements ListIterator<AbstractC1439Aj8>, BOA {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ C0923AHz A03;

    public C0922AHy(C0923AHz c0923AHz, int i, int i2, int i3) {
        this.A03 = c0923AHz;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return C8j4.A1V(this.A00, this.A02);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0912AHo<Object> c0912AHo = this.A03.A02;
        int i = this.A00;
        this.A00 = i + 1;
        Object objA03 = c0912AHo.A03(i);
        C7384Etj.A0Z(objA03, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return objA03;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00 - this.A02;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Aj8, java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 previous() {
        C0912AHo<Object> c0912AHo = this.A03.A02;
        int i = this.A00 - 1;
        this.A00 = i;
        ?? A03 = c0912AHo.A03(i);
        C7384Etj.A0Z(A03, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return A03;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(AbstractC1439Aj8 abstractC1439Aj8) {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(AbstractC1439Aj8 abstractC1439Aj8) {
        throw C8j4.A10();
    }
}
