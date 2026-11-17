package com.facebook.aura.permissions.defaults;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.C9258GBl;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class PermissionSettingsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String TAG = "PermissionSettingsRepository";
    public final C1BN<ConfidentialVmSettings> confidentialVmSettings;
    public final SingleFlight fetchSingleFlight;
    public final BLG<LoadedConfidentialVm> loadedConfidentialVm;
    public final BLG<Map<String, Boolean>> pendingConfidentialVmModes;
    public final InterfaceC2261BLa requestLock;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository", f = "PermissionSettingsRepository.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "fetchConnectorDefault", v = 2)
    /* renamed from: com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$1, reason: invalid class name */
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
            return PermissionSettingsRepository.this.fetchConnectorDefault(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$2", f = "PermissionSettingsRepository.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends PermissionSettings>>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PermissionSettingsRepository.this.new AnonymousClass2(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<PermissionSettings>> htJ) {
            return PermissionSettingsRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1850fetchIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PermissionSettingsRepository permissionSettingsRepository = PermissionSettingsRepository.this;
                this.label = 1;
                objM1850fetchIoAF18A = permissionSettingsRepository.m1850fetchIoAF18A(this);
                if (objM1850fetchIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1850fetchIoAF18A = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1850fetchIoAF18A);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends PermissionSettings>> htJ) {
            return invoke2(c3ux, (HtJ<? super HsJ<PermissionSettings>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository", f = "PermissionSettingsRepository.kt", l = {139}, m = "setConfidentialVmAllowed", v = 2)
    /* renamed from: com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$1, reason: invalid class name and case insensitive filesystem */
    public final class C134381 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C134381(HtJ<? super C134381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionSettingsRepository.this.setConfidentialVmAllowed(null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setConfidentialVmAllowed(com.facebook.aura.permissions.defaults.ConfidentialVmToggle r12, boolean r13, X.HtJ<? super com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome> r14) {
        /*
            r11 = this;
            r3 = r14
            r10 = r12
            boolean r0 = r14 instanceof com.facebook.aura.permissions.defaults.PermissionSettingsRepository.C134381
            r9 = r11
            if (r0 == 0) goto L27
            r5 = r3
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$1 r5 = (com.facebook.aura.permissions.defaults.PermissionSettingsRepository.C134381) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.label = r2
        L15:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto Lbc
            java.lang.Object r12 = r5.L$2
            java.lang.Object r10 = r5.L$0
            com.facebook.aura.permissions.defaults.ConfidentialVmToggle r10 = (com.facebook.aura.permissions.defaults.ConfidentialVmToggle) r10
            goto L75
        L27:
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$1 r5 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$1
            r5.<init>(r14)
            goto L15
        L2d:
            X.Hwg.A00(r0)
            X.BLG<java.util.Map<java.lang.String, java.lang.Boolean>> r8 = r11.pendingConfidentialVmModes
        L32:
            java.lang.Object r7 = r8.getValue()
            r6 = r7
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = r12.key
            boolean r0 = r6.containsKey(r0)
            r2 = r0 ^ 1
            r11 = r13
            if (r2 == 0) goto L4e
            java.lang.String r1 = r12.key
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            java.util.Map r6 = X.AnonymousClass006.A11(r1, r0, r6)
        L4e:
            boolean r0 = r8.A6e(r7, r6)
            if (r0 == 0) goto L32
            if (r2 == 0) goto Lc1
            java.lang.String r12 = r9.getVmId()
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> La5
            r13 = 0
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$result$1 r8 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$setConfidentialVmAllowed$result$1     // Catch: java.lang.Throwable -> La5
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La5
            r5.L$0 = r10     // Catch: java.lang.Throwable -> La5
            r5.L$1 = r13     // Catch: java.lang.Throwable -> La5
            r5.L$2 = r12     // Catch: java.lang.Throwable -> La5
            r5.Z$0 = r11     // Catch: java.lang.Throwable -> La5
            r5.label = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = X.GAo.A00(r5, r0, r8)     // Catch: java.lang.Throwable -> La5
            if (r0 != r4) goto L78
            return r4
        L75:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> La5
        L78:
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r0.value     // Catch: java.lang.Throwable -> La5
            X.BLG<java.util.Map<java.lang.String, java.lang.Boolean>> r3 = r9.pendingConfidentialVmModes
        L7e:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r10.key
            java.util.Map r0 = X.AGH.A09(r0, r1)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 == 0) goto L7e
            boolean r0 = r4 instanceof X.C10571Hud
            if (r0 == 0) goto L98
            com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome r4 = com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome.FAILED
            return r4
        L98:
            java.lang.String r0 = r9.getVmId()
            boolean r0 = X.C7384Etj.areEqual(r12, r0)
            if (r0 == 0) goto Lc1
            com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome r4 = com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome.APPLIED
            return r4
        La5:
            r4 = move-exception
            X.BLG<java.util.Map<java.lang.String, java.lang.Boolean>> r3 = r9.pendingConfidentialVmModes
        La8:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r10.key
            java.util.Map r0 = X.AGH.A09(r0, r1)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 != 0) goto Lc0
            goto La8
        Lbc:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
        Lc0:
            throw r4
        Lc1:
            com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome r4 = com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome.SKIPPED
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository.setConfidentialVmAllowed(com.facebook.aura.permissions.defaults.ConfidentialVmToggle, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: get-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1848getIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.permissions.defaults.PermissionSettings>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$1 r5 = (com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$2 r0 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$1 r5 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$get$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository.m1848getIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getVmId() {
        return C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession);
    }

    /* renamed from: update-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m1849update0E7RQCE$default(PermissionSettingsRepository permissionSettingsRepository, PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDefaultMode = null;
        }
        if ((i & 2) != 0) {
            permissionDefaultMode2 = null;
        }
        return permissionSettingsRepository.m1851update0E7RQCE(permissionDefaultMode, permissionDefaultMode2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfidentialVmSettings withPending(ConfidentialVmSettings confidentialVmSettings, Map<String, Boolean> map) {
        AHD<ConfidentialVmToggle> ahd = confidentialVmSettings.toggles;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        for (ConfidentialVmToggle confidentialVmToggle : ahd) {
            Boolean bool = map.get(confidentialVmToggle.key);
            if (bool != null) {
                ConfidentialVmToggle confidentialVmToggleCopy = confidentialVmToggle.copy(confidentialVmToggle.key, confidentialVmToggle.title, confidentialVmToggle.description, bool.booleanValue(), true);
                if (confidentialVmToggleCopy != null) {
                    confidentialVmToggle = confidentialVmToggleCopy;
                }
            }
            arrayListA0i.add(confidentialVmToggle);
        }
        AHD ahdA07 = AGI.A07(arrayListA0i);
        String str = confidentialVmSettings.heading;
        AnonymousClass003.A0u(str, ahdA07);
        return new ConfidentialVmSettings(str, ahdA07);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: fetch-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1850fetchIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.permissions.defaults.PermissionSettings>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$1 r4 = (com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L24
            goto L41
        L1e:
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$1 r4 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$1
            r4.<init>(r6, r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            X.3UX r2 = r6.scope     // Catch: java.util.concurrent.CancellationException -> L67
            r1 = 0
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$result$1 r0 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$result$1     // Catch: java.util.concurrent.CancellationException -> L67
            r0.<init>(r6, r1)     // Catch: java.util.concurrent.CancellationException -> L67
            X.Hrx r0 = X.AnonymousClass001.A10(r0, r2)     // Catch: java.util.concurrent.CancellationException -> L67
            r4.label = r3     // Catch: java.util.concurrent.CancellationException -> L67
            java.lang.Object r1 = r0.A0E(r4)     // Catch: java.util.concurrent.CancellationException -> L67
            if (r1 != r5) goto L44
            return r5
        L41:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L67
        L44:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1     // Catch: java.util.concurrent.CancellationException -> L67
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result     // Catch: java.util.concurrent.CancellationException -> L67
            if (r0 == 0) goto L53
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1     // Catch: java.util.concurrent.CancellationException -> L67
            T r0 = r1.value     // Catch: java.util.concurrent.CancellationException -> L67
            X.HsJ r0 = (X.HsJ) r0     // Catch: java.util.concurrent.CancellationException -> L67
            java.lang.Object r5 = r0.value     // Catch: java.util.concurrent.CancellationException -> L67
            return r5
        L53:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L67
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L67
            if (r0 == 0) goto L62
            java.lang.String r0 = "SingleFlight Join never skips"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.util.concurrent.CancellationException -> L67
        L61:
            throw r0     // Catch: java.util.concurrent.CancellationException -> L67
        L62:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.util.concurrent.CancellationException -> L67
            goto L61
        L67:
            r0 = move-exception
            X.C3cG.A1H(r4)
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository.m1850fetchIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchConnectorDefault(long r6, X.HtJ<? super com.facebook.aura.permissions.defaults.PermissionDefaultMode> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.permissions.defaults.PermissionSettingsRepository.AnonymousClass1
            if (r0 == 0) goto L39
            r4 = r8
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$1 r4 = (com.facebook.aura.permissions.defaults.PermissionSettingsRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L3f
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.permissions.defaults.PermissionDefaultMode r0 = r5.cachedConnectorDefault()
            return r0
        L25:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$2 r0 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$2
            r0.<init>(r1)
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r0 = X.GAX.A01(r4, r0, r6)
            if (r0 != r3) goto L20
            return r3
        L39:
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$1 r4 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetchConnectorDefault$1
            r4.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository.fetchConnectorDefault(long, X.HtJ):java.lang.Object");
    }

    public final C1BN<ConfidentialVmSettings> getConfidentialVmSettings() {
        return this.confidentialVmSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: update-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1851update0E7RQCE(com.facebook.aura.permissions.defaults.PermissionDefaultMode r7, com.facebook.aura.permissions.defaults.PermissionDefaultMode r8, X.HtJ<? super X.HsJ<com.facebook.aura.permissions.defaults.PermissionSettings>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$1 r5 = (com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$2 r0 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$2
            r0.<init>(r7, r8, r6, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$1 r5 = new com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.permissions.defaults.PermissionSettingsRepository.m1851update0E7RQCE(com.facebook.aura.permissions.defaults.PermissionDefaultMode, com.facebook.aura.permissions.defaults.PermissionDefaultMode, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final PermissionSettingsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (PermissionSettingsRepository) abstractC3358CGz.A03(PermissionSettingsRepository.class, new PermissionSettingsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PermissionSettingsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.fetchSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.requestLock = new C9258GBl();
        HzC hzCA02 = Hxb.A02(C78W.A02(new C8eO(null), AnonymousClass001.A0y()).plus(new PermissionSettingsRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.scope = hzCA02;
        C9286GCn c9286GCnA14 = C3cG.A14(new LoadedConfidentialVm(null, null));
        this.loadedConfidentialVm = c9286GCnA14;
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this.pendingConfidentialVmModes = c9286GCnA01;
        this.confidentialVmSettings = AnonymousClass441.A00(null, hzCA02, C3rb.A00(new PermissionSettingsRepository$confidentialVmSettings$1(this, null), c9286GCnA14, c9286GCnA01, C3cG.A0D(abstractC3358CGz).hatcheryVmIdFlow), C3Ek.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionDefaultsStore getCache() {
        return new PermissionDefaultsStore(getVmId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordConfidentialVm(String str, PermissionSettingsResponseJson permissionSettingsResponseJson) {
        if (C7384Etj.areEqual(str, getVmId())) {
            BLG<LoadedConfidentialVm> blg = this.loadedConfidentialVm;
            ConfidentialVmSettings confidentialVmSettings = permissionSettingsResponseJson.toConfidentialVmSettings();
            if (ConfidentialSessionGate.Companion.getInstance(this.userSession).isStandardVm()) {
                confidentialVmSettings = null;
            }
            AnonymousClass002.A1I(blg, new LoadedConfidentialVm(str, confidentialVmSettings));
        }
    }

    public final PermissionSettings cached() {
        return getCache().read();
    }

    public final PermissionDefaultMode cachedConnectorDefault() {
        PermissionDefaultMode permissionDefaultMode = getCache().read().connectorDefault;
        if (getCache().hasCachedSettings()) {
            return permissionDefaultMode;
        }
        return null;
    }

    public final boolean hasCachedSettings() {
        return getCache().hasCachedSettings();
    }

    public /* synthetic */ PermissionSettingsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
