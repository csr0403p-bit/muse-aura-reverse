package X;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.Aq8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnDragListenerC1755Aq8 implements View.OnDragListener, InterfaceC1658Anh {
    public final G0W A03;
    public final C1756Aq9 A02 = new C1756Aq9(null);
    public final Ao0<InterfaceC1758AqB> A00 = new Ao0<>(0);
    public final BRg A01 = new C1757AqA(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1759AqC c1759AqC = new C1759AqC(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                C1756Aq9 c1756Aq9 = this.A02;
                F1F f1f = new F1F();
                C2339BUn c2339BUn = new C2339BUn(c1759AqC, f1f, c1756Aq9, 6);
                if (c2339BUn.invoke(c1756Aq9) == EnumC1236AfQ.A03) {
                    AbstractC1235AfP.A04(c1756Aq9, c2339BUn);
                }
                boolean z = f1f.element;
                Iterator<InterfaceC1758AqB> it = this.A00.iterator();
                while (it.hasNext()) {
                    it.next().AWC(c1759AqC);
                }
                return z;
            case 2:
                this.A02.AUD(c1759AqC);
                return false;
            case 3:
                return this.A02.ASp(c1759AqC);
            case 4:
                this.A02.ASz(c1759AqC);
                this.A00.clear();
                return false;
            case 5:
                this.A02.AT1(c1759AqC);
                return false;
            case 6:
                this.A02.ATD(c1759AqC);
                return false;
            default:
                return false;
        }
    }

    public ViewOnDragListenerC1755Aq8(G0W g0w) {
        this.A03 = g0w;
    }
}
