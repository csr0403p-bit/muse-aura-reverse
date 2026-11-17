package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public final class DX8 implements InterfaceC5928DsG {
    public final HeroPlayerSetting A00;
    public final CXY A01;
    public final ConcurrentLinkedQueue<DXA> A03 = new ConcurrentLinkedQueue<>();
    public final Map A02 = BV5.A14();

    @Override // X.InterfaceC5928DsG
    public final DXA AY0() {
        Map map = this.A02;
        if (map.isEmpty()) {
            this.A03.poll();
        } else {
            BV5.A11(map).next();
            map.remove(null);
        }
        AbstractC3426CMt.A03("SlotBasedWarmupRequestQueue", "warmup queue is empty", new Object[0]);
        return null;
    }

    @Override // X.InterfaceC5928DsG
    public final boolean isEmpty() {
        return this.A03.isEmpty() && this.A02.isEmpty();
    }

    @Override // X.InterfaceC5928DsG
    public final int size() {
        return this.A03.size() + this.A02.size();
    }

    public DX8(HeroPlayerSetting heroPlayerSetting, CXY cxy) {
        this.A01 = cxy;
        this.A00 = heroPlayerSetting;
    }
}
