package X;

import java.util.concurrent.Semaphore;

/* loaded from: classes5.dex */
public final class EFU implements ECU {
    public final EFV<byte[]> A00;
    public final Semaphore A01;
    public final InterfaceC3587CVm<byte[]> A02;

    @Override // X.ECU
    public final void AhS(ECR ecr) {
        Semaphore semaphore = this.A01;
        if (semaphore.tryAcquire()) {
            semaphore.release();
        }
    }

    public EFU(EC1 ec1) {
        ec1.getClass();
        this.A00 = new EFV<>();
        this.A01 = new Semaphore(1);
        this.A02 = new C6707EWm(this, 1);
        ec1.registerMemoryTrimmable(this);
    }
}
