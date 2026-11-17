package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;

/* renamed from: X.Deq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5276Deq implements InterfaceC5288Df3 {
    public final C5281Dew A00;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // X.InterfaceC5288Df3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAy(android.os.IBinder r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C5274Deo
            if (r0 == 0) goto L10
            X.Deo r3 = (X.C5274Deo) r3
            X.Dei r2 = r3.A01
            if (r4 != 0) goto L11
            r1 = 0
        Lb:
            com.google.common.util.concurrent.SettableFuture r0 = r3.A02
            r2.AB0(r0, r1)
        L10:
            return
        L11:
            java.lang.String r0 = "androidx.health.platform.client.service.IHealthDataService"
            android.os.IInterface r1 = r4.queryLocalInterface(r0)
            if (r1 == 0) goto L1e
            boolean r0 = r1 instanceof androidx.health.platform.client.service.IHealthDataService
            if (r0 == 0) goto L1e
            goto Lb
        L1e:
            androidx.health.platform.client.service.IHealthDataService$Stub$Proxy r1 = new androidx.health.platform.client.service.IHealthDataService$Stub$Proxy
            r1.<init>()
            r1.A00 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5276Deq.AAy(android.os.IBinder):void");
    }

    @Override // X.InterfaceC5288Df3
    public final C5281Dew ADw() {
        return this.A00;
    }

    @Override // X.InterfaceC5288Df3
    public final void AdO(Throwable th) {
        if (this instanceof C5274Deo) {
            ((C5274Deo) this).A02.setException(th);
        }
    }

    @Override // X.InterfaceC5288Df3
    public final void AhE(InterfaceC5284Dez interfaceC5284Dez) {
        if (this instanceof C5274Deo) {
            final SettableFuture<?> settableFuture = ((C5274Deo) this).A02;
            final C5277Der c5277Der = (C5277Der) interfaceC5284Dez;
            Set<SettableFuture<?>> set = c5277Der.A00;
            synchronized (set) {
                set.add(settableFuture);
                settableFuture.addListener(new Runnable() { // from class: X.Des
                    public static final String __redex_internal_original_name = "DefaultExecutionTracker$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C5277Der c5277Der2 = c5277Der;
                        SettableFuture settableFuture2 = settableFuture;
                        Set<SettableFuture<?>> set2 = c5277Der2.A00;
                        synchronized (set2) {
                            set2.remove(settableFuture2);
                        }
                    }
                }, EnumC3451CNw.A01);
            }
        }
    }

    public C5276Deq(C5281Dew c5281Dew) {
        c5281Dew.getClass();
        this.A00 = c5281Dew;
    }
}
