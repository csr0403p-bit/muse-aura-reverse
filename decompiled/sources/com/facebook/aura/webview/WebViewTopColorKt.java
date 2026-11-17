package com.facebook.aura.webview;

import X.ADq;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BNt;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class WebViewTopColorKt {

    /* renamed from: com.facebook.aura.webview.WebViewTopColorKt$ObserveWebViewTopColor$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $backgroundColor;
        public final /* synthetic */ Object $contentKey;
        public final /* synthetic */ Function0<Boolean> $isLoaded;
        public final /* synthetic */ G0U<Integer, Unit> $onColor;
        public final /* synthetic */ WebView $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(WebView webView, Object obj, int i, Function0<Boolean> function0, G0U<? super Integer, Unit> g0u, int i2) {
            super(2);
            this.$webView = webView;
            this.$contentKey = obj;
            this.$backgroundColor = i;
            this.$isLoaded = function0;
            this.$onColor = g0u;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WebViewTopColorKt.ObserveWebViewTopColor(this.$webView, this.$contentKey, this.$backgroundColor, this.$isLoaded, this.$onColor, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ObserveWebViewTopColor(WebView webView, Object obj, int i, Function0<Boolean> function0, G0U<? super Integer, Unit> g0u, BFM bfm, int i2) {
        AnonymousClass002.A1C(function0, 3, g0u);
        bfm.AgG(1697600562);
        int iA0T = (i2 & 6) == 0 ? AnonymousClass004.A0T(bfm, webView) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, obj);
        }
        if ((i2 & 384) == 0) {
            iA0T |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            MutableState mutableStateA002 = C1er.A00(bfm, g0u);
            Integer numValueOf = Integer.valueOf(i);
            boolean zA1P = AnonymousClass003.A1P(bfm, mutableStateA00, mutableStateA002, bfm.A67(webView) | ((iA0T & 896) == 256));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = new WebViewTopColorKt$ObserveWebViewTopColor$1$1(webView, i, mutableStateA00, mutableStateA002);
                bfm.Ai0(objAaT);
            }
            C78e.A01(bfm, webView, obj, numValueOf, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(webView, obj, i, function0, g0u, i2);
        }
    }

    public static final int vibrantTopColor(int[] iArr) {
        double d;
        int length = iArr.length;
        int iMin = Math.min(400, length);
        double[][] dArr = new double[iMin][];
        int i = 0;
        while (i < iMin) {
            int i2 = (length * i) / iMin;
            int i3 = i + 1;
            int i4 = (length * i3) / iMin;
            double[] dArr2 = new double[3];
            int i5 = 0;
            do {
                double d2 = 0.0d;
                for (int i6 = i2; i6 < i4; i6++) {
                    d2 += (iArr[i6] >> (16 - (i5 * 8))) & 255;
                }
                dArr2[i5] = d2 / (i4 - i2);
                i5++;
            } while (i5 < 3);
            dArr[i] = dArr2;
            i = i3;
        }
        double[] dArr3 = new double[3];
        int i7 = 0;
        do {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < iMin; i8++) {
                d3 += dArr[i8][i7];
            }
            d = iMin;
            dArr3[i7] = d3 / d;
            i7++;
        } while (i7 < 3);
        int iCeil = (int) Math.ceil(d * 0.15d);
        double d4 = Double.NEGATIVE_INFINITY;
        double[] dArr4 = dArr3;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            double[] dArr5 = dArr[i11];
            double[] dArr6 = new double[3];
            int i12 = 0;
            for (int i13 = 0; i13 < iMin; i13++) {
                double[] dArr7 = dArr[i13];
                Iterator<Integer> it = new ADq(0, 2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        if (Math.abs(dArr7[iA00] - dArr5[iA00]) > 40.0d) {
                            break;
                        }
                    } else {
                        int i14 = 0;
                        do {
                            dArr6[i14] = dArr6[i14] + dArr7[i14];
                            i14++;
                        } while (i14 < 3);
                        i12++;
                    }
                }
            }
            if (i12 >= iCeil) {
                double[] dArr8 = new double[3];
                int i15 = 0;
                do {
                    dArr8[i15] = dArr6[i15] / i12;
                    i15++;
                } while (i15 < 3);
                if (i12 > i9) {
                    i9 = i12;
                    dArr4 = dArr8;
                }
                double dMax = dArr8[0];
                double dMin = dMax;
                char c = 1;
                while (true) {
                    dMax = Math.max(dMax, dArr8[c]);
                    if (c == 2) {
                        break;
                    }
                    c = 2;
                }
                char c2 = 1;
                while (true) {
                    dMin = Math.min(dMin, dArr8[c2]);
                    if (c2 == 2) {
                        break;
                    }
                    c2 = 2;
                }
                double d5 = dMax - dMin;
                if (d5 > d4 + 1.0E-9d || (d5 >= d4 - 1.0E-9d && i12 > i10)) {
                    i10 = i12;
                    d4 = d5;
                    dArr3 = dArr8;
                }
            }
        }
        if (d4 < 16.0d) {
            dArr3 = dArr4;
        }
        return Color.rgb(Ab3.A00(dArr3[0]), Ab3.A00(dArr3[1]), Ab3.A00(dArr3[2]));
    }

    public static final Integer captureTopColor(WebView webView, int i) {
        int width = webView.getWidth();
        if (width > 8192) {
            width = 8192;
        }
        if (width <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, 1, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(i);
            canvas.scale(width / webView.getWidth(), 1.0f);
            webView.draw(canvas);
            int[] iArr = new int[width];
            bitmapCreateBitmap.getPixels(iArr, 0, width, 0, 0, width, 1);
            return Integer.valueOf(vibrantTopColor(iArr));
        } finally {
            bitmapCreateBitmap.recycle();
        }
    }
}
