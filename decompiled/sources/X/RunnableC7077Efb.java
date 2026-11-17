package X;

import android.util.Pair;

/* renamed from: X.Efb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7077Efb implements Runnable {
    public static final String __redex_internal_original_name = "ThrottlingProducer$ThrottlerConsumer$onRequestFinished$2";
    public final /* synthetic */ C7076Efa<T> A00;
    public final /* synthetic */ C10543Hqv<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> A01;

    public RunnableC7077Efb(C7076Efa<T> c7076Efa, C10543Hqv<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> c10543Hqv) {
        this.A00 = c7076Efa;
        this.A01 = c10543Hqv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C7076Efa<T> c7076Efa = this.A00;
        C10543Hqv<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> c10543Hqv = this.A01;
        Object obj = ((Pair) c10543Hqv.element).first;
        C7384Etj.A0T(obj);
        InterfaceC7028EeZ interfaceC7028EeZ = (InterfaceC7028EeZ) obj;
        Object obj2 = ((Pair) c10543Hqv.element).second;
        C7384Etj.A0T(obj2);
        InterfaceC7029Eea interfaceC7029Eea = (InterfaceC7029Eea) obj2;
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        ((C7185Ehv) interfaceC7029Eea).A05.AV4(interfaceC7029Eea, "ThrottlingProducer", null);
        c7076Efa.A01.AYc(new C7075EfZ(interfaceC7028EeZ, c7076Efa), interfaceC7029Eea);
    }
}
