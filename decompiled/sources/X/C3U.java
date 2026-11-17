package X;

import android.util.Log;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;

/* loaded from: classes5.dex */
public final class C3U implements InterfaceC3204C3e {
    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError) || (unsatisfiedLinkError instanceof SoLoaderDSONotFoundError)) {
            return false;
        }
        String str = ((SoLoaderULError) unsatisfiedLinkError).mSoName;
        Log.e("SoLoader", AnonymousClass001.A0v(str == null ? "" : FGI.A0M(", retrying for specific library ", str), C3cG.A0f(unsatisfiedLinkError, "Reunpacking NonApk UnpackingSoSources due to ")));
        for (C3g c3g : c3gArr) {
            if (c3g != null && (c3g instanceof AbstractC3198C2y) && !(c3g instanceof C3X)) {
                try {
                    Log.e("SoLoader", FGI.A0M("Runpacking ", c3g.A04()));
                    c3g.A08(2);
                } catch (Exception e) {
                    Log.e("SoLoader", FGI.A0h("Encountered an exception while reunpacking ", c3g.A04(), " for library ", str, ": "), e);
                    return false;
                }
            }
        }
        return true;
    }
}
