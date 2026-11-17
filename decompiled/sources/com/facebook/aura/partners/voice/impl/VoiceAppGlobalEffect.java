package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.G0V;
import com.facebook.aura.globaleffects.api.AppGlobalEffect;
import com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceAppGlobalEffect implements AppGlobalEffect {
    public static final VoiceAppGlobalEffect INSTANCE = new VoiceAppGlobalEffect();

    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceAppGlobalEffect$Effect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceAppGlobalEffect.this.Effect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.globaleffects.api.AppGlobalEffect
    public /* bridge */ boolean getRunsUnderBlockingOverlay() {
        return false;
    }

    @Override // com.facebook.aura.globaleffects.api.AppGlobalEffect
    public void Effect(BFM bfm, int i) {
        bfm.AgG(-2030878096);
        int i2 = i & 1;
        if (bfm.AfS(i2, AnonymousClass002.A1L(i2))) {
            VoiceGlobalEffectsKt.VoiceGlobalEffects(bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }
}
