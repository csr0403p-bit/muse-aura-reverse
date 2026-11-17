package X;

import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public final class AHJ<E> extends AHF<E> {
    public final int A00;
    public final int A01;
    public final Object[] A02;
    public final Object[] A03;

    /* JADX WARN: Incorrect types in method signature: (ITE;)LX/AHH<TE;>; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AHH
    @Deprecated(message = "Use addingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAt(index, element)", imports = {}))
    public final AHH A3D(Object obj, int i) {
        AHB.A01(i, size());
        if (i == size()) {
            return A34(obj);
        }
        int iA00 = AbstractC0890AGr.A00(this);
        if (i >= iA00) {
            return A06(obj, this.A02, i - iA00);
        }
        AHK ahk = new AHK();
        ahk.A00 = null;
        return A06(ahk.A00, A08(obj, ahk, this.A02, this.A00, i), 0);
    }

    private final Object[] A08(Object obj, AHK ahk, Object[] objArr, int i, int i2) {
        Object[] objArrA1a;
        int i3 = i2;
        int i4 = (i2 >> i) & 31;
        Object obj2 = obj;
        if (i == 0) {
            objArrA1a = i4 == 0 ? new Object[32] : C8j3.A1a(objArr, 32);
            AbstractC0903AHf.A05(objArr, objArrA1a, i4 + 1, i4, 31);
            ahk.A00 = objArr[31];
            objArrA1a[i4] = obj;
        } else {
            objArrA1a = C8j3.A1a(objArr, 32);
            int i5 = i - 5;
            Object obj3 = objArr[i4];
            C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj3;
            while (true) {
                objArrA1a[i4] = A08(obj2, ahk, objArr2, i5, i3);
                i4++;
                if (i4 >= 32 || objArrA1a[i4] == null) {
                    break;
                }
                Object obj4 = objArr[i4];
                C7384Etj.A0Z(obj4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = (Object[]) obj4;
                i3 = 0;
                obj2 = ahk.A00;
            }
        }
        return objArrA1a;
    }

    private final Object[] A09(AHK ahk, Object[] objArr, int i, int i2) {
        Object[] objArrA09;
        int i3 = (i2 >> i) & 31;
        if (i != 5) {
            objArrA09 = A09(ahk, C8j4.A1a(objArr, i3), i - 5, i2);
            if (objArrA09 == null) {
            }
            Object[] objArrA1a = C8j3.A1a(objArr, 32);
            objArrA1a[i3] = objArrA09;
            return objArrA1a;
        }
        ahk.A00 = objArr[i3];
        objArrA09 = null;
        if (i3 == 0) {
            return null;
        }
        Object[] objArrA1a2 = C8j3.A1a(objArr, 32);
        objArrA1a2[i3] = objArrA09;
        return objArrA1a2;
    }

    private final Object[] A0A(AHK ahk, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] objArrA1a = i3 == 0 ? new Object[32] : C8j3.A1a(objArr, 32);
            AbstractC0903AHf.A05(objArr, objArrA1a, i3, i3 + 1, 32);
            objArrA1a[31] = ahk.A00;
            ahk.A00 = objArr[i3];
            return objArrA1a;
        }
        int iA00 = objArr[31] == null ? ((AbstractC0890AGr.A00(this) - 1) >> i) & 31 : 31;
        Object[] objArrA1a2 = C8j3.A1a(objArr, 32);
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iA00) {
            while (true) {
                objArrA1a2[iA00] = A0A(ahk, C8j4.A1b(objArrA1a2, iA00), i4, 0);
                if (iA00 == i5) {
                    break;
                }
                iA00--;
            }
        }
        objArrA1a2[i3] = A0A(ahk, C8j4.A1b(objArrA1a2, i3), i4, i2);
        return objArrA1a2;
    }

    @Override // X.AHH
    public final /* bridge */ /* synthetic */ AHL A5c() {
        return new AHL(this, this.A02, this.A03, this.A00);
    }

    @Override // X.AHH
    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(predicate)", imports = {}))
    public final AHH<E> Aaj(G0U<? super E, Boolean> g0u) {
        AHL ahl = new AHL(this, this.A02, this.A03, this.A00);
        ahl.A0U(g0u);
        return ahl.A5R();
    }

    public AHJ(Object[] objArr, Object[] objArr2, int i, int i2) {
        AnonymousClass003.A0u(objArr, objArr2);
        this.A02 = objArr;
        this.A03 = objArr2;
        this.A01 = i;
        this.A00 = i2;
        if (size() <= 32) {
            throw C60O.A0i(FGI.A0H("Trie-based persistent vector should have at least 33 elements, got ", size()));
        }
    }

    private final AHH<E> A05(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.A03;
            Object[] objArrA1a = C8j3.A1a(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AbstractC0903AHf.A05(objArr2, objArrA1a, i3, i3 + 1, size);
            }
            objArrA1a[i4] = null;
            return new AHJ(objArr, objArrA1a, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = C8j3.A1a(objArr, 32);
            }
            return new AHI(objArr);
        }
        AHK ahk = new AHK();
        ahk.A00 = null;
        Object[] objArrA09 = A09(ahk, objArr, i2, i - 1);
        C7384Etj.A0X(objArrA09);
        Object obj = ahk.A00;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrA09[1] == null) {
            objArrA09 = C8j4.A1b(objArrA09, 0);
            i2 -= 5;
        }
        return new AHJ(objArrA09, objArr3, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/Object;ILjava/lang/Object;)LX/AHJ<TE;>; */
    private final AHJ A06(Object obj, Object[] objArr, int i) {
        int size = size() - AbstractC0890AGr.A00(this);
        Object[] objArr2 = this.A03;
        Object[] objArrA1a = C8j3.A1a(objArr2, 32);
        if (size < 32) {
            AbstractC0903AHf.A05(objArr2, objArrA1a, i + 1, i, size);
            objArrA1a[i] = obj;
            return new AHJ(objArr, objArrA1a, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrA1a, i + 1, (size - 1) - i);
        objArrA1a[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A07(objArr, objArrA1a, objArr3);
    }

    private final AHJ<E> A07(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] objArrA0B;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            i += 5;
            objArrA0B = A0B(objArr4, objArr2, i);
        } else {
            objArrA0B = A0B(objArr, objArr2, i);
        }
        return new AHJ<>(objArrA0B, objArr3, size() + 1, i);
    }

    private final Object[] A0B(Object[] objArr, Object[] objArr2, int i) {
        int size = ((size() - 1) >> i) & 31;
        Object[] objArrA1a = objArr != null ? C8j3.A1a(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrA1a[size] = objArr2;
            return objArrA1a;
        }
        objArrA1a[size] = A0B((Object[]) objArrA1a[size], objArr2, i - 5);
        return objArrA1a;
    }

    @Override // X.AHH
    @Deprecated(message = "Use adding() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "adding(element)", imports = {}))
    public final AHH<E> A34(E e) {
        int size = size() - AbstractC0890AGr.A00(this);
        if (size < 32) {
            Object[] objArrA1a = C8j3.A1a(this.A03, 32);
            objArrA1a[size] = e;
            return new AHJ(this.A02, objArrA1a, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return A07(this.A02, this.A03, objArr);
    }

    @Override // X.AHH
    @Deprecated(message = "Use removingAt() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAt(index)", imports = {}))
    public final AHH<E> Aam(int i) {
        AHB.A00(i, size());
        int iA00 = AbstractC0890AGr.A00(this);
        Object[] objArr = this.A02;
        int i2 = this.A00;
        if (i >= iA00) {
            return A05(objArr, iA00, i2, i - iA00);
        }
        Object obj = this.A03[0];
        AHK ahk = new AHK();
        ahk.A00 = obj;
        return A05(A0A(ahk, objArr, i2, i), iA00, i2, 0);
    }

    @Override // X.AH7, java.util.List
    public final E get(int i) {
        Object[] objArrA1a;
        AHB.A00(i, size());
        if (AbstractC0890AGr.A00(this) <= i) {
            objArrA1a = this.A03;
        } else {
            objArrA1a = this.A02;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArrA1a = C8j4.A1a(objArrA1a, (i >> i2) & 31);
            }
        }
        return (E) objArrA1a[i & 31];
    }

    @Override // X.AH7, java.util.List
    public final ListIterator<E> listIterator(int i) {
        AHB.A01(i, size());
        return new AHN(this.A02, this.A03, i, size(), (this.A00 / 5) + 1);
    }
}
