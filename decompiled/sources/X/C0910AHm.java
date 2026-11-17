package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.AHm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0910AHm<T> implements RandomAccess {
    public int A00;
    public T[] A01;
    public List<T> A02;

    public static C0910AHm A01(Object[] objArr) {
        return new C0910AHm(0, objArr);
    }

    public static AbstractC1439Aj8 A03(C0910AHm c0910AHm, int i) {
        return (AbstractC1439Aj8) c0910AHm.A07(i - 1);
    }

    public static C0910AHm A00() {
        return new C0910AHm(0, new AbstractC1439Aj8[16]);
    }

    public static C0910AHm A02(Object[] objArr, int i) {
        return new C0910AHm(i, objArr);
    }

    private final void A05(int i) {
        T[] tArr = this.A01;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.A01 = tArr2;
    }

    public static void A06(C1890At8 c1890At8) {
        c1890At8.A00.A02().A00.A09();
    }

    public final T A07(int i) {
        T[] tArr = this.A01;
        T t = tArr[i];
        int i2 = this.A00;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(tArr, i3, tArr, i, i2 - i3);
        }
        int i4 = this.A00 - 1;
        this.A00 = i4;
        tArr[i4] = null;
        return t;
    }

    public final List<T> A08() {
        List<T> list = this.A02;
        if (list != null) {
            return list;
        }
        C0909AHl c0909AHl = new C0909AHl(this);
        this.A02 = c0909AHl;
        return c0909AHl;
    }

    public final void A09() {
        T[] tArr = this.A01;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.A00 = 0;
    }

    public final void A0A(int i, int i2) {
        if (i2 > i) {
            int i3 = this.A00;
            if (i2 < i3) {
                T[] tArr = this.A01;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.A00;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A01[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.A00 = i5;
        }
    }

    public final void A0B(int i, T t) {
        int i2 = this.A00 + 1;
        if (this.A01.length < i2) {
            A05(i2);
        }
        T[] tArr = this.A01;
        int i3 = this.A00;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.A00++;
    }

    /* JADX WARN: Incorrect return type in method signature: (ILX/AHm<TT;>;)Z */
    public final void A0C(C0910AHm c0910AHm, int i) {
        int i2 = c0910AHm.A00;
        if (i2 != 0) {
            int i3 = this.A00 + i2;
            if (this.A01.length < i3) {
                A05(i3);
            }
            T[] tArr = this.A01;
            int i4 = this.A00;
            if (i != i4) {
                System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
            }
            System.arraycopy(c0910AHm.A01, 0, tArr, i, i2);
            this.A00 += i2;
        }
    }

    public final void A0D(Comparator<T> comparator) {
        Arrays.sort(this.A01, 0, this.A00, comparator);
    }

    public final boolean A0G(T t) {
        int i = this.A00 + 1;
        if (this.A01.length < i) {
            A05(i);
        }
        T[] tArr = this.A01;
        int i2 = this.A00;
        tArr[i2] = t;
        this.A00 = i2 + 1;
        return true;
    }

    public final boolean A0H(T t) {
        int i = this.A00 - 1;
        if (i >= 0) {
            for (int i2 = 0; !C7384Etj.areEqual(this.A01[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0I(T t) {
        T[] tArr = this.A01;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (C7384Etj.areEqual(t, tArr[i2])) {
                if (i2 < 0) {
                    return false;
                }
                A07(i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: ([TT;I)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C0910AHm(int i, Object[] objArr) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public static List A04(C1453AjM c1453AjM) {
        return c1453AjM.A0D().A08();
    }

    /* JADX WARN: Incorrect return type in method signature: (ILjava/util/List<+TT;>;)Z */
    public final void A0E(List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.A00 + size;
        if (this.A01.length < i2) {
            A05(i2);
        }
        Object[] objArr = (T[]) this.A01;
        int i3 = this.A00;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.A00 += size;
    }

    public final boolean A0F(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.A00 + size;
        if (this.A01.length < i3) {
            A05(i3);
        }
        T[] tArr = this.A01;
        int i4 = this.A00;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            tArr[i2 + i] = t;
            i2 = i5;
        }
        this.A00 += size;
        return true;
    }
}
