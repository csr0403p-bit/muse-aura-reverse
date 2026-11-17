package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final /* synthetic */ class CFG implements CSP {
    public static final /* synthetic */ CFG A00 = new CFG();

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        CA9 ca9 = C3503CRd.A05;
        if (Log.isLoggable("MobileVisionBase", 6)) {
            String str = ca9.A01;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
