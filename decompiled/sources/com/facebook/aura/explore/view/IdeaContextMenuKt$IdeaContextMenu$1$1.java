package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C0dx;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.share.view.ItemShareMenuEntries;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdeaContextMenuKt$IdeaContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<IdeaContextMenuAction, Unit> $onAction;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ ItemShareMenuEntries $shareEntries;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        G0U<IdeaContextMenuAction, Unit> g0u;
        IdeaContextMenuAction ideaContextMenuAction;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 0) {
            g0u = this.$onAction;
            ideaContextMenuAction = IdeaContextMenuAction.EXECUTE;
        } else if (i == 1) {
            this.$haptics.AXr(AuraHaptics.SUCCESS);
            g0u = this.$onAction;
            ideaContextMenuAction = IdeaContextMenuAction.FEEDBACK_UP;
        } else {
            if (i != 2) {
                if (i != 4) {
                    AuraNavKey auraNavKeyOnItemClick = this.$shareEntries.onItemClick(i);
                    if (auraNavKeyOnItemClick != null) {
                        this.$navigator.navigate(auraNavKeyOnItemClick, false);
                        return;
                    }
                    return;
                }
                Function0<Unit> function0 = this.$onShare;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            this.$haptics.AXr(AuraHaptics.SUCCESS);
            g0u = this.$onAction;
            ideaContextMenuAction = IdeaContextMenuAction.FEEDBACK_DOWN;
        }
        g0u.invoke(ideaContextMenuAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaContextMenuKt$IdeaContextMenu$1$1(Function0<Unit> function0, G0U<? super IdeaContextMenuAction, Unit> g0u, Function0<Unit> function02, C0dx c0dx, ItemShareMenuEntries itemShareMenuEntries, AuraNavigator auraNavigator) {
        super(1);
        this.$onDismiss = function0;
        this.$onAction = g0u;
        this.$onShare = function02;
        this.$haptics = c0dx;
        this.$shareEntries = itemShareMenuEntries;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
