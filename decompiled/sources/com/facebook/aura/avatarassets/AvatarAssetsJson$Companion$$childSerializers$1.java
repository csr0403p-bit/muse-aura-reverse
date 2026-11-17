package com.facebook.aura.avatarassets;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AvatarAssetsJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AvatarAssetJson>>> {
    public static final AvatarAssetsJson$Companion$$childSerializers$1 INSTANCE = new AvatarAssetsJson$Companion$$childSerializers$1();

    public AvatarAssetsJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AvatarAssetJson>> invoke() {
        return C3cG.A19(AvatarAssetJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AvatarAssetJson>> invoke() {
        return C3cG.A19(AvatarAssetJson$$serializer.INSTANCE);
    }
}
