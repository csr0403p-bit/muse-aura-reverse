package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.B9e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2185B9e {
    public boolean A00;
    public final List<B9Z<?>> A01 = C3cG.A0h();
    public final CopyOnWriteArrayList<AutoCloseable> A02 = new CopyOnWriteArrayList<>();

    public final void A01() {
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.A02;
        Iterator<AutoCloseable> it = copyOnWriteArrayList.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            it.next().close();
        }
        copyOnWriteArrayList.clear();
        List<B9Z<?>> list = this.A01;
        Iterator<B9Z<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().A01();
        }
        list.clear();
    }

    public final void A02(boolean z) {
        this.A00 = z;
        Iterator<B9Z<?>> it = this.A01.iterator();
        while (it.hasNext()) {
            it.next().A02(z);
        }
    }

    public void A03() {
        if (this instanceof BSB) {
            BSB bsb = (BSB) this;
            if (1 - bsb.$t == 0) {
                ((B9U) bsb.A00).A01();
            }
        }
    }

    public void A04() {
        BSB bsb = (BSB) this;
        if (bsb.$t != 0) {
            ((B9U) bsb.A00).A02();
        } else {
            ((G0U) bsb.A00).invoke(bsb);
        }
    }

    public void A05() {
        if (this instanceof BSB) {
            BSB bsb = (BSB) this;
            if (1 - bsb.$t == 0) {
                ((B9U) bsb.A00).A03();
            }
        }
    }

    public void A06(C2194B9z c2194B9z) {
        HzR<C2194B9z> hzR;
        if (this instanceof BSB) {
            BSB bsb = (BSB) this;
            if (1 - bsb.$t == 0) {
                B9U b9u = (B9U) bsb.A00;
                if (!(b9u instanceof B86) || (hzR = ((B86) b9u).A02) == null) {
                    return;
                }
                hzR.AhZ(c2194B9z);
            }
        }
    }

    public AbstractC2185B9e(boolean z) {
        this.A00 = z;
    }
}
