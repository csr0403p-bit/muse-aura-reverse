package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import com.facebook.aura.skills.repo.TaskPermissionMethod;
import com.facebook.aura.skills.repo.TaskPermissions;
import com.facebook.aura.skills.repo.TaskPermissionsRepository;
import com.facebook.aura.skills.repo.TaskWebsitePermission;
import com.facebook.aura.toast.api.ToastApi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class TaskPermissionsViewModel extends AEs {
    public final BLG<TaskPermissionsUiState> _uiState;
    public boolean hasLoadedConnectors;
    public final TaskPermissionsRepository repository;
    public final SingleFlight singleFlight;
    public final C1BN<TaskPermissionsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<TaskPermissionsViewModel> {
        public final String taskId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public TaskPermissionsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            String str = this.taskId;
            return new TaskPermissionsViewModel(abstractC3358CGz, str, new TaskPermissionsRepository(abstractC3358CGz, str));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.taskId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel", f = "TaskPermissionsViewModel.kt", l = {73, 82}, m = "loadPermissions", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$loadPermissions$1, reason: invalid class name */
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
            return TaskPermissionsViewModel.this.loadPermissions(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$refresh$2", f = "TaskPermissionsViewModel.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$refresh$2$1", f = "TaskPermissionsViewModel.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$refresh$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ TaskPermissionsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TaskPermissionsViewModel taskPermissionsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = taskPermissionsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    TaskPermissionsViewModel taskPermissionsViewModel = this.this$0;
                    this.label = 1;
                    if (taskPermissionsViewModel.loadPermissions(this) == enumC10460Hji) {
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

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TaskPermissionsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TaskPermissionsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TaskPermissionsViewModel taskPermissionsViewModel = TaskPermissionsViewModel.this;
                SingleFlight singleFlight = taskPermissionsViewModel.singleFlight;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(taskPermissionsViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, anonymousClass1, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$revokeWebsite$2", f = "TaskPermissionsViewModel.kt", l = {155, 171}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$revokeWebsite$2, reason: invalid class name and case insensitive filesystem */
    public final class C138802 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ TaskWebsitePermission $permission;
        public final /* synthetic */ String $permissionId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138802(TaskWebsitePermission taskWebsitePermission, String str, HtJ<? super C138802> htJ) {
            super(2, htJ);
            this.$permission = taskWebsitePermission;
            this.$permissionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TaskPermissionsViewModel.this.new C138802(this.$permission, this.$permissionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2130revokeWebsitegIAlus;
            TaskPermissionsUiState value;
            TaskPermissionsUiState taskPermissionsUiState;
            TaskPermissionsUiState value2;
            TaskPermissionsUiState taskPermissionsUiState2;
            TaskPermissions taskPermissionsCopy;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TaskPermissionsRepository taskPermissionsRepository = TaskPermissionsViewModel.this.repository;
                TaskWebsitePermission taskWebsitePermission = this.$permission;
                this.label = 1;
                objM2130revokeWebsitegIAlus = taskPermissionsRepository.m2130revokeWebsitegIAlus(taskWebsitePermission, this);
                if (objM2130revokeWebsitegIAlus == enumC10460Hji) {
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
                objM2130revokeWebsitegIAlus = AnonymousClass001.A0q(obj);
            }
            TaskPermissionsViewModel taskPermissionsViewModel = TaskPermissionsViewModel.this;
            String str = this.$permissionId;
            Throwable thA00 = HsJ.A00(objM2130revokeWebsitegIAlus);
            BLG<TaskPermissionsUiState> blg = taskPermissionsViewModel._uiState;
            if (thA00 == null) {
                do {
                    value2 = blg.getValue();
                    taskPermissionsUiState2 = value2;
                    TaskPermissions taskPermissions = taskPermissionsUiState2.permissions;
                    if (taskPermissions != null) {
                        AHD<TaskWebsitePermission> ahd = taskPermissions.websites;
                        ArrayList arrayListA0h = C3cG.A0h();
                        for (Object obj2 : ahd) {
                            AnonymousClass006.A1O(((TaskWebsitePermission) obj2).id, str, obj2, arrayListA0h);
                        }
                        taskPermissionsCopy = taskPermissions.copy(taskPermissions.revision, taskPermissions.connectors, AGI.A07(arrayListA0h));
                    } else {
                        taskPermissionsCopy = null;
                    }
                } while (!blg.A6e(value2, taskPermissionsUiState2.copy(taskPermissionsCopy, taskPermissionsUiState2.connectedConnectors, taskPermissionsUiState2.loadingState, taskPermissionsUiState2.updatingMethodKey, taskPermissionsUiState2.revokingWebsiteId)));
                this.L$0 = null;
                this.label = 2;
                if (taskPermissionsViewModel.loadPermissions(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                do {
                    value = blg.getValue();
                    taskPermissionsUiState = value;
                } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, taskPermissionsUiState.loadingState, taskPermissionsUiState.updatingMethodKey, null)));
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1210dd);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138802) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$setMethodMode$2", f = "TaskPermissionsViewModel.kt", l = {132, 134, 139}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$setMethodMode$2, reason: invalid class name and case insensitive filesystem */
    public final class C138812 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $methodKey;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ TaskPermissions $permissions;
        public final /* synthetic */ String $taskName;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138812(TaskPermissions taskPermissions, String str, String str2, ConnectorPermissionMode connectorPermissionMode, String str3, HtJ<? super C138812> htJ) {
            super(2, htJ);
            this.$permissions = taskPermissions;
            this.$connectorId = str;
            this.$methodKey = str2;
            this.$mode = connectorPermissionMode;
            this.$taskName = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TaskPermissionsViewModel.this.new C138812(this.$permissions, this.$connectorId, this.$methodKey, this.$mode, this.$taskName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2131setMethodModehUnOzRk;
            TaskPermissionsUiState value;
            TaskPermissionsUiState taskPermissionsUiState;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TaskPermissionsRepository taskPermissionsRepository = TaskPermissionsViewModel.this.repository;
                String str = this.$permissions.revision;
                String str2 = this.$connectorId;
                String str3 = this.$methodKey;
                ConnectorPermissionMode connectorPermissionMode = this.$mode;
                String str4 = this.$taskName;
                this.label = 1;
                objM2131setMethodModehUnOzRk = taskPermissionsRepository.m2131setMethodModehUnOzRk(str, str2, str3, connectorPermissionMode, str4, this);
                if (objM2131setMethodModehUnOzRk == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                objM2131setMethodModehUnOzRk = AnonymousClass001.A0q(obj);
            }
            TaskPermissionsViewModel taskPermissionsViewModel = TaskPermissionsViewModel.this;
            Throwable thA00 = HsJ.A00(objM2131setMethodModehUnOzRk);
            if (thA00 == null) {
                this.L$0 = null;
                this.label = 2;
            } else {
                BLG<TaskPermissionsUiState> blg = taskPermissionsViewModel._uiState;
                do {
                    value = blg.getValue();
                    taskPermissionsUiState = value;
                } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, taskPermissionsUiState.loadingState, null, taskPermissionsUiState.revokingWebsiteId)));
                if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null || networkException.httpResponseCode != 409) {
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12014b);
                    return Unit.INSTANCE;
                }
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1210da);
                this.L$0 = null;
                this.label = 3;
            }
            if (taskPermissionsViewModel.loadPermissions(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138812) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TaskPermissionsViewModel(AbstractC3358CGz abstractC3358CGz, String str, TaskPermissionsRepository taskPermissionsRepository) {
        AnonymousClass002.A1A(abstractC3358CGz, 0, taskPermissionsRepository);
        this.repository = taskPermissionsRepository;
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        C9286GCn c9286GCnA14 = C3cG.A14(new TaskPermissionsUiState(null, AHI.A01, SkillPermissionsLoadingState.IDLE, null, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        refresh();
    }

    public final void revokeWebsite(String str) {
        AHD<TaskWebsitePermission> ahd;
        Object next;
        TaskPermissionsUiState value;
        TaskPermissionsUiState taskPermissionsUiState;
        C7384Etj.A0Y(str, 0);
        TaskPermissionsUiState value2 = this._uiState.getValue();
        TaskPermissions taskPermissions = value2.permissions;
        if (taskPermissions == null || (ahd = taskPermissions.websites) == null) {
            return;
        }
        Iterator it = ahd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (str.equals(((TaskWebsitePermission) next).id)) {
                    break;
                }
            }
        }
        TaskWebsitePermission taskWebsitePermission = (TaskWebsitePermission) next;
        if (taskWebsitePermission == null || value2.isBusy() || !taskWebsitePermission.revocable) {
            return;
        }
        BLG<TaskPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            taskPermissionsUiState = value;
        } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, taskPermissionsUiState.loadingState, taskPermissionsUiState.updatingMethodKey, str)));
        AnonymousClass001.A1J(new C138802(taskWebsitePermission, str, null), AEu.A00(this));
    }

    public final void setMethodMode(String str, String str2, ConnectorPermissionMode connectorPermissionMode, String str3) {
        Object obj;
        Object next;
        AHD<TaskPermissionMethod> ahd;
        TaskPermissionsUiState value;
        TaskPermissionsUiState taskPermissionsUiState;
        AnonymousClass005.A0y(str, str2, str3);
        TaskPermissionsUiState value2 = this._uiState.getValue();
        TaskPermissions taskPermissions = value2.permissions;
        if (taskPermissions != null) {
            Iterator it = taskPermissions.connectors.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (str.equals(((TaskConnectorPermissions) next).id)) {
                        break;
                    }
                }
            }
            TaskConnectorPermissions taskConnectorPermissions = (TaskConnectorPermissions) next;
            if (taskConnectorPermissions == null || (ahd = taskConnectorPermissions.methods) == null) {
                return;
            }
            Iterator it2 = ahd.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (str2.equals(((TaskPermissionMethod) next2).key)) {
                    obj = next2;
                    break;
                }
            }
            TaskPermissionMethod taskPermissionMethod = (TaskPermissionMethod) obj;
            if (taskPermissionMethod == null || value2.isBusy()) {
                return;
            }
            if (connectorPermissionMode != null) {
                if (!taskPermissionMethod.modeOptions.contains(connectorPermissionMode)) {
                    return;
                }
            } else if (taskPermissionMethod.overrideMode == null) {
                return;
            }
            BLG<TaskPermissionsUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                taskPermissionsUiState = value;
            } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, taskPermissionsUiState.loadingState, str2, taskPermissionsUiState.revokingWebsiteId)));
            AnonymousClass001.A1J(new C138812(taskPermissions, str, str2, connectorPermissionMode, str3, null), AEu.A00(this));
        }
    }

    private final void applyPermissions(TaskPermissions taskPermissions) {
        TaskPermissionsUiState value;
        TaskPermissionsUiState taskPermissionsUiState;
        BLG<TaskPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            taskPermissionsUiState = value;
        } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissions, taskPermissionsUiState.connectedConnectors, SkillPermissionsLoadingState.SUCCESS, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[LOOP:1: B:36:0x009f->B:38:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPermissions(X.HtJ<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel.AnonymousClass1
            if (r0 == 0) goto Lbf
            r1 = r14
            com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$loadPermissions$1 r1 = (com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel.AnonymousClass1) r1
            int r3 = r1.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lbf
            int r3 = r3 - r2
            r1.label = r3
        L12:
            java.lang.Object r5 = r1.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r1.label
            r3 = 2
            r0 = 1
            if (r4 == 0) goto L32
            if (r4 == r0) goto L61
            if (r4 != r3) goto Lc6
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L24:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lba
            com.facebook.aura.skills.repo.TaskPermissions r1 = (com.facebook.aura.skills.repo.TaskPermissions) r1
            r13.applyPermissions(r1)
        L2f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L32:
            X.Hwg.A00(r5)
            X.BLG<com.facebook.aura.skills.viewmodel.TaskPermissionsUiState> r6 = r13._uiState
        L37:
            java.lang.Object r5 = r6.getValue()
            r7 = r5
            com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r7 = (com.facebook.aura.skills.viewmodel.TaskPermissionsUiState) r7
            com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState r10 = com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState.LOADING
            com.facebook.aura.skills.repo.TaskPermissions r8 = r7.permissions
            X.AHD<com.facebook.aura.skills.model.Skill> r9 = r7.connectedConnectors
            java.lang.String r11 = r7.updatingMethodKey
            java.lang.String r12 = r7.revokingWebsiteId
            com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r4 = r7.copy(r8, r9, r10, r11, r12)
            boolean r4 = r6.A6e(r5, r4)
            if (r4 == 0) goto L37
            boolean r4 = r13.hasLoadedConnectors
            if (r4 != 0) goto L8b
            com.facebook.aura.skills.repo.TaskPermissionsRepository r4 = r13.repository
            r1.label = r0
            java.lang.Object r9 = r4.m2128fetchConnectedConnectorsIoAF18A(r1)
            if (r9 != r2) goto L65
            return r2
        L61:
            java.lang.Object r9 = X.AnonymousClass001.A0q(r5)
        L65:
            boolean r4 = r9 instanceof X.C10571Hud
            if (r4 == 0) goto L6a
            r9 = 0
        L6a:
            X.AHD r9 = (X.AHD) r9
            if (r9 == 0) goto Lba
            X.BLG<com.facebook.aura.skills.viewmodel.TaskPermissionsUiState> r6 = r13._uiState
        L70:
            java.lang.Object r5 = r6.getValue()
            r7 = r5
            com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r7 = (com.facebook.aura.skills.viewmodel.TaskPermissionsUiState) r7
            com.facebook.aura.skills.repo.TaskPermissions r8 = r7.permissions
            com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState r10 = r7.loadingState
            java.lang.String r11 = r7.updatingMethodKey
            java.lang.String r12 = r7.revokingWebsiteId
            com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r4 = r7.copy(r8, r9, r10, r11, r12)
            boolean r4 = r6.A6e(r5, r4)
            if (r4 == 0) goto L70
            r13.hasLoadedConnectors = r0
        L8b:
            com.facebook.aura.skills.repo.TaskPermissionsRepository r6 = r13.repository
            X.BLG<com.facebook.aura.skills.viewmodel.TaskPermissionsUiState> r0 = r13._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.skills.viewmodel.TaskPermissionsUiState r0 = (com.facebook.aura.skills.viewmodel.TaskPermissionsUiState) r0
            X.AHD<com.facebook.aura.skills.model.Skill> r0 = r0.connectedConnectors
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r4 = r0.iterator()
        L9f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r4.next()
            com.facebook.aura.skills.model.Skill r0 = (com.facebook.aura.skills.model.Skill) r0
            java.lang.String r0 = r0.id
            r5.add(r0)
            goto L9f
        Lb1:
            r1.label = r3
            java.lang.Object r1 = r6.m2129fetchPermissionsgIAlus(r5, r1)
            if (r1 != r2) goto L24
            return r2
        Lba:
            r13.onLoadFailed()
            goto L2f
        Lbf:
            com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$loadPermissions$1 r1 = new com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel$loadPermissions$1
            r1.<init>(r14)
            goto L12
        Lc6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel.loadPermissions(X.HtJ):java.lang.Object");
    }

    private final void onLoadFailed() {
        TaskPermissionsUiState value;
        TaskPermissionsUiState taskPermissionsUiState;
        BLG<TaskPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            taskPermissionsUiState = value;
        } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, SkillPermissionsLoadingState.ERROR, null, null)));
    }

    public final C1BN<TaskPermissionsUiState> getUiState() {
        return this.uiState;
    }

    public final void refresh() {
        TaskPermissionsUiState value;
        TaskPermissionsUiState taskPermissionsUiState;
        TaskPermissionsUiState value2 = this._uiState.getValue();
        SkillPermissionsLoadingState skillPermissionsLoadingState = value2.loadingState;
        SkillPermissionsLoadingState skillPermissionsLoadingState2 = SkillPermissionsLoadingState.LOADING;
        if (skillPermissionsLoadingState != skillPermissionsLoadingState2 && value2.updatingMethodKey == null && value2.revokingWebsiteId == null) {
            BLG<TaskPermissionsUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                taskPermissionsUiState = value;
            } while (!blg.A6e(value, taskPermissionsUiState.copy(taskPermissionsUiState.permissions, taskPermissionsUiState.connectedConnectors, skillPermissionsLoadingState2, taskPermissionsUiState.updatingMethodKey, taskPermissionsUiState.revokingWebsiteId)));
            AnonymousClass001.A1J(new AnonymousClass2(null), AEu.A00(this));
        }
    }

    public /* synthetic */ TaskPermissionsViewModel(AbstractC3358CGz abstractC3358CGz, String str, TaskPermissionsRepository taskPermissionsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, str, (i & 4) != 0 ? new TaskPermissionsRepository(abstractC3358CGz, str) : taskPermissionsRepository);
    }
}
