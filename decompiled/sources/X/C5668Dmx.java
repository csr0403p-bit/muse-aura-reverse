package X;

import android.content.Context;
import android.os.Handler;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Suppliers$NonSerializableMemoizingSupplier;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dmx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5668Dmx {
    public Handler A00;
    public DDR A01;
    public C5814Dpy A02;
    public final LruCache A03;
    public final LruCache<String, String> A04;
    public final HeroPlayerSetting A05;
    public final Object A06 = C3cG.A0T();
    public final Context A07;
    public final InterfaceC6063Duy A08;
    public final InterfaceC6109Dvo A09;
    public final C5616Dlx A0A;
    public final Map<String, String> A0B;
    public final AtomicBoolean A0C;
    public final AtomicReference A0D;
    public volatile C5605Dlk A0E;

    public C5668Dmx(Context context, Handler handler, DDR ddr, C5616Dlx c5616Dlx, C5605Dlk c5605Dlk, HeroPlayerSetting heroPlayerSetting, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        LruCache<String, String> lruCache;
        this.A0C = atomicBoolean;
        this.A0E = c5605Dlk;
        this.A0B = map;
        this.A00 = handler;
        this.A01 = ddr;
        this.A07 = context;
        this.A0D = atomicReference;
        this.A05 = heroPlayerSetting;
        DrU drU = new DrU(this);
        this.A08 = drU;
        this.A0A = c5616Dlx;
        Dlv dlv = heroPlayerSetting.gen;
        if (dlv.disable_preload_on_hardware_stress) {
            this.A09 = InterfaceC6109Dvo.A00;
        }
        this.A03 = new C5710Dns(this, (int) dlv.preload_max_window_size);
        long j = heroPlayerSetting.gen.preload_used_by_player_cache_size;
        if (j > 0) {
            lruCache = new LruCache<>((int) j);
            this.A04 = lruCache;
        } else {
            lruCache = null;
        }
        this.A02 = new C5814Dpy(lruCache, new C5813Dpx(null), drU, c5616Dlx, heroPlayerSetting, new Suppliers$NonSerializableMemoizingSupplier(new CL8(context, 12)));
    }
}
