package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import android.graphics.Bitmap;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1$2$1 extends AbstractC7559F3s implements G0V<WorkspaceEntry, Bitmap, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry, Bitmap bitmap) {
        C7384Etj.A0Y(workspaceEntry, 0);
        AttachFileToConversationKt.attachFileToConversation(this.$navigator, workspaceEntry, bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1$2$1(AuraNavigator auraNavigator) {
        super(2);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry, Bitmap bitmap) {
        invoke2(workspaceEntry, bitmap);
        return Unit.INSTANCE;
    }
}
