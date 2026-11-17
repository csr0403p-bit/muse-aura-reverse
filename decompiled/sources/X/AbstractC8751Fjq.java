package X;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.Fjq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8751Fjq {
    public static final Interpolator A02 = new LinearInterpolator();
    public static C6823Eab A01 = C6823Eab.A00("t", "s", "e", "o", "i", "h", "to", "ti");
    public static C6823Eab A00 = AbstractC7607F5u.A0p("x", "y");

    public static BaseInterpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = AbstractC8699Fiz.A00;
        pointF.x = Math.max(-1.0f, Math.min(1.0f, f));
        pointF.y = Math.max(-100.0f, Math.min(100.0f, pointF.y));
        float fMax = Math.max(-1.0f, Math.min(1.0f, pointF2.x));
        pointF2.x = fMax;
        float fMax2 = Math.max(-100.0f, Math.min(100.0f, pointF2.y));
        pointF2.y = fMax2;
        try {
            return new PathInterpolator(pointF.x, pointF.y, fMax, fMax2);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/EaH;LX/Eap;FLX/HoR<TT;>;ZZ)LX/FjQ<TT;>; */
    public static C8725FjQ A01(C6837Eap c6837Eap, InterfaceC10514HoR interfaceC10514HoR, AbstractC6806EaH abstractC6806EaH, float f, boolean z, boolean z2) {
        PointF pointFA02;
        PointF pointFA022;
        Interpolator interpolatorA00;
        C8725FjQ c8725FjQ;
        Interpolator interpolatorA002;
        if (!z) {
            return new C8725FjQ(interfaceC10514HoR.AXc(abstractC6806EaH, f));
        }
        if (z2) {
            abstractC6806EaH.A0G();
            boolean z3 = false;
            PointF pointFA023 = null;
            PointF pointFA024 = null;
            PointF pointF = null;
            Object objAXc = null;
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            pointFA02 = null;
            pointFA022 = null;
            float fA09 = 0.0f;
            Object objAXc2 = null;
            while (abstractC6806EaH.A0L()) {
                switch (abstractC6806EaH.A0B(A01)) {
                    case 0:
                        fA09 = (float) abstractC6806EaH.A09();
                        continue;
                    case 1:
                        objAXc = interfaceC10514HoR.AXc(abstractC6806EaH, f);
                        continue;
                    case 2:
                        objAXc2 = interfaceC10514HoR.AXc(abstractC6806EaH, f);
                        continue;
                    case 3:
                        if (abstractC6806EaH.A0C() == C79.A0C) {
                            abstractC6806EaH.A0G();
                            float fA092 = 0.0f;
                            float fA093 = 0.0f;
                            float fA094 = 0.0f;
                            float fA095 = 0.0f;
                            while (abstractC6806EaH.A0L()) {
                                int iA0B = abstractC6806EaH.A0B(A00);
                                if (iA0B == 0) {
                                    Integer numA0C = abstractC6806EaH.A0C();
                                    Integer num = C79.A0W;
                                    if (numA0C == num) {
                                        fA094 = (float) abstractC6806EaH.A09();
                                        fA092 = fA094;
                                    } else {
                                        abstractC6806EaH.A0F();
                                        fA092 = (float) abstractC6806EaH.A09();
                                        fA094 = abstractC6806EaH.A0C() == num ? (float) abstractC6806EaH.A09() : fA092;
                                        abstractC6806EaH.A0H();
                                    }
                                } else if (iA0B != 1) {
                                    abstractC6806EaH.A0K();
                                } else {
                                    Integer numA0C2 = abstractC6806EaH.A0C();
                                    Integer num2 = C79.A0W;
                                    if (numA0C2 == num2) {
                                        fA095 = (float) abstractC6806EaH.A09();
                                        fA093 = fA095;
                                    } else {
                                        abstractC6806EaH.A0F();
                                        fA093 = (float) abstractC6806EaH.A09();
                                        fA095 = abstractC6806EaH.A0C() == num2 ? (float) abstractC6806EaH.A09() : fA093;
                                        abstractC6806EaH.A0H();
                                    }
                                }
                            }
                            pointF = new PointF(fA092, fA093);
                            pointF2 = new PointF(fA094, fA095);
                            break;
                        } else {
                            pointFA023 = HwH.A02(abstractC6806EaH, f);
                        }
                    case 4:
                        if (abstractC6806EaH.A0C() == C79.A0C) {
                            abstractC6806EaH.A0G();
                            float f2 = 0.0f;
                            float fA096 = 0.0f;
                            float fA097 = 0.0f;
                            float fA098 = 0.0f;
                            while (abstractC6806EaH.A0L()) {
                                int iA0B2 = abstractC6806EaH.A0B(A00);
                                if (iA0B2 == 0) {
                                    Integer numA0C3 = abstractC6806EaH.A0C();
                                    Integer num3 = C79.A0W;
                                    if (numA0C3 == num3) {
                                        fA097 = (float) abstractC6806EaH.A09();
                                        f2 = fA097;
                                    } else {
                                        abstractC6806EaH.A0F();
                                        fA097 = (float) abstractC6806EaH.A09();
                                        f2 = fA097;
                                        if (abstractC6806EaH.A0C() == num3) {
                                            fA097 = (float) abstractC6806EaH.A09();
                                        }
                                        abstractC6806EaH.A0H();
                                    }
                                } else if (iA0B2 != 1) {
                                    abstractC6806EaH.A0K();
                                } else {
                                    Integer numA0C4 = abstractC6806EaH.A0C();
                                    Integer num4 = C79.A0W;
                                    if (numA0C4 == num4) {
                                        fA098 = (float) abstractC6806EaH.A09();
                                        fA096 = fA098;
                                    } else {
                                        abstractC6806EaH.A0F();
                                        fA096 = (float) abstractC6806EaH.A09();
                                        fA098 = abstractC6806EaH.A0C() == num4 ? (float) abstractC6806EaH.A09() : fA096;
                                        abstractC6806EaH.A0H();
                                    }
                                }
                            }
                            pointF3 = new PointF(f2, fA096);
                            pointF4 = new PointF(fA097, fA098);
                            break;
                        } else {
                            pointFA024 = HwH.A02(abstractC6806EaH, f);
                        }
                    case 5:
                        z3 = false;
                        if (abstractC6806EaH.A0A() == 1) {
                            z3 = true;
                        } else {
                            continue;
                        }
                    case 6:
                        pointFA02 = HwH.A02(abstractC6806EaH, f);
                        continue;
                    case 7:
                        pointFA022 = HwH.A02(abstractC6806EaH, f);
                        continue;
                    default:
                        abstractC6806EaH.A0K();
                        continue;
                }
                abstractC6806EaH.A0I();
            }
            abstractC6806EaH.A0I();
            if (z3) {
                interpolatorA002 = A02;
                objAXc2 = objAXc;
            } else if (pointFA023 != null && pointFA024 != null) {
                interpolatorA002 = A00(pointFA023, pointFA024);
            } else if (pointF == null || pointF2 == null || pointF3 == null || pointF4 == null) {
                interpolatorA002 = A02;
            } else {
                c8725FjQ = new C8725FjQ(A00(pointF, pointF3), A00(pointF2, pointF4), c6837Eap, objAXc, objAXc2, fA09);
            }
            c8725FjQ = new C8725FjQ(interpolatorA002, c6837Eap, (Float) null, objAXc, objAXc2, fA09);
        } else {
            abstractC6806EaH.A0G();
            PointF pointFA025 = null;
            PointF pointFA026 = null;
            Object objAXc3 = null;
            Object objAXc4 = null;
            pointFA02 = null;
            pointFA022 = null;
            boolean z4 = false;
            float fA099 = 0.0f;
            while (abstractC6806EaH.A0L()) {
                switch (abstractC6806EaH.A0B(A01)) {
                    case 0:
                        fA099 = (float) abstractC6806EaH.A09();
                        break;
                    case 1:
                        objAXc4 = interfaceC10514HoR.AXc(abstractC6806EaH, f);
                        break;
                    case 2:
                        objAXc3 = interfaceC10514HoR.AXc(abstractC6806EaH, f);
                        break;
                    case 3:
                        pointFA025 = HwH.A02(abstractC6806EaH, 1.0f);
                        break;
                    case 4:
                        pointFA026 = HwH.A02(abstractC6806EaH, 1.0f);
                        break;
                    case 5:
                        z4 = false;
                        if (abstractC6806EaH.A0A() != 1) {
                            break;
                        } else {
                            z4 = true;
                            break;
                        }
                    case 6:
                        pointFA02 = HwH.A02(abstractC6806EaH, f);
                        break;
                    case 7:
                        pointFA022 = HwH.A02(abstractC6806EaH, f);
                        break;
                    default:
                        abstractC6806EaH.A0K();
                        break;
                }
            }
            abstractC6806EaH.A0I();
            if (z4) {
                interpolatorA00 = A02;
                objAXc3 = objAXc4;
            } else {
                interpolatorA00 = (pointFA025 == null || pointFA026 == null) ? A02 : A00(pointFA025, pointFA026);
            }
            c8725FjQ = new C8725FjQ(interpolatorA00, c6837Eap, (Float) null, objAXc4, objAXc3, fA099);
        }
        c8725FjQ.A04 = pointFA02;
        c8725FjQ.A05 = pointFA022;
        return c8725FjQ;
    }
}
