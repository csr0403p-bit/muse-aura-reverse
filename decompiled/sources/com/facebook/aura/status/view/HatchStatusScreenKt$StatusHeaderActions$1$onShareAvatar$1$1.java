package com.facebook.aura.status.view;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.status.viewmodel.HatchStatusUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$StatusHeaderActions$1$onShareAvatar$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $dark;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchStatusUiState $uiState;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$StatusHeaderActions$1$onShareAvatar$1$1(AuraNavigator auraNavigator, HatchStatusUiState hatchStatusUiState, boolean z, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$navigator = auraNavigator;
        this.$uiState = hatchStatusUiState;
        this.$dark = z;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchStatusScreenKt.logShareAvatarClick();
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = HatchShareSheetKey.$childSerializers;
        ShareType shareType = ShareType.AVATAR;
        AvatarMedia avatarMedia = this.$uiState.avatarMedia;
        String str = avatarMedia != null ? (String) AbstractC0878AGe.A0G(AvatarMediaUrlsKt.stillUrls(AvatarMediaSelectionKt.select(avatarMedia, this.$dark), this.$userSession)) : null;
        auraNavigator.navigate((AuraNavKey) new HatchShareSheetKey(shareType, str, null, str, null, null, null, null, null, null, null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
