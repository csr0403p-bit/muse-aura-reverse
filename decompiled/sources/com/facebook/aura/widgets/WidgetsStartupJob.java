package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C60P;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class WidgetsStartupJob implements SessionedStartupJob {
    public static final int $stable = 0;
    public static final WidgetsStartupJob INSTANCE = new WidgetsStartupJob();

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetsStartupJob$disableWidgets$2", f = "WidgetsStartupJob.kt", l = {61, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 68, 69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetsStartupJob$disableWidgets$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<HomeScreenWidget> $widgets;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.WidgetsStartupJob$disableWidgets$2$1", f = "WidgetsStartupJob.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.WidgetsStartupJob$disableWidgets$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$context = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$context, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                WidgetPeriodicRefreshWorker.Companion.cancel(this.$context);
                WidgetSessionReconcileWorker.Companion.cancel(this.$context);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends HomeScreenWidget> list, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$widgets = list;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$widgets, this.$context, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c6 -> B:9:0x0025). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetsStartupJob.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetsStartupJob", f = "WidgetsStartupJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 48, 50}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetsStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetsStartupJob.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetsStartupJob$execute$3", f = "WidgetsStartupJob.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetsStartupJob$execute$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, HtJ<? super AnonymousClass3> htJ) {
            super(1, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return new AnonymousClass3(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            WidgetInventory.INSTANCE.log(this.$context);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetsStartupJob$execute$4", f = "WidgetsStartupJob.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetsStartupJob$execute$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, HtJ<? super AnonymousClass4> htJ) {
            super(1, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass4(this.$context, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return new AnonymousClass4(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                WidgetPreviews widgetPreviews = WidgetPreviews.INSTANCE;
                Context context = this.$context;
                this.label = 1;
                if (widgetPreviews.publishIfNeeded(context, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object disableWidgets(Context context, List<? extends HomeScreenWidget> list, HtJ<? super Unit> htJ) {
        return C3cG.A0U(WidgetContentLock.INSTANCE.exclusive(new AnonymousClass2(list, context, null), htJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.facebook.aura.widgets.WidgetsStartupJob] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.widgets.WidgetsStartupJob.AnonymousClass1
            if (r0 == 0) goto Ld6
            r8 = r3
            com.facebook.aura.widgets.WidgetsStartupJob$execute$1 r8 = (com.facebook.aura.widgets.WidgetsStartupJob.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld6
            int r2 = r2 - r1
            r8.label = r2
        L14:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r9 = 0
            java.lang.String r6 = "WidgetsStartupJob"
            r5 = 3
            r10 = 2
            r12 = 1
            if (r0 == 0) goto L2e
            if (r0 == r12) goto L84
            if (r0 == r10) goto Laa
            if (r0 != r5) goto Ldd
            X.Hwg.A00(r1)
        L2b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.common.appcontext.AuraAppContext r0 = com.facebook.aura.common.appcontext.AuraAppContext.INSTANCE
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L2b
            com.facebook.aura.widgets.WidgetsGate r0 = com.facebook.aura.widgets.WidgetsGate.INSTANCE
            boolean r4 = r0.isEnabled()
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.ArrayList r11 = X.C3cG.A0h()
            java.util.Iterator r13 = r0.iterator()
        L4d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r13.next()
            r0 = r1
            com.facebook.aura.widgets.HomeScreenWidget r0 = (com.facebook.aura.widgets.HomeScreenWidget) r0
            if (r4 == 0) goto L66
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L66
            r3.add(r1)
            goto L4d
        L66:
            r11.add(r1)
            goto L4d
        L6a:
            java.util.List r0 = r14.componentsNotIn(r2, r3, r12)
            r14.setComponentState(r2, r0, r12)
            r8.L$0 = r9
            r8.L$1 = r2
            r8.L$2 = r3
            r8.L$3 = r9
            r8.Z$0 = r4
            r8.label = r12
            java.lang.Object r0 = r14.disableWidgets(r2, r11, r8)
            if (r0 != r7) goto L90
            return r7
        L84:
            boolean r4 = r8.Z$0
            java.lang.Object r3 = r8.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r8.L$1
            android.content.Context r2 = X.C60P.A02(r0, r1)
        L90:
            com.facebook.aura.widgets.WidgetsStartupJob$execute$3 r1 = new com.facebook.aura.widgets.WidgetsStartupJob$execute$3
            r1.<init>(r2, r9)
            r8.L$0 = r9
            r8.L$1 = r2
            r8.L$2 = r3
            r8.L$3 = r9
            r8.Z$0 = r4
            r8.label = r10
            java.lang.String r0 = "log widget inventory"
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r6, r0, r1, r8)
            if (r0 != r7) goto Lb6
            return r7
        Laa:
            boolean r4 = r8.Z$0
            java.lang.Object r3 = r8.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r8.L$1
            android.content.Context r2 = X.C60P.A02(r0, r1)
        Lb6:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2b
            com.facebook.aura.widgets.WidgetsStartupJob$execute$4 r1 = new com.facebook.aura.widgets.WidgetsStartupJob$execute$4
            r1.<init>(r2, r9)
            r8.L$0 = r9
            r8.L$1 = r9
            r8.L$2 = r9
            r8.L$3 = r9
            r8.Z$0 = r4
            r8.label = r5
            java.lang.String r0 = "publish previews"
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r6, r0, r1, r8)
            if (r0 != r7) goto L2b
            return r7
        Ld6:
            com.facebook.aura.widgets.WidgetsStartupJob$execute$1 r8 = new com.facebook.aura.widgets.WidgetsStartupJob$execute$1
            r8.<init>(r3)
            goto L14
        Ldd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetsStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.HOME_SCREEN_WIDGETS_SETUP;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComponentName> componentsNotIn(Context context, List<? extends HomeScreenWidget> list, boolean z) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends HomeScreenWidget> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().getComponents(), arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (WidgetsGate.INSTANCE.isComponentEnabled(context, (Class) obj) != z) {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
        Iterator it2 = arrayListA0h2.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(new ComponentName(context, (Class<?>) it2.next()));
        }
        return arrayListA0i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setComponentState(Context context, List<ComponentName> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        int i = z ? 1 : 2;
        CFK.A05(WidgetsStartupJobKt.TAG, FGI.A0r("Setting home screen widget components enabled=", z));
        Iterator<ComponentName> it = list.iterator();
        while (it.hasNext()) {
            context.getPackageManager().setComponentEnabledSetting(it.next(), i, 1);
        }
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.HOME_SCREEN_WIDGETS_SETUP;
    }
}
