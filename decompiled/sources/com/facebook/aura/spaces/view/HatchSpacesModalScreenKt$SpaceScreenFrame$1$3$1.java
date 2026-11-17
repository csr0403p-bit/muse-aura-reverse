package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.view.HeaderLeadingButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$1$3$1 extends AbstractC7559F3s implements G0U<HeaderLeadingButton, Unit> {
    public final /* synthetic */ SpacePageLogging $logging;
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ Function0<Unit> $stepBack;
    public final /* synthetic */ MutableState<HxE<Boolean, Function0<Unit>>> $webBackState$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderLeadingButton headerLeadingButton) {
        C7384Etj.A0Y(headerLeadingButton, 0);
        if (headerLeadingButton == HeaderLeadingButton.Back) {
            if (AnonymousClass001.A1X(this.$webBackState$delegate.getValue().first)) {
                this.$logging.logInPageBackClick(this.$spaceId);
            }
            this.$stepBack.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$1$3$1(SpacePageLogging spacePageLogging, String str, Function0<Unit> function0, MutableState<HxE<Boolean, Function0<Unit>>> mutableState) {
        super(1);
        this.$logging = spacePageLogging;
        this.$spaceId = str;
        this.$stepBack = function0;
        this.$webBackState$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderLeadingButton headerLeadingButton) {
        invoke2(headerLeadingButton);
        return Unit.INSTANCE;
    }
}
