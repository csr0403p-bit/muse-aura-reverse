package X;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Hu1 {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Z<-TT;>;LX/HxV<+TT;>;ZLX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:19:0x0055, B:20:0x0058, B:24:0x006e, B:26:0x0076, B:23:0x006b, B:18:0x0050), top: B:45:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.HtJ r7, X.HxV r8, X.C20Z r9, boolean r10) throws java.lang.Throwable {
        /*
            r6 = 1
            boolean r0 = r7 instanceof X.C8909FtR
            if (r0 == 0) goto L34
            r5 = r7
            X.FtR r5 = (X.C8909FtR) r5
            int r0 = r5.$t
            if (r0 != r6) goto L34
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r0 = r5.A05
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.A00
            r3 = 2
            r2 = 0
            if (r1 == 0) goto L49
            if (r1 == r6) goto L3a
            if (r1 != r3) goto La0
            boolean r10 = r5.A06
            java.lang.Object r1 = r5.A03
            X.GCW r1 = (X.GCW) r1
            java.lang.Object r8 = r5.A02
            X.HxV r8 = (X.HxV) r8
            java.lang.Object r9 = r5.A01
            X.20Z r9 = (X.C20Z) r9
            goto L55
        L34:
            X.FtR r5 = new X.FtR
            r5.<init>(r7)
            goto L17
        L3a:
            boolean r10 = r5.A06
            java.lang.Object r1 = r5.A03
            X.GCW r1 = (X.GCW) r1
            java.lang.Object r8 = r5.A02
            X.HxV r8 = (X.HxV) r8
            java.lang.Object r9 = r5.A01
            X.20Z r9 = (X.C20Z) r9
            goto L6b
        L49:
            X.Hwg.A00(r0)
            boolean r0 = r9 instanceof X.C10594Hxk
            if (r0 != 0) goto La8
            X.GCW r1 = r8.APO()     // Catch: java.lang.Throwable -> L97
            goto L58
        L55:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L97
        L58:
            r5.A01 = r9     // Catch: java.lang.Throwable -> L97
            r5.A02 = r8     // Catch: java.lang.Throwable -> L97
            r5.A03 = r1     // Catch: java.lang.Throwable -> L97
            r5.A04 = r2     // Catch: java.lang.Throwable -> L97
            r5.A06 = r10     // Catch: java.lang.Throwable -> L97
            r5.A00 = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r1.A01(r5)     // Catch: java.lang.Throwable -> L97
            if (r0 != r4) goto L6e
            goto L8d
        L6b:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L97
        L6e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L97
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r1.A00()     // Catch: java.lang.Throwable -> L97
            r5.A01 = r9     // Catch: java.lang.Throwable -> L97
            r5.A02 = r8     // Catch: java.lang.Throwable -> L97
            r5.A03 = r1     // Catch: java.lang.Throwable -> L97
            r5.A04 = r2     // Catch: java.lang.Throwable -> L97
            r5.A06 = r10     // Catch: java.lang.Throwable -> L97
            r5.A00 = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r9.emit(r0, r5)     // Catch: java.lang.Throwable -> L97
            if (r0 != r4) goto L58
            goto L8e
        L8d:
            return r4
        L8e:
            return r4
        L8f:
            if (r10 == 0) goto L94
            r8.A5w(r2)
        L94:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L97:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r1 = move-exception
            if (r10 == 0) goto La7
            X.AbstractC7753FDf.A00(r0, r8)
            throw r1
        La0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        La7:
            throw r1
        La8:
            X.Hxk r9 = (X.C10594Hxk) r9
            java.lang.Throwable r1 = r9.A00
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hu1.A00(X.HtJ, X.HxV, X.20Z, boolean):java.lang.Object");
    }

    public static final <T> C20Q<T> A01(HxV<? extends T> hxV) {
        return new C05563uZ(C79.A00, C6ys.A00, hxV, -3, false);
    }
}
