package X;

import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class A7w implements A7r {
    public final /* synthetic */ A8C A00;
    public final /* synthetic */ A7r A01;

    public A7w(A8C a8c, A7r a7r) {
        this.A01 = a7r;
        this.A00 = a8c;
    }

    @Override // X.A7r
    public final void AWN(A7u a7u) {
        A8A a8a = this.A00.A02;
        synchronized (a8a) {
            C7384Etj.A0Y(a7u, 0);
            try {
                HashMap mapA00 = A8A.A00(a8a);
                mapA00.put(a7u.A05, a7u);
                A8A.A02(a8a, mapA00);
            } catch (JSONException unused) {
                a8a.A04();
            }
        }
        this.A01.AWN(a7u);
    }

    @Override // X.A7r
    public final void onFailure(Throwable th) {
        this.A01.onFailure(th);
    }
}
