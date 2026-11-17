package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderFrameCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9592GQr extends VideoRenderFrameCallback {
    public boolean A00 = true;
    public final /* synthetic */ GQY A01;
    public final /* synthetic */ C9591GQq A02;
    public final /* synthetic */ GR9 A03;
    public final /* synthetic */ VideoRenderApi A04;
    public final /* synthetic */ InterfaceC10526Hou A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Function0<Unit> A08;

    @Override // com.facebook.rsys.videorender.gen.VideoRenderFrameCallback
    public final void onFrame(RSVideoFrame rSVideoFrame, int i) {
        C7384Etj.A0Y(rSVideoFrame, 0);
        if (this.A00) {
            this.A00 = false;
            C9591GQq.A00(this.A01, this.A02, this.A03, this.A04, this.A07, this.A06);
            this.A08.invoke();
        }
        this.A05.onFrame(rSVideoFrame);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GQq;LX/GR9;Lcom/facebook/rsys/videorender/gen/VideoRenderApi;LX/GQY;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/Hou;)V */
    public C9592GQr(GQY gqy, C9591GQq c9591GQq, GR9 gr9, VideoRenderApi videoRenderApi, InterfaceC10526Hou interfaceC10526Hou, Integer num, Integer num2, Function0 function0) {
        this.A02 = c9591GQq;
        this.A03 = gr9;
        this.A04 = videoRenderApi;
        this.A01 = gqy;
        this.A07 = num;
        this.A06 = num2;
        this.A08 = function0;
        this.A05 = interfaceC10526Hou;
    }
}
