package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$5$6$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<String> $displayTitle$delegate;
    public final /* synthetic */ boolean $isArchived;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ Function0<Unit> $onPinThread;
    public final /* synthetic */ Function0<Unit> $onUnarchiveThread;
    public final /* synthetic */ Function0<Unit> $onUnpinThread;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showArchiveDialog$delegate;
    public final /* synthetic */ MutableState<Boolean> $showDeleteDialog$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ MutableState<Boolean> $showThreadMenu$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchScreen $threadScreen;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$showThreadMenu$delegate);
        int i = auraContextMenuItem.id;
        if (i == 1) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, HatchComponent.RENAME_BUTTON, null, this.$threadLogMetadata, null);
            MutableState<String> mutableState = this.$renameText$delegate;
            String value = this.$displayTitle$delegate.getValue();
            if (value == null) {
                value = "";
            }
            mutableState.Af8(value);
            MutableState.A09(true, this.$showRenameDialog$delegate);
            return;
        }
        if (i == 2) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, this.$isPinned ? HatchComponent.UNPIN_BUTTON : HatchComponent.PIN_BUTTON, null, this.$threadLogMetadata, null);
            function0 = this.$isPinned ? this.$onUnpinThread : this.$onPinThread;
        } else {
            if (i != 3) {
                if (i == 4) {
                    HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, HatchComponent.DELETE_BUTTON, null, this.$threadLogMetadata, null);
                    MutableState.A09(true, this.$showDeleteDialog$delegate);
                    return;
                }
                return;
            }
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, this.$isArchived ? HatchComponent.UNARCHIVE_BUTTON : HatchComponent.ARCHIVE_BUTTON, null, this.$threadLogMetadata, null);
            if (!this.$isArchived) {
                MutableState.A09(true, this.$showArchiveDialog$delegate);
                return;
            }
            function0 = this.$onUnarchiveThread;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$5$6$1(HatchScreen hatchScreen, Map<String, String> map, boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, Function0<Unit> function03, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6) {
        super(1);
        this.$threadScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$isPinned = z;
        this.$onUnpinThread = function0;
        this.$onPinThread = function02;
        this.$isArchived = z2;
        this.$onUnarchiveThread = function03;
        this.$showThreadMenu$delegate = mutableState;
        this.$displayTitle$delegate = mutableState2;
        this.$renameText$delegate = mutableState3;
        this.$showRenameDialog$delegate = mutableState4;
        this.$showArchiveDialog$delegate = mutableState5;
        this.$showDeleteDialog$delegate = mutableState6;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
