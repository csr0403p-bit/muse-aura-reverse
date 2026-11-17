package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitOverflow$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
    public final /* synthetic */ FeedUnit $unit;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        if (auraContextMenuItem.id == 1) {
            this.$onDelete.invoke(this.$unit);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitOverflow$1$3$1(G0U<? super FeedUnit, Unit> g0u, FeedUnit feedUnit, MutableState<Boolean> mutableState) {
        super(1);
        this.$onDelete = g0u;
        this.$unit = feedUnit;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
