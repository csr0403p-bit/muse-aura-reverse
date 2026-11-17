package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass001;
import X.F2X;
import X.G2j;
import X.HtJ;
import X.HwV;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceCallViewModel$callIdleSelection$2 extends F2X implements G2j {
    public static final VoiceCallViewModel$callIdleSelection$2 INSTANCE = new VoiceCallViewModel$callIdleSelection$2();

    public VoiceCallViewModel$callIdleSelection$2() {
        super(4, HwV.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(AnonymousClass001.A1X(obj), (VoiceEmbodimentMedia) obj2, AnonymousClass001.A1X(obj3), (HtJ<? super HwV<Boolean, ? extends VoiceEmbodimentMedia, Boolean>>) obj4);
    }

    public final Object invoke(boolean z, VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z2, HtJ<? super HwV<Boolean, ? extends VoiceEmbodimentMedia, Boolean>> htJ) {
        return new HwV(Boolean.valueOf(z), voiceEmbodimentMedia, Boolean.valueOf(z2));
    }
}
