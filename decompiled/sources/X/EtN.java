package X;

import android.graphics.Canvas;
import java.util.List;

/* loaded from: classes5.dex */
public final class EtN extends C06G {
    public final int A00;
    public final C7377EtL A01;
    public final List<InterfaceC7487Exq> A02;

    public static final int A0y(C7376EtK c7376EtK) {
        C7384Etj.A0Y(c7376EtK, 0);
        List<InterfaceC7430Evn> list = c7376EtK.A01;
        int size = list.size();
        int iA0y = 1;
        for (int i = 0; i < size; i++) {
            InterfaceC7430Evn interfaceC7430Evn = list.get(i);
            if (interfaceC7430Evn instanceof EtM) {
                iA0y += A0y(((EtM) interfaceC7430Evn).A00);
            }
        }
        return iA0y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtN) {
                EtN etN = (EtN) obj;
                if (!C7384Etj.areEqual(this.A01, etN.A01) || !C7384Etj.areEqual(this.A02, etN.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A10(Canvas canvas) {
        int i;
        int i2;
        C7377EtL c7377EtL = this.A01;
        int iMax = Math.max(10, this.A00);
        C7523EzA c7523EzA = c7377EtL.A06;
        F0b f0b = c7523EzA.A07;
        synchronized (f0b) {
            i = c7523EzA.A00;
        }
        if (iMax > i) {
            c7523EzA.A03(iMax);
        }
        List<InterfaceC7487Exq> list = this.A02;
        int size = list.size();
        int iA00 = 0;
        while (iA00 < size) {
            iA00 = InterfaceC7487Exq.A00(canvas, c7377EtL, list, iA00);
        }
        synchronized (f0b) {
            i2 = c7523EzA.A00;
        }
        if (iMax < i2) {
            c7523EzA.A03(iMax);
        }
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0E(this.A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EtN(C7377EtL c7377EtL, List<? extends InterfaceC7487Exq> list) {
        this.A01 = c7377EtL;
        this.A02 = list;
        this.A00 = A0z(list);
    }

    public static final int A0z(List<? extends InterfaceC7487Exq> list) {
        InterfaceC7824FGf interfaceC7824FGf;
        int iA0y;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC7487Exq interfaceC7487Exq = list.get(i2);
            if (interfaceC7487Exq instanceof EtV) {
                EtV etV = (EtV) interfaceC7487Exq;
                C7376EtK c7376EtK = etV.A01;
                iA0y = (c7376EtK != null ? A0y(c7376EtK) : 0) + A0z(etV.A02);
            } else if (interfaceC7487Exq instanceof EtQ) {
                EtQ etQ = (EtQ) interfaceC7487Exq;
                C7376EtK c7376EtK2 = etQ.A03;
                iA0y = A0z(etQ.A04) + (c7376EtK2 != null ? A0y(c7376EtK2) : 0);
            } else {
                if (interfaceC7487Exq instanceof HwF) {
                    interfaceC7824FGf = ((HwF) interfaceC7487Exq).A03;
                } else {
                    if (!(interfaceC7487Exq instanceof C10438Hhk)) {
                        throw C3cG.A0q();
                    }
                    interfaceC7824FGf = ((C10438Hhk) interfaceC7487Exq).A08;
                }
                if (interfaceC7824FGf instanceof C7376EtK) {
                    iA0y = A0y((C7376EtK) interfaceC7824FGf);
                } else {
                    if (!(interfaceC7824FGf instanceof HCX)) {
                        throw C3cG.A0q();
                    }
                    iA0y = 0;
                }
            }
            i += iA0y;
        }
        return i;
    }
}
