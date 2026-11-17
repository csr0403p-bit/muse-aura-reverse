package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.FlJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8805FlJ {
    public static final void A00(InterfaceC1068ATy interfaceC1068ATy, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d;
        double d11 = d2;
        double d12 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d * dCos) + (d2 * dSin)) / d5;
        double d14 = (((-d10) * dSin) + (d2 * dCos)) / d6;
        double d15 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d16 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d17 * d17) + (d18 * d18);
        if (d21 != 0.0d) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                A00(interfaceC1068ATy, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
                return;
            }
            double dSqrt2 = Math.sqrt(d22);
            double d23 = d17 * dSqrt2;
            double d24 = dSqrt2 * d18;
            if (z == z2) {
                d8 = d19 - d24;
                d9 = d20 + d23;
            } else {
                d8 = d19 + d24;
                d9 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d14 - d9, d13 - d8);
            double dAtan22 = Math.atan2(d16 - d9, d15 - d8) - dAtan2;
            if (z2 != C8j3.A1Q((dAtan22 > 0.0d ? 1 : (dAtan22 == 0.0d ? 0 : -1)))) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d8 * d5;
            double d26 = d9 * d6;
            double d27 = (d25 * dCos) - (d26 * dSin);
            double d28 = (d25 * dSin) + (d26 * dCos);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(dAtan2);
            double dSin2 = Math.sin(dAtan2);
            double d29 = -d5;
            double d30 = d29 * dCos;
            double d31 = d6 * dSin;
            double d32 = (d30 * dSin2) - (d31 * dCos2);
            double d33 = d29 * dSin;
            double d34 = d6 * dCos;
            double d35 = (dSin2 * d33) + (dCos2 * d34);
            double d36 = dAtan22 / iCeil;
            double d37 = dAtan2;
            int i = 0;
            while (i < iCeil) {
                dAtan2 += d36;
                double dSin3 = Math.sin(dAtan2);
                double dCos3 = Math.cos(dAtan2);
                double d38 = (d27 + ((d5 * dCos) * dCos3)) - (d31 * dSin3);
                double d39 = d28 + (d5 * dSin * dCos3) + (d34 * dSin3);
                double d40 = (d30 * dSin3) - (d31 * dCos3);
                double d41 = (dSin3 * d33) + (dCos3 * d34);
                double d42 = dAtan2 - d37;
                double dTan = Math.tan(d42 / 2.0d);
                double dSin4 = (Math.sin(d42) * (Math.sqrt(4.0d + ((3.0d * dTan) * dTan)) - 1.0d)) / 3.0d;
                ((C1710Aot) interfaceC1068ATy).A03.cubicTo((float) (d10 + (d32 * dSin4)), (float) (d11 + (d35 * dSin4)), (float) (d38 - (dSin4 * d40)), (float) (d39 - (dSin4 * d41)), (float) d38, (float) d39);
                i++;
                d10 = d38;
                d11 = d39;
                d37 = dAtan2;
                d35 = d41;
                d32 = d40;
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<+LX/Fld;>;LX/ATy;)LX/ATy; */
    public static final void A01(InterfaceC1068ATy interfaceC1068ATy, List list) {
        double d;
        double d2;
        double d3;
        boolean z;
        boolean z2;
        double d4;
        double d5;
        double d6;
        double d7;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        boolean zA1Z = AnonymousClass002.A1Z(path.getFillType(), Path.FillType.EVEN_ODD);
        path.rewind();
        path.setFillType(zA1Z ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
        AbstractC8825Fld abstractC8825Fld = (AbstractC8825Fld) (list.isEmpty() ? C8824Flc.A00 : list.get(0));
        int size = list.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i < size) {
            AbstractC8825Fld abstractC8825Fld2 = (AbstractC8825Fld) list.get(i);
            if (abstractC8825Fld2 instanceof C8824Flc) {
                path.close();
                f10 = f14;
                f12 = f10;
                f11 = f15;
            } else {
                if (abstractC8825Fld2 instanceof C8818FlW) {
                    C8818FlW c8818FlW = (C8818FlW) abstractC8825Fld2;
                    float f16 = c8818FlW.A00;
                    f12 += f16;
                    float f17 = c8818FlW.A01;
                    f13 += f17;
                    path.rMoveTo(f16, f17);
                } else if (abstractC8825Fld2 instanceof C8815FlT) {
                    C8815FlT c8815FlT = (C8815FlT) abstractC8825Fld2;
                    f12 = c8815FlT.A00;
                    f13 = c8815FlT.A01;
                    path.moveTo(f12, f13);
                } else {
                    if (abstractC8825Fld2 instanceof C8817FlV) {
                        C8817FlV c8817FlV = (C8817FlV) abstractC8825Fld2;
                        f6 = c8817FlV.A00;
                        f7 = c8817FlV.A01;
                        path.rLineTo(f6, f7);
                    } else {
                        if (abstractC8825Fld2 instanceof C8814FlS) {
                            C8814FlS c8814FlS = (C8814FlS) abstractC8825Fld2;
                            f12 = c8814FlS.A00;
                            f13 = c8814FlS.A01;
                        } else {
                            if (abstractC8825Fld2 instanceof C8821FlZ) {
                                float f18 = ((C8821FlZ) abstractC8825Fld2).A00;
                                path.rLineTo(f18, 0.0f);
                                f12 += f18;
                            } else if (abstractC8825Fld2 instanceof C8820FlY) {
                                f12 = ((C8820FlY) abstractC8825Fld2).A00;
                            } else if (abstractC8825Fld2 instanceof C8822Fla) {
                                f7 = ((C8822Fla) abstractC8825Fld2).A00;
                                path.rLineTo(0.0f, f7);
                                f13 += f7;
                            } else {
                                if (abstractC8825Fld2 instanceof C8823Flb) {
                                    f = ((C8823Flb) abstractC8825Fld2).A00;
                                    path.lineTo(f12, f);
                                } else {
                                    if (abstractC8825Fld2 instanceof C8811FlP) {
                                        C8811FlP c8811FlP = (C8811FlP) abstractC8825Fld2;
                                        float f19 = c8811FlP.A00;
                                        float f20 = c8811FlP.A03;
                                        f2 = c8811FlP.A01;
                                        f3 = c8811FlP.A04;
                                        f4 = c8811FlP.A02;
                                        f5 = c8811FlP.A05;
                                        path.rCubicTo(f19, f20, f2, f3, f4, f5);
                                    } else if (abstractC8825Fld2 instanceof C8808FlM) {
                                        C8808FlM c8808FlM = (C8808FlM) abstractC8825Fld2;
                                        float f21 = c8808FlM.A00;
                                        float f22 = c8808FlM.A03;
                                        f10 = c8808FlM.A01;
                                        f11 = c8808FlM.A04;
                                        f12 = c8808FlM.A02;
                                        f13 = c8808FlM.A05;
                                        path.cubicTo(f21, f22, f10, f11, f12, f13);
                                    } else if (abstractC8825Fld2 instanceof C8813FlR) {
                                        if (abstractC8825Fld.A00) {
                                            f8 = f12 - f10;
                                            f9 = f13 - f11;
                                        } else {
                                            f8 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        C8813FlR c8813FlR = (C8813FlR) abstractC8825Fld2;
                                        f2 = c8813FlR.A00;
                                        f3 = c8813FlR.A02;
                                        f4 = c8813FlR.A01;
                                        f5 = c8813FlR.A03;
                                        path.rCubicTo(f8, f9, f2, f3, f4, f5);
                                    } else if (abstractC8825Fld2 instanceof C8810FlO) {
                                        if (abstractC8825Fld.A00) {
                                            f12 = (f12 * 2.0f) - f10;
                                            f13 = (2.0f * f13) - f11;
                                        }
                                        C8810FlO c8810FlO = (C8810FlO) abstractC8825Fld2;
                                        f10 = c8810FlO.A00;
                                        f11 = c8810FlO.A02;
                                        float f23 = c8810FlO.A01;
                                        float f24 = c8810FlO.A03;
                                        path.cubicTo(f12, f13, f10, f11, f23, f24);
                                        f12 = f23;
                                        f13 = f24;
                                    } else if (abstractC8825Fld2 instanceof C8812FlQ) {
                                        C8812FlQ c8812FlQ = (C8812FlQ) abstractC8825Fld2;
                                        float f25 = c8812FlQ.A00;
                                        float f26 = c8812FlQ.A02;
                                        f6 = c8812FlQ.A01;
                                        f7 = c8812FlQ.A03;
                                        path.rQuadTo(f25, f26, f6, f7);
                                        f10 = f25 + f12;
                                        f11 = f26 + f13;
                                    } else if (abstractC8825Fld2 instanceof C8809FlN) {
                                        C8809FlN c8809FlN = (C8809FlN) abstractC8825Fld2;
                                        f10 = c8809FlN.A00;
                                        f11 = c8809FlN.A02;
                                        f12 = c8809FlN.A01;
                                        f13 = c8809FlN.A03;
                                        path.quadTo(f10, f11, f12, f13);
                                    } else if (abstractC8825Fld2 instanceof C8819FlX) {
                                        if (abstractC8825Fld.A01) {
                                            f2 = f12 - f10;
                                            f3 = f13 - f11;
                                        } else {
                                            f2 = 0.0f;
                                            f3 = 0.0f;
                                        }
                                        C8819FlX c8819FlX = (C8819FlX) abstractC8825Fld2;
                                        f4 = c8819FlX.A00;
                                        f5 = c8819FlX.A01;
                                        path.rQuadTo(f2, f3, f4, f5);
                                    } else if (abstractC8825Fld2 instanceof C8816FlU) {
                                        if (abstractC8825Fld.A01) {
                                            f12 = (f12 * 2.0f) - f10;
                                            f13 = (2.0f * f13) - f11;
                                        }
                                        C8816FlU c8816FlU = (C8816FlU) abstractC8825Fld2;
                                        float f27 = c8816FlU.A00;
                                        f = c8816FlU.A01;
                                        f10 = f12;
                                        path.quadTo(f12, f13, f27, f);
                                        f12 = f27;
                                        f11 = f13;
                                    } else {
                                        if (abstractC8825Fld2 instanceof C8807FlL) {
                                            C8807FlL c8807FlL = (C8807FlL) abstractC8825Fld2;
                                            f10 = c8807FlL.A00 + f12;
                                            f11 = c8807FlL.A01 + f13;
                                            double d8 = f13;
                                            double d9 = c8807FlL.A02;
                                            d = d9;
                                            d2 = c8807FlL.A04;
                                            d3 = c8807FlL.A03;
                                            z = c8807FlL.A05;
                                            z2 = c8807FlL.A06;
                                            d4 = f12;
                                            d5 = d8;
                                            d6 = f10;
                                            d7 = f11;
                                        } else {
                                            if (!(abstractC8825Fld2 instanceof C8806FlK)) {
                                                throw C3cG.A0q();
                                            }
                                            double d10 = f13;
                                            C8806FlK c8806FlK = (C8806FlK) abstractC8825Fld2;
                                            f10 = c8806FlK.A00;
                                            f11 = c8806FlK.A01;
                                            double d11 = c8806FlK.A02;
                                            d = d11;
                                            d2 = c8806FlK.A04;
                                            d3 = c8806FlK.A03;
                                            z = c8806FlK.A05;
                                            z2 = c8806FlK.A06;
                                            d4 = f12;
                                            d5 = d10;
                                            d6 = f10;
                                            d7 = f11;
                                        }
                                        A00(interfaceC1068ATy, d4, d5, d6, d7, d, d2, d3, z, z2);
                                        f12 = f10;
                                    }
                                    f10 = f2 + f12;
                                    f11 = f3 + f13;
                                    f12 += f4;
                                    f13 += f5;
                                }
                                f13 = f;
                            }
                            i++;
                            abstractC8825Fld = abstractC8825Fld2;
                        }
                        path.lineTo(f12, f13);
                        i++;
                        abstractC8825Fld = abstractC8825Fld2;
                    }
                    f12 += f6;
                    f13 += f7;
                    i++;
                    abstractC8825Fld = abstractC8825Fld2;
                }
                f14 = f12;
                f15 = f13;
                i++;
                abstractC8825Fld = abstractC8825Fld2;
            }
            f13 = f11;
            i++;
            abstractC8825Fld = abstractC8825Fld2;
        }
    }
}
