package X;

import android.util.Log;
import java.io.File;

/* renamed from: X.C2w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3197C2w implements InterfaceC3204C3e {
    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) throws Throwable {
        for (C3g c3g : c3gArr) {
            if (c3g != null && (c3g instanceof AbstractC3198C2y)) {
                C3H c3h = (C3H) c3g;
                Log.e("SoLoader", FGI.A0M("Waiting on SoSource ", c3g.A04()));
                File file = c3h.A01;
                try {
                    C2D.A00(file, C3cG.A0O(file, "dso_lock")).close();
                } catch (Exception e) {
                    StringBuilder sbA0x = C60O.A0x("Encountered exception during wait for unpacking trying to acquire file lock for ");
                    sbA0x.append(C60Q.A0e(c3h));
                    sbA0x.append(" (");
                    sbA0x.append(file);
                    Log.e("fb-UnpackingSoSource", AnonymousClass001.A0v("): ", sbA0x), e);
                }
            }
        }
        return true;
    }
}
