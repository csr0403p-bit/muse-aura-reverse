package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* loaded from: classes5.dex */
public final class BW3 implements DlP {
    public final /* synthetic */ VpsEventCallback A00;
    public final /* synthetic */ DlY A01;
    public final /* synthetic */ String A02;

    public BW3(VpsEventCallback vpsEventCallback, DlY dlY, String str) {
        this.A00 = vpsEventCallback;
        this.A02 = str;
        this.A01 = dlY;
    }

    @Override // X.DlP
    public final void APy(String str) {
        this.A00.A5s(new C4919DEo(this.A02, "MANIFEST", "FALLBACK_TRIGGERED", str));
    }
}
