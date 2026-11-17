package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$8$5$5$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ boolean $isCompactAvatar;
    public final /* synthetic */ C1BO<Float> $takeoverFramingFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$8$5$5$1(boolean z, C1BO<Float> c1bo) {
        super(0);
        this.$isCompactAvatar = z;
        this.$takeoverFramingFraction = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$isCompactAvatar ? 1.0f : C1BO.A01(this.$takeoverFramingFraction));
    }
}
