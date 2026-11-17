package X;

/* renamed from: X.FIw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7881FIw {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C7881FIw(Object obj, long j) {
        this(obj, (int) ((j >> 32) & 4294967295L), (int) (j & 4294967295L));
    }

    public C7881FIw(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            } else {
                throw BV5.A0Q("height must be >= 0, but was: ", i2);
            }
        }
        throw BV5.A0Q("width must be >= 0, but was: ", i);
    }
}
