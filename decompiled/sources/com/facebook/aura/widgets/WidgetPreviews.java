package com.facebook.aura.widgets;

import X.C60O;
import X.C60P;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class WidgetPreviews {
    public static final int $stable = 0;
    public static final WidgetPreviews INSTANCE = new WidgetPreviews();

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetPreviews", f = "WidgetPreviews.kt", l = {55}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetPreviews$publish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetPreviews.this.publish(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetPreviews", f = "WidgetPreviews.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "publishIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetPreviews$publishIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C144281 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C144281(HtJ<? super C144281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetPreviews.this.publishIfNeeded(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(android.content.Context r13, android.appwidget.AppWidgetManager r14, android.content.ComponentName r15, com.facebook.aura.widgets.HomeScreenWidget r16, X.HtJ<? super java.lang.Boolean> r17) {
        /*
            r12 = this;
            r3 = r15
            r1 = r14
            java.lang.String r5 = "Preview for "
            r7 = r17
            boolean r0 = r7 instanceof com.facebook.aura.widgets.WidgetPreviews.AnonymousClass1
            if (r0 == 0) goto L2e
            r6 = r7
            com.facebook.aura.widgets.WidgetPreviews$publish$1 r6 = (com.facebook.aura.widgets.WidgetPreviews.AnonymousClass1) r6
            int r4 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L2e
            int r4 = r4 - r2
            r6.label = r4
        L18:
            java.lang.Object r8 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            java.lang.String r4 = "WidgetPreviews"
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L34
            java.lang.Object r3 = r6.L$2
            android.content.ComponentName r3 = (android.content.ComponentName) r3
            java.lang.Object r1 = r6.L$1
            android.appwidget.AppWidgetManager r1 = (android.appwidget.AppWidgetManager) r1
            goto L76
        L2e:
            com.facebook.aura.widgets.WidgetPreviews$publish$1 r6 = new com.facebook.aura.widgets.WidgetPreviews$publish$1
            r6.<init>(r7)
            goto L18
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L39:
            X.Hwg.A00(r8)
            androidx.glance.appwidget.GlanceRemoteViews r11 = new androidx.glance.appwidget.GlanceRemoteViews     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r11.<init>()     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r0 = r16
            long r15 = r0.mo3155getPreviewSizeMYxV2XQ()     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            com.facebook.aura.widgets.WidgetPreviews$publish$remoteViews$1 r8 = new com.facebook.aura.widgets.WidgetPreviews$publish$remoteViews$1     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r8.<init>(r0)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r0 = 747269394(0x2c8a6d12, float:3.934305E-12)
            X.B1U r14 = X.B1V.A01(r8, r0, r2)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r12 = 0
            r6.L$0 = r12     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r6.L$1 = r1     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r6.L$2 = r3     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r6.L$3 = r12     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r6.label = r2     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            android.os.Bundle r10 = new android.os.Bundle     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r10.<init>()     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            X.BOm r0 = new X.BOm     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r0.<init>(r12)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            androidx.glance.appwidget.GlanceRemoteViews$compose$2 r8 = new androidx.glance.appwidget.GlanceRemoteViews$compose$2     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            r9 = r13
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            java.lang.Object r8 = X.GAo.A00(r6, r0, r8)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            if (r8 != r7) goto L79
            return r7
        L76:
            X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
        L79:
            X.77K r8 = (X.C77K) r8     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            android.widget.RemoteViews r0 = r8.A00     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            boolean r2 = r1.setWidgetPreview(r3, r2, r0)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            if (r2 != 0) goto L9c
            java.lang.StringBuilder r1 = X.C3cG.A0f(r3, r5)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            java.lang.String r0 = " was rate limited"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            X.CFK.A06(r4, r0)     // Catch: java.lang.Exception -> L91 java.util.concurrent.CancellationException -> La1
            goto L9c
        L91:
            r1 = move-exception
            java.lang.String r0 = "Failed to publish preview for "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r3)
            X.CFK.A08(r4, r0, r1)
            r2 = 0
        L9c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        La1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetPreviews.publish(android.content.Context, android.appwidget.AppWidgetManager, android.content.ComponentName, com.facebook.aura.widgets.HomeScreenWidget, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a8 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishIfNeeded(android.content.Context r12, X.HtJ<? super kotlin.Unit> r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetPreviews.publishIfNeeded(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final String previewKey(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String languageTag = context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        long longVersionCode = packageInfo.getLongVersionCode();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(longVersionCode);
        return C60P.A1M(":", languageTag, sbA0w);
    }
}
