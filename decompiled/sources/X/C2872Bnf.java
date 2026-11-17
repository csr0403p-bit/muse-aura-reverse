package X;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: X.Bnf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2872Bnf extends AbstractC2867Bna {
    public Rect A00;
    public final int A01;
    public final int A02;
    public final InterfaceC2886Bnt A03;
    public final Object A04;

    public final void A01(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.A02, this.A01)) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.A04) {
            this.A00 = rect;
        }
    }

    public C2872Bnf(Size size, InterfaceC2886Bnt interfaceC2886Bnt, InterfaceC2873Bng interfaceC2873Bng) {
        int height;
        super(interfaceC2873Bng);
        this.A04 = C3cG.A0T();
        if (size == null) {
            InterfaceC2873Bng interfaceC2873Bng2 = super.A00;
            this.A02 = interfaceC2873Bng2.getWidth();
            height = interfaceC2873Bng2.getHeight();
        } else {
            this.A02 = size.getWidth();
            height = size.getHeight();
        }
        this.A01 = height;
        this.A03 = interfaceC2886Bnt;
    }
}
