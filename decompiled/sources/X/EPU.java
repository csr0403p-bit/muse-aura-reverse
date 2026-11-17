package X;

/* loaded from: classes5.dex */
public final class EPU {
    public boolean A00;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPM;Ljava/util/Set<+LX/EPM;>;Ljava/lang/String;Ljava/lang/String;LX/F0w;LX/FBB;LX/3UX;Ljava/lang/String;LX/HtJ<-Ljava/util/List<+Ljava/lang/Object;>;>;)Ljava/lang/Object; */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0096: RETURN (r14 I:java.lang.Object) (LINE:150), block:B:27:0x0096 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r20, X.FBB r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.Set r25, X.HtJ r26, X.C3UX r27, X.EPM r28, X.EPU r29) {
        /*
            r10 = 0
            r3 = r26
            boolean r0 = r3 instanceof X.EPX
            r6 = r29
            if (r0 == 0) goto L27
            r5 = r3
            X.EPX r5 = (X.EPX) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.label = r2
        L17:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r2 = "FxAccessLibraryUnifiedBloksImpl"
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L31
            java.lang.Object r14 = r5.L$10
            goto L2d
        L27:
            X.EPX r5 = new X.EPX
            r5.<init>(r3, r6)
            goto L17
        L2d:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L90
            return r14
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r4)
            X.EPM r0 = X.EPM.A0N
            r4 = r28
            if (r4 == r0) goto L97
            r15 = r25
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L97
            r8 = r20
            r8.getPackageName()
            com.facebook.aura.analytics.accesslibrary.AuraAccessLibraryLogger r20 = new com.facebook.aura.analytics.accesslibrary.AuraAccessLibraryLogger
            r20.<init>()
            java.util.ArrayList r14 = X.C3cG.A0h()
            X.Hqv r17 = X.C3cG.A0z()
            X.EPG r7 = new X.EPG     // Catch: java.lang.Exception -> L90
            r9 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r18 = r27
            r16 = r10
            r19 = r4
            r21 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Exception -> L90
            r5.L$0 = r10     // Catch: java.lang.Exception -> L90
            r5.L$1 = r10     // Catch: java.lang.Exception -> L90
            r5.L$2 = r10     // Catch: java.lang.Exception -> L90
            r5.L$3 = r10     // Catch: java.lang.Exception -> L90
            r5.L$4 = r10     // Catch: java.lang.Exception -> L90
            r5.L$5 = r10     // Catch: java.lang.Exception -> L90
            r5.L$6 = r10     // Catch: java.lang.Exception -> L90
            r5.L$7 = r10     // Catch: java.lang.Exception -> L90
            r5.L$8 = r10     // Catch: java.lang.Exception -> L90
            r5.L$9 = r10     // Catch: java.lang.Exception -> L90
            r5.L$10 = r14     // Catch: java.lang.Exception -> L90
            r5.L$11 = r10     // Catch: java.lang.Exception -> L90
            r5.label = r1     // Catch: java.lang.Exception -> L90
            java.lang.Object r0 = X.AbstractC10627Hzt.A00(r7, r5)     // Catch: java.lang.Exception -> L90
            if (r0 != r3) goto L8f
            return r3
        L8f:
            return r14
        L90:
            r1 = move-exception
            java.lang.String r0 = "Read Auth Data Exception"
            android.util.Log.e(r2, r0, r1)
            return r14
        L97:
            java.lang.String r0 = "Invalid AppSource or CredentialSource"
            android.util.Log.e(r2, r0)
            X.AGi r0 = X.C0881AGi.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPU.A00(android.content.Context, X.FBB, java.lang.String, java.lang.String, java.lang.String, java.util.Set, X.HtJ, X.3UX, X.EPM, X.EPU):java.lang.Object");
    }
}
