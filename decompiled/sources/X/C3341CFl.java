package X;

import java.util.ArrayList;

/* renamed from: X.CFl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3341CFl extends AbstractC3342CFm {
    public int A00;
    public final ArrayList<Object> A01 = new ArrayList<>(32);

    @Override // X.AbstractC3342CFm
    public final void A08() {
        for (int i = 0; i < this.A00; i++) {
            Object objA0C = A0C(i);
            if (objA0C instanceof AbstractC3342CFm) {
                ((AbstractC3342CFm) objA0C).A05();
            }
        }
    }

    private void A01(String str) {
        if (!this.A03) {
            throw new IllegalStateException("Expected object to be mutable");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(FGI.A0M("key=", str));
        }
    }

    @Override // X.AbstractC3342CFm
    public final void A06() {
        this.A01.clear();
        this.A00 = 0;
    }

    @Override // X.AbstractC3342CFm
    public final void A07() {
        super.A01.A01.AaC(this);
    }

    @Override // X.AbstractC3342CFm
    public final void A09(int i) {
        int i2 = this.A00 - i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                this.A01.trimToSize();
                return;
            }
            ArrayList<Object> arrayList = this.A01;
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            i2 = i3;
        }
    }

    public final Object A0C(int i) {
        if (i < 0 || i >= this.A00) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        return this.A01.get((i * 2) + 1);
    }

    public final String A0D(int i) {
        if (i < 0 || i >= this.A00) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        return (String) this.A01.get(i * 2);
    }

    public static void A00(C3341CFl c3341CFl, Object obj, String str) {
        c3341CFl.A01(str);
        ArrayList<Object> arrayList = c3341CFl.A01;
        arrayList.add(str);
        arrayList.add(obj);
        c3341CFl.A00++;
    }

    public final void A0E(AbstractC3342CFm abstractC3342CFm, String str) {
        C1H.A01(abstractC3342CFm, "subParams cannot be null!");
        A01(str);
        abstractC3342CFm.A04();
        A00(this, abstractC3342CFm, str);
        abstractC3342CFm.A04();
        abstractC3342CFm.A00 = this;
    }
}
