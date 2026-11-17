package X;

import android.os.StrictMode;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;

/* loaded from: classes5.dex */
public final class C2A extends C3g {
    @Override // X.C3g
    public final String toString() {
        return FGI.A0d("SystemLoadWrapperSoSource", "[", C2D.A01(), "]");
    }

    @Override // X.C3g
    public final int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (UnsatisfiedLinkError e) {
            ClassLoader classLoader = C2A.class.getClassLoader();
            if (!(classLoader instanceof BaseDexClassLoader)) {
                Log.w("SoLoader", "ClassLoader is not a BaseDexClassLoader");
            } else if (((BaseDexClassLoader) classLoader).findLibrary(str) != null) {
                throw e;
            }
            Log.e("SoLoader", FGI.A0M("Error loading library: ", str), e);
            return 0;
        }
    }
}
