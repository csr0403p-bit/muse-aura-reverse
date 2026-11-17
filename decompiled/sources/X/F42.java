package X;

import X.BV4;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.LruCache;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class F42 extends LruCache {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F42(DF8 df8) {
        super(10);
        this.$t = 2;
        this.A00 = df8;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        DEC dec;
        LruCache<DEC, C1J> lruCache;
        switch (this.$t) {
            case 0:
                dec = (DEC) obj;
                C1J c1j = (C1J) obj2;
                AnonymousClass003.A0x(dec, c1j);
                if (!z) {
                    return;
                }
                try {
                    c1j.close();
                } catch (IOException e) {
                    CFK.A0A("DataSourceCache", "Failed to close data source", e);
                }
                lruCache = ((DEV) this.A00).A03.get(dec.A02);
                if (lruCache == null) {
                    return;
                }
                break;
            case 1:
                dec = (DEC) obj;
                C1J c1j2 = (C1J) obj2;
                AnonymousClass003.A0x(dec, c1j2);
                try {
                    if (!z) {
                        if (size() == 0) {
                            HashMap<String, LruCache<DEC, C1J>> map = ((DEV) this.A00).A03;
                            C0862A6j.A01(map).remove(dec.A02);
                            return;
                        }
                        return;
                    }
                    try {
                        c1j2.close();
                    } catch (IOException e2) {
                        CFK.A0A("DataSourceCache", "Failed to close data source", e2);
                    }
                    lruCache = ((DEV) this.A00).A02;
                    break;
                } catch (Throwable th) {
                    ((DEV) this.A00).A02.remove(dec);
                    throw th;
                }
            case 2:
                DF7 df7 = (DF7) obj2;
                if (df7 == obj3 || !(df7 instanceof DF6)) {
                    return;
                }
                DF6 df6 = (DF6) df7;
                if (df6.A01.enableLivePrefetchManifestSelfRefresh) {
                    df6.A0I = false;
                    DF6.A00(df6, "cache eviction");
                    return;
                }
                return;
            default:
                final C5664Dmt c5664Dmt = (C5664Dmt) this.A00;
                if (z) {
                    final C5616Dlx c5616Dlx = c5664Dmt.A03.A00;
                    new ResultReceiver() { // from class: com.facebook.video.heroplayer.warmup.WarmupPool$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(null);
                        }

                        @Override // android.os.ResultReceiver
                        public final void onReceiveResult(int i, Bundle bundle) {
                            throw BV4.A0a("mPlayerId");
                        }
                    };
                    throw BV4.A0a("mPlayerId");
                }
                return;
        }
        lruCache.remove(dec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F42(Object obj, int i, int i2) {
        super(i);
        this.$t = i2;
        this.A00 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F42(C5664Dmt c5664Dmt) {
        super(1);
        this.$t = 5;
        this.A00 = c5664Dmt;
    }
}
