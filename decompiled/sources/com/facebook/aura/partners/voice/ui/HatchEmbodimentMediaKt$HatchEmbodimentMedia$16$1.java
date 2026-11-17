package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$16$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ C1BO<G0U<VoiceStillHandoffEvent, Unit>> $currentOnStillHandoffEvent$delegate;
    public final /* synthetic */ VoiceEmbodimentMedia.StaticAvatar $targetStill;
    public final /* synthetic */ String $targetStillKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$16$1(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, C1BO<? extends G0U<? super VoiceStillHandoffEvent, Unit>> c1bo) {
        super(1);
        this.$callGeneration = j;
        this.$targetStill = staticAvatar;
        this.$targetStillKey = str;
        this.$currentOnStillHandoffEvent$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnStillHandoffEvent$delegate).invoke(new VoiceStillHandoffEvent.Target(this.$callGeneration, this.$targetStill, this.$targetStillKey));
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$16$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
