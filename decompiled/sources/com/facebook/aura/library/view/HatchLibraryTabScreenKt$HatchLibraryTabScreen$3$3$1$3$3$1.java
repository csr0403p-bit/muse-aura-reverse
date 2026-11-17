package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.segmentedtabs.AuraTab;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$3$1 extends AbstractC7559F3s implements G0V<AuraTab, Integer, Unit> {
    public final /* synthetic */ G0U<Integer, Unit> $onTabSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$3$1(G0U<? super Integer, Unit> g0u) {
        super(2);
        this.$onTabSelected = g0u;
    }

    public final void invoke(AuraTab auraTab, int i) {
        AnonymousClass005.A0l(i, this.$onTabSelected);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AuraTab auraTab, Integer num) {
        AnonymousClass005.A0l(AnonymousClass001.A0F(num), this.$onTabSelected);
        return Unit.INSTANCE;
    }
}
