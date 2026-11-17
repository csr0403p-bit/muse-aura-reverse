package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2k;
import X.HtJ;
import X.HwV;
import X.Hwg;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$callIdleSelection$3", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallViewModel$callIdleSelection$3 extends AbstractC07127nr implements G2k<PreparedHatchAvatar, HatchReadyCallIdle, Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster>, HwV<? extends Boolean, ? extends VoiceEmbodimentMedia, ? extends Boolean>, HtJ<? super CallIdleInputs>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;

    public VoiceCallViewModel$callIdleSelection$3(HtJ<? super VoiceCallViewModel$callIdleSelection$3> htJ) {
        super(5, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PreparedHatchAvatar preparedHatchAvatar, HatchReadyCallIdle hatchReadyCallIdle, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> map, HwV<Boolean, ? extends VoiceEmbodimentMedia, Boolean> hwV, HtJ<? super CallIdleInputs> htJ) {
        VoiceCallViewModel$callIdleSelection$3 voiceCallViewModel$callIdleSelection$3 = new VoiceCallViewModel$callIdleSelection$3(htJ);
        voiceCallViewModel$callIdleSelection$3.L$0 = preparedHatchAvatar;
        voiceCallViewModel$callIdleSelection$3.L$1 = hatchReadyCallIdle;
        voiceCallViewModel$callIdleSelection$3.L$2 = map;
        voiceCallViewModel$callIdleSelection$3.L$3 = hwV;
        return voiceCallViewModel$callIdleSelection$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        PreparedHatchAvatar preparedHatchAvatar = (PreparedHatchAvatar) this.L$0;
        HatchReadyCallIdle hatchReadyCallIdle = (HatchReadyCallIdle) this.L$1;
        Map map = (Map) this.L$2;
        HwV hwV = (HwV) this.L$3;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new CallIdleInputs(preparedHatchAvatar, hatchReadyCallIdle, map, AnonymousClass001.A1X(hwV.first), (VoiceEmbodimentMedia) hwV.second, AnonymousClass001.A1X(hwV.third));
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(PreparedHatchAvatar preparedHatchAvatar, HatchReadyCallIdle hatchReadyCallIdle, Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster> map, HwV<? extends Boolean, ? extends VoiceEmbodimentMedia, ? extends Boolean> hwV, HtJ<? super CallIdleInputs> htJ) {
        return invoke2(preparedHatchAvatar, hatchReadyCallIdle, (Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>) map, (HwV<Boolean, ? extends VoiceEmbodimentMedia, Boolean>) hwV, htJ);
    }
}
