package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class E6J {
    public static void A00(final Context context, final C6438E5q c6438E5q, final E6Y e6y) {
        E6I e6iA7o = c6438E5q.A0h.A7o(null, c6438E5q.A0o.AIn());
        e6iA7o.A00.post(new Runnable() { // from class: X.E75
            public static final String __redex_internal_original_name = "ExoPlayerImpl$Api31$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                E6J.A01(context, c6438E5q, e6y);
            }
        });
    }

    public static /* synthetic */ void A01(Context context, C6438E5q c6438E5q, E6Y e6y) {
        C6151Dwt c6151DwtA00 = C6151Dwt.A00(context);
        if (c6151DwtA00 == null) {
            CNC.A04("ExoPlayerImpl", "MediaMetricsService unavailable.");
        } else {
            c6438E5q.A0p.A3d(c6151DwtA00);
            e6y.A01(c6151DwtA00.A05());
        }
    }
}
