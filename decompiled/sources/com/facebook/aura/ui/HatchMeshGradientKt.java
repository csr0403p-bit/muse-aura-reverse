package com.facebook.aura.ui;

import X.AHD;
import X.ASj;
import X.ATD;
import X.AbstractC1046ASq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BBP;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0zJ;
import X.C1041ASi;
import X.C1050ASu;
import X.C1BO;
import X.C2HU;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.G0V;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HatchMeshGradientKt {
    public static final int MESH_SIZE = 64;
    public static final float STEPS_PER_SECOND = 30.0f;

    /* renamed from: com.facebook.aura.ui.HatchMeshGradientKt$HatchMeshGradient$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<B6A> $colors;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<B6A> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$colors = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMeshGradientKt.HatchMeshGradient(this.$colors, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final float meshWave(double d, float f, float f2, double d2, double d3) {
        return ATD.A03(f + (f2 * ((float) Math.sin((d * d2) + d3))), 0.05f, 0.95f);
    }

    public static final void HatchMeshGradient(AHD<B6A> ahd, BRg bRg, BFM bfm, int i, int i2) {
        Object obj;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ahd, 0);
        bfm.AgG(221908031);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj2 = C78N.A00;
            if (objAaT == obj2) {
                objAaT = Float.valueOf(((float) Math.random()) * 100.0f);
                bfm.Ai0(objAaT);
            }
            float fA02 = AnonymousClass001.A02(objAaT);
            C1050ASu c1050ASuA00 = AbstractC1046ASq.A00(new C1041ASi(new ASj(C2HU.A02, 100000, 0), C79.A00, 0L), AbstractC1046ASq.A01(bfm), bfm, 0.0f, 100.0f);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj2) {
                objAaT2 = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
                bfm.Ai0(objAaT2);
            }
            Bitmap bitmap = (Bitmap) objAaT2;
            C7384Etj.A0X(bitmap);
            Object objAaT3 = bfm.AaT();
            Object obj3 = objAaT3;
            if (objAaT3 == obj2) {
                Paint paint = new Paint();
                paint.setFilterBitmap(true);
                bfm.Ai0(paint);
                obj3 = paint;
            }
            Paint paint2 = (Paint) obj3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj2) {
                objAaT4 = new int[4096];
                bfm.Ai0(objAaT4);
            }
            int[] iArr = (int[]) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj2) {
                objAaT5 = Float.valueOf((((float) Math.random()) * 0.3f) + 0.85f);
                bfm.Ai0(objAaT5);
            }
            float fA022 = AnonymousClass001.A02(objAaT5);
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj2) {
                objAaT6 = BBP.A0A(new HatchMeshGradientKt$HatchMeshGradient$quantizedTime$2$1(c1050ASuA00));
                BBI.A0T(bfm, objAaT6);
            }
            C1BO c1bo = (C1BO) objAaT6;
            boolean zA63 = bfm.A63(C1BO.A02(c1bo));
            Object objAaT7 = bfm.AaT();
            if (zA63 || objAaT7 == obj2) {
                computeMeshPixels(C1BO.A01(c1050ASuA00) + fA02, fA022, ahd, iArr);
                bitmap.setPixels(iArr, 0, 64, 0, 0, 64, 64);
                bfm.Ai0(bitmap);
                obj = bitmap;
            } else {
                obj = objAaT7;
            }
            Bitmap bitmap2 = (Bitmap) obj;
            boolean zA1M = AnonymousClass003.A1M(bfm, bitmap2, paint2);
            Object objAaT8 = bfm.AaT();
            if (zA1M || objAaT8 == obj2) {
                objAaT8 = new HatchMeshGradientKt$HatchMeshGradient$1$1(c1bo, bitmap2, paint2);
                BBI.A0T(bfm, objAaT8);
            }
            C0zJ.A00(bRg2, (G0U) objAaT8, bfm, (iA0d >> 3) & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, bRg2, i, i2);
        }
    }

    public static final float lerp(float f, float f2, float f3) {
        return C8j3.A02(f2, f, f3);
    }

    public static final float smoothstep(float f) {
        float fA00 = AnonymousClass003.A00(f);
        return fA00 * fA00 * (3.0f - (fA00 * 2.0f));
    }

    public static final void computeMeshPixels(double d, double d2, AHD<B6A> ahd, int[] iArr) {
        float f;
        float f2;
        float fA02;
        float fA022;
        float fSmoothstep;
        int i;
        float fSmoothstep2;
        float fMeshWave = meshWave(d, 0.5f, 0.45f, d2 * 1.2d, 0.0d);
        float fMeshWave2 = meshWave(d, 0.5f, 0.4f, d2 * 1.0d, 1.5d);
        double d3 = d2 * 0.9d;
        float fMeshWave3 = meshWave(d, 0.5f, 0.45f, d3, 3.0d);
        float fMeshWave4 = meshWave(d, 0.5f, 0.45f, d2 * 0.8d, 4.5d);
        float fMeshWave5 = meshWave(d, 0.5f, 0.4f, d2 * 1.1d, 6.0d);
        float fMeshWave6 = meshWave(d, 0.5f, 0.45f, d3, 7.5d);
        int i2 = 0;
        do {
            float f3 = i2 / 63.0f;
            int i3 = 0;
            do {
                float f4 = i3 / 63.0f;
                if (f3 <= fMeshWave4) {
                    f2 = 0.01f;
                    float f5 = fMeshWave4;
                    if (fMeshWave4 < 0.01f) {
                        f5 = 0.01f;
                    }
                    fA02 = C8j3.A02(fMeshWave3, fMeshWave, smoothstep(f3 / f5));
                    f = 1.0f;
                } else {
                    float f6 = f3 - fMeshWave4;
                    f = 1.0f;
                    float f7 = 1.0f - fMeshWave4;
                    f2 = 0.01f;
                    if (f7 < 0.01f) {
                        f7 = 0.01f;
                    }
                    fA02 = C8j3.A02(fMeshWave6, fMeshWave3, smoothstep(f6 / f7));
                }
                if (f4 <= fMeshWave3) {
                    float f8 = fMeshWave3;
                    if (fMeshWave3 < f2) {
                        f8 = 0.01f;
                    }
                    fA022 = C8j3.A02(fMeshWave4, fMeshWave2, smoothstep(f4 / f8));
                } else {
                    float f9 = f4 - fMeshWave3;
                    float f10 = f - fMeshWave3;
                    if (f10 < f2) {
                        f10 = 0.01f;
                    }
                    fA022 = C8j3.A02(fMeshWave5, fMeshWave4, smoothstep(f9 / f10));
                }
                int i4 = 1;
                if (f3 <= fA022) {
                    if (fA022 < f2) {
                        fA022 = 0.01f;
                    }
                    fSmoothstep = smoothstep(f3 / fA022);
                    i = 0;
                } else {
                    float f11 = f3 - fA022;
                    float f12 = f - fA022;
                    if (f12 < f2) {
                        f12 = 0.01f;
                    }
                    fSmoothstep = smoothstep(f11 / f12);
                    i = 1;
                }
                if (f4 <= fA02) {
                    if (fA02 < f2) {
                        fA02 = 0.01f;
                    }
                    fSmoothstep2 = smoothstep(f4 / fA02);
                    i4 = 0;
                } else {
                    float f13 = f4 - fA02;
                    float f14 = f - fA02;
                    if (f14 < f2) {
                        f14 = 0.01f;
                    }
                    fSmoothstep2 = smoothstep(f13 / f14);
                }
                int i5 = (i * 3) + i4;
                long jA0P = C8j4.A0P(ahd, i5);
                long jA0P2 = C8j4.A0P(ahd, i5 + 1);
                long jA0P3 = C8j4.A0P(ahd, i5 + 3);
                long jA0P4 = C8j4.A0P(ahd, i5 + 4);
                float fA023 = C8j3.A02(C8j3.A02(B6A.A03(jA0P4), B6A.A03(jA0P3), fSmoothstep2), C8j3.A02(B6A.A03(jA0P2), B6A.A03(jA0P), fSmoothstep2), fSmoothstep);
                float fA024 = C8j3.A02(C8j3.A02(B6A.A02(jA0P4), B6A.A02(jA0P3), fSmoothstep2), C8j3.A02(B6A.A02(jA0P2), B6A.A02(jA0P), fSmoothstep2), fSmoothstep);
                float fA025 = C8j3.A02(C8j3.A02(B6A.A01(jA0P4), B6A.A01(jA0P3), fSmoothstep2), C8j3.A02(B6A.A01(jA0P2), B6A.A01(jA0P), fSmoothstep2), fSmoothstep);
                int i6 = (i2 * 64) + i3;
                int i7 = (int) (fA023 * 255.0f);
                if (i7 < 0) {
                    i7 = 0;
                } else if (i7 > 255) {
                    i7 = 255;
                }
                int i8 = (int) (fA024 * 255.0f);
                if (i8 < 0) {
                    i8 = 0;
                } else if (i8 > 255) {
                    i8 = 255;
                }
                int i9 = (int) (255.0f * fA025);
                if (i9 < 0) {
                    i9 = 0;
                } else if (i9 > 255) {
                    i9 = 255;
                }
                iArr[i6] = Color.rgb(i7, i8, i9);
                i3++;
            } while (i3 < 64);
            i2++;
        } while (i2 < 64);
    }
}
