package X;

/* renamed from: X.Dep, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5275Dep implements InterfaceC5288Df3 {
    public final /* synthetic */ C5272Dem A00;
    public final /* synthetic */ InterfaceC5282Dex A01;
    public final /* synthetic */ InterfaceC5270Dek A02;

    public C5275Dep(C5272Dem c5272Dem, InterfaceC5282Dex interfaceC5282Dex, InterfaceC5270Dek interfaceC5270Dek) {
        this.A00 = c5272Dem;
        this.A02 = interfaceC5270Dek;
        this.A01 = interfaceC5282Dex;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    @Override // X.InterfaceC5288Df3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAy(android.os.IBinder r5) {
        /*
            r4 = this;
            X.Dem r3 = r4.A00
            X.Dek r2 = r4.A02
            if (r5 != 0) goto L12
            r1 = 0
        L7:
            java.lang.Integer r0 = r2.AAx(r1)
            int r0 = r0.intValue()
            r3.A06 = r0
            return
        L12:
            java.lang.String r0 = "androidx.health.platform.client.service.IHealthDataService"
            android.os.IInterface r1 = r5.queryLocalInterface(r0)
            if (r1 == 0) goto L1f
            boolean r0 = r1 instanceof androidx.health.platform.client.service.IHealthDataService
            if (r0 == 0) goto L1f
            goto L7
        L1f:
            androidx.health.platform.client.service.IHealthDataService$Stub$Proxy r1 = new androidx.health.platform.client.service.IHealthDataService$Stub$Proxy
            r1.<init>()
            r1.A00 = r5
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5275Dep.AAy(android.os.IBinder):void");
    }

    @Override // X.InterfaceC5288Df3
    public final C5281Dew ADw() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC5288Df3
    public final void AdO(Throwable th) {
    }

    @Override // X.InterfaceC5288Df3
    public final void AhE(InterfaceC5284Dez interfaceC5284Dez) {
    }
}
