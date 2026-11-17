package com.facebook.aura.conversation.view;

import X.ASR;
import X.AST;
import X.ATD;
import X.AW9;
import X.AaC;
import X.AbstractC7559F3s;
import X.ApQ;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import X.HxE;
import X.InterfaceC1068ATy;
import X.InterfaceC1327AhE;
import X.InterfaceC1330AhH;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ ApQ $annotatedText;
    public final /* synthetic */ VoiceTranscriptReveal $reveal;
    public final /* synthetic */ String $text;
    public final /* synthetic */ MutableState<C1958Aux> $textLayout$delegate;

    /* renamed from: com.facebook.aura.conversation.view.HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ long $fadeEndTimeMs;
        public final /* synthetic */ AaC $layerBounds;
        public final /* synthetic */ InterfaceC1330AhH $layerPaint;
        public final /* synthetic */ List<HxE<VoiceTranscriptWord, InterfaceC1068ATy>> $masks;
        public final /* synthetic */ VoiceTranscriptReveal $reveal;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C7384Etj.A0Y(c16z, 0);
            if (this.$reveal.getFrameTimeMs() >= this.$fadeEndTimeMs) {
                c16z.A9O();
                return;
            }
            InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(c16z);
            AaC aaC = this.$layerBounds;
            InterfaceC1330AhH interfaceC1330AhH = this.$layerPaint;
            List<HxE<VoiceTranscriptWord, InterfaceC1068ATy>> list = this.$masks;
            try {
                interfaceC1327AhEA01.Ac3(aaC, interfaceC1330AhH);
                c16z.A9O();
                for (HxE<VoiceTranscriptWord, InterfaceC1068ATy> hxE : list) {
                    VoiceTranscriptWord voiceTranscriptWord = hxE.first;
                    InterfaceC1068ATy interfaceC1068ATy = hxE.second;
                    float fA03 = ATD.A03((r6 - voiceTranscriptWord.appearedAtMs) / 300.0f, 0.0f, 1.0f);
                    if (fA03 < 1.0f) {
                        c16z.A9d(null, interfaceC1068ATy, C16a.A00, 1.0f - fA03, 8, B6A.A01);
                    }
                }
            } finally {
                interfaceC1327AhEA01.Abc();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(VoiceTranscriptReveal voiceTranscriptReveal, long j, AaC aaC, InterfaceC1330AhH interfaceC1330AhH, List<? extends HxE<VoiceTranscriptWord, ? extends InterfaceC1068ATy>> list) {
            super(1);
            this.$reveal = voiceTranscriptReveal;
            this.$fadeEndTimeMs = j;
            this.$layerBounds = aaC;
            this.$layerPaint = interfaceC1330AhH;
            this.$masks = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.ASR invoke(X.AST r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            androidx.compose.runtime.MutableState<X.Aux> r0 = r9.$textLayout$delegate
            java.lang.Object r4 = r0.getValue()
            X.Aux r4 = (X.C1958Aux) r4
            if (r4 == 0) goto L50
            X.ApQ r1 = r9.$annotatedText
            X.Ask r0 = r4.A04
            X.ApQ r0 = r0.A03
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L50
            com.facebook.aura.conversation.view.VoiceTranscriptReveal r0 = r9.$reveal
            androidx.compose.runtime.MutableState r0 = r0.text$delegate
            java.lang.String r1 = androidx.compose.runtime.MutableState.A05(r0)
            java.lang.String r0 = r9.$text
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L50
            com.facebook.aura.conversation.view.VoiceTranscriptReveal r0 = r9.$reveal
            java.util.List r0 = r0.getWords()
            java.util.ArrayList r8 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r3 = r0.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r2 = r3.next()
            com.facebook.aura.conversation.view.VoiceTranscriptWord r2 = (com.facebook.aura.conversation.view.VoiceTranscriptWord) r2
            int r1 = r2.start
            int r0 = r2.end
            X.Aot r0 = r4.A07(r1, r0)
            X.AnonymousClass002.A1J(r2, r0, r8)
            goto L38
        L50:
            X.AGi r8 = X.C0881AGi.A00
        L52:
            java.util.Iterator r5 = r8.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L7b
            r4 = 0
        L5e:
            r2 = 0
            X.1DO r0 = r10.A00
            long r0 = r0.AKb()
            X.AaC r6 = X.C2J7.A00(r2, r0)
            X.AqX r7 = new X.AqX
            r7.<init>()
            com.facebook.aura.conversation.view.VoiceTranscriptReveal r3 = r9.$reveal
            com.facebook.aura.conversation.view.HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1$1 r2 = new com.facebook.aura.conversation.view.HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1$1
            r2.<init>(r3, r4, r6, r7, r8)
            X.ASR r0 = r10.A01(r2)
            return r0
        L7b:
            java.lang.Object r0 = r5.next()
            X.HxE r0 = (X.HxE) r0
            A r0 = r0.first
            com.facebook.aura.conversation.view.VoiceTranscriptWord r0 = (com.facebook.aura.conversation.view.VoiceTranscriptWord) r0
            long r0 = r0.appearedAtMs
            r3 = 300(0x12c, double:1.48E-321)
            long r0 = r0 + r3
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L8e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r5.next()
            X.HxE r0 = (X.HxE) r0
            A r0 = r0.first
            com.facebook.aura.conversation.view.VoiceTranscriptWord r0 = (com.facebook.aura.conversation.view.VoiceTranscriptWord) r0
            long r0 = r0.appearedAtMs
            long r0 = r0 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L8e
            r2 = r1
            goto L8e
        Lad:
            long r4 = r2.longValue()
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1.invoke(X.AST):X.ASR");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1(VoiceTranscriptReveal voiceTranscriptReveal, String str, MutableState<C1958Aux> mutableState, ApQ apQ) {
        super(1);
        this.$reveal = voiceTranscriptReveal;
        this.$text = str;
        this.$textLayout$delegate = mutableState;
        this.$annotatedText = apQ;
    }
}
