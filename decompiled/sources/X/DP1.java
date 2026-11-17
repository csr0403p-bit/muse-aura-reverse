package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DP1<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {
    public static final Object A03 = new DP3();
    public static final Object[] A04 = BV4.A1W();
    public static final long serialVersionUID = 0;
    public transient Object[] A02;
    public int mSize = 0;
    public transient int A00 = 0;
    public transient int A01 = 0;

    public DP1() {
        float f = 0.0f / 0.75f;
        int i = (int) f;
        if (i < 0) {
            throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("adjustedCapacity = %d, capacity = %d, LOAD_FACTOR = %s, (capacity / LOAD_FACTOR) = %s", Integer.valueOf(i), 0, Float.toString(0.75f), Float.toString(f)));
        }
        this.A02 = i == 0 ? A04 : new Object[i];
    }

    public static int A02(Object[] objArr, Object obj) {
        int length = objArr.length;
        int iA01 = A01(obj, length);
        int i = iA01;
        do {
            Object obj2 = objArr[i];
            if (obj2 == null || obj2 == obj || obj2.equals(obj)) {
                break;
            }
            i++;
            if (i == length) {
                i = 0;
            }
        } while (i != iA01);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.mSize = 0;
        Arrays.fill(this.A02, (Object) null);
        this.A00++;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    for (Object obj2 : this.A02) {
                        if (obj2 == null || set.contains(obj2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int iA00 = A00(this, -1);
        int iA0G = 0;
        while (iA00 >= 0) {
            iA0G = AnonymousClass005.A0G(this.A02[iA00], iA0G);
            iA00 = A00(this, iA00);
        }
        return iA0G;
    }

    public static final int A00(DP1 dp1, int i) {
        Object[] objArr;
        do {
            i++;
            objArr = dp1.A02;
            if (i >= objArr.length) {
                return Integer.MIN_VALUE;
            }
        } while (objArr[i] == null);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (this.mSize >= this.A01) {
            this.A00++;
            Object[] objArr = this.A02;
            int length = objArr.length * 2;
            int i = length != 0 ? length : 2;
            Object[] objArr2 = new Object[i];
            for (Object obj : objArr) {
                if (obj != null) {
                    objArr2[A02(objArr2, obj)] = obj;
                }
            }
            this.A02 = objArr2;
            this.A01 = (int) (i * 0.75f);
        }
        if (e == null) {
            e = (E) A03;
        }
        int length2 = this.A02.length;
        int iA01 = A01(e, length2);
        while (true) {
            Object[] objArr3 = this.A02;
            Object obj2 = objArr3[iA01];
            if (obj2 == null) {
                this.mSize++;
                this.A00++;
                objArr3[iA01] = e;
                return true;
            }
            if (obj2 == e || obj2.equals(e)) {
                break;
            }
            iA01++;
            if (iA01 == length2) {
                iA01 = 0;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.A02;
        if (objArr.length == 0) {
            return false;
        }
        if (obj == null) {
            obj = A03;
        }
        return objArr[A02(objArr, obj)] != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new DP2(this, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.A02;
        if (objArr.length != 0) {
            if (obj == null) {
                obj = A03;
            }
            int iA02 = A02(objArr, obj);
            Object[] objArr2 = this.A02;
            if (objArr2[iA02] != null) {
                int length = objArr2.length;
                while (true) {
                    int i = iA02;
                    while (true) {
                        iA02++;
                        if (iA02 >= length) {
                            iA02 = 0;
                        }
                        Object[] objArr3 = this.A02;
                        obj2 = objArr3[iA02];
                        if (obj2 == null) {
                            this.A00++;
                            this.mSize--;
                            objArr3[i] = null;
                            return true;
                        }
                        int iA01 = A01(obj2, length);
                        boolean z = iA01 > i;
                        if (iA02 >= i) {
                            if (z) {
                                break;
                            }
                        } else if (z) {
                            continue;
                        }
                        if (iA01 <= iA02) {
                        }
                    }
                    this.A02[i] = obj2;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.mSize;
    }

    public static int A01(Object obj, int i) {
        int iHashCode = obj.hashCode();
        int i2 = iHashCode + ((iHashCode << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return ((i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        objectInputStream.readFloat();
        this.A02 = new Object[i];
        this.mSize = 0;
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A02.length);
        objectOutputStream.writeFloat(0.75f);
        objectOutputStream.writeInt(size());
        int iA00 = A00(this, -1);
        while (iA00 >= 0) {
            Object obj = this.A02[iA00];
            if (obj == A03) {
                obj = null;
            }
            objectOutputStream.writeObject(obj);
            iA00 = A00(this, iA00);
        }
    }

    public final Object clone() {
        try {
            DP1 dp1 = (DP1) super.clone();
            Object[] objArr = new Object[this.A02.length];
            dp1.A02 = objArr;
            Object[] objArr2 = this.A02;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return dp1;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0N(e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) BV8.A1a(tArr, size);
        }
        int iA00 = A00(this, -1);
        int i = 0;
        while (iA00 >= 0) {
            int i2 = i + 1;
            Object obj = this.A02[iA00];
            if (obj == A03) {
                obj = null;
            }
            tArr[i] = obj;
            iA00 = A00(this, iA00);
            i = i2;
        }
        BV7.A1P(tArr, tArr.length, size);
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sbA0x = C60O.A0x("{");
        int iA00 = A00(this, -1);
        boolean z = true;
        while (iA00 >= 0) {
            Object obj = this.A02[iA00];
            if (!z) {
                C8j3.A1K(sbA0x);
            }
            if (obj == A03) {
                obj = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            }
            sbA0x.append(obj);
            iA00 = A00(this, iA00);
            z = false;
        }
        return C8j3.A15(sbA0x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return A04;
        }
        Object[] objArr = new Object[size];
        int iA00 = A00(this, -1);
        int i = 0;
        while (iA00 >= 0) {
            int i2 = i + 1;
            Object obj = this.A02[iA00];
            if (obj == A03) {
                obj = null;
            }
            objArr[i] = obj;
            iA00 = A00(this, iA00);
            i = i2;
        }
        return objArr;
    }
}
