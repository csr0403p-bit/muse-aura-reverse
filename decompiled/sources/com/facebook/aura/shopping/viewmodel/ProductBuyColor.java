package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC6569EGi;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6567EGc;
import X.C8j3;
import X.DQZ;
import X.EGb;
import X.EGe;
import X.EGh;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC6571EGk;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class ProductBuyColor {
    public static final int $stable = 0;
    public static final String CALLER_CONTEXT = "HatchProductBuyColor";
    public static final ProductBuyColor INSTANCE = new ProductBuyColor();
    public static final float LIGHTNESS_STEP = 0.02f;
    public static final float MAX_LIGHTNESS = 0.95f;
    public static final int MAX_PALETTE_COLORS = 16;
    public static final double MIN_CONTRAST_WITH_WHITE = 4.5d;
    public static final float MIN_LIGHTNESS = 0.05f;
    public static final float MIN_SATURATION = 0.15f;
    public static final int SAMPLE_EDGE_PX = 128;

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ProductBuyColor", f = "ProductBuyColor.kt", l = {28, 34}, m = "fromImage", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductBuyColor.this.fromImage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$2", f = "ProductBuyColor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ Bitmap $sample;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$sample = bitmap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$sample, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return new AnonymousClass2(this.$sample, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ProductBuyColor productBuyColor = ProductBuyColor.INSTANCE;
            Integer numPaletteMainColor = productBuyColor.paletteMainColor(this.$sample);
            if (numPaletteMainColor != null) {
                return C3cG.A0R(productBuyColor.readableWithWhiteText(numPaletteMainColor.intValue()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readableWithWhiteText(int i) {
        float[] fArr = new float[3];
        EGb.A07(Color.red(i), Color.green(i), fArr, Color.blue(i));
        while (EGb.A01(-1, i) < 4.5d) {
            float f = fArr[2];
            if (f <= 0.0f) {
                break;
            }
            float f2 = f - 0.02f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            fArr[2] = f2;
            i = EGb.A06(fArr);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fromImage(java.lang.String r12, X.HtJ<? super java.lang.Integer> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.shopping.viewmodel.ProductBuyColor.AnonymousClass1
            if (r0 == 0) goto L25
            r10 = r13
            com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$1 r10 = (com.facebook.aura.shopping.viewmodel.ProductBuyColor.AnonymousClass1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r5 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r0 == r1) goto L53
            if (r0 != r3) goto L2b
            X.Hwg.A00(r5)
            return r5
        L25:
            com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$1 r10 = new com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$1
            r10.<init>(r13)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r5)
            r6 = 0
            android.net.Uri r6 = X.C7Je.A01(r12)     // Catch: java.lang.Throwable -> L38
        L38:
            if (r6 == 0) goto L74
            com.facebook.aura.common.image.AuraBitmapLoader r5 = com.facebook.aura.common.image.AuraBitmapLoader.INSTANCE
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r8 = X.C3cG.A0R(r0)
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            r10.L$0 = r2
            r10.L$1 = r2
            r10.label = r1
            java.lang.String r7 = "HatchProductBuyColor"
            java.lang.Object r5 = r5.load(r6, r7, r8, r9, r10)
            if (r5 != r4) goto L56
        L52:
            return r4
        L53:
            X.Hwg.A00(r5)
        L56:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L74
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
            X.78T r1 = r0.m764default()
            com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$2 r0 = new com.facebook.aura.shopping.viewmodel.ProductBuyColor$fromImage$2
            r0.<init>(r5, r2)
            r10.L$0 = r2
            r10.L$1 = r2
            r10.L$2 = r2
            r10.label = r3
            java.lang.Object r0 = X.GAo.A00(r10, r1, r0)
            if (r0 == r4) goto L52
            return r0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ProductBuyColor.fromImage(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer paletteMainColor(Bitmap bitmap) {
        Object next;
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        if (bitmap == null || bitmap.isRecycled()) {
            throw C60O.A0i("Bitmap is not valid");
        }
        arrayListA0h2.add(AbstractC6569EGi.A00);
        arrayListA0h.add(EGh.A06);
        arrayListA0h.add(EGh.A08);
        arrayListA0h.add(EGh.A04);
        arrayListA0h.add(EGh.A05);
        arrayListA0h.add(EGh.A07);
        arrayListA0h.add(EGh.A03);
        Bitmap bitmapCreateScaledBitmap = bitmap;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double dSqrt = Math.sqrt(12544.0d / width);
            if (dSqrt > 0.0d) {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
            }
        }
        int width2 = bitmapCreateScaledBitmap.getWidth();
        int height = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width2 * height];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
        EGe eGe = new EGe(iArr, arrayListA0h2.isEmpty() ? null : (InterfaceC6571EGk[]) arrayListA0h2.toArray(new InterfaceC6571EGk[arrayListA0h2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        List<C6567EGc> list = eGe.A00;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        DQZ dqz = new DQZ(0);
        int size = list.size();
        int i = Integer.MIN_VALUE;
        C6567EGc c6567EGc = null;
        for (int i2 = 0; i2 < size; i2++) {
            C6567EGc c6567EGc2 = list.get(i2);
            if (c6567EGc2.A04 > i) {
                i = c6567EGc2.A04;
                c6567EGc = c6567EGc2;
            }
        }
        int size2 = arrayListA0h.size();
        for (int i3 = 0; i3 < size2; i3++) {
            EGh eGh = (EGh) arrayListA0h.get(i3);
            float[] fArr = eGh.A02;
            int i4 = 0;
            int i5 = 0;
            float f = 0.0f;
            do {
                float f2 = fArr[i5];
                if (f2 > 0.0f) {
                    f += f2;
                }
                i5++;
            } while (i5 < 3);
            if (f != 0.0f) {
                do {
                    float f3 = fArr[i4];
                    if (f3 > 0.0f) {
                        fArr[i4] = f3 / f;
                    }
                    i4++;
                } while (i4 < 3);
            }
            int size3 = list.size();
            float f4 = 0.0f;
            C6567EGc c6567EGc3 = null;
            for (int i6 = 0; i6 < size3; i6++) {
                C6567EGc c6567EGc4 = list.get(i6);
                float[] fArrA01 = c6567EGc4.A01();
                float f5 = fArrA01[1];
                float[] fArr2 = eGh.A01;
                if (f5 >= fArr2[0] && f5 <= fArr2[2]) {
                    float f6 = fArrA01[2];
                    float[] fArr3 = eGh.A00;
                    if (f6 >= fArr3[0] && f6 <= fArr3[2] && !sparseBooleanArray.get(c6567EGc4.A05)) {
                        float[] fArrA012 = c6567EGc4.A01();
                        int i7 = c6567EGc != null ? c6567EGc.A04 : 1;
                        float[] fArr4 = eGh.A02;
                        float f7 = fArr4[0];
                        float fA01 = f7 > 0.0f ? f7 * (1.0f - C8j3.A01(fArrA012[1], fArr2[1])) : 0.0f;
                        float f8 = fArr4[1];
                        float fA012 = f8 > 0.0f ? f8 * (1.0f - C8j3.A01(fArrA012[2], fArr3[1])) : 0.0f;
                        float f9 = fArr4[2];
                        float f10 = fA01 + fA012 + (f9 > 0.0f ? f9 * (c6567EGc4.A04 / i7) : 0.0f);
                        if (c6567EGc3 == null || f10 > f4) {
                            c6567EGc3 = c6567EGc4;
                            f4 = f10;
                        }
                    }
                }
            }
            if (c6567EGc3 != null) {
                sparseBooleanArray.append(c6567EGc3.A05, true);
            }
            dqz.put(eGh, c6567EGc3);
        }
        sparseBooleanArray.clear();
        List listUnmodifiableList = Collections.unmodifiableList(list);
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj : listUnmodifiableList) {
            C6567EGc c6567EGc5 = (C6567EGc) obj;
            if (c6567EGc5.A01()[1] >= 0.15f) {
                float f11 = c6567EGc5.A01()[2];
                if (0.05f <= f11 && f11 <= 0.95f) {
                    arrayListA0h3.add(obj);
                }
            }
        }
        Iterator it = arrayListA0h3.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i8 = ((C6567EGc) next).A04;
                do {
                    Object next2 = it.next();
                    int i9 = ((C6567EGc) next2).A04;
                    if (i8 < i9) {
                        next = next2;
                        i8 = i9;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C6567EGc c6567EGc6 = (C6567EGc) next;
        if (c6567EGc6 != null) {
            return Integer.valueOf(c6567EGc6.A05);
        }
        return null;
    }
}
