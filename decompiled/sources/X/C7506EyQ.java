package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.EyQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7506EyQ implements Ejq {
    public final Uri A00;
    public final Uri A01;
    public final Map<String, Object> A02;

    /* JADX WARN: Incorrect types in method signature: (Landroid/net/Uri;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;)V */
    public C7506EyQ(Map map, Uri uri) {
        C7384Etj.A0Y(uri, 0);
        this.A01 = uri;
        this.A02 = map;
        this.A00 = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.SingleImageSourceImpl");
                C7506EyQ c7506EyQ = (C7506EyQ) obj;
                if (!this.A00.equals(c7506EyQ.A00) || !C7384Etj.areEqual(this.A02, c7506EyQ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ejq
    public final /* bridge */ String ADg() {
        return "SingleImageSource";
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + C60R.A01(this.A02);
    }

    public final String toString() {
        return C3cJ.A0L(this.A02, ", extras=", C3cG.A0f(this.A01, "SingleImageSourceImpl(uri="));
    }
}
