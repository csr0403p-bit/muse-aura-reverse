package X;

import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GR8 extends AbstractC7559F3s implements G0V<GRH, ArrayList<CallParticipant>, Unit> {
    public final /* synthetic */ GR9 $call;
    public final /* synthetic */ Integer $renderHeight;
    public final /* synthetic */ GQY $renderTargetKey;
    public final /* synthetic */ Integer $renderWidth;
    public final /* synthetic */ VideoRenderApi $videoApi;
    public final /* synthetic */ C9591GQq this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GR8(GQY gqy, C9591GQq c9591GQq, GR9 gr9, VideoRenderApi videoRenderApi, Integer num, Integer num2) {
        super(2);
        this.this$0 = c9591GQq;
        this.$call = gr9;
        this.$videoApi = videoRenderApi;
        this.$renderTargetKey = gqy;
        this.$renderWidth = num;
        this.$renderHeight = num2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(GRH grh, ArrayList<CallParticipant> arrayList) {
        C9591GQq.A00(this.$renderTargetKey, this.this$0, this.$call, this.$videoApi, this.$renderWidth, this.$renderHeight);
        return Unit.INSTANCE;
    }
}
