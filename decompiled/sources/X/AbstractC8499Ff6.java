package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.Ff6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8499Ff6 {
    public C8345FcJ[] A00;
    public Rect[][] A01;
    public Rect[][] A02;
    public final C8497Ff4 A03;

    public AbstractC8499Ff6() {
        this(new C8497Ff4((C8497Ff4) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(C8497Ff4 c8497Ff4) {
        int i = 1;
        do {
            C8496Ff3 c8496Ff3 = c8497Ff4.A00;
            List<Rect> listA0E = c8496Ff3.A0E(i);
            int iA00 = HlQ.A00(i);
            this.A01[iA00] = listA0E.toArray(new Rect[listA0E.size()]);
            if (i != 8) {
                List<Rect> listA0F = c8496Ff3.A0F(i);
                this.A02[iA00] = listA0F.toArray(new Rect[listA0F.size()]);
            }
            i <<= 1;
        } while (i <= 512);
    }

    public void A00(C8345FcJ c8345FcJ, int i) {
        C8345FcJ[] c8345FcJArr = this.A00;
        if (c8345FcJArr == null) {
            c8345FcJArr = new C8345FcJ[10];
            this.A00 = c8345FcJArr;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c8345FcJArr[HlQ.A00(i2)] = c8345FcJ;
            }
            i2 <<= 1;
        } while (i2 <= 512);
    }

    public AbstractC8499Ff6(C8497Ff4 c8497Ff4) {
        this.A01 = new Rect[10][];
        this.A02 = new Rect[10][];
        this.A03 = c8497Ff4;
        A01(c8497Ff4);
    }
}
