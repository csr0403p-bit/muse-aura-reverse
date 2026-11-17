package X;

import android.os.Message;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CGs extends C06G {
    public final C3356CGt A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CGs) && C7384Etj.areEqual(this.A00, ((CGs) obj).A00));
    }

    public static void A0y(IOException iOException, Integer num, Object obj) {
        CGs cGs = new CGs(new C3356CGt(iOException, num));
        HandlerC5202DdE handlerC5202DdE = ((C5199DdB) obj).A00.A00;
        if (handlerC5202DdE != null) {
            handlerC5202DdE.sendMessage(Message.obtain(handlerC5202DdE, 3, cGs));
        }
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(null, ", twoFactorInfo=", C3cG.A0f(this.A00, "AuthStrategyErrorData(authError="));
    }

    public CGs(C3356CGt c3356CGt) {
        this.A00 = c3356CGt;
    }
}
