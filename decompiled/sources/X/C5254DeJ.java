package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.DeJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5254DeJ extends AbstractC5267DeW implements InterfaceC5259DeO {
    public boolean A00;
    public final C5251DeG A02;
    public final Map A04;
    public final C5255DeK A01 = new C5255DeK();
    public final ThreadLocal<C5247DeC> A03 = new C5253DeI(this);

    @Override // X.InterfaceC5259DeO
    public final C5254DeJ AK2() {
        return this;
    }

    @Override // X.InterfaceC5259DeO
    public final InterfaceC5259DeO ACT() {
        return this.A02;
    }

    @Override // X.InterfaceC5259DeO
    public final C5247DeC AGU() {
        return this.A03.get();
    }

    @Override // X.InterfaceC5259DeO
    @Deprecated
    public final InterfaceC5265DeU AK0() {
        InterfaceC5265DeU interfaceC5265DeU;
        if (!this.A00) {
            throw BV4.A0c("Called injector during binding");
        }
        List<InterfaceC5259DeO> list = AGU().A00;
        if (list.isEmpty() || (interfaceC5265DeU = (InterfaceC5265DeU) BV5.A0e(list)) == null) {
            throw C3cG.A0Q("Should never call getScopeAwareInjector without an active ThreadStack");
        }
        return interfaceC5265DeU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5254DeJ(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            X.DeK r0 = new X.DeK
            r0.<init>()
            r3.A01 = r0
            X.DeI r0 = new X.DeI
            r0.<init>(r3)
            r3.A03 = r0
            java.lang.String r0 = "FbInjectorImpl.init"
            com.facebook.debug.tracer.Tracer.A01(r0)
            X.DeG r0 = new X.DeG     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L39
            r3.A02 = r0     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L39
            r2 = 1
            if (r4 == r0) goto L29
            boolean r1 = r4 instanceof android.app.Application     // Catch: java.lang.Throwable -> L39
            r0 = 0
            if (r1 == 0) goto L2a
        L29:
            r0 = 1
        L2a:
            com.google.common.base.Preconditions.checkArgument(r0)     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r0 = X.BV4.A0u()     // Catch: java.lang.Throwable -> L39
            r3.A04 = r0     // Catch: java.lang.Throwable -> L39
            r3.A00 = r2     // Catch: java.lang.Throwable -> L39
            com.facebook.debug.tracer.Tracer.A00()
            return
        L39:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5254DeJ.<init>(android.content.Context):void");
    }
}
