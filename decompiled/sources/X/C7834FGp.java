package X;

/* renamed from: X.FGp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7834FGp<MODEL, CONTENT, BIND_DATA> {
    public final InterfaceC7833FGo<MODEL, CONTENT, BIND_DATA> A00;
    public final MODEL A01;

    public static void A00(InterfaceC7833FGo interfaceC7833FGo, FGT fgt) {
        fgt.A0U(new C7834FGp(interfaceC7833FGo, fgt));
    }

    public static void A01(InterfaceC7833FGo interfaceC7833FGo, FGT fgt, Object obj) {
        fgt.A0U(new C7834FGp(interfaceC7833FGo, obj));
    }

    /* JADX WARN: Incorrect types in method signature: (TMODEL;LX/FGo<TMODEL;TCONTENT;TBIND_DATA;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C7834FGp(InterfaceC7833FGo interfaceC7833FGo, Object obj) {
        this.A01 = obj;
        this.A00 = interfaceC7833FGo;
    }
}
