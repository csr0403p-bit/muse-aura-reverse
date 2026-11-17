package com.facebook.aura.onepassword;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.aura.common.url.PlayStoreListingKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnePasswordErrorDialogKt$PlayStoreButtons$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $notNowText;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ String $openPlayStoreText;

    /* renamed from: com.facebook.aura.onepassword.OnePasswordErrorDialogKt$PlayStoreButtons$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Function0<Unit> function0) {
            super(0);
            this.$context = context;
            this.$onDismiss = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PlayStoreListingKt.openPlayStoreListing(this.$context, RequestCredentialAuthorizationKt.ONEPASSWORD_PACKAGE_NAME)) {
                this.$onDismiss.invoke();
            }
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
        String str = this.$openPlayStoreText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$onDismiss);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) anonymousClass1, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        auraButtonGroupScope.secondaryButton(this.$notNowText, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismiss, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePasswordErrorDialogKt$PlayStoreButtons$1$1(String str, String str2, Function0<Unit> function0, Context context) {
        super(1);
        this.$openPlayStoreText = str;
        this.$notNowText = str2;
        this.$onDismiss = function0;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
