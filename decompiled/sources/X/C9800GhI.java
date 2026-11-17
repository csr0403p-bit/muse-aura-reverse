package X;

/* renamed from: X.GhI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9800GhI extends AbstractC9793Gh8 {
    public static final long serialVersionUID = 1;
    public AbstractC9870GjI _actualType;
    public final int _ordinal;

    public C9800GhI(int i) {
        super(C9860Gj8.A05, C9861Gj9.A00, Object.class, null, null, null, 1, false);
        this._ordinal = i;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>()TT; */
    public static void A00(C9800GhI c9800GhI) {
        throw C8j3.A18(FGI.A0M("Operation should not be attempted on ", C60Q.A0e(c9800GhI)));
    }

    @Override // X.AbstractC9870GjI
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        A0L(sbA0w);
        return sbA0w.toString();
    }
}
