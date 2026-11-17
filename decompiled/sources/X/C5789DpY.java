package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Queue;

/* renamed from: X.DpY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5789DpY {
    public final int A04;
    public final C5647Dmb A06;
    public long A03 = 0;
    public int A00 = 0;
    public int A02 = Integer.MAX_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public final Queue<Integer> A05 = BV4.A0s();

    public C5789DpY(C5647Dmb c5647Dmb, HeroPlayerSetting heroPlayerSetting) {
        this.A04 = heroPlayerSetting.liveBufferDurationFluctuationTolerancePercent;
        this.A06 = c5647Dmb;
    }
}
