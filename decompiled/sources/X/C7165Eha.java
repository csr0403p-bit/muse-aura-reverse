package X;

import android.net.Uri;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;

/* renamed from: X.Eha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7165Eha implements CCV {
    public final int A00;
    public final CCV A01;

    @Override // X.CCV
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7165Eha) {
                C7165Eha c7165Eha = (C7165Eha) obj;
                if (this.A00 != c7165Eha.A00 || !this.A01.equals(c7165Eha.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.CCV
    public final boolean A75(Uri uri) {
        return this.A01.A75(uri);
    }

    @Override // X.CCV
    public final String AMJ() {
        return null;
    }

    @Override // X.CCV
    public final int hashCode() {
        return (this.A01.hashCode() * ConnectionReducerKt.SERVICE_NOTICE_CODE_TRY_AGAIN_LATER) + this.A00;
    }

    public C7165Eha(CCV ccv, int i) {
        this.A01 = ccv;
        this.A00 = i;
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A00(c7200EiD, this.A01, "imageCacheKey");
        C7200EiD.A01(c7200EiD, "frameIndex", this.A00);
        return c7200EiD.toString();
    }
}
