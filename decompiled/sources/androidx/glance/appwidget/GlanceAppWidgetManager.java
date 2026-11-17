package androidx.glance.appwidget;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AbstractC9266GBt;
import X.AnonymousClass002;
import X.C07228ib;
import X.C07338im;
import X.C31u;
import X.C3cG;
import X.C3cI;
import X.C6JO;
import X.C6JZ;
import X.C6LS;
import X.C6PK;
import X.C78W;
import X.C8i4;
import X.F0C;
import X.FGI;
import X.G0V;
import X.GBK;
import X.HlU;
import X.HtJ;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class GlanceAppWidgetManager {
    public static C6JO<Preferences> A03;
    public static final C6JZ<Set<String>> A04;
    public static final C6PK A05 = new C6PK();
    public static final C31u<Context, C6JO<Preferences>> A06;
    public final AppWidgetManager A00;
    public final Context A01;
    public final F0C A02 = AbstractC5321DgF.A03(new C8i4(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.glance.appwidget.GlanceAppWidgetManager r9, X.HtJ r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetManager.A00(androidx.glance.appwidget.GlanceAppWidgetManager, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends androidx.glance.appwidget.GlanceAppWidget> java.lang.Object A01(java.lang.Class<T> r9, X.HtJ<? super java.util.List<? extends X.C6PP>> r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            r4 = 3
            boolean r0 = r10 instanceof X.C8iP
            if (r0 == 0) goto L7f
            r3 = r10
            X.8iP r3 = (X.C8iP) r3
            int r0 = r3.$t
            if (r0 != r4) goto L7f
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r2 = r3.A02
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L71
            if (r1 != r0) goto L8c
            java.lang.Object r9 = r3.A01
            java.lang.Class r9 = (java.lang.Class) r9
            X.Hwg.A00(r2)
        L29:
            X.0t1 r2 = (X.C0t1) r2
            java.lang.String r1 = r9.getCanonicalName()
            if (r1 == 0) goto L85
            java.util.Map<java.lang.String, java.util.List<android.content.ComponentName>> r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L3e
            X.AGi r7 = X.C0881AGi.A00
        L3d:
            return r7
        L3e:
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r6 = r0.iterator()
        L46:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r1 = r6.next()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            android.appwidget.AppWidgetManager r0 = r8.A00
            int[] r5 = r0.getAppWidgetIds(r1)
            int r4 = r5.length
            java.util.ArrayList r3 = X.C60O.A11(r4)
            r2 = 0
        L5e:
            if (r2 >= r4) goto L6d
            r1 = r5[r2]
            X.6vW r0 = new X.6vW
            r0.<init>(r1)
            r3.add(r0)
            int r2 = r2 + 1
            goto L5e
        L6d:
            X.AbstractC0882AGj.A0r(r3, r7)
            goto L46
        L71:
            X.Hwg.A00(r2)
            r3.A01 = r9
            r3.A00 = r0
            java.lang.Object r2 = A00(r8, r3)
            if (r2 != r7) goto L29
            return r7
        L7f:
            X.8iP r3 = new X.8iP
            r3.<init>(r8, r10, r4)
            goto L17
        L85:
            java.lang.String r0 = "no canonical provider name"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetManager.A01(java.lang.Class, X.HtJ):java.lang.Object");
    }

    static {
        String strA0M = FGI.A0M("GlanceAppWidgetManager-", Application.getProcessName());
        C07338im c07338im = new C07338im(2);
        GBK gbk = AbstractC9266GBt.A00;
        A06 = new C6LS(strA0M, c07338im, C78W.A04(HlU.A01));
        A04 = new C6JZ<>("list::Providers");
    }

    public final Object A02(HtJ<? super Unit> htJ) {
        String packageName = this.A01.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.A00.getInstalledProviders();
        ArrayList arrayListA0h = C3cG.A0h();
        for (AppWidgetProviderInfo appWidgetProviderInfo : installedProviders) {
            C3cI.A1J(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo, packageName, arrayListA0h);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        return C3cG.A0U(((C6JO) this.A02.getValue()).Ahr(new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) AbstractC0878AGe.A0g(arrayListA0m), (HtJ<? super C07228ib>) 10), htJ));
    }

    public GlanceAppWidgetManager(Context context) {
        this.A01 = context;
        this.A00 = AppWidgetManager.getInstance(context);
    }
}
