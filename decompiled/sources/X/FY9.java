package X;

import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderItem;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FY9 extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FY9(GRZ grz, String str, List list, AtomicInteger atomicInteger, G0U g0u, G0V g0v) {
        super(1);
        this.$t = 1;
        this.A03 = grz;
        this.A02 = null;
        this.A06 = str;
        this.A00 = atomicInteger;
        this.A04 = g0v;
        this.A01 = list;
        this.A05 = g0u;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            C7384Etj.A0Y(obj, 0);
            Thread threadCurrentThread = Thread.currentThread();
            GRZ grz = (GRZ) this.A03;
            F0C f0c = grz.A02;
            f0c.getValue();
            grz.AFy().invoke();
            ((Executor) f0c.getValue()).execute(new GRY(grz, obj, threadCurrentThread, (List) this.A01, (AtomicInteger) this.A00, (G0U) this.A05, (G0V) this.A04));
            return obj;
        }
        GR9 gr9 = (GR9) obj;
        C7384Etj.A0Y(gr9, 0);
        VideoRenderApi videoRenderApi = (VideoRenderApi) gr9.ACQ(VideoRenderApi.CONVERTER);
        if (videoRenderApi == null) {
            AbstractC7608F5v.A1L("addPeerRenderTarget called without VideoRenderApi; skipping");
        } else {
            C9591GQq c9591GQq = (C9591GQq) this.A05;
            ArrayList<String> arrayList = C9591GQq.A0E;
            if (c9591GQq.A00 == null) {
                c9591GQq.A00 = videoRenderApi.createRenderSurface();
            }
            GQY gqy = (GQY) this.A02;
            Integer num = (Integer) this.A03;
            Integer num2 = (Integer) this.A01;
            if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0 && !C9591GQq.A00(gqy, c9591GQq, gr9, videoRenderApi, num, num2)) {
                boolean z = false;
                Function0<Unit> function0Put = null;
                Function0<Unit> function0A00 = GRK.A00(((C9597GRd) gr9).A05).A00(new C9599GRf(gqy, c9591GQq, gr9, videoRenderApi, num, num2), true);
                synchronized (c9591GQq.A03) {
                    if (c9591GQq.A08.contains(gqy)) {
                        z = true;
                    } else {
                        function0Put = c9591GQq.A07.put(gqy, function0A00);
                    }
                }
                Function0<Unit> function0 = function0Put;
                if (function0 != null) {
                    function0.invoke();
                }
                if (z) {
                    function0A00.invoke();
                }
            }
            VideoRenderSurface videoRenderSurface = c9591GQq.A00;
            if (videoRenderSurface != null) {
                videoRenderSurface.addRenderItem(new VideoRenderItem(new StreamInfo(1, null), new C9592GQr(gqy, c9591GQq, gr9, videoRenderApi, (InterfaceC10526Hou) this.A04, num, num2, (Function0) this.A00), this.A06));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GQq;LX/GQY;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/Hou;)V */
    public FY9(GQY gqy, C9591GQq c9591GQq, InterfaceC10526Hou interfaceC10526Hou, Integer num, Integer num2, String str, Function0 function0) {
        super(1);
        this.$t = 0;
        this.A05 = c9591GQq;
        this.A02 = gqy;
        this.A03 = num;
        this.A01 = num2;
        this.A06 = str;
        this.A00 = function0;
        this.A04 = interfaceC10526Hou;
    }
}
