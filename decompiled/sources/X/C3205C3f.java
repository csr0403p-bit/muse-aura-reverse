package X;

import android.content.pm.ApplicationInfo;
import android.os.StrictMode;

/* renamed from: X.C3f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3205C3f extends C3g implements C3F {
    public C3H A00;

    @Override // X.C3g
    public final String A05(String str) {
        return this.A00.A05(str);
    }

    @Override // X.C3g
    public final String[] A06(String str) {
        return this.A00.A06(str);
    }

    @Override // X.C3g
    public final int A07(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return this.A00.A07(threadPolicy, str, i);
    }

    @Override // X.C3g
    public final void A08(int i) {
        this.A00.A08(i);
    }

    @Override // X.C3F
    public final C3g AZr(ApplicationInfo applicationInfo) {
        this.A00 = new C3H(BV4.A0G(applicationInfo.nativeLibraryDir), 1);
        return this;
    }

    @Override // X.C3g
    public final String toString() {
        return FGI.A0d("ApplicationSoSource", "[", this.A00.toString(), "]");
    }
}
