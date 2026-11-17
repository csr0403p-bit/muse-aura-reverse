package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class E9T {
    public Bx8 A00;
    public final InterfaceC6501E9i A01;
    public final CPK A02;

    public E9T(Bx8 bx8, InterfaceC6501E9i interfaceC6501E9i, CPK cpk, Set set) {
        this.A01 = interfaceC6501E9i;
        this.A02 = cpk;
        this.A00 = bx8;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            A00(this, null, str, str, 0, str.length(), 1, 2, 0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (java.lang.Character.isLowSurrogate(r1) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0081, code lost:
    
        if (java.lang.Character.isHighSurrogate(r1) == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[EDGE_INSN: B:77:0x0035->B:20:0x0035 BREAK  A[LOOP:3: B:24:0x003b->B:35:0x0051], EDGE_INSN: B:78:0x0035->B:20:0x0035 BREAK  A[LOOP:3: B:24:0x003b->B:35:0x0051, LOOP_LABEL: LOOP:3: B:24:0x003b->B:35:0x0051]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(android.text.Editable r9, android.view.inputmethod.InputConnection r10, int r11, int r12, boolean r13) {
        /*
            r7 = 0
            if (r9 == 0) goto L3a
            if (r11 < 0) goto L3a
            if (r12 < 0) goto L3a
            int r6 = android.text.Selection.getSelectionStart(r9)
            int r5 = android.text.Selection.getSelectionEnd(r9)
            r3 = -1
            if (r6 == r3) goto L3a
            if (r5 == r3) goto L3a
            if (r6 != r5) goto L3a
            if (r13 == 0) goto L97
            int r4 = java.lang.Math.max(r11, r7)
            int r0 = r9.length()
            if (r6 < 0) goto L26
            if (r0 < r6) goto L26
            if (r4 >= 0) goto L6b
        L26:
            r6 = -1
        L27:
            int r8 = java.lang.Math.max(r12, r7)
            int r4 = r9.length()
            if (r5 < 0) goto L35
            if (r4 < r5) goto L35
            if (r8 >= 0) goto L3b
        L35:
            r5 = -1
        L36:
            if (r6 == r3) goto L3a
            if (r5 != r3) goto La5
        L3a:
            return r7
        L3b:
            r2 = 0
        L3c:
            if (r8 != 0) goto L3f
            goto L36
        L3f:
            if (r5 < r4) goto L45
            r5 = r4
            if (r2 == 0) goto L36
            goto L35
        L45:
            char r1 = r9.charAt(r5)
            if (r2 == 0) goto L56
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L35
            int r8 = r8 + (-1)
            int r5 = r5 + 1
            goto L3b
        L56:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L61
            int r8 = r8 + (-1)
            int r5 = r5 + 1
            goto L3c
        L61:
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 != 0) goto L35
            int r5 = r5 + 1
            r2 = 1
            goto L3f
        L6b:
            r2 = 0
        L6c:
            if (r4 != 0) goto L6f
            goto L27
        L6f:
            int r6 = r6 + (-1)
            if (r6 >= 0) goto L77
            r6 = 0
            if (r2 == 0) goto L27
            goto L26
        L77:
            char r1 = r9.charAt(r6)
            if (r2 == 0) goto L86
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L26
            int r4 = r4 + (-1)
            goto L6b
        L86:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L8f
            int r4 = r4 + (-1)
            goto L6c
        L8f:
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 != 0) goto L26
            r2 = 1
            goto L6f
        L97:
            int r6 = r6 - r11
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + r12
            int r0 = r9.length()
            int r5 = java.lang.Math.min(r5, r0)
        La5:
            java.lang.Class<X.E9U> r0 = X.E9U.class
            java.lang.Object[] r4 = r9.getSpans(r6, r5, r0)
            X.E9U[] r4 = (X.E9U[]) r4
            if (r4 == 0) goto L3a
            int r3 = r4.length
            if (r3 <= 0) goto L3a
            r2 = 0
        Lb3:
            r0 = r4[r2]
            int r1 = r9.getSpanStart(r0)
            int r0 = r9.getSpanEnd(r0)
            int r6 = java.lang.Math.min(r1, r6)
            int r5 = java.lang.Math.max(r0, r5)
            int r2 = r2 + 1
            if (r2 < r3) goto Lb3
            int r1 = java.lang.Math.max(r6, r7)
            int r0 = r9.length()
            int r0 = java.lang.Math.min(r5, r0)
            r10.beginBatchEdit()
            r9.delete(r1, r0)
            r10.endBatchEdit()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9T.A02(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0190, code lost:
    
        return new X.E9V(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        if (r45 < r7) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed A[PHI: r9
  0x00ed: PHI (r9v2 X.E9W) = 
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v3 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
  (r9v1 X.E9W)
 binds: [B:28:0x0074, B:30:0x0077, B:32:0x007c, B:34:0x008b, B:42:0x00a3, B:43:0x00a5, B:73:0x0106, B:79:0x011a, B:60:0x00d9, B:64:0x00e5, B:49:0x00b9, B:40:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e A[PHI: r1 r10
  0x015e: PHI (r1v29 int[]) = (r1v27 int[]), (r1v28 int[]), (r1v30 int[]) binds: [B:138:0x0200, B:134:0x01f4, B:93:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x015e: PHI (r10v12 int) = (r10v10 int), (r10v9 int), (r10v8 int) binds: [B:138:0x0200, B:134:0x01f4, B:93:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(X.E9T r37, X.E9W r38, java.lang.CharSequence r39, java.lang.String r40, int r41, int r42, int r43, int r44, int r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9T.A00(X.E9T, X.E9W, java.lang.CharSequence, java.lang.String, int, int, int, int, int, boolean):java.lang.Object");
    }

    private boolean A03(CMN cmn, CharSequence charSequence, int i, int i2) {
        if ((cmn.A02 & 3) == 0) {
            Bx8 bx8 = this.A00;
            CMM cmmA00 = CMN.A00(cmn);
            int iA02 = cmmA00.A02(8);
            if (iA02 != 0) {
                cmmA00.A04.getShort(iA02 + cmmA00.A00);
            }
            C3424CMn c3424CMn = (C3424CMn) bx8;
            ThreadLocal<StringBuilder> threadLocal = C3424CMn.A01;
            if (threadLocal.get() == null) {
                threadLocal.set(C60O.A0w());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c3424CMn.A00.hasGlyph(sb.toString());
            int i3 = cmn.A02 & 4;
            int i4 = i3 | 1;
            if (zHasGlyph) {
                i4 = i3 | 2;
            }
            cmn.A02 = i4;
        }
        return AnonymousClass002.A1Q(cmn.A02 & 3, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(android.text.Editable r7, android.view.KeyEvent r8, boolean r9) {
        /*
            int r0 = r8.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            r6 = 0
            if (r0 != 0) goto L49
            int r5 = android.text.Selection.getSelectionStart(r7)
            int r1 = android.text.Selection.getSelectionEnd(r7)
            r0 = -1
            if (r5 == r0) goto L49
            if (r1 == r0) goto L49
            if (r5 != r1) goto L49
            java.lang.Class<X.E9U> r0 = X.E9U.class
            java.lang.Object[] r4 = r7.getSpans(r5, r1, r0)
            X.E9U[] r4 = (X.E9U[]) r4
            if (r4 == 0) goto L49
            int r3 = r4.length
            if (r3 <= 0) goto L49
            r2 = 0
        L2a:
            r0 = r4[r2]
            int r1 = r7.getSpanStart(r0)
            int r0 = r7.getSpanEnd(r0)
            if (r9 == 0) goto L46
            if (r1 == r5) goto L3c
        L38:
            if (r5 <= r1) goto L41
            if (r5 >= r0) goto L41
        L3c:
            r7.delete(r1, r0)
            r0 = 1
            return r0
        L41:
            int r2 = r2 + 1
            if (r2 >= r3) goto L49
            goto L2a
        L46:
            if (r0 == r5) goto L3c
            goto L38
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9T.A01(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }
}
