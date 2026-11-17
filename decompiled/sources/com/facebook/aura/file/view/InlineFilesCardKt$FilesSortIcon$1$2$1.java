package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.FilesSortMode;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InlineFilesCardKt$FilesSortIcon$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ G0U<FilesSortMode, Unit> $onSortModeChange;
    public final /* synthetic */ MutableState<Boolean> $showSortMenu$delegate;
    public final /* synthetic */ FilesSortMode $sortMode;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$showSortMenu$delegate);
        int i = auraContextMenuItem.id;
        this.$onSortModeChange.invoke(i != 0 ? i != 1 ? i != 2 ? this.$sortMode : FilesSortMode.DATE : FilesSortMode.TYPE : FilesSortMode.NAME);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineFilesCardKt$FilesSortIcon$1$2$1(FilesSortMode filesSortMode, G0U<? super FilesSortMode, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$sortMode = filesSortMode;
        this.$onSortModeChange = g0u;
        this.$showSortMenu$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
