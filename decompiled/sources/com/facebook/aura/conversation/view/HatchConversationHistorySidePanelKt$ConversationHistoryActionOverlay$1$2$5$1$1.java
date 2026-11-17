package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import X.G0U;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$2$5$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ boolean $effectiveIsPinned;
    public final /* synthetic */ boolean $isArchived;
    public final /* synthetic */ Function0<Unit> $onArchiveClick;
    public final /* synthetic */ Function0<Unit> $onDeleteClick;
    public final /* synthetic */ Function0<Unit> $onPinClick;
    public final /* synthetic */ Function0<Unit> $onRenameClick;
    public final /* synthetic */ HatchSessionItem $session;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        int i = auraContextMenuItem.id;
        if (i == 1) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.RENAME_BUTTON, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), AnonymousClass006.A12(HatchMetadataKey.IS_PRIMARY_THREAD, "false"), this.$isArchived), null);
            function0 = this.$onRenameClick;
        } else if (i == 2) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, this.$effectiveIsPinned ? HatchComponent.UNPIN_BUTTON : HatchComponent.PIN_BUTTON, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), AnonymousClass006.A12(HatchMetadataKey.IS_PRIMARY_THREAD, "false"), this.$isArchived), null);
            function0 = this.$onPinClick;
        } else if (i == 3) {
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.CHAT;
            HatchScreen hatchScreen = HatchScreen.CONVERSATION_HISTORY;
            boolean z = this.$isArchived;
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, z ? HatchComponent.UNARCHIVE_BUTTON : HatchComponent.ARCHIVE_BUTTON, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), AnonymousClass006.A12(HatchMetadataKey.IS_PRIMARY_THREAD, "false"), z), null);
            function0 = this.$onArchiveClick;
        } else {
            if (i != 4) {
                return;
            }
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.DELETE_BUTTON, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), this.$session.sessionId), AnonymousClass006.A12(HatchMetadataKey.IS_PRIMARY_THREAD, "false"), this.$isArchived), null);
            function0 = this.$onDeleteClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$2$5$1$1(HatchSessionItem hatchSessionItem, boolean z, Function0<Unit> function0, boolean z2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        super(1);
        this.$session = hatchSessionItem;
        this.$isArchived = z;
        this.$onRenameClick = function0;
        this.$effectiveIsPinned = z2;
        this.$onPinClick = function02;
        this.$onArchiveClick = function03;
        this.$onDeleteClick = function04;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
