package X;

import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* renamed from: X.DPt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5034DPt<K> {
    public transient float A00;
    public transient int A01;
    public transient int A02;
    public transient int A03;
    public transient int[] A04;
    public transient int[] A05;
    public transient long[] A06;
    public transient Object[] A07;

    public void A09(int expectedSize, float loadFactor) {
        Preconditions.checkArgument(C8j3.A1Q(expectedSize), "Initial capacity must be non-negative");
        Preconditions.checkArgument(loadFactor > 0.0f, "Illegal load factor");
        int iA00 = DNI.A00(loadFactor, expectedSize);
        int[] iArr = new int[iA00];
        Arrays.fill(iArr, -1);
        this.A04 = iArr;
        this.A00 = loadFactor;
        this.A07 = new Object[expectedSize];
        this.A05 = new int[expectedSize];
        long[] jArr = new long[expectedSize];
        Arrays.fill(jArr, -1L);
        this.A06 = jArr;
        this.A03 = Math.max(1, (int) (iA00 * loadFactor));
    }

    public final int A02(int index) {
        if (this instanceof DQ3) {
            int i = (int) ((DQ3) this).A01[index];
            if (i != -2) {
                return i;
            }
        } else {
            int i2 = index + 1;
            if (i2 < this.A02) {
                return i2;
            }
        }
        return -1;
    }

    public final int A03(int entryIndex) {
        Object obj = this.A07[entryIndex];
        long[] jArr = this.A06;
        int i = (int) (jArr[entryIndex] >>> 32);
        int length = (r1.length - 1) & i;
        int i2 = this.A04[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (jArr[i2] >>> 32)) == i && Objects.equal(obj, this.A07[i2])) {
                int i4 = this.A05[i2];
                if (i3 == -1) {
                    this.A04[length] = (int) this.A06[i2];
                } else {
                    long[] jArr2 = this.A06;
                    A00(jArr2, (int) jArr2[i2], i3, jArr2[i3]);
                }
                A07(i2);
                this.A02--;
                this.A01++;
                return i4;
            }
            jArr = this.A06;
            int i5 = (int) jArr[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;I)I */
    public final void A05(Object key, int value) {
        if (value <= 0) {
            throw C60O.A0i(FGI.A0S(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, " must be positive but was: ", value));
        }
        long[] jArr = this.A06;
        Object[] objArr = this.A07;
        int[] iArr = this.A05;
        int iA01 = DNI.A01(AnonymousClass006.A0D(key));
        int[] iArr2 = this.A04;
        int length = (iArr2.length - 1) & iA01;
        int i = this.A02;
        int i2 = iArr2[length];
        if (i2 == -1) {
            iArr2[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (BV6.A03(j) == iA01 && Objects.equal(key, objArr[i2])) {
                    iArr[i2] = value;
                    return;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    A00(jArr, i, i2, j);
                    break;
                }
                i2 = i3;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw C3cG.A0Q("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        int length2 = this.A06.length;
        if (i4 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            } else if (iMax != length2) {
            }
            A08(iMax);
        }
        A0A(key, i, value, iA01);
        this.A02 = i4;
        if (i >= this.A03) {
            int length3 = this.A04.length;
            int i5 = length3 * 2;
            if (length3 >= 1073741824) {
                this.A03 = Integer.MAX_VALUE;
            } else {
                int i6 = ((int) (i5 * this.A00)) + 1;
                int[] iArr3 = new int[i5];
                Arrays.fill(iArr3, -1);
                long[] jArr2 = this.A06;
                int i7 = i5 - 1;
                for (int i8 = 0; i8 < this.A02; i8++) {
                    int i9 = (int) (jArr2[i8] >>> 32);
                    int i10 = i9 & i7;
                    int i11 = iArr3[i10];
                    iArr3[i10] = i8;
                    jArr2[i8] = (i9 << 32) | (4294967295L & i11);
                }
                this.A03 = i6;
                this.A04 = iArr3;
            }
        }
        this.A01++;
    }

    public void A06() {
        this.A01++;
        Arrays.fill(this.A07, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, 0, this.A02, 0);
        Arrays.fill(this.A04, -1);
        Arrays.fill(this.A06, -1L);
        this.A02 = 0;
    }

    public void A07(int dstIndex) {
        int i = this.A02 - 1;
        Object[] objArr = this.A07;
        if (dstIndex >= i) {
            objArr[dstIndex] = null;
            this.A05[dstIndex] = 0;
            this.A06[dstIndex] = -1;
            return;
        }
        objArr[dstIndex] = objArr[i];
        int[] iArr = this.A05;
        iArr[dstIndex] = iArr[i];
        objArr[i] = null;
        iArr[i] = 0;
        long[] jArr = this.A06;
        long j = jArr[i];
        jArr[dstIndex] = j;
        jArr[i] = -1;
        int iA03 = BV6.A03(j);
        int[] iArr2 = this.A04;
        int length = iA03 & (iArr2.length - 1);
        int i2 = iArr2[length];
        if (i2 == i) {
            iArr2[length] = dstIndex;
            return;
        }
        while (true) {
            long j2 = jArr[i2];
            int i3 = (int) j2;
            if (i3 == i) {
                A00(jArr, dstIndex, i2, j2);
                return;
            }
            i2 = i3;
        }
    }

    public void A08(int newCapacity) {
        this.A07 = Arrays.copyOf(this.A07, newCapacity);
        this.A05 = Arrays.copyOf(this.A05, newCapacity);
        long[] jArr = this.A06;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.A06 = jArrCopyOf;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;II)V */
    public void A0A(Object entryIndex, int key, int value, int hash) {
        this.A06[key] = (hash << 32) | 4294967295L;
        this.A07[key] = entryIndex;
        this.A05[key] = value;
    }

    public C5034DPt() {
        A09(3, 1.0f);
    }

    public final int A04(Object key) {
        int iA01 = DNI.A01(AnonymousClass006.A0D(key));
        int i = this.A04[(r1.length - 1) & iA01];
        while (i != -1) {
            long j = this.A06[i];
            if (BV6.A03(j) == iA01 && Objects.equal(key, this.A07[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public static void A00(long[] jArr, int i, int i2, long j) {
        jArr[i2] = (j & (-4294967296L)) | (4294967295L & i);
    }
}
