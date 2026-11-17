package com.facebook.aura.ccv.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchCheckoutClient {
    public final Context context;

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {393, 400}, m = "awaitCardSaveConfirmation", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.awaitCardSaveConfirmation(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$2", f = "HatchCheckoutClient.kt", l = {394, 396, 397}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ HatchCheckoutCharge $charge;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCheckoutCharge hatchCheckoutCharge, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$charge = hatchCheckoutCharge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCheckoutClient.this.new AnonymousClass2(this.$charge, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0021 -> B:14:0x0027). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r1 = r6.label
                r4 = 3
                r3 = 2
                r0 = 1
                if (r1 == 0) goto L14
                if (r1 == r0) goto L24
                if (r1 == r3) goto L45
                if (r1 == r4) goto L24
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L14:
                X.Hwg.A00(r7)
                com.facebook.aura.ccv.nativeflow.HatchCheckoutClient r2 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.this
                com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r1 = r6.$charge
                r6.label = r0
            L1d:
                java.lang.Object r7 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.access$fetchCardActionState(r2, r1, r6)
                if (r7 != r5) goto L27
                return r5
            L24:
                X.Hwg.A00(r7)
            L27:
                java.lang.String r0 = "SUCCESS"
                boolean r0 = r0.equals(r7)
                if (r0 != 0) goto L52
                java.lang.String r0 = "FAILURE"
                boolean r0 = r0.equals(r7)
                if (r0 != 0) goto L52
                r0 = 0
                r6.L$0 = r0
                r6.label = r3
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r5) goto L48
                return r5
            L45:
                X.Hwg.A00(r7)
            L48:
                com.facebook.aura.ccv.nativeflow.HatchCheckoutClient r2 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.this
                com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r1 = r6.$charge
                r0 = 0
                r6.L$0 = r0
                r6.label = r4
                goto L1d
            L52:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$3", f = "HatchCheckoutClient.kt", l = {400}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ HatchCheckoutCharge $charge;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchCheckoutCharge hatchCheckoutCharge, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$charge = hatchCheckoutCharge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCheckoutClient.this.new AnonymousClass3(this.$charge, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCheckoutClient hatchCheckoutClient = HatchCheckoutClient.this;
                HatchCheckoutCharge hatchCheckoutCharge = this.$charge;
                this.label = 1;
                obj = hatchCheckoutClient.fetchCardActionState(hatchCheckoutCharge, this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {502}, m = "fetchCardActionState", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$1, reason: invalid class name and case insensitive filesystem */
    public final class C110181 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C110181(HtJ<? super C110181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.fetchCardActionState(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {502}, m = "finalize", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalize$1, reason: invalid class name and case insensitive filesystem */
    public final class C110191 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C110191(HtJ<? super C110191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.finalize(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {StaggeredEntranceKt.StaggeredEntranceDurationMs, 383}, m = "finalizeAfterChallenge", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$1, reason: invalid class name and case insensitive filesystem */
    public final class C110201 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110201(HtJ<? super C110201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.finalizeAfterChallenge(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$2", f = "HatchCheckoutClient.kt", l = {383}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$2, reason: invalid class name and case insensitive filesystem */
    public final class C110212 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCcvResult>, Object> {
        public final /* synthetic */ HatchCheckoutCharge $charge;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110212(HatchCheckoutCharge hatchCheckoutCharge, HtJ<? super C110212> htJ) {
            super(2, htJ);
            this.$charge = hatchCheckoutCharge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCheckoutClient.this.new C110212(this.$charge, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCheckoutClient hatchCheckoutClient = HatchCheckoutClient.this;
                HatchCheckoutCharge hatchCheckoutCharge = this.$charge;
                this.label = 1;
                obj = hatchCheckoutClient.finalize(hatchCheckoutCharge, this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super HatchCcvResult> htJ) {
            return ((C110212) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {502}, m = "startCheckout", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$startCheckout$1, reason: invalid class name and case insensitive filesystem */
    public final class C110221 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C110221(HtJ<? super C110221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.startCheckout(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchCheckoutClient", f = "HatchCheckoutClient.kt", l = {502, 299, 525, 369}, m = "submitCard", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$submitCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C110231 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C110231(HtJ<? super C110231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckoutClient.this.submitCard(null, null, null, null, null, null, null, null, null, this);
        }
    }

    public HatchCheckoutClient(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCardActionState(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r14, X.HtJ<? super java.lang.String> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.C110181
            if (r0 == 0) goto L63
            r15 = r3
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$1 r15 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.C110181) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r1 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r11 = 1
            if (r0 == 0) goto L2d
            if (r0 != r11) goto L74
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L22:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L69
            com.facebook.aura.ccv.nativeflow.HatchCheckoutCardProcessingInfoResponseJson r1 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutCardProcessingInfoResponseJson) r1
            java.lang.String r2 = r1.card_action_state
            return r2
        L2d:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r1)
            com.facebook.aura.ccv.nativeflow.CcvStefiPath$CheckoutCardProcessingInfo r7 = com.facebook.aura.ccv.nativeflow.CcvStefiPath.CheckoutCardProcessingInfo.INSTANCE
            java.lang.String r1 = r14.credentialId
            com.facebook.aura.ccv.nativeflow.HatchCheckoutSession r0 = r14.session
            java.lang.String r0 = r0.uplSessionId
            com.facebook.aura.ccv.nativeflow.HatchCheckoutCardProcessingInfoRequestJson r8 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutCardProcessingInfoRequestJson
            r8.<init>(r1, r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r6 = 0
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.I$0 = r11
            r15.I$1 = r6
            r15.label = r11
            r13 = r6
            r14 = r12
            java.lang.Object r1 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L22
            return r2
        L63:
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$1 r15 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$fetchCardActionState$1
            r15.<init>(r3)
            goto L13
        L69:
            boolean r0 = com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt.isFinalClientError(r0)
            if (r0 == 0) goto L72
            java.lang.String r2 = "FAILURE"
            return r2
        L72:
            r2 = 0
            return r2
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.fetchCardActionState(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitCardSaveConfirmation(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r8, X.HtJ<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.AnonymousClass1
            if (r0 == 0) goto L53
            r6 = r9
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$1 r6 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 == r0) goto L3a
            if (r1 != r3) goto L59
            X.Hwg.A00(r2)
        L24:
            return r2
        L25:
            X.Hwg.A00(r2)
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$2 r2 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$2
            r2.<init>(r8, r4)
            r6.L$0 = r8
            r6.label = r0
            r0 = 25000(0x61a8, double:1.23516E-319)
            java.lang.Object r2 = X.GAX.A01(r6, r2, r0)
            if (r2 != r5) goto L41
            return r5
        L3a:
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r8 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge) r8
            X.Hwg.A00(r2)
        L41:
            if (r2 != 0) goto L24
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$3 r0 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$3
            r0.<init>(r8, r4)
            r6.L$0 = r4
            r6.label = r3
            java.lang.Object r2 = X.C8j4.A0s(r0, r6)
            if (r2 != r5) goto L24
            return r5
        L53:
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$1 r6 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$awaitCardSaveConfirmation$1
            r6.<init>(r9)
            goto L12
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.awaitCardSaveConfirmation(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finalize(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r33, X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchCcvResult> r34) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.finalize(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finalizeAfterChallenge(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r8, X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchCcvResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.C110201
            if (r0 == 0) goto L78
            r5 = r9
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$1 r5 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.C110201) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r5.label
            java.lang.String r3 = "HatchCheckoutClient"
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 == r0) goto L43
            if (r1 != r4) goto L7e
            X.Hwg.A00(r2)
        L25:
            if (r2 != 0) goto L8b
            com.facebook.aura.ccv.nativeflow.HatchCcvError r2 = com.facebook.aura.ccv.nativeflow.HatchCcvError.FINALIZE
            r0 = 0
            com.facebook.aura.ccv.nativeflow.HatchCcvResult$Failed r1 = new com.facebook.aura.ccv.nativeflow.HatchCcvResult$Failed
            r1.<init>(r2, r0, r0)
            java.lang.String r0 = "checkout/finalize after 3DS timed out on the client"
            X.CFK.A06(r3, r0)
            return r1
        L35:
            X.Hwg.A00(r2)
            r5.L$0 = r8
            r5.label = r0
            java.lang.Object r2 = r7.awaitCardSaveConfirmation(r8, r5)
            if (r2 != r6) goto L4a
            return r6
        L43:
            java.lang.Object r8 = r5.L$0
            com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge r8 = (com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge) r8
            X.Hwg.A00(r2)
        L4a:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L76
            java.lang.String r1 = "timed out"
        L50:
            java.lang.String r0 = "card-save confirmation after 3DS: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.CFK.A05(r3, r0)
            java.lang.String r0 = "SUCCESS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L83
            r0 = 0
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$2 r2 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$2
            r2.<init>(r8, r0)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r2 = X.GAX.A01(r5, r2, r0)
            if (r2 != r6) goto L25
            return r6
        L76:
            r1 = r2
            goto L50
        L78:
            com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$1 r5 = new com.facebook.aura.ccv.nativeflow.HatchCheckoutClient$finalizeAfterChallenge$1
            r5.<init>(r9)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L83:
            com.facebook.aura.ccv.nativeflow.HatchCcvError r1 = com.facebook.aura.ccv.nativeflow.HatchCcvError.THREE_DS_STEP_UP
            r0 = 0
            com.facebook.aura.ccv.nativeflow.HatchCcvResult$Failed r2 = new com.facebook.aura.ccv.nativeflow.HatchCcvResult$Failed
            r2.<init>(r1, r0, r0)
        L8b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.finalizeAfterChallenge(com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startCheckout(X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchCheckoutStartResult> r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.startCheckout(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitCard(com.facebook.aura.ccv.nativeflow.HatchCheckoutSession r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchCcvResult> r49) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCheckoutClient.submitCard(com.facebook.aura.ccv.nativeflow.HatchCheckoutSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
