package X;

import java.util.AbstractCollection;

/* renamed from: X.Fdq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8427Fdq implements InterfaceC8451FeF {
    @Override // X.InterfaceC8451FeF
    public void AWo(AbstractC8429Fds abstractC8429Fds) {
        if (this instanceof C8433Fdw) {
            C8430Fdt c8430Fdt = ((C8433Fdw) this).A00;
            c8430Fdt.A02.remove(abstractC8429Fds);
            if (c8430Fdt.A0d()) {
                return;
            }
            AbstractC8429Fds.A07(InterfaceC8443Fe7.A00, c8430Fdt, c8430Fdt, false);
            c8430Fdt.A0L = true;
            AbstractC8429Fds.A07(InterfaceC8443Fe7.A01, c8430Fdt, c8430Fdt, false);
            return;
        }
        if (this instanceof I0K) {
            I0K i0k = (I0K) this;
            if (i0k.$t == 0) {
                ((AbstractCollection) ((DQZ) i0k.A01).get(((ViewOnAttachStateChangeListenerC8432Fdv) i0k.A00).A00)).remove(abstractC8429Fds);
                abstractC8429Fds.A0Z(i0k);
                return;
            }
            return;
        }
        if (this instanceof C8425Fdo) {
            C8425Fdo c8425Fdo = (C8425Fdo) this;
            c8425Fdo.A01.suppressLayout(false);
            c8425Fdo.A00 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.FeF] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Fds, java.lang.Object] */
    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
        ?? r2;
        if (this instanceof C8436Fdz) {
            C8436Fdz c8436Fdz = (C8436Fdz) this;
            C8430Fdt c8430Fdt = c8436Fdz.A00;
            int i = c8430Fdt.A01 - 1;
            c8430Fdt.A01 = i;
            r2 = c8436Fdz;
            if (i == 0) {
                c8430Fdt.A04 = false;
                c8430Fdt.A0K();
                r2 = c8436Fdz;
            }
        } else if (this instanceof I0K) {
            I0K i0k = (I0K) this;
            if (i0k.$t != 0) {
                ((AbstractC8429Fds) i0k.A01).A0I();
                r2 = i0k;
            } else {
                ((AbstractCollection) ((DQZ) i0k.A01).get(((ViewOnAttachStateChangeListenerC8432Fdv) i0k.A00).A00)).remove(abstractC8429Fds);
                r2 = i0k;
            }
        } else {
            boolean z = this instanceof C8440Fe4;
            this = this;
            if (!z) {
                if (!(this instanceof C8425Fdo)) {
                    return;
                }
                C8425Fdo c8425Fdo = (C8425Fdo) this;
                boolean z2 = c8425Fdo.A00;
                r2 = c8425Fdo;
                if (!z2) {
                    c8425Fdo.A01.suppressLayout(false);
                    r2 = c8425Fdo;
                }
            }
        }
        abstractC8429Fds.A0Z(r2);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
        if (this instanceof C8425Fdo) {
            ((C8425Fdo) this).A01.suppressLayout(false);
        }
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
        if (this instanceof C8425Fdo) {
            ((C8425Fdo) this).A01.suppressLayout(true);
        }
    }

    @Override // X.InterfaceC8451FeF
    public final /* synthetic */ void AWs(AbstractC8429Fds abstractC8429Fds) {
        if (this instanceof C8436Fdz) {
            C8430Fdt c8430Fdt = ((C8436Fdz) this).A00;
            if (c8430Fdt.A04) {
                return;
            }
            c8430Fdt.A0L();
            c8430Fdt.A04 = true;
            return;
        }
        if (this instanceof C8440Fe4) {
            C8440Fe4 c8440Fe4 = (C8440Fe4) this;
            Object obj = c8440Fe4.A01;
            if (obj != null) {
                c8440Fe4.A00.A08(obj, c8440Fe4.A03, null);
            }
            Object obj2 = c8440Fe4.A02;
            if (obj2 != null) {
                c8440Fe4.A00.A08(obj2, c8440Fe4.A04, null);
            }
        }
    }
}
