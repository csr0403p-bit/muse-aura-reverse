package com.facebook.aura.common.video;

import X.C5597Dlc;
import X.DDS;
import X.Dlv;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: classes5.dex */
public final class HatchVideoPlayerGrootHelper {
    public static final int $stable = 0;
    public static final HatchVideoPlayerGrootHelper INSTANCE = new HatchVideoPlayerGrootHelper();

    public final HeroPlayerSetting getHeroPlayerSetting() {
        C5597Dlc c5597Dlc = new C5597Dlc();
        c5597Dlc.A0V = true;
        c5597Dlc.A0U = true;
        c5597Dlc.A0X = true;
        c5597Dlc.A00 = 4;
        c5597Dlc.A0Y = true;
        c5597Dlc.A0W = true;
        c5597Dlc.A09 = new DDS(5000L, true, true, true, true, true);
        c5597Dlc.A0C = new Dlv(true, true, true, true, true, true, true);
        return new HeroPlayerSetting(c5597Dlc);
    }
}
