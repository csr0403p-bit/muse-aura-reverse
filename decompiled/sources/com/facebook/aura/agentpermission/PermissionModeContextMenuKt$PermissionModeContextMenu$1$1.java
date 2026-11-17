package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PermissionModeContextMenuKt$PermissionModeContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
    public final /* synthetic */ Function0<Unit> $onResetToDefault;
    public final /* synthetic */ Function0<Unit> $onRevoke;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismissMenu.invoke();
        int i = auraContextMenuItem.id;
        if (i == -1) {
            function0 = this.$onRevoke;
        } else {
            if (i != -2) {
                Object objA0A = AbstractC0878AGe.A0A(i, ConnectorPermissionMode.getEntries());
                if (objA0A != null) {
                    this.$onModeSelected.invoke(objA0A);
                    return;
                }
                return;
            }
            function0 = this.$onResetToDefault;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PermissionModeContextMenuKt$PermissionModeContextMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super ConnectorPermissionMode, Unit> g0u) {
        super(1);
        this.$onDismissMenu = function0;
        this.$onRevoke = function02;
        this.$onResetToDefault = function03;
        this.$onModeSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
