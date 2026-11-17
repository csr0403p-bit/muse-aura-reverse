package com.facebook.aura.spacesharing.impl;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.CH0;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt;
import com.facebook.aura.network.AuraAuthHeaders;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedSpaceSaveViewModel extends AEs {
    public static final int $stable = 8;
    public final String gateway;
    public final BLG<SharedSpaceSaveState> mutableState;
    public HoC operation;
    public final AbstractC3358CGz session;
    public final String shortcode;
    public final C1BN<SharedSpaceSaveState> state;

    public final class Factory extends AuraViewModelFactory<SharedSpaceSaveViewModel> {
        public static final int $stable = 8;
        public final String gateway;
        public final AbstractC3358CGz session;
        public final String shortcode;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SharedSpaceSaveViewModel create() {
            return new SharedSpaceSaveViewModel(this.session, this.shortcode, this.gateway);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.session = abstractC3358CGz;
            this.shortcode = str;
            this.gateway = str2;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$findSavedArtifact$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, SharedSpaceSaveViewModel.class, "checkScope", "checkScope()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SharedSpaceSaveViewModel) this.receiver).checkScope();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel", f = "SharedSpaceSaveViewModel.kt", l = {125, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 131, 133}, m = "refreshPlacement", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$refreshPlacement$1, reason: invalid class name */
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
            return SharedSpaceSaveViewModel.this.refreshPlacement(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$reload$1", f = "SharedSpaceSaveViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$reload$1, reason: invalid class name and case insensitive filesystem */
    public final class C139801 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public C139801(HtJ<? super C139801> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return SharedSpaceSaveViewModel.this.new C139801(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return SharedSpaceSaveViewModel.this.new C139801(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            SharedSpaceSaveState sharedSpaceSaveState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SharedSpaceSaveViewModel sharedSpaceSaveViewModel = SharedSpaceSaveViewModel.this;
                this.label = 1;
                obj = sharedSpaceSaveViewModel.findSavedArtifact(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SavedSpaceArtifactJson savedSpaceArtifactJson = (SavedSpaceArtifactJson) obj;
            BLG<SharedSpaceSaveState> blg = SharedSpaceSaveViewModel.this.mutableState;
            if (savedSpaceArtifactJson == null) {
                obj2 = null;
                sharedSpaceSaveState = new SharedSpaceSaveState(SharedSpaceSaveStatus.READY, null, null);
            } else {
                obj2 = null;
                sharedSpaceSaveState = new SharedSpaceSaveState(SharedSpaceSaveStatus.SAVED, null, savedSpaceArtifactJson.placement);
            }
            AnonymousClass001.A1E(blg, obj2, sharedSpaceSaveState);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$runOperation$1", f = "SharedSpaceSaveViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$runOperation$1, reason: invalid class name and case insensitive filesystem */
    public final class C139811 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $action;
        public final /* synthetic */ boolean $reportError;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C139811(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, boolean z, HtJ<? super C139811> htJ) {
            super(2, htJ);
            this.$action = g0u;
            this.$reportError = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedSpaceSaveViewModel.this.new C139811(this.$action, this.$reportError, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    SharedSpaceSaveViewModel.this.checkScope();
                    G0U<HtJ<? super Unit>, Object> g0u = this.$action;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                SharedSpaceSaveViewModel sharedSpaceSaveViewModel = SharedSpaceSaveViewModel.this;
                AnonymousClass001.A1E(sharedSpaceSaveViewModel.mutableState, null, new SharedSpaceSaveState(SharedSpaceSaveStatus.ERROR, this.$reportError ? C3cG.A0R(sharedSpaceSaveViewModel.errorResource(e2)) : null, null));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139811) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$save$1", f = "SharedSpaceSaveViewModel.kt", l = {106, 109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel$save$1, reason: invalid class name and case insensitive filesystem */
    public final class C139821 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C139821(HtJ<? super C139821> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return SharedSpaceSaveViewModel.this.new C139821(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return SharedSpaceSaveViewModel.this.new C139821(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|26|(1:(1:(6:6|28|7|25|20|21)(2:8|9))(1:13))(3:10|(0)|12)|14|30|15|(4:17|25|20|21)|12|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            r1 = r8;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L19
                if (r0 == r4) goto L2e
                if (r0 != r5) goto L14
                java.lang.Object r1 = r7.L$0
                com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson r1 = (com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson) r1
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L60
                goto L4c
            L14:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L19:
                X.Hwg.A00(r8)
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.this
                X.CGz r3 = r0.session
                java.lang.String r2 = r0.gateway
                java.lang.String r1 = r0.shortcode
                r7.label = r4
                r0 = 0
                java.lang.Object r8 = com.facebook.aura.spacesharing.impl.SharedSpaceSavedLookupKt.saveSharedSpace(r3, r2, r1, r0, r7)
                if (r8 != r6) goto L31
            L2d:
                return r6
            L2e:
                X.Hwg.A00(r8)
            L31:
                com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson r8 = (com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson) r8
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.this
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.access$checkScope(r0)
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.this     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L60
                r7.L$0 = r8     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L60
                r7.label = r5     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L60
                java.lang.Object r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.access$refreshPlacement(r0, r8, r7)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L60
                if (r0 == r6) goto L2d
                r1 = r8
                goto L4c
            L46:
                r1 = r8
            L47:
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.this
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.access$checkScope(r0)
            L4c:
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.this
                X.BLG<com.facebook.aura.spacesharing.impl.SharedSpaceSaveState> r4 = r0.mutableState
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r3 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.SAVED
                java.lang.String r2 = r1.placement
                r1 = 0
                com.facebook.aura.spacesharing.impl.SharedSpaceSaveState r0 = new com.facebook.aura.spacesharing.impl.SharedSpaceSaveState
                r0.<init>(r3, r1, r2)
                X.AnonymousClass001.A1E(r4, r1, r0)
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L60:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.C139821.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SharedSpaceSaveViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass005.A10(abstractC3358CGz, str, str2);
        this.session = abstractC3358CGz;
        this.shortcode = str;
        this.gateway = str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new SharedSpaceSaveState(SharedSpaceSaveStatus.LOADING, null, null));
        this.mutableState = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        reload(false);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SharedSpaceSaveStatus.values().length];
            try {
                AnonymousClass002.A13(SharedSpaceSaveStatus.ERROR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SharedSpaceSaveStatus.READY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkScope() {
        if (!C7384Etj.areEqual(AuraAuthHeaders.INSTANCE.currentUserIdForCache(), ((CH0) this.session).A01)) {
            throw C3cG.A0Q("Check failed.");
        }
        if (C7BY.A0j(this.gateway) || !C7384Etj.areEqual(C60O.A0m(HatchGatewayPrefsStore.Companion, this.session), this.gateway)) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int errorResource(Exception exc) {
        NetworkException networkException;
        String str = null;
        if (exc instanceof NetworkException) {
            networkException = (NetworkException) exc;
            if (networkException != null) {
                str = networkException.errorCode;
            }
        } else {
            networkException = null;
        }
        if (UnifiedArtifactsRepositoryKt.ERROR_SIDEBAR_FULL.equals(str)) {
            return R.string._name_removed__res_0x7f120fff;
        }
        if (networkException == null) {
            return R.string._name_removed__res_0x7f120ffb;
        }
        int i = networkException.httpResponseCode;
        return i == 401 ? R.string._name_removed__res_0x7f121000 : i == 403 ? R.string._name_removed__res_0x7f120ff9 : i != 404 ? R.string._name_removed__res_0x7f120ffb : R.string._name_removed__res_0x7f120ffa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findSavedArtifact(HtJ<? super SavedSpaceArtifactJson> htJ) {
        return SharedSpaceSavedLookupKt.findSavedSpaceArtifact(this.session, this.gateway, Collections.singleton(this.shortcode), new AnonymousClass2(this), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshPlacement(com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel.refreshPlacement(com.facebook.aura.spacesharing.impl.SavedSpaceArtifactJson, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ void reload$default(SharedSpaceSaveViewModel sharedSpaceSaveViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        sharedSpaceSaveViewModel.reload(z);
    }

    private final void runOperation(SharedSpaceSaveStatus sharedSpaceSaveStatus, boolean z, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        HoC hoC = this.operation;
        if (hoC == null || !hoC.isActive()) {
            AnonymousClass001.A1E(this.mutableState, null, new SharedSpaceSaveState(sharedSpaceSaveStatus, null, null));
            BLL bllA00 = AEu.A00(this);
            this.operation = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139811(g0u, z, null), bllA00);
        }
    }

    public static /* synthetic */ void runOperation$default(SharedSpaceSaveViewModel sharedSpaceSaveViewModel, SharedSpaceSaveStatus sharedSpaceSaveStatus, boolean z, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        sharedSpaceSaveViewModel.runOperation(sharedSpaceSaveStatus, z, g0u);
    }

    public final void cancelPendingWork() {
        SharedSpaceSaveState value;
        SharedSpaceSaveState sharedSpaceSaveState;
        HoC hoC = this.operation;
        if (hoC == null || !hoC.isActive()) {
            return;
        }
        AnonymousClass002.A1K(this.operation);
        BLG<SharedSpaceSaveState> blg = this.mutableState;
        do {
            value = blg.getValue();
            sharedSpaceSaveState = value;
            if (sharedSpaceSaveState.loading) {
                sharedSpaceSaveState = new SharedSpaceSaveState(SharedSpaceSaveStatus.ERROR, null, sharedSpaceSaveState.placement);
            }
        } while (!blg.A6e(value, sharedSpaceSaveState));
    }

    public final void clearError() {
        SharedSpaceSaveState value;
        SharedSpaceSaveState sharedSpaceSaveState;
        BLG<SharedSpaceSaveState> blg = this.mutableState;
        do {
            value = blg.getValue();
            sharedSpaceSaveState = value;
        } while (!blg.A6e(value, sharedSpaceSaveState.copy(sharedSpaceSaveState.status, null, sharedSpaceSaveState.placement)));
    }

    public final C1BN<SharedSpaceSaveState> getState() {
        return this.state;
    }

    public final void onPrimaryAction() {
        int iOrdinal = this.mutableState.getValue().status.ordinal();
        if (iOrdinal == 4) {
            reload(true);
        } else if (iOrdinal == 1) {
            save();
        }
    }

    public final void reload(boolean z) {
        runOperation(SharedSpaceSaveStatus.LOADING, z, new C139801(null));
    }

    public final void save() {
        if (this.mutableState.getValue().status == SharedSpaceSaveStatus.READY) {
            runOperation(SharedSpaceSaveStatus.SAVING, true, new C139821(null));
        }
    }
}
