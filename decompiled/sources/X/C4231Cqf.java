package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;

/* renamed from: X.Cqf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4231Cqf<A extends Api.AnyClient, ResultT> {
    public InterfaceC4375CuV A01;
    public Feature[] A03;
    public boolean A02 = true;
    public int A00 = 0;

    public final C4232Cqg<A, ResultT> A00() {
        CRy.A08(AnonymousClass002.A1X(this.A01), "execute parameter required");
        return new C4232Cqg<>(this, this.A03, this.A00, this.A02);
    }
}
