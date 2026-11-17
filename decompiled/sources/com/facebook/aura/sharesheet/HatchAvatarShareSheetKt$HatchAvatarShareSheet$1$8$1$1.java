package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.sharesheet.AvatarSharePage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$HatchAvatarShareSheet$1$8$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarSharePage $selectedPage;
    public final /* synthetic */ String $shareText;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarShareSheetKt$HatchAvatarShareSheet$1$8$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, AvatarSharePage avatarSharePage) {
        super(0);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$uri = str;
        this.$shareText = str2;
        this.$selectedPage = avatarSharePage;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AvatarSharePage.Dance dance;
        HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
        Context context = this.$context;
        String str = this.$uri;
        String str2 = this.$shareText;
        AvatarSharePage avatarSharePage = this.$selectedPage;
        HatchDanceShare hatchDanceShare = null;
        if ((avatarSharePage instanceof AvatarSharePage.Dance) && (dance = (AvatarSharePage.Dance) avatarSharePage) != null) {
            hatchDanceShare = dance.dance;
        }
        hatchShareSheetViewModel.shareToThreads(context, str, str2, hatchDanceShare);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
