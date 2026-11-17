package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class BkT implements InterfaceC2768Bke {
    public final /* synthetic */ BkR A00;

    public BkT(BkR bkR) {
        this.A00 = bkR;
    }

    @Override // X.InterfaceC2768Bke
    public final boolean AOE() {
        Iterator<InterfaceC2768Bke> it = this.A00.A05.iterator();
        while (it.hasNext()) {
            if (it.next().AOE()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC2768Bke
    public final void AYF() {
        Iterator<InterfaceC2768Bke> it = this.A00.A05.iterator();
        while (it.hasNext()) {
            it.next().AYF();
        }
    }

    @Override // X.InterfaceC2768Bke
    public final ListenableFuture<Boolean> AYH(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<InterfaceC2768Bke> it = this.A00.A05.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(it.next().AYH(totalCaptureResult));
        }
        return ExecutorC2446BbZ.A01(AbstractC2942BpW.A00(arrayListA0h), 2);
    }
}
