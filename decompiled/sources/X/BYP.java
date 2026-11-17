package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class BYP implements Serializable {
    public static final long serialVersionUID = -4973707892907824099L;
    public final DER mEventType;

    public static void A00(ServiceEventCallbackImpl serviceEventCallbackImpl, String str, String str2, String str3, String str4) {
        serviceEventCallbackImpl.A5s(new C4919DEo(str, str2, str3, str4));
    }

    public BYP(DER der) {
        this.mEventType = der;
    }
}
