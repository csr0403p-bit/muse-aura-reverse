package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.GGb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9365GGb {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return C9400GHp.A01.A00.getObject(obj, j);
    }

    public byte A01(Object obj, long j) {
        boolean z = this instanceof GID;
        boolean z2 = C9400GHp.A08;
        int i = C9400GHp.A01.A00.getInt(obj, (-4) & j);
        return z ? z2 ? AbstractC7611F5y.A00(i, j ^ (-1)) : AbstractC7611F5y.A00(i, j) : z2 ? AbstractC7611F5y.A00(i, j ^ (-1)) : AbstractC7611F5y.A00(i, j);
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A04(Class<?> cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A05(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A06(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A07(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;)I */
    public final void A08(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A09(Object obj, long j, byte b) {
        boolean z = C9400GHp.A08;
        long j2 = (-4) & j;
        int iA05 = C9400GHp.A01.A05(obj, j2);
        int i = (int) j;
        if (z) {
            C9400GHp.A05(obj, j2, AbstractC7611F5y.A07(i ^ (-1), iA05, b));
        } else {
            C9400GHp.A05(obj, j2, AbstractC7611F5y.A07(i, iA05, b));
        }
    }

    public final void A0C(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0D(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0E(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0F(Object obj, long j, boolean z) {
        boolean z2 = C9400GHp.A08;
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int iA05 = C9400GHp.A01.A05(obj, j2);
        int i = (int) j;
        if (z2) {
            C9400GHp.A05(obj, j2, AbstractC7611F5y.A07(i ^ (-1), iA05, b));
        } else {
            C9400GHp.A05(obj, j2, AbstractC7611F5y.A07(i, iA05, b));
        }
    }

    public final void A0G(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public boolean A0H(Object obj, long j) {
        boolean z = this instanceof GID;
        boolean z2 = C9400GHp.A08;
        int i = C9400GHp.A01.A00.getInt(obj, (-4) & j);
        if (z) {
            return AnonymousClass002.A1L(z2 ? AbstractC7611F5y.A00(i, j ^ (-1)) : AbstractC7611F5y.A00(i, j));
        }
        return AnonymousClass002.A1L(z2 ? AbstractC7611F5y.A00(i, j ^ (-1)) : AbstractC7611F5y.A00(i, j));
    }

    public AbstractC9365GGb(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0A(Object obj, long j, double d) {
        A0D(obj, j, Double.doubleToLongBits(d));
    }

    public void A0B(Object obj, long j, float f) {
        A0C(obj, j, Float.floatToIntBits(f));
    }
}
