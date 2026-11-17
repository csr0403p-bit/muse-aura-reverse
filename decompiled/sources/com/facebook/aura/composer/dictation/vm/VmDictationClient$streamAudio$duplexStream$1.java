package com.facebook.aura.composer.dictation.vm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.dictation.vm.VmDictationClient$streamAudio$duplexStream$1", f = "VmDictationClient.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VmDictationClient$streamAudio$duplexStream$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchDuplexHttpStream>, Object> {
    public final /* synthetic */ InterfaceC10560Hsz<HatchDuplexHttpStream> $opening;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmDictationClient$streamAudio$duplexStream$1(InterfaceC10560Hsz<HatchDuplexHttpStream> interfaceC10560Hsz, HtJ<? super VmDictationClient$streamAudio$duplexStream$1> htJ) {
        super(2, htJ);
        this.$opening = interfaceC10560Hsz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmDictationClient$streamAudio$duplexStream$1(this.$opening, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            InterfaceC10560Hsz<HatchDuplexHttpStream> interfaceC10560Hsz = this.$opening;
            this.label = 1;
            obj = C3cG.A0W(interfaceC10560Hsz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchDuplexHttpStream> htJ) {
        return new VmDictationClient$streamAudio$duplexStream$1(this.$opening, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
