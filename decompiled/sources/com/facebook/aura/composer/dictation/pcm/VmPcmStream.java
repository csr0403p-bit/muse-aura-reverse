package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.C9273GCa;
import X.G0U;
import X.G0V;
import X.GAt;
import X.GBM;
import X.HtJ;
import X.InterfaceC10560Hsz;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.vm.VmDictationClient;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VmPcmStream implements PcmDictationStream {
    public final VmDictationClient client;
    public volatile G0U<? super String, Unit> onPartial;
    public final InterfaceC10560Hsz<String> result;
    public volatile String transcript;

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VmPcmStream$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U<String, Unit> onPartial = VmPcmStream.this.getOnPartial();
            if (onPartial != null) {
                onPartial.invoke(str);
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VmPcmStream$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            VmPcmStream.this.transcript = str;
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VmPcmStream$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<DictationOutcome, String, Unit> {
        public AnonymousClass3() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome, String str) {
            invoke2(dictationOutcome, str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DictationOutcome dictationOutcome, String str) {
            C7384Etj.A0Y(dictationOutcome, 0);
            VmPcmStream vmPcmStream = VmPcmStream.this;
            InterfaceC10560Hsz<String> interfaceC10560Hsz = vmPcmStream.result;
            String str2 = vmPcmStream.transcript;
            if (dictationOutcome != DictationOutcome.COMPLETED) {
                str2 = null;
            }
            C3cG.A1F(interfaceC10560Hsz, str2);
        }
    }

    public VmPcmStream(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.client = new VmDictationClient(abstractC3358CGz);
        this.result = new GAt(null);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void append(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        this.client.appendPcm(PcmDictationKt.toLittleEndianPcmBytes(sArr));
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public Object awaitAcknowledged(HtJ<? super Boolean> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9273GCa.A05;
        C9273GCa c9273GCa = new C9273GCa(htJ.getContext());
        c9273GCa.A07(new VmPcmStream$awaitAcknowledged$2$1(null), ((GBM) this.client.opened).A0H());
        c9273GCa.A07(new VmPcmStream$awaitAcknowledged$2$2(null), ((GBM) this.result).A0H());
        return C9273GCa.A03(htJ, c9273GCa);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void close() {
        this.client.cancel();
        C3cG.A1F(this.result, null);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public Object finish(HtJ<? super String> htJ) {
        this.client.endAudio();
        return C3cG.A0W(this.result, htJ);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public G0U<String, Unit> getOnPartial() {
        return this.onPartial;
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void setOnPartial(G0U<? super String, Unit> g0u) {
        this.onPartial = g0u;
    }

    public final void start() {
        VmDictationClient vmDictationClient = this.client;
        vmDictationClient.onPartial = new AnonymousClass1();
        vmDictationClient.onFinal = new AnonymousClass2();
        vmDictationClient.onClosed = new AnonymousClass3();
        vmDictationClient.start();
    }
}
