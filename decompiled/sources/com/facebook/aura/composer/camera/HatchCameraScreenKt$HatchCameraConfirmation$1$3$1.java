package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.B6A;
import X.C60P;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCameraScreenKt$HatchCameraConfirmation$1$3$1 extends AbstractC7559F3s implements Function0<B6A> {
    public final /* synthetic */ AuraColors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraScreenKt$HatchCameraConfirmation$1$3$1(AuraColors auraColors) {
        super(0);
        this.$colors = auraColors;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke-QN2ZGVo, reason: not valid java name and merged with bridge method [inline-methods] */
    public final B6A invoke() {
        return C60P.A04(this.$colors.onMedia);
    }
}
