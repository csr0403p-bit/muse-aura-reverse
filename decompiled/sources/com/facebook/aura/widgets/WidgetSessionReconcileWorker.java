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
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WidgetSessionReconcileWorker extends WidgetWorker {
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetWorker.$stable;

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconcileWorker", f = "WidgetSessionReconcileWorker.kt", l = {21, 23}, m = "doWidgetWork", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconcileWorker$doWidgetWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionReconcileWorker.this.doWidgetWork(this);
        }
    }

    public final class Companion {
        public final void cancel(Context context) {
            C7384Etj.A0Y(context, 0);
            F3R.A02(context).A0A(WidgetSessionReconcileWorkerKt.WORK_NAME);
        }

        public final void enqueueSignedOut(Context context) {
            C7384Etj.A0Y(context, 0);
            enqueue(context, C7yC.A05, true);
        }

        private final void enqueue(Context context, C7yC c7yC, boolean z) {
            EK5 ek5A02 = F3R.A02(context);
            F1d f1d = new F1d(WidgetSessionReconcileWorker.class);
            f1d.A03(C60S.A01(C3cG.A0r(WidgetSessionReconcileWorkerKt.KEY_SIGNED_OUT, Boolean.valueOf(z))));
            ek5A02.A04(c7yC, f1d.A01(), WidgetSessionReconcileWorkerKt.WORK_NAME);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final void enqueue(Context context) {
            C7384Etj.A0Y(context, 0);
            enqueue(context, C7yC.A04, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // com.facebook.aura.widgets.WidgetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWidgetWork(X.HtJ<? super X.C77S> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.widgets.WidgetSessionReconcileWorker.AnonymousClass1
            if (r0 == 0) goto L25
            r6 = r8
            com.facebook.aura.widgets.WidgetSessionReconcileWorker$doWidgetWork$1 r6 = (com.facebook.aura.widgets.WidgetSessionReconcileWorker.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L59
            if (r0 == r4) goto L59
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L25:
            com.facebook.aura.widgets.WidgetSessionReconcileWorker$doWidgetWork$1 r6 = new com.facebook.aura.widgets.WidgetSessionReconcileWorker$doWidgetWork$1
            r6.<init>(r8)
            goto L12
        L2b:
            X.Hwg.A00(r1)
            androidx.work.WorkerParameters r0 = r7.mWorkerParams
            X.BzB r1 = r0.A01
            java.lang.String r0 = "signed_out"
            r2 = 0
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L4b
            com.facebook.aura.widgets.WidgetSessionReconciler r1 = com.facebook.aura.widgets.WidgetSessionReconciler.INSTANCE
            android.content.Context r0 = r7.mAppContext
            X.C7384Etj.A0U(r0)
            r6.label = r3
            java.lang.Object r0 = r1.reconcileAfterSignOut(r0, r6)
        L48:
            if (r0 != r5) goto L5c
            return r5
        L4b:
            com.facebook.aura.widgets.WidgetSessionReconciler r1 = com.facebook.aura.widgets.WidgetSessionReconciler.INSTANCE
            android.content.Context r0 = r7.mAppContext
            X.C7384Etj.A0U(r0)
            r6.label = r4
            java.lang.Object r0 = r1.reconcile(r0, r2, r6)
            goto L48
        L59:
            X.Hwg.A00(r1)
        L5c:
            X.77i r5 = new X.77i
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionReconcileWorker.doWidgetWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSessionReconcileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
