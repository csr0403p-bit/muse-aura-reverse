package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9273GCa;
import X.G0U;
import X.GAt;
import X.GBM;
import X.HtJ;
import X.InterfaceC10560Hsz;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrAudioEncoding;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrMode;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrResult;
import com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VoyagerPcmStream implements PcmDictationStream {
    public final InterfaceC10560Hsz<Unit> acknowledged;
    public final VoyagerAsrClient client;
    public volatile G0U<? super String, Unit> onPartial;
    public final InterfaceC10560Hsz<String> result;
    public volatile String transcript;

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VoyagerPcmStream$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U<String, Unit> onPartial = VoyagerPcmStream.this.getOnPartial();
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

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VoyagerPcmStream$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            VoyagerPcmStream.this.transcript = str;
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

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VoyagerPcmStream$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass3() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C3cG.A1F(VoyagerPcmStream.this.acknowledged, Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.pcm.VoyagerPcmStream$start$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<VoyagerAsrResult, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoyagerAsrResult voyagerAsrResult) {
            C7384Etj.A0Y(voyagerAsrResult, 0);
            VoyagerPcmStream voyagerPcmStream = VoyagerPcmStream.this;
            InterfaceC10560Hsz<String> interfaceC10560Hsz = voyagerPcmStream.result;
            String str = voyagerPcmStream.transcript;
            if (voyagerAsrResult.outcome != DictationOutcome.COMPLETED) {
                str = null;
            }
            C3cG.A1F(interfaceC10560Hsz, str);
        }

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoyagerAsrResult voyagerAsrResult) {
            invoke2(voyagerAsrResult);
            return Unit.INSTANCE;
        }
    }

    public VoyagerPcmStream(String str, String str2, Function0<? extends List<String>> function0) {
        String str3 = str2;
        AnonymousClass005.A0x(str, str2, function0);
        this.client = new VoyagerAsrClient(VoyagerAsrMode.PUSH_TO_TALK, str, C7BY.A0j(str2) ? VoyagerDictationEngine.DEFAULT_MODEL : str3, function0, VoyagerAsrAudioEncoding.PCM_24KHZ);
        this.acknowledged = new GAt(null);
        this.result = new GAt(null);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void append(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        this.client.appendPcm(PcmDictationKt.toLittleEndianPcmBytes(sArr));
    }

    public final boolean start(String str) {
        C7384Etj.A0Y(str, 0);
        VoyagerAsrClient voyagerAsrClient = this.client;
        voyagerAsrClient.onPartial = new AnonymousClass1();
        voyagerAsrClient.onFinal = new AnonymousClass2();
        voyagerAsrClient.onAcknowledged = new AnonymousClass3();
        voyagerAsrClient.onClosed = new AnonymousClass4();
        return voyagerAsrClient.start(str);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public Object awaitAcknowledged(HtJ<? super Boolean> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9273GCa.A05;
        C9273GCa c9273GCa = new C9273GCa(htJ.getContext());
        c9273GCa.A07(new VoyagerPcmStream$awaitAcknowledged$2$1(null), ((GBM) this.acknowledged).A0H());
        c9273GCa.A07(new VoyagerPcmStream$awaitAcknowledged$2$2(null), ((GBM) this.result).A0H());
        return C9273GCa.A03(htJ, c9273GCa);
    }

    @Override // com.facebook.aura.composer.dictation.pcm.PcmDictationStream
    public void close() {
        this.client.close();
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
}
