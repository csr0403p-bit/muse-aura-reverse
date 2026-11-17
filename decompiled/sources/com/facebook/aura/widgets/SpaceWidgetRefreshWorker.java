package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60R;
import X.C7384Etj;
import X.C7yC;
import X.EK5;
import X.F1d;
import X.F3R;
import X.FGI;
import X.HtJ;
import X.HxE;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceWidgetRefreshWorker extends WidgetWorker {
    public static final Companion Companion = new Companion();
    public static final int $stable = WidgetWorker.$stable;

    public final class Companion {
        public final void cancel(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            EK5 ek5A02 = F3R.A02(context);
            ek5A02.A0A(FGI.A0H(SpaceWidgetRefreshWorkerKt.WORK_NAME_PREFIX, i));
            ek5A02.A0A(FGI.A0H(SpaceWidgetRefreshWorkerKt.RESIZE_WORK_NAME_PREFIX, i));
        }

        public final void cancelAll(Context context) {
            C7384Etj.A0Y(context, 0);
            F3R.A02(context).A09(SpaceWidgetRefreshWorkerKt.WORK_TAG);
        }

        public final void enqueue(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            enqueue(context, SpaceWidgetRefreshWorkerKt.WORK_NAME_PREFIX, i, C7yC.A04, 0L, false, null);
        }

        public final void enqueueAfterResize(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            enqueue(context, SpaceWidgetRefreshWorkerKt.RESIZE_WORK_NAME_PREFIX, i, C7yC.A05, 800L, true, null);
        }

        public final void enqueueSelection(Context context, int i, String str, String str2) {
            AnonymousClass005.A11(context, str, str2, 0);
            enqueue(context, SpaceWidgetRefreshWorkerKt.WORK_NAME_PREFIX, i, C7yC.A05, 0L, false, C3cG.A0r(str, str2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void enqueue$default(Companion companion, Context context, String str, int i, C7yC c7yC, long j, boolean z, HxE hxE, int i2, Object obj) {
            if ((i2 & 64) != 0) {
                hxE = null;
            }
            companion.enqueue(context, str, i, c7yC, j, z, hxE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        private final void enqueue(Context context, String str, int i, C7yC c7yC, long j, boolean z, HxE<String, String> hxE) {
            String str2;
            F1d f1d = new F1d(SpaceWidgetRefreshWorker.class);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            linkedHashMapA0j.put("appWidgetId", Integer.valueOf(i));
            linkedHashMapA0j.put(SpaceWidgetRefreshWorkerKt.KEY_ONLY_IF_RESIZED, Boolean.valueOf(z));
            String str3 = null;
            if (hxE != null) {
                str2 = hxE.first;
            } else {
                str2 = null;
            }
            linkedHashMapA0j.put(SpaceWidgetRefreshWorkerKt.KEY_SLUG, str2);
            if (hxE != null) {
                str3 = hxE.second;
            }
            f1d.A03(C60R.A0J("title", str3, linkedHashMapA0j));
            f1d.A02(j, TimeUnit.MILLISECONDS);
            f1d.A02.add(SpaceWidgetRefreshWorkerKt.WORK_TAG);
            F3R.A02(context).A04(c7yC, f1d.A01(), FGI.A0H(str, i));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetRefreshWorker", f = "SpaceWidgetRefreshWorker.kt", l = {33, 35}, m = "doWidgetWork", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetRefreshWorker$doWidgetWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
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
            return SpaceWidgetRefreshWorker.this.doWidgetWork(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    @Override // com.facebook.aura.widgets.WidgetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWidgetWork(X.HtJ<? super X.C77S> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.widgets.SpaceWidgetRefreshWorker.AnonymousClass1
            if (r0 == 0) goto La7
            r9 = r3
            com.facebook.aura.widgets.SpaceWidgetRefreshWorker$doWidgetWork$1 r9 = (com.facebook.aura.widgets.SpaceWidgetRefreshWorker.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r9.label = r2
        L14:
            java.lang.Object r1 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r4 = 0
            r3 = 2
            r14 = 1
            if (r0 == 0) goto L2c
            if (r0 == r14) goto L7f
            if (r0 != r3) goto Lae
            X.Hwg.A00(r1)
        L26:
            X.77i r2 = new X.77i
            r2.<init>()
            return r2
        L2c:
            X.Hwg.A00(r1)
            androidx.work.WorkerParameters r0 = r15.mWorkerParams
            X.BzB r0 = r0.A01
            java.lang.String r1 = "appWidgetId"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L44
            r4 = r1
        L44:
            int r6 = X.AnonymousClass001.A0F(r4)
            if (r6 != 0) goto L50
            X.77j r2 = new X.77j
            r2.<init>()
            return r2
        L50:
            androidx.work.WorkerParameters r0 = r15.mWorkerParams
            X.BzB r1 = r0.A01
            java.lang.String r0 = "slug"
            java.lang.String r7 = r1.A01(r0)
            androidx.work.WorkerParameters r0 = r15.mWorkerParams
            X.BzB r1 = r0.A01
            java.lang.String r0 = "title"
            java.lang.String r8 = r1.A01(r0)
            if (r7 == 0) goto L84
            if (r8 == 0) goto L84
            com.facebook.aura.widgets.SpaceWidgetRefresher r4 = com.facebook.aura.widgets.SpaceWidgetRefresher.INSTANCE
            android.content.Context r5 = r15.mAppContext
            X.C7384Etj.A0U(r5)
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.I$0 = r6
            r9.label = r14
            java.lang.Object r0 = r4.saveSelection(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L84
            return r2
        L7f:
            int r6 = r9.I$0
            X.Hwg.A00(r1)
        L84:
            com.facebook.aura.widgets.SpaceWidgetRefresher r10 = com.facebook.aura.widgets.SpaceWidgetRefresher.INSTANCE
            android.content.Context r11 = r15.mAppContext
            X.C7384Etj.A0U(r11)
            androidx.work.WorkerParameters r0 = r15.mWorkerParams
            X.BzB r1 = r0.A01
            java.lang.String r0 = "only_if_resized"
            boolean r13 = r1.A02(r0)
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.I$0 = r6
            r9.label = r3
            r12 = r6
            r15 = r9
            java.lang.Object r0 = r10.refresh(r11, r12, r13, r14, r15)
            if (r0 != r2) goto L26
            return r2
        La7:
            com.facebook.aura.widgets.SpaceWidgetRefreshWorker$doWidgetWork$1 r9 = new com.facebook.aura.widgets.SpaceWidgetRefreshWorker$doWidgetWork$1
            r9.<init>(r3)
            goto L14
        Lae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetRefreshWorker.doWidgetWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceWidgetRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
