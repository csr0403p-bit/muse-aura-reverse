package X;

import android.os.SystemClock;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dn2 implements Runnable {
    public static final String __redex_internal_original_name = "HeroPreloadManager$PreloadLruCache$ExpiredEntryRemover";
    public final /* synthetic */ C5710Dns A00;

    public Dn2(C5710Dns c5710Dns) {
        this.A00 = c5710Dns;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemClock.elapsedRealtime();
        C5710Dns c5710Dns = this.A00;
        C5668Dmx c5668Dmx = c5710Dns.A00;
        synchronized (c5668Dmx.A06) {
            Iterator itA0n = AnonymousClass002.A0n(c5710Dns.snapshot());
            if (itA0n.hasNext()) {
                C3cH.A0l(itA0n).getValue();
                throw BV4.A0a("lastAccessedRealtimeMs");
            }
        }
        c5668Dmx.A00.postDelayed(this, c5668Dmx.A05.gen.preload_eviction_duration);
    }
}
