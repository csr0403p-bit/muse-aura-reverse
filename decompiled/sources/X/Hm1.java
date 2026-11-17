package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;

/* loaded from: classes6.dex */
public interface Hm1<T> extends HtJ<T> {
    boolean A5x(Throwable th);

    void A6g();

    void AO2(G0U<? super Throwable, Unit> g0u);

    <R extends T> void Abe(R r, G0W<? super Throwable, ? super R, ? super C78T, Unit> g0w);

    /* JADX WARN: Incorrect types in method signature: (TT;LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;)V */
    @Deprecated(level = Hs1.A04, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @ReplaceWith(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void Abf(G0U g0u, Object obj);

    /* JADX WARN: Incorrect types in method signature: (LX/GBK;TT;)V */
    void Abi(Object obj, GBK gbk);

    <R extends T> Object AhY(R r, Object obj, G0W<? super Throwable, ? super R, ? super C78T, Unit> g0w);

    boolean isActive();
}
