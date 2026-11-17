package X;

import android.os.Handler;
import android.util.LruCache;
import com.facebook.video.heroplayer.common.WarmupPlayerInfo;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Dmt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5664Dmt {
    public final LruCache<String, WarmupPlayerInfo> A00;
    public final LruCache<String, WarmupPlayerInfo> A01;
    public final LruCache<String, WarmupPlayerInfo> A02;
    public final C5988DtV A03;
    public final HeroPlayerSetting A04;
    public final C5828DqH A05;
    public final Dw5 A08;
    public final CXY A09;
    public final Handler A07 = C60O.A02();
    public final Set<String> A0A = C60O.A18();
    public final ConcurrentHashMap<String, String> A06 = C60O.A1C();

    public C5664Dmt(Dw5 dw5, C5988DtV c5988DtV, HeroPlayerSetting heroPlayerSetting, CXY cxy) {
        this.A04 = heroPlayerSetting;
        this.A03 = c5988DtV;
        this.A09 = cxy;
        this.A08 = dw5;
        Dlv dlv = heroPlayerSetting.gen;
        this.A05 = (dlv == null || !dlv.enable_warmup_surfacetexture_pool) ? null : new C5828DqH(heroPlayerSetting);
        int i = heroPlayerSetting.playerReusePoolSize;
        this.A02 = i > 0 ? new F42(this, i, 3) : null;
        this.A00 = new F42(this, heroPlayerSetting.playerWarmUpPoolSize, 4);
        this.A01 = new F42(this);
    }
}
