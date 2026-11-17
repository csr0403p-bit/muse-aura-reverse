package X;

/* renamed from: X.AgF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1270AgF {
    public final C0910AHm<C1281AgR> A00 = C0910AHm.A01(new C1281AgR[16]);

    public final void A00(Throwable th) {
        C0910AHm<C1281AgR> c0910AHm = this.A00;
        int i = c0910AHm.A00;
        Hm1[] hm1Arr = new Hm1[i];
        for (int i2 = 0; i2 < i; i2++) {
            hm1Arr[i2] = c0910AHm.A01[i2].A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            hm1Arr[i3].A5x(th);
        }
        if (c0910AHm.A00 != 0) {
            throw C3cG.A0Q("uncancelled requests present");
        }
    }
}
