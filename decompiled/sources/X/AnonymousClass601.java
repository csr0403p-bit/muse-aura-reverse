package X;

/* renamed from: X.601, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass601 implements C20Z {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Incorrect types in method signature: (LX/F1E;ILX/20Z<-TT;>;)V */
    public AnonymousClass601(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb A[RETURN] */
    @Override // X.C20Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            int r0 = r11.$t
            if (r0 == 0) goto L31
            r4 = 3
            boolean r0 = r13 instanceof X.AnonymousClass609
            if (r0 == 0) goto L2b
            r3 = r13
            X.609 r3 = (X.AnonymousClass609) r3
            int r0 = r3.$t
            if (r0 != r4) goto L2b
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r3.A00 = r2
        L1b:
            java.lang.Object r1 = r3.A02
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto La1
            if (r0 == r2) goto Lc1
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.609 r3 = new X.609
            r3.<init>(r11, r13, r4)
            goto L1b
        L31:
            r3 = 0
            boolean r0 = r13 instanceof X.AnonymousClass609
            if (r0 == 0) goto L58
            r8 = r13
            X.609 r8 = (X.AnonymousClass609) r8
            int r0 = r8.$t
            if (r0 != r3) goto L58
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r8.A00 = r2
        L48:
            java.lang.Object r1 = r8.A02
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L5e
            if (r0 == r7) goto Lc1
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L58:
            X.609 r8 = new X.609
            r8.<init>(r11, r13, r3)
            goto L48
        L5e:
            X.Hwg.A00(r1)
            java.lang.Object r6 = r11.A01
            X.20Z r6 = (X.C20Z) r6
            java.util.Set r12 = (java.util.Set) r12
            X.AIY r10 = new X.AIY
            r10.<init>()
            java.lang.Object r5 = r11.A00
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r4 = r5.length
        L71:
            if (r3 >= r4) goto L90
            r2 = r5[r3]
            java.util.Iterator r1 = r12.iterator()
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            boolean r0 = X.AbstractC2159Azp.A12(r2, r0, r7)
            if (r0 == 0) goto L79
            r10.add(r2)
            goto L79
        L8d:
            int r3 = r3 + 1
            goto L71
        L90:
            X.AIY r1 = X.AIX.A00(r10)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc4
            r8.A00 = r7
            java.lang.Object r0 = r6.emit(r1, r8)
            goto Lb9
        La1:
            X.Hwg.A00(r1)
            java.lang.Object r1 = r11.A01
            X.F1E r1 = (X.F1E) r1
            int r0 = r1.element
            if (r0 < r2) goto Lbc
            java.lang.Object r1 = r11.A00
            X.20Z r1 = (X.C20Z) r1
            r0 = 0
            r3.A01 = r0
            r3.A00 = r2
            java.lang.Object r0 = r1.emit(r12, r3)
        Lb9:
            if (r0 != r9) goto Lc4
            return r9
        Lbc:
            int r0 = r0 + 1
            r1.element = r0
            goto Lc4
        Lc1:
            X.Hwg.A00(r1)
        Lc4:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass601.emit(java.lang.Object, X.HtJ):java.lang.Object");
    }
}
