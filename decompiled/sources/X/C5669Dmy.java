package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Dmy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5669Dmy {
    public final DmR A00;
    public final HeroPlayerSetting A01;
    public final Map<BXi, C5902Drl> A02;

    public C5669Dmy(DmR dmR, HeroPlayerSetting heroPlayerSetting) {
        HashMap mapA0u = BV4.A0u();
        this.A02 = mapA0u;
        this.A01 = heroPlayerSetting;
        this.A00 = dmR;
        mapA0u.put(BXi.VOD, new C5902Drl(heroPlayerSetting.stallCountsToUpdateDynamicRebufferThreshold, heroPlayerSetting.extendedMinRebufferThresholdMs, heroPlayerSetting.allowedExtendedMinRebuffePeriodMs, heroPlayerSetting.frequentStallIntervalThresholdMs, heroPlayerSetting.globalStallCountsToUpdateDynamicRebuffer));
        mapA0u.put(BXi.LIVE_DEFAULT, new C5902Drl(1, heroPlayerSetting.extendedLiveRebufferThresholdMs, heroPlayerSetting.allowedExtendedRebufferPeriodMs, heroPlayerSetting.frequentBroadcasterStallIntervalThresholdMs, heroPlayerSetting.globalStallCountsToUpdateLiveDynamicRebuffer));
        mapA0u.put(BXi.LIVE_API_TIER, new C5902Drl(1, heroPlayerSetting.extendedApiTierLiveRebufferThresholdMs, 10000, heroPlayerSetting.frequentApiTierBroadcasterStallIntervalThresholdMs, heroPlayerSetting.globalStallCountsToUpdateLiveDynamicRebuffer));
        mapA0u.put(BXi.LIVE_PREMIUM_TIER, new C5902Drl(1, heroPlayerSetting.extendedPremiumTierLiveRebufferThresholdMs, 10000, heroPlayerSetting.frequentPremiumTierBroadcasterStallIntervalThresholdMs, heroPlayerSetting.globalStallCountsToUpdateLiveDynamicRebuffer));
    }
}
