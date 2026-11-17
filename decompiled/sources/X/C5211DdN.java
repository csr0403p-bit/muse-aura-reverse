package X;

import android.os.Message;

/* renamed from: X.DdN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5211DdN {
    public final String A02() {
        if (!(this instanceof AbstractC5200DdC)) {
            String strA0e = C60Q.A0e(this);
            return BV4.A0g(strA0e.lastIndexOf(36), strA0e);
        }
        switch (((AbstractC5200DdC) this).A00.intValue()) {
            case 1:
                return "WAITING_FOR_SSO_INFO";
            case 2:
                return "WAITING_FOR_SSO_INPUT";
            case 3:
                return "WAITING_FOR_SSO_RESPONSE";
            case 4:
                return "WAITING_FOR_USER_PASS_INPUT";
            case 5:
                return "WAITING_FOR_USER_PASS_RESPONSE";
            case 6:
                return "WAITING_FOR_TWO_FACTOR_INPUT";
            case 7:
                return "WAITING_FOR_TWO_FACTOR_RESPONSE";
            case 8:
                return "WAITING_FOR_RESEND_TWO_FACTOR_CODE_RESPONSE";
            case 9:
                return "WAITING_FOR_POST_AUTH_OPERATION";
            case 10:
                return "WAITING_FOR_PRE_SIGN_OUT_OPERATION";
            case 11:
                return "WAITING_FOR_SIGN_OUT_RESPONSE";
            case 12:
                return "WAITING_FOR_SOFT_SIGN_OUT_RESPONSE";
            case 13:
                return "WAITING_FOR_POST_SIGN_OUT_OPERATION";
            case 14:
                return "UPDATING_LOCAL_ACCOUNT";
            case 15:
                return "AUTHENTICATED";
            case 16:
                return "ERROR";
            default:
                return "INITIALIZING";
        }
    }

    public final void A03() {
        HandlerC5202DdE handlerC5202DdE;
        AbstractC5200DdC abstractC5200DdC;
        C5208DdK c5208DdKA00;
        Integer num;
        AbstractC3358CGz abstractC3358CGzA00;
        CGw cGw;
        AbstractC3358CGz abstractC3358CGzA002;
        C5201DdD c5201DdD;
        C5208DdK c5208DdKA002;
        AbstractC5200DdC abstractC5200DdC2;
        AbstractC3358CGz abstractC3358CGzA003;
        if (this instanceof AbstractC5200DdC) {
            AbstractC5200DdC abstractC5200DdC3 = (AbstractC5200DdC) this;
            CFK.A03(abstractC5200DdC3.A02(), abstractC5200DdC3.A01, "%s: enter");
            if (abstractC5200DdC3 instanceof F48) {
                F48 f48 = (F48) abstractC5200DdC3;
                if (f48.$t == 0) {
                    CGw cGw2 = (CGw) f48.A01;
                    AbstractC3358CGz abstractC3358CGzA004 = cGw2.A00();
                    boolean z = cGw2.A01.getBoolean("E2E_INJECTED", false);
                    if (abstractC3358CGzA004 != null && (abstractC3358CGzA003 = cGw2.A00()) != null && C3357CGy.A0z(abstractC3358CGzA003) != null) {
                        c5201DdD = (C5201DdD) f48.A02;
                        c5208DdKA002 = AbstractC5200DdC.A00(c5201DdD);
                        abstractC5200DdC2 = c5201DdD.A02;
                    } else if (!z && C9X.A04() && C9X.A00() != null) {
                        CFK.A05("AuthManagerImplStateMachine", "In end to end test, using auth data from tests");
                        C5198DdA c5198DdAA00 = C9X.A00();
                        if (c5198DdAA00 == null) {
                            return;
                        }
                        c5201DdD = (C5201DdD) f48.A02;
                        c5208DdKA002 = AbstractC5200DdC.A00(c5201DdD);
                        String str = c5198DdAA00.A06;
                        C7384Etj.A0T(str);
                        c5208DdKA002.A01 = AbstractC3358CGz.A00(AnonymousClass001.A0i(), str, c5198DdAA00.A00, c5198DdAA00.A05, c5198DdAA00.A04, c5198DdAA00.A01, c5198DdAA00.A07, null, null);
                        c5208DdKA002.A00 = null;
                        abstractC5200DdC2 = c5201DdD.A05;
                    } else if (((C4025CkE) f48.A00).A00 != null) {
                        c5201DdD = (C5201DdD) f48.A02;
                        c5208DdKA002 = AbstractC5200DdC.A00(c5201DdD);
                        c5208DdKA002.A01 = abstractC3358CGzA004;
                        abstractC5200DdC2 = c5201DdD.A0B;
                        c5208DdKA002.A03 = abstractC5200DdC2;
                    } else {
                        CFK.A04("AuthManagerImplStateMachine", "Unable to find a valid AuthStrategy to handle authentication.");
                        c5201DdD = (C5201DdD) f48.A02;
                        c5208DdKA002 = AbstractC5200DdC.A00(c5201DdD);
                        c5208DdKA002.A00 = new C3356CGt(null, C79.A09);
                        abstractC5200DdC2 = c5201DdD.A03;
                    }
                    C5201DdD.A01(c5201DdD, abstractC5200DdC2, c5208DdKA002);
                    return;
                }
            } else if (abstractC5200DdC3 instanceof F47) {
                F47 f47 = (F47) abstractC5200DdC3;
                switch (f47.$t) {
                    case 0:
                        C5201DdD c5201DdD2 = (C5201DdD) f47.A00;
                        AbstractC3358CGz abstractC3358CGz = c5201DdD2.A01.A01;
                        if (abstractC3358CGz == null || (abstractC3358CGzA002 = (cGw = (CGw) f47.A01).A00()) == null || ((CH0) abstractC3358CGzA002).A01.equals(((CH0) abstractC3358CGz).A01)) {
                            CGw cGw3 = (CGw) f47.A01;
                            boolean zA01 = cGw3.A01(c5201DdD2.A01.A01);
                            C5205DdH c5205DdH = c5201DdD2.A01;
                            if (zA01) {
                                abstractC5200DdC = (c5205DdH.A01 == null || (abstractC3358CGzA00 = cGw3.A00()) == null || C3357CGy.A0z(abstractC3358CGzA00) == null) ? c5201DdD2.A04 : c5201DdD2.A02;
                                c5208DdKA00 = AbstractC5200DdC.A00(c5201DdD2);
                                C5201DdD.A01(c5201DdD2, abstractC5200DdC, c5208DdKA00);
                                return;
                            } else {
                                abstractC5200DdC = c5205DdH.A03;
                                C7384Etj.A0X(abstractC5200DdC);
                                c5208DdKA00 = AbstractC5200DdC.A00(c5201DdD2);
                                c5208DdKA00.A01 = cGw3.A00();
                                num = C79.A0Y;
                            }
                        } else {
                            abstractC5200DdC = c5201DdD2.A01.A03;
                            C7384Etj.A0X(abstractC5200DdC);
                            c5208DdKA00 = AbstractC5200DdC.A00(c5201DdD2);
                            c5208DdKA00.A01 = cGw.A00();
                            num = C79.A0P;
                        }
                        c5208DdKA00.A00 = new C3356CGt(null, num);
                        C5201DdD.A01(c5201DdD2, abstractC5200DdC, c5208DdKA00);
                        return;
                    case 1:
                        break;
                    default:
                        return;
                }
            } else {
                if (!(abstractC5200DdC3 instanceof F46)) {
                    if (!(abstractC5200DdC3 instanceof C5197Dd9) || (handlerC5202DdE = ((C5197Dd9) abstractC5200DdC3).A02.A00) == null) {
                        return;
                    }
                    handlerC5202DdE.sendMessage(Message.obtain(handlerC5202DdE, 17));
                    return;
                }
                if (1 - ((F46) abstractC5200DdC3).$t != 0) {
                    return;
                }
            }
            C7384Etj.A0X(null);
            throw F60.createAndThrow();
        }
    }
}
