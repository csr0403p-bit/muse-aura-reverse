package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass603;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.F3w;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.EditableMessage;
import com.facebook.aura.gateway.EditableMessageAttachment;
import com.facebook.aura.gateway.EditableMessageEditor;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.toast.api.ToastApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<AgentPermissionMessageEditorUiState> _uiState;
    public final String approvalId;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public boolean invalidated;
    public final String ownerGatewayUrl;
    public final HatchAgentPermissionsRepository repository;
    public final SingleFlight singleFlight;
    public final C1BN<AgentPermissionMessageEditorUiState> uiState;
    public boolean unavailableFromServer;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$1$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00181 extends AbstractC07127nr implements G2j<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, String, AuraSessionManager.SessionState, HtJ<? super Unit>, Object> {
            public int label;

            public C00181(HtJ<? super C00181> htJ) {
                super(4, htJ);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, AuraSessionManager.SessionState sessionState, HtJ<? super Unit> htJ) {
                return new C00181(htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, AuraSessionManager.SessionState sessionState, HtJ<? super Unit> htJ) {
                return new C00181(htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionMessageEditorViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel = AgentPermissionMessageEditorViewModel.this;
                AnonymousClass603 anonymousClass603A00 = C3rb.A00(new C00181(null), agentPermissionMessageEditorViewModel.repository.pendingApprovals, agentPermissionMessageEditorViewModel.gatewayPrefs.hatcheryVmIdFlow, AuraSessionManager.state);
                final AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel2 = AgentPermissionMessageEditorViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.1.2
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        agentPermissionMessageEditorViewModel2.updateAvailability();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        agentPermissionMessageEditorViewModel2.updateAvailability();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603A00.collect(c20z, this) == enumC10460Hji) {
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
            return AgentPermissionMessageEditorViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<AgentPermissionMessageEditorViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionMessageEditorViewModel create() {
            return new AgentPermissionMessageEditorViewModel(this.userSession, this.approvalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Operation {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Operation[] $VALUES;
        public static final Operation LOAD;
        public static final Operation SAVE;

        static {
            Operation operation = new Operation("LOAD", 0);
            LOAD = operation;
            Operation operation2 = new Operation("SAVE", 1);
            SAVE = operation2;
            Operation[] operationArr = {operation, operation2};
            $VALUES = operationArr;
            $ENTRIES = new F3w(operationArr);
        }

        public static Ey9<Operation> getEntries() {
            return $ENTRIES;
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }

        public Operation(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$refreshApprovals$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {280}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$refreshApprovals$1, reason: invalid class name and case insensitive filesystem */
    public final class C107491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C107491(HtJ<? super C107491> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionMessageEditorViewModel.this.new C107491(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = AgentPermissionMessageEditorViewModel.this.repository;
                this.label = 1;
                if (hatchAgentPermissionsRepository.refreshApprovals(this) == enumC10460Hji) {
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
            return AgentPermissionMessageEditorViewModel.this.new C107491(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$reload$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$reload$1, reason: invalid class name and case insensitive filesystem */
    public final class C107501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$reload$1$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {131, 132}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$reload$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00191 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AgentPermissionMessageEditorViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00191(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, HtJ<? super C00191> htJ) {
                super(1, htJ);
                this.this$0 = agentPermissionMessageEditorViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00191(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C00191(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r2 = 2
                    r1 = 1
                    if (r0 == 0) goto L2f
                    if (r0 == r1) goto L4b
                    if (r0 != r2) goto L5d
                    java.lang.Object r2 = X.AnonymousClass001.A0q(r5)
                L10:
                    X.C3cG.A1H(r4)
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r0 = r4.this$0
                    boolean r0 = com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.access$checkOwner(r0)
                    if (r0 == 0) goto L28
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r1 = r4.this$0
                    java.lang.Throwable r0 = X.HsJ.A00(r2)
                    if (r0 != 0) goto L2b
                    com.facebook.aura.gateway.EditableMessageEditor r2 = (com.facebook.aura.gateway.EditableMessageEditor) r2
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.access$applyEditor(r1, r2)
                L28:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L2b:
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.access$handleLoadFailure(r1, r0)
                    goto L28
                L2f:
                    X.Hwg.A00(r5)
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r0 = r4.this$0
                    com.facebook.aura.gateway.HatchAgentPermissionsRepository r0 = r0.repository
                    X.1BN<java.lang.Boolean> r0 = r0.hasLoadedServerApprovals
                    boolean r0 = X.C3cH.A1R(r0)
                    if (r0 != 0) goto L4e
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r0 = r4.this$0
                    com.facebook.aura.gateway.HatchAgentPermissionsRepository r0 = r0.repository
                    r4.label = r1
                    java.lang.Object r0 = r0.refreshApprovals(r4)
                    if (r0 != r3) goto L4e
                    return r3
                L4b:
                    X.Hwg.A00(r5)
                L4e:
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r0 = r4.this$0
                    com.facebook.aura.gateway.HatchAgentPermissionsRepository r1 = r0.repository
                    java.lang.String r0 = r0.approvalId
                    r4.label = r2
                    java.lang.Object r2 = r1.m951fetchEditableMessagegIAlus(r0, r4)
                    if (r2 != r3) goto L10
                    return r3
                L5d:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.C107501.C00191.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C107501(HtJ<? super C107501> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionMessageEditorViewModel.this.new C107501(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel = AgentPermissionMessageEditorViewModel.this;
                    SingleFlight singleFlight = agentPermissionMessageEditorViewModel.singleFlight;
                    Operation operation = Operation.LOAD;
                    C00191 c00191 = new C00191(agentPermissionMessageEditorViewModel, null);
                    this.label = 1;
                    if (singleFlight.invoke(operation, c00191, this) == enumC10460Hji) {
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
                if (AgentPermissionMessageEditorViewModel.this.checkOwner()) {
                    AgentPermissionMessageEditorViewModel.this.handleLoadFailure(e2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AgentPermissionMessageEditorViewModel.this.new C107501(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$removeAttachment$1, reason: invalid class name and case insensitive filesystem */
    public final class C107511 extends AbstractC7559F3s implements G0U<AgentPermissionMessageEditorUiState, AgentPermissionMessageEditorUiState> {
        public final /* synthetic */ String $id;

        @Override // X.G0U
        public final AgentPermissionMessageEditorUiState invoke(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState) {
            C7384Etj.A0Y(agentPermissionMessageEditorUiState, 0);
            List<EditableMessageAttachment> list = agentPermissionMessageEditorUiState.attachments;
            String str = this.$id;
            ArrayList arrayListA0h = C3cG.A0h();
            for (EditableMessageAttachment editableMessageAttachment : list) {
                AnonymousClass006.A1O(editableMessageAttachment.id, str, editableMessageAttachment, arrayListA0h);
            }
            return agentPermissionMessageEditorUiState.copy(agentPermissionMessageEditorUiState.editor, agentPermissionMessageEditorUiState.subject, agentPermissionMessageEditorUiState.body, arrayListA0h, agentPermissionMessageEditorUiState.loading, agentPermissionMessageEditorUiState.saving, agentPermissionMessageEditorUiState.saved, agentPermissionMessageEditorUiState.unavailable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107511(String str) {
            super(1);
            this.$id = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$save$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$save$1, reason: invalid class name and case insensitive filesystem */
    public final class C107521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AgentPermissionMessageEditorUiState $current;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$save$1$1", f = "AgentPermissionMessageEditorViewModel.kt", l = {163, 165}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$save$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00201 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ AgentPermissionMessageEditorUiState $current;
            public Object L$0;
            public int label;
            public final /* synthetic */ AgentPermissionMessageEditorViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00201(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, HtJ<? super C00201> htJ) {
                super(1, htJ);
                this.this$0 = agentPermissionMessageEditorViewModel;
                this.$current = agentPermissionMessageEditorUiState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00201(this.this$0, this.$current, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r10.label
                    r3 = 2
                    r9 = 1
                    if (r0 == 0) goto L46
                    if (r0 == r9) goto L56
                    if (r0 != r3) goto L7c
                    java.lang.Object r2 = X.AnonymousClass001.A0q(r11)
                L10:
                    X.C3cG.A1H(r10)
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r0 = r10.this$0
                    boolean r0 = com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.access$checkOwner(r0)
                    if (r0 == 0) goto L3f
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r1 = r10.this$0
                    java.lang.Throwable r0 = X.HsJ.A00(r2)
                    if (r0 != 0) goto L42
                    X.BLG<com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState> r1 = r1._uiState
                    java.lang.Object r2 = r1.getValue()
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r2 = (com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState) r2
                    r8 = 0
                    com.facebook.aura.gateway.EditableMessageEditor r3 = r2.editor
                    java.lang.String r4 = r2.subject
                    java.lang.String r5 = r2.body
                    java.util.List<com.facebook.aura.gateway.EditableMessageAttachment> r6 = r2.attachments
                    boolean r7 = r2.loading
                    boolean r10 = r2.unavailable
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
                    r1.Af8(r0)
                L3f:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L42:
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.access$handleSaveFailure(r1, r0)
                    goto L3f
                L46:
                    X.Hwg.A00(r11)
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r1 = r10.this$0
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r0 = r10.$current
                    r10.label = r9
                    java.lang.Object r2 = com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.m165access$saveDraftgIAlus(r1, r0, r10)
                    if (r2 != r4) goto L5a
                    return r4
                L56:
                    java.lang.Object r2 = X.AnonymousClass001.A0q(r11)
                L5a:
                    java.lang.Throwable r1 = X.HsJ.A00(r2)
                    boolean r0 = r1 instanceof com.facebook.aura.json.NetworkException
                    if (r0 == 0) goto L10
                    com.facebook.aura.json.NetworkException r1 = (com.facebook.aura.json.NetworkException) r1
                    if (r1 == 0) goto L10
                    int r1 = r1.httpResponseCode
                    r0 = 409(0x199, float:5.73E-43)
                    if (r1 != r0) goto L10
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel r2 = r10.this$0
                    com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r1 = r10.$current
                    r0 = 0
                    r10.L$0 = r0
                    r10.label = r3
                    java.lang.Object r2 = com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.m165access$saveDraftgIAlus(r2, r1, r10)
                    if (r2 != r4) goto L10
                    return r4
                L7c:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.C107521.C00201.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C00201) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107521(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, HtJ<? super C107521> htJ) {
            super(2, htJ);
            this.$current = agentPermissionMessageEditorUiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionMessageEditorViewModel.this.new C107521(this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel = AgentPermissionMessageEditorViewModel.this;
                    SingleFlight singleFlight = agentPermissionMessageEditorViewModel.singleFlight;
                    Operation operation = Operation.SAVE;
                    C00201 c00201 = new C00201(agentPermissionMessageEditorViewModel, this.$current, null);
                    this.label = 1;
                    if (singleFlight.invoke(operation, c00201, this) == enumC10460Hji) {
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
                if (AgentPermissionMessageEditorViewModel.this.checkOwner()) {
                    AgentPermissionMessageEditorViewModel.this.handleSaveFailure(e2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C107521) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$updateBody$1, reason: invalid class name and case insensitive filesystem */
    public final class C107531 extends AbstractC7559F3s implements G0U<AgentPermissionMessageEditorUiState, AgentPermissionMessageEditorUiState> {
        public final /* synthetic */ String $body;

        @Override // X.G0U
        public final AgentPermissionMessageEditorUiState invoke(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState) {
            C7384Etj.A0Y(agentPermissionMessageEditorUiState, 0);
            return agentPermissionMessageEditorUiState.copy(agentPermissionMessageEditorUiState.editor, agentPermissionMessageEditorUiState.subject, this.$body, agentPermissionMessageEditorUiState.attachments, agentPermissionMessageEditorUiState.loading, agentPermissionMessageEditorUiState.saving, agentPermissionMessageEditorUiState.saved, agentPermissionMessageEditorUiState.unavailable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107531(String str) {
            super(1);
            this.$body = str;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel$updateSubject$1, reason: invalid class name and case insensitive filesystem */
    public final class C107541 extends AbstractC7559F3s implements G0U<AgentPermissionMessageEditorUiState, AgentPermissionMessageEditorUiState> {
        public final /* synthetic */ String $subject;

        @Override // X.G0U
        public final AgentPermissionMessageEditorUiState invoke(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState) {
            C7384Etj.A0Y(agentPermissionMessageEditorUiState, 0);
            return agentPermissionMessageEditorUiState.copy(agentPermissionMessageEditorUiState.editor, this.$subject, agentPermissionMessageEditorUiState.body, agentPermissionMessageEditorUiState.attachments, agentPermissionMessageEditorUiState.loading, agentPermissionMessageEditorUiState.saving, agentPermissionMessageEditorUiState.saved, agentPermissionMessageEditorUiState.unavailable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107541(String str) {
            super(1);
            this.$subject = str;
        }
    }

    public AgentPermissionMessageEditorViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, str);
        this.userSession = abstractC3358CGz;
        this.approvalId = str;
        this.repository = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGz);
        this.gatewayPrefs = hatchGatewayPrefsStoreA0D;
        this.ownerGatewayUrl = hatchGatewayPrefsStoreA0D.getGatewayUrl();
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, zA1a ? 1 : 0);
        this.singleFlight = new LazyStartSingleFlightImpl(join);
        C9286GCn c9286GCnA14 = C3cG.A14(new AgentPermissionMessageEditorUiState(null, "", "", C0881AGi.A00, false, false, false, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyEditor(EditableMessageEditor editableMessageEditor) {
        if (!C7384Etj.areEqual(editableMessageEditor.gatewayUrl, this.ownerGatewayUrl)) {
            BLG<AgentPermissionMessageEditorUiState> blg = this._uiState;
            AgentPermissionMessageEditorUiState value = blg.getValue();
            blg.Af8(value.copy(value.editor, value.subject, value.body, value.attachments, false, value.saving, value.saved, value.unavailable));
        } else {
            this.unavailableFromServer = false;
            BLG<AgentPermissionMessageEditorUiState> blg2 = this._uiState;
            String str = editableMessageEditor.isEmail() ? editableMessageEditor.message.subject : "";
            EditableMessage editableMessage = editableMessageEditor.message;
            AnonymousClass002.A1I(blg2, new AgentPermissionMessageEditorUiState(editableMessageEditor, str, editableMessage.body, editableMessage.attachments, false, false, false, false));
            updateAvailability();
        }
    }

    public final void removeAttachment(String str) {
        C7384Etj.A0Y(str, 0);
        C3cI.A1C(HatchComponent.ATTACHMENT_DISMISS_BUTTON, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET, currentApproval());
        updateDraft(new C107511(str));
    }

    public final void updateBody(String str) {
        C7384Etj.A0Y(str, 0);
        updateDraft(new C107531(str));
    }

    public final void updateSubject(String str) {
        C7384Etj.A0Y(str, 0);
        EditableMessageEditor editableMessageEditor = this._uiState.getValue().editor;
        if (editableMessageEditor == null || !editableMessageEditor.isEmail()) {
            return;
        }
        updateDraft(new C107541(str));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentPermissionMessageEditorError.values().length];
            try {
                AnonymousClass002.A13(AgentPermissionMessageEditorError.SAVE_FAILED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentPermissionMessageEditorError.INVALID_MESSAGE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentPermissionMessageEditorError.SUBJECT_TOO_LONG, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentPermissionMessageEditorError.BODY_TOO_LONG, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentPermissionMessageEditorError.EMPTY_MESSAGE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkOwner() {
        if (!this.invalidated) {
            if (AuraSessionManager.INSTANCE.isCurrentSession(this.userSession) && C7384Etj.areEqual(this.ownerGatewayUrl, this.gatewayPrefs.getGatewayUrl())) {
                return true;
            }
            this.invalidated = true;
            AnonymousClass001.A1E(this._uiState, null, new AgentPermissionMessageEditorUiState(null, "", "", C0881AGi.A00, false, false, false, true));
            Hxb.A03(null, AEu.A00(this));
        }
        return false;
    }

    private final HatchAgentPermissionsRepository.AgentPermissionApproval currentApproval() {
        Object next;
        Iterator itA0z = C3cI.A0z(this.repository.pendingApprovals);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            }
            next = itA0z.next();
            if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId)) {
                break;
            }
        }
        return (HatchAgentPermissionsRepository.AgentPermissionApproval) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadFailure(Throwable th) {
        int iIntValue;
        NetworkException networkException;
        Integer numValueOf = null;
        if ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null) {
            numValueOf = Integer.valueOf(networkException.httpResponseCode);
        }
        if (numValueOf != null && ((iIntValue = numValueOf.intValue()) == 404 || iIntValue == 409)) {
            this.unavailableFromServer = true;
        }
        BLG<AgentPermissionMessageEditorUiState> blg = this._uiState;
        AgentPermissionMessageEditorUiState value = blg.getValue();
        blg.Af8(value.copy(value.editor, value.subject, value.body, value.attachments, false, value.saving, value.saved, value.unavailable));
        updateAvailability();
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            if (iIntValue2 == 404 || iIntValue2 == 409) {
                refreshApprovals();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSaveFailure(Throwable th) {
        NetworkException networkException;
        Integer numValueOf = null;
        if (th instanceof NetworkException) {
            networkException = (NetworkException) th;
            if (networkException != null) {
                numValueOf = Integer.valueOf(networkException.httpResponseCode);
            }
        } else {
            networkException = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 404) {
            this.unavailableFromServer = true;
        }
        BLG<AgentPermissionMessageEditorUiState> blg = this._uiState;
        AgentPermissionMessageEditorUiState value = blg.getValue();
        blg.Af8(value.copy(value.editor, value.subject, value.body, value.attachments, value.loading, false, value.saved, value.unavailable));
        updateAvailability();
        if (!this._uiState.getValue().unavailable) {
            showErrorToast((numValueOf != null && numValueOf.intValue() == 400 && "invalid_params".equals(networkException.errorCode)) ? AgentPermissionMessageEditorError.INVALID_MESSAGE : AgentPermissionMessageEditorError.SAVE_FAILED);
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue == 404 || iIntValue == 409) {
                refreshApprovals();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* renamed from: saveDraft-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m166saveDraftgIAlus(com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r17, X.HtJ<? super X.HsJ<kotlin.Unit>> r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.m166saveDraftgIAlus(com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState, X.HtJ):java.lang.Object");
    }

    public final C1BN<AgentPermissionMessageEditorUiState> getUiState() {
        return this.uiState;
    }

    public final void onCancelTapped() {
        Object next;
        HatchComponent hatchComponent = HatchComponent.CANCEL_BUTTON;
        HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET;
        Iterator itA0z = C3cI.A0z(this.repository.pendingApprovals);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            } else {
                next = itA0z.next();
                if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId)) {
                    break;
                }
            }
        }
        C3cI.A1C(hatchComponent, hatchScreen, (HatchAgentPermissionsRepository.AgentPermissionApproval) next);
    }

    public final void save() {
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.EMAIL_SAVE_BUTTON, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET, currentApproval(), null, null, 1);
        updateAvailability();
        AgentPermissionMessageEditorUiState value = this._uiState.getValue();
        if (value.getCanSave()) {
            AgentPermissionMessageEditorError agentPermissionMessageEditorErrorValidationError$fbandroid_express_aura_java_com_facebook_aura_agentpermission_agentpermission = value.validationError$fbandroid_express_aura_java_com_facebook_aura_agentpermission_agentpermission();
            if (agentPermissionMessageEditorErrorValidationError$fbandroid_express_aura_java_com_facebook_aura_agentpermission_agentpermission != null) {
                showErrorToast(agentPermissionMessageEditorErrorValidationError$fbandroid_express_aura_java_com_facebook_aura_agentpermission_agentpermission);
                return;
            }
            this._uiState.Af8(value.copy(value.editor, value.subject, value.body, value.attachments, value.loading, true, value.saved, value.unavailable));
            AnonymousClass001.A1J(new C107521(value, null), AEu.A00(this));
        }
    }

    private final void refreshApprovals() {
        AnonymousClass001.A1J(new C107491(null), AEu.A00(this));
    }

    private final void showErrorToast(AgentPermissionMessageEditorError agentPermissionMessageEditorError) {
        int i;
        int iOrdinal = agentPermissionMessageEditorError.ordinal();
        if (iOrdinal == 0) {
            i = R.string._name_removed__res_0x7f1200cb;
        } else if (iOrdinal == 1) {
            i = R.string._name_removed__res_0x7f1200c9;
        } else if (iOrdinal == 2) {
            i = R.string._name_removed__res_0x7f1200ce;
        } else if (iOrdinal == 3) {
            i = R.string._name_removed__res_0x7f1200c5;
        } else {
            if (iOrdinal != 4) {
                throw C3cG.A0q();
            }
            i = R.string._name_removed__res_0x7f1200c7;
        }
        ToastApi.INSTANCE.showToast(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAvailability() {
        /*
            r12 = this;
            boolean r0 = r12.checkOwner()
            if (r0 == 0) goto L40
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r3 = r12.currentApproval()
            X.BLG<com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState> r0 = r12._uiState
            java.lang.Object r4 = r0.getValue()
            com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r4 = (com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState) r4
            X.BLG<com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState> r2 = r12._uiState
            boolean r0 = r12.unavailableFromServer
            r1 = 1
            if (r0 != 0) goto L2a
            if (r3 == 0) goto L2a
            boolean r0 = r3.editableMessageAvailable
            if (r0 != r1) goto L2a
            com.facebook.aura.gateway.ApprovalRecord r0 = r3.approvalRecord
            if (r0 == 0) goto L41
            com.facebook.aura.gateway.ApprovalRecordStatus r1 = r0.status
        L25:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.PENDING
            r12 = 0
            if (r1 == r0) goto L2b
        L2a:
            r12 = 1
        L2b:
            com.facebook.aura.gateway.EditableMessageEditor r5 = r4.editor
            java.lang.String r6 = r4.subject
            java.lang.String r7 = r4.body
            java.util.List<com.facebook.aura.gateway.EditableMessageAttachment> r8 = r4.attachments
            boolean r9 = r4.loading
            boolean r10 = r4.saving
            boolean r11 = r4.saved
            com.facebook.aura.agentpermission.AgentPermissionMessageEditorUiState r0 = r4.copy(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Af8(r0)
        L40:
            return
        L41:
            r1 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel.updateAvailability():void");
    }

    private final void updateDraft(G0U<? super AgentPermissionMessageEditorUiState, AgentPermissionMessageEditorUiState> g0u) {
        updateAvailability();
        AgentPermissionMessageEditorUiState value = this._uiState.getValue();
        if (value.getCanSave()) {
            this._uiState.Af8(g0u.invoke(value));
        }
    }

    public final void reload() {
        boolean z;
        boolean z2;
        if (checkOwner()) {
            AgentPermissionMessageEditorUiState value = this._uiState.getValue();
            if (value.loading || (z = value.saving) || (z2 = value.saved)) {
                return;
            }
            this._uiState.Af8(value.copy(value.editor, value.subject, value.body, value.attachments, true, z, z2, value.unavailable));
            AnonymousClass001.A1J(new C107501(null), AEu.A00(this));
        }
    }
}
