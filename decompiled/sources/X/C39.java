package X;

import android.util.Log;
import com.facebook.soloader.SoLoaderULError;

/* loaded from: classes5.dex */
public final class C39 implements InterfaceC3204C3e {
    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) {
        if (unsatisfiedLinkError instanceof SoLoaderULError) {
            Log.e("SoLoader", "Checking /data/data missing libraries.");
            boolean z = false;
            for (C3g c3g : c3gArr) {
                if ((c3g instanceof AbstractC3198C2y) && !(c3g instanceof C3X)) {
                    AbstractC3198C2y abstractC3198C2y = (AbstractC3198C2y) c3g;
                    try {
                        C30[] c30ArrA0B = abstractC3198C2y.A0B();
                        int length = c30ArrA0B.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                C30 c30 = c30ArrA0B[i];
                                if (abstractC3198C2y.A03(c30.A01) == null) {
                                    Log.e("SoLoader", FGI.A0h("Missing ", c30.A01, " from ", abstractC3198C2y.A04(), ", will force prepare."));
                                    abstractC3198C2y.A08(2);
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        Log.e("SoLoader", "Encountered an exception while recovering from /data/data failure ", e);
                        return false;
                    }
                }
            }
            if (z) {
                Log.e("SoLoader", "Successfully recovered from /data/data disk failure.");
                return true;
            }
            Log.e("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        }
        return false;
    }
}
