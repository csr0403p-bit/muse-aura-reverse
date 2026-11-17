package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest$RequestCancelledException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class F59 implements BpZ {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public F59(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.BpZ
    public final void onFailure(Throwable th) {
        switch (this.$t) {
            case 0:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            case 1:
                BeS.A07(th instanceof SurfaceRequest$RequestCancelledException ? ((Future) this.A02).cancel(false) : ((C3010Brs) this.A01).A03(null), null);
                return;
            case 2:
                BeS.A07(th instanceof SurfaceRequest$RequestCancelledException, AnonymousClass007.A0a("Camera surface session should only fail with request cancellation. Instead failed due to:\n", th));
                ((BeM) this.A01).accept(new BmJ(1, (Surface) this.A02));
                return;
            default:
                ((C2820Blx) this.A00).A00 = null;
                List list = (List) this.A01;
                if (list.isEmpty()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2544BdV) ((InterfaceC2546BdX) this.A02)).Aaw((BeX) it.next());
                }
                list.clear();
                return;
        }
    }

    @Override // X.BpZ
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                ((Surface) this.A01).release();
                ((SurfaceTexture) this.A02).release();
                break;
            case 1:
                BeS.A07(((C3010Brs) this.A01).A03(null), null);
                break;
            case 2:
                ((BeM) this.A01).accept(new BmJ(0, (Surface) this.A02));
                break;
            default:
                ((C2820Blx) this.A00).A00 = null;
                break;
        }
    }
}
