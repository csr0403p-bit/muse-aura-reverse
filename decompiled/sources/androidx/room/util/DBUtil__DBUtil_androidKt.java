package androidx.room.util;

import X.C06757Bd;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.EIN;
import X.FXQ;
import X.G0U;
import X.HtJ;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class DBUtil__DBUtil_androidKt {
    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/EIN;ZZLX/G0U<-LX/EJV;+TR;>;LX/HtJ<-TR;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[PHI: r0
  0x0098: PHI (r0v7 java.lang.Object) = (r0v8 java.lang.Object), (r0v1 java.lang.Object) binds: [B:22:0x0057, B:29:0x0095] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.EIN r14, X.HtJ r15, X.G0U r16, boolean r17, boolean r18) {
        /*
            r4 = r15
            r11 = r17
            r10 = r18
            r8 = r16
            r6 = r14
            boolean r0 = r15 instanceof X.C7Bk
            if (r0 == 0) goto L30
            r3 = r4
            X.7Bk r3 = (X.C7Bk) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r3.label = r2
        L1a:
            java.lang.Object r0 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r5 = r3.label
            r4 = 3
            r1 = 2
            r9 = 1
            if (r5 == 0) goto L36
            if (r5 == r9) goto L95
            if (r5 == r1) goto L6b
            if (r5 == r4) goto L95
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.7Bk r3 = new X.7Bk
            r3.<init>(r15)
            goto L1a
        L36:
            X.Hwg.A00(r0)
            boolean r0 = r14.inCompatibilityMode()
            if (r0 == 0) goto L5a
            boolean r0 = r14.isOpenInternal$room_runtime()
            if (r0 == 0) goto L5a
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L5a
            r7 = 0
            X.EZA r5 = new X.EZA
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.label = r9
            java.lang.Object r0 = r14.useConnection(r11, r5, r3)
        L57:
            if (r0 != r2) goto L98
            return r2
        L5a:
            r3.L$0 = r14
            r3.L$1 = r8
            r3.Z$0 = r11
            r3.Z$1 = r10
            r3.label = r1
            X.78T r0 = A02(r14, r3, r10)
            if (r0 != r2) goto L7a
            return r2
        L6b:
            boolean r10 = r3.Z$1
            boolean r11 = r3.Z$0
            java.lang.Object r8 = r3.L$1
            X.G0U r8 = (X.G0U) r8
            java.lang.Object r6 = r3.L$0
            X.EIN r6 = (X.EIN) r6
            X.Hwg.A00(r0)
        L7a:
            X.78T r0 = (X.C78T) r0
            r14 = 0
            X.8ie r12 = new X.8ie
            r13 = r6
            r15 = r8
            r16 = r9
            r17 = r11
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.label = r4
            java.lang.Object r0 = X.GAo.A00(r3, r0, r12)
            goto L57
        L95:
            X.Hwg.A00(r0)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.A00(X.EIN, X.HtJ, X.G0U, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/EIN;ZZLX/G0U<-LX/EJV;+TR;>;)TR; */
    public static final Object A01(EIN ein, G0U g0u, boolean z, boolean z2) {
        C7384Etj.A0Y(ein, 0);
        ein.assertNotMainThread();
        ein.assertNotSuspendingTransaction();
        C78T c78t = ein.suspendingTransactionContext.get();
        if (c78t == null) {
            c78t = C6ys.A00;
        }
        return FXQ.A00(new DBUtil__DBUtil_androidKt$performBlocking$1(ein, null, c78t, g0u, z2, z));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EIN;ZLX/HtJ<-LX/78T;>;)Ljava/lang/Object; */
    public static final C78T A02(EIN ein, HtJ htJ, boolean z) {
        C06757Bd c06757Bd = (C06757Bd) htJ.getContext().get(C06757Bd.A01);
        C78T c78t = c06757Bd != null ? c06757Bd.A00 : null;
        if (ein.inCompatibilityMode()) {
            return c78t != null ? ein.getQueryContext().plus(c78t) : z ? ein.getTransactionContext$room_runtime() : ein.getQueryContext();
        }
        C78T queryContext = ein.getQueryContext();
        if (c78t == null) {
            c78t = C6ys.A00;
        }
        return queryContext.plus(c78t);
    }
}
