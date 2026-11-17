package androidx.compose.foundation.gestures;

import X.Akx;
import X.AnonymousClass006;
import X.HtJ;
import X.InterfaceC1180Adj;
import X.InterfaceC1284AgU;

/* loaded from: classes4.dex */
public final class ScrollableNestedScrollConnection implements Akx {
    public boolean A00;
    public final InterfaceC1284AgU A01;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3onPostFlingRZ2iAVY(long r6, long r8, X.HtJ<? super X.C1251Afj> r10) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = r10 instanceof X.C2311BTl
            if (r0 == 0) goto L55
            r3 = r10
            X.BTl r3 = (X.C2311BTl) r3
            int r0 = r3.$t
            if (r0 != r4) goto L55
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r1 = r3.A02
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L34
            if (r0 != r4) goto L5b
            long r8 = r3.A01
            X.Hwg.A00(r1)
        L26:
            X.Afj r1 = (X.C1251Afj) r1
            long r0 = r1.A00
        L2a:
            long r0 = X.C1251Afj.A01(r8, r0)
        L2e:
            X.Afj r2 = new X.Afj
            r2.<init>(r0)
            return r2
        L34:
            X.Hwg.A00(r1)
            boolean r0 = r5.A00
            if (r0 == 0) goto L52
            X.AgU r1 = r5.A01
            r0 = r1
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L47
            r0 = 0
            goto L2a
        L47:
            r3.A01 = r8
            r3.A00 = r4
            java.lang.Object r1 = r1.A99(r8, r3)
            if (r1 != r2) goto L26
            return r2
        L52:
            r0 = 0
            goto L2e
        L55:
            X.BTl r3 = new X.BTl
            r3.<init>(r5, r10, r4)
            goto L17
        L5b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo3onPostFlingRZ2iAVY(long, long, X.HtJ):java.lang.Object");
    }

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.A00) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.A01;
        if (scrollingLogic.A05.AOz()) {
            return 0L;
        }
        InterfaceC1180Adj interfaceC1180Adj = scrollingLogic.A05;
        float fA02 = scrollingLogic.A02(j2);
        float fA98 = interfaceC1180Adj.A98(ScrollingLogic.A00(scrollingLogic, fA02, fA02));
        return scrollingLogic.A04(ScrollingLogic.A00(scrollingLogic, fA98, fA98));
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public final /* synthetic */ long mo6onPreScrollOzD1aCk(long j, int i) {
        return 0L;
    }

    public ScrollableNestedScrollConnection(InterfaceC1284AgU interfaceC1284AgU, boolean z) {
        this.A01 = interfaceC1284AgU;
        this.A00 = z;
    }

    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo5onPreFlingQWom1Mo(long j, HtJ htJ) {
        return AnonymousClass006.A0a();
    }
}
