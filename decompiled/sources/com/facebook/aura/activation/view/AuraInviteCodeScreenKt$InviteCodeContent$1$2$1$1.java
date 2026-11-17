package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$InviteCodeContent$1$2$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $confirmText;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onContinueClick;

    /* renamed from: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$InviteCodeContent$1$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onContinueClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onContinueClick = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_INVITE_CODE, HatchComponent.CONTINUE_BUTTON, null, AnonymousClass006.A10("trigger", "tap"), null);
            this.$onContinueClick.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.primaryButton(this.$confirmText, (Drawable) null, this.$enabled, this.$isLoading, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, new AnonymousClass1(this.$onContinueClick), (String) null, Integer.MAX_VALUE, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteCodeScreenKt$InviteCodeContent$1$2$1$1(String str, boolean z, boolean z2, Function0<Unit> function0) {
        super(1);
        this.$confirmText = str;
        this.$enabled = z;
        this.$isLoading = z2;
        this.$onContinueClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
