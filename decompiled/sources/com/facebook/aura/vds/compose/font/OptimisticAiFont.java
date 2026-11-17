package com.facebook.aura.vds.compose.font;

import X.AXN;
import X.AbstractC06907md;
import X.AbstractC1500Ak7;
import X.AnonymousClass003;
import X.B03;
import X.B04;
import X.B06;
import X.B08;
import X.B0H;
import X.C06H;
import X.C1498Ak5;
import X.C1736ApY;
import X.C1809ArT;
import X.C1813ArX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.CMG;
import X.FGI;
import X.HtJ;
import X.HxE;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import com.facebook.aura.vds.font.api.AuraAppTypeface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class OptimisticAiFont extends B06 {
    public final int style;
    public final C1736ApY weight;

    public final class Loader implements B0H {
        public static final Loader INSTANCE = new Loader();
        public static final ConcurrentHashMap<String, Typeface> typefaces = C60O.A1C();
        public static final AtomicReference<HxE<Float, Integer>> fontScaleAndWeightAdjustment = new AtomicReference<>();

        private final int fontWeightAdjustment(Context context) {
            int i;
            if (Build.VERSION.SDK_INT < 31 || (i = C8j3.A0Z(context).fontWeightAdjustment) == Integer.MAX_VALUE) {
                return 0;
            }
            return i;
        }

        private final String toAndroidString(B08 b08, AXN axn, int i) {
            return AbstractC06907md.A01(", ", b08.A00, new OptimisticAiFont$Loader$toAndroidString$1(axn, i));
        }

        public Object awaitLoad(Context context, B06 b06, HtJ<? super Typeface> htJ) {
            return loadBlocking(context, b06);
        }

        @Override // X.B0H
        public Typeface loadBlocking(Context context, B06 b06) {
            AnonymousClass003.A0u(context, b06);
            C1498Ak5 c1498Ak5A00 = AbstractC1500Ak7.A00(context);
            int iFontWeightAdjustment = fontWeightAdjustment(context);
            HxE<Float, Integer> hxEA0r = C3cG.A0r(Float.valueOf(c1498Ak5A00.A01), Integer.valueOf(iFontWeightAdjustment));
            if (!C7384Etj.areEqual(fontScaleAndWeightAdjustment.getAndSet(hxEA0r), hxEA0r)) {
                typefaces.clear();
            }
            String androidString = toAndroidString(b06.variationSettings, c1498Ak5A00, iFontWeightAdjustment);
            ConcurrentHashMap<String, Typeface> concurrentHashMap = typefaces;
            Typeface typefacePutIfAbsent = concurrentHashMap.get(androidString);
            if (typefacePutIfAbsent == null) {
                Paint paint = new Paint();
                Typeface typefaceA00 = CMG.A00(context, AuraAppTypeface.INSTANCE.getOptimisticAi());
                if (typefaceA00 == null) {
                    throw C60O.A0i("Required value was null.");
                }
                paint.setTypeface(typefaceA00);
                paint.setFontVariationSettings(androidString);
                Typeface typeface = paint.getTypeface();
                typefacePutIfAbsent = concurrentHashMap.putIfAbsent(androidString, typeface);
                if (typefacePutIfAbsent == null) {
                    typefacePutIfAbsent = typeface;
                }
            }
            C7384Etj.A0W(typefacePutIfAbsent);
            return typefacePutIfAbsent;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof OptimisticAiFont) && C7384Etj.areEqual(this.variationSettings, ((B06) obj).variationSettings);
    }

    @Override // X.B9B
    /* renamed from: getStyle-_-LCdwA */
    public int mo21getStyle_LCdwA() {
        return this.style;
    }

    @Override // X.B9B
    public C1736ApY getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode();
    }

    public /* synthetic */ OptimisticAiFont(long j, C1736ApY c1736ApY, C06H c06h) {
        this(j, c1736ApY);
    }

    public OptimisticAiFont(long j, C1736ApY c1736ApY) {
        String strA0H;
        C7384Etj.A0Y(c1736ApY, 1);
        Loader loader = Loader.INSTANCE;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        if ((j & 1095216660480L) == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            B03 b03 = new B03(j);
            int i = c1736ApY.A00;
            if (1 <= i && i < 1001) {
                super(0, loader, new B08(b03, new B04(i)));
                this.weight = c1736ApY;
                this.style = 0;
                return;
            }
            strA0H = FGI.A0H("'wght' value must be in [1, 1000]. Actual: ", i);
        } else {
            strA0H = "'opsz' must be provided in sp units";
        }
        throw C60O.A0i(strA0H);
    }
}
