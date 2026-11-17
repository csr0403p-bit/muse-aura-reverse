package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F1F;
import X.G0U;
import X.GBM;
import X.InterfaceC10560Hsz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$streamVmPreviewPcm$2$sink$1 extends AbstractC7559F3s implements G0U<byte[], Unit> {
    public final /* synthetic */ InterfaceC10560Hsz<Boolean> $audioStarted;
    public final /* synthetic */ Function0<Unit> $onFirstAudio;
    public final /* synthetic */ G0U<byte[], Unit> $onPcmChunk;
    public final /* synthetic */ F1F $playing;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        if (!this.$playing.element && ((GBM) this.$audioStarted).A0R(true)) {
            this.$playing.element = true;
            this.$onFirstAudio.invoke();
        }
        if (this.$playing.element) {
            this.$onPcmChunk.invoke(bArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCatalogRepository$streamVmPreviewPcm$2$sink$1(F1F f1f, InterfaceC10560Hsz<Boolean> interfaceC10560Hsz, Function0<Unit> function0, G0U<? super byte[], Unit> g0u) {
        super(1);
        this.$playing = f1f;
        this.$audioStarted = interfaceC10560Hsz;
        this.$onFirstAudio = function0;
        this.$onPcmChunk = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
        invoke2(bArr);
        return Unit.INSTANCE;
    }
}
