package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7BY;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<WorkspaceEntry> $entryToRename$delegate;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ WorkspaceEntry $renameEntry;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$4$1$1", f = "WorkspaceEntryActionsHost.kt", l = {138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ WorkspaceEntry $renameEntry;
        public final /* synthetic */ String $trimmedName;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkspaceEntry workspaceEntry, String str, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$renameEntry = workspaceEntry;
            this.$trimmedName = str;
            this.$userSession = abstractC3358CGz;
            this.$onRefresh = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$renameEntry, this.$trimmedName, this.$userSession, this.$onRefresh, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String strA0X = C7BY.A0X(this.$renameEntry.relativePath, CustomConnectorRegisterRepositoryKt.ROOT_PATH, "");
                int length = strA0X.length();
                String strA0U = this.$trimmedName;
                if (length != 0) {
                    strA0U = FGI.A0U(strA0X, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0U);
                }
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str = this.$renameEntry.relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = hatchFileOperations.renameFile(str, strA0U, abstractC3358CGz, true, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj instanceof HatchFileOperations.RenameResult.Success) {
                this.$onRefresh.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$4$1(WorkspaceEntry workspaceEntry, C3UX c3ux, MutableState<String> mutableState, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, MutableState<WorkspaceEntry> mutableState2) {
        super(0);
        this.$renameEntry = workspaceEntry;
        this.$coroutineScope = c3ux;
        this.$renameText$delegate = mutableState;
        this.$userSession = abstractC3358CGz;
        this.$onRefresh = function0;
        this.$entryToRename$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WorkspaceEntryActionsHostKt.logWorkspaceClick(HatchComponent.WORKSPACE_RENAME_CONFIRM_BUTTON, this.$renameEntry);
        String strA06 = MutableState.A06((MutableState) this.$renameText$delegate);
        if (strA06.length() > 0) {
            WorkspaceEntry workspaceEntry = this.$renameEntry;
            if (!strA06.equals(workspaceEntry.name)) {
                AnonymousClass001.A1J(new AnonymousClass1(workspaceEntry, strA06, this.$userSession, this.$onRefresh, null), this.$coroutineScope);
            }
        }
        this.$entryToRename$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
