package X;

import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* loaded from: classes5.dex */
public final class F4N implements InterfaceC2939BpT {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F4N(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC2939BpT
    public final ListenableFuture A4O(Object obj) {
        Throwable thA0i;
        switch (this.$t) {
            case 0:
                C2714Bik c2714Bik = (C2714Bik) this.A00;
                BjC bjC = (BjC) this.A01;
                c2714Bik.close();
                bjC.A02();
                return c2714Bik.Aa7(false);
            case 1:
                return AbstractC2947Bpi.A00(new EE2((ListenableFuture) this.A01, ((C2764Bka) this.A00).A03, 1, 3000L));
            case 2:
                Object obj2 = this.A00;
                List list = (List) this.A01;
                List list2 = (List) obj;
                AbstractC2875Bni.A01("SyncCaptureSessionBase", AnonymousClass006.A0y(list2, "] getSurface done with results: ", C3cG.A0f(obj2, "[")));
                if (list2.isEmpty()) {
                    thA0i = C60O.A0i("Unable to open capture session without surfaces");
                } else {
                    if (!list2.contains(null)) {
                        return new BpQ(list2);
                    }
                    BjC bjC2 = (BjC) list.get(list2.indexOf(null));
                    DeferrableSurface$SurfaceClosedException deferrableSurface$SurfaceClosedException = new DeferrableSurface$SurfaceClosedException("Surface closed");
                    deferrableSurface$SurfaceClosedException.mDeferrableSurface = bjC2;
                    thA0i = deferrableSurface$SurfaceClosedException;
                }
                return new C2938BpP(thA0i);
            default:
                C2614Bff c2614Bff = (C2614Bff) this.A00;
                List list3 = (List) this.A01;
                InterfaceC2677BhX interfaceC2677BhX = c2614Bff.A00;
                int iA0C = BV7.A0C(((C2646Bgd) list3.get(0)).A02.Abl(C2646Bgd.A08, 100));
                int iA0C2 = BV7.A0C(((C2646Bgd) list3.get(0)).A02.Abl(C2646Bgd.A0A, 0));
                BfJ bfJ = ((BgF) interfaceC2677BhX).A00.A05;
                return bfJ != null ? bfJ.A03.Afr(iA0C, iA0C2) : new C2938BpP(new Exception("Failed to take picture: pipeline is not ready."));
        }
    }
}
