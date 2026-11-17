package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cor, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4181Cor implements InterfaceC4394Cux {
    public final /* synthetic */ AbstractC4354Ctw A00;
    public final /* synthetic */ InterfaceC4285CsK A01;
    public final /* synthetic */ InterfaceC4460Cwc A02;
    public final /* synthetic */ CSE A03;

    public C4181Cor(AbstractC4354Ctw abstractC4354Ctw, InterfaceC4285CsK interfaceC4285CsK, InterfaceC4460Cwc interfaceC4460Cwc, CSE cse) {
        this.A00 = abstractC4354Ctw;
        this.A03 = cse;
        this.A01 = interfaceC4285CsK;
        this.A02 = interfaceC4460Cwc;
    }

    @Override // X.InterfaceC4394Cux
    public final void ASJ(Status status) {
        InterfaceC4391Cut interfaceC4391Cut;
        if (status.A00 > 0) {
            this.A03.A00.A0F(AbstractC4118CnB.A00(status));
            return;
        }
        AbstractC4354Ctw abstractC4354Ctw = this.A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) abstractC4354Ctw;
        CRy.A09(!basePendingResult.A0A, "Result has already been consumed.");
        try {
            if (!basePendingResult.A06.await(0L, timeUnit)) {
                basePendingResult.A03(Status.A0A);
            }
        } catch (InterruptedException unused) {
            basePendingResult.A03(Status.A07);
        }
        CountDownLatch countDownLatch = basePendingResult.A06;
        CRy.A09(AnonymousClass002.A1M((countDownLatch.getCount() > 0L ? 1 : (countDownLatch.getCount() == 0L ? 0 : -1))), "Result is not ready.");
        synchronized (basePendingResult.A04) {
            CRy.A09(!basePendingResult.A0A, "Result has already been consumed.");
            CRy.A09(AnonymousClass002.A1M((countDownLatch.getCount() > 0L ? 1 : (countDownLatch.getCount() == 0L ? 0 : -1))), "Result is not ready.");
            interfaceC4391Cut = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A0A = true;
        }
        basePendingResult.A07.getAndSet(null);
        CRy.A03(interfaceC4391Cut);
        this.A03.A02(this.A01.A7D(interfaceC4391Cut));
    }
}
