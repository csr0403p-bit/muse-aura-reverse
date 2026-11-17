package X;

import java.util.NoSuchElementException;

/* renamed from: X.AHq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0914AHq<K, V> {
    public final C0918AHu<Object, Object> A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C0914AHq) && this.A00.equals(((C0914AHq) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("MultiValueMap(map="));
    }

    public /* synthetic */ C0914AHq(C0918AHu c0918AHu) {
        this.A00 = c0918AHu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V A00(C0918AHu<Object, Object> c0918AHu, K k) {
        V v = (V) c0918AHu.A05(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof C0912AHo)) {
            c0918AHu.A0B(k);
            return v;
        }
        C0912AHo c0912AHo = (C0912AHo) v;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        if (i == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        int i2 = i - 1;
        V v2 = (V) c0912AHo.A03(i2);
        c0912AHo.A05(i2);
        C7384Etj.A0Z(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (((AbstractC0913AHp) c0912AHo).A00 == 0) {
            c0918AHu.A0B(k);
        }
        if (((AbstractC0913AHp) c0912AHo).A00 == 1) {
            c0918AHu.A0E(k, c0912AHo.A01[0]);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C0918AHu<Object, Object> c0918AHu, K k, V v) {
        C0912AHo c0912AHo;
        int iA09 = c0918AHu.A09(k);
        if (iA09 < 0) {
            iA09 ^= -1;
            c0918AHu.A04[iA09] = k;
        } else {
            Object obj = c0918AHu.A05[iA09];
            if (obj != null) {
                if (obj instanceof C0912AHo) {
                    c0912AHo = (C0912AHo) obj;
                } else {
                    C0912AHo c0912AHo2 = new C0912AHo(2);
                    c0912AHo2.A09(obj);
                    c0912AHo = c0912AHo2;
                }
                c0912AHo.A09(v);
                v = c0912AHo;
            }
        }
        c0918AHu.A05[iA09] = v;
    }

    public static final void A02(C0918AHu<Object, Object> c0918AHu, K k, G0U<? super V, Boolean> g0u) {
        Object objA05 = c0918AHu.A05(k);
        if (objA05 != null) {
            if (!(objA05 instanceof C0912AHo)) {
                if (AnonymousClass003.A1X(objA05, g0u)) {
                    c0918AHu.A0B(k);
                    return;
                }
                return;
            }
            AbstractC0913AHp abstractC0913AHp = (AbstractC0913AHp) objA05;
            int i = abstractC0913AHp.A00;
            Object[] objArr = abstractC0913AHp.A01;
            int i2 = 0;
            ADq aDqA0C = ATD.A0C(0, i);
            int i3 = aDqA0C.A00;
            int i4 = aDqA0C.A01;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (AnonymousClass003.A1X(objArr[i3], g0u)) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            AbstractC0903AHf.A04(objArr, i - i2, i);
            int i5 = abstractC0913AHp.A00 - i2;
            abstractC0913AHp.A00 = i5;
            if (i5 == 0) {
                c0918AHu.A0B(k);
            }
            if (abstractC0913AHp.A00 == 1) {
                c0918AHu.A0E(k, abstractC0913AHp.A01[0]);
            }
        }
    }
}
