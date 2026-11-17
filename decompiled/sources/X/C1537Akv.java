package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.Akv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1537Akv extends Ab8<NestedScrollNode> {
    public final Akx A00;
    public final NestedScrollDispatcher A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new NestedScrollNode(this.A00, this.A01);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1537Akv)) {
            return false;
        }
        C1537Akv c1537Akv = (C1537Akv) obj;
        return C7384Etj.areEqual(c1537Akv.A00, this.A00) && C7384Etj.areEqual(c1537Akv.A01, this.A01);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + C60R.A01(this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "nestedScroll";
        BHD bhd = asf.A02;
        bhd.A01("connection", this.A00);
        bhd.A01("dispatcher", this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // X.Ab8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void update(X.AbstractC1439Aj8 r3) {
        /*
            r2 = this;
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r3 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r3
            X.Akx r0 = r2.A00
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A01
            r3.A00 = r0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r3.A01
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r1.A01
            if (r0 != r3) goto L11
            r0 = 0
            r1.A01 = r0
        L11:
            if (r2 != 0) goto L36
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r2.<init>()
        L18:
            r3.A01 = r2
        L1a:
            boolean r0 = r3.isAttached
            if (r0 == 0) goto L35
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r3.A01
            r1.A01 = r3
            r0 = 0
            r1.A00 = r0
            r3.A02 = r0
            r0 = 12
            X.BUc r0 = X.C2328BUc.A00(r3, r0)
            r1.A02 = r0
            X.3UX r0 = r3.getCoroutineScope()
            r1.A03 = r0
        L35:
            return
        L36:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L1a
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537Akv.update(X.Aj8):void");
    }

    public C1537Akv(Akx akx, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = akx;
        this.A01 = nestedScrollDispatcher;
    }
}
