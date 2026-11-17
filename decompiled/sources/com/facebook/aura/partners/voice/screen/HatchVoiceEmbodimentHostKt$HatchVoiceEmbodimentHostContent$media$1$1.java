package com.facebook.aura.partners.voice.screen;

import X.AIC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.C1HY;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$media$1$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isCompactHost;
    public final /* synthetic */ C1HY $lifecycleOwner;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$media$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $mediaModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, boolean z) {
            super(2);
            this.$mediaModifier = bRg;
            this.$isCompactHost = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                VoiceEmbodimentAvatarOverlayKt.VoiceCallAvatarMedia(this.$mediaModifier, this.$isCompactHost, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$media$1$1(C1HY c1hy, boolean z) {
        super(3);
        this.$lifecycleOwner = c1hy;
        this.$isCompactHost = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        if (AnonymousClass002.A0B(bRg, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AnonymousClass006.A15(bfm, AIC.A00.A04(this.$lifecycleOwner), new AnonymousClass1(bRg, this.$isCompactHost), -1503842552);
        } else {
            bfm.Afo();
        }
    }
}
