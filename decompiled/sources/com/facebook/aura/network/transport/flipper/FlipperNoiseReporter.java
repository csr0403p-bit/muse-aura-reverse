package com.facebook.aura.network.transport.flipper;

import X.AnonymousClass006;
import X.AnonymousClass751;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import X.DCl;
import X.HxE;
import java.util.List;

/* loaded from: classes5.dex */
public final class FlipperNoiseReporter {
    public static final Companion Companion = new Companion();
    public static final int EXTENDED_CONNECT_STATUS_CODE = 200;
    public static final int SWITCHING_PROTOCOLS_STATUS_CODE = 101;
    public final List<HxE<String, String>> headers;
    public final boolean http2ExtendedConnect;
    public final String requestId;
    public final boolean shouldReportToFlipper;
    public final String url;

    public FlipperNoiseReporter() {
        this(null, C0881AGi.A00, false);
    }

    public final void onFailure(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        if (!this.shouldReportToFlipper || this.requestId == null) {
            return;
        }
        str.getBytes(DCl.A05);
        if (num != null) {
            C7384Etj.A0Y(AnonymousClass006.A10("X-Hatch-Transport", "NoiseGateway"), 3);
        }
        synchronized (AnonymousClass751.class) {
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String startConnection() {
        return null;
    }

    public final void onReady() {
        if (!this.shouldReportToFlipper || this.requestId == null) {
            return;
        }
        "noise.ready".getBytes(DCl.A05);
        C7384Etj.A0Y(AnonymousClass006.A10("X-Hatch-Transport", "NoiseGateway"), 3);
        synchronized (AnonymousClass751.class) {
        }
    }

    public FlipperNoiseReporter(String str, List<HxE<String, String>> list, boolean z) {
        C7384Etj.A0Y(list, 1);
        this.url = str;
        this.headers = list;
        this.http2ExtendedConnect = z;
        this.requestId = null;
        this.shouldReportToFlipper = false;
    }

    public /* synthetic */ FlipperNoiseReporter(String str, List list, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C0881AGi.A00 : list, (i & 4) != 0 ? false : z);
    }
}
