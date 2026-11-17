package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;

/* renamed from: X.Cqg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4232Cqg<A extends Api.AnyClient, ResultT> {
    public final int A00;
    public final boolean A01;
    public final Feature[] A02;
    public final /* synthetic */ C4231Cqf A03;

    public static <A extends Api.AnyClient, ResultT> C4231Cqf<A, ResultT> A00() {
        C4231Cqf<A, ResultT> c4231Cqf = new C4231Cqf<>();
        c4231Cqf.A02 = true;
        c4231Cqf.A00 = 0;
        return c4231Cqf;
    }

    @Deprecated
    public C4232Cqg() {
        this.A02 = null;
        this.A01 = false;
        this.A00 = 0;
    }

    public C4232Cqg(C4231Cqf c4231Cqf, Feature[] featureArr, int i, boolean z) {
        this.A03 = c4231Cqf;
        this.A02 = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.A01 = z2;
        this.A00 = i;
    }
}
