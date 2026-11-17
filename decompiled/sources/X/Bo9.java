package X;

import android.util.Range;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class Bo9 implements Runnable {
    public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Bo1 A01;

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        Bo1 bo1 = this.A01;
        long j = this.A00;
        Integer num2 = bo1.A04;
        switch (num2.intValue()) {
            case 0:
            case 2:
            case 3:
            case 5:
            case 7:
                return;
            case 1:
                AbstractC2875Bni.A04("Pause on ", AbstractC2993BrL.A00(j), bo1.A0L);
                bo1.A0M.addLast(Range.create(Long.valueOf(j), Long.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX)));
                num = C79.A0C;
                break;
            case 4:
                num = C79.A0T;
                break;
            case 6:
            case 8:
                throw C3cG.A0Q("Encoder is released");
            default:
                throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num2));
        }
        Bo1.A02(bo1, num);
    }

    public /* synthetic */ Bo9(Bo1 bo1, long j) {
        this.A01 = bo1;
        this.A00 = j;
    }
}
