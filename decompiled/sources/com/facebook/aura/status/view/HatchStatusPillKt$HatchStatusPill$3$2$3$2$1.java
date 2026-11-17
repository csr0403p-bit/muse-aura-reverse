package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$3$2$3$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ boolean $suppressAvatar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$3$2$3$2$1(boolean z) {
        super(0);
        this.$suppressAvatar = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(AnonymousClass003.A02(this.$suppressAvatar ? 1 : 0));
    }
}
