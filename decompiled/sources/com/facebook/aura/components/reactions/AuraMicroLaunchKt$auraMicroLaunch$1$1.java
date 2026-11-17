package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.C8j4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraMicroLaunchKt$auraMicroLaunch$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMicroLaunchKt$auraMicroLaunch$1$1(AT5<Float, ?> at5, AHD<B6A> ahd) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean zA1X = C8j4.A1X(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 710.0f;
        AuraMicroLaunchKt.m400drawExhaustmxwnekA(c16z, f, C8j4.A0P(this.$palette, zA1X ? 1 : 0));
        AuraMicroLaunchKt.drawPuff(c16z, f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
