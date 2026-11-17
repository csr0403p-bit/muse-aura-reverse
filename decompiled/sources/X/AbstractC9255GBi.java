package X;

import X.C78X;
import kotlin.Deprecated;

@Deprecated(message = "Polymorphic coroutine context keys are error-prone, difficult to implement correctly, and can encourage depending on implementation details. Prefer retrieving the element by its base key and casting it explicitly when needed or introducing a dedicated extension property.")
/* renamed from: X.GBi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9255GBi<B extends C78X, E extends B> implements C78I<E> {
    public final C78I<?> A00;
    public final G0U<C78X, E> A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.78I<?>] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.G0U<? super X.78X, ? extends E extends B>, X.G0U<X.78X, E extends B>] */
    public AbstractC9255GBi(C78I<B> c78i, G0U<? super C78X, ? extends E> g0u) {
        C7384Etj.A0Y(c78i, 0);
        this.A01 = g0u;
        this.A00 = c78i instanceof AbstractC9255GBi ? (C78I<B>) null : c78i;
    }
}
