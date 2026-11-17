package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DF8 {
    public final DE9 A00;
    public final C4922DEs A01;
    public final AtomicReference<LruCache<String, DF7>> A02;
    public final Context A03;
    public final LruCache<String, DF7> A04 = new LruCache<>(10);

    public DF8(Context context, C5092DXa c5092DXa, BZQ bzq, C5686DnS c5686DnS, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs) {
        DEV dev;
        this.A02 = BV4.A16(heroPlayerSetting.enableLivePrefetchManifestSelfRefresh ? new F42(this) : new LruCache(10));
        this.A03 = context;
        int i = heroPlayerSetting.numDashChunkMemoryCacheSampleStreams;
        boolean z = heroPlayerSetting.protectLivePrefetchSegments;
        if (heroPlayerSetting.singleLiveSegmentCache) {
            DEV dev2 = DE0.A0G;
            dev = new DEV();
        } else {
            dev = null;
        }
        DE9 de9 = new DE9(dev, i, z);
        this.A00 = de9;
        this.A01 = new C4922DEs(context, de9, c5092DXa, bzq, c5686DnS, heroPlayerSetting, interfaceC6113Dvs);
    }
}
