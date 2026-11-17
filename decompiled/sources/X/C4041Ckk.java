package X;

import java.io.IOException;

/* renamed from: X.Ckk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4041Ckk implements InterfaceC4009Cjn {
    public final /* synthetic */ HandlerC4042Ckl A00;

    public C4041Ckk(HandlerC4042Ckl handlerC4042Ckl) {
        this.A00 = handlerC4042Ckl;
    }

    @Override // X.InterfaceC4009Cjn
    public final void onFailure(IOException iOException) {
        BV4.A1D(this.A00, iOException, 5);
    }

    @Override // X.InterfaceC4009Cjn
    public final void onSuccess() {
        BV4.A1C(this.A00, 2);
    }
}
