package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AnonymousClass002;
import X.HtJ;
import X.HzP;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceNuxTransition {
    public final AT5<Float, AOW> alpha = AT8.A00(1.0f);
    public final MutableState displaysVoiceNux$delegate;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceNuxTransition", f = "HatchVoiceAnnouncementSheet.kt", l = {173, 177}, m = "switchTo", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceNuxTransition$switchTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceNuxTransition.this.switchTo(false, this);
        }
    }

    private final void setDisplaysVoiceNux(boolean z) {
        MutableState.A09(z, this.displaysVoiceNux$delegate);
    }

    public final AT5<Float, AOW> getAlpha() {
        return this.alpha;
    }

    public final boolean getDisplaysVoiceNux() {
        return MutableState.A0A(this.displaysVoiceNux$delegate);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object switchTo(boolean r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.screen.VoiceNuxTransition.AnonymousClass1
            if (r0 == 0) goto L89
            r7 = r14
            com.facebook.aura.partners.voice.screen.VoiceNuxTransition$switchTo$1 r7 = (com.facebook.aura.partners.voice.screen.VoiceNuxTransition.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r9 = 0
            r8 = 2
            r11 = 1
            if (r0 == 0) goto L27
            if (r0 == r11) goto L51
            if (r0 != r8) goto L8f
            X.Hwg.A00(r1)
        L24:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L27:
            X.Hwg.A00(r1)
            androidx.compose.runtime.MutableState r0 = r12.displaysVoiceNux$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            r5 = 0
            if (r0 == r13) goto L5b
            r5 = 1
            X.AT5<java.lang.Float, X.AOW> r10 = r12.alpha
            java.lang.Float r4 = X.AnonymousClass001.A0l()
            X.28s r3 = X.C2I5.A02
            r2 = 0
            r1 = 80
            X.ASj r0 = new X.ASj
            r0.<init>(r3, r1, r9)
            r7.Z$0 = r13
            r7.I$0 = r11
            r7.label = r11
            java.lang.Object r0 = X.AnonymousClass002.A0i(r10, r0, r4, r7, r2)
            if (r0 != r6) goto L58
            return r6
        L51:
            int r5 = r7.I$0
            boolean r13 = r7.Z$0
            X.Hwg.A00(r1)
        L58:
            r12.setDisplaysVoiceNux(r13)
        L5b:
            X.AT5<java.lang.Float, X.AOW> r0 = r12.alpha
            float r0 = X.C3cH.A00(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L24
            X.AT5<java.lang.Float, X.AOW> r4 = r12.alpha
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            if (r5 == 0) goto L72
            r9 = 175(0xaf, float:2.45E-43)
        L72:
            X.28s r2 = X.C2I5.A01
            r0 = 120(0x78, float:1.68E-43)
            X.ASj r1 = new X.ASj
            r1.<init>(r2, r0, r9)
            r7.Z$0 = r13
            r7.I$0 = r5
            r7.label = r8
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r1, r3, r7, r0)
            if (r0 != r6) goto L24
            return r6
        L89:
            com.facebook.aura.partners.voice.screen.VoiceNuxTransition$switchTo$1 r7 = new com.facebook.aura.partners.voice.screen.VoiceNuxTransition$switchTo$1
            r7.<init>(r14)
            goto L12
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceNuxTransition.switchTo(boolean, X.HtJ):java.lang.Object");
    }

    public VoiceNuxTransition(boolean z) {
        this.displaysVoiceNux$delegate = AnonymousClass002.A0P(Boolean.valueOf(z));
    }
}
