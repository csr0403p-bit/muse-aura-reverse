package X;

/* renamed from: X.Dyv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6252Dyv extends AbstractC5364DhG {
    public long A00;
    public boolean A01;

    public void A02() {
        super.A00 = 0;
        this.A00 = 0L;
        this.A01 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03() {
        AbstractC6191Dxb abstractC6191Dxb;
        C6221DyC c6221DyC;
        if (this instanceof E07) {
            E07 e07 = (E07) this;
            E06 e06 = ((E0A) e07.A00).A00;
            e07.A02();
            e06.A05.add(e07);
            return;
        }
        if (this instanceof E08) {
            E08 e08 = (E08) this;
            abstractC6191Dxb = e08.A00;
            c6221DyC = e08;
        } else {
            C6221DyC c6221DyC2 = (C6221DyC) this;
            abstractC6191Dxb = c6221DyC2.A01;
            c6221DyC = c6221DyC2;
        }
        Object obj = abstractC6191Dxb.A08;
        synchronized (obj) {
            c6221DyC.A02();
            O[] oArr = abstractC6191Dxb.A0B;
            int i = abstractC6191Dxb.A01;
            abstractC6191Dxb.A01 = i + 1;
            oArr[i] = c6221DyC;
            if (!abstractC6191Dxb.A09.isEmpty() && abstractC6191Dxb.A01 > 0) {
                obj.notify();
            }
        }
    }
}
