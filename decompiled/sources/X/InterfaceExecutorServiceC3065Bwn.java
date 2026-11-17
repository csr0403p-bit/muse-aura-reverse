package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Bwn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceExecutorServiceC3065Bwn extends ExecutorService {
    <T> ListenableFuture<T> Aga(Callable<T> task);
}
