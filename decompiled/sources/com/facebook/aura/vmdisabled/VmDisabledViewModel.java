package com.facebook.aura.vmdisabled;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass603;
import X.BLG;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.G2k;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import com.facebook.aura.gateway.HatchVmDisabledStore;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import com.facebook.aura.perf.HatchActivationQplLogger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VmDisabledViewModel extends AEs {
    public final BLG<VmRecoveryFlowType> _flowType;
    public final C1BN<VmRecoveryFlowType> flowType;
    public final BLG<Boolean> gateSuppressed;
    public final OverlayApi overlayApi;
    public final HatchGatewayPrefsStore prefsStore;
    public final BLG<Boolean> reenableContentSettled;
    public final HatchVmDisabledStore store;

    public final class Factory implements InterfaceC08439ui {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new VmDisabledViewModel(HatchVmDisabledStore.Companion.getInstance(this.userSession), HatchGatewayPrefsStore.Companion.getInstance(this.userSession), OverlayApi.Companion.getInstance(this.userSession));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmDisabledViewModel", f = "VmDisabledViewModel.kt", l = {134}, m = "fetchRecoveryFlowType", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VmDisabledViewModel.this.fetchRecoveryFlowType(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmDisabledViewModel$observeRecoveryFlowEntry$1", f = "VmDisabledViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmDisabledViewModel$observeRecoveryFlowEntry$1, reason: invalid class name and case insensitive filesystem */
    public final class C143371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmDisabledViewModel$observeRecoveryFlowEntry$1$1", f = "VmDisabledViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmdisabled.VmDisabledViewModel$observeRecoveryFlowEntry$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04381 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ VmDisabledViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04381(VmDisabledViewModel vmDisabledViewModel, HtJ<? super C04381> htJ) {
                super(2, htJ);
                this.this$0 = vmDisabledViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C04381 c04381 = new C04381(this.this$0, htJ);
                c04381.Z$0 = AnonymousClass001.A1X(obj);
                return c04381;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                BLG blg;
                boolean z = this.Z$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    VmDisabledViewModel vmDisabledViewModel = this.this$0;
                    blg = vmDisabledViewModel._flowType;
                    if (z) {
                        this.L$0 = blg;
                        this.Z$0 = z;
                        this.label = 1;
                        obj = vmDisabledViewModel.fetchRecoveryFlowType(this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$0;
                    Hwg.A00(obj);
                }
                blg.Af8(obj);
                AnonymousClass004.A1D(z, this.this$0.reenableContentSettled);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return ((C04381) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C143371(HtJ<? super C143371> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmDisabledViewModel.this.new C143371(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VmDisabledViewModel vmDisabledViewModel = VmDisabledViewModel.this;
                C1BN<Boolean> c1bn = vmDisabledViewModel.store.isVmDisabled;
                C04381 c04381 = new C04381(vmDisabledViewModel, null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c04381, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VmDisabledViewModel.this.new C143371(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmDisabledViewModel$observeVmDisabled$1", f = "VmDisabledViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmdisabled.VmDisabledViewModel$observeVmDisabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C143381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmdisabled.VmDisabledViewModel$observeVmDisabled$1$1", f = "VmDisabledViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmdisabled.VmDisabledViewModel$observeVmDisabled$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04391 extends AbstractC07127nr implements G2k<Boolean, Boolean, Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public /* synthetic */ boolean Z$2;
            public /* synthetic */ boolean Z$3;
            public int label;

            public C04391(HtJ<? super C04391> htJ) {
                super(5, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    boolean r4 = r5.Z$0
                    boolean r2 = r5.Z$1
                    boolean r3 = r5.Z$2
                    boolean r1 = r5.Z$3
                    int r0 = r5.label
                    if (r0 != 0) goto L35
                    X.Hwg.A00(r6)
                    if (r4 == 0) goto L16
                    if (r2 == 0) goto L16
                    r2 = 1
                    if (r3 == 0) goto L17
                L16:
                    r2 = 0
                L17:
                    if (r1 == 0) goto L25
                    com.facebook.aura.perf.HatchActivationQplLogger r1 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
                    java.lang.String r0 = "logout"
                    r1.endFlowCancel(r0)
                L20:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L25:
                    if (r4 != 0) goto L2d
                    com.facebook.aura.perf.HatchActivationQplLogger r0 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
                    r0.endVmRecoveryFlow()
                    goto L20
                L2d:
                    if (r2 == 0) goto L20
                    com.facebook.aura.perf.HatchActivationQplLogger r0 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
                    r0.startVmRecoveryFlow()
                    goto L20
                L35:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.VmDisabledViewModel.C143381.C04391.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), AnonymousClass001.A1X(bool4), htJ);
            }

            public final Object invoke(boolean z, boolean z2, boolean z3, boolean z4, HtJ<? super Boolean> htJ) {
                C04391 c04391 = new C04391(htJ);
                c04391.Z$0 = z;
                c04391.Z$1 = z2;
                c04391.Z$2 = z3;
                c04391.Z$3 = z4;
                return c04391.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C143381(HtJ<? super C143381> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VmDisabledViewModel.this.new C143381(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VmDisabledViewModel vmDisabledViewModel = VmDisabledViewModel.this;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new C04391(null), vmDisabledViewModel.store.isVmDisabled, vmDisabledViewModel.reenableContentSettled, vmDisabledViewModel.gateSuppressed, AuraLogoutHelper.isLoggingOut);
                final VmDisabledViewModel vmDisabledViewModel2 = VmDisabledViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.vmdisabled.VmDisabledViewModel.observeVmDisabled.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = vmDisabledViewModel2.overlayApi;
                        VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey = VmDisabledOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(vmDisabledOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(vmDisabledOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603A01.collect(c20z, this) == enumC10460Hji) {
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
            return VmDisabledViewModel.this.new C143381(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VmDisabledViewModel(HatchVmDisabledStore hatchVmDisabledStore, HatchGatewayPrefsStore hatchGatewayPrefsStore, OverlayApi overlayApi) {
        AnonymousClass005.A10(hatchVmDisabledStore, hatchGatewayPrefsStore, overlayApi);
        this.store = hatchVmDisabledStore;
        this.prefsStore = hatchGatewayPrefsStore;
        this.overlayApi = overlayApi;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._flowType = c9286GCnA13;
        this.flowType = C3cG.A11(c9286GCnA13);
        this.gateSuppressed = C3cG.A14(false);
        this.reenableContentSettled = C3cG.A14(false);
        observeRecoveryFlowEntry();
        observeVmDisabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchRecoveryFlowType(X.HtJ<? super com.facebook.aura.vmdisabled.VmRecoveryFlowType> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.vmdisabled.VmDisabledViewModel.AnonymousClass1
            if (r0 == 0) goto L76
            r13 = r15
            com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$1 r13 = (com.facebook.aura.vmdisabled.VmDisabledViewModel.AnonymousClass1) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r13.label = r2
        L12:
            java.lang.Object r1 = r13.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L7c
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L22:
            java.lang.Throwable r2 = X.HsJ.A00(r0)
            if (r2 != 0) goto L81
            com.facebook.aura.vmdisabled.VmReenableContentJson r0 = (com.facebook.aura.vmdisabled.VmReenableContentJson) r0
            com.facebook.aura.vmdisabled.RecoveryFlow$Companion r1 = com.facebook.aura.vmdisabled.RecoveryFlow.Companion
            java.lang.String r0 = r0.flow
            com.facebook.aura.vmdisabled.RecoveryFlow r0 = r1.fromWire(r0)
            com.facebook.aura.vmdisabled.VmRecoveryFlowType r0 = r0.getFlowType()
            return r0
        L37:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r14.prefsStore
            java.lang.String r1 = X.C3cG.A0a(r0)
            if (r1 == 0) goto L88
            int r0 = r1.length()
            if (r0 <= 0) goto L88
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.vmdisabled.VmDisabledStefiPath$VmReenableContent r7 = new com.facebook.aura.vmdisabled.VmDisabledStefiPath$VmReenableContent
            r7.<init>(r1)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Long r10 = X.C3cG.A0S(r0)
            X.9jH r11 = X.AGH.A0E()
            com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$$inlined$executeStefiRequest-bMdYcbs$default$1 r5 = com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r13.L$0 = r9
            r13.L$1 = r9
            r13.L$2 = r9
            r13.L$3 = r9
            r13.L$4 = r9
            r13.L$5 = r9
            r13.L$6 = r9
            r13.label = r3
            r6 = 0
            r12 = r11
            java.lang.Object r0 = r4.m1596executeBodylessStefiRequestWithtZkwj4A(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r2) goto L22
            return r2
        L76:
            com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$1 r13 = new com.facebook.aura.vmdisabled.VmDisabledViewModel$fetchRecoveryFlowType$1
            r13.<init>(r15)
            goto L12
        L7c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L81:
            java.lang.String r1 = "VmDisabledViewModel"
            java.lang.String r0 = "Failed to fetch VM re-enable content"
            X.CFK.A0K(r1, r2, r0)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.VmDisabledViewModel.fetchRecoveryFlowType(X.HtJ):java.lang.Object");
    }

    public final C1BN<VmRecoveryFlowType> getFlowType() {
        return this.flowType;
    }

    @Override // X.AEs
    public void onCleared() {
        HatchActivationQplLogger.INSTANCE.cancelVmRecoveryFlow("view_model_cleared");
    }

    public final void onGateSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.gateSuppressed);
    }

    private final void observeRecoveryFlowEntry() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C143371(null), AEu.A00(this));
    }

    private final void observeVmDisabled() {
        AnonymousClass001.A1I(C3cG.A0v(), new C143381(null), AEu.A00(this));
    }
}
