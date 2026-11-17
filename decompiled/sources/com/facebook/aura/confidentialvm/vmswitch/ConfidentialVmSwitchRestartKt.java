package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.app.ActivityManager;
import android.content.Intent;
import com.facebook.aura.common.restart.HatchAppRestarter;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.logout.AuraLogoutHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmSwitchRestartKt {
    public static final long ANALYTICS_FLUSH_GRACE_MS = 1000;
    public static final String RESTART_REASON = "Confidential VM switch";

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt", f = "ConfidentialVmSwitchRestart.kt", l = {23, 24}, m = "restartIntoSwitchedVm", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$2", f = "ConfidentialVmSwitchRestart.kt", l = {23}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(1000L, this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$3", f = "ConfidentialVmSwitchRestart.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List<ActivityManager.AppTask> appTasks;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
                if (AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
                    HatchAppRestarter hatchAppRestarter = HatchAppRestarter.INSTANCE;
                    Intent intentLaunchIntent = hatchAppRestarter.launchIntent(null);
                    hatchAppRestarter.relaunchApp(ConfidentialVmSwitchRestartKt.RESTART_REASON, null, intentLaunchIntent != null ? intentLaunchIntent.addFlags(32768) : null, true);
                } else {
                    ActivityManager activityManager = (ActivityManager) C3cG.A06().getSystemService(ActivityManager.class);
                    if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
                        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                        while (it.hasNext()) {
                            try {
                                it.next().finishAndRemoveTask();
                            } catch (Throwable th) {
                                C3cG.A0s(th);
                            }
                        }
                    }
                    HatchAppRestarter.INSTANCE.exitApp("Expected application exit: Confidential VM switch in the background");
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = c3ux;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object restartIntoSwitchedVm(X.HtJ<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt.AnonymousClass1
            if (r0 == 0) goto L5f
            r6 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$1 r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L46
            if (r0 != r3) goto L65
            X.Hwg.A00(r1)
        L24:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L27:
            X.Hwg.A00(r1)
            r0 = 65550(0x1000e, float:9.1855E-41)
            java.lang.Object r0 = X.C5246DeB.A00(r0)
            com.facebook.aura.analytics.impl.MetaAnalyticsInstance r0 = (com.facebook.aura.analytics.impl.MetaAnalyticsInstance) r0
            r0.triggerUploadNow()
            X.HwK r1 = X.HwK.A00
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$2 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$2
            r0.<init>(r4)
            r6.label = r2
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)
            if (r0 != r5) goto L49
            return r5
        L46:
            X.Hwg.A00(r1)
        L49:
            X.GB9 r1 = com.facebook.aura.executors.AuraDispatchers.main
            X.HwK r0 = X.HwK.A00
            X.78T r1 = X.C78W.A02(r1, r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$3 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$3
            r0.<init>(r4)
            r6.label = r3
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)
            if (r0 != r5) goto L24
            return r5
        L5f:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$1 r6 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt$restartIntoSwitchedVm$1
            r6.<init>(r7)
            goto L12
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(X.HtJ):java.lang.Object");
    }
}
