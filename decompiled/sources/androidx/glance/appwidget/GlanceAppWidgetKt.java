package androidx.glance.appwidget;

/* loaded from: classes3.dex */
public abstract class GlanceAppWidgetKt {
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r7, androidx.glance.appwidget.GlanceAppWidget r8, X.HtJ r9) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = 1
            boolean r0 = r9 instanceof X.C8iS
            if (r0 == 0) goto L79
            r5 = r9
            X.8iS r5 = (X.C8iS) r5
            int r0 = r5.$t
            if (r0 != r6) goto L79
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A04
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 2
            if (r0 == 0) goto L4e
            if (r0 == r6) goto L67
            if (r0 != r2) goto L82
            java.lang.Object r1 = r5.A03
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r7 = r5.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r5.A01
            androidx.glance.appwidget.GlanceAppWidget r8 = (androidx.glance.appwidget.GlanceAppWidget) r8
            X.Hwg.A00(r4)
        L33:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.next()
            X.6PP r0 = (X.C6PP) r0
            r5.A01 = r8
            r5.A02 = r7
            r5.A03 = r1
            r5.A00 = r2
            java.lang.Object r0 = r8.update(r7, r0, r5)
            if (r0 != r3) goto L33
            return r3
        L4e:
            X.Hwg.A00(r4)
            androidx.glance.appwidget.GlanceAppWidgetManager r1 = new androidx.glance.appwidget.GlanceAppWidgetManager
            r1.<init>(r7)
            java.lang.Class r0 = r8.getClass()
            r5.A01 = r8
            r5.A02 = r7
            r5.A00 = r6
            java.lang.Object r4 = r1.A01(r0, r5)
            if (r4 != r3) goto L72
            return r3
        L67:
            java.lang.Object r7 = r5.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r5.A01
            androidx.glance.appwidget.GlanceAppWidget r8 = (androidx.glance.appwidget.GlanceAppWidget) r8
            X.Hwg.A00(r4)
        L72:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r1 = r4.iterator()
            goto L33
        L79:
            X.8iS r5 = new X.8iS
            r5.<init>(r9)
            goto L17
        L7f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetKt.A00(android.content.Context, androidx.glance.appwidget.GlanceAppWidget, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC10460Hji A01(X.HtJ r5, X.G0V r6) {
        /*
            boolean r0 = r5 instanceof X.C77V
            if (r0 == 0) goto L22
            r4 = r5
            X.77V r4 = (X.C77V) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L42
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            X.77V r4 = new X.77V
            r4.<init>(r5)
            goto L12
        L28:
            X.Hwg.A00(r1)
            X.78T r1 = r4.getContext()
            X.77X r0 = X.C77W.A00
            X.78X r0 = r1.get(r0)
            X.77W r0 = (X.C77W) r0
            if (r0 == 0) goto L4a
            r4.label = r2
            X.Hji r0 = r0.AYe(r4, r6)
            if (r0 != r3) goto L45
            return r3
        L42:
            X.Hwg.A00(r1)
        L45:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        L4a:
            java.lang.String r0 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetKt.A01(X.HtJ, X.G0V):X.Hji");
    }
}
