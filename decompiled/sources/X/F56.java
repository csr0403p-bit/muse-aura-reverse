package X;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class F56 implements BpZ {
    public final int $t;
    public final Object A00;

    public F56(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.BpZ
    public final void onFailure(Throwable th) {
        switch (this.$t) {
            case 0:
                C2714Bik c2714Bik = (C2714Bik) this.A00;
                synchronized (c2714Bik.A0E) {
                    c2714Bik.A00.AgR();
                    Integer num = c2714Bik.A05;
                    int iIntValue = num.intValue();
                    if ((iIntValue == 3 || iIntValue == 5 || iIntValue == 6) && !(th instanceof CancellationException)) {
                        AbstractC2875Bni.A06("CaptureSession", FGI.A0M("Opening session with fail ", AbstractC2818Blv.A00(num)), th);
                        c2714Bik.A02();
                    }
                }
                return;
            case 1:
                C2715Bil c2715Bil = (C2715Bil) this.A00;
                C2715Bil.A01(c2715Bil);
                c2715Bil.A0F.A02();
                c2715Bil.A0C.A02(c2715Bil);
                return;
            case 2:
                boolean z = th instanceof TimeoutException;
                C3010Brs c3010Brs = (C3010Brs) this.A00;
                if (z) {
                    c3010Brs.A04(th);
                    return;
                } else {
                    c3010Brs.A03(Collections.EMPTY_LIST);
                    return;
                }
            case 3:
                C2823Bm4 c2823Bm4 = (C2823Bm4) this.A00;
                BeS.A07(AnonymousClass002.A1X(c2823Bm4.A0J), "In-progress recording shouldn't be null");
                AbstractC2875Bni.A01("Recorder", AnonymousClass007.A0a("Encodings end with error: ", th));
                c2823Bm4.A0J(c2823Bm4.A0A == null ? 8 : 6, th);
                return;
            default:
                AbstractC2875Bni.A06("VideoEncoderSession", "VideoEncoder configuration failed.", th);
                ((Bm7) this.A00).A01();
                return;
        }
    }

    @Override // X.BpZ
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.$t) {
            case 2:
                Collection collection = (Collection) obj;
                collection.getClass();
                ((C3010Brs) this.A00).A03(BV4.A0t(collection));
                break;
            case 3:
                AbstractC2875Bni.A01("Recorder", "Encodings end successfully.");
                C2823Bm4 c2823Bm4 = (C2823Bm4) this.A00;
                c2823Bm4.A0J(c2823Bm4.A00, c2823Bm4.A0W);
                break;
        }
    }
}
