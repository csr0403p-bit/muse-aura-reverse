package X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.GMp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9522GMp {
    public int A00;
    public Iterator<?>[] A01;
    public int A02;

    public final void A00(Iterator<?> it) {
        Iterator<?>[] itArr;
        int i = this.A00;
        int i2 = this.A02;
        Iterator<?>[] itArr2 = this.A01;
        if (i < i2) {
            this.A00 = i + 1;
            itArr2[i] = it;
            return;
        }
        if (itArr2 == null) {
            this.A02 = 10;
            itArr = new Iterator[10];
        } else {
            int iMin = i2 + Math.min(4000, Math.max(20, i2 >> 1));
            this.A02 = iMin;
            itArr = (Iterator[]) Arrays.copyOf(itArr2, iMin);
        }
        this.A01 = itArr;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        itArr[i3] = it;
    }
}
