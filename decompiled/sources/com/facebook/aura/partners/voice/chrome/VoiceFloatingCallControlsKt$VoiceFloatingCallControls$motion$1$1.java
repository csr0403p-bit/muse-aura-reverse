package com.facebook.aura.partners.voice.chrome;

import X.AWx;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C00q;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$motion$1$1 extends AbstractC7559F3s implements G0V<AWx, Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $atDefaultPosition$delegate;
    public final /* synthetic */ C00q $positionX$delegate;
    public final /* synthetic */ C00q $positionY$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$motion$1$1(C00q c00q, C00q c00q2, MutableState<Boolean> mutableState) {
        super(2);
        this.$positionX$delegate = c00q;
        this.$positionY$delegate = c00q2;
        this.$atDefaultPosition$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(AWx aWx, Boolean bool) {
        m1712invoke3MmeM6k(aWx.A00, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final void m1712invoke3MmeM6k(long j, boolean z) {
        this.$positionX$delegate.AdS(AnonymousClass003.A03(j));
        this.$positionY$delegate.AdS(AnonymousClass004.A00(j));
        MutableState.A09(z, this.$atDefaultPosition$delegate);
    }
}
