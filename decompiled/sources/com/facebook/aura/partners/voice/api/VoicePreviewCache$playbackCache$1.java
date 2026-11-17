package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import X.HxE;

/* loaded from: classes3.dex */
public final class VoicePreviewCache$playbackCache$1 extends AbstractC7559F3s implements G0V<HxE<? extends String, ? extends String>, byte[], Long> {
    public static final VoicePreviewCache$playbackCache$1 INSTANCE = new VoicePreviewCache$playbackCache$1();

    public VoicePreviewCache$playbackCache$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Long invoke(HxE<? extends String, ? extends String> hxE, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        return Long.valueOf(r2.length);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Long invoke2(HxE<String, String> hxE, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        return Long.valueOf(bArr.length);
    }
}
