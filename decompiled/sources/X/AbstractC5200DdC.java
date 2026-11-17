package X;

import android.os.Message;

/* renamed from: X.DdC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5200DdC extends C5211DdN {
    public final Integer A00;
    public final String A01 = "AuthManagerImplStateMachine";

    public AbstractC5200DdC(Integer num) {
        this.A00 = num;
    }

    public static C5208DdK A00(C5201DdD c5201DdD) {
        C5205DdH c5205DdH = c5201DdD.A01;
        C5208DdK c5208DdK = new C5208DdK();
        c5208DdK.A04 = c5205DdH.A04;
        c5208DdK.A06 = c5205DdH.A06;
        c5208DdK.A01 = c5205DdH.A01;
        c5208DdK.A00 = c5205DdH.A00;
        c5208DdK.A03 = c5205DdH.A03;
        c5208DdK.A02 = c5205DdH.A02;
        return c5208DdK;
    }

    public static NullPointerException A01(Message message, F49 f49) {
        C7384Etj.A0Z(message.obj, "null cannot be cast to non-null type com.facebook.authlite.api.manager.NavigationInput");
        C7384Etj.A0X(((C5201DdD) f49.A03).A01.A03);
        return new NullPointerException("getDestination");
    }
}
