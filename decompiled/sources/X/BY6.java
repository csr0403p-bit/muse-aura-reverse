package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* loaded from: classes5.dex */
public final class BY6 extends AbstractC6211Dxx {
    public final ServiceEventCallbackImpl A00;

    public static BW0 A00(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return BW0.A03;
        }
        if (iIntValue == 0) {
            return BW0.A02;
        }
        throw C60Q.A0U("Unsupported source: ", "PREALLOCATE");
    }

    public BY6(ServiceEventCallbackImpl serviceEventCallbackImpl) {
        this.A00 = serviceEventCallbackImpl;
    }
}
