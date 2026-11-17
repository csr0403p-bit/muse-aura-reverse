package com.facebook.aura.devices.intf;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C20Z;
import X.CFK;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.intf.ConnectedDeviceRows$rows$flows$1$1", f = "ConnectedDeviceRowContributor.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectedDeviceRows$rows$flows$1$1 extends AbstractC07127nr implements G0W<C20Z<? super List<ConnectedDeviceRow>>, Throwable, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ConnectedDeviceRows$rows$flows$1$1(HtJ<? super ConnectedDeviceRows$rows$flows$1$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        Throwable th = (Throwable) this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            CFK.A0A(ConnectedDeviceRows.TAG, "A connected-device row contributor failed", th);
            C0881AGi c0881AGi = C0881AGi.A00;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c20z.emit(c0881AGi, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super List<ConnectedDeviceRow>> c20z, Throwable th, HtJ<? super Unit> htJ) {
        ConnectedDeviceRows$rows$flows$1$1 connectedDeviceRows$rows$flows$1$1 = new ConnectedDeviceRows$rows$flows$1$1(htJ);
        connectedDeviceRows$rows$flows$1$1.L$0 = c20z;
        connectedDeviceRows$rows$flows$1$1.L$1 = th;
        return connectedDeviceRows$rows$flows$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
