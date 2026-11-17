package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class DOI<E> extends DOJ<E> {
    public int A00;
    public boolean A01;
    public Object[] A02;

    @Override // X.DOJ
    public DOJ<E> add(E... elements) {
        int length = elements.length;
        Eu2.A00(length, elements);
        A01(this, length);
        System.arraycopy(elements, 0, this.A02, this.A00, length);
        this.A00 += length;
        return this;
    }

    public static void A01(DOI doi, int i) {
        Object[] objArr = doi.A02;
        int length = objArr.length;
        int iA02 = DOJ.A02(length, doi.A00 + i);
        if (iA02 > length || doi.A01) {
            doi.A02 = Arrays.copyOf(objArr, iA02);
            doi.A01 = false;
        }
    }

    @Override // X.DOJ
    public DOI<E> add(E element) {
        element.getClass();
        A01(this, 1);
        Object[] objArr = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        objArr[i] = element;
        return this;
    }

    @Override // X.DOJ
    public /* bridge */ /* synthetic */ DOJ add(Object element) {
        throw F60.createAndThrow();
    }
}
