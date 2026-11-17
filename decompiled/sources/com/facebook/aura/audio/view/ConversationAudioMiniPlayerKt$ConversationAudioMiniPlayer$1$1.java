package com.facebook.aura.audio.view;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C00q;
import X.C2ae;
import X.G0U;
import com.facebook.common.callercontext.ContextChain;

/* loaded from: classes.dex */
public final class ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C00q $offsetX$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$1$1(C00q c00q) {
        super(1);
        this.$offsetX$delegate = c00q;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m275invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m275invokeBjo55l4(AXN axn) {
        C00q c00q = this.$offsetX$delegate;
        ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
        return Ab3.A01(c00q.AFn()) << 32;
    }
}
