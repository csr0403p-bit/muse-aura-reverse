package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FNo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7973FNo extends AbstractC7972FNn {
    public final C7975FNq<T> A00;
    public final C7974FNp<T, Config> A01;
    public final AtomicBoolean A02;

    public C7973FNo(C7979FNv c7979FNv, C7975FNq c7975FNq, C7974FNp c7974FNp) {
        super(c7979FNv, c7975FNq, new HandlerC7978FNu(AbstractC7725FCb.A01));
        this.A02 = C60O.A1E();
        this.A01 = c7974FNp;
        this.A00 = c7975FNq;
    }

    public static void A01(C7973FNo c7973FNo) {
        if (C3cI.A1W(c7973FNo.A02)) {
            C7974FNp<T, Config> c7974FNp = c7973FNo.A01;
            FO9 fo9 = c7974FNp.A02;
            if (fo9.AOp()) {
                return;
            }
            fo9.AYE(new FO3(c7974FNp));
        }
    }
}
