package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C27k;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchDeleteLogger;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ WorkspaceEntry $deleteEntry;
    public final /* synthetic */ String $deleteLoggerSource;
    public final /* synthetic */ MutableState<WorkspaceEntry> $entryToDelete$delegate;
    public final /* synthetic */ boolean $isDirectory;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$1$1$1", f = "WorkspaceEntryActionsHost.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C27k<Boolean> $deletion;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C27k<Boolean> c27k, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$deletion = c27k;
            this.$onRefresh = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$deletion, this.$onRefresh, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C78T c78t = this.$deletion;
                this.label = 1;
                obj = ((GBM) c78t).A0E(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
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
    public WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$1$1(WorkspaceEntry workspaceEntry, String str, AbstractC3358CGz abstractC3358CGz, boolean z, C3UX c3ux, Function0<Unit> function0, MutableState<WorkspaceEntry> mutableState) {
        super(0);
        this.$deleteEntry = workspaceEntry;
        this.$deleteLoggerSource = str;
        this.$userSession = abstractC3358CGz;
        this.$isDirectory = z;
        this.$coroutineScope = c3ux;
        this.$onRefresh = function0;
        this.$entryToDelete$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WorkspaceEntryActionsHostKt.logWorkspaceClick(HatchComponent.WORKSPACE_DELETE_CONFIRM_BUTTON, this.$deleteEntry);
        HatchDeleteLogger hatchDeleteLogger = HatchDeleteLogger.INSTANCE;
        String str = this.$deleteLoggerSource;
        WorkspaceEntry workspaceEntry = this.$deleteEntry;
        hatchDeleteLogger.logDeleteConfirmed(str, workspaceEntry.relativePath, workspaceEntry.name);
        C27k<Boolean> c27kDeleteMedia = HatchMediaDeletionManager.Companion.getInstance(this.$userSession).deleteMedia(this.$deleteEntry.relativePath, this.$isDirectory);
        AnonymousClass001.A1J(new AnonymousClass1(c27kDeleteMedia, this.$onRefresh, null), this.$coroutineScope);
        this.$entryToDelete$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
