package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.connect.LinkedAccountsTitle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ LinkedAccountsTitle.Chip $chip;
    public final /* synthetic */ G0U<String, Unit> $onToggleAccount;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onToggleAccount.invoke(((LinkedAccountMenuItem) this.$chip.menuItems.get(auraContextMenuItem.id)).accountId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$3$1(G0U<? super String, Unit> g0u, LinkedAccountsTitle.Chip chip) {
        super(1);
        this.$onToggleAccount = g0u;
        this.$chip = chip;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
