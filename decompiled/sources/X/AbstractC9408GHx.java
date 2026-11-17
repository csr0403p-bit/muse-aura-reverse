package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

/* renamed from: X.GHx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9408GHx {
    public final Unsafe A00;

    public double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A02(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A03(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A04(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A05(Class cls) {
        this.A00.arrayBaseOffset(cls);
    }

    public final void A06(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public final void A09(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0A(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0B(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0C(Object obj, long j, boolean z) {
        boolean z2 = AbstractC9404GHt.A04;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        AbstractC9408GHx abstractC9408GHx = AbstractC9404GHt.A00;
        int i = abstractC9408GHx.A00.getInt(obj, j2);
        int i2 = (int) j;
        int i3 = i2 & 3;
        if (z2) {
            i3 = (i2 ^ (-1)) & 3;
        }
        int i4 = i3 << 3;
        abstractC9408GHx.A09(obj, j2, ((b & 255) << i4) | (((255 << i4) ^ (-1)) & i));
    }

    public final void A0D(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0E() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC9404GHt.A04(th);
            return false;
        }
    }

    public boolean A0F() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            boolean z = AbstractC9404GHt.A03;
            if (GEG.A00 != null && !GEG.A01) {
                try {
                    if (Buffer.class.getDeclaredField("effectiveDirectAddress") != null) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            try {
                Field declaredField = Buffer.class.getDeclaredField("address");
                if (declaredField != null) {
                    if (declaredField.getType() == cls2) {
                        return true;
                    }
                }
            } catch (Throwable unused2) {
            }
            return false;
        } catch (Throwable th) {
            AbstractC9404GHt.A04(th);
            return false;
        }
    }

    public boolean A0G(Object obj, long j) {
        boolean z = AbstractC9404GHt.A04;
        int i = AbstractC9404GHt.A00.A00.getInt(obj, (-4) & j);
        if (z) {
            j ^= -1;
        }
        return ((byte) ((i >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public AbstractC9408GHx(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A07(Object obj, long j, double d) {
        A0A(obj, j, Double.doubleToLongBits(d));
    }

    public void A08(Object obj, long j, float f) {
        A09(obj, j, Float.floatToIntBits(f));
    }
}
