package X;

import com.facebook.debug.tracer.Tracer;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import kotlin.Unit;

/* renamed from: X.GRf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9599GRf extends AbstractC7559F3s implements G0U<C9598GRe, Unit> {
    public final /* synthetic */ GR9 $call;
    public final /* synthetic */ Integer $renderHeight;
    public final /* synthetic */ GQY $renderTargetKey;
    public final /* synthetic */ Integer $renderWidth;
    public final /* synthetic */ VideoRenderApi $videoApi;
    public final /* synthetic */ C9591GQq this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9599GRf(GQY gqy, C9591GQq c9591GQq, GR9 gr9, VideoRenderApi videoRenderApi, Integer num, Integer num2) {
        super(1);
        this.this$0 = c9591GQq;
        this.$call = gr9;
        this.$videoApi = videoRenderApi;
        this.$renderTargetKey = gqy;
        this.$renderWidth = num;
        this.$renderHeight = num2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C9598GRe c9598GRe) {
        C9598GRe c9598GReA0P = AbstractC7608F5v.A0P(c9598GRe);
        GS1 gs1 = new C7354EnR() { // from class: X.GS1
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public final Object get(Object obj) {
                return ((CallModel) obj).remoteParticipants;
            }
        };
        GR8 gr8 = new GR8(this.$renderTargetKey, this.this$0, this.$call, this.$videoApi, this.$renderWidth, this.$renderHeight);
        Tracer.A01("SubscriptionInitializerV3.selectProperty");
        try {
            C9598GRe.A00(c9598GReA0P, AbstractC7610F5x.A0p(c9598GReA0P.A01, CallModel.class), gs1).put(gs1, new C10507Hnt(gr8, 5));
            Tracer.A00();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Tracer.A00();
            throw th;
        }
    }
}
