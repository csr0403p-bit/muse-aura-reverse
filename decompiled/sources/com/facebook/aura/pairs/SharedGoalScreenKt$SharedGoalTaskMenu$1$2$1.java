package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalTaskMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ MutableState<String> $name$delegate;
    public final /* synthetic */ Function0<Unit> $onRemove;
    public final /* synthetic */ Function0<Unit> $onRenameClick;
    public final /* synthetic */ MutableState<Boolean> $renaming$delegate;
    public final /* synthetic */ String $title;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        int i = auraContextMenuItem.id;
        if (i != 0) {
            if (i == 1) {
                this.$onRemove.invoke();
            }
        } else {
            this.$onRenameClick.invoke();
            this.$name$delegate.Af8(this.$title);
            MutableState.A09(true, this.$renaming$delegate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalTaskMenu$1$2$1(Function0<Unit> function0, String str, Function0<Unit> function02, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.$onRenameClick = function0;
        this.$title = str;
        this.$onRemove = function02;
        this.$expanded$delegate = mutableState;
        this.$name$delegate = mutableState2;
        this.$renaming$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
