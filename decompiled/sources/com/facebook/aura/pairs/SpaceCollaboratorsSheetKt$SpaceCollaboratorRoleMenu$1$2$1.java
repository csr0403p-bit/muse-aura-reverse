package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ Function0<Unit> $onRemove;
    public final /* synthetic */ G0U<SpaceRole, Unit> $onRole;
    public final /* synthetic */ SpaceRole $role;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Object objA0A;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState<Boolean> mutableState = this.$expanded$delegate;
        int i = SpaceCollaboratorsSheetKt.ROLE_MENU_HEADER;
        MutableState.A09(false, mutableState);
        int i2 = auraContextMenuItem.id;
        if (i2 == -2) {
            this.$onRemove.invoke();
        } else {
            if (i2 == -1 || (objA0A = AbstractC0878AGe.A0A(i2, SpaceRole.getEntries())) == null || objA0A == this.$role) {
                return;
            }
            this.$onRole.invoke(objA0A);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$2$1(Function0<Unit> function0, G0U<? super SpaceRole, Unit> g0u, MutableState<Boolean> mutableState, SpaceRole spaceRole) {
        super(1);
        this.$onRemove = function0;
        this.$onRole = g0u;
        this.$expanded$delegate = mutableState;
        this.$role = spaceRole;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
