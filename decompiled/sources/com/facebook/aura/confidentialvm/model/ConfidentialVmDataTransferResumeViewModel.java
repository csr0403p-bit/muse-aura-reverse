package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.C10543Hqv;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cJ;
import X.C3rb;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HtJ;
import X.HwN;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchCvmMigrationStore;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferResumeOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.overlay.api.OverlayApi;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmDataTransferResumeViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Integer> _overlayGeneration;
    public final BLG<Boolean> isSuppressed;
    public final OverlayApi overlayApi;
    public final BLG<ConfidentialVmSwitchDirection> overlayDirection;
    public final C1BN<Integer> overlayGeneration;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$1", f = "ConfidentialVmDataTransferResumeViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$1$1", f = "ConfidentialVmDataTransferResumeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00801 extends AbstractC07127nr implements G0W<ConfidentialVmSwitchDirection, Boolean, HtJ<? super ConfidentialVmSwitchDirection>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C00801(HtJ<? super C00801> htJ) {
                super(3, htJ);
            }

            public final Object invoke(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, boolean z, HtJ<? super ConfidentialVmSwitchDirection> htJ) {
                C00801 c00801 = new C00801(htJ);
                c00801.L$0 = confidentialVmSwitchDirection;
                c00801.Z$0 = z;
                return c00801.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                if (z) {
                    return null;
                }
                return obj2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, Boolean bool, HtJ<? super ConfidentialVmSwitchDirection> htJ) {
                return invoke(confidentialVmSwitchDirection, AnonymousClass001.A1X(bool), htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmDataTransferResumeViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                final C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel = ConfidentialVmDataTransferResumeViewModel.this;
                C20Q c20qA04 = C3rb.A04(new C00801(null), confidentialVmDataTransferResumeViewModel.overlayDirection, confidentialVmDataTransferResumeViewModel.isSuppressed);
                final ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel2 = ConfidentialVmDataTransferResumeViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConfidentialVmSwitchDirection) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, HtJ<? super Unit> htJ) {
                        ConfidentialVmSwitchDirection confidentialVmSwitchDirection2 = c10543HqvA10.element;
                        if (confidentialVmSwitchDirection2 != null) {
                            confidentialVmDataTransferResumeViewModel2.overlayApi.hideOverlay(new ConfidentialVmDataTransferResumeOverlayScreenKey(confidentialVmSwitchDirection2));
                        }
                        if (confidentialVmSwitchDirection != 0) {
                            confidentialVmDataTransferResumeViewModel2.overlayApi.showOverlay(new ConfidentialVmDataTransferResumeOverlayScreenKey(confidentialVmSwitchDirection));
                        }
                        c10543HqvA10.element = confidentialVmSwitchDirection;
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20qA04.collect(c20z, this) == enumC10460Hji) {
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
            return ConfidentialVmDataTransferResumeViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2", f = "ConfidentialVmDataTransferResumeViewModel.kt", l = {53, 64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel this$0;

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ ConfidentialVmMigrationOperation $operation;
            public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel this$0;

            public AnonymousClass1(ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, ConfidentialVmMigrationOperation confidentialVmMigrationOperation) {
                this.this$0 = confidentialVmDataTransferResumeViewModel;
                this.$operation = confidentialVmMigrationOperation;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((List<String>) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[PHI: r2 r3
  0x004e: PHI (r2v1 com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation) = 
  (r2v0 com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation)
  (r2v2 com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation)
 binds: [B:21:0x004a, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r3v1 java.util.Iterator<java.lang.String>) = (r3v0 java.util.Iterator<java.lang.String>), (r3v2 java.util.Iterator<java.lang.String>) binds: [B:21:0x004a, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006d -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.util.List<java.lang.String> r8, X.HtJ<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1$emit$1
                    if (r0 == 0) goto L70
                    r6 = r9
                    com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1$emit$1 r6 = (com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L70
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r1 = r6.result
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r0 = r6.label
                    r4 = 1
                    if (r0 == 0) goto L3a
                    if (r0 != r4) goto L76
                    java.lang.Object r3 = r6.L$3
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r2 = r6.L$2
                    com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation) r2
                    X.Hwg.A00(r1)
                L28:
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r0 = r1.booleanValue()
                    if (r0 == 0) goto L4e
                    com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel r1 = r7.this$0
                    com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM
                    com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel.access$showResumeOverlay(r1, r0)
                L37:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L3a:
                    X.Hwg.A00(r1)
                    com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation r2 = r7.$operation
                    boolean r0 = r8 instanceof java.util.Collection
                    if (r0 == 0) goto L4a
                    boolean r0 = r8.isEmpty()
                    if (r0 == 0) goto L4a
                    goto L37
                L4a:
                    java.util.Iterator r3 = r8.iterator()
                L4e:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L37
                    java.lang.Object r1 = r3.next()
                    java.lang.String r1 = (java.lang.String) r1
                    r0 = 0
                    r6.L$0 = r0
                    r6.L$1 = r0
                    r6.L$2 = r2
                    r6.L$3 = r3
                    r6.L$4 = r0
                    r6.L$5 = r0
                    r6.label = r4
                    java.lang.Object r1 = r2.adoptRunningMigration(r1, r6)
                    if (r1 != r5) goto L28
                    return r5
                L70:
                    com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1$emit$1 r6 = new com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1$emit$1
                    r6.<init>(r7, r9)
                    goto L12
                L76:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel.AnonymousClass2.AnonymousClass1.emit(java.util.List, X.HtJ):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.this$0 = confidentialVmDataTransferResumeViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel;
            ConfidentialVmSwitchDirection confidentialVmSwitchDirection;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmDowngradeOperation companion = ConfidentialVmDowngradeOperation.Companion.getInstance(this.$userSession);
                this.label = 1;
                obj = companion.resumeOnLaunch(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    throw C3cG.A0p();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                confidentialVmDataTransferResumeViewModel = this.this$0;
                confidentialVmSwitchDirection = ConfidentialVmSwitchDirection.TO_SECURE_VM;
            } else {
                ConfidentialVmMigrationOperation companion2 = ConfidentialVmMigrationOperation.Companion.getInstance(this.$userSession);
                boolean zHasPreparedMigration = companion2.hasPreparedMigration();
                CFK.A03(Boolean.valueOf(zHasPreparedMigration), ConfidentialVmDataTransferResumeViewModelKt.TAG, "Resume on launch: hasPreparedMigration=%s");
                if (!zHasPreparedMigration) {
                    C1BN<List<String>> c1bn = HatchCvmMigrationStore.Companion.getInstance(this.$userSession).pendingSourceVmIds;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, companion2);
                    this.L$0 = null;
                    this.Z$0 = zHasPreparedMigration;
                    this.label = 2;
                    if (c1bn.collect(anonymousClass1, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    throw C3cG.A0p();
                }
                confidentialVmDataTransferResumeViewModel = this.this$0;
                confidentialVmSwitchDirection = ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM;
            }
            confidentialVmDataTransferResumeViewModel.showResumeOverlay(confidentialVmSwitchDirection);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmDataTransferResumeViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmDataTransferResumeViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmDataTransferResumeViewModel create() {
            return new ConfidentialVmDataTransferResumeViewModel(this.userSession);
        }
    }

    public ConfidentialVmDataTransferResumeViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.overlayDirection = C3cG.A13();
        this.isSuppressed = AnonymousClass002.A0v(false);
        C9286GCn c9286GCnA14 = C3cG.A14(0);
        this._overlayGeneration = c9286GCnA14;
        this.overlayGeneration = C3cG.A11(c9286GCnA14);
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        C78T c78tM764default = auraDispatchers.m764default();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Integer num = C79.A00;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(abstractC3358CGz, this, null), AnonymousClass001.A0e(this, num, c78tM764default, anonymousClass1, bllA00));
    }

    public final void onLeft(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        C9286GCn.A00(confidentialVmSwitchDirection, HwN.A01, (C9286GCn) this.overlayDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showResumeOverlay(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        if (this.overlayDirection.getValue() != confidentialVmSwitchDirection) {
            while (!C3cJ.A11(this._overlayGeneration)) {
            }
            this.overlayDirection.Af8(confidentialVmSwitchDirection);
        }
    }

    public final C1BN<Integer> getOverlayGeneration() {
        return this.overlayGeneration;
    }

    public final void onSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.isSuppressed);
    }
}
