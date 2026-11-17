package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0V;
import X.InterfaceC2178B0w;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$5$1 extends AbstractC7559F3s implements G0V<InterfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming, Unit> {
    public final /* synthetic */ MutableState<VoiceDragHandleStill> $toneStill$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$5$1(MutableState<VoiceDragHandleStill> mutableState) {
        super(2);
        this.$toneStill$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2178B0w interfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        invoke2(interfaceC2178B0w, referenceFraming);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC2178B0w interfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        VoiceDragHandleStill voiceDragHandleStill;
        MutableState<VoiceDragHandleStill> mutableState = this.$toneStill$delegate;
        if (interfaceC2178B0w != null) {
            voiceDragHandleStill = new VoiceDragHandleStill(interfaceC2178B0w, referenceFraming);
        } else {
            voiceDragHandleStill = null;
        }
        mutableState.Af8(voiceDragHandleStill);
    }
}
