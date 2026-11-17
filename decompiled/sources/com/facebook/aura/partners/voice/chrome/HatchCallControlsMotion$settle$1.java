package com.facebook.aura.partners.voice.chrome;

import X.ARY;
import X.AT5;
import X.AWx;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1", f = "HatchCallControlsMotion.kt", l = {184, 188}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCallControlsMotion$settle$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isAutomatic;
    public final /* synthetic */ long $target;
    public float F$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchCallControlsMotion this$0;

    /* renamed from: com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT5<AWx, ARY>, Unit> {
        public final /* synthetic */ HatchCallControlsMotion this$0;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT5<AWx, ARY> at5) {
            C7384Etj.A0Y(at5, 0);
            HatchCallControlsMotion hatchCallControlsMotion = this.this$0;
            hatchCallControlsMotion.m1698setPositionk4lQ0M(hatchCallControlsMotion.bounds.m1688constrainMKHz9U(((AWx) at5.A04.getValue()).A00));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchCallControlsMotion hatchCallControlsMotion) {
            super(1);
            this.this$0 = hatchCallControlsMotion;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT5<AWx, ARY> at5) {
            invoke2(at5);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AT5<AWx, ARY>, Unit> {
        public final /* synthetic */ boolean $isAutomatic;
        public final /* synthetic */ HatchCallControlsMotion this$0;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT5<AWx, ARY> at5) {
            C7384Etj.A0Y(at5, 0);
            HatchCallControlsMotion hatchCallControlsMotion = this.this$0;
            boolean z = this.$isAutomatic;
            CallControlsBounds callControlsBounds = hatchCallControlsMotion.bounds;
            long j = ((AWx) at5.A04.getValue()).A00;
            hatchCallControlsMotion.m1698setPositionk4lQ0M(z ? callControlsBounds.m1689constrainToAreaMKHz9U(j) : callControlsBounds.m1688constrainMKHz9U(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCallControlsMotion hatchCallControlsMotion, boolean z) {
            super(1);
            this.this$0 = hatchCallControlsMotion;
            this.$isAutomatic = z;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT5<AWx, ARY> at5) {
            invoke2(at5);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCallControlsMotion$settle$1(HatchCallControlsMotion hatchCallControlsMotion, boolean z, long j, HtJ<? super HatchCallControlsMotion$settle$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchCallControlsMotion;
        this.$isAutomatic = z;
        this.$target = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCallControlsMotion$settle$1(this.this$0, this.$isAutomatic, this.$target, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L12
            if (r0 == r8) goto La1
            if (r0 != r9) goto Lce
            X.Hwg.A00(r12)
        Lf:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L12:
            X.Hwg.A00(r12)
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r0 = r11.this$0
            long r0 = r0.m1703getPositionF1C5BW0()
            X.AWx r4 = new X.AWx
            r4.<init>(r0)
            X.31w<X.AWx, X.ARY> r0 = X.AVd.A06
            r3 = 0
            X.AT5 r2 = new X.AT5
            r2.<init>(r0, r4, r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1137180672(0x43c80000, float:400.0)
            X.AOr r5 = new X.AOr
            r5.<init>(r3, r1, r0)
            boolean r0 = r11.$isAutomatic
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r3 = r11.this$0
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r4 = r3.bounds
            if (r0 == 0) goto L82
            X.AaC r0 = r4.area
            float r1 = r0.A03
        L3d:
            r7 = r1
        L3e:
            long r0 = r3.m1703getPositionF1C5BW0()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r0 = X.AnonymousClass001.A01(r0, r3)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lae
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r0 = r11.this$0
            long r0 = r0.m1703getPositionF1C5BW0()
            float r10 = X.AnonymousClass001.A00(r0)
            long r0 = r11.$target
            float r0 = X.AnonymousClass001.A01(r0, r3)
            float r0 = java.lang.Math.max(r7, r0)
            long r0 = X.AnonymousClass005.A0M(r10, r0)
            X.AWx r3 = new X.AWx
            r3.<init>(r0)
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r1 = r11.this$0
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$1 r0 = new com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$1
            r0.<init>(r1)
            r11.L$0 = r2
            r11.L$1 = r5
            r11.F$0 = r7
            r11.label = r8
            java.lang.Object r0 = X.AnonymousClass002.A0i(r2, r5, r3, r11, r0)
            if (r0 != r6) goto Lae
            return r6
        L82:
            long r0 = r3.m1703getPositionF1C5BW0()
            float r3 = X.AnonymousClass001.A00(r0)
            long r0 = r11.$target
            float r0 = X.AnonymousClass001.A00(r0)
            float r7 = r4.topAlongPath(r3, r0)
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r3 = r11.this$0
            com.facebook.aura.partners.voice.chrome.CallControlsBounds r0 = r3.bounds
            X.AaC r0 = r0.area
            float r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            goto L3d
        La1:
            float r7 = r11.F$0
            java.lang.Object r5 = r11.L$1
            X.AOr r5 = (X.C1003AOr) r5
            java.lang.Object r2 = r11.L$0
            X.AT5 r2 = (X.AT5) r2
            X.Hwg.A00(r12)
        Lae:
            long r0 = r11.$target
            X.AWx r4 = new X.AWx
            r4.<init>(r0)
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r3 = r11.this$0
            boolean r0 = r11.$isAutomatic
            com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$2 r1 = new com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1$2
            r1.<init>(r3, r0)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.F$0 = r7
            r11.label = r9
            java.lang.Object r0 = X.AnonymousClass002.A0i(r2, r5, r4, r11, r1)
            if (r0 != r6) goto Lf
            return r6
        Lce:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion$settle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCallControlsMotion$settle$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
