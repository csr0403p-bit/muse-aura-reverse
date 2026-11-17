package X;

import android.content.BroadcastReceiver;
import kotlin.Unit;

/* renamed from: X.6I8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6I8 {
    public static final void A00(BroadcastReceiver broadcastReceiver, C78T c78t, G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        if (C6I9.A00.get()) {
            throw C3cG.A0Q("goAsync must never be called when the AsyncRequestWorker is meant to be used");
        }
        HzC hzCA02 = Hxb.A02(c78t);
        AnonymousClass001.A1J(new C07268if(g0v, broadcastReceiver.goAsync(), hzCA02, null, 4), hzCA02);
    }
}
