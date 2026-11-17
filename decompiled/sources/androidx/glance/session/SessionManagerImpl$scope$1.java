package androidx.glance.session;

import X.C3cG;
import X.InterfaceC065376p;
import androidx.glance.appwidget.AppWidgetSession;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SessionManagerImpl$scope$1 implements InterfaceC065376p {
    public final Map<String, Session> A00 = C3cG.A0j();
    public final /* synthetic */ SessionManagerImpl A01;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // X.InterfaceC065376p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AP0(android.content.Context r6, java.lang.String r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            r3 = 5
            boolean r0 = r8 instanceof X.C8iP
            if (r0 == 0) goto L58
            r4 = r8
            X.8iP r4 = (X.C8iP) r4
            int r0 = r4.$t
            if (r0 != r3) goto L58
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A02
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 != r2) goto L5e
            java.lang.Object r7 = r4.A01
            X.Hwg.A00(r3)
        L27:
            boolean r1 = X.AnonymousClass001.A1X(r3)
            java.util.Map<java.lang.String, androidx.glance.session.Session> r0 = r5.A00
            java.lang.Object r0 = r0.get(r7)
            androidx.glance.session.Session r0 = (androidx.glance.session.Session) r0
            if (r0 == 0) goto L44
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L44:
            r2 = 0
            goto L3f
        L46:
            X.Hwg.A00(r3)
            androidx.glance.session.SessionManagerImpl r0 = r5.A01
            X.79A r0 = r0.A01
            r4.A01 = r7
            r4.A00 = r2
            java.lang.Object r3 = r0.AiY(r6, r7, r4)
            if (r3 != r1) goto L27
            return r1
        L58:
            X.8iP r4 = new X.8iP
            r4.<init>(r5, r8, r3)
            goto L17
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl$scope$1.AP0(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @Override // X.InterfaceC065376p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AZt(androidx.glance.session.Session r10, X.HtJ<? super androidx.glance.session.Session> r11) {
        /*
            r9 = this;
            r5 = 1
            boolean r0 = r11 instanceof X.C8iO
            if (r0 == 0) goto L6a
            r4 = r11
            X.8iO r4 = (X.C8iO) r4
            int r0 = r4.$t
            if (r0 != r5) goto L6a
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r8 = 2
            if (r0 == 0) goto L2e
            if (r0 == r5) goto Lb0
            if (r0 != r8) goto L70
            X.Hwg.A00(r1)
        L27:
            r0 = r1
            androidx.glance.session.Session r0 = (androidx.glance.session.Session) r0
            r9.A00(r0)
            return r1
        L2e:
            X.Hwg.A00(r1)
            X.HzR<java.lang.Object> r2 = r10.A03
            java.util.ArrayList r6 = X.C3cG.A0h()
        L37:
            java.lang.Object r1 = r2.AhX()
            boolean r0 = r1 instanceof X.C2zT
            if (r0 != 0) goto L45
            if (r1 == 0) goto L37
            r6.add(r1)
            goto L37
        L45:
            r0 = r0 ^ 1
            if (r0 != 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r7 = r10.A02
            boolean r0 = r7.get()
            if (r0 == 0) goto L75
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A01
            boolean r0 = r0.get()
            if (r0 != 0) goto L75
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L75
            r4.A00 = r8
            androidx.glance.appwidget.AppWidgetSession r10 = (androidx.glance.appwidget.AppWidgetSession) r10
            java.lang.Object r1 = androidx.glance.appwidget.AppWidgetSession.A02(r10, r6, r4)
            if (r1 != r3) goto L27
            return r3
        L6a:
            X.8iO r4 = new X.8iO
            r4.<init>(r9, r11, r5)
            goto L17
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L75:
            java.lang.String r0 = "Closing session "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            java.lang.String r2 = r10.A00
            r1.append(r2)
            java.lang.String r0 = " wasOpen="
            r1.append(r0)
            boolean r0 = r7.get()
            r0 = r0 ^ 1
            r1.append(r0)
            java.lang.String r0 = " hasError="
            r1.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A01
            boolean r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = " events="
            java.lang.String r1 = X.AnonymousClass006.A0y(r6, r0, r1)
            java.lang.String r0 = "GlanceSessionManager"
            android.util.Log.d(r0, r1)
            r4.A00 = r5
            kotlin.Unit r0 = r9.A6T(r2)
            if (r0 != r3) goto Lb3
            return r3
        Lb0:
            X.Hwg.A00(r1)
        Lb3:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl$scope$1.AZt(androidx.glance.session.Session, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    @Override // X.InterfaceC065376p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AgK(android.content.Context r10, androidx.glance.session.Session r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = r12 instanceof X.C8iP
            if (r0 == 0) goto Lac
            r4 = r12
            X.8iP r4 = (X.C8iP) r4
            int r0 = r4.$t
            if (r0 != r3) goto Lac
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            r8 = r3
            int r0 = r4.A00
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L2c
            if (r0 == r7) goto L67
            if (r0 != r6) goto Lb3
            X.Hwg.A00(r1)
        L29:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L2c:
            X.Hwg.A00(r1)
            r9.A00(r11)
            androidx.glance.session.SessionManagerImpl r2 = r9.A01
            java.lang.Class<androidx.glance.session.SessionWorker> r0 = androidx.glance.session.SessionWorker.class
            X.F1d r1 = new X.F1d
            r1.<init>(r0)
            X.G0V<androidx.glance.session.SessionManagerImpl, androidx.glance.session.Session, X.BzB> r0 = r2.A02
            java.lang.Object r0 = r0.invoke(r2, r11)
            X.BzB r0 = (X.BzB) r0
            r1.A03(r0)
            X.ELb r5 = r1.A01()
            X.7yw r5 = (X.C7yw) r5
            java.lang.String r2 = r11.A00
            X.7yC r1 = X.C7yC.A05
            r4.A01 = r10
            r4.A00 = r7
            X.EK5 r0 = X.F3R.A02(r10)
            X.EMp r0 = r0.A04(r1, r5, r2)
            X.EyE r0 = (X.C7499EyE) r0
            com.google.common.util.concurrent.ListenableFuture<X.EN8> r0 = r0.A00
            java.lang.Object r0 = X.Br3.A00(r0, r4)
            if (r0 != r3) goto L6d
            return r8
        L67:
            java.lang.Object r0 = r4.A01
            android.content.Context r10 = X.C60P.A02(r0, r1)
        L6d:
            r0 = 0
            r4.A01 = r0
            r4.A00 = r6
            X.7yC r6 = X.C7yC.A04
            java.lang.Class<androidx.glance.session.SessionWorker> r0 = androidx.glance.session.SessionWorker.class
            X.F1d r5 = new X.F1d
            r5.<init>(r0)
            r1 = 3650(0xe42, double:1.8033E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r5.A02(r1, r0)
            X.F1w r0 = new X.F1w
            r0.<init>()
            r0.A04 = r7
            X.EKL r1 = r0.A00()
            X.EKE r0 = r5.A00
            r0.A0B = r1
            X.ELb r2 = r5.A01()
            X.7yw r2 = (X.C7yw) r2
            java.lang.String r1 = "sessionWorkerKeepEnabled"
            X.EK5 r0 = X.F3R.A02(r10)
            X.EMp r0 = r0.A04(r6, r2, r1)
            X.EyE r0 = (X.C7499EyE) r0
            com.google.common.util.concurrent.ListenableFuture<X.EN8> r0 = r0.A00
            java.lang.Object r0 = X.Br3.A00(r0, r4)
            if (r0 != r3) goto L29
            return r8
        Lac:
            X.8iP r4 = new X.8iP
            r4.<init>(r9, r12, r3)
            goto L17
        Lb3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl$scope$1.AgK(android.content.Context, androidx.glance.session.Session, X.HtJ):java.lang.Object");
    }

    public SessionManagerImpl$scope$1(SessionManagerImpl sessionManagerImpl) {
        this.A01 = sessionManagerImpl;
    }

    private final void A00(Session session) {
        Session sessionPut = this.A00.put(session.A00, session);
        if (sessionPut != null) {
            sessionPut.A03.A6R(null);
            sessionPut.A02.set(false);
            ((AppWidgetSession) sessionPut).A07.A5w(null);
        }
    }

    @Override // X.InterfaceC065376p
    public final Unit A6T(String str) {
        Session sessionRemove = this.A00.remove(str);
        if (sessionRemove != null) {
            sessionRemove.A03.A6R(null);
            sessionRemove.A02.set(false);
            ((AppWidgetSession) sessionRemove).A07.A5w(null);
        }
        return Unit.INSTANCE;
    }
}
