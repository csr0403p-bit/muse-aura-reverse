package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* renamed from: X.Dxx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6211Dxx {
    public final void A01(int i) {
        if (this instanceof BY6) {
            ((BY6) this).A00.A5s(new BY8(BY7.A05, null, null, null, i, RealtimeSinceBootClock.A00.now()));
        }
    }

    public final void A02(int i) {
        if (this instanceof BY6) {
            ((BY6) this).A00.A5s(new BY8(BY7.A06, null, null, null, i, RealtimeSinceBootClock.A00.now()));
        }
    }

    public final void A03(int i, Integer num) {
        if (this instanceof BY6) {
            ((BY6) this).A00.A5s(new BY8(BY7.A07, BY6.A00(num), null, null, i, RealtimeSinceBootClock.A00.now()));
        }
    }

    public final void A04(BY9 by9, int i) {
        if (this instanceof BY6) {
            ServiceEventCallbackImpl serviceEventCallbackImpl = ((BY6) this).A00;
            long j = by9.A00;
            serviceEventCallbackImpl.A5s(new BY8(BY7.A04, BY6.A00(by9.A01), Boolean.valueOf(by9.A03), by9.A02, i, j));
            serviceEventCallbackImpl.A5s(new BY8(BY7.A03, null, null, null, i, RealtimeSinceBootClock.A00.now()));
        }
    }

    public final void A05(Integer num, String str, int i, boolean z) {
        if (this instanceof BY6) {
            ((BY6) this).A00.A5s(new BY8(BY7.A02, BY6.A00(num), Boolean.valueOf(z), str, i, RealtimeSinceBootClock.A00.now()));
        }
    }
}
