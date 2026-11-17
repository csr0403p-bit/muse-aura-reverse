package com.sun.jna;

import X.BV5;
import X.C3cG;
import X.C60O;
import X.C8j3;

/* loaded from: classes5.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    public static final long serialVersionUID = 1;
    public Number number;
    public int size;
    public boolean unsigned;
    public long value;

    public IntegerType(int i) {
        this(i, 0L, false);
    }

    public static <T extends IntegerType> int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return compare(t.value, t2.value);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof IntegerType) && this.number.equals(((IntegerType) obj).number);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long jA05 = obj == null ? 0L : C3cG.A05(obj);
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(jA05);
        return integerType;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    public void setValue(long j) {
        long j2;
        Number numberValueOf;
        this.value = j;
        int i = this.size;
        if (i == 1) {
            if (this.unsigned) {
                this.value = 255 & j;
            }
            byte b = (byte) j;
            j2 = b;
            numberValueOf = Byte.valueOf(b);
        } else if (i == 2) {
            if (this.unsigned) {
                this.value = 65535 & j;
            }
            short s = (short) j;
            j2 = s;
            numberValueOf = Short.valueOf(s);
        } else if (i != 4) {
            if (i != 8) {
                throw BV5.A0Q("Unsupported size: ", i);
            }
            this.number = Long.valueOf(j);
            return;
        } else {
            if (this.unsigned) {
                this.value = 4294967295L & j;
            }
            int i2 = (int) j;
            j2 = i2;
            numberValueOf = Integer.valueOf(i2);
        }
        this.number = numberValueOf;
        long j3 = (-1) ^ ((1 << (i * 8)) - 1);
        if ((j >= 0 || j2 == j) && (j < 0 || (j3 & j) == 0)) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Argument value 0x");
        sbA0x.append(Long.toHexString(j));
        sbA0x.append(" exceeds native capacity (");
        sbA0x.append(i);
        sbA0x.append(" bytes) mask=0x");
        throw C8j3.A0w(Long.toHexString(j3), sbA0x);
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public String toString() {
        return this.number.toString();
    }

    public IntegerType(int i, long j, boolean z) {
        this.size = i;
        this.unsigned = z;
        setValue(j);
    }

    public static final int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        if (j >= j2) {
            return 1;
        }
        return -1;
    }

    public IntegerType(int i, boolean z) {
        this(i, 0L, z);
    }

    public static int compare(IntegerType integerType, long j) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.value, j);
    }

    public IntegerType(int i, long j) {
        this(i, j, false);
    }
}
