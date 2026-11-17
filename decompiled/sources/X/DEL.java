package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class DEL implements DDj {
    public int A00;
    public String A01;

    public void A05(String str, String str2, int i) {
        C7384Etj.A0Y(str2, 1);
        this.A01 = str2;
        this.A00 = i;
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AVB() {
    }

    @Override // X.DDj
    public final void AWg() {
    }

    @Override // X.InterfaceC4897DDq
    public final void AWj(String str, Object obj) {
        AnonymousClass003.A0u(str, obj);
        if ("live_trace".equals(str)) {
            DEG deg = (DEG) obj;
            DEM dem = (DEM) this;
            if (((DEL) dem).A01 != null) {
                int i = (int) (deg.A00 - dem.A01);
                HashMap mapA01 = DEM.A01(dem, DEM.A00(dem.A05));
                for (int i2 = 0; i2 < deg.A07.length; i2++) {
                    VpsEventCallback vpsEventCallback = dem.A03;
                    long j = dem.A00;
                    dem.A00 = 1 + j;
                    vpsEventCallback.A5s(new DEJ(deg, ((DEL) dem).A01, deg.A01, mapA01, i2, i, ((DEL) dem).A00, j));
                    dem.A04.A38(new C2358BVi(deg, null, i2, dem.A0A ? dem.A08.get() : 0, false));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void A04(X.DEG r34, java.util.Map r35) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEL.A04(X.DEG, java.util.Map):void");
    }

    @Override // X.DDj
    public final void AWi(IOException iOException) {
    }

    @Override // X.DDj
    public final void AdA(long j) {
    }

    @Override // X.DDj
    public final void AdN(String str) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AdZ(boolean z) {
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
    }
}
