package X;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Bna, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2867Bna implements InterfaceC2873Bng {
    public final InterfaceC2873Bng A00;
    public final Object A01 = C3cG.A0T();
    public final Set<InterfaceC2889Bnx> A02 = C60O.A13();

    public final void A00(InterfaceC2889Bnx interfaceC2889Bnx) {
        synchronized (this.A01) {
            this.A02.add(interfaceC2889Bnx);
        }
    }

    @Override // X.InterfaceC2873Bng
    public final Rect AEC() {
        Rect rect;
        if (!(this instanceof C2872Bnf)) {
            return this.A00.AEC();
        }
        C2872Bnf c2872Bnf = (C2872Bnf) this;
        synchronized (c2872Bnf.A04) {
            Rect rect2 = c2872Bnf.A00;
            rect = rect2 == null ? new Rect(0, 0, c2872Bnf.A02, c2872Bnf.A01) : new Rect(rect2);
        }
        return rect;
    }

    @Override // X.InterfaceC2873Bng
    public final int AFp() {
        return this.A00.AFp();
    }

    @Override // X.InterfaceC2873Bng
    public final Image AGI() {
        return this.A00.AGI();
    }

    @Override // X.InterfaceC2873Bng
    public final InterfaceC2886Bnt AGK() {
        return this instanceof C2872Bnf ? ((C2872Bnf) this).A03 : this.A00.AGK();
    }

    @Override // X.InterfaceC2873Bng
    public final Bo0[] AIj() {
        return this.A00.AIj();
    }

    @Override // X.InterfaceC2873Bng, java.lang.AutoCloseable
    public void close() {
        HashSet hashSetA0x;
        this.A00.close();
        synchronized (this.A01) {
            hashSetA0x = BV4.A0x(this.A02);
        }
        Iterator it = hashSetA0x.iterator();
        while (it.hasNext()) {
            ((InterfaceC2889Bnx) it.next()).ATY(this);
        }
    }

    @Override // X.InterfaceC2873Bng
    public final int getHeight() {
        return this instanceof C2872Bnf ? ((C2872Bnf) this).A01 : this.A00.getHeight();
    }

    @Override // X.InterfaceC2873Bng
    public final int getWidth() {
        return this instanceof C2872Bnf ? ((C2872Bnf) this).A02 : this.A00.getWidth();
    }

    public AbstractC2867Bna(InterfaceC2873Bng interfaceC2873Bng) {
        this.A00 = interfaceC2873Bng;
    }
}
