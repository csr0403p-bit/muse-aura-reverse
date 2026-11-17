package com.facebook.aura.widgets;

import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class HomeScreenWidgetKt {
    public static final List<HomeScreenWidget> homeScreenWidgets = Arrays.asList(SpaceHomeScreenWidget.INSTANCE, IdeasListWidget.INSTANCE, FeedListWidget.INSTANCE, GoalsListWidget.INSTANCE, AskBarHomeScreenWidget.INSTANCE, AvatarHomeScreenWidget.INSTANCE);

    @DebugMetadata(c = "com.facebook.aura.widgets.HomeScreenWidgetKt", f = "HomeScreenWidget.kt", l = {63}, m = "runIsolated", v = 2)
    /* renamed from: com.facebook.aura.widgets.HomeScreenWidgetKt$runIsolated$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeScreenWidgetKt.runIsolated(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final boolean hasHomeScreenWidgets(Context context) {
        C7384Etj.A0Y(context, 0);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        List<HomeScreenWidget> list = homeScreenWidgets;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HomeScreenWidget> it = list.iterator();
            while (it.hasNext()) {
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, it.next().getReceiver()));
                C7384Etj.A0U(appWidgetIds);
                if (appWidgetIds.length != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final List<HomeScreenWidget> getHomeScreenWidgets() {
        return homeScreenWidgets;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object runIsolated(java.lang.String r5, java.lang.String r6, X.G0U<? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.widgets.HomeScreenWidgetKt.AnonymousClass1
            if (r0 == 0) goto L26
            r4 = r8
            com.facebook.aura.widgets.HomeScreenWidgetKt$runIsolated$1 r4 = (com.facebook.aura.widgets.HomeScreenWidgetKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L30
            java.lang.Object r6 = r4.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r4.L$0
            java.lang.String r5 = (java.lang.String) r5
            goto L2c
        L26:
            com.facebook.aura.widgets.HomeScreenWidgetKt$runIsolated$1 r4 = new com.facebook.aura.widgets.HomeScreenWidgetKt$runIsolated$1
            r4.<init>(r8)
            goto L12
        L2c:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            goto L4e
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r3)
            r4.L$0 = r5     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            r4.L$1 = r6     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            r0 = 0
            r4.L$2 = r0     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            r4.label = r1     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            java.lang.Object r0 = r7.invoke(r4)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L51
            if (r0 != r2) goto L4e
            return r2
        L48:
            r1 = move-exception
            java.lang.String r0 = "Widget step failed: "
            X.C3cH.A1B(r0, r6, r5, r1)
        L4e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L51:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(java.lang.String, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }
}
