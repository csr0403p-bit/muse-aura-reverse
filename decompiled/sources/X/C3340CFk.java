package X;

import java.util.ArrayList;

/* renamed from: X.CFk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3340CFk extends AbstractC3342CFm {
    public final ArrayList<Object> A00 = C60O.A11(16);

    public static void A00(C3340CFk c3340CFk, Object obj) {
        if (!c3340CFk.A03) {
            throw new IllegalStateException("Expected object to be mutable");
        }
        c3340CFk.A00.add(obj);
    }

    @Override // X.AbstractC3342CFm
    public final void A06() {
        this.A00.clear();
    }

    @Override // X.AbstractC3342CFm
    public final void A07() {
        this.A01.A00.AaC(this);
    }

    @Override // X.AbstractC3342CFm
    public final void A08() {
        ArrayList<Object> arrayList = this.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof AbstractC3342CFm) {
                ((AbstractC3342CFm) obj).A05();
            }
        }
    }

    @Override // X.AbstractC3342CFm
    public final void A09(int i) {
        ArrayList<Object> arrayList = this.A00;
        arrayList.size();
        int size = arrayList.size() - i;
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                arrayList.trimToSize();
                return;
            } else {
                arrayList.remove(arrayList.size() - 1);
                size = i2;
            }
        }
    }

    public final void A0C(AbstractC3342CFm abstractC3342CFm) {
        C1H.A01(abstractC3342CFm, "subParams cannot be null!");
        if (!this.A03) {
            throw new IllegalStateException("Expected object to be mutable");
        }
        abstractC3342CFm.A04();
        A00(this, abstractC3342CFm);
        abstractC3342CFm.A04();
        abstractC3342CFm.A00 = this;
    }
}
