package X;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/* renamed from: X.DnA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5672DnA implements Closeable {
    public long A00;
    public final C5601Dlg A01;
    public final Runnable A06;
    public final BooleanSupplier A07;
    public final Consumer<Consumer<Boolean>> A08;
    public volatile InterfaceC5661Dmq A09;
    public volatile InterfaceC6009Dts A0A;
    public volatile DmR A0B;
    public final Object A03 = C3cG.A0T();
    public final AtomicBoolean A04 = new AtomicBoolean();
    public final C6029DuO A05 = new C6029DuO(this);
    public final Object A02 = C3cG.A0T();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.A03) {
            this.A00++;
        }
        this.A04.compareAndSet(false, true);
        synchronized (this.A02) {
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dlg;LX/Dmq;LX/DmR;LX/Dts;Ljava/util/function/Consumer<Ljava/util/function/Consumer<Ljava/lang/Boolean;>;>;Ljava/util/function/BooleanSupplier;Ljava/lang/Runnable;)V */
    public C5672DnA(InterfaceC5661Dmq interfaceC5661Dmq, InterfaceC6009Dts interfaceC6009Dts, DmR dmR, C5601Dlg c5601Dlg, Runnable runnable, BooleanSupplier booleanSupplier, Consumer consumer) {
        this.A01 = c5601Dlg;
        this.A08 = consumer;
        this.A07 = booleanSupplier;
        this.A06 = runnable;
        this.A09 = interfaceC5661Dmq;
        this.A0B = dmR;
        this.A0A = interfaceC6009Dts;
    }
}
