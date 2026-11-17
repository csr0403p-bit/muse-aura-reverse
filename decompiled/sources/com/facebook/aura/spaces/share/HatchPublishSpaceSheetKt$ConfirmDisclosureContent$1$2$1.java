package com.facebook.aura.spaces.share;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPublishSpaceSheetKt$ConfirmDisclosureContent$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onPublish;
    public final /* synthetic */ String $spaceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$ConfirmDisclosureContent$1$2$1(Function0<Unit> function0, String str) {
        super(0);
        this.$onPublish = function0;
        this.$spaceId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SPACES, HatchSubsurface.PUBLISH_SHEET, HatchScreen.PUBLISH_CONFIRM, HatchComponent.PUBLISH_BUTTON, null, AIW.A0K(AnonymousClass007.A0i(this.$spaceId)), null);
        this.$onPublish.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
