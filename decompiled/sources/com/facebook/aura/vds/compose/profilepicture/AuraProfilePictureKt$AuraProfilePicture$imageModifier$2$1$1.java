package com.facebook.aura.vds.compose.profilepicture;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraProfilePictureKt$AuraProfilePicture$imageModifier$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onProfilePictureClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraProfilePictureKt$AuraProfilePicture$imageModifier$2$1$1(Function0<Unit> function0) {
        super(0);
        this.$onProfilePictureClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0 = this.$onProfilePictureClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
