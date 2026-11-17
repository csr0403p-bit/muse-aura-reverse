package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bor, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2925Bor<T> implements Bs1<C2927Bot<T>> {
    public final InterfaceC2655Bgn<? super T> A00;
    public final Executor A01;
    public final AtomicBoolean A02 = BV4.A12(true);

    @Override // X.Bs1
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        final C2927Bot c2927Bot = (C2927Bot) obj;
        this.A01.execute(new Runnable() { // from class: X.Bou
            public static final String __redex_internal_original_name = "LiveDataObservable$LiveDataObserverAdapter$$ExternalSyntheticLambda0";

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                C2925Bor c2925Bor = this.A00;
                C2927Bot c2927Bot2 = c2927Bot;
                if (c2925Bor.A02.get()) {
                    c2925Bor.A00.AUJ(c2927Bot2.A00);
                }
            }
        });
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    public C2925Bor(InterfaceC2655Bgn interfaceC2655Bgn, Executor executor) {
        this.A01 = executor;
        this.A00 = interfaceC2655Bgn;
    }
}
