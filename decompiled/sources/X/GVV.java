package X;

import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GVV extends UnregisterCallback {
    public final /* synthetic */ HtJ<Unit> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public GVV(HtJ<? super Unit> htJ) {
        this.A00 = htJ;
    }

    @Override // com.facebook.rsys.callmanager.gen.UnregisterCallback
    public final void onUnregister(String str) {
        this.A00.resumeWith(Unit.INSTANCE);
    }
}
