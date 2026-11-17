package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.Bfm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2620Bfm<T> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    void A3j(InterfaceC2655Bgn interfaceC2655Bgn, Executor executor);

    ListenableFuture<T> ABL();

    void Aau(InterfaceC2655Bgn<? super T> interfaceC2655Bgn);
}
