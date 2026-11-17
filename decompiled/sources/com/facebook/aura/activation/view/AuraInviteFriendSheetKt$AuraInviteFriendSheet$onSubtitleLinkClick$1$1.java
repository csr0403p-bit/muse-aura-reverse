package com.facebook.aura.activation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchShareDismissLogging;
import com.facebook.aura.sharesheet.HatchShareLogContext;
import com.facebook.aura.sharesheet.HatchShareLogging;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$onSubtitleLinkClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchShareDismissLogging $dismissLogging;
    public final /* synthetic */ HatchShareLogContext $logContext;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $subtitleLinkUrl;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$onSubtitleLinkClick$1$1(String str, HatchShareLogContext hatchShareLogContext, HatchShareDismissLogging hatchShareDismissLogging, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator) {
        super(0);
        this.$subtitleLinkUrl = str;
        this.$logContext = hatchShareLogContext;
        this.$dismissLogging = hatchShareDismissLogging;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$subtitleLinkUrl != null) {
            HatchShareLogging.INSTANCE.logInviteLearnMore(this.$logContext);
            this.$dismissLogging.isSuppressed = true;
            AuraInviteFriendSheetKt.openServedLink(this.$userSession, this.$subtitleLinkUrl, this.$context, this.$navigator);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
