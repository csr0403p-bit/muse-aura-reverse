package androidx.glance.session;

import X.AnonymousClass799;
import X.BzB;
import X.C77H;
import X.C79A;
import X.C8i0;
import X.C9258GBl;
import X.G0V;
import X.InterfaceC2261BLa;

/* loaded from: classes3.dex */
public final class SessionManagerImpl implements C77H {
    public final SessionManagerImpl$scope$1 A00;
    public final C79A A01;
    public final G0V<SessionManagerImpl, Session, BzB> A02;
    public final InterfaceC2261BLa A03;

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroidx/glance/session/SessionManagerImpl;LX/G0V<-LX/76p;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(androidx.glance.session.SessionManagerImpl r7, X.HtJ r8, X.G0V r9) throws java.lang.Throwable {
        /*
            r3 = 3
            boolean r0 = r8 instanceof X.C8iU
            if (r0 == 0) goto Ld
            r0 = r8
            X.8iU r0 = (X.C8iU) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L32
            r6 = r8
            X.8iU r6 = (X.C8iU) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r6.A00 = r2
        L1e:
            java.lang.Object r0 = r6.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.A00
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L51
            if (r1 == r3) goto L41
            if (r1 != r4) goto L3c
            java.lang.Object r1 = r6.A01
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L38
        L32:
            X.8iU r6 = new X.8iU
            r6.<init>(r7, r8, r3)
            goto L1e
        L38:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7c
            goto L76
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L41:
            java.lang.Object r1 = r6.A03
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r9 = r6.A02
            X.G0V r9 = (X.G0V) r9
            java.lang.Object r7 = r6.A01
            androidx.glance.session.SessionManagerImpl r7 = (androidx.glance.session.SessionManagerImpl) r7
            X.Hwg.A00(r0)
            goto L65
        L51:
            X.Hwg.A00(r0)
            X.BLa r1 = r7.A03
            r6.A01 = r7
            r6.A02 = r9
            r6.A03 = r1
            r6.A00 = r3
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r5) goto L65
            return r5
        L65:
            androidx.glance.session.SessionManagerImpl$scope$1 r0 = r7.A00     // Catch: java.lang.Throwable -> L7a
            r6.A01 = r1     // Catch: java.lang.Throwable -> L7a
            r6.A02 = r2     // Catch: java.lang.Throwable -> L7a
            r6.A03 = r2     // Catch: java.lang.Throwable -> L7a
            r6.A00 = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r9.invoke(r0, r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L76
            return r5
        L76:
            r1.Ahe(r2)
            return r0
        L7a:
            r0 = move-exception
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl.A00(androidx.glance.session.SessionManagerImpl, X.HtJ, X.G0V):java.lang.Object");
    }

    public /* synthetic */ SessionManagerImpl() {
        C8i0 c8i0 = new C8i0(27);
        C79A c79a = AnonymousClass799.A00;
        this.A02 = c8i0;
        this.A01 = c79a;
        this.A03 = new C9258GBl();
        this.A00 = new SessionManagerImpl$scope$1(this);
    }
}
