package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$closeWithButton$1$1 extends AbstractC7559F3s implements G0U<HatchScreen, Unit> {
    public final /* synthetic */ Function0<Unit> $closeSheet;
    public final /* synthetic */ String $spaceId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchScreen hatchScreen) {
        C7384Etj.A0Y(hatchScreen, 0);
        HatchPublishSpaceSheetKt.logSpacePublishClick(this.$spaceId, hatchScreen, HatchComponent.CLOSE_BUTTON);
        this.$closeSheet.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$closeWithButton$1$1(String str, Function0<Unit> function0) {
        super(1);
        this.$spaceId = str;
        this.$closeSheet = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchScreen hatchScreen) {
        invoke2(hatchScreen);
        return Unit.INSTANCE;
    }
}
