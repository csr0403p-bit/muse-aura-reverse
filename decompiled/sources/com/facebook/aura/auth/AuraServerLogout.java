package com.facebook.aura.auth;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.auth.LogoutResult;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class AuraServerLogout {
    public static final String TAG = "AuraServerLogout";
    public static final AuraServerLogout INSTANCE = new AuraServerLogout();
    public static final C3UX scope = C78W.A03();

    @DebugMetadata(c = "com.facebook.aura.auth.AuraServerLogout", f = "AuraServerLogout.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop, R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "logoutWithRedeemedRefreshToken", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraServerLogout$logoutWithRedeemedRefreshToken$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraServerLogout.this.logoutWithRedeemedRefreshToken(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.AuraServerLogout$submit$1", f = "AuraServerLogout.kt", l = {26, 28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.auth.AuraServerLogout$submit$1, reason: invalid class name and case insensitive filesystem */
    public final class C109761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $accessToken;
        public final /* synthetic */ String $sealedRefreshToken;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109761(String str, String str2, HtJ<? super C109761> htJ) {
            super(2, htJ);
            this.$sealedRefreshToken = str;
            this.$accessToken = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109761(this.$sealedRefreshToken, this.$accessToken, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strUnsealRefreshToken;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(AuraServerLogout.TAG, "Server logout failed", e2);
            }
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$sealedRefreshToken;
                strUnsealRefreshToken = str != null ? AuraMetaFRLSecureTokenStore.INSTANCE.unsealRefreshToken(str) : null;
                AuraTokenExchanger auraTokenExchanger = AuraTokenExchanger.INSTANCE;
                String str2 = this.$accessToken;
                this.L$0 = strUnsealRefreshToken;
                this.label = 1;
                obj = auraTokenExchanger.logout(str2, strUnsealRefreshToken, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                strUnsealRefreshToken = (String) this.L$0;
                Hwg.A00(obj);
            }
            if (C7384Etj.areEqual((LogoutResult) obj, LogoutResult.BearerRejected.INSTANCE) && strUnsealRefreshToken != null && strUnsealRefreshToken.length() != 0) {
                AuraServerLogout auraServerLogout = AuraServerLogout.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (auraServerLogout.logoutWithRedeemedRefreshToken(strUnsealRefreshToken, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logoutWithRedeemedRefreshToken(java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.auth.AuraServerLogout.AnonymousClass1
            if (r0 == 0) goto L56
            r6 = r9
            com.facebook.aura.auth.AuraServerLogout$logoutWithRedeemedRefreshToken$1 r6 = (com.facebook.aura.auth.AuraServerLogout.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L37
            if (r0 != r4) goto L5c
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.auth.AuraTokenExchanger r1 = com.facebook.aura.auth.AuraTokenExchanger.INSTANCE
            r0 = 0
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r1 = r1.refreshAccessToken(r8, r6)
            if (r1 != r5) goto L3a
            return r5
        L37:
            X.Hwg.A00(r1)
        L3a:
            com.facebook.aura.auth.RefreshAccessTokenResult r1 = (com.facebook.aura.auth.RefreshAccessTokenResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.auth.RefreshAccessTokenResult.Success
            if (r0 == 0) goto L23
            com.facebook.aura.auth.AuraTokenExchanger r3 = com.facebook.aura.auth.AuraTokenExchanger.INSTANCE
            com.facebook.aura.auth.RefreshAccessTokenResult$Success r1 = (com.facebook.aura.auth.RefreshAccessTokenResult.Success) r1
            java.lang.String r2 = r1.accessToken
            java.lang.String r1 = r1.refreshToken
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r0 = r3.logout(r2, r1, r6)
            if (r0 != r5) goto L23
            return r5
        L56:
            com.facebook.aura.auth.AuraServerLogout$logoutWithRedeemedRefreshToken$1 r6 = new com.facebook.aura.auth.AuraServerLogout$logoutWithRedeemedRefreshToken$1
            r6.<init>(r9)
            goto L12
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraServerLogout.logoutWithRedeemedRefreshToken(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void submit(String str, String str2) {
        if (str == null || C7BY.A0j(str)) {
            return;
        }
        AnonymousClass001.A1J(new C109761(str2, str, null), scope);
    }
}
