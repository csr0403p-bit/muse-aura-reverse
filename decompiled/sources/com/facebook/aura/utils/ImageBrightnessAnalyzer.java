package com.facebook.aura.utils;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ImageBrightnessAnalyzer {
    public static final int $stable = 0;
    public static final float BRIGHTNESS_THRESHOLD = 0.5f;
    public static final int DEFAULT_SAMPLE_SIZE = 10;
    public static final ImageBrightnessAnalyzer INSTANCE = new ImageBrightnessAnalyzer();

    @DebugMetadata(c = "com.facebook.aura.utils.ImageBrightnessAnalyzer$calculateBrightness$2", f = "ImageBrightnessAnalyzer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.utils.ImageBrightnessAnalyzer$calculateBrightness$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Float>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ int $sampleSize;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, int i, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$bitmap = bitmap;
            this.$sampleSize = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$bitmap, this.$sampleSize, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            float f = 1.0f;
            if (this.$bitmap.getWidth() != 0 && this.$bitmap.getHeight() != 0) {
                int width = this.$bitmap.getWidth() / this.$sampleSize;
                if (width < 1) {
                    width = 1;
                }
                int height = this.$bitmap.getHeight();
                int i = this.$sampleSize;
                int i2 = height / i;
                if (i2 < 1) {
                    i2 = 1;
                }
                float fPixelLuminance = 0.0f;
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = i4 * width;
                    int width2 = this.$bitmap.getWidth() - 1;
                    if (i5 > width2) {
                        i5 = width2;
                    }
                    int i6 = 0;
                    while (true) {
                        i = this.$sampleSize;
                        if (i6 < i) {
                            int i7 = i6 * i2;
                            int height2 = this.$bitmap.getHeight() - 1;
                            if (i7 > height2) {
                                i7 = height2;
                            }
                            fPixelLuminance += ImageBrightnessAnalyzer.INSTANCE.pixelLuminance(this.$bitmap.getPixel(i5, i7));
                            i3++;
                            i6++;
                        }
                    }
                }
                if (i3 > 0) {
                    f = fPixelLuminance / i3;
                }
            }
            return new Float(f);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Float> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.utils.ImageBrightnessAnalyzer", f = "ImageBrightnessAnalyzer.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "isLight", v = 2)
    /* renamed from: com.facebook.aura.utils.ImageBrightnessAnalyzer$isLight$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageBrightnessAnalyzer.this.isLight(null, 0, this);
        }
    }

    public static /* synthetic */ Object calculateBrightness$default(ImageBrightnessAnalyzer imageBrightnessAnalyzer, Bitmap bitmap, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return imageBrightnessAnalyzer.calculateBrightness(bitmap, i, htJ);
    }

    public static /* synthetic */ Object isLight$default(ImageBrightnessAnalyzer imageBrightnessAnalyzer, Bitmap bitmap, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return imageBrightnessAnalyzer.isLight(bitmap, i, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isLight(android.graphics.Bitmap r6, int r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.utils.ImageBrightnessAnalyzer.AnonymousClass1
            if (r0 == 0) goto L41
            r4 = r8
            com.facebook.aura.utils.ImageBrightnessAnalyzer$isLight$1 r4 = (com.facebook.aura.utils.ImageBrightnessAnalyzer.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L47
            X.Hwg.A00(r3)
        L20:
            float r1 = X.AnonymousClass001.A02(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2b
            r2 = 0
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L30:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.I$0 = r7
            r4.label = r2
            java.lang.Object r3 = r5.calculateBrightness(r6, r7, r4)
            if (r3 != r1) goto L20
            return r1
        L41:
            com.facebook.aura.utils.ImageBrightnessAnalyzer$isLight$1 r4 = new com.facebook.aura.utils.ImageBrightnessAnalyzer$isLight$1
            r4.<init>(r8)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.ImageBrightnessAnalyzer.isLight(android.graphics.Bitmap, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float pixelLuminance(int i) {
        return ((Color.red(i) / 255.0f) * 0.299f) + ((Color.green(i) / 255.0f) * 0.587f) + ((Color.blue(i) / 255.0f) * 0.114f);
    }

    public final Object calculateBrightness(Bitmap bitmap, int i, HtJ<? super Float> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(bitmap, i, null));
    }
}
