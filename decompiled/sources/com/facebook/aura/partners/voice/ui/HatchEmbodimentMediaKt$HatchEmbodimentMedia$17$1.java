package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import X.G0V;
import X.InterfaceC2178B0w;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$17$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0V<InterfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming, Unit>> $currentOnStillFrameChanged$delegate;
    public final /* synthetic */ InterfaceC2178B0w $stillFrame;
    public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $stillFraming;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$17$1(InterfaceC2178B0w interfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, C1BO<? extends G0V<? super InterfaceC2178B0w, ? super VoiceEmbodimentMedia.ReferenceFraming, Unit>> c1bo) {
        super(1);
        this.$stillFrame = interfaceC2178B0w;
        this.$stillFraming = referenceFraming;
        this.$currentOnStillFrameChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$currentOnStillFrameChanged$delegate.getValue().invoke(this.$stillFrame, this.$stillFraming);
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$17$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
