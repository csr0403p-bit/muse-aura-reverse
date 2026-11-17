package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.maps.model.HatchMapScene;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFullscreenMapScreenKt$FullscreenMapContent$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchMapScene $scene;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchMapAnalytics.INSTANCE.logMarkerClick(HatchMapDisplayMode.FULLSCREEN, HatchMapAnalyticsKt.analyticsId(this.$scene, str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFullscreenMapScreenKt$FullscreenMapContent$1$2$1(HatchMapScene hatchMapScene) {
        super(1);
        this.$scene = hatchMapScene;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
