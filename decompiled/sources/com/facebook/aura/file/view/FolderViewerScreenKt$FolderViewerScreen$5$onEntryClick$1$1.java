package com.facebook.aura.file.view;

import X.AGI;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FolderViewerScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$onEntryClick$1$1 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        if (workspaceEntry.type == WorkspaceEntry.EntryType.DIRECTORY) {
            this.$navigator.navigate((AuraNavKey) new FolderViewerScreenKey(workspaceEntry.relativePath), false);
        } else {
            ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, AGI.A0E(ContentItem.Companion.fromWorkspaceEntry(workspaceEntry, this.$userSession)), 0, false, false, null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewerScreenKt$FolderViewerScreen$5$onEntryClick$1$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry) {
        invoke2(workspaceEntry);
        return Unit.INSTANCE;
    }
}
