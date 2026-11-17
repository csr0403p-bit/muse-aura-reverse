package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7Je;
import X.C7mU;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PublishArtifactSheetKey $navKey;
    public final /* synthetic */ HatchPublishBottomSheetState $publishState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$6$1(PublishArtifactSheetKey publishArtifactSheetKey, HatchPublishBottomSheetState hatchPublishBottomSheetState, Context context) {
        super(0);
        this.$navKey = publishArtifactSheetKey;
        this.$publishState = hatchPublishBottomSheetState;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPublishArtifactSheetKt.logPublishClick(this.$navKey.surface, HatchScreen.PUBLISH_SUCCESS, HatchComponent.PUBLISH_VISIT_BUTTON);
        String str = ((HatchPublishBottomSheetState.UpToDate) this.$publishState).url;
        boolean z = C7Je.A02;
        C7mU.A00().A02().A05(this.$context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
