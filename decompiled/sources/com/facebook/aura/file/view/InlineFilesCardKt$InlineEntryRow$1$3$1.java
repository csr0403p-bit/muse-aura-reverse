package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InlineFilesCardKt$InlineEntryRow$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDeleteClick;
    public final /* synthetic */ Function0<Unit> $onDownloadClick;
    public final /* synthetic */ Function0<Unit> $onRenameClick;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$showContextMenu$delegate);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            function0 = this.$onRenameClick;
        } else if (i == 1) {
            function0 = this.$onDeleteClick;
        } else if (i != 2) {
            return;
        } else {
            function0 = this.$onDownloadClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineFilesCardKt$InlineEntryRow$1$3$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, MutableState<Boolean> mutableState) {
        super(1);
        this.$onRenameClick = function0;
        this.$onDeleteClick = function02;
        this.$onDownloadClick = function03;
        this.$showContextMenu$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
