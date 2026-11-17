package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F1F;
import X.G0U;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VoiceCatalogRepository$streamPreviewAudio$collect$1 extends AbstractC7559F3s implements G0U<byte[], Unit> {
    public final /* synthetic */ F1F $cacheable;
    public final /* synthetic */ G0U<byte[], Unit> $onPcmChunk;
    public final /* synthetic */ ByteArrayOutputStream $pcm;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        if (this.$cacheable.element) {
            if (this.$pcm.size() + bArr.length <= 524288) {
                this.$pcm.write(bArr);
            } else {
                this.$cacheable.element = false;
                this.$pcm.reset();
            }
        }
        this.$onPcmChunk.invoke(bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCatalogRepository$streamPreviewAudio$collect$1(F1F f1f, ByteArrayOutputStream byteArrayOutputStream, G0U<? super byte[], Unit> g0u) {
        super(1);
        this.$cacheable = f1f;
        this.$pcm = byteArrayOutputStream;
        this.$onPcmChunk = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws IOException {
        invoke2(bArr);
        return Unit.INSTANCE;
    }
}
