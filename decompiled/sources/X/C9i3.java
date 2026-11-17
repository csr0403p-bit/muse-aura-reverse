package X;

/* renamed from: X.9i3, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9i3 {
    public static final BNA A00(InterfaceC07829iw interfaceC07829iw) {
        BNA bna;
        if ((interfaceC07829iw instanceof BNA) && (bna = (BNA) interfaceC07829iw) != null) {
            return bna;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        sb.append(new C0861A6i(interfaceC07829iw.getClass()));
        throw new IllegalStateException(sb.toString());
    }

    public static final C9i4 A01(InterfaceC07789is interfaceC07789is) {
        C9i4 c9i4;
        if ((interfaceC07789is instanceof C9i4) && (c9i4 = (C9i4) interfaceC07789is) != null) {
            return c9i4;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        sb.append(new C0861A6i(interfaceC07789is.getClass()));
        throw new IllegalStateException(sb.toString());
    }
}
