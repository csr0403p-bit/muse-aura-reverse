package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B1U;
import X.B1V;
import X.BFM;
import X.C07C;
import X.C0881AGi;
import X.C11H;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.VoicePipelineProfile;
import com.facebook.aura.partners.voice.api.VoicePipelineProfileState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<String, Unit> $onSelect;
    public final /* synthetic */ VoicePipelineProfileState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3(VoicePipelineProfileState voicePipelineProfileState, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState) {
        super(3);
        this.$state = voicePipelineProfileState;
        this.$onSelect = g0u;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        Iterable<VoicePipelineProfile> iterable;
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
            VoicePipelineProfileState voicePipelineProfileState = this.$state;
            if (voicePipelineProfileState == null || (iterable = voicePipelineProfileState.profiles) == null) {
                iterable = C0881AGi.A00;
            }
            G0U<String, Unit> g0u = this.$onSelect;
            MutableState<Boolean> mutableState = this.$expanded$delegate;
            for (VoicePipelineProfile voicePipelineProfile : iterable) {
                B1U b1uA00 = B1V.A00(bfm, new VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3$1$1(voicePipelineProfile), 196957839);
                boolean zA1K = AnonymousClass003.A1K(bfm, g0u, voicePipelineProfile);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3$1$2$1(g0u, voicePipelineProfile, mutableState);
                    bfm.Ai0(objAaT);
                }
                C11H.A01(null, null, null, bfm, null, (Function0) objAaT, b1uA00, null, null, 6, 508, false);
            }
            return;
        }
        bfm.Afo();
    }
}
