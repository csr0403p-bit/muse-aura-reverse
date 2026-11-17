package com.facebook.aura.vds.compose.bouncy;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AW9;
import X.AWk;
import X.AWl;
import X.AWp;
import X.AaI;
import X.AbstractC07127nr;
import X.AbstractC1439Aj8;
import X.AnonymousClass001;
import X.C0dy;
import X.C1003AOr;
import X.C16Z;
import X.C1qN;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC04911Xu;
import X.InterfaceC1279AgP;
import X.InterfaceC1332AhJ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class BouncyNode extends AbstractC1439Aj8 implements InterfaceC1332AhJ {
    public final AT5<Float, AOW> animatedScalePercent;
    public final float initialClickedVelocity;
    public final C0dy interactionSource;
    public final float pressedScale;
    public final C1003AOr<Float> pressedSpring;
    public final C1003AOr<Float> unpressSpring;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.bouncy.BouncyNode", f = "AuraBouncyIndication.kt", l = {63}, m = "animateToPressed", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToPressed$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BouncyNode.this.animateToPressed(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.bouncy.BouncyNode", f = "AuraBouncyIndication.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "animateToResting", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToResting$1, reason: invalid class name and case insensitive filesystem */
    public final class C142731 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C142731(HtJ<? super C142731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BouncyNode.this.animateToResting(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vds.compose.bouncy.BouncyNode$onAttach$1", f = "AuraBouncyIndication.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.bouncy.BouncyNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    public final class C142741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C142741(HtJ<? super C142741> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BouncyNode.this.new C142741(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return BouncyNode.this.new C142741(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final BouncyNode bouncyNode = BouncyNode.this;
                C3Em<InterfaceC04911Xu> c3Em = ((C1qN) bouncyNode.interactionSource).A00;
                C20Z<? super InterfaceC04911Xu> c20z = new C20Z() { // from class: com.facebook.aura.vds.compose.bouncy.BouncyNode.onAttach.1.1
                    public final Object emit(InterfaceC04911Xu interfaceC04911Xu, HtJ<? super Unit> htJ) {
                        BouncyNode bouncyNode2;
                        boolean z;
                        Object objAnimateToResting;
                        if (interfaceC04911Xu instanceof AWp) {
                            objAnimateToResting = bouncyNode.animateToPressed(htJ);
                        } else {
                            if (!(interfaceC04911Xu instanceof AWk)) {
                                if (interfaceC04911Xu instanceof AWl) {
                                    bouncyNode2 = bouncyNode;
                                    z = true;
                                }
                                return Unit.INSTANCE;
                            }
                            bouncyNode2 = bouncyNode;
                            z = false;
                            objAnimateToResting = bouncyNode2.animateToResting(z, htJ);
                        }
                        if (objAnimateToResting == EnumC10460Hji.A02) {
                            return objAnimateToResting;
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((InterfaceC04911Xu) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c3Em.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public BouncyNode(C0dy c0dy, float f, float f2, float f3, float f4, float f5) {
        C7384Etj.A0Y(c0dy, 0);
        this.interactionSource = c0dy;
        this.pressedScale = f;
        this.initialClickedVelocity = f4;
        this.animatedScalePercent = AT8.A00(1.0f);
        this.pressedSpring = new C1003AOr<>(null, f5, f2);
        this.unpressSpring = new C1003AOr<>(null, f5, f3);
    }

    @Override // X.InterfaceC1332AhJ
    public void draw(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        float fA00 = MutableState.A00(this.animatedScalePercent);
        long jADU = c16z.ADU();
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.Ac6(fA00, fA00, jADU);
            c16z.A9O();
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToPressed(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.vds.compose.bouncy.BouncyNode.AnonymousClass1
            if (r0 == 0) goto L3a
            r6 = r8
            com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToPressed$1 r6 = (com.facebook.aura.vds.compose.bouncy.BouncyNode.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L40
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            X.AT5<java.lang.Float, X.AOW> r3 = r7.animatedScalePercent
            float r0 = r7.pressedScale
            java.lang.Float r2 = X.C8j3.A0u(r0)
            X.AOr<java.lang.Float> r1 = r7.pressedSpring
            r6.label = r4
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r1, r2, r6, r0)
            if (r0 != r5) goto L20
            return r5
        L3a:
            com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToPressed$1 r6 = new com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToPressed$1
            r6.<init>(r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bouncy.BouncyNode.animateToPressed(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToResting(boolean r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.vds.compose.bouncy.BouncyNode.C142731
            if (r0 == 0) goto L44
            r7 = r10
            com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToResting$1 r7 = (com.facebook.aura.vds.compose.bouncy.BouncyNode.C142731) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L4a
            X.Hwg.A00(r3)
        L20:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L23:
            X.Hwg.A00(r3)
            X.AT5<java.lang.Float, X.AOW> r3 = r8.animatedScalePercent
            java.lang.Float r5 = X.AnonymousClass001.A0m()
            X.AOr<java.lang.Float> r4 = r8.unpressSpring
            if (r9 == 0) goto L41
            r0 = 0
        L31:
            java.lang.Float r6 = X.C8j3.A0u(r0)
            r7.Z$0 = r9
            r7.label = r1
            r8 = 0
            java.lang.Object r0 = X.AT5.A00(r3, r4, r5, r6, r7, r8)
            if (r0 != r2) goto L20
            return r2
        L41:
            float r0 = r8.initialClickedVelocity
            goto L31
        L44:
            com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToResting$1 r7 = new com.facebook.aura.vds.compose.bouncy.BouncyNode$animateToResting$1
            r7.<init>(r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bouncy.BouncyNode.animateToResting(boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC1332AhJ
    public /* bridge */ void onMeasureResultChanged() {
    }

    @Override // X.AbstractC1439Aj8
    public void onAttach() {
        AnonymousClass001.A1J(new C142741(null), getCoroutineScope());
    }
}
