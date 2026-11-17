package X;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class E0K implements E0T {
    public final List<C6310E0i> A00;
    public final long[] A01;
    public final long[] A02;

    @Override // X.E0T
    public final long AFN(int i) {
        C1G.A07(C8j3.A1Q(i));
        long[] jArr = this.A02;
        C1G.A07(i < jArr.length);
        return jArr[i];
    }

    @Override // X.E0T
    public final int AFO() {
        return this.A02.length;
    }

    @Override // X.E0T
    public final int AI2(long j) {
        long[] jArr = this.A02;
        int iA07 = Util.A07(jArr, j, false);
        if (iA07 >= jArr.length) {
            return -1;
        }
        return iA07;
    }

    public E0K(List<C6310E0i> list) {
        this.A00 = BV5.A13(list);
        this.A01 = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C6310E0i c6310E0i = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.A01;
            jArr[i2] = c6310E0i.A01;
            jArr[i2 + 1] = c6310E0i.A00;
        }
        long[] jArr2 = this.A01;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A02 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // X.E0T
    public final List<E0J> AEJ(long j) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        int i = 0;
        while (true) {
            List<C6310E0i> list = this.A00;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.A01;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C6310E0i c6310E0i = list.get(i);
                if (c6310E0i.A02.A01 == -3.4028235E38f) {
                    arrayListA0h2.add(c6310E0i);
                } else {
                    arrayListA0h.add(c6310E0i.A02);
                }
            }
            i++;
        }
        C7572F4l.A00(15, arrayListA0h2);
        for (int i3 = 0; i3 < arrayListA0h2.size(); i3++) {
            E0J e0j = ((C6310E0i) arrayListA0h2.get(i3)).A02;
            CharSequence charSequence = e0j.A0G;
            Bitmap bitmap = e0j.A0D;
            Layout.Alignment alignment = e0j.A0F;
            Layout.Alignment alignment2 = e0j.A0E;
            int i4 = e0j.A06;
            float f = e0j.A02;
            int i5 = e0j.A08;
            int i6 = e0j.A09;
            float f2 = e0j.A05;
            float f3 = e0j.A04;
            float f4 = e0j.A00;
            boolean z = e0j.A0H;
            arrayListA0h.add(new E0J(bitmap, alignment, alignment2, charSequence, (-1) - i3, f, f2, f3, f4, e0j.A03, 1, i4, i5, i6, e0j.A0B, e0j.A0A, e0j.A0C, z));
        }
        return arrayListA0h;
    }
}
