package X;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class GI1 extends AbstractC9408GHx {
    @Override // X.AbstractC9408GHx
    public final double A00(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    @Override // X.AbstractC9408GHx
    public final float A01(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    @Override // X.AbstractC9408GHx
    public final void A07(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    @Override // X.AbstractC9408GHx
    public final void A08(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    @Override // X.AbstractC9408GHx
    public final void A0C(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    @Override // X.AbstractC9408GHx
    public final boolean A0F() {
        if (!super.A0F()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            AbstractC9404GHt.A04(th);
            return false;
        }
    }

    @Override // X.AbstractC9408GHx
    public final boolean A0G(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    @Override // X.AbstractC9408GHx
    public final boolean A0E() {
        if (!super.A0E()) {
            return false;
        }
        try {
            Class<?> cls = this.A00.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC9404GHt.A04(th);
            return false;
        }
    }

    public GI1(Unsafe unsafe) {
        super(unsafe);
    }
}
