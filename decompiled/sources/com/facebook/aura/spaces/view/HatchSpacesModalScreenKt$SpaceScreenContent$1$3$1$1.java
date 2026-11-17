package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenContent$1$3$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SpacePageLogging $logging;
    public final /* synthetic */ String $spaceId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$logging.logLinkClick(this.$spaceId);
        AuraBrowserLauncherKt.openExternalUrl(str, this.$context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenContent$1$3$1$1(SpacePageLogging spacePageLogging, String str, Context context) {
        super(1);
        this.$logging = spacePageLogging;
        this.$spaceId = str;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
