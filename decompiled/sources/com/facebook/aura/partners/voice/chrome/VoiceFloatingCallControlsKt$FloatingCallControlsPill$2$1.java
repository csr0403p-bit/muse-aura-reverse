package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$FloatingCallControlsPill$2$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ HatchCallControlsMotion $motion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$FloatingCallControlsPill$2$1(boolean z, HatchCallControlsMotion hatchCallControlsMotion) {
        super(1);
        this.$enabled = z;
        this.$motion = hatchCallControlsMotion;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1706invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1706invokeozmzZPI(long j) {
        if (this.$enabled) {
            this.$motion.updateHeight(AnonymousClass002.A09(j));
        }
    }
}
