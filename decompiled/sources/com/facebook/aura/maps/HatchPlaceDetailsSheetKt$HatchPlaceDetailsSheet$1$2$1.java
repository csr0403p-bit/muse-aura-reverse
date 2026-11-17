package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $analyticsId;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$1$2$1(String str, Function0<Unit> function0) {
        super(0);
        this.$analyticsId = str;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchMapAnalytics.INSTANCE.logPlaceDetailsClick(HatchComponent.CLOSE_BUTTON, this.$analyticsId);
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
