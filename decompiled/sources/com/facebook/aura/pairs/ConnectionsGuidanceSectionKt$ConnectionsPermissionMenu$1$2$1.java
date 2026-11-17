package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ Function0<Unit> $onEdit;
    public final /* synthetic */ Function0<Unit> $onRemove;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            function0 = this.$onEdit;
        } else if (i != 1) {
            return;
        } else {
            function0 = this.$onRemove;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$2$1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$onEdit = function0;
        this.$onRemove = function02;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
