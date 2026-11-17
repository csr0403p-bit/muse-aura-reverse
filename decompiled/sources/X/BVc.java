package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* loaded from: classes5.dex */
public final class BVc implements DlP {
    public final /* synthetic */ DmR A00;
    public final /* synthetic */ C5593DlT A01;

    public BVc(DmR dmR, C5593DlT c5593DlT) {
        this.A00 = dmR;
        this.A01 = c5593DlT;
    }

    @Override // X.DlP
    public final void APy(String str) {
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A01.A0S;
        String str2 = this.A00.A03.A0Q;
        if (str2 != null) {
            BYP.A00(serviceEventCallbackImpl, str2, "MANIFEST", "FALLBACK_TRIGGERED", str);
        }
    }
}
