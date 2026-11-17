package androidx.glance.appwidget;

import X.AbstractC10440Hhn;
import X.AbstractC10524Hor;
import X.AbstractC9266GBt;
import X.AbstractC9320GEb;
import X.AnonymousClass001;
import X.AnonymousClass775;
import X.BTF;
import X.C064776j;
import X.C064976l;
import X.C065076m;
import X.C065176n;
import X.C07228ib;
import X.C07298ii;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6I8;
import X.C7384Etj;
import X.C76r;
import X.C78T;
import X.C79;
import X.C7zE;
import X.C8895FtC;
import X.C8i8;
import X.C9322GEd;
import X.EnumC10460Hji;
import X.EsN;
import X.GDE;
import X.GDU;
import X.GF0;
import X.HtJ;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class GlanceAppWidgetReceiver extends AppWidgetProvider {
    public static final int $stable = 8;
    public static final String ACTION_DEBUG_UPDATE = "androidx.glance.appwidget.action.DEBUG_UPDATE";
    public static final String TAG = "GlanceAppWidgetReceiver";
    public final C78T coroutineContext = AbstractC9266GBt.A00;

    public static final List<Integer> A00(int[] iArr) {
        int i = 0;
        C7384Etj.A0Y(iArr, 0);
        int length = iArr.length;
        if (length == 0) {
            return C0881AGi.A00;
        }
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayListA11 = C60O.A11(length);
        do {
            C60Q.A1P(arrayListA11, iArr[i]);
            i++;
        } while (i < length);
        return arrayListA11;
    }

    private final void updateManager(C3UX c3ux, Context context) {
        AnonymousClass001.A1J(new C07228ib(context, this, null, 11), c3ux);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doDelete$glance_appwidget(X.C3UX r8, android.content.Context r9, int[] r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            r3 = 2
            boolean r0 = r11 instanceof X.C2317BTr
            if (r0 == 0) goto L54
            r6 = r11
            X.BTr r6 = (X.C2317BTr) r6
            int r0 = r6.$t
            if (r0 != r3) goto L54
            int r2 = r6.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.A02 = r2
        L17:
            java.lang.Object r1 = r6.A05
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A02
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L5d
            int r3 = r6.A01
            int r2 = r6.A00
            java.lang.Object r10 = r6.A04
            int[] r10 = (int[]) r10
            java.lang.Object r0 = r6.A03
            android.content.Context r9 = X.C60P.A02(r0, r1)
        L30:
            int r2 = r2 + 1
        L32:
            if (r2 >= r3) goto L5a
            r1 = r10[r2]
            androidx.glance.appwidget.GlanceAppWidget r0 = r7.getGlanceAppWidget()
            r6.A03 = r9
            r6.A04 = r10
            r6.A00 = r2
            r6.A01 = r3
            r6.A02 = r4
            java.lang.Object r0 = r0.deleted$glance_appwidget(r9, r1, r6)
            if (r0 != r5) goto L30
            return r5
        L4b:
            X.Hwg.A00(r1)
            r7.updateManager(r8, r9)
            int r3 = r10.length
            r2 = 0
            goto L32
        L54:
            X.BTr r6 = new X.BTr
            r6.<init>(r7, r11, r3)
            goto L17
        L5a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetReceiver.doDelete$glance_appwidget(X.3UX, android.content.Context, int[], X.HtJ):java.lang.Object");
    }

    public final Object doLambda$glance_appwidget(C3UX c3ux, Context context, int i, String str, HtJ<? super Unit> htJ) {
        updateManager(c3ux, context);
        Object objTriggerAction$glance_appwidget = getGlanceAppWidget().triggerAction$glance_appwidget(context, i, str, null, htJ);
        return objTriggerAction$glance_appwidget != EnumC10460Hji.A02 ? Unit.INSTANCE : objTriggerAction$glance_appwidget;
    }

    public abstract GlanceAppWidget getGlanceAppWidget();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (C7zE.A00(context, new BTF(bundle, this, i, 3))) {
            return;
        }
        C6I8.A00(this, this.coroutineContext, new C8895FtC(context, bundle, this, null, i, 0));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        if (C7zE.A00(context, new C8i8(2, iArr, this))) {
            return;
        }
        C6I8.A00(this, this.coroutineContext, new C07298ii(context, this, (Context) null, iArr, (HtJ<? super C07298ii>) 4));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (C7zE.A00(context, new C8i8(3, iArr, this))) {
            return;
        }
        C6I8.A00(this, this.coroutineContext, new C07298ii(context, this, (Context) null, iArr, (HtJ<? super C07298ii>) 5));
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static final Unit onAppWidgetOptionsChanged$lambda$0(GlanceAppWidgetReceiver glanceAppWidgetReceiver, int i, Bundle bundle, C76r c76r) {
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C064776j.DEFAULT_INSTANCE.A05(C79.A0P);
        String strA0f = C60Q.A0f(glanceAppWidgetReceiver);
        abstractC10440Hhn.A01();
        C064776j c064776j = (C064776j) abstractC10440Hhn.A00;
        strA0f.getClass();
        c064776j.receiver_ = strA0f;
        abstractC10440Hhn.A01();
        ((C064776j) abstractC10440Hhn.A00).appWidgetId_ = i;
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        C9322GEd c9322GEdA01 = AbstractC9320GEb.A01(bArrMarshall, 0, bArrMarshall.length);
        abstractC10440Hhn.A01();
        ((C064776j) abstractC10440Hhn.A00).bundle_ = c9322GEdA01;
        C60R.A0I(abstractC10440Hhn, c76r).requestCase_ = 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onDeleted$lambda$0(GlanceAppWidgetReceiver glanceAppWidgetReceiver, int[] iArr, C76r c76r) {
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C064976l.DEFAULT_INSTANCE.A05(C79.A0P);
        String strA0f = C60Q.A0f(glanceAppWidgetReceiver);
        abstractC10440Hhn.A01();
        C064976l c064976l = (C064976l) abstractC10440Hhn.A00;
        strA0f.getClass();
        c064976l.receiver_ = strA0f;
        List<Integer> listA00 = A00(iArr);
        abstractC10440Hhn.A01();
        C064976l c064976l2 = (C064976l) abstractC10440Hhn.A00;
        AnonymousClass775 anonymousClass775 = c064976l2.appWidgetIds_;
        boolean z = ((GDE) anonymousClass775).A00;
        GDU gdu = anonymousClass775;
        if (!z) {
            GDU gduA00 = GF0.A00(anonymousClass775);
            c064976l2.appWidgetIds_ = gduA00;
            gdu = gduA00;
        }
        AbstractC10524Hor.A00(listA00, gdu);
        C60R.A0I(abstractC10440Hhn, c76r).requestCase_ = 3;
        return Unit.INSTANCE;
    }

    public static final Unit onReceive$lambda$0$1(GlanceAppWidgetReceiver glanceAppWidgetReceiver, int i, String str, C76r c76r) {
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C065176n.DEFAULT_INSTANCE.A05(C79.A0P);
        String strA0f = C60Q.A0f(glanceAppWidgetReceiver);
        abstractC10440Hhn.A01();
        C065176n c065176n = (C065176n) abstractC10440Hhn.A00;
        strA0f.getClass();
        c065176n.receiver_ = strA0f;
        abstractC10440Hhn.A01();
        ((C065176n) abstractC10440Hhn.A00).appWidgetId_ = i;
        abstractC10440Hhn.A01();
        C065176n c065176n2 = (C065176n) abstractC10440Hhn.A00;
        str.getClass();
        c065176n2.actionKey_ = str;
        C60R.A0I(abstractC10440Hhn, c76r).requestCase_ = 4;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onUpdate$lambda$0(GlanceAppWidgetReceiver glanceAppWidgetReceiver, int[] iArr, C76r c76r) {
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C065076m.DEFAULT_INSTANCE.A05(C79.A0P);
        String strA0f = C60Q.A0f(glanceAppWidgetReceiver);
        abstractC10440Hhn.A01();
        C065076m c065076m = (C065076m) abstractC10440Hhn.A00;
        strA0f.getClass();
        c065076m.receiver_ = strA0f;
        List<Integer> listA00 = A00(iArr);
        abstractC10440Hhn.A01();
        C065076m c065076m2 = (C065076m) abstractC10440Hhn.A00;
        AnonymousClass775 anonymousClass775 = c065076m2.appWidgetIds_;
        boolean z = ((GDE) anonymousClass775).A00;
        GDU gdu = anonymousClass775;
        if (!z) {
            GDU gduA00 = GF0.A00(anonymousClass775);
            c065076m2.appWidgetIds_ = gduA00;
            gdu = gduA00;
        }
        AbstractC10524Hor.A00(listA00, gdu);
        C60R.A0I(abstractC10440Hhn, c76r).requestCase_ = 1;
        return Unit.INSTANCE;
    }

    public C78T getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r2.equals("android.intent.action.LOCALE_CHANGED") == false) goto L27;
     */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r4 = "appWidgetIds"
            java.lang.String r2 = r9.getAction()     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r6 = r7
            r5 = r8
            if (r2 == 0) goto L66
            int r1 = r2.hashCode()     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r0 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r1 == r0) goto L5e
            r0 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r1 == r0) goto L55
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r1 != r0) goto L66
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 == 0) goto L66
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r7 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r7 == 0) goto L4e
            java.lang.String r1 = "EXTRA_APPWIDGET_ID"
            r0 = -1
            int r9 = r9.getIntExtra(r1, r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r9 == r0) goto L9b
            r1 = 1
            X.BTe r0 = new X.BTe     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r0.<init>(r6, r7, r9, r1)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            boolean r0 = X.C7zE.A00(r8, r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 != 0) goto Laa
            X.78T r0 = r6.coroutineContext     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r8 = 0
            androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1 r4 = new androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            X.C6I8.A00(r6, r0, r4)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            return
        L4e:
            java.lang.String r0 = "Intent is missing ActionKey extra"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            goto La1
        L55:
            java.lang.String r0 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 != 0) goto L6a
            goto L66
        L5e:
            java.lang.String r0 = "android.intent.action.LOCALE_CHANGED"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 != 0) goto L6a
        L66:
            super.onReceive(r8, r9)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            return
        L6a:
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r8)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            java.lang.String r2 = r8.getPackageName()     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            java.lang.String r0 = X.C60Q.A0f(r7)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 == 0) goto L94
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            boolean r0 = r9.hasExtra(r4)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            if (r0 == 0) goto L8e
            int[] r0 = r9.getIntArrayExtra(r4)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
        L8a:
            r7.onUpdate(r8, r3, r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            goto L93
        L8e:
            int[] r0 = r3.getAppWidgetIds(r1)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            goto L8a
        L93:
            return
        L94:
            java.lang.String r0 = "no canonical name"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
            goto La1
        L9b:
            java.lang.String r0 = "Intent is missing AppWidgetId extra"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
        La1:
            throw r0     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> Laa
        La2:
            r2 = move-exception
            java.lang.String r1 = "GlanceAppWidget"
            java.lang.String r0 = "Error in Glance App Widget"
            android.util.Log.e(r1, r0, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final Object doOptionsChanged$glance_appwidget(C3UX c3ux, Context context, int i, Bundle bundle, HtJ<? super Unit> htJ) {
        updateManager(c3ux, context);
        return C3cG.A0U(getGlanceAppWidget().resize$glance_appwidget(context, i, bundle, htJ));
    }

    public final Object doUpdate$glance_appwidget(C3UX c3ux, Context context, int[] iArr, HtJ<? super Unit> htJ) {
        updateManager(c3ux, context);
        ArrayList arrayListA11 = C60O.A11(iArr.length);
        for (int i : iArr) {
            arrayListA11.add(AnonymousClass001.A10(new GlanceAppWidgetReceiver$doUpdate$2$1(context, this, null, i), c3ux));
        }
        return C3cG.A0U(EsN.A00(arrayListA11, htJ));
    }
}
