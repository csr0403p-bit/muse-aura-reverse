package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.DoF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5720DoF {
    public final Handler A00;
    public final C5990DtX A01;
    public final HeroPlayerSetting A02;
    public volatile long A05 = -1;
    public volatile long A04 = -1;
    public final Runnable A03 = new RunnableC5652Dmg(this);

    public final void A00() {
        HeroPlayerSetting heroPlayerSetting = this.A02;
        if (heroPlayerSetting.enableBlackscreenDetector || heroPlayerSetting.gen.enable_blackscreen_detector) {
            this.A00.removeCallbacks(this.A03);
        }
    }

    public C5720DoF(Handler handler, C5990DtX c5990DtX, HeroPlayerSetting heroPlayerSetting) {
        this.A02 = heroPlayerSetting;
        this.A00 = handler;
        this.A01 = c5990DtX;
    }
}
