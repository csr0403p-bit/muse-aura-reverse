package X;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AiI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1388AiI implements InterfaceC1402AiX {
    public int A00;
    public AbstractC1555AlK A03;
    public GraphicsLayer A04;
    public Function0<Unit> A05;
    public G0V<? super InterfaceC1327AhE, ? super GraphicsLayer, Unit> A06;
    public boolean A07;
    public boolean A08;
    public boolean A0A;
    public boolean A0B;
    public float[] A0C;
    public boolean A0F;
    public final ASQ A0G;
    public final AndroidComposeView A0I;
    public long A01 = 2147483647L | (2147483647L << 32);
    public final float[] A0J = C1392AiN.A06();
    public AXN A0D = new ATH(1.0f, 1.0f);
    public EnumC1820Arj A0E = EnumC1820Arj.A02;
    public final C1325AhC A0H = new C1325AhC();
    public long A02 = C15k.A01;
    public boolean A09 = true;
    public final G0U<AT3, Unit> A0K = new BUX(this, 49);

    public static final void A00(C1388AiI c1388AiI) {
        if (c1388AiI.A0B) {
            GraphicsLayer graphicsLayer = c1388AiI.A04;
            long jA01 = graphicsLayer.A02;
            if ((jA01 & 9223372034707292159L) == 9205357640488583168L) {
                jA01 = C1Wv.A01(AQY.A01(c1388AiI.A01));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA01 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA01 & 4294967295L));
            float[] fArr = c1388AiI.A0J;
            C1391AiM c1391AiM = (C1391AiM) graphicsLayer.A0M;
            float f = c1391AiM.A07;
            float f2 = c1391AiM.A08;
            float f3 = c1391AiM.A02;
            float f4 = c1391AiM.A03;
            float f5 = c1391AiM.A04;
            float f6 = c1391AiM.A05;
            double d = f3 * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f7 = -fSin;
            float f8 = (f2 * fCos) - (0.0f * fSin);
            float f9 = (f2 * fSin) + (0.0f * fCos);
            double d2 = 0.0d * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f10 = -fSin2;
            float f11 = fSin * fSin2;
            float f12 = fSin * fCos2;
            float f13 = fCos * fSin2;
            float f14 = fCos * fCos2;
            float f15 = (f * fCos2) + (f9 * fSin2);
            float f16 = ((-f) * fSin2) + (f9 * fCos2);
            double d3 = f4 * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f17 = -fSin3;
            float f18 = (f17 * fCos2) + (fCos3 * f11);
            float f19 = (fCos2 * fCos3) + (f11 * fSin3);
            float f20 = fSin3 * fCos;
            float f21 = fCos * fCos3;
            float f22 = (f17 * f10) + (fCos3 * f12);
            float f23 = f19 * f5;
            float f24 = f20 * f5;
            float f25 = ((fCos3 * f10) + (fSin3 * f12)) * f5;
            float f26 = f18 * f6;
            float f27 = f21 * f6;
            float f28 = f22 * f6;
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f25;
            fArr[3] = 0.0f;
            fArr[4] = f26;
            fArr[5] = f27;
            fArr[6] = f28;
            fArr[7] = 0.0f;
            fArr[8] = f13 * 1.0f;
            fArr[9] = f7 * 1.0f;
            fArr[10] = f14 * 1.0f;
            fArr[11] = 0.0f;
            float f29 = -fIntBitsToFloat;
            fArr[12] = ((f23 * f29) - (f26 * fIntBitsToFloat2)) + f15 + fIntBitsToFloat;
            fArr[13] = ((f24 * f29) - (f27 * fIntBitsToFloat2)) + f8 + fIntBitsToFloat2;
            fArr[14] = ((f29 * f25) - (fIntBitsToFloat2 * f28)) + f16;
            fArr[15] = 1.0f;
            c1388AiI.A0B = false;
            c1388AiI.A09 = AbstractC1409Aie.A00(fArr);
        }
    }

    public static final void A01(C1388AiI c1388AiI, boolean z) {
        C0912AHo<InterfaceC1402AiX> c0912AHo;
        if (z != c1388AiI.A0F) {
            c1388AiI.A0F = z;
            AndroidComposeView androidComposeView = c1388AiI.A0I;
            boolean z2 = androidComposeView.A0D;
            if (z) {
                if (z2) {
                    c0912AHo = androidComposeView.A04;
                    if (c0912AHo == null) {
                        c0912AHo = new C0912AHo<>(16);
                        androidComposeView.A04 = c0912AHo;
                    }
                } else {
                    c0912AHo = androidComposeView.A0a;
                }
                c0912AHo.A09(c1388AiI);
                return;
            }
            if (z2) {
                return;
            }
            androidComposeView.A0a.A0A(c1388AiI);
            C0912AHo<InterfaceC1402AiX> c0912AHo2 = androidComposeView.A04;
            if (c0912AHo2 != null) {
                c0912AHo2.A0A(c1388AiI);
            }
        }
    }

    public static final float[] A02(C1388AiI c1388AiI) {
        float[] fArrA06 = c1388AiI.A0C;
        if (fArrA06 == null) {
            fArrA06 = C1392AiN.A06();
            c1388AiI.A0C = fArrA06;
        }
        if (c1388AiI.A0A) {
            c1388AiI.A0A = false;
            A00(c1388AiI);
            float[] fArr = c1388AiI.A0J;
            if (c1388AiI.A09) {
                return fArr;
            }
            if (!AbstractC1412Aih.A01(fArr, fArrA06)) {
                fArrA06[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA06[0])) {
            return null;
        }
        return fArrA06;
    }

    @Override // X.InterfaceC1402AiX
    public final void AQu(long j) {
        AndroidComposeView androidComposeView = this.A0I;
        if (AndroidComposeView.A0H()) {
            androidComposeView.AiM(-4.0f);
        }
        GraphicsLayer graphicsLayer = this.A04;
        if (graphicsLayer.A06 != j) {
            graphicsLayer.A06 = j;
            GraphicsLayer.A06(graphicsLayer, j, graphicsLayer.A05);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    @Override // X.InterfaceC1402AiX
    public final void AbU(long j) {
        if (j != this.A01) {
            AndroidComposeView androidComposeView = this.A0I;
            if (AndroidComposeView.A0H()) {
                androidComposeView.AiM(-4.0f);
            }
            this.A01 = j;
            invalidate();
        }
    }

    @Override // X.InterfaceC1402AiX
    public final void Ahs() {
        if (this.A0F) {
            long j = this.A02;
            if (j != C15k.A01) {
                GraphicsLayer graphicsLayer = this.A04;
                if (graphicsLayer.A05 != this.A01) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * ((int) (r2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * ((int) (r2 & 4294967295L));
                    graphicsLayer.A0A((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                }
            }
            this.A04.A0C(this.A0D, this.A0E, this.A0K, this.A01);
            A01(this, false);
        }
    }

    @Override // X.InterfaceC1402AiX
    public final void Ahw(C1390AiL c1390AiL) {
        InterfaceC1068ATy interfaceC1068ATy;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        float fIntBitsToFloat;
        Function0<Unit> function0;
        int i;
        long jFloatToRawIntBits3;
        Function0<Unit> function02;
        int i2 = c1390AiL.A0B | this.A00;
        this.A0E = c1390AiL.A0K;
        this.A0D = c1390AiL.A0J;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.A02 = c1390AiL.A0F;
        }
        if ((i2 & 1) != 0) {
            GraphicsLayer graphicsLayer = this.A04;
            float f = c1390AiL.A04;
            C1391AiM c1391AiM = (C1391AiM) graphicsLayer.A0M;
            if (c1391AiM.A04 != f) {
                c1391AiM.A04 = f;
                c1391AiM.A0L.setScaleX(f);
            }
        }
        if ((i2 & 2) != 0) {
            GraphicsLayer graphicsLayer2 = this.A04;
            float f2 = c1390AiL.A05;
            C1391AiM c1391AiM2 = (C1391AiM) graphicsLayer2.A0M;
            if (c1391AiM2.A05 != f2) {
                c1391AiM2.A05 = f2;
                c1391AiM2.A0L.setScaleY(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.A04.A09(c1390AiL.A00);
        }
        if ((i2 & 8) != 0) {
            GraphicsLayer graphicsLayer3 = this.A04;
            float f3 = c1390AiL.A07;
            C1391AiM c1391AiM3 = (C1391AiM) graphicsLayer3.A0M;
            if (c1391AiM3.A07 != f3) {
                c1391AiM3.A07 = f3;
                c1391AiM3.A0L.setTranslationX(f3);
            }
        }
        if ((i2 & 16) != 0) {
            GraphicsLayer graphicsLayer4 = this.A04;
            float f4 = c1390AiL.A08;
            C1391AiM c1391AiM4 = (C1391AiM) graphicsLayer4.A0M;
            if (c1391AiM4.A08 != f4) {
                c1391AiM4.A08 = f4;
                c1391AiM4.A0L.setTranslationY(f4);
            }
        }
        if ((i2 & 32) != 0) {
            GraphicsLayer graphicsLayer5 = this.A04;
            float f5 = c1390AiL.A06;
            C1391AiM c1391AiM5 = (C1391AiM) graphicsLayer5.A0M;
            if (c1391AiM5.A06 != f5) {
                c1391AiM5.A06 = f5;
                c1391AiM5.A0L.setElevation(f5);
                graphicsLayer5.A0D = true;
                GraphicsLayer.A03(graphicsLayer5);
            }
            if (c1390AiL.A06 > 0.0f && !this.A07 && (function02 = this.A05) != null) {
                function02.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            GraphicsLayer graphicsLayer6 = this.A04;
            long j = c1390AiL.A0C;
            C1391AiM c1391AiM6 = (C1391AiM) graphicsLayer6.A0M;
            long j2 = c1391AiM6.A0B;
            long j3 = B6A.A01;
            if (j != j2) {
                c1391AiM6.A0B = j;
                c1391AiM6.A0L.setAmbientShadowColor(HxS.A01(j));
            }
        }
        if ((i2 & 128) != 0) {
            GraphicsLayer graphicsLayer7 = this.A04;
            long j4 = c1390AiL.A0E;
            C1391AiM c1391AiM7 = (C1391AiM) graphicsLayer7.A0M;
            long j5 = c1391AiM7.A0D;
            long j6 = B6A.A01;
            if (j4 != j5) {
                c1391AiM7.A0D = j4;
                c1391AiM7.A0L.setSpotShadowColor(HxS.A01(j4));
            }
        }
        if ((i2 & 1024) != 0) {
            GraphicsLayer graphicsLayer8 = this.A04;
            float f6 = c1390AiL.A03;
            C1391AiM c1391AiM8 = (C1391AiM) graphicsLayer8.A0M;
            if (c1391AiM8.A03 != f6) {
                c1391AiM8.A03 = f6;
                c1391AiM8.A0L.setRotationZ(f6);
            }
        }
        if ((i2 & 256) != 0) {
            GraphicsLayer graphicsLayer9 = this.A04;
            float f7 = c1390AiL.A02;
            C1391AiM c1391AiM9 = (C1391AiM) graphicsLayer9.A0M;
            if (c1391AiM9.A02 != f7) {
                c1391AiM9.A02 = f7;
                c1391AiM9.A0L.setRotationX(f7);
            }
        }
        if ((i2 & 2048) != 0) {
            GraphicsLayer graphicsLayer10 = this.A04;
            float f8 = c1390AiL.A01;
            C1391AiM c1391AiM10 = (C1391AiM) graphicsLayer10.A0M;
            if (c1391AiM10.A01 != f8) {
                c1391AiM10.A01 = f8;
                c1391AiM10.A0L.setCameraDistance(f8);
            }
        }
        if (i3 != 0) {
            long j7 = this.A02;
            boolean z = j7 == C15k.A01;
            GraphicsLayer graphicsLayer11 = this.A04;
            if (z) {
                jFloatToRawIntBits3 = 9205357640488583168L;
            } else {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                long j8 = this.A01;
                jFloatToRawIntBits3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * ((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2 * ((int) (j8 >> 32))) << 32);
            }
            graphicsLayer11.A0A(jFloatToRawIntBits3);
        }
        if ((i2 & 16384) != 0) {
            GraphicsLayer graphicsLayer12 = this.A04;
            boolean z2 = c1390AiL.A0L;
            if (graphicsLayer12.A0B != z2) {
                graphicsLayer12.A0B = z2;
                graphicsLayer12.A0D = true;
                GraphicsLayer.A03(graphicsLayer12);
            }
        }
        if ((131072 & i2) != 0) {
            GraphicsLayer graphicsLayer13 = this.A04;
            AbstractC1408Aid abstractC1408Aid = c1390AiL.A0H;
            InterfaceC1410Aif interfaceC1410Aif = graphicsLayer13.A0M;
            if (!C7384Etj.areEqual(((C1391AiM) interfaceC1410Aif).A0G, abstractC1408Aid)) {
                interfaceC1410Aif.AeM(abstractC1408Aid);
            }
        }
        if ((524288 & i2) != 0) {
            GraphicsLayer graphicsLayer14 = this.A04;
            int i4 = c1390AiL.A09;
            C1391AiM c1391AiM11 = (C1391AiM) graphicsLayer14.A0M;
            if (c1391AiM11.A09 != i4) {
                c1391AiM11.A09 = i4;
                Paint paint = c1391AiM11.A0F;
                if (paint == null) {
                    paint = new Paint();
                    c1391AiM11.A0F = paint;
                }
                paint.setBlendMode(AbstractC8721FjM.A00(i4));
                C1391AiM.A01(c1391AiM11);
            }
        }
        if ((32768 & i2) != 0) {
            GraphicsLayer graphicsLayer15 = this.A04;
            int i5 = c1390AiL.A0A;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                i = 2;
            }
            C1391AiM c1391AiM12 = (C1391AiM) graphicsLayer15.A0M;
            if (c1391AiM12.A0A != i) {
                c1391AiM12.A0A = i;
                C1391AiM.A01(c1391AiM12);
            }
        }
        boolean z3 = true;
        if ((i2 & 7963) != 0) {
            this.A0B = true;
            this.A0A = true;
        }
        if (C7384Etj.areEqual(this.A03, c1390AiL.A0G)) {
            z3 = false;
        } else {
            AbstractC1555AlK abstractC1555AlK = c1390AiL.A0G;
            this.A03 = abstractC1555AlK;
            if (abstractC1555AlK != null) {
                GraphicsLayer graphicsLayer16 = this.A04;
                if (abstractC1555AlK instanceof C1097AYh) {
                    AaC aaC = ((C1097AYh) abstractC1555AlK).A00;
                    float f9 = aaC.A01;
                    float f10 = aaC.A03;
                    jFloatToRawIntBits = (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                    jFloatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(aaC.A00 - f10)) | (Float.floatToRawIntBits(aaC.A02 - f9) << 32);
                    fIntBitsToFloat = 0.0f;
                } else {
                    if (abstractC1555AlK instanceof C1069ATz) {
                        interfaceC1068ATy = ((C1069ATz) abstractC1555AlK).A00;
                    } else {
                        if (!(abstractC1555AlK instanceof AW6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AW6 aw6 = (AW6) abstractC1555AlK;
                        interfaceC1068ATy = aw6.A01;
                        if (interfaceC1068ATy == null) {
                            AW7 aw7 = aw6.A00;
                            float f11 = aw7.A01;
                            float f12 = aw7.A03;
                            jFloatToRawIntBits = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                            jFloatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(aw7.A00 - f12)) | (Float.floatToRawIntBits(aw7.A02 - f11) << 32);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (aw7.A04 >> 32));
                        }
                    }
                    GraphicsLayer.A05(graphicsLayer16);
                    graphicsLayer16.A0A = interfaceC1068ATy;
                    GraphicsLayer.A03(graphicsLayer16);
                    if (Build.VERSION.SDK_INT < 33 && (((abstractC1555AlK instanceof C1069ATz) || ((abstractC1555AlK instanceof AW6) && !AW2.A01(((AW6) abstractC1555AlK).A00))) && (function0 = this.A05) != null)) {
                        function0.invoke();
                    }
                }
                if (graphicsLayer16.A04 != jFloatToRawIntBits || graphicsLayer16.A03 != jFloatToRawIntBits2 || graphicsLayer16.A00 != fIntBitsToFloat || graphicsLayer16.A0A != null) {
                    GraphicsLayer.A05(graphicsLayer16);
                    graphicsLayer16.A04 = jFloatToRawIntBits;
                    graphicsLayer16.A03 = jFloatToRawIntBits2;
                    graphicsLayer16.A00 = fIntBitsToFloat;
                    GraphicsLayer.A03(graphicsLayer16);
                }
                if (Build.VERSION.SDK_INT < 33) {
                    function0.invoke();
                }
            }
        }
        this.A00 = c1390AiL.A0B;
        if (i2 != 0 || z3) {
            AndroidComposeView androidComposeView = this.A0I;
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            if (AndroidComposeView.A0H()) {
                androidComposeView.AiM(0.0f);
            }
        }
    }

    @Override // X.InterfaceC1402AiX
    public final void invalidate() {
        if (this.A0F || this.A08) {
            return;
        }
        this.A0I.invalidate();
        A01(this, true);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/graphics/layer/GraphicsLayer;LX/ASQ;Landroidx/compose/ui/platform/AndroidComposeView;LX/G0V<-LX/AhE;-Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public C1388AiI(ASQ asq, GraphicsLayer graphicsLayer, AndroidComposeView androidComposeView, Function0 function0, G0V g0v) {
        this.A04 = graphicsLayer;
        this.A0G = asq;
        this.A0I = androidComposeView;
        this.A06 = g0v;
        this.A05 = function0;
    }
}
