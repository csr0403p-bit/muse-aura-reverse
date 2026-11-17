package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ Function0<Unit> $onDisconnect;
    public final /* synthetic */ Function0<Unit> $onReconnect;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        (auraContextMenuItem.id == 0 ? this.$onReconnect : this.$onDisconnect).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$2$1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$onReconnect = function0;
        this.$onDisconnect = function02;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
