package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.C06H;
import X.C60P;
import X.C7384Etj;
import X.C7396EuZ;
import X.C79;
import X.EK5;
import X.EKL;
import X.F1w;
import X.F3R;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WidgetPeriodicRefreshWorker extends WidgetWorker {
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetWorker.$stable;

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetPeriodicRefreshWorker", f = "WidgetPeriodicRefreshWorker.kt", l = {29}, m = "doWidgetWork", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$1, reason: invalid class name */
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
            return WidgetPeriodicRefreshWorker.this.doWidgetWork(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // com.facebook.aura.widgets.WidgetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWidgetWork(X.HtJ<? super X.C77S> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.WidgetPeriodicRefreshWorker.AnonymousClass1
            if (r0 == 0) goto L78
            r5 = r9
            com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$1 r5 = (com.facebook.aura.widgets.WidgetPeriodicRefreshWorker.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto L7e
            java.lang.Object r7 = r5.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            X.Hwg.A00(r1)
        L24:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r3 = r7.next()
            com.facebook.aura.widgets.HomeScreenWidget r3 = (com.facebook.aura.widgets.HomeScreenWidget) r3
            java.lang.String r1 = r3.getKey()
            java.lang.String r0 = "refresh "
            java.lang.String r2 = X.FGI.A0M(r0, r1)
            r0 = 0
            com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$2$1 r1 = new com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$2$1
            r1.<init>(r3, r8, r0)
            r5.L$0 = r0
            r5.L$1 = r7
            r5.L$2 = r0
            r5.L$3 = r0
            r5.label = r4
            java.lang.String r0 = "WidgetPeriodicRefreshWorker"
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r0, r2, r1, r5)
            if (r0 != r6) goto L24
            return r6
        L53:
            X.Hwg.A00(r1)
            android.content.Context r0 = r8.mAppContext
            X.C7384Etj.A0U(r0)
            boolean r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.hasHomeScreenWidgets(r0)
            if (r0 != 0) goto L71
            com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$Companion r1 = com.facebook.aura.widgets.WidgetPeriodicRefreshWorker.Companion
            android.content.Context r0 = r8.mAppContext
            X.C7384Etj.A0U(r0)
            r1.cancel(r0)
        L6b:
            X.77i r6 = new X.77i
            r6.<init>()
            return r6
        L71:
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.Iterator r7 = r0.iterator()
            goto L24
        L78:
            com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$1 r5 = new com.facebook.aura.widgets.WidgetPeriodicRefreshWorker$doWidgetWork$1
            r5.<init>(r9)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetPeriodicRefreshWorker.doWidgetWork(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.WidgetWorker
    public void onWidgetsDisabled() {
        Companion companion = Companion;
        Context context = this.mAppContext;
        C7384Etj.A0U(context);
        companion.cancel(context);
    }

    public final class Companion {
        public final void cancel(Context context) {
            C7384Etj.A0Y(context, 0);
            F3R.A02(context).A0A(WidgetPeriodicRefreshWorkerKt.WORK_NAME);
        }

        public final void schedule(Context context) {
            C7384Etj.A0Y(context, 0);
            F1w f1w = new F1w();
            f1w.A01(C79.A01);
            f1w.A03 = true;
            EKL eklA00 = f1w.A00();
            EK5 ek5A02 = F3R.A02(context);
            C7396EuZ c7396EuZ = new C7396EuZ(WidgetPeriodicRefreshWorker.class, TimeUnit.MINUTES, 30L);
            c7396EuZ.A00.A0B = eklA00;
            C60P.A1V(ek5A02, c7396EuZ.A01(), WidgetPeriodicRefreshWorkerKt.WORK_NAME);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPeriodicRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
