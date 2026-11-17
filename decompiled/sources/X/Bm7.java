package X;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Bm7 {
    public final Executor A0A;
    public final Executor A0B;
    public final InterfaceC2695Bhv A0C;
    public InterfaceC2849Bms A03 = null;
    public Surface A00 = null;
    public BmM A01 = null;
    public Executor A09 = null;
    public InterfaceC2846Bmp A02 = null;
    public Integer A08 = C79.A00;
    public ListenableFuture<Void> A07 = new C2938BpP(C3cG.A0Q("Cannot close the encoder before configuring."));
    public C3010Brs<Void> A05 = null;
    public ListenableFuture<InterfaceC2849Bms> A06 = new C2938BpP(C3cG.A0Q("Cannot close the encoder before configuring."));
    public C3010Brs<InterfaceC2849Bms> A04 = null;

    public static void A00(Bm7 bm7) {
        Integer num = bm7.A08;
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            bm7.A01();
        } else if (iIntValue != 2 && iIntValue != 3) {
            AbstractC2875Bni.A01("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
        } else {
            AbstractC2875Bni.A01("VideoEncoderSession", FGI.A0U("closeInternal in ", AbstractC2829BmW.A00(num), " state"));
            bm7.A08 = C79.A0C;
        }
    }

    public final void A01() {
        Integer num = this.A08;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.A08 = C79.A0P;
            return;
        }
        if (iIntValue != 1 && iIntValue != 2 && iIntValue != 3) {
            AbstractC2875Bni.A01("VideoEncoderSession", FGI.A0U("terminateNow in ", AbstractC2829BmW.A00(num), ", No-op"));
            return;
        }
        this.A08 = C79.A0P;
        this.A04.A03(this.A03);
        this.A01 = null;
        InterfaceC2849Bms interfaceC2849Bms = this.A03;
        if (interfaceC2849Bms == null) {
            AbstractC2875Bni.A03("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.A05.A03(null);
            return;
        }
        AbstractC2875Bni.A00(interfaceC2849Bms, "VideoEncoder is releasing: ", "VideoEncoderSession");
        final Bo1 bo1 = (Bo1) this.A03;
        bo1.A0R.execute(new Runnable() { // from class: X.BoE
            public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                Bo1 bo12 = bo1;
                Integer num2 = bo12.A04;
                switch (num2.intValue()) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        Bo1.A00(bo12);
                        return;
                    case 3:
                    case 4:
                    case 5:
                        Bo1.A02(bo12, C79.A0W);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num2));
                }
            }
        });
        ((Bo1) this.A03).A0J.addListener(new Runnable() { // from class: X.BmZ
            public static final String __redex_internal_original_name = "VideoEncoderSession$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A05.A03(null);
            }
        }, this.A0B);
        this.A03 = null;
    }

    public final String toString() {
        int iHashCode = hashCode();
        BmM bmM = this.A01;
        return FGI.A0W("VideoEncoderSession@", " for ", bmM != null ? bmM.toString() : "SURFACE_REQUEST_NOT_CONFIGURED", iHashCode);
    }

    public Bm7(InterfaceC2695Bhv interfaceC2695Bhv, Executor executor, Executor executor2) {
        this.A0A = executor2;
        this.A0B = executor;
        this.A0C = interfaceC2695Bhv;
    }
}
