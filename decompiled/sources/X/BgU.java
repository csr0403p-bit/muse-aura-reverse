package X;

import android.hardware.camera2.CaptureRequest;

/* loaded from: classes5.dex */
public final class BgU implements BgG<BgY> {
    public final C2582Bee A00 = C2582Bee.A00();

    /* JADX WARN: Incorrect return type in method signature: <ValueT:Ljava/lang/Object;>(Landroid/hardware/camera2/CaptureRequest$Key<TValueT;>;TValueT;LX/BY1;)LX/BgU; */
    public final void A00(CaptureRequest.Key key, BY1 by1, Object obj) {
        this.A00.ANk(new C2530BdH(Object.class, key, FGI.A0M("camera2.captureRequest.option.", key.getName())), by1, obj);
    }

    /* JADX WARN: Incorrect return type in method signature: <ValueT:Ljava/lang/Object;>(Landroid/hardware/camera2/CaptureRequest$Key<TValueT;>;TValueT;)LX/BgU; */
    public final void A01(CaptureRequest.Key key, Object obj) {
        this.A00.ANl(new C2530BdH(Object.class, key, FGI.A0M("camera2.captureRequest.option.", key.getName())), obj);
    }

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    public final void A02(BY1 by1, InterfaceC2585Beh interfaceC2585Beh) {
        for (AbstractC2531BdI<?> abstractC2531BdI : interfaceC2585Beh.APd()) {
            this.A00.ANk(abstractC2531BdI, by1, interfaceC2585Beh.Abk(abstractC2531BdI));
        }
    }
}
