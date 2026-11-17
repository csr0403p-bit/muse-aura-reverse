package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public final class DX9 implements InterfaceC5928DsG {
    public final HeroPlayerSetting A00;
    public final CXY A01;
    public final ConcurrentLinkedQueue<DXA> A02 = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<DXA> A03 = new ConcurrentLinkedQueue<>();

    @Override // X.InterfaceC5928DsG
    public final DXA AY0() {
        this.A02.poll();
        this.A03.poll();
        AbstractC3426CMt.A03("PriorityWarmupRequestQueue", "warmup queue is empty", BV4.A1W());
        return null;
    }

    @Override // X.InterfaceC5928DsG
    public final boolean isEmpty() {
        return this.A02.isEmpty() && this.A03.isEmpty();
    }

    @Override // X.InterfaceC5928DsG
    public final int size() {
        return this.A02.size() + this.A03.size();
    }

    public DX9(HeroPlayerSetting heroPlayerSetting, CXY cxy) {
        this.A01 = cxy;
        this.A00 = heroPlayerSetting;
    }
}
