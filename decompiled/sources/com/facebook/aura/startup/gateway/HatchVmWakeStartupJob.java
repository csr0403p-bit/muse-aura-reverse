package com.facebook.aura.startup.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.user.provider.AuraUserDataFetchState;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchVmWakeStartupJob implements SessionedStartupJob {
    public static final HatchVmWakeStartupJob INSTANCE = new HatchVmWakeStartupJob();

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob", f = "HatchVmWakeStartupJob.kt", l = {93}, m = "awaitNetworkDecision", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$1, reason: invalid class name */
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
            return HatchVmWakeStartupJob.this.awaitNetworkDecision(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$2", f = "HatchVmWakeStartupJob.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<AuraNetworkState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(AuraNetworkState auraNetworkState, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = auraNetworkState;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.network.state.AuraNetworkState r1 = (com.facebook.aura.network.state.AuraNetworkState) r1
                int r0 = r2.label
                if (r0 != 0) goto L1c
                X.Hwg.A00(r3)
                boolean r0 = r1 instanceof com.facebook.aura.network.state.AuraNetworkState.Online
                if (r0 == 0) goto L16
                com.facebook.aura.network.state.AuraNetworkState$Online r1 = (com.facebook.aura.network.state.AuraNetworkState.Online) r1
                boolean r1 = r1.isValidated
                r0 = 1
                if (r1 != 0) goto L17
            L16:
                r0 = 0
            L17:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob", f = "HatchVmWakeStartupJob.kt", l = {86, 89}, m = "awaitValidatedNetwork", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$1, reason: invalid class name and case insensitive filesystem */
    public final class C140091 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C140091(HtJ<? super C140091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmWakeStartupJob.this.awaitValidatedNetwork(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$2", f = "HatchVmWakeStartupJob.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$2, reason: invalid class name and case insensitive filesystem */
    public final class C140102 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C140102(HtJ<? super C140102> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140102(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C140102(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmWakeStartupJob hatchVmWakeStartupJob = HatchVmWakeStartupJob.INSTANCE;
                this.label = 1;
                obj = hatchVmWakeStartupJob.awaitNetworkDecision(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$3", f = "HatchVmWakeStartupJob.kt", l = {89}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmWakeStartupJob hatchVmWakeStartupJob = HatchVmWakeStartupJob.INSTANCE;
                this.label = 1;
                obj = hatchVmWakeStartupJob.awaitNetworkDecision(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.gateway.HatchVmWakeStartupJob", f = "HatchVmWakeStartupJob.kt", l = {61, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 74}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C140111 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C140111(HtJ<? super C140111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmWakeStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            r3 = r13
            boolean r0 = r13 instanceof com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.C140111
            if (r0 == 0) goto Lc5
            r13 = r3
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$execute$1 r13 = (com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.C140111) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r13.label = r2
        L13:
            java.lang.Object r1 = r13.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r4 = 3
            r7 = 2
            java.lang.String r6 = "HatchVmWakeStartupJob"
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L55
            if (r0 == r7) goto L88
            if (r0 != r4) goto Lcc
            X.Hwg.A00(r1)
        L29:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r0 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            java.lang.Object r1 = X.C60P.A1J(r0, r12)
            com.facebook.aura.user.provider.AuraUserData r1 = (com.facebook.aura.user.provider.AuraUserData) r1
            if (r1 == 0) goto Lbe
            java.lang.Boolean r0 = r1.hasProvisionedVm
            boolean r0 = X.AnonymousClass002.A1b(r0, r3)
            if (r0 == 0) goto Lbe
            boolean r0 = r1.isChatCapable()
            if (r0 == 0) goto Lbe
            r13.L$0 = r12
            r0 = 0
            r13.L$1 = r0
            r13.label = r3
            java.lang.Object r1 = r11.awaitValidatedNetwork(r13)
            if (r1 != r2) goto L5b
            return r2
        L55:
            java.lang.Object r0 = r13.L$0
            X.CGz r12 = X.C60O.A0D(r0, r1)
        L5b:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L64
            java.lang.String r0 = "Wake skipped: validated network unavailable"
            goto Lc0
        L64:
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r5 = X.C3cG.A0D(r12)
            java.lang.String r0 = X.C3cG.A0a(r5)
            if (r0 == 0) goto L74
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L8f
        L74:
            com.facebook.aura.gateway.HatchVmRepository r3 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            com.facebook.aura.gateway.VmFetchSource r1 = com.facebook.aura.gateway.VmFetchSource.STARTUP_JOB
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r5
            r13.label = r7
            java.lang.Object r0 = r3.fetchAndCacheExistingVm(r12, r1, r13)
            if (r0 != r2) goto L8f
            return r2
        L88:
            java.lang.Object r5 = r13.L$2
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r5 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r5
            X.Hwg.A00(r1)
        L8f:
            java.lang.String r7 = X.C3cG.A0a(r5)
            if (r7 == 0) goto Lbb
            boolean r0 = X.C7BY.A0j(r7)
            if (r0 != 0) goto Lbb
            com.facebook.aura.gateway.HatchVmWakeApi r6 = com.facebook.aura.gateway.HatchVmWakeApi.INSTANCE
            java.util.UUID r0 = X.AbstractC7535F0i.A00()
            java.lang.String r9 = r0.toString()
            com.facebook.aura.gateway.HatchVmWakeTrigger r10 = com.facebook.aura.gateway.HatchVmWakeTrigger.STARTUP
            r11 = 0
            r13.L$0 = r11
            r13.L$1 = r11
            r13.L$2 = r11
            r13.L$3 = r11
            r13.label = r4
            r8 = -1
            r12 = r11
            java.lang.Object r0 = r6.wakeVm(r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r2) goto L29
            return r2
        Lbb:
            java.lang.String r0 = "Wake skipped: no VM id after credential resolution"
            goto Lc0
        Lbe:
            java.lang.String r0 = "Wake skipped: VM not ready for startup wake"
        Lc0:
            X.CFK.A05(r6, r0)
            goto L29
        Lc5:
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$execute$1 r13 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$execute$1
            r13.<init>(r3)
            goto L13
        Lcc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitNetworkDecision(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.AnonymousClass1
            if (r0 == 0) goto L3b
            r5 = r7
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$1 r5 = (com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 != r3) goto L41
            X.Hwg.A00(r0)
        L20:
            boolean r0 = r0 instanceof com.facebook.aura.network.state.AuraNetworkState.Online
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L27:
            X.Hwg.A00(r0)
            X.1BN<com.facebook.aura.network.state.AuraNetworkState> r2 = com.facebook.aura.network.state.AuraNetworkMonitor.state
            r1 = 0
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$2 r0 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$2
            r0.<init>(r1)
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L20
            return r4
        L3b:
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$1 r5 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitNetworkDecision$1
            r5.<init>(r7)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.awaitNetworkDecision(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitValidatedNetwork(X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.C140091
            if (r0 == 0) goto L84
            r5 = r8
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$1 r5 = (com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.C140091) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r8 = 2
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 == r6) goto L54
            if (r0 != r8) goto L8a
            X.Hwg.A00(r1)
        L23:
            boolean r6 = X.C3cG.A1P(r1, r6)
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L2c:
            X.Hwg.A00(r1)
            X.1BN<com.facebook.aura.network.state.AuraNetworkState> r0 = com.facebook.aura.network.state.AuraNetworkMonitor.state
            java.lang.Object r4 = r0.getValue()
            com.facebook.aura.network.state.AuraNetworkState r4 = (com.facebook.aura.network.state.AuraNetworkState) r4
            boolean r0 = r4 instanceof com.facebook.aura.network.state.AuraNetworkState.Online
            r3 = 0
            r1 = 5000(0x1388, double:2.4703E-320)
            if (r0 == 0) goto L5f
            com.facebook.aura.network.state.AuraNetworkState$Online r4 = (com.facebook.aura.network.state.AuraNetworkState.Online) r4
            boolean r0 = r4.isValidated
            if (r0 != 0) goto L27
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$2 r0 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$2
            r0.<init>(r3)
            r5.L$0 = r3
            r5.label = r6
            java.lang.Object r1 = X.GAX.A01(r5, r0, r1)
            if (r1 != r7) goto L57
            return r7
        L54:
            X.Hwg.A00(r1)
        L57:
            boolean r0 = X.C3cG.A1P(r1, r6)
            if (r0 != 0) goto L27
            r6 = 0
            goto L27
        L5f:
            com.facebook.aura.network.state.AuraNetworkState$Offline r0 = com.facebook.aura.network.state.AuraNetworkState.Offline.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 != 0) goto L74
            com.facebook.aura.network.state.AuraNetworkState$Unknown r0 = com.facebook.aura.network.state.AuraNetworkState.Unknown.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 != 0) goto L74
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L74:
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$3 r0 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$3
            r0.<init>(r3)
            r5.L$0 = r3
            r5.label = r8
            java.lang.Object r1 = X.GAX.A01(r5, r0, r1)
            if (r1 != r7) goto L23
            return r7
        L84:
            com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$1 r5 = new com.facebook.aura.startup.gateway.HatchVmWakeStartupJob$awaitValidatedNetwork$1
            r5.<init>(r8)
            goto L12
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.gateway.HatchVmWakeStartupJob.awaitValidatedNetwork(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return AuraUserDataFetchState.INSTANCE.isFirstFetchPending() ? Collections.singletonList(AppJobId.FETCH_USER_DATA) : C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.WAKE_VM;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_CRITICAL_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.EveryResume.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.WAKE_VM;
    }
}
