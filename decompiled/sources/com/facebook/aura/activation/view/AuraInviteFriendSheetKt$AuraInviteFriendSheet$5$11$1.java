package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchShareDestination;
import com.facebook.aura.sharesheet.HatchShareLogContext;
import com.facebook.aura.sharesheet.HatchShareLogging;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$5$11$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchShareLogContext $logContext;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchShareLogging.INSTANCE.logDestination(HatchShareDestination.COPY_LINK, this.$logContext);
        AuraInviteFriendSheetKt.copyToClipboard(this.$context, AuraInviteFriendSheetKt.INVITE_CLIP_LABEL, str, R.string._name_removed__res_0x7f120430);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$5$11$1(HatchShareLogContext hatchShareLogContext, Context context) {
        super(1);
        this.$logContext = hatchShareLogContext;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
