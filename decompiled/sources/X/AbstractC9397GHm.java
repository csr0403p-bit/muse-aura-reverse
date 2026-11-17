package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.GHm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9397GHm {
    public Unsafe A00;

    public byte A00(Object target, long offset) {
        boolean z = this instanceof GIA;
        boolean z2 = C9401GHq.A06;
        int i = C9401GHq.A01.A00.getInt(target, (-4) & offset);
        return z ? z2 ? AbstractC7611F5y.A00(i, offset ^ (-1)) : AbstractC7611F5y.A00(i, offset) : z2 ? AbstractC7611F5y.A00(i, offset ^ (-1)) : AbstractC7611F5y.A00(i, offset);
    }

    public double A01(Object target, long offset) {
        return Double.longBitsToDouble(this.A00.getLong(target, offset));
    }

    public float A02(Object target, long offset) {
        return Float.intBitsToFloat(this.A00.getInt(target, offset));
    }

    public final int A03(Class<?> clazz) {
        return this.A00.arrayBaseOffset(clazz);
    }

    public final int A04(Object target, long offset) {
        return this.A00.getInt(target, offset);
    }

    public final long A05(Object target, long offset) {
        return this.A00.getLong(target, offset);
    }

    public final Object A06(Object target, long offset) {
        return this.A00.getObject(target, offset);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;)I */
    public final void A07(Class clazz) {
        this.A00.arrayIndexScale(clazz);
    }

    public void A08(Object target, long offset, byte value) {
        boolean z = C9401GHq.A06;
        long j = (-4) & offset;
        AbstractC9397GHm abstractC9397GHm = C9401GHq.A01;
        int iA04 = abstractC9397GHm.A04(target, j);
        if (z) {
            abstractC9397GHm.A0B(target, j, AbstractC7611F5y.A07(((int) offset) ^ (-1), iA04, value));
        } else {
            abstractC9397GHm.A0B(target, j, AbstractC7611F5y.A07((int) offset, iA04, value));
        }
    }

    public final void A0B(Object target, long offset, int value) {
        this.A00.putInt(target, offset, value);
    }

    public final void A0C(Object target, long offset, long value) {
        this.A00.putLong(target, offset, value);
    }

    public final void A0D(Object target, long offset, Object value) {
        this.A00.putObject(target, offset, value);
    }

    public void A0E(Object obj, long j, boolean z) {
        boolean z2 = C9401GHq.A06;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        AbstractC9397GHm abstractC9397GHm = C9401GHq.A01;
        int iA04 = abstractC9397GHm.A04(obj, j2);
        if (z2) {
            abstractC9397GHm.A0B(obj, j2, AbstractC7611F5y.A07(((int) j) ^ (-1), iA04, b));
        } else {
            abstractC9397GHm.A0B(obj, j2, AbstractC7611F5y.A07((int) j, iA04, b));
        }
    }

    public final void A0F(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0G() {
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
            C9401GHq.A04(th);
            return false;
        }
    }

    public boolean A0H() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return C9401GHq.A02() != null;
        } catch (Throwable th) {
            C9401GHq.A04(th);
            return false;
        }
    }

    public boolean A0I(Object target, long offset) {
        boolean z = this instanceof GIA;
        boolean z2 = C9401GHq.A06;
        int i = C9401GHq.A01.A00.getInt(target, (-4) & offset);
        if (z) {
            return AnonymousClass002.A1L(z2 ? AbstractC7611F5y.A00(i, offset ^ (-1)) : AbstractC7611F5y.A00(i, offset));
        }
        return AnonymousClass002.A1L(z2 ? AbstractC7611F5y.A00(i, offset ^ (-1)) : AbstractC7611F5y.A00(i, offset));
    }

    public AbstractC9397GHm(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A09(Object target, long offset, double value) {
        A0C(target, offset, Double.doubleToLongBits(value));
    }

    public void A0A(Object target, long offset, float value) {
        A0B(target, offset, Float.floatToIntBits(value));
    }
}
