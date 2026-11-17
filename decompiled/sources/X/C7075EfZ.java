package X;

import android.util.Pair;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.EfZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7075EfZ<T> extends AbstractC7024EeV<T, T> {
    public final /* synthetic */ C7076Efa<T> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7075EfZ(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7028EeZ<T> interfaceC7028EeZ2) {
        super(interfaceC7028EeZ);
        this.A00 = interfaceC7028EeZ2;
    }

    public static final void A00(C7075EfZ c7075EfZ) {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        C7076Efa<T> c7076Efa = c7075EfZ.A00;
        synchronized (c7076Efa) {
            Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea> pairPoll = c7076Efa.A02.poll();
            c10543HqvA0z.element = pairPoll;
            if (pairPoll == null) {
                c7076Efa.A00--;
            }
        }
        if (c10543HqvA0z.element != null) {
            c7076Efa.A03.execute(new RunnableC7077Efb(c7076Efa, c10543HqvA0z));
        }
    }
}
