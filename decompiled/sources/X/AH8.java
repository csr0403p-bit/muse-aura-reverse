package X;

/* loaded from: classes4.dex */
public final class AH8<E> extends AH7<E> implements AHD<E> {
    public int A00;
    public final int A01;
    public final AHD<E> A02;

    /* JADX WARN: Multi-variable type inference failed */
    public AH8(AHD<? extends E> ahd, int i, int i2) {
        C7384Etj.A0Y(ahd, 0);
        this.A02 = ahd;
        this.A01 = i;
        A05(i, i2, ahd.size());
        this.A00 = i2 - i;
    }

    public static final void A05(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
        }
        if (i > i2) {
            throw C8j3.A0v("fromIndex: ", " > toIndex: ", i, i2);
        }
    }

    @Override // X.AHD
    public final AHD<E> AgX(int i, int i2) {
        A05(i, i2, this.A00);
        AHD<E> ahd = this.A02;
        int i3 = this.A01;
        return new AH8(ahd, i + i3, i3 + i2);
    }
}
