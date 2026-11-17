package com.facebook.aura.widgets;

import X.ADq;
import X.BNt;
import X.C3cG;
import X.C60P;
import X.C7Bm;
import X.GBL;
import X.HtJ;
import X.HxS;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class SpaceSnapshotRendererKt {
    public static final String ACTION_RESPONSE_BRIDGE = "_fwaSpacesActionResponse";
    public static final double BLANK_FRACTION = 0.97d;
    public static final int COMPARE_SIZE = 64;
    public static final String INITIAL_DATA_BRIDGE = "_fwaSpacesInitialData";
    public static final long LOAD_TIMEOUT_MS = 20000;
    public static final int MAX_CHANNEL_DIFF = 12;
    public static final int MAX_IMAGES = 3;
    public static final String PAGE_SETTLED_JS = "document.readyState === 'complete' && Array.prototype.every.call(document.images, function (i) { return i.complete; }) && (!document.fonts || document.fonts.status === 'loaded')";
    public static final long SETTLED_POLL_MS = 250;
    public static final long STABLE_FRAME_INTERVAL_MS = 600;
    public static final int STABLE_FRAME_MATCHES = 4;
    public static final long STABLE_FRAME_TIMEOUT_MS = 25000;
    public static final String TAG = "SpaceSnapshotRenderer";
    public static final String VIRTUAL_DISPLAY_NAME = "aura-space-widget-snapshot";
    public static final String VISIBLE_CONTENT_JS = "document.body !== null && (document.body.innerText.trim().length > 0 || Array.prototype.some.call(document.body.querySelectorAll('img, svg, canvas, video'), function (e) { var r = e.getBoundingClientRect(); return r.width > 0 && r.height > 0 && r.bottom > 0 && r.right > 0 && r.top < innerHeight && r.left < innerWidth; }))";

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRendererKt", f = "SpaceSnapshotRenderer.kt", l = {283}, m = "awaitVisualState", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceSnapshotRendererKt.awaitVisualState(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitVisualState(android.webkit.WebView r5, X.HtJ<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.widgets.SpaceSnapshotRendererKt.AnonymousClass1
            if (r0 == 0) goto L3f
            r3 = r6
            com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$1 r3 = (com.facebook.aura.widgets.SpaceSnapshotRendererKt.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L45
            X.Hwg.A00(r2)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r2)
            r3.L$0 = r5
            r3.label = r0
            X.GBL r3 = X.C7Bm.A04(r3)
            com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$2$1 r2 = new com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$2$1
            r2.<init>()
            r0 = 0
            r5.postVisualStateCallback(r0, r2)
            java.lang.Object r0 = r3.A0F()
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$1 r3 = new com.facebook.aura.widgets.SpaceSnapshotRendererKt$awaitVisualState$1
            r3.<init>(r6)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceSnapshotRendererKt.awaitVisualState(android.webkit.WebView, X.HtJ):java.lang.Object");
    }

    public static final int[] comparisonPixels(Bitmap bitmap) {
        int[] iArr = new int[4096];
        Bitmap.createScaledBitmap(bitmap, 64, 64, true).getPixels(iArr, 0, 64, 0, 0, 64, 64);
        return iArr;
    }

    public static final int backgroundColor(Context context) {
        return HxS.A01((C60P.A00(context) == 32 ? AuraColorsKt.auraColorsDark : AuraColorsKt.auraColorsLight).card);
    }

    public static final int channelDiff(int i, int i2) {
        return Math.max(Math.abs(Color.red(i) - Color.red(i2)), Math.max(Math.abs(Color.green(i) - Color.green(i2)), Math.abs(Color.blue(i) - Color.blue(i2))));
    }

    public static final boolean isNearlyBlank(Bitmap bitmap) {
        int[] iArrComparisonPixels = comparisonPixels(bitmap);
        int i = iArrComparisonPixels[0];
        int i2 = 0;
        int i3 = 0;
        do {
            if (channelDiff(iArrComparisonPixels[i2], i) <= 12) {
                i3++;
            }
            i2++;
        } while (i2 < 4096);
        return ((double) i3) >= 4096.0d * 0.97d;
    }

    public static final Object isPageSettled(WebView webView, HtJ<? super Boolean> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        webView.evaluateJavascript(PAGE_SETTLED_JS, new ValueCallback() { // from class: com.facebook.aura.widgets.SpaceSnapshotRendererKt$isPageSettled$2$1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                gblA03.resumeWith(Boolean.valueOf("true".equals(str)));
            }
        });
        return gblA03.A0F();
    }

    public static final boolean looksSame(Bitmap bitmap, Bitmap bitmap2) {
        int[] iArrComparisonPixels = comparisonPixels(bitmap);
        int[] iArrComparisonPixels2 = comparisonPixels(bitmap2);
        ADq aDq = new ADq(0, 4095);
        if (!(aDq instanceof Collection) || !C3cG.A1N(aDq)) {
            Iterator<Integer> it = aDq.iterator();
            while (it.hasNext()) {
                int iA00 = ((BNt) it).A00();
                if (channelDiff(iArrComparisonPixels[iA00], iArrComparisonPixels2[iA00]) > 12) {
                    return false;
                }
            }
        }
        return true;
    }
}
