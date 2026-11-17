package com.facebook.aura.sharesheet;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchAvatarShareSheetKt$HatchAvatarShareSheet$2$1$1 extends C7438Evz implements G0U<AvatarShareTab, Unit> {
    public HatchAvatarShareSheetKt$HatchAvatarShareSheet$2$1$1(Object obj) {
        super(1, obj, HatchShareSheetViewModel.class, "onAvatarTabSelected", "onAvatarTabSelected$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Lcom/facebook/aura/sharesheet/AvatarShareTab;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AvatarShareTab avatarShareTab) {
        ((HatchShareSheetViewModel) AnonymousClass006.A0o(avatarShareTab, this)).onAvatarTabSelected$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(avatarShareTab);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AvatarShareTab avatarShareTab) {
        invoke2(avatarShareTab);
        return Unit.INSTANCE;
    }
}
