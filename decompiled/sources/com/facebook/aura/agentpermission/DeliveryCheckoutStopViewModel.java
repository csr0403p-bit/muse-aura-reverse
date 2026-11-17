package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3cI;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.DeliveryCheckoutHandoff;
import com.facebook.aura.gateway.DeliveryCheckoutStop;
import com.facebook.aura.gateway.DeliveryCheckoutStopRole;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutStopViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _awaitingApproval;
    public final String approvalId;
    public final HatchAgentPermissionsRepository repository;
    public final String stopId;
    public final C1BN<DeliveryCheckoutStopUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1", f = "DeliveryCheckoutStopViewModel.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1", f = "DeliveryCheckoutStopViewModel.kt", l = {63, LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ DeliveryCheckoutStopViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1$1", f = "DeliveryCheckoutStopViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00261 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C00261(HtJ<? super C00261> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00261 c00261 = new C00261(htJ);
                    c00261.Z$0 = AnonymousClass001.A1X(obj);
                    return c00261;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C00261) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @DebugMetadata(c = "com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1$2", f = "DeliveryCheckoutStopViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC07127nr implements G0V<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;
                public final /* synthetic */ DeliveryCheckoutStopViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel, HtJ<? super AnonymousClass2> htJ) {
                    super(2, htJ);
                    this.this$0 = deliveryCheckoutStopViewModel;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, HtJ<? super Boolean> htJ) {
                    return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    List list = (List) this.L$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(AnonymousClass002.A1X(this.this$0.selectedStop(list)));
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, HtJ<? super Boolean> htJ) {
                    return ((AnonymousClass2) create(list, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel, HtJ<? super C00251> htJ) {
                super(2, htJ);
                this.this$0 = deliveryCheckoutStopViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00251(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bn = this.this$0.repository.hasLoadedServerApprovals;
                    C00261 c00261 = new C00261(null);
                    this.label = 1;
                    if (AbstractC9777Gfy.A00(this, c00261, c1bn) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel = this.this$0;
                if (deliveryCheckoutStopViewModel.selectedStop(deliveryCheckoutStopViewModel.repository.currentPendingApprovals()) != null) {
                    DeliveryCheckoutStopViewModel deliveryCheckoutStopViewModel2 = this.this$0;
                    C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> c1bn2 = deliveryCheckoutStopViewModel2.repository.pendingApprovals;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(deliveryCheckoutStopViewModel2, null);
                    this.label = 2;
                    if (AbstractC9777Gfy.A00(this, anonymousClass2, c1bn2) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C00251(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return DeliveryCheckoutStopViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C00251 c00251 = new C00251(DeliveryCheckoutStopViewModel.this, null);
                this.label = 1;
                if (C3cI.A0S(c00251, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AnonymousClass004.A1D(false, DeliveryCheckoutStopViewModel.this._awaitingApproval);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return DeliveryCheckoutStopViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<DeliveryCheckoutStopViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final String stopId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public DeliveryCheckoutStopViewModel create() {
            return new DeliveryCheckoutStopViewModel(this.userSession, this.approvalId, this.stopId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
            this.stopId = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0017 A[PHI: r1
  0x0017: PHI (r1v2 boolean) = (r1v0 boolean), (r1v0 boolean), (r1v3 boolean) binds: [B:9:0x000d, B:10:0x000f, B:7:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.agentpermission.DeliveryCheckoutStopUiState stopUiState(com.facebook.aura.gateway.DeliveryCheckoutStop r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L19
            com.facebook.aura.agentpermission.DeliveryStopDetailsUiState r3 = r3.toDetailsUiState(r4)
        L6:
            r2 = 1
            if (r4 != 0) goto Lc
            r1 = 1
            if (r5 != 0) goto L17
        Lc:
            r1 = 0
            if (r4 != 0) goto L17
            if (r5 != 0) goto L17
        L11:
            com.facebook.aura.agentpermission.DeliveryCheckoutStopUiState r0 = new com.facebook.aura.agentpermission.DeliveryCheckoutStopUiState
            r0.<init>(r3, r1, r2)
            return r0
        L17:
            r2 = 0
            goto L11
        L19:
            r3 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel.stopUiState(com.facebook.aura.gateway.DeliveryCheckoutStop, boolean):com.facebook.aura.agentpermission.DeliveryCheckoutStopUiState");
    }

    private final DeliveryStopDetailsUiState toDetailsUiState(DeliveryCheckoutStop deliveryCheckoutStop) {
        DeliveryCheckoutStopRole deliveryCheckoutStopRole = deliveryCheckoutStop.role;
        String str = deliveryCheckoutStop.address;
        String str2 = deliveryCheckoutStop.contactName;
        DeliveryCheckoutTime deliveryCheckoutTime = deliveryCheckoutStop.time;
        DeliveryCheckoutHandoff deliveryCheckoutHandoff = deliveryCheckoutStop.handoff;
        return new DeliveryStopDetailsUiState(deliveryCheckoutStopRole, str, str2, deliveryCheckoutTime, (deliveryCheckoutHandoff == null && deliveryCheckoutStop.instructions == null) ? null : new DeliveryStopInstructionsUiState(deliveryCheckoutHandoff, deliveryCheckoutStop.instructions));
    }

    public final C1BN<DeliveryCheckoutStopUiState> getUiState() {
        return this.uiState;
    }

    public DeliveryCheckoutStopViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass005.A0x(abstractC3358CGz, str, str2);
        this.approvalId = str;
        this.stopId = str2;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(AnonymousClass002.A1Y(selectedStop(companion.pendingApprovals.getValue())));
        this._awaitingApproval = c9286GCnA0v;
        if (AnonymousClass001.A1X(c9286GCnA0v.getValue())) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        }
        C60I c60iA03 = C3rb.A03(new DeliveryCheckoutStopViewModel$uiState$1(this, null), companion.pendingApprovals, c9286GCnA0v);
        this.uiState = AnonymousClass441.A00(stopUiState(selectedStop(companion.pendingApprovals.getValue()), AnonymousClass001.A1X(c9286GCnA0v.getValue())), AEu.A00(this), c60iA03, C3Ek.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryCheckoutStop selectedStop(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        DeliveryCheckoutStop deliveryCheckoutStop;
        HatchAgentPermissionsRepository.AgentPermissionApproval next;
        DeliveryCheckoutApproval deliveryCheckoutApproval;
        List<DeliveryCheckoutStop> list2;
        Iterator<HatchAgentPermissionsRepository.AgentPermissionApproval> it = list.iterator();
        while (true) {
            deliveryCheckoutStop = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.approvalId, this.approvalId)) {
                break;
            }
        }
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = next;
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval != null ? agentPermissionApproval.richPayload : null;
        if (!(agentPermissionRichPayload instanceof DeliveryCheckoutApproval) || (deliveryCheckoutApproval = (DeliveryCheckoutApproval) agentPermissionRichPayload) == null || (list2 = deliveryCheckoutApproval.stops) == null) {
            return null;
        }
        Iterator<DeliveryCheckoutStop> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DeliveryCheckoutStop next2 = it2.next();
            if (C7384Etj.areEqual(next2.id, this.stopId)) {
                deliveryCheckoutStop = next2;
                break;
            }
        }
        return deliveryCheckoutStop;
    }
}
