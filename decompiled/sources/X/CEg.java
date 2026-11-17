package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final /* synthetic */ class CEg implements CSP {
    @Override // X.CSP
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }
}
