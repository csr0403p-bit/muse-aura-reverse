package X;

import android.util.LruCache;

/* renamed from: X.Dns, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5710Dns extends LruCache {
    public final /* synthetic */ C5668Dmx A00;

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5710Dns(C5668Dmx c5668Dmx, int i) {
        super(i);
        this.A00 = c5668Dmx;
        Dlv dlv = c5668Dmx.A05.gen;
        long j = dlv.preload_eviction_duration;
        if (dlv.enable_timed_preload_eviction) {
            c5668Dmx.A00.postDelayed(new Dn2(this), j);
        }
    }
}
