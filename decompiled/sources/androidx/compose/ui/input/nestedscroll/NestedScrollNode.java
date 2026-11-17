package androidx.compose.ui.input.nestedscroll;

import X.AWx;
import X.AbstractC1235AfP;
import X.AbstractC1439Aj8;
import X.Akx;
import X.BUX;
import X.C10543Hqv;
import X.C2328BUc;
import X.C3UX;
import X.C3cG;
import X.Hxb;
import X.InterfaceC1237AfR;

/* loaded from: classes4.dex */
public final class NestedScrollNode extends AbstractC1439Aj8 implements InterfaceC1237AfR, Akx {
    public Akx A00;
    public NestedScrollDispatcher A01;
    public NestedScrollNode A02;
    public final Object A03;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3onPostFlingRZ2iAVY(long r11, long r13, X.HtJ<? super X.C1251Afj> r15) {
        /*
            r10 = this;
            r5 = r11
            r7 = r13
            boolean r0 = r15 instanceof X.C1538Akw
            if (r0 == 0) goto L75
            r9 = r15
            X.Akw r9 = (X.C1538Akw) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r9.label = r2
        L14:
            java.lang.Object r4 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r9.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 == r0) goto L47
            if (r1 != r2) goto L7b
            long r0 = r9.J$0
            X.Hwg.A00(r4)
        L27:
            X.Afj r4 = (X.C1251Afj) r4
            long r2 = r4.A00
        L2b:
            long r1 = X.C1251Afj.A02(r0, r2)
            X.Afj r0 = new X.Afj
            r0.<init>(r1)
            return r0
        L35:
            X.Hwg.A00(r4)
            X.Akx r4 = r10.A00
            r9.J$0 = r11
            r9.J$1 = r13
            r9.label = r0
            java.lang.Object r4 = r4.mo3onPostFlingRZ2iAVY(r5, r7, r9)
            if (r4 != r3) goto L4e
            return r3
        L47:
            long r7 = r9.J$1
            long r5 = r9.J$0
            X.Hwg.A00(r4)
        L4e:
            X.Afj r4 = (X.C1251Afj) r4
            long r0 = r4.A00
            boolean r4 = r10.isAttached
            if (r4 == 0) goto L6f
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r10.A01()
        L5a:
            if (r4 == 0) goto L72
            long r5 = X.C1251Afj.A02(r5, r0)
            long r7 = X.C1251Afj.A01(r7, r0)
            r9.J$0 = r0
            r9.label = r2
            java.lang.Object r4 = r4.mo3onPostFlingRZ2iAVY(r5, r7, r9)
            if (r4 != r3) goto L27
            return r3
        L6f:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r10.A02
            goto L5a
        L72:
            r2 = 0
            goto L2b
        L75:
            X.Akw r9 = new X.Akw
            r9.<init>(r10, r15)
            goto L14
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo3onPostFlingRZ2iAVY(long, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5onPreFlingQWom1Mo(long r9, X.HtJ<? super X.C1251Afj> r11) {
        /*
            r8 = this;
            r7 = 2
            boolean r0 = r11 instanceof X.C2311BTl
            if (r0 == 0) goto L6c
            r6 = r11
            X.BTl r6 = (X.C2311BTl) r6
            int r0 = r6.$t
            if (r0 != r7) goto L6c
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r2 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 == r1) goto L4f
            if (r0 != r7) goto L72
            long r3 = r6.A01
            X.Hwg.A00(r2)
        L29:
            X.Afj r2 = (X.C1251Afj) r2
            long r0 = r2.A00
            long r1 = X.C1251Afj.A02(r3, r0)
            X.Afj r0 = new X.Afj
            r0.<init>(r1)
            return r0
        L37:
            X.Hwg.A00(r2)
            boolean r0 = r8.isAttached
            if (r0 == 0) goto L59
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r8.A01()
            if (r0 == 0) goto L59
            r6.A01 = r9
            r6.A00 = r1
            java.lang.Object r2 = r0.mo5onPreFlingQWom1Mo(r9, r6)
            if (r2 != r5) goto L54
            return r5
        L4f:
            long r9 = r6.A01
            X.Hwg.A00(r2)
        L54:
            X.Afj r2 = (X.C1251Afj) r2
            long r3 = r2.A00
            goto L5b
        L59:
            r3 = 0
        L5b:
            X.Akx r2 = r8.A00
            long r0 = X.C1251Afj.A01(r9, r3)
            r6.A01 = r3
            r6.A00 = r7
            java.lang.Object r2 = r2.mo5onPreFlingQWom1Mo(r0, r6)
            if (r2 != r5) goto L29
            return r5
        L6c:
            X.BTl r6 = new X.BTl
            r6.<init>(r8, r11, r7)
            goto L17
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo5onPreFlingQWom1Mo(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[PHI: r4
  0x007c: PHI (r4v2 X.AHm) = (r4v1 X.AHm), (r4v1 X.AHm), (r4v4 X.AHm) binds: [B:26:0x0051, B:28:0x0055, B:39:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollNode A01() {
        /*
            r10 = this;
            boolean r0 = r10.isAttached
            if (r0 == 0) goto L97
            r7 = 262144(0x40000, float:3.67342E-40)
            X.Aj8 r1 = r10.node
            boolean r0 = r1.isAttached
            if (r0 != 0) goto L16
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L16:
            X.Aj8 r8 = r1.parent
            X.AjM r6 = X.AbstractC1414Aij.A04(r10)
        L1c:
            r9 = 0
            if (r6 == 0) goto L95
            int r0 = X.C1438Aj7.A00(r6, r7)
            if (r0 == 0) goto L86
        L25:
            if (r8 == 0) goto L86
            int r0 = r8.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L83
            r5 = r8
            r4 = r9
        L2e:
            boolean r0 = r5 instanceof X.InterfaceC1237AfR
            if (r0 == 0) goto L4e
            r2 = r5
            X.AfR r2 = (X.InterfaceC1237AfR) r2
            java.lang.String r1 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode"
            java.lang.Object r0 = r2.AM2()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4e
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r2.getClass()
            if (r1 != r0) goto L4e
        L4b:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
            return r2
        L4e:
            int r0 = r5.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L7c
            boolean r0 = r5 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L7c
            r0 = r5
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r3 = r0.A00
            r2 = 0
        L5d:
            r1 = 1
            if (r3 == 0) goto L79
            int r0 = r3.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L6a
            int r2 = r2 + 1
            if (r2 != r1) goto L6d
            r5 = r3
        L6a:
            X.Aj8 r3 = r3.child
            goto L5d
        L6d:
            X.AHm r4 = X.C8j5.A0K(r4)
            X.Aj8 r5 = X.C8j4.A0X(r4, r5)
            r4.A0G(r3)
            goto L6a
        L79:
            if (r2 != r1) goto L7c
            goto L80
        L7c:
            X.Aj8 r5 = X.AbstractC1414Aij.A00(r4)
        L80:
            if (r5 == 0) goto L83
            goto L2e
        L83:
            X.Aj8 r8 = r8.parent
            goto L25
        L86:
            X.AjM r6 = r6.A0E()
            if (r6 == 0) goto L93
            X.Aj7 r0 = r6.A0f
            if (r0 == 0) goto L93
            X.Aj8 r8 = r0.A06
            goto L1c
        L93:
            r8 = r9
            goto L1c
        L95:
            r2 = r9
            goto L4b
        L97:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.A01():androidx.compose.ui.input.nestedscroll.NestedScrollNode");
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        nestedScrollDispatcher.A01 = this;
        nestedScrollDispatcher.A00 = null;
        this.A02 = null;
        nestedScrollDispatcher.A02 = C2328BUc.A00(this, 12);
        nestedScrollDispatcher.A03 = getCoroutineScope();
    }

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollNode nestedScrollNodeA01;
        long jMo4onPostScrollDzOQY0M = this.A00.mo4onPostScrollDzOQY0M(j, j2, i);
        return AWx.A05(jMo4onPostScrollDzOQY0M, (!this.isAttached || (nestedScrollNodeA01 = A01()) == null) ? 0L : nestedScrollNodeA01.mo4onPostScrollDzOQY0M(AWx.A05(j, jMo4onPostScrollDzOQY0M), AWx.A04(j2, jMo4onPostScrollDzOQY0M), i));
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo6onPreScrollOzD1aCk(long j, int i) {
        NestedScrollNode nestedScrollNodeA01;
        long jMo6onPreScrollOzD1aCk = (!this.isAttached || (nestedScrollNodeA01 = A01()) == null) ? 0L : nestedScrollNodeA01.mo6onPreScrollOzD1aCk(j, i);
        return AWx.A05(jMo6onPreScrollOzD1aCk, this.A00.mo6onPreScrollOzD1aCk(AWx.A04(j, jMo6onPreScrollOzD1aCk), i));
    }

    public NestedScrollNode(Akx akx, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = akx;
        this.A01 = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.A03 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public static final C3UX A00(NestedScrollNode nestedScrollNode) {
        C3UX c3uxA00;
        NestedScrollNode nestedScrollNodeA01 = nestedScrollNode.A01();
        if ((nestedScrollNodeA01 == null || (c3uxA00 = A00(nestedScrollNodeA01)) == null || !Hxb.A04(c3uxA00)) && (c3uxA00 = nestedScrollNode.A01.A03) == null) {
            throw C3cG.A0Q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return c3uxA00;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC1235AfP.A03(this, BUX.A00(c10543HqvA0z, 24));
        NestedScrollNode nestedScrollNode = (NestedScrollNode) ((InterfaceC1237AfR) c10543HqvA0z.element);
        this.A02 = nestedScrollNode;
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        nestedScrollDispatcher.A00 = nestedScrollNode;
        if (nestedScrollDispatcher.A01 == this) {
            nestedScrollDispatcher.A01 = null;
        }
    }
}
