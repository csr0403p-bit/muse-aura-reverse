package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Supplier;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class DF7 {
    public DFB<?> A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Uri A05;
    public final Handler A06;
    public final DE9 A07;
    public final DFE A08;
    public final DEW A09;
    public final VpsEventCallback A0A;
    public final C3159C0h A0B;
    public final DEZ A0C;
    public final C4922DEs A0D;
    public volatile Integer A0H = C79.A0T;
    public final Object A0E = C3cG.A0T();
    public final AtomicInteger A0F = BV4.A13(0);
    public volatile boolean A0I = true;
    public final AtomicReference A0G = BV4.A15();

    public final void A04(Integer num) {
        synchronized (this.A0E) {
            this.A0H = num;
        }
    }

    public final void A05(boolean z) {
        final DF6 df6 = (DF6) this;
        synchronized (df6.A0E) {
            Integer num = df6.A0H;
            Integer num2 = C79.A00;
            if (num == num2 || df6.A0H == C79.A01) {
                return;
            }
            df6.A0H = num2;
            Uri uri = ((DF7) df6).A05;
            AbstractC3426CMt.A03("Exo2DashLiveManifestFetcher", "Manifest single load requested, uri=%s", uri);
            C3159C0h c3159C0h = df6.A0B;
            DE6 de6 = new DE6(c3159C0h.A02, c3159C0h.A03, z);
            int i = -1;
            DE7 de7 = DE7.A02;
            if (!z && df6.A01.gen.enable_live_manifest_refresh_http_urgency_zero) {
                i = DEF.LIVE_MANIFEST.value;
            }
            C4890DDe c4890DDe = new C4890DDe(de7, de6, "", null, "", "", "", "", null, null, -1, -1, -1, i, 0, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false, false);
            c4890DDe.A00 = null;
            c4890DDe.A01 = null;
            c4890DDe.A02 = null;
            c4890DDe.A03 = false;
            c4890DDe.A05 = false;
            Map map = Collections.EMPTY_MAP;
            C1G.A06(uri, "The uri must be set.");
            C1O c1o = new C1O(uri, c4890DDe, null, map, null, 1, 0, 0L, 0L, -1L);
            int i2 = -1;
            DE6 de62 = new DE6();
            if (!z && df6.A01.gen.enable_live_manifest_refresh_http_urgency_zero) {
                i2 = DEF.LIVE_MANIFEST.value;
            }
            C4890DDe c4890DDe2 = new C4890DDe(de7, de62, "", null, "", "", "", "", null, null, -1, -1, -1, i2, 0, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false, false);
            c4890DDe2.A00 = null;
            c4890DDe2.A01 = null;
            c4890DDe2.A02 = null;
            c4890DDe2.A03 = false;
            c4890DDe2.A05 = false;
            C1G.A06(uri, "The uri must be set.");
            final DF3 df3 = new DF3(df6.A05.createDataSource(), new C1O(uri, c4890DDe2, null, map, null, 1, 1, 0L, 0L, -1L), df6.A02, 4);
            if (df6.A01.gen.avoid_main_looper_for_manifest_loading) {
                df6.A06.A00(df6, df3, 1);
            } else {
                BV4.A09(((DF7) df6).A04.getMainLooper()).post(new Runnable() { // from class: X.DF9
                    public static final String __redex_internal_original_name = "Exo2DashLiveManifestFetcher$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        DF6 df62 = df6;
                        DF3 df32 = df3;
                        df62.A06.A00(df6, df32, 1);
                    }
                });
            }
            df6.A0C.A01.AWl(c1o, DEK.NOT_CACHED);
        }
    }

    public DF7(Context context, Uri uri, Handler handler, DE9 de9, DFE dfe, VpsEventCallback vpsEventCallback, C3159C0h c3159C0h, C4922DEs c4922DEs, HeroPlayerSetting heroPlayerSetting, Supplier supplier, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) throws NumberFormatException {
        int iA05;
        int i3 = i;
        String factoryName = DDU.defaultFactory.getFactoryName();
        AtomicBoolean atomicBooleanA12 = BV4.A12(false);
        DEF def = DEF.LIVE_MANIFEST;
        boolean z5 = heroPlayerSetting.disableTigonBandwidthLogging;
        boolean z6 = heroPlayerSetting.enableVrlQplLoggingEvents;
        boolean z7 = heroPlayerSetting.enableNetworkRequestIdentityTags;
        boolean z8 = heroPlayerSetting.enableNetworkRequestIdentityTagsPrefetch;
        DEY dey = new DEY(heroPlayerSetting.gen.evaluate_debug_event_extras);
        C7384Etj.A0Y(atomicBoolean, 7);
        AnonymousClass002.A1F(atomicBoolean2, 8, factoryName);
        DEW dew = new DEW(null, null, vpsEventCallback, def, dey, c3159C0h, null, supplier, null, "", factoryName, null, null, atomicBoolean, atomicBoolean2, atomicBooleanA12, new EZ8(C7426Evi.A00, 2), i2, false, false, false, z, z2, z3, z5, z6, z4, z7, z8, false);
        this.A09 = dew;
        dew.A10 = heroPlayerSetting.showDebugStats;
        this.A0C = new DEZ(dew);
        this.A04 = context;
        this.A0B = c3159C0h;
        this.A05 = uri;
        this.A01 = i <= 0 ? heroPlayerSetting.liveDashEdgeLatencyMs : i3;
        C7384Etj.A0Y(map, 0);
        if (map.containsKey("dash.live_num_segments_prefetch")) {
            String strA0p = C60O.A0p("dash.live_num_segments_prefetch", map);
            C7384Etj.A0X(strA0p);
            Integer.parseInt(strA0p);
        }
        this.A0D = c4922DEs;
        this.A0A = vpsEventCallback;
        this.A06 = handler;
        if (map.containsKey("dash.live_prefetch_max_retries")) {
            iA05 = C7384Etj.A05("dash.live_prefetch_max_retries", map);
        } else {
            iA05 = 0;
        }
        this.A02 = iA05;
        this.A07 = de9;
        this.A08 = dfe;
        this.A03 = heroPlayerSetting.forceOneSemanticsWaveHandling;
    }
}
