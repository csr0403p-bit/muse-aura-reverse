package com.facebook.aura.file.view;

import X.AOI;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.C1003AOr;
import X.C1Cd;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import android.graphics.Bitmap;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Integer $childCount;
    public final /* synthetic */ int $depth;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ AOI<Boolean> $entryVisibleState;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDeleteClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDownloadClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onEntryClick;
    public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onRenameClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onToggleFolder;

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ Integer $childCount;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDeleteClick;
        public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDownloadClick;
        public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onEntryClick;
        public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onRenameClick;
        public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onToggleFolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(WorkspaceEntry workspaceEntry, boolean z, boolean z2, Integer num, G0U<? super WorkspaceEntry, Unit> g0u, G0U<? super WorkspaceEntry, Unit> g0u2, G0U<? super WorkspaceEntry, Unit> g0u3, G0U<? super WorkspaceEntry, Unit> g0u4, G0U<? super WorkspaceEntry, Unit> g0u5, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, int i) {
            super(3);
            this.$entry = workspaceEntry;
            this.$isExpanded = z;
            this.$isLoading = z2;
            this.$childCount = num;
            this.$onEntryClick = g0u;
            this.$onToggleFolder = g0u2;
            this.$onRenameClick = g0u3;
            this.$onDeleteClick = g0u4;
            this.$onDownloadClick = g0u5;
            this.$onNavigateToConversation = g0v;
            this.$depth = i;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                WorkspaceEntry workspaceEntry = this.$entry;
                boolean z = this.$isExpanded;
                boolean z2 = this.$isLoading;
                Integer num = this.$childCount;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onEntryClick, bfm.A67(workspaceEntry));
                WorkspaceEntry workspaceEntry2 = this.$entry;
                G0U<WorkspaceEntry, Unit> g0u = this.$onEntryClick;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$1$1(workspaceEntry2, g0u);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onToggleFolder, AnonymousClass001.A1T(bfm, this.$entry, bfm.A66(this.$isExpanded)));
                boolean z3 = this.$isExpanded;
                WorkspaceEntry workspaceEntry3 = this.$entry;
                G0U<WorkspaceEntry, Unit> g0u2 = this.$onToggleFolder;
                Object objAaT2 = bfm.AaT();
                if (zA1R2 || objAaT2 == C78N.A00) {
                    objAaT2 = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$2$1(z3, workspaceEntry3, g0u2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$entry, bfm.A65(this.$onRenameClick));
                G0U<WorkspaceEntry, Unit> g0u3 = this.$onRenameClick;
                WorkspaceEntry workspaceEntry4 = this.$entry;
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == C78N.A00) {
                    objAaT3 = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$3$1(g0u3, workspaceEntry4);
                    bfm.Ai0(objAaT3);
                }
                Function0 function03 = (Function0) objAaT3;
                boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$entry, bfm.A65(this.$onDeleteClick));
                G0U<WorkspaceEntry, Unit> g0u4 = this.$onDeleteClick;
                WorkspaceEntry workspaceEntry5 = this.$entry;
                Object objAaT4 = bfm.AaT();
                if (zA1T2 || objAaT4 == C78N.A00) {
                    objAaT4 = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$4$1(g0u4, workspaceEntry5);
                    bfm.Ai0(objAaT4);
                }
                Function0 function04 = (Function0) objAaT4;
                boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$entry, bfm.A65(this.$onDownloadClick));
                G0U<WorkspaceEntry, Unit> g0u5 = this.$onDownloadClick;
                WorkspaceEntry workspaceEntry6 = this.$entry;
                Object objAaT5 = bfm.AaT();
                if (zA1T3 || objAaT5 == C78N.A00) {
                    objAaT5 = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$5$1(g0u5, workspaceEntry6);
                    bfm.Ai0(objAaT5);
                }
                InlineFilesCardKt.InlineSwipeableEntryRow(workspaceEntry, z, z2, num, function0, function02, function03, function04, (Function0) objAaT5, this.$onNavigateToConversation, null, this.$depth, bfm, 0, 0, 1024);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2(AOI<Boolean> aoi, WorkspaceEntry workspaceEntry, boolean z, boolean z2, Integer num, G0U<? super WorkspaceEntry, Unit> g0u, G0U<? super WorkspaceEntry, Unit> g0u2, G0U<? super WorkspaceEntry, Unit> g0u3, G0U<? super WorkspaceEntry, Unit> g0u4, G0U<? super WorkspaceEntry, Unit> g0u5, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, int i) {
        super(2);
        this.$entryVisibleState = aoi;
        this.$entry = workspaceEntry;
        this.$isExpanded = z;
        this.$isLoading = z2;
        this.$childCount = num;
        this.$onEntryClick = g0u;
        this.$onToggleFolder = g0u2;
        this.$onRenameClick = g0u3;
        this.$onDeleteClick = g0u4;
        this.$onDownloadClick = g0u5;
        this.$onNavigateToConversation = g0v;
        this.$depth = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AbstractC04661Bq.A02(AbstractC1011APs.A01(null, 15).A00(AbstractC1011APs.A03(0.0f, 3)), AbstractC1011APs.A0B(null, 15).A00(AbstractC1011APs.A0E(C1003AOr.A00(null))), this.$entryVisibleState, bfm, null, null, B1V.A00(bfm, new AnonymousClass1(this.$entry, this.$isExpanded, this.$isLoading, this.$childCount, this.$onEntryClick, this.$onToggleFolder, this.$onRenameClick, this.$onDeleteClick, this.$onDownloadClick, this.$onNavigateToConversation, this.$depth), -200387716), 200064, 18);
        } else {
            bfm.Afo();
        }
    }
}
