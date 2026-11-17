package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1", f = "EmbodimentActivityCover.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Bitmap> $capture;
    public final /* synthetic */ boolean $captureNeeded;
    public final /* synthetic */ int $loadGeneration;
    public final /* synthetic */ VoiceEmbodimentMediaReducerState $playback;
    public final /* synthetic */ MutableState<RetainedActivityCover> $retainedCover$delegate;
    public final /* synthetic */ Function0<AWA> $viewport;
    public int I$0;
    public long J$0;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1(boolean z, Function0<Bitmap> function0, int i, VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, Function0<AWA> function02, MutableState<RetainedActivityCover> mutableState, HtJ<? super EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1> htJ) {
        super(2, htJ);
        this.$captureNeeded = z;
        this.$capture = function0;
        this.$loadGeneration = i;
        this.$playback = voiceEmbodimentMediaReducerState;
        this.$viewport = function02;
        this.$retainedCover$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1(this.$captureNeeded, this.$capture, this.$loadGeneration, this.$playback, this.$viewport, this.$retainedCover$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:6:0x0010). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r5 = 1
            if (r0 == 0) goto L36
            if (r0 != r5) goto L87
            int r3 = r10.I$0
            long r1 = r10.J$0
            X.Hwg.A00(r11)
        L10:
            r7 = 2
            long r1 = r1 * r7
            r7 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L1b
            r1 = 5000(0x1388, double:2.4703E-320)
        L1b:
            androidx.compose.runtime.MutableState<com.facebook.aura.partners.voice.ui.RetainedActivityCover> r0 = r10.$retainedCover$delegate
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L75
            r9 = 0
            kotlin.jvm.functions.Function0<android.graphics.Bitmap> r0 = r10.$capture     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L54
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L54
            X.B1T r7 = new X.B1T     // Catch: java.lang.Throwable -> L41
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L41
            goto L55
        L36:
            X.Hwg.A00(r11)
            boolean r0 = r10.$captureNeeded
            if (r0 == 0) goto L75
            r1 = 250(0xfa, double:1.235E-321)
            r3 = 0
            goto L1b
        L41:
            r4 = move-exception
            boolean r0 = r4 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof java.lang.OutOfMemoryError
            if (r0 == 0) goto L8b
        L4a:
            if (r3 != 0) goto L54
            java.lang.String r3 = "HatchEmbodimentMedia"
            java.lang.String r0 = "Retained frame capture failed"
            X.CFK.A0K(r3, r4, r0)
            r3 = 1
        L54:
            r7 = r9
        L55:
            if (r7 == 0) goto L78
            androidx.compose.runtime.MutableState<com.facebook.aura.partners.voice.ui.RetainedActivityCover> r1 = r10.$retainedCover$delegate
            int r8 = r10.$loadGeneration
            com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState r0 = r10.$playback
            com.facebook.aura.partners.voice.ui.EmbodimentClip r0 = r0.activeClip
            if (r0 == 0) goto L63
            com.facebook.aura.partners.voice.ui.EmbodimentClipKind r9 = r0.kind
        L63:
            kotlin.jvm.functions.Function0<X.AWA> r0 = r10.$viewport
            java.lang.Object r0 = r0.invoke()
            X.AWA r0 = (X.AWA) r0
            long r10 = r0.A00
            com.facebook.aura.partners.voice.ui.RetainedActivityCover r6 = new com.facebook.aura.partners.voice.ui.RetainedActivityCover
            r6.<init>(r7, r8, r9, r10)
            r1.Af8(r6)
        L75:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L78:
            r10.L$0 = r9
            r10.J$0 = r1
            r10.I$0 = r3
            r10.label = r5
            java.lang.Object r0 = X.C7Bq.A01(r1, r10)
            if (r0 != r6) goto L10
            return r6
        L87:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
        L8b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
