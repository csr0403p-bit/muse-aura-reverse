package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.DdL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5209DdL {
    public C5211DdN A00;
    public boolean A01;
    public final /* synthetic */ HandlerC5202DdE A02;

    public C5209DdL(HandlerC5202DdE handlerC5202DdE) {
        this.A02 = handlerC5202DdE;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("state=");
        sbA0x.append(this.A00.A02());
        sbA0x.append(",active=");
        sbA0x.append(this.A01);
        sbA0x.append(",parent=");
        return AnonymousClass001.A0v(HatchCcvLoggingKt.NO_POSTAL_FIELD, sbA0x);
    }
}
