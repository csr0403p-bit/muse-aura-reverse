package X;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class AH4<E> extends AH7<E> implements RandomAccess {
    public int A00;
    public final int A01;
    public final AH7<E> A02;

    /* JADX WARN: Multi-variable type inference failed */
    public AH4(AH7<? extends E> ah7, int i, int i2) {
        C7384Etj.A0Y(ah7, 0);
        this.A02 = ah7;
        this.A01 = i;
        AH7.A04(i, i2, ah7.size());
        this.A00 = i2 - i;
    }
}
