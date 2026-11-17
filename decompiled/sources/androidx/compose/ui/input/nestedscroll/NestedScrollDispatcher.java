package androidx.compose.ui.input.nestedscroll;

import X.C2328BUc;
import X.C3UX;
import X.C3cG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class NestedScrollDispatcher {
    public NestedScrollNode A00;
    public NestedScrollNode A01;
    public Function0<? extends C3UX> A02 = C2328BUc.A00(this, 11);
    public C3UX A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(long r11, long r13, X.HtJ<? super X.C1251Afj> r15) {
        /*
            r10 = this;
            r3 = 21
            boolean r0 = r15 instanceof X.C2310BTk
            if (r0 == 0) goto L2b
            r9 = r15
            X.BTk r9 = (X.C2310BTk) r9
            int r0 = r9.$t
            if (r0 != r3) goto L2b
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r9.A00 = r2
        L18:
            java.lang.Object r4 = r9.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L5d
            if (r0 == r2) goto L5d
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.BTk r9 = new X.BTk
            r9.<init>(r10, r15, r3)
            goto L18
        L31:
            X.Hwg.A00(r4)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r10.A01
            if (r0 == 0) goto L53
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r0.A01()
            if (r0 == 0) goto L53
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r10.A01
            if (r0 == 0) goto L5a
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r0.A01()
            if (r4 == 0) goto L5a
            r9.A00 = r2
        L4a:
            r5 = r11
            r7 = r13
            java.lang.Object r4 = r4.mo3onPostFlingRZ2iAVY(r5, r7, r9)
            if (r4 != r3) goto L60
            return r3
        L53:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r10.A00
            if (r4 == 0) goto L5a
            r9.A00 = r1
            goto L4a
        L5a:
            r0 = 0
            goto L64
        L5d:
            X.Hwg.A00(r4)
        L60:
            X.Afj r4 = (X.C1251Afj) r4
            long r0 = r4.A00
        L64:
            X.Afj r3 = new X.Afj
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A00(long, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(long r6, X.HtJ<? super X.C1251Afj> r8) {
        /*
            r5 = this;
            r3 = 22
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L49
            r4 = r8
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L49
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L4f
            X.Hwg.A00(r3)
        L26:
            X.Afj r3 = (X.C1251Afj) r3
            long r0 = r3.A00
        L2a:
            X.Afj r2 = new X.Afj
            r2.<init>(r0)
            return r2
        L30:
            X.Hwg.A00(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r5.A01
            if (r0 == 0) goto L46
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r0.A01()
            if (r0 == 0) goto L46
            r4.A00 = r1
            java.lang.Object r3 = r0.mo5onPreFlingQWom1Mo(r6, r4)
            if (r3 != r2) goto L26
            return r2
        L46:
            r0 = 0
            goto L2a
        L49:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r8, r3)
            goto L18
        L4f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A01(long, X.HtJ):java.lang.Object");
    }

    public final C3UX A02() {
        C3UX c3uxInvoke = this.A02.invoke();
        if (c3uxInvoke != null) {
            return c3uxInvoke;
        }
        throw C3cG.A0Q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
