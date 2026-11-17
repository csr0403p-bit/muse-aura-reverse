package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G8L {
    public final ArrayList<ADq> A02 = C3cG.A0h();
    public int A01 = -239;
    public int A00 = -239;

    public final List<ADq> A00() {
        int i = this.A01;
        if (i != -239) {
            this.A02.add(AbstractC7607F5u.A1C(i, this.A00));
        }
        this.A01 = -239;
        this.A00 = -239;
        return this.A02;
    }

    public final void A01(int i) {
        int i2 = this.A00;
        if (i2 + 1 != i) {
            int i3 = this.A01;
            if (i3 != -239) {
                this.A02.add(AbstractC7607F5u.A1C(i3, i2));
            }
            this.A01 = i;
        }
        this.A00 = i;
    }
}
