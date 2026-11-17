package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$38$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<AWA> $canvasSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$38$1(MutableState<AWA> mutableState) {
        super(1);
        this.$canvasSize$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1813invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1813invokeozmzZPI(long j) {
        AWA.A05(this.$canvasSize$delegate, AnonymousClass005.A0M((int) (j >> 32), (int) (j & 4294967295L)));
    }
}
