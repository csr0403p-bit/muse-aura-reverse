package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.activation.model.HatchInviteLogging;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$onCopyCode$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchInviteLogging.INSTANCE.logCopyCodeClick();
        AuraInviteFriendSheetKt.copyToClipboard(this.$context, "invite_code", str, R.string._name_removed__res_0x7f120429);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$onCopyCode$1$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
