package X;

/* loaded from: classes4.dex */
public final class AH9<E> extends AH7<E> implements AHC<E> {
    public int A00;
    public final int A01;
    public final AHC<E> A02;

    public static final void A05(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
        }
        if (i > i2) {
            throw C8j3.A0v("fromIndex: ", " > toIndex: ", i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AH9(AHC<? extends E> ahc, int i, int i2) {
        this.A02 = ahc;
        this.A01 = i;
        A05(i, i2, ahc.size());
        this.A00 = i2 - i;
    }
}
