package com.facebook.aura.sharesheet;

import X.AHD;
import X.AbstractC7559F3s;
import com.facebook.aura.sharesheet.AvatarSharePage;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$HatchAvatarShareSheet$dancesPagerState$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ AvatarSharePages $pages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarShareSheetKt$HatchAvatarShareSheet$dancesPagerState$1$1(AvatarSharePages avatarSharePages) {
        super(0);
        this.$pages = avatarSharePages;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        AHD<AvatarSharePage.Dance> ahd;
        AvatarSharePages avatarSharePages = this.$pages;
        return Integer.valueOf((avatarSharePages == null || (ahd = avatarSharePages.dances) == null) ? 0 : ahd.size());
    }
}
