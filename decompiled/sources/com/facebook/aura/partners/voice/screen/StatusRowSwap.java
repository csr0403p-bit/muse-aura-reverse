package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.iap.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class StatusRowSwap {
    public final AT5<Float, AOW> alpha = AT8.A00(1.0f);
    public final MutableState inTopRow$delegate;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.StatusRowSwap", f = "VoiceAvatarTakeover.kt", l = {530, MC.wearables_hatch_health_connectors.__CONFIG__, MC.dcp_iap_android.__CONFIG__}, m = "moveTo", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
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
            return StatusRowSwap.this.moveTo(false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$2", f = "VoiceAvatarTakeover.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Float, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ boolean $topRow;
        public /* synthetic */ float F$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$topRow = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$topRow, htJ);
            anonymousClass2.F$0 = AnonymousClass001.A02(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z = true;
            if (!this.$topRow ? f > 0.05f : f < 0.7f) {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A02(f), htJ);
        }

        public final Object invoke(float f, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(Float.valueOf(f), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void setInTopRow(boolean z) {
        MutableState.A09(z, this.inTopRow$delegate);
    }

    public final AT5<Float, AOW> getAlpha() {
        return this.alpha;
    }

    public final boolean getInTopRow() {
        return MutableState.A0A(this.inTopRow$delegate);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object moveTo(boolean r11, kotlin.jvm.functions.Function0<java.lang.Float> r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.partners.voice.screen.StatusRowSwap.AnonymousClass1
            if (r0 == 0) goto L9f
            r6 = r13
            com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$1 r6 = (com.facebook.aura.partners.voice.screen.StatusRowSwap.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 3
            r9 = 1
            r4 = 0
            r8 = 2
            if (r0 == 0) goto L2a
            if (r0 == r9) goto L50
            if (r0 == r8) goto L6f
            if (r0 != r7) goto La6
            X.Hwg.A00(r1)
        L27:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L2a:
            X.Hwg.A00(r1)
            androidx.compose.runtime.MutableState r0 = r10.inTopRow$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == r11) goto L77
            X.AT5<java.lang.Float, X.AOW> r3 = r10.alpha
            java.lang.Float r2 = X.AnonymousClass001.A0l()
            X.28s r1 = X.C2HU.A02
            r0 = 50
            X.ASj r0 = X.AnonymousClass002.A0J(r1, r0)
            r6.L$0 = r12
            r6.Z$0 = r11
            r6.label = r9
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r6, r4)
            if (r0 != r5) goto L59
            return r5
        L50:
            boolean r11 = r6.Z$0
            java.lang.Object r12 = r6.L$0
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            X.Hwg.A00(r1)
        L59:
            X.3ul r1 = X.C6v3.A01(r12)
            com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$2 r0 = new com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$2
            r0.<init>(r11, r4)
            r6.L$0 = r4
            r6.Z$0 = r11
            r6.label = r8
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r6, r0, r1)
            if (r0 != r5) goto L74
            return r5
        L6f:
            boolean r11 = r6.Z$0
            X.Hwg.A00(r1)
        L74:
            r10.setInTopRow(r11)
        L77:
            X.AT5<java.lang.Float, X.AOW> r0 = r10.alpha
            float r0 = X.C3cH.A00(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L27
            X.AT5<java.lang.Float, X.AOW> r3 = r10.alpha
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            X.28s r1 = X.C2HU.A02
            r0 = 150(0x96, float:2.1E-43)
            X.ASj r0 = X.AnonymousClass002.A0J(r1, r0)
            r6.L$0 = r4
            r6.Z$0 = r11
            r6.label = r7
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r6, r4)
            if (r0 != r5) goto L27
            return r5
        L9f:
            com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$1 r6 = new com.facebook.aura.partners.voice.screen.StatusRowSwap$moveTo$1
            r6.<init>(r13)
            goto L12
        La6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.StatusRowSwap.moveTo(boolean, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public StatusRowSwap(boolean z) {
        this.inTopRow$delegate = AnonymousClass002.A0P(Boolean.valueOf(z));
    }
}
