package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$SidePanelNavigationRow$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $canReorder;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ BHP $menuAction;
    public final /* synthetic */ AHD<BHP> $moveActions;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        List listA0z;
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0E(interfaceC0857A6e, this.$isSelected);
        if (this.$canReorder) {
            listA0z = AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(this.$menuAction), this.$moveActions);
        } else {
            listA0z = AbstractC0885AGm.A0z(this.$menuAction);
        }
        AbstractC1564Ale.A0C(interfaceC0857A6e, listA0z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$SidePanelNavigationRow$2$1(boolean z, boolean z2, AHD<BHP> ahd, BHP bhp) {
        super(1);
        this.$isSelected = z;
        this.$canReorder = z2;
        this.$moveActions = ahd;
        this.$menuAction = bhp;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
