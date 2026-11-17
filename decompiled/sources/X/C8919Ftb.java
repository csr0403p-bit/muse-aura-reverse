package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.compose.runtime.MutableState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Ftb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8919Ftb implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public final Object A00;

    public static int A00(float f, float f2, int i, int i2) {
        return Ab3.A01(f2 + ((i - i2) * f));
    }

    public C8919Ftb(FW1 fw1, int i) {
        this.$t = i;
        this.A00 = fw1;
    }

    public static void A01(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C8919Ftb(obj, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        FMZ fmz;
        switch (this.$t) {
            case 0:
                view = (View) this.A00;
                float fA03 = AbstractC7609F5w.A03(valueAnimator);
                StringBuilder sbA0g = C3cG.A0g("animateToFullOpacity: value = ");
                sbA0g.append(fA03);
                AbstractC2875Bni.A01("ScreenFlashView", sbA0g.toString());
                view.setAlpha(AbstractC7609F5w.A03(valueAnimator));
                return;
            case 1:
                C8659FiK c8659FiK = (C8659FiK) this.A00;
                C8670FiW c8670FiW = c8659FiK.A0G;
                if (c8670FiW != null) {
                    c8670FiW.A06(c8659FiK.A0R.A01());
                    return;
                }
                return;
            case 2:
                C7384Etj.A0Y(valueAnimator, 0);
                int iA03 = (int) (AbstractC7610F5x.A03(valueAnimator) * 255.0f);
                C8372Fcm c8372Fcm = (C8372Fcm) this.A00;
                c8372Fcm.A01.setAlpha(iA03);
                c8372Fcm.A06.A00.setAlpha(iA03);
                c8372Fcm.A05.A00.setAlpha(iA03);
                c8372Fcm.A03.A00.setAlpha(iA03);
                c8372Fcm.A04.A00.setAlpha(iA03);
                c8372Fcm.A02.setAlpha(iA03);
                fmz = c8372Fcm;
                fmz.invalidateSelf();
                return;
            case 3:
                FT5 ft5 = (FT5) this.A00;
                ft5.A01 = super/*android.animation.ValueAnimator*/.getCurrentPlayTime();
                return;
            case 4:
                FE3 fe3 = (FE3) this.A00;
                float animatedFraction = fe3.getAnimatedFraction();
                int iIntValue = fe3.A04.intValue();
                if (iIntValue == 0) {
                    FGV fgv = fe3.A01;
                    int[] location = fgv.getLocation();
                    int i = location[0];
                    int i2 = location[1];
                    FGV fgv2 = fe3.A00;
                    int[] location2 = fgv2.getLocation();
                    int i3 = location2[0];
                    int i4 = location2[1];
                    int width = fgv.getWidth();
                    int height = fgv.getHeight();
                    int width2 = fgv2.getWidth();
                    int height2 = fgv2.getHeight();
                    if (width != 0 && height != 0 && width2 != 0 && height2 != 0) {
                        float f = width2;
                        float f2 = width;
                        float f3 = height2;
                        float f4 = height;
                        float f5 = (((f / f2) - 1.0f) * animatedFraction) + 1.0f;
                        float f6 = (((f3 / f4) - 1.0f) * animatedFraction) + 1.0f;
                        float fA02 = C8j3.A02(1.0f, f2 / f, animatedFraction);
                        float fA022 = C8j3.A02(1.0f, f4 / f3, animatedFraction);
                        float f7 = i;
                        float f8 = (i3 - i) * animatedFraction;
                        int iA01 = Ab3.A01((f7 - ((f2 - (f2 * f5)) / 2.0f)) + f8);
                        int iA012 = Ab3.A01((f7 - ((f - (f * fA02)) / 2.0f)) + f8);
                        float f9 = i2;
                        float f10 = f9 - ((f4 - (f4 * f6)) / 2.0f);
                        float f11 = (i4 - i2) * animatedFraction;
                        int iA013 = Ab3.A01(f10 + f11);
                        int iA014 = Ab3.A01((f9 - ((f3 - (f3 * fA022)) / 2.0f)) + f11);
                        FDW fdw = fe3.A03;
                        FDW fdwA00 = fdw != null ? FE3.A00(fe3, fdw, f5, f6) : null;
                        FDW fdw2 = fe3.A02;
                        FDW fdwA002 = fdw2 != null ? FE3.A00(fe3, fdw2, fA02, fA022) : null;
                        fgv.A02(fdwA00, f5, f6, iA01, iA013, width, height);
                        fgv2.A02(fdwA002, fA02, fA022, iA012, iA014, width2, height2);
                        return;
                    }
                } else if (iIntValue == 1) {
                    FGV fgv3 = fe3.A01;
                    int[] location3 = fgv3.getLocation();
                    int i5 = location3[0];
                    int i6 = location3[1];
                    FGV fgv4 = fe3.A00;
                    int[] location4 = fgv4.getLocation();
                    int i7 = location4[0];
                    int i8 = location4[1];
                    int width3 = fgv3.getWidth();
                    int height3 = fgv3.getHeight();
                    int width4 = fgv4.getWidth();
                    int height4 = fgv4.getHeight();
                    if (width3 != 0 && height3 != 0 && width4 != 0 && height4 != 0) {
                        float f12 = width3;
                        float f13 = width4;
                        float f14 = height3;
                        float f15 = height4;
                        float fMin = Math.min(f12 / f13, f14 / f15);
                        float f16 = f12 / fMin;
                        float f17 = f14 / fMin;
                        float f18 = fMin + ((1.0f - fMin) * animatedFraction);
                        int iA00 = A00(animatedFraction, i5 - ((f16 - (f16 * f18)) / 2.0f), i7, i5);
                        int iA002 = A00(animatedFraction, i6 - ((f17 - (f17 * f18)) / 2.0f), i8, i6);
                        int iA015 = Ab3.A01(f16 + ((f13 - f16) * animatedFraction));
                        int iA016 = Ab3.A01(f17 + (animatedFraction * (f15 - f17)));
                        FDW fdw3 = fe3.A03;
                        FDW fdwA003 = fdw3 != null ? FE3.A00(fe3, fdw3, f18, f18) : null;
                        FDW fdw4 = fe3.A02;
                        FDW fdwA004 = fdw4 != null ? FE3.A00(fe3, fdw4, f18, f18) : null;
                        fgv3.A02(fdwA003, f18, f18, iA00, iA002, iA015, iA016);
                        fgv4.A02(fdwA004, f18, f18, iA00, iA002, iA015, iA016);
                        return;
                    }
                } else {
                    if (iIntValue != 2) {
                        throw C3cG.A0q();
                    }
                    FGV fgv5 = fe3.A01;
                    int[] location5 = fgv5.getLocation();
                    int i9 = location5[0];
                    int i10 = location5[1];
                    FGV fgv6 = fe3.A00;
                    int[] location6 = fgv6.getLocation();
                    int i11 = location6[0];
                    int i12 = location6[1];
                    int width5 = fgv5.getWidth();
                    int height5 = fgv5.getHeight();
                    int width6 = fgv6.getWidth();
                    int height6 = fgv6.getHeight();
                    if (width5 != 0 && height5 != 0 && width6 != 0 && height6 != 0) {
                        int iA003 = A00(animatedFraction, i9, i11, i9);
                        int iA004 = A00(animatedFraction, i10, i12, i10);
                        int iA005 = A00(animatedFraction, width5, width6, width5);
                        int iA006 = A00(animatedFraction, height5, height6, height5);
                        FDW fdw5 = fe3.A03;
                        FDW fdwA005 = fdw5 != null ? FE3.A00(fe3, fdw5, 1.0f, 1.0f) : null;
                        FDW fdw6 = fe3.A02;
                        FDW fdwA006 = fdw6 != null ? FE3.A00(fe3, fdw6, 1.0f, 1.0f) : null;
                        fgv5.A02(fdwA005, 1.0f, 1.0f, iA003, iA004, iA005, iA006);
                        fgv6.A02(fdwA006, 1.0f, 1.0f, iA003, iA004, iA005, iA006);
                        return;
                    }
                }
                FFI.A01(null, "Source or destination container has zero size. Skipping animation frame.", null);
                return;
            case 5:
                FRH frh = (FRH) this.A00;
                float f19 = frh.A02;
                frh.A00 = f19 + ((frh.A04 - f19) * valueAnimator.getAnimatedFraction());
                float f20 = frh.A03;
                float animatedFraction2 = f20 + ((frh.A05 - f20) * valueAnimator.getAnimatedFraction());
                frh.A01 = animatedFraction2;
                frh.A08.show(frh.A00, animatedFraction2);
                return;
            case 6:
                float fA032 = AbstractC7609F5w.A03(valueAnimator);
                FX9 fx9 = ((BottomSheetBehavior) this.A00).A0K;
                if (fx9 != 0) {
                    FXA fxa = fx9.A00;
                    if (fxa.A01 != fA032) {
                        fxa.A01 = fA032;
                        fx9.A02 = true;
                        fmz = fx9;
                        fmz.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                view = ((FW1) this.A00).A0E;
                view.setAlpha(AbstractC7609F5w.A03(valueAnimator));
                return;
            case 8:
                float fA033 = AbstractC7609F5w.A03(valueAnimator);
                FW2 fw2 = ((FW1) this.A00).A0E;
                fw2.setScaleX(fA033);
                fw2.setScaleY(fA033);
                return;
            case 9:
            case 10:
            default:
                int iA0F = AnonymousClass001.A0F(valueAnimator.getAnimatedValue());
                Handler handler = FW1.A0H;
                ((FW1) this.A00).A0E.setTranslationY(iA0F);
                return;
            case 11:
                AbstractC7609F5w.A03(valueAnimator);
                throw new NullPointerException("endIconView");
            case 12:
                AbstractC7609F5w.A03(valueAnimator);
                throw new NullPointerException("endIconView");
            case 13:
                AbstractC7609F5w.A03(valueAnimator);
                throw new NullPointerException("endIconView");
            case 14:
                throw new NullPointerException("collapsingTextHelper");
            case 15:
                C7384Etj.A0Y(valueAnimator, 0);
                MutableState mutableState = (MutableState) this.A00;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C7384Etj.A0Z(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                mutableState.Af8(animatedValue);
                return;
            case 16:
                C7384Etj.A0Y(valueAnimator, 0);
                float fMax = Math.max(0.0f, Math.min(1.0f, AbstractC7610F5x.A03(valueAnimator))) * 4.0f;
                int i13 = (int) fMax;
                float f21 = fMax - i13;
                float[] fArr = FMU.A0C;
                Interpolator interpolator = FMU.A0A;
                float f22 = fArr[i13];
                int i14 = (i13 + 1) % 5;
                float f23 = fArr[i14];
                float interpolation = interpolator.getInterpolation(f21);
                float fA034 = C8j3.A03(f22, 1.0f - interpolation, f23, interpolation);
                float[] fArr2 = FMU.A0D;
                Interpolator interpolator2 = FMU.A09;
                float f24 = fArr2[i13];
                float f25 = fArr2[i14];
                float interpolation2 = interpolator2.getInterpolation(f21);
                float fA035 = C8j3.A03(f24, 1.0f - interpolation2, f25, interpolation2);
                float[] fArr3 = FMU.A0B;
                float f26 = fArr3[i13];
                float f27 = fArr3[i14];
                float interpolation3 = interpolator2.getInterpolation(f21);
                float fA036 = C8j3.A03(f26, 1.0f - interpolation3, f27, interpolation3);
                FMU fmu = (FMU) this.A00;
                fmu.A01 = ((fA035 * 360.0f) + fA034) - 90.0f;
                fmu.A00 = (fA036 - fA035) * 360.0f;
                fmz = fmu;
                fmz.invalidateSelf();
                return;
            case 17:
                C7384Etj.A0Y(valueAnimator, 0);
                float fMax2 = Math.max(0.0f, Math.min(1.0f, AbstractC7610F5x.A03(valueAnimator)));
                float f28 = 4000.0f * fMax2;
                float f29 = fMax2 * 360.0f;
                float interpolation4 = 0.0f;
                if (f28 >= 0.0f) {
                    if (f28 < 1333.0f) {
                        interpolation4 = FMZ.A0C.getInterpolation((f28 - 0.0f) / 1333.0f);
                    } else {
                        interpolation4 = 1.0f;
                        if (f28 >= 2000.0f && f28 < 3333.0f) {
                            interpolation4 = (FMZ.A0C.getInterpolation((f28 - 2000.0f) / 1333.0f) * 0.999f) + 0.001f;
                        }
                    }
                }
                float interpolation5 = 0.0f;
                if (f28 >= 517.0f) {
                    if (f28 < 2000.0f) {
                        interpolation5 = FMZ.A0C.getInterpolation((f28 - 517.0f) / 1483.0f) * 0.999f;
                    } else if (f28 >= 2517.0f) {
                        interpolation5 = f28 < 4000.0f ? FMZ.A0C.getInterpolation((f28 - 2517.0f) / 1483.0f) : 1.0f;
                    }
                }
                FMZ fmz2 = (FMZ) this.A00;
                Interpolator interpolator3 = FMZ.A0D;
                fmz2.A01 = ((interpolation5 * 360.0f) + f29) - 90.0f;
                fmz2.A00 = (interpolation4 - interpolation5) * 360.0f;
                fmz = fmz2;
                fmz.invalidateSelf();
                return;
        }
    }

    public C8919Ftb(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
