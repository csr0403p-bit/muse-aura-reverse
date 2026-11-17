package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Acf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1150Acf<T> implements InterfaceC1153Acj<T> {
    public final int A00;
    public final List<T> A01;
    public final float[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1150Acf) {
                C1150Acf c1150Acf = (C1150Acf) obj;
                if (!this.A01.equals(c1150Acf.A01) || !Arrays.equals(this.A02, c1150Acf.A02) || this.A00 != c1150Acf.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1153Acj
    public final T A6U(float f) {
        float[] fArr = this.A02;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            int i4 = i2 + 1;
            float fA01 = C8j3.A01(f, fArr[i]);
            if (fA01 <= f2) {
                i3 = i2;
                f2 = fA01;
            }
            i++;
            i2 = i4;
        }
        if (i3 == -1) {
            return null;
        }
        return this.A01.get(i3);
    }

    @Override // X.InterfaceC1153Acj
    public final T A6V(float f, boolean z) {
        float[] fArr = this.A02;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i2 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i3 = i2;
                f2 = f4;
            }
            i++;
            i2 = i4;
        }
        if (i3 == -1) {
            return null;
        }
        return this.A01.get(i3);
    }

    @Override // X.InterfaceC1153Acj
    public final float AYD(T t) {
        int iIndexOf = this.A01.indexOf(t);
        float[] fArr = this.A02;
        return (iIndexOf < 0 || iIndexOf >= fArr.length) ? AnonymousClass001.A02(C8j4.A0r(AnchoredDraggableKt.A02, iIndexOf)) : fArr[iIndexOf];
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A01) + Arrays.hashCode(this.A02)) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DraggableAnchors(anchors={");
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(AbstractC0878AGe.A0A(i2, this.A01));
            sbA0w.append('=');
            float[] fArr = this.A02;
            sbA0w.append((i2 < 0 || i2 >= fArr.length) ? AnonymousClass001.A02(C8j4.A0r(AnchoredDraggableKt.A02, i2)) : fArr[i2]);
            sbA0x.append(sbA0w.toString());
            if (i2 < i - 1) {
                C8j3.A1K(sbA0x);
            }
            i2++;
        }
        return AnonymousClass001.A0v("})", sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1150Acf(List<? extends T> list, float[] fArr) {
        this.A01 = list;
        this.A02 = fArr;
        int size = list.size();
        int length = fArr.length;
        if (size == length) {
            this.A00 = length;
            return;
        }
        StringBuilder sbA0f = C3cG.A0f(list, "DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
        sbA0f.append(" | Anchors: ");
        AbstractC1061ATk.A00(C8j3.A14(BFI.A0E(fArr), sbA0f));
        throw F60.createAndThrow();
    }
}
