package X;

import android.util.Log;
import com.facebook.soloader.NoBaseApkException;

/* loaded from: classes5.dex */
public final class C3E implements InterfaceC3204C3e {
    public final C3B A00;
    public final C2W A01;

    @Override // X.InterfaceC3204C3e
    public final boolean AZs(UnsatisfiedLinkError unsatisfiedLinkError, C3g[] c3gArr) {
        String str = this.A00.A00.getApplicationInfo().sourceDir;
        if (BV5.A1V(str)) {
            Log.w("soloader.recovery.CheckBaseApkExists", FGI.A0M("Base apk exists: ", str));
            return false;
        }
        StringBuilder sbA0x = C3cI.A0x("Base apk does not exist: ", str);
        sbA0x.append(". ");
        this.A01.A00(sbA0x);
        throw new NoBaseApkException(sbA0x.toString());
    }

    public C3E(C3B c3b, C2W c2w) {
        this.A01 = c2w;
        this.A00 = c3b;
    }
}
