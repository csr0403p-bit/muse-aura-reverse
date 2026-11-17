package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: X.Dga, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5339Dga {
    public static final Comparator<C5340Dgb> A06 = new C7572F4l(11);
    public static final Comparator<C5340Dgb> A07 = new C7572F4l(12);
    public int A01;
    public int A02;
    public int A03;
    public final C5340Dgb[] A05 = new C5340Dgb[5];
    public final ArrayList<C5340Dgb> A04 = C3cG.A0h();
    public int A00 = -1;

    public final float A00() {
        if (this.A00 != 0) {
            Collections.sort(this.A04, A07);
            this.A00 = 0;
        }
        float f = 0.5f * this.A02;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<C5340Dgb> arrayList = this.A04;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return arrayList.get(C8j3.A0K(arrayList)).A00;
            }
            C5340Dgb c5340Dgb = arrayList.get(i);
            i2 += c5340Dgb.A02;
            if (i2 >= f) {
                return c5340Dgb.A00;
            }
            i++;
        }
    }

    public final void A01(int i, float f) {
        C5340Dgb c5340Dgb;
        int i2;
        C5340Dgb c5340Dgb2;
        int i3;
        if (this.A00 != 1) {
            Collections.sort(this.A04, A06);
            this.A00 = 1;
        }
        int i4 = this.A03;
        if (i4 > 0) {
            C5340Dgb[] c5340DgbArr = this.A05;
            i4--;
            this.A03 = i4;
            c5340Dgb = c5340DgbArr[i4];
        } else {
            c5340Dgb = new C5340Dgb();
        }
        int i5 = this.A01;
        this.A01 = i5 + 1;
        c5340Dgb.A01 = i5;
        c5340Dgb.A02 = i;
        c5340Dgb.A00 = f;
        ArrayList<C5340Dgb> arrayList = this.A04;
        arrayList.add(c5340Dgb);
        int i6 = this.A02 + i;
        while (true) {
            this.A02 = i6;
            while (i6 > 2000) {
                i2 = i6 - 2000;
                c5340Dgb2 = arrayList.get(0);
                i3 = c5340Dgb2.A02;
                if (i3 <= i2) {
                    i6 -= i3;
                    this.A02 = i6;
                    arrayList.remove(0);
                    int i7 = i4;
                    if (i4 < 5) {
                        C5340Dgb[] c5340DgbArr2 = this.A05;
                        i4++;
                        this.A03 = i4;
                        c5340DgbArr2[i7] = c5340Dgb2;
                    }
                }
            }
            return;
            c5340Dgb2.A02 = i3 - i2;
            i6 -= i2;
        }
    }
}
