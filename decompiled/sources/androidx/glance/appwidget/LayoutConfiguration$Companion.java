package androidx.glance.appwidget;

import X.AnonymousClass007;
import X.C6PP;
import X.C6PX;
import X.C6vW;
import X.FGI;
import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public final class LayoutConfiguration$Companion {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.content.Context r11, int r12, X.HtJ<? super X.C75j> r13) {
        /*
            r10 = this;
            r8 = r11
            r3 = 0
            r4 = r13
            boolean r0 = r13 instanceof X.C8iQ
            if (r0 == 0) goto L2d
            r7 = r4
            X.8iQ r7 = (X.C8iQ) r7
            int r0 = r7.$t
            if (r0 != r3) goto L2d
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r7.A01 = r2
        L19:
            java.lang.Object r4 = r7.A03
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.A01
            java.lang.String r5 = "GlanceAppWidget"
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L33
            int r12 = r7.A00
            java.lang.Object r8 = r7.A02
            android.content.Context r8 = (android.content.Context) r8
            goto L52
        L2d:
            X.8iQ r7 = new X.8iQ
            r7.<init>(r10, r13, r3)
            goto L19
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            X.Hwg.A00(r4)
            androidx.glance.state.GlanceState r2 = androidx.glance.state.GlanceState.A00     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            X.6PI r1 = X.C6PI.A00     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            java.lang.String r0 = "appWidgetLayout-"
            java.lang.String r0 = X.FGI.A0H(r0, r12)     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            r7.A02 = r11     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            r7.A00 = r12     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            r7.A01 = r3     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            java.lang.Object r4 = r2.AMM(r11, r1, r0, r7)     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            if (r4 != r6) goto L55
            return r6
        L52:
            X.Hwg.A00(r4)     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
        L55:
            X.76h r4 = (X.C064576h) r4     // Catch: androidx.datastore.core.CorruptionException -> L58 java.io.IOException -> L65
            goto L75
        L58:
            r2 = move-exception
            java.lang.String r0 = "Set of layout structures for App Widget id "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r12)
            java.lang.String r0 = " is corrupted"
            r1.append(r0)
            goto L6c
        L65:
            r2 = move-exception
            java.lang.String r0 = "I/O error reading set of layout structures for App Widget id "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r12)
        L6c:
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r5, r0, r2)
            X.76h r4 = X.C064576h.DEFAULT_INSTANCE
        L75:
            X.GDM<X.76i> r1 = r4.layout_
            r0 = 10
            int r0 = X.C3cG.A03(r1, r0)
            r13 = 16
            if (r0 >= r13) goto L83
            r0 = 16
        L83:
            java.util.LinkedHashMap r3 = X.C60O.A15(r0)
            java.util.Iterator r2 = r1.iterator()
        L8b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r2.next()
            X.76i r0 = (X.C064676i) r0
            X.76f r1 = r0.layout_
            if (r1 != 0) goto L9d
            X.76f r1 = X.C064376f.DEFAULT_INSTANCE
        L9d:
            int r0 = r0.layoutIndex_
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            r3.put(r1, r0)
            goto L8b
        La7:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r3)
            int r11 = r4.nextIndex_
            java.util.Collection r0 = r9.values()
            java.util.Set r10 = X.AbstractC0878AGe.A0f(r0)
            X.75j r7 = new X.75j
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.LayoutConfiguration$Companion.A01(android.content.Context, int, X.HtJ):java.lang.Object");
    }

    public static final void A00(Context context, C6PP c6pp) {
        int i;
        if (!(c6pp instanceof C6vW) || (i = ((C6vW) c6pp).A00) < -1) {
            return;
        }
        try {
            C6PX.A00(context, FGI.A0H("appWidgetLayout-", i)).delete();
        } catch (Exception e) {
            Log.d("GlanceAppWidget", AnonymousClass007.A0a("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ", c6pp), e);
        }
    }
}
