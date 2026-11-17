package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.sharesheet.HatchShareSheetViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$5$5$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $feedCaption;
    public final /* synthetic */ HatchShareSheetViewModel $shareViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$shareViewModel.shareToFacebookFeed(this.$context, str, null, this.$feedCaption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$5$5$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str) {
        super(1);
        this.$shareViewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$feedCaption = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
