package com.facebook.aura.vmdisabled;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.G0V;
import X.HtJ;
import X.HzP;
import X.InterfaceC08439ui;
import com.facebook.aura.gateway.HatchVmDisabledStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VmReconnectViewModel extends AEs {
    public final C3Em<Unit> _reconnected;
    public final BLG<VmReconnectUiState> _uiState;
    public final C22I<Unit> reconnected;
    public final HatchVmDisabledStore store;
    public final C1BN<VmReconnectUiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory implements InterfaceC08439ui {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new VmReconnectViewModel(abstractC3358CGz, HatchVmDisabledStore.Companion.getInstance(abstractC3358CGz));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmReconnectViewModel", f = "VmReconnectViewModel.kt", l = {89}, m = "forceConnectGateway", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmReconnectViewModel$forceConnectGateway$1, reason: invalid class name */
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
            return VmReconnectViewModel.this.forceConnectGateway(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmReconnectViewModel", f = "VmReconnectViewModel.kt", l = {84}, m = "isVmEnabledAfterRefresh", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmReconnectViewModel$isVmEnabledAfterRefresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C143391 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C143391(HtJ<? super C143391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VmReconnectViewModel.this.isVmEnabledAfterRefresh(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmReconnectViewModel$onReconnect$1", f = "VmReconnectViewModel.kt", l = {55, 61, 66}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmReconnectViewModel$onReconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C143401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int label;

        public C143401(HtJ<? super C143401> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmReconnectViewModel.this.new C143401(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VmReconnectViewModel.this.new C143401(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[Catch: Exception -> 0x0087, TRY_ENTER, TryCatch #0 {Exception -> 0x0087, blocks: (B:29:0x0061, B:30:0x0064, B:21:0x0042, B:22:0x0045, B:26:0x004f, B:31:0x006e, B:12:0x0022, B:13:0x0025, B:15:0x002b, B:16:0x0033, B:18:0x0037, B:32:0x0082, B:33:0x0086, B:9:0x0013), top: B:42:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:29:0x0061, B:30:0x0064, B:21:0x0042, B:22:0x0045, B:26:0x004f, B:31:0x006e, B:12:0x0022, B:13:0x0025, B:15:0x002b, B:16:0x0033, B:18:0x0037, B:32:0x0082, B:33:0x0086, B:9:0x0013), top: B:42:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 3
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L10
                if (r0 == r4) goto L22
                if (r0 == r5) goto L42
                if (r0 != r3) goto Lab
                goto L61
            L10:
                X.Hwg.A00(r7)
                com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE     // Catch: java.lang.Exception -> L87
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this     // Catch: java.lang.Exception -> L87
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> L87
                r6.label = r4     // Catch: java.lang.Exception -> L87
                java.lang.Object r7 = r1.enableVm(r0, r6)     // Catch: java.lang.Exception -> L87
                if (r7 != r2) goto L25
                return r2
            L22:
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L87
            L25:
                com.facebook.aura.gateway.HatchVmRepository$EnableVmResult r7 = (com.facebook.aura.gateway.HatchVmRepository.EnableVmResult) r7     // Catch: java.lang.Exception -> L87
                boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchVmRepository.EnableVmResult.Success     // Catch: java.lang.Exception -> L87
                if (r0 == 0) goto L33
                com.facebook.aura.perf.HatchActivationQplLogger r1 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE     // Catch: java.lang.Exception -> L87
                java.lang.String r0 = "vm_reconnected"
                r1.pointFlow(r0)     // Catch: java.lang.Exception -> L87
                goto L4a
            L33:
                boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchVmRepository.EnableVmResult.Failure     // Catch: java.lang.Exception -> L87
                if (r0 == 0) goto L82
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this     // Catch: java.lang.Exception -> L87
                r6.label = r5     // Catch: java.lang.Exception -> L87
                java.lang.Object r7 = com.facebook.aura.vmdisabled.VmReconnectViewModel.access$isVmEnabledAfterRefresh(r0, r6)     // Catch: java.lang.Exception -> L87
                if (r7 != r2) goto L45
                return r2
            L42:
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L87
            L45:
                boolean r1 = X.AnonymousClass001.A1X(r7)     // Catch: java.lang.Exception -> L87
                goto L4b
            L4a:
                r1 = 1
            L4b:
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this
                if (r1 == 0) goto L6e
                com.facebook.aura.gateway.HatchVmDisabledStore r0 = r0.store     // Catch: java.lang.Exception -> L87
                r0.clearDisabled()     // Catch: java.lang.Exception -> L87
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this     // Catch: java.lang.Exception -> L87
                r6.I$0 = r1     // Catch: java.lang.Exception -> L87
                r6.label = r3     // Catch: java.lang.Exception -> L87
                java.lang.Object r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.access$forceConnectGateway(r0, r6)     // Catch: java.lang.Exception -> L87
                if (r0 != r2) goto L64
                return r2
            L61:
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L87
            L64:
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this     // Catch: java.lang.Exception -> L87
                X.3Em<kotlin.Unit> r1 = r0._reconnected     // Catch: java.lang.Exception -> L87
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L87
                r1.AhV(r0)     // Catch: java.lang.Exception -> L87
                goto La8
            L6e:
                X.BLG<com.facebook.aura.vmdisabled.VmReconnectUiState> r2 = r0._uiState     // Catch: java.lang.Exception -> L87
                r1 = 0
                com.facebook.aura.vmdisabled.VmReconnectUiState r0 = new com.facebook.aura.vmdisabled.VmReconnectUiState     // Catch: java.lang.Exception -> L87
                r0.<init>(r1)     // Catch: java.lang.Exception -> L87
                X.AnonymousClass002.A1I(r2, r0)     // Catch: java.lang.Exception -> L87
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE     // Catch: java.lang.Exception -> L87
                r0 = 2131888921(0x7f120b19, float:1.941249E38)
                r1.showToast(r0)     // Catch: java.lang.Exception -> L87
                goto La8
            L82:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Exception -> L87
                throw r0     // Catch: java.lang.Exception -> L87
            L87:
                r3 = move-exception
                com.facebook.aura.vmdisabled.VmReconnectViewModel r0 = com.facebook.aura.vmdisabled.VmReconnectViewModel.this
                X.BLG<com.facebook.aura.vmdisabled.VmReconnectUiState> r2 = r0._uiState
                r1 = 0
                com.facebook.aura.vmdisabled.VmReconnectUiState r0 = new com.facebook.aura.vmdisabled.VmReconnectUiState
                r0.<init>(r1)
                X.AnonymousClass002.A1I(r2, r0)
                boolean r0 = r3 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto Laf
                java.lang.String r1 = "Failed to reconnect VM"
                java.lang.String r0 = "VmReconnectViewModel"
                X.CFK.A08(r0, r1, r3)
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131888921(0x7f120b19, float:1.941249E38)
                r1.showToast(r0)
            La8:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            Lab:
                java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            Laf:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.VmReconnectViewModel.C143401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public VmReconnectViewModel(AbstractC3358CGz abstractC3358CGz, HatchVmDisabledStore hatchVmDisabledStore) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, hatchVmDisabledStore);
        this.userSession = abstractC3358CGz;
        this.store = hatchVmDisabledStore;
        C9286GCn c9286GCnA14 = C3cG.A14(new VmReconnectUiState(false));
        this._uiState = c9286GCnA14;
        this.uiState = C3Pi.A00(c9286GCnA14);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, zA1a ? 1 : 0, zA1a ? 1 : 0);
        this._reconnected = c9290GCr;
        this.reconnected = new C3pd(c9290GCr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object forceConnectGateway(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.vmdisabled.VmReconnectViewModel.AnonymousClass1
            if (r0 == 0) goto L1e
            r5 = r7
            com.facebook.aura.vmdisabled.VmReconnectViewModel$forceConnectGateway$1 r5 = (com.facebook.aura.vmdisabled.VmReconnectViewModel.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.vmdisabled.VmReconnectViewModel$forceConnectGateway$1 r5 = new com.facebook.aura.vmdisabled.VmReconnectViewModel$forceConnectGateway$1
            r5.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            goto L4b
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            X.CGz r0 = r6.userSession     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r1.getGateway(r0)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            r5.label = r3     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r2.fetchAndConnect(r3, r0, r1, r5)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4e
            if (r0 != r4) goto L4b
            return r4
        L43:
            r2 = move-exception
            java.lang.String r1 = "Failed to connect the gateway after enabling the VM"
            java.lang.String r0 = "VmReconnectViewModel"
            X.CFK.A08(r0, r1, r2)
        L4b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L4e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.VmReconnectViewModel.forceConnectGateway(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isVmEnabledAfterRefresh(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.vmdisabled.VmReconnectViewModel.C143391
            if (r0 == 0) goto L4b
            r5 = r7
            com.facebook.aura.vmdisabled.VmReconnectViewModel$isVmEnabledAfterRefresh$1 r5 = (com.facebook.aura.vmdisabled.VmReconnectViewModel.C143391) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L51
            X.Hwg.A00(r1)
        L20:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success
            if (r0 == 0) goto L37
            com.facebook.aura.gateway.HatchVmDisabledStore r0 = r6.store
            X.1BN<java.lang.Boolean> r0 = r0.isVmDisabled
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L37
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L37:
            r3 = 0
            goto L32
        L39:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository r2 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            X.CGz r1 = r6.userSession
            com.facebook.aura.gateway.VmFetchSource r0 = com.facebook.aura.gateway.VmFetchSource.VM_RECONNECT
            r5.label = r3
            java.lang.Object r1 = r2.fetchAndCacheExistingVm(r1, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L4b:
            com.facebook.aura.vmdisabled.VmReconnectViewModel$isVmEnabledAfterRefresh$1 r5 = new com.facebook.aura.vmdisabled.VmReconnectViewModel$isVmEnabledAfterRefresh$1
            r5.<init>(r7)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.VmReconnectViewModel.isVmEnabledAfterRefresh(X.HtJ):java.lang.Object");
    }

    public final C22I<Unit> getReconnected() {
        return this.reconnected;
    }

    public final C1BN<VmReconnectUiState> getUiState() {
        return this.uiState;
    }

    public final void onReconnect() {
        if (this._uiState.getValue().isReconnecting) {
            return;
        }
        C9286GCn.A00(null, new VmReconnectUiState(true), (C9286GCn) this._uiState);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C143401(null), AEu.A00(this));
    }
}
