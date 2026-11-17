package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDownloadClick$1$1 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDownloadClick$1$1$1", f = "WorkspaceEntryActionsHost.kt", l = {79}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDownloadClick$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, WorkspaceEntry workspaceEntry, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$entry = workspaceEntry;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$entry, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                Context context = this.$context;
                WorkspaceEntry workspaceEntry = this.$entry;
                HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(workspaceEntry.relativePath, workspaceEntry.name);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileActions.download(context, workspace, abstractC3358CGz, true, null, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, workspaceEntry, this.$userSession, null), this.$coroutineScope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDownloadClick$1$1(C3UX c3ux, Context context, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry) {
        invoke2(workspaceEntry);
        return Unit.INSTANCE;
    }
}
