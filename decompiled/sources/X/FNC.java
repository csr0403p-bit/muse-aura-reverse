package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FNC {
    public FOG A00;
    public final AbstractC7972FNn A01;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(FOG fog) {
        FOG fog2;
        T t;
        synchronized (this) {
            fog2 = this.A00;
            this.A00 = fog;
        }
        if (fog2 == null) {
            C7975FNq<T> c7975FNq = ((C7973FNo) this.A01).A00;
            synchronized (c7975FNq) {
                t = c7975FNq.A00;
            }
            FOM.A00();
            try {
                Huk huk = (Huk) t;
                if (huk != null) {
                    synchronized (this) {
                        FOG fog3 = this.A00;
                        if (fog3 != null) {
                            fog3.onResponse(huk);
                        }
                    }
                }
                FOM.A00();
                FO9 fo9 = c7975FNq.A02;
                if (fo9.AOp()) {
                    C7975FNq.A00(this, c7975FNq, t);
                } else {
                    fo9.AYE(new RunnableC7980FNw(this, c7975FNq, t));
                }
            } catch (Throwable th) {
                FOM.A00();
                throw th;
            }
        }
    }

    public final void A01(FOG fog) {
        synchronized (this) {
            if (this.A00 != fog) {
                return;
            }
            this.A00 = null;
            C7975FNq<T> c7975FNq = ((C7973FNo) this.A01).A00;
            FO9 fo9 = c7975FNq.A02;
            if (!fo9.AOp()) {
                fo9.AYE(new RunnableC7977FNs(this, c7975FNq));
                return;
            }
            List list = c7975FNq.A01;
            if (list != null) {
                list.remove(this);
            }
        }
    }

    public FNC(AbstractC7972FNn abstractC7972FNn) {
        this.A01 = abstractC7972FNn;
    }
}
