package X;

import android.util.Log;
import com.facebook.soloader.SoLoaderULError;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class C3A implements InterfaceC3204C3e {
    public final C3B A00;

    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) {
        int i;
        C3g c3g;
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        Log.e("SoLoader", "Checking /data/app missing libraries.");
        File fileA0G = BV4.A0G(this.A00.A00.getApplicationInfo().nativeLibraryDir);
        try {
            if (!fileA0G.exists()) {
                for (C3g c3g2 : c3gArr) {
                    if (c3g2 instanceof C3X) {
                        StringBuilder sbA0w = C60O.A0w();
                        sbA0w.append("Native library directory ");
                        sbA0w.append(fileA0G);
                        Log.e("SoLoader", AnonymousClass001.A0v(" does not exist, will unpack everything under /data/data.", sbA0w));
                        c3g = c3g2;
                        c3g.A08(0);
                        break;
                    }
                }
            } else {
                ArrayList arrayListA0h = C3cG.A0h();
                for (C3g c3g3 : c3gArr) {
                    if (c3g3 instanceof C3X) {
                        AbstractC3198C2y abstractC3198C2y = (AbstractC3198C2y) c3g3;
                        for (C30 c30 : abstractC3198C2y.A0B()) {
                            if (!BV5.A1R(fileA0G, c30.A01)) {
                                arrayListA0h.add(c30.A01);
                            }
                        }
                        if (!arrayListA0h.isEmpty()) {
                            StringBuilder sbA0w2 = C60O.A0w();
                            sbA0w2.append("Missing libraries from ");
                            sbA0w2.append(fileA0G);
                            sbA0w2.append(": ");
                            BV4.A1O(sbA0w2, arrayListA0h);
                            Log.e("SoLoader", AnonymousClass001.A0v(", will run prepare on tbe backup so source", sbA0w2));
                            c3g = abstractC3198C2y;
                            c3g.A08(0);
                            break;
                        }
                        Log.e("SoLoader", AnonymousClass006.A0y(fileA0G, "No libraries missing from ", C60O.A0w()));
                        return false;
                    }
                }
            }
            for (int i2 = 0; i2 < i; i2++) {
                C3g c3g4 = c3gArr[i2];
                if ((c3g4 instanceof C3H) && !(c3g4 instanceof C3X)) {
                    ((C3H) c3g4).A00 |= 1;
                }
            }
            Log.e("SoLoader", "Successfully recovered from /data/app disk failure.");
            return true;
        } catch (Exception e) {
            Log.e("SoLoader", "Encountered an exception while recovering from /data/app failure ", e);
            return false;
        }
    }

    public C3A(C3B c3b) {
        this.A00 = c3b;
    }
}
