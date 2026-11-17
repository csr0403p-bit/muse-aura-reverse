package com.facebook.aura.ccv.nativeflow;

import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7BY;
import X.HtJ;
import X.HwV;
import X.HzP;
import java.util.Currency;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchAgeConfirmationLinkingClient {
    public static final HatchAgeConfirmationLinkingClient INSTANCE = new HatchAgeConfirmationLinkingClient();

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient", f = "HatchAgeConfirmationLinkingClient.kt", l = {165}, m = "completeWebAuth", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgeConfirmationLinkingClient.this.completeWebAuth(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient", f = "HatchAgeConfirmationLinkingClient.kt", l = {162}, m = "fetchLinkingOptions", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C110151 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C110151(HtJ<? super C110151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgeConfirmationLinkingClient.this.fetchLinkingOptions(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient", f = "HatchAgeConfirmationLinkingClient.kt", l = {162}, m = "fetchWebAuthUrl", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$1, reason: invalid class name and case insensitive filesystem */
    public final class C110161 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C110161(HtJ<? super C110161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAgeConfirmationLinkingClient.this.fetchWebAuthUrl(null, this);
        }
    }

    private final HwV<String, String, String> toChargeParts(HatchCcvAmountJson hatchCcvAmountJson) {
        String str;
        int i;
        String str2;
        String minorAmount;
        return (hatchCcvAmountJson == null || (str = hatchCcvAmountJson.currency) == null || C7BY.A0j(str) || (i = hatchCcvAmountJson.minor_value) < 0 || (str2 = hatchCcvAmountJson.display_amount) == null || C7BY.A0j(str2) || (minorAmount = formatMinorAmount(i, str)) == null) ? new HwV<>(null, null, null) : new HwV<>(minorAmount, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object completeWebAuth(java.lang.String r13, X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchLinkingNextAction> r14) {
        /*
            r12 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.AnonymousClass1
            if (r0 == 0) goto L67
            r14 = r3
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$1 r14 = (com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.AnonymousClass1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r10 = 1
            if (r0 == 0) goto L37
            if (r0 != r10) goto L6d
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L22:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L28
            r2 = r0
        L28:
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthCompletionResponseJson r2 = (com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthCompletionResponseJson) r2
            if (r2 == 0) goto L36
            java.lang.String r1 = r2.next_action
            if (r1 == 0) goto L36
            com.facebook.aura.ccv.nativeflow.HatchLinkingNextAction$Companion r0 = com.facebook.aura.ccv.nativeflow.HatchLinkingNextAction.Companion
            com.facebook.aura.ccv.nativeflow.HatchLinkingNextAction r0 = r0.fromWire(r1)
        L36:
            return r0
        L37:
            com.facebook.aura.network.http.HatchHttpApi r2 = X.C60O.A06(r2)
            com.facebook.aura.ccv.nativeflow.CcvStefiPath$AgeConfirmationLinkingWebAuthCompletion r6 = com.facebook.aura.ccv.nativeflow.CcvStefiPath.AgeConfirmationLinkingWebAuthCompletion.INSTANCE
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthCompletionRequestJson r7 = new com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthCompletionRequestJson
            r7.<init>(r13)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r5 = 0
            r11 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.L$5 = r11
            r14.I$0 = r10
            r14.I$1 = r5
            r14.label = r10
            r12 = r5
            r13 = r11
            java.lang.Object r2 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r2 != r1) goto L22
            return r1
        L67:
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$1 r14 = new com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$completeWebAuth$1
            r14.<init>(r3)
            goto L13
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.completeWebAuth(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final String formatMinorAmount(int i, String str) {
        Object objA0s;
        try {
            objA0s = Integer.valueOf(Currency.getInstance(str.toUpperCase(Locale.ROOT)).getDefaultFractionDigits());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Number number = (Number) objA0s;
        if (number == null) {
            return null;
        }
        if (number.intValue() < 0) {
            number = null;
        }
        if (number == null) {
            return null;
        }
        int iIntValue = number.intValue();
        if (iIntValue == 0) {
            return String.valueOf(i);
        }
        int i2 = 1;
        for (int i3 = 0; i3 < iIntValue; i3++) {
            i2 *= 10;
        }
        String strA0P = C7BY.A0P(String.valueOf(i % i2), iIntValue);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(i / i2);
        return C60P.A1M(".", strA0P, sbA0w);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[PHI: r5
  0x0050: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:25:0x004e, B:23:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[PHI: r5
  0x005a: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:25:0x004e, B:27:0x0052, B:29:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.ccv.nativeflow.HatchLinkingOptions toDomain(com.facebook.aura.ccv.nativeflow.HatchLinkingOptionsResponseJson r9) {
        /*
            r8 = this;
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationScreenJson r2 = r9.age_confirmation_screen
            if (r2 == 0) goto L8
            java.util.List<java.lang.String> r0 = r2.linkable_account_types
            if (r0 != 0) goto La
        L8:
            java.util.List<java.lang.String> r0 = r9.linkable_account_types
        La:
            com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType$Companion r3 = com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType.Companion
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType r0 = r3.fromWire(r0)
            if (r0 == 0) goto L14
            r4.add(r0)
            goto L14
        L28:
            r1 = 0
            if (r2 == 0) goto L61
            com.facebook.aura.ccv.nativeflow.HatchCcvParamsJson r0 = r2.ccv_params
            if (r0 == 0) goto L61
            com.facebook.aura.ccv.nativeflow.HatchCcvAmountJson r0 = r0.amount
        L31:
            X.HwV r0 = r8.toChargeParts(r0)
            A r7 = r0.first
            java.lang.String r7 = (java.lang.String) r7
            B r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
            C r9 = r0.third
            java.lang.String r9 = (java.lang.String) r9
            if (r2 == 0) goto L4d
            java.lang.String r5 = r2.age_confirmation_title
            if (r5 == 0) goto L4d
            boolean r0 = X.C7BY.A0j(r5)
            if (r0 == 0) goto L50
        L4d:
            r5 = r1
            if (r2 == 0) goto L5a
        L50:
            java.lang.String r6 = r2.ccv_subtitle
            if (r6 == 0) goto L5a
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 == 0) goto L5b
        L5a:
            r6 = r1
        L5b:
            com.facebook.aura.ccv.nativeflow.HatchLinkingOptions r3 = new com.facebook.aura.ccv.nativeflow.HatchLinkingOptions
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L61:
            r0 = r1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.toDomain(com.facebook.aura.ccv.nativeflow.HatchLinkingOptionsResponseJson):com.facebook.aura.ccv.nativeflow.HatchLinkingOptions");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchLinkingOptions(X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchLinkingOptions> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.C110151
            if (r0 == 0) goto L53
            r13 = r15
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$1 r13 = (com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.C110151) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r13.label = r2
        L12:
            java.lang.Object r2 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r13.label
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L59
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L21:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L27
            r2 = r0
        L27:
            com.facebook.aura.ccv.nativeflow.HatchLinkingOptionsResponseJson r2 = (com.facebook.aura.ccv.nativeflow.HatchLinkingOptionsResponseJson) r2
            if (r2 == 0) goto L2f
            com.facebook.aura.ccv.nativeflow.HatchLinkingOptions r0 = r14.toDomain(r2)
        L2f:
            return r0
        L30:
            com.facebook.aura.network.http.HatchHttpApi r4 = X.C60O.A06(r2)
            com.facebook.aura.ccv.nativeflow.CcvStefiPath$AgeConfirmationLinkingOptions r7 = com.facebook.aura.ccv.nativeflow.CcvStefiPath.AgeConfirmationLinkingOptions.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r11 = X.C9jH.A00
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$$inlined$executeStefiRequest-bMdYcbs$default$1 r5 = com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r6 = 0
            r9 = 0
            r13.L$0 = r9
            r13.L$1 = r9
            r13.L$2 = r9
            r13.L$3 = r9
            r13.L$4 = r9
            r13.label = r0
            r10 = r9
            r12 = r11
            java.lang.Object r2 = r4.m1596executeBodylessStefiRequestWithtZkwj4A(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r3) goto L21
            return r3
        L53:
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$1 r13 = new com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchLinkingOptions$1
            r13.<init>(r15)
            goto L12
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.fetchLinkingOptions(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchWebAuthUrl(com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType r14, X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.C110161
            if (r0 == 0) goto L72
            r12 = r15
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$1 r12 = (com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.C110161) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 != r1) goto L7e
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L7b
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResponseJson r1 = (com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResponseJson) r1
            java.lang.String r0 = r1.url
            if (r0 == 0) goto L78
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L78
            java.lang.String r2 = r1.attempt_id
            r1 = 0
            if (r2 == 0) goto L44
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L44
        L3e:
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult$Available r0 = new com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult$Available
            r0.<init>(r2)
            return r0
        L44:
            r2 = r1
            goto L3e
        L46:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            java.lang.String r0 = r14.getWireValue()
            com.facebook.aura.ccv.nativeflow.CcvStefiPath$AgeConfirmationLinkingWebAuth r6 = new com.facebook.aura.ccv.nativeflow.CcvStefiPath$AgeConfirmationLinkingWebAuth
            r6.<init>(r0)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.L$5 = r8
            r12.label = r1
            r9 = r8
            r11 = r10
            java.lang.Object r1 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L21
            return r2
        L72:
            com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$1 r12 = new com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient$fetchWebAuthUrl$1
            r12.<init>(r15)
            goto L12
        L78:
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult$NotOffered r0 = com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult.NotOffered.INSTANCE
            return r0
        L7b:
            com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult$Failed r0 = com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult.Failed.INSTANCE
            return r0
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient.fetchWebAuthUrl(com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType, X.HtJ):java.lang.Object");
    }
}
