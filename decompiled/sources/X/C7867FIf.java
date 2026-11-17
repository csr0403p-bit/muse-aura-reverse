package X;

import kotlin.Unit;

/* renamed from: X.FIf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7867FIf<ContentType> {
    public final long A00;
    public final InterfaceC7830FGl<ContentType> A01;
    public final FIL<ContentType> A02;
    public final G0U<C7899FJt<ContentType>, Unit> A03;

    /* JADX WARN: Incorrect types in method signature: (JLX/FGl<TContentType;>;LX/G0U<-LX/FJt<TContentType;>;Lkotlin/Unit;>;)V */
    public C7867FIf(InterfaceC7830FGl interfaceC7830FGl, G0U g0u, long j) {
        this.A00 = j;
        this.A01 = interfaceC7830FGl;
        this.A03 = g0u;
        C7899FJt c7899FJt = new C7899FJt();
        g0u.invoke(c7899FJt);
        this.A02 = new FIL(this, c7899FJt.A00);
    }
}
