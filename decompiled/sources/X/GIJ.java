package X;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class GIJ extends AbstractC9365GGb {
    @Override // X.AbstractC9365GGb
    public final byte A01(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    @Override // X.AbstractC9365GGb
    public final double A02(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    @Override // X.AbstractC9365GGb
    public final float A03(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    @Override // X.AbstractC9365GGb
    public final void A09(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    @Override // X.AbstractC9365GGb
    public final void A0A(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    @Override // X.AbstractC9365GGb
    public final void A0B(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    @Override // X.AbstractC9365GGb
    public final void A0F(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    @Override // X.AbstractC9365GGb
    public final boolean A0H(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public GIJ(Unsafe unsafe) {
        super(unsafe);
    }
}
