package X;

import X.AMZ;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class B9Z<T extends AMZ> {
    public C2183B9b A00;
    public T A01;
    public AMY A02;
    public List<? extends T> A03;
    public List<? extends T> A04;
    public boolean A05;
    public boolean A06;

    public final void A00() {
        if (this instanceof B9X) {
            B9X b9x = (B9X) this;
            b9x.A04.invoke(((B9Z) b9x).A02);
            b9x.A00.invoke();
        } else if (this instanceof B9V) {
            ((B9V) this).A00.A01();
        } else {
            ((B9Y) this).A00.A03();
        }
    }

    public final void A01() {
        C2183B9b c2183B9b = this.A00;
        if (c2183B9b == null || !c2183B9b.A02.remove(this)) {
            return;
        }
        C2182B9a c2182B9a = c2183B9b.A00;
        if (equals(c2182B9a.A01)) {
            if (c2182B9a.A00 == -1) {
                this.A02 = AMc.A00;
                A00();
            }
            c2182B9a.A01 = null;
            c2182B9a.A00 = 0;
            c2182B9a.A02 = null;
        }
        c2182B9a.A0A.remove(this);
        c2182B9a.A09.remove(this);
        this.A00 = null;
        c2182B9a.A01();
    }

    public final void A02(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            C2183B9b c2183B9b = this.A00;
            if (c2183B9b != null) {
                c2183B9b.A00.A01();
            }
        }
    }
}
