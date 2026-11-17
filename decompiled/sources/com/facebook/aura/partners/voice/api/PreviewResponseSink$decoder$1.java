package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.io.IOException;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PreviewResponseSink$decoder$1 extends AbstractC7559F3s implements G0U<byte[], Unit> {
    public final /* synthetic */ int $maxAudioBytes;
    public final /* synthetic */ PreviewResponseSink this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        if (bArr.length > this.$maxAudioBytes - this.this$0.audio.size()) {
            throw new IOException("Voice preview exceeds audio limit");
        }
        this.this$0.audio.write(bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewResponseSink$decoder$1(int i, PreviewResponseSink previewResponseSink) {
        super(1);
        this.$maxAudioBytes = i;
        this.this$0 = previewResponseSink;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws IOException {
        invoke2(bArr);
        return Unit.INSTANCE;
    }
}
