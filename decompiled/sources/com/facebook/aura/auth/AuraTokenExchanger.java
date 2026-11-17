package com.facebook.aura.auth;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraTokenExchanger {
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final AuraTokenExchanger INSTANCE = new AuraTokenExchanger();
    public static final String TAG = "AuraTokenExchanger";

    @DebugMetadata(c = "com.facebook.aura.auth.AuraTokenExchanger", f = "AuraTokenExchanger.kt", l = {28}, m = "exchangeForProfileToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraTokenExchanger$exchangeForProfileToken$1, reason: invalid class name */
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
            return AuraTokenExchanger.this.exchangeForProfileToken(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraTokenExchanger", f = "AuraTokenExchanger.kt", l = {102}, m = "logout", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraTokenExchanger$logout$1, reason: invalid class name and case insensitive filesystem */
    public final class C109841 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C109841(HtJ<? super C109841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraTokenExchanger.this.logout(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraTokenExchanger", f = "AuraTokenExchanger.kt", l = {72}, m = "refreshAccessToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraTokenExchanger$refreshAccessToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C109851 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C109851(HtJ<? super C109851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraTokenExchanger.this.refreshAccessToken(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object exchangeForProfileToken(java.lang.String r10, X.HtJ<? super com.facebook.aura.auth.NativeAuthResult> r11) {
        /*
            r9 = this;
            java.lang.String r5 = "AuraTokenExchanger"
            boolean r0 = r11 instanceof com.facebook.aura.auth.AuraTokenExchanger.AnonymousClass1
            if (r0 == 0) goto L40
            r8 = r11
            com.facebook.aura.auth.AuraTokenExchanger$exchangeForProfileToken$1 r8 = (com.facebook.aura.auth.AuraTokenExchanger.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r8.label = r2
        L14:
            java.lang.Object r4 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 != r6) goto La1
            X.Hwg.A00(r4)
        L22:
            com.facebook.aura.network.AuraHttpResponse r4 = (com.facebook.aura.network.AuraHttpResponse) r4
            goto L46
        L25:
            X.Hwg.A00(r4)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$Login r2 = com.facebook.aura.network.api.StefiHatchPath.Login.INSTANCE
            java.lang.String r0 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.buildTokenExchangeRequestBody(r10)
            byte[] r1 = X.C3cG.A1S(r0)
            r0 = 0
            r8.L$0 = r0
            r8.label = r6
            java.lang.Object r4 = r3.post(r2, r1, r10, r8)
            if (r4 != r7) goto L22
            return r7
        L40:
            com.facebook.aura.auth.AuraTokenExchanger$exchangeForProfileToken$1 r8 = new com.facebook.aura.auth.AuraTokenExchanger$exchangeForProfileToken$1
            r8.<init>(r11)
            goto L14
        L46:
            java.lang.String r1 = r4.bodyString()     // Catch: java.io.IOException -> L91
            if (r1 != 0) goto L4e
            java.lang.String r1 = ""
        L4e:
            boolean r0 = r4.isSuccessful
            if (r0 != 0) goto L77
            java.lang.String r3 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.parseTokenExchangeErrorMessage(r1)
            int r2 = r4.code
            if (r3 != 0) goto L5c
            java.lang.String r3 = "unparsed body"
        L5c:
            java.lang.String r1 = "ABRA token exchange failed: "
            java.lang.String r0 = " - "
            java.lang.String r0 = X.FGI.A0W(r1, r0, r3, r2)
            X.CFK.A04(r5, r0)
            int r1 = r4.code
            java.lang.String r0 = "Profile token exchange failed: HTTP "
            java.lang.String r1 = X.FGI.A0H(r0, r1)
        L6f:
            int r0 = r4.code
            com.facebook.aura.auth.NativeAuthResult$Error r7 = new com.facebook.aura.auth.NativeAuthResult$Error
            r7.<init>(r1, r0)
            return r7
        L77:
            com.facebook.aura.auth.TokenExchangeResult r0 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.parseTokenExchangeResponse(r1)
            if (r0 != 0) goto L85
            java.lang.String r0 = "ABRA token exchange response missing access_token or user id"
            X.CFK.A04(r5, r0)
            java.lang.String r1 = "Invalid response from token exchange"
            goto L6f
        L85:
            java.lang.String r2 = r0.accessToken
            java.lang.String r1 = r0.userId
            java.lang.String r0 = r0.refreshToken
            com.facebook.aura.auth.NativeAuthResult$Success r7 = new com.facebook.aura.auth.NativeAuthResult$Success
            r7.<init>(r2, r1, r0)
            return r7
        L91:
            r1 = move-exception
            java.lang.String r0 = "ABRA token exchange response read failed"
            X.CFK.A08(r5, r0, r1)
            java.lang.String r2 = "Profile token exchange response read failed"
            int r1 = r4.code
            com.facebook.aura.auth.NativeAuthResult$Error r0 = new com.facebook.aura.auth.NativeAuthResult$Error
            r0.<init>(r2, r1)
            return r0
        La1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraTokenExchanger.exchangeForProfileToken(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logout(java.lang.String r8, java.lang.String r9, X.HtJ<? super com.facebook.aura.auth.LogoutResult> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.auth.AuraTokenExchanger.C109841
            if (r0 == 0) goto L46
            r6 = r10
            com.facebook.aura.auth.AuraTokenExchanger$logout$1 r6 = (com.facebook.aura.auth.AuraTokenExchanger.C109841) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L65
            X.Hwg.A00(r2)
        L20:
            com.facebook.aura.network.AuraHttpResponse r2 = (com.facebook.aura.network.AuraHttpResponse) r2
            boolean r0 = r2.isSuccessful
            if (r0 == 0) goto L4c
            com.facebook.aura.auth.LogoutResult$Success r0 = com.facebook.aura.auth.LogoutResult.Success.INSTANCE
            return r0
        L29:
            X.Hwg.A00(r2)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$Logout r2 = com.facebook.aura.network.api.StefiHatchPath.Logout.INSTANCE
            java.lang.String r0 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.buildLogoutRequestBody(r9)
            byte[] r1 = X.C3cG.A1S(r0)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r2 = r3.post(r2, r1, r8, r6)
            if (r2 != r5) goto L20
            return r5
        L46:
            com.facebook.aura.auth.AuraTokenExchanger$logout$1 r6 = new com.facebook.aura.auth.AuraTokenExchanger$logout$1
            r6.<init>(r10)
            goto L12
        L4c:
            int r1 = r2.code
            java.lang.String r0 = "Server logout failed: HTTP "
            java.lang.String r1 = X.FGI.A0H(r0, r1)
            java.lang.String r0 = "AuraTokenExchanger"
            X.CFK.A06(r0, r1)
            int r1 = r2.code
            r0 = 401(0x191, float:5.62E-43)
            if (r1 != r0) goto L62
            com.facebook.aura.auth.LogoutResult$BearerRejected r0 = com.facebook.aura.auth.LogoutResult.BearerRejected.INSTANCE
            return r0
        L62:
            com.facebook.aura.auth.LogoutResult$Failed r0 = com.facebook.aura.auth.LogoutResult.Failed.INSTANCE
            return r0
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraTokenExchanger.logout(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshAccessToken(java.lang.String r8, X.HtJ<? super com.facebook.aura.auth.RefreshAccessTokenResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.auth.AuraTokenExchanger.C109851
            if (r0 == 0) goto L6d
            r6 = r9
            com.facebook.aura.auth.AuraTokenExchanger$refreshAccessToken$1 r6 = (com.facebook.aura.auth.AuraTokenExchanger.C109851) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L52
            if (r0 != r4) goto L92
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.network.AuraHttpResponse r3 = (com.facebook.aura.network.AuraHttpResponse) r3
            int r1 = r3.code
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r2 = "AuraTokenExchanger"
            if (r1 == r0) goto L86
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L86
            boolean r0 = r3.isSuccessful
            if (r0 != 0) goto L3e
            java.lang.String r0 = "Refresh access token unavailable: HTTP "
            java.lang.String r0 = X.FGI.A0H(r0, r1)
            X.CFK.A06(r2, r0)
        L3b:
            com.facebook.aura.auth.RefreshAccessTokenResult$Unavailable r0 = com.facebook.aura.auth.RefreshAccessTokenResult.Unavailable.INSTANCE
            return r0
        L3e:
            java.lang.String r0 = r3.bodyString()     // Catch: java.io.IOException -> L7d
            if (r0 != 0) goto L46
            java.lang.String r0 = ""
        L46:
            com.facebook.aura.auth.RefreshedTokens r0 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.parseRefreshAccessTokenResponse(r0)
            if (r0 != 0) goto L73
            java.lang.String r0 = "Refresh access token response missing access_token or refresh_token"
            X.CFK.A04(r2, r0)
            goto L3b
        L52:
            X.Hwg.A00(r3)
            com.facebook.aura.network.hatchauth.HatchAuthClient r3 = com.facebook.aura.network.hatchauth.HatchAuthClient.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$RefreshAccessToken r2 = com.facebook.aura.network.api.StefiHatchPath.RefreshAccessToken.INSTANCE
            java.lang.String r0 = com.facebook.aura.auth.AuraTokenExchangerJsonKt.buildRefreshAccessTokenRequestBody(r8)
            byte[] r1 = X.C3cG.A1S(r0)
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r3 = r3.post(r2, r1, r0, r6)
            if (r3 != r5) goto L20
            return r5
        L6d:
            com.facebook.aura.auth.AuraTokenExchanger$refreshAccessToken$1 r6 = new com.facebook.aura.auth.AuraTokenExchanger$refreshAccessToken$1
            r6.<init>(r9)
            goto L12
        L73:
            java.lang.String r2 = r0.accessToken
            java.lang.String r1 = r0.refreshToken
            com.facebook.aura.auth.RefreshAccessTokenResult$Success r0 = new com.facebook.aura.auth.RefreshAccessTokenResult$Success
            r0.<init>(r2, r1)
            return r0
        L7d:
            r1 = move-exception
            java.lang.String r0 = "Refresh access token response read failed"
            X.CFK.A08(r2, r0, r1)
            com.facebook.aura.auth.RefreshAccessTokenResult$Unavailable r0 = com.facebook.aura.auth.RefreshAccessTokenResult.Unavailable.INSTANCE
            return r0
        L86:
            java.lang.String r0 = "Refresh token rejected: HTTP "
            java.lang.String r0 = X.FGI.A0H(r0, r1)
            X.CFK.A06(r2, r0)
            com.facebook.aura.auth.RefreshAccessTokenResult$Rejected r0 = com.facebook.aura.auth.RefreshAccessTokenResult.Rejected.INSTANCE
            return r0
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraTokenExchanger.refreshAccessToken(java.lang.String, X.HtJ):java.lang.Object");
    }
}
