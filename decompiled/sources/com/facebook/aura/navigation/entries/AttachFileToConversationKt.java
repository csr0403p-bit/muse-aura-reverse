package com.facebook.aura.navigation.entries;

import X.AnonymousClass002;
import android.graphics.Bitmap;
import com.facebook.aura.conversation.viewmodel.HatchPendingDiscussionItem;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.model.DiscussionItemType;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;

/* loaded from: classes.dex */
public abstract class AttachFileToConversationKt {
    public static final void attachFileToConversation(AuraNavigator auraNavigator, WorkspaceEntry workspaceEntry, Bitmap bitmap) {
        boolean zA1a = AnonymousClass002.A1a(auraNavigator, workspaceEntry);
        HatchPendingDiscussionItem.INSTANCE.setPendingDiscussionItem(HatchMessageKt.createAttachmentHandleForDiscussionItem(workspaceEntry.relativePath, DiscussionItemType.File), bitmap);
        auraNavigator.navigate(ConversationTabScreenKey.INSTANCE, zA1a);
    }
}
