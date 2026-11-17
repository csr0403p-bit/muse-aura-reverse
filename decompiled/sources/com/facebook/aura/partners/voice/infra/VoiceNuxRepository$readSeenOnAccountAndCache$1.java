package com.facebook.aura.partners.voice.infra;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository", f = "VoiceNuxRepository.kt", l = {69}, m = "readSeenOnAccountAndCache$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra", v = 2)
/* loaded from: classes2.dex */
public final class VoiceNuxRepository$readSeenOnAccountAndCache$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VoiceNuxRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceNuxRepository$readSeenOnAccountAndCache$1(VoiceNuxRepository voiceNuxRepository, HtJ<? super VoiceNuxRepository$readSeenOnAccountAndCache$1> htJ) {
        super(htJ);
        this.this$0 = voiceNuxRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readSeenOnAccountAndCache$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(this);
    }
}
