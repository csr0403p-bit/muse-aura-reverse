package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentsMenuKt$HatchAttachmentsMenu$logClick$1$1 extends AbstractC7559F3s implements G0U<HatchComponent, Unit> {
    public final /* synthetic */ HatchScreen $screen;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent) {
        AnonymousClass006.A0b(hatchComponent).logClick(HatchSurface.CHAT, HatchSubsurface.COMPOSER, this.$screen, hatchComponent, null, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentsMenuKt$HatchAttachmentsMenu$logClick$1$1(HatchScreen hatchScreen) {
        super(1);
        this.$screen = hatchScreen;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent) {
        invoke2(hatchComponent);
        return Unit.INSTANCE;
    }
}
