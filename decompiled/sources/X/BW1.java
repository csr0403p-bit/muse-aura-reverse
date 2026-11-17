package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* loaded from: classes5.dex */
public final class BW1 implements InterfaceC6133Dwb {
    public final /* synthetic */ VpsEventCallback A00;
    public final /* synthetic */ DlY A01;
    public final /* synthetic */ String A02;

    public BW1(VpsEventCallback vpsEventCallback, DlY dlY, String str) {
        this.A00 = vpsEventCallback;
        this.A02 = str;
        this.A01 = dlY;
    }

    @Override // X.InterfaceC6133Dwb
    public final void APy(String str) {
        this.A00.A5s(new C4919DEo(this.A02, "MEDIA_CODEC_RENDERER_UPGRADE", "MEDIA_CODEC_RENDERER_SUPPORT_FORMAT_CHANGE", str));
    }
}
