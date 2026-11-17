package X;

import android.os.Handler;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* loaded from: classes5.dex */
public final class DXI implements InterfaceC4913DEg {
    public static final C4912DEf A06 = C4912DEf.A00();
    public int A00;
    public DXK A01;
    public final E7C A02;
    public final DXG A03;
    public final AbrContextAwareConfiguration A04;
    public final InterfaceC6113Dvs A05;

    public DXI(AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC6113Dvs interfaceC6113Dvs) {
        DXG dxg;
        C7384Etj.A0Y(abrContextAwareConfiguration, 1);
        E7C e7c = E7C.A00;
        this.A02 = e7c;
        this.A01 = new DXK(e7c, this, this, abrContextAwareConfiguration.abrSetting.shouldCountFirstChunkOnly);
        synchronized (DXG.A04) {
            dxg = DXG.A03;
            if (dxg == null) {
                dxg = new DXG(e7c);
                DXG.A03 = dxg;
            }
        }
        this.A03 = dxg;
        this.A05 = interfaceC6113Dvs;
        this.A04 = abrContextAwareConfiguration;
    }

    @Override // X.InterfaceC4913DEg
    public final /* bridge */ /* synthetic */ C4912DEf AGO(String str) {
        C7384Etj.A0Y(str, 1);
        return this.A05 == null ? A06 : C4912DEf.A00();
    }

    @Override // X.InterfaceC4913DEg
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final VideoBandwidthEstimate ACl() {
        VideoBandwidthEstimate videoBandwidthEstimateA01;
        DXG dxg = this.A03;
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A04;
        synchronized (dxg) {
            videoBandwidthEstimateA01 = dxg.A05.A01(abrContextAwareConfiguration);
        }
        if (videoBandwidthEstimateA01.A00 <= 0) {
            videoBandwidthEstimateA01 = new VideoBandwidthEstimate();
        }
        videoBandwidthEstimateA01.A01 = this;
        return videoBandwidthEstimateA01;
    }

    @Override // X.InterfaceC4913DEg
    public final int ACd() {
        int i;
        DXG dxg = this.A03;
        synchronized (dxg) {
            i = ((DXL) dxg).A00;
        }
        return i;
    }

    @Override // X.InterfaceC5047DQt
    public final long ACr() {
        long j;
        DXG dxg = this.A03;
        synchronized (dxg) {
            j = ((DXL) dxg).A02;
        }
        return j;
    }

    @Override // X.InterfaceC5047DQt
    public final /* bridge */ /* synthetic */ CXB ALw() {
        return this.A01;
    }

    @Override // X.InterfaceC5047DQt
    public final void Aaq(GYb gYb) {
    }

    @Override // X.InterfaceC5047DQt
    public final void A3X(Handler handler, GYb gYb) {
    }
}
