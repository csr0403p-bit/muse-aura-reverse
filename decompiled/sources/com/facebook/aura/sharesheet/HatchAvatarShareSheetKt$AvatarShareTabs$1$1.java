package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.segmentedtabs.AuraTab;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$AvatarShareTabs$1$1 extends AbstractC7559F3s implements G0V<AuraTab, Integer, Unit> {
    public final /* synthetic */ G0U<AvatarShareTab, Unit> $onTabSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAvatarShareSheetKt$AvatarShareTabs$1$1(G0U<? super AvatarShareTab, Unit> g0u) {
        super(2);
        this.$onTabSelected = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AuraTab auraTab, Integer num) {
        invoke(auraTab, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AuraTab auraTab, int i) {
        this.$onTabSelected.invoke(AvatarShareTab.getEntries().get(i));
    }
}
