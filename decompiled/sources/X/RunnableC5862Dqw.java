package X;

import com.facebook.aura.common.video.HatchVideoPlayerMetadataProvider;

/* renamed from: X.Dqw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5862Dqw implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$initVideoPlayerSessionLogger$initRunnable$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ HatchVideoPlayerMetadataProvider A01;
    public final /* synthetic */ InterfaceC6058Dut A02;
    public final /* synthetic */ C5630DmE A03;
    public final /* synthetic */ String A04;

    public RunnableC5862Dqw(HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider, InterfaceC6058Dut interfaceC6058Dut, C5630DmE c5630DmE, String str, long j) {
        this.A03 = c5630DmE;
        this.A00 = j;
        this.A01 = hatchVideoPlayerMetadataProvider;
        this.A02 = interfaceC6058Dut;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5630DmE.A04(this.A01, this.A02, this.A03, this.A04, this.A00);
    }
}
