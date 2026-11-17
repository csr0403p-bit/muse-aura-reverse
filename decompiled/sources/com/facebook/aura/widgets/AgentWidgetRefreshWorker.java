package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C60S;
import X.C7384Etj;
import X.C7yC;
import X.EK5;
import X.F1d;
import X.F3R;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AgentWidgetRefreshWorker extends WidgetWorker {
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetWorker.$stable;

    @DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetRefreshWorker", f = "AgentWidgetRefreshWorker.kt", l = {24}, m = "doWidgetWork", v = 2)
    /* renamed from: com.facebook.aura.widgets.AgentWidgetRefreshWorker$doWidgetWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentWidgetRefreshWorker.this.doWidgetWork(this);
        }
    }

    public final class Companion {
        public final void enqueue$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(Context context, AgentWidget agentWidget) {
            C7384Etj.A0Y(context, 0);
            C7384Etj.A0Y(agentWidget, 1);
            EK5 ek5A02 = F3R.A02(context);
            String strA0M = FGI.A0M(AgentWidgetRefreshWorkerKt.WORK_NAME_PREFIX, agentWidget.getKey());
            C7yC c7yC = C7yC.A03;
            F1d f1d = new F1d(AgentWidgetRefreshWorker.class);
            f1d.A03(C60S.A01(C3cG.A0r("widget", agentWidget.getKey())));
            ek5A02.A04(c7yC, f1d.A01(), strA0M);
        }

        public final void cancel$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(Context context, AgentWidget agentWidget) {
            AnonymousClass003.A0u(context, agentWidget);
            F3R.A02(context).A0A(FGI.A0M(AgentWidgetRefreshWorkerKt.WORK_NAME_PREFIX, agentWidget.getKey()));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // com.facebook.aura.widgets.WidgetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWidgetWork(X.HtJ<? super X.C77S> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.AgentWidgetRefreshWorker.AnonymousClass1
            if (r0 == 0) goto L85
            r5 = r9
            com.facebook.aura.widgets.AgentWidgetRefreshWorker$doWidgetWork$1 r5 = (com.facebook.aura.widgets.AgentWidgetRefreshWorker.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 != r6) goto L8b
            X.Hwg.A00(r1)
        L20:
            X.77i r4 = new X.77i
            r4.<init>()
            return r4
        L26:
            X.Hwg.A00(r1)
            androidx.work.WorkerParameters r0 = r8.mWorkerParams
            X.BzB r1 = r0.A01
            java.lang.String r0 = "widget"
            java.lang.String r7 = r1.A01(r0)
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.facebook.aura.widgets.AgentWidget
            if (r0 == 0) goto L3d
            r3.add(r1)
            goto L3d
        L4f:
            java.util.Iterator r1 = r3.iterator()
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r3 = r1.next()
            r0 = r3
            com.facebook.aura.widgets.AgentWidget r0 = (com.facebook.aura.widgets.AgentWidget) r0
            java.lang.String r0 = r0.getKey()
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L53
        L6a:
            com.facebook.aura.widgets.AgentWidget r3 = (com.facebook.aura.widgets.AgentWidget) r3
            if (r3 == 0) goto L20
            com.facebook.aura.widgets.AgentWidgetRefresher r2 = com.facebook.aura.widgets.AgentWidgetRefresher.INSTANCE
            android.content.Context r1 = r8.mAppContext
            X.C7384Etj.A0U(r1)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r6
            java.lang.Object r0 = r2.refresh(r1, r3, r5)
            if (r0 != r4) goto L20
            return r4
        L83:
            r3 = 0
            goto L6a
        L85:
            com.facebook.aura.widgets.AgentWidgetRefreshWorker$doWidgetWork$1 r5 = new com.facebook.aura.widgets.AgentWidgetRefreshWorker$doWidgetWork$1
            r5.<init>(r9)
            goto L12
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.AgentWidgetRefreshWorker.doWidgetWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentWidgetRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
