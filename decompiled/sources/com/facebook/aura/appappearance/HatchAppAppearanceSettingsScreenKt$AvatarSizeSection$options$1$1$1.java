package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$AvatarSizeSection$options$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAvatarSizeRepository $repository;
    public final /* synthetic */ HatchAvatarSize $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$AvatarSizeSection$options$1$1$1(HatchAvatarSize hatchAvatarSize, HatchAvatarSizeRepository hatchAvatarSizeRepository) {
        super(0);
        this.$size = hatchAvatarSize;
        this.$repository = hatchAvatarSizeRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.APPEARANCE, HatchScreen.APPEARANCE, HatchComponent.AVATAR_SIZE_OPTION, null, AnonymousClass006.A10(HatchMetadataKey.AVATAR_SIZE.getValue(), this.$size.getStoredValue()), null);
        this.$repository.setAvatarSize(this.$size);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
