package com.facebook.aura.survey;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchSurveyController implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final String TAG = "HatchSurveyController";
    public static volatile HatchSurveyPage firstPage;
    public static boolean hasAttempted;
    public static long sessionGeneration;
    public static final HatchSurveyController INSTANCE = new HatchSurveyController();
    public static final Object stateLock = C3cG.A0T();
    public static final C3UX scope = C78T.A01(AnonymousClass001.A0y(), null);

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveyController", f = "HatchSurveyController.kt", l = {55}, m = "maybeStart", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveyController$maybeStart$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSurveyController.this.maybeStart(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveyController$onDismissed$1", f = "HatchSurveyController.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveyController$onDismissed$1, reason: invalid class name and case insensitive filesystem */
    public final class C142251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C142251(HtJ<? super C142251> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C142251(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C142251(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSurveyApi hatchSurveyApi = HatchSurveyApi.INSTANCE;
                this.label = 1;
                if (hatchSurveyApi.dismiss(this) == enumC10460Hji) {
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

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        synchronized (stateLock) {
            sessionGeneration++;
            hasAttempted = false;
            firstPage = null;
        }
    }

    public final HatchSurveyPage getFirstPage() {
        return firstPage;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object maybeStart(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.survey.HatchSurveyController.AnonymousClass1
            if (r0 == 0) goto L59
            r6 = r8
            com.facebook.aura.survey.HatchSurveyController$maybeStart$1 r6 = (com.facebook.aura.survey.HatchSurveyController.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L75
            long r1 = r6.J$0
            X.Hwg.A00(r5)
        L22:
            com.facebook.aura.survey.HatchSurveyStartResult r5 = (com.facebook.aura.survey.HatchSurveyStartResult) r5
            if (r5 == 0) goto L8a
            com.facebook.aura.survey.HatchSurveyPage r6 = r5.page
            boolean r0 = r5.show
            if (r0 == 0) goto L8a
            if (r6 == 0) goto L8a
            java.lang.Object r5 = com.facebook.aura.survey.HatchSurveyController.stateLock
            monitor-enter(r5)
            goto L5f
        L32:
            X.Hwg.A00(r5)
            java.lang.Object r5 = com.facebook.aura.survey.HatchSurveyController.stateLock
            monitor-enter(r5)
            boolean r0 = com.facebook.aura.survey.HatchSurveyController.hasAttempted     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L3f
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8d
            goto L7a
        L3f:
            com.facebook.aura.survey.HatchSurveyController.hasAttempted = r3     // Catch: java.lang.Throwable -> L8d
            long r1 = com.facebook.aura.survey.HatchSurveyController.sessionGeneration     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r5)
            com.facebook.aura.survey.HatchSurveyMC r0 = com.facebook.aura.survey.HatchSurveyMC.INSTANCE
            boolean r0 = r0.isSurveyEnabled()
            if (r0 == 0) goto L8a
            com.facebook.aura.survey.HatchSurveyApi r0 = com.facebook.aura.survey.HatchSurveyApi.INSTANCE
            r6.J$0 = r1
            r6.label = r3
            java.lang.Object r5 = r0.start(r6)
            if (r5 != r4) goto L22
            return r4
        L59:
            com.facebook.aura.survey.HatchSurveyController$maybeStart$1 r6 = new com.facebook.aura.survey.HatchSurveyController$maybeStart$1
            r6.<init>(r8)
            goto L12
        L5f:
            long r3 = com.facebook.aura.survey.HatchSurveyController.sessionGeneration     // Catch: java.lang.Throwable -> L8d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8d
            goto L7a
        L68:
            com.facebook.aura.survey.HatchSurveyController.firstPage = r6     // Catch: java.lang.Throwable -> L8d
            com.facebook.aura.navigation.effect.api.NavigationEffectApi r3 = com.facebook.aura.navigation.effect.api.NavigationEffectApi.INSTANCE     // Catch: java.lang.Throwable -> L8d
            com.facebook.aura.navigation.key.HatchSurveySheetKey r2 = com.facebook.aura.navigation.key.HatchSurveySheetKey.INSTANCE     // Catch: java.lang.Throwable -> L8d
            com.facebook.aura.navigation.LaunchFlag r1 = com.facebook.aura.navigation.LaunchFlag.NAVIGATE     // Catch: java.lang.Throwable -> L8d
            r0 = 0
            r3.navigateTo(r2, r1, r0)     // Catch: java.lang.Throwable -> L8d
            goto L7c
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7a:
            monitor-exit(r5)
            return r4
        L7c:
            monitor-exit(r5)
            java.lang.String r2 = "HatchSurveyController"
            java.lang.String r1 = r6.pageId
            java.lang.String r0 = "survey eligible, requesting page "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.CFK.A05(r2, r0)
        L8a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L8d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.survey.HatchSurveyController.maybeStart(X.HtJ):java.lang.Object");
    }

    public final void onDismissed(HatchSurveyPage hatchSurveyPage, boolean z) {
        synchronized (stateLock) {
            if (firstPage != hatchSurveyPage) {
                return;
            }
            boolean zA1X = AnonymousClass002.A1X(hatchSurveyPage);
            firstPage = null;
            boolean z2 = zA1X && !z;
            if (z2) {
                AnonymousClass001.A1J(new C142251(null), scope);
            }
        }
    }
}
