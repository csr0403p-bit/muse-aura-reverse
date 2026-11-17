package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C00q;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$7$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ boolean $orderCommitted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$7$1(boolean z, C00q c00q) {
        super(0);
        this.$orderCommitted = z;
        this.$dragOffsetY$delegate = c00q;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$orderCommitted ? 0.0f : this.$dragOffsetY$delegate.AFn());
    }
}
