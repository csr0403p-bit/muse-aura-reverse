package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C3cG;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $isInPictureInPictureMode;
    public final /* synthetic */ boolean $showPipAvatar;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$1$3(boolean z, boolean z2, VoiceAvatarTakeoverState voiceAvatarTakeoverState, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$showPipAvatar = z;
        this.$isInPictureInPictureMode = z2;
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$content = g0w;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BBI bbiA0M;
        BRg bRgA0X;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (this.$showPipAvatar && (this.$isInPictureInPictureMode || MutableState.A0A(this.$takeoverState.isMediaVisible$delegate))) {
                BS0 bs0A09 = C3cG.A09(bfm, 561754605);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$1$3$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0W = AnonymousClass001.A0W(bs0A09, objAaT);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = HatchVoiceEmbodimentHostKt$HatchVoiceEmbodimentHostContent$1$3$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                bRgA0X = AnonymousClass001.A0X(bRgA0W, objAaT2);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 561853154);
                bRgA0X = BRg.A00;
            }
            G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C0z7.A00, bfm, g0w, 6);
            BBI.A0R(bbiA0M, true);
            return;
        }
        bfm.Afo();
    }
}
