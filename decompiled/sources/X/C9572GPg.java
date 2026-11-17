package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.CoroutineConnectionManager;
import kotlin.Unit;

/* renamed from: X.GPg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9572GPg {
    public boolean A00;
    public final G0U<InterfaceC10512HoG, Unit> A01;
    public final HoC A02;
    public final /* synthetic */ CoroutineConnectionManager A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C9572GPg(CoroutineConnectionManager coroutineConnectionManager, C78U c78u, G0U<? super InterfaceC10512HoG, Unit> g0u) {
        this.A03 = coroutineConnectionManager;
        this.A01 = g0u;
        this.A02 = c78u.A02(new C8902FtJ(this, null, 3));
    }
}
