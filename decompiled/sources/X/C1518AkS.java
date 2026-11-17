package X;

/* renamed from: X.AkS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1518AkS {
    public final C0910AHm<ASY> A00 = C0910AHm.A01(new ASY[16]);
    public static final C1518AkS A02 = new C1518AkS();
    public static final C1518AkS A01 = new C1518AkS();
    public static final C1518AkS A03 = new C1518AkS();

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0046, code lost:
    
        X.AbstractC1414Aij.A09(r5, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1518AkS r11) {
        /*
            r8 = 7
            X.AkS r0 = X.C1518AkS.A02
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r11 == r0) goto Lad
            X.AkS r0 = X.C1518AkS.A01
            if (r11 == r0) goto La8
            X.AHm<X.ASY> r0 = r11.A00
            int r9 = r0.A00
            if (r9 != 0) goto L19
            java.lang.String r1 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
        L18:
            return
        L19:
            T[] r7 = r0.A01
            r6 = 0
        L1c:
            if (r6 >= r9) goto L18
            r1 = r7[r6]
            X.ASY r1 = (X.ASY) r1
            r11 = 1024(0x400, float:1.435E-42)
            r0 = r1
            X.Aj8 r0 = (X.AbstractC1439Aj8) r0
            X.Aj8 r0 = r0.node
            boolean r0 = r0.isAttached
            if (r0 != 0) goto L37
            java.lang.String r0 = "visitChildren called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L37:
            X.AHm r5 = X.C0910AHm.A00()
            X.Aj8 r1 = (X.AbstractC1439Aj8) r1
            X.Aj8 r10 = r1.node
            X.Aj8 r0 = r10.child
            if (r0 == 0) goto L54
            r5.A0G(r0)
        L46:
            int r0 = r5.A00
            if (r0 == 0) goto L6c
            r4 = 1
            X.Aj8 r10 = X.C0910AHm.A03(r5, r0)
            int r0 = r10.aggregateChildKindSet
            r0 = r0 & r11
            if (r0 != 0) goto L5a
        L54:
            X.AbstractC1414Aij.A09(r5, r10)
            goto L46
        L58:
            if (r10 == 0) goto L46
        L5a:
            int r0 = r10.kindSet
            r0 = r0 & r11
            if (r0 == 0) goto La5
            r3 = 0
        L60:
            boolean r0 = r10 instanceof X.C1506AkD
            if (r0 == 0) goto L6f
            X.AkD r10 = (X.C1506AkD) r10
            boolean r0 = r10.Ab9(r8)
            if (r0 == 0) goto L9e
        L6c:
            int r6 = r6 + 1
            goto L1c
        L6f:
            int r0 = r10.kindSet
            r0 = r0 & r11
            if (r0 == 0) goto L9e
            boolean r0 = r10 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L9e
            r0 = r10
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r2 = r0.A00
            r1 = 0
        L7e:
            if (r2 == 0) goto L9b
            int r0 = r2.kindSet
            r0 = r0 & r11
            if (r0 == 0) goto L8a
            int r1 = r1 + 1
            if (r1 != r4) goto L8d
            r10 = r2
        L8a:
            X.Aj8 r2 = r2.child
            goto L7e
        L8d:
            X.AHm r3 = X.C8j4.A0W(r3)
            if (r10 == 0) goto L97
            r3.A0G(r10)
            r10 = 0
        L97:
            r3.A0G(r2)
            goto L8a
        L9b:
            if (r1 != r4) goto L9e
            goto La2
        L9e:
            X.Aj8 r10 = X.AbstractC1414Aij.A00(r3)
        La2:
            if (r10 == 0) goto L46
            goto L60
        La5:
            X.Aj8 r10 = r10.child
            goto L58
        La8:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r1)
            throw r0
        Lad:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1518AkS.A00(X.AkS):void");
    }
}
