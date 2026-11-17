package X;

import java.util.Set;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GSu implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordingStateTracker$isAudioDisabledBySystem$1";
    public final /* synthetic */ C9621GSq A00;
    public final /* synthetic */ boolean A01;

    public GSu(C9621GSq c9621GSq, boolean z) {
        this.A00 = c9621GSq;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9621GSq c9621GSq = this.A00;
        Set<G0U<Boolean, Unit>> set = c9621GSq.A0C;
        boolean z = this.A01;
        for (G0U<Boolean, Unit> g0u : set) {
            InterfaceC9648GXn.A00(c9621GSq.A09, FGI.A0r("isAudioDisabledBySystem - callback ", z));
            AnonymousClass001.A1K(c9621GSq.A06, g0u);
        }
    }
}
