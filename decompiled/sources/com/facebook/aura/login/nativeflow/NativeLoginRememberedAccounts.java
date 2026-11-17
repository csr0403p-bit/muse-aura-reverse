package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C7438Evz;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRememberedAccounts {
    public static final Companion Companion = new Companion();
    public static final boolean REMEMBER_DEVICE_DEFAULT = true;
    public final Function0<String> aymhDeviceId;
    public final Function0<Boolean> isRememberDeviceEnabled;
    public final G0V<String, HtJ<? super HsJ<HatchSsoAccountInfoResponse>>, Object> lookUpMetaAccount;
    public final AuraRememberedAccountsStore store;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$2", f = "NativeLoginRememberedAccounts.kt", l = {25}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchSsoAccountInfoResponse>>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchSsoAccountInfoResponse>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<HatchSsoAccountInfoResponse>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1266ssoAccountPickerInfoyxL6bBk;
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                List<HatchSsoAccountInfoRequest> listSingletonList = Collections.singletonList(new HatchSsoAccountInfoRequest(HatchSsoSourceApp.META, str, null));
                this.L$0 = null;
                this.label = 1;
                objM1266ssoAccountPickerInfoyxL6bBk = hatchAuthApi.m1266ssoAccountPickerInfoyxL6bBk(listSingletonList, null, null, null, this);
                if (objM1266ssoAccountPickerInfoyxL6bBk == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1266ssoAccountPickerInfoyxL6bBk = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1266ssoAccountPickerInfoyxL6bBk);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<HatchSsoAccountInfoResponse>> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = str;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<String> {
        public AnonymousClass3(Object obj) {
            super(0, obj, HatchTempTokenProvider.class, "idForAymh", "idForAymh()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((HatchTempTokenProvider) this.receiver).idForAymh();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts", f = "NativeLoginRememberedAccounts.kt", l = {53}, m = "museProfilesForPicker", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$museProfilesForPicker$1, reason: invalid class name and case insensitive filesystem */
    public final class C125621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C125621(HtJ<? super C125621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginRememberedAccounts.this.museProfilesForPicker(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts", f = "NativeLoginRememberedAccounts.kt", l = {124}, m = "refreshLinkedAccounts", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$refreshLinkedAccounts$1, reason: invalid class name and case insensitive filesystem */
    public final class C125631 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125631(HtJ<? super C125631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginRememberedAccounts.this.refreshLinkedAccounts(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts", f = "NativeLoginRememberedAccounts.kt", l = {103}, m = "saveAccountAfterLogin", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$saveAccountAfterLogin$1, reason: invalid class name and case insensitive filesystem */
    public final class C125641 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C125641(HtJ<? super C125641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginRememberedAccounts.this.saveAccountAfterLogin(null, null, null, this);
        }
    }

    public final boolean rememberAccountAfterLogin(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass003.A1Y(this.isRememberDeviceEnabled)) {
            return true;
        }
        try {
            return this.store.upsert(new AuraRememberedAccount(str, str2, str3, null, null, null, C0881AGi.A00, 0, null));
        } catch (RuntimeException e) {
            CFK.A0A(NativeLoginRememberedAccountsKt.TAG, "Remembered account could not be written", e);
            return false;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return C3cG.A0P(NativeLoginRememberedAccountsKt.isRememberDeviceDisabled());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return C3cG.A0P(NativeLoginRememberedAccountsKt.isRememberDeviceDisabled());
        }
    }

    public final List<AuraRememberedAccount> accountsForPicker() {
        if (!AnonymousClass003.A1Y(this.isRememberDeviceEnabled)) {
            return C0881AGi.A00;
        }
        List<AuraRememberedAccount> all = this.store.getAll();
        ArrayList arrayListA0h = C3cG.A0h();
        for (AuraRememberedAccount auraRememberedAccount : all) {
            if (NativeLoginRememberedAccountsKt.pickerLabel(auraRememberedAccount) != null) {
                arrayListA0h.add(auraRememberedAccount);
            }
        }
        return arrayListA0h;
    }

    public final boolean isEnabled() {
        return AnonymousClass003.A1Y(this.isRememberDeviceEnabled);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object museProfilesForPicker(java.util.List<com.facebook.aura.login.credentials.AuraRememberedAccount> r8, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>>, ? extends java.lang.Object> r9, X.HtJ<? super java.util.Map<java.lang.String, com.facebook.aura.login.nativeflow.HatchMuseProfile>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125621
            if (r0 == 0) goto La2
            r4 = r10
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$museProfilesForPicker$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125621) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L51
            if (r0 != r3) goto Ld1
            java.lang.Object r2 = r4.L$2
            java.util.Set r2 = (java.util.Set) r2
            X.Hwg.A00(r1)
        L24:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r1 = r1.value
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Ld6
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r3 = r1.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.facebook.aura.login.nativeflow.HatchSavedAccount r0 = (com.facebook.aura.login.nativeflow.HatchSavedAccount) r0
            java.lang.String r0 = r0.savedAccountId
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L38
            r5.add(r1)
            goto L38
        L51:
            X.Hwg.A00(r1)
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r2 = r8.iterator()
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r2.next()
            com.facebook.aura.login.credentials.AuraRememberedAccount r0 = (com.facebook.aura.login.credentials.AuraRememberedAccount) r0
            java.lang.String r1 = r0.savedAccountId
            if (r1 == 0) goto L5c
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L5c
            r6.add(r1)
            goto L5c
        L76:
            java.util.Set r2 = X.AbstractC0878AGe.A0g(r6)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Le5
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r7.isRememberDeviceEnabled
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto Le5
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r7.aymhDeviceId
            java.lang.Object r1 = r0.invoke()
            if (r1 == 0) goto Le5
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r2
            r4.L$3 = r0
            r4.label = r3
            java.lang.Object r1 = r9.invoke(r1, r4)
            if (r1 != r5) goto L24
            return r5
        La2:
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$museProfilesForPicker$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$museProfilesForPicker$1
            r4.<init>(r10)
            goto L12
        La9:
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r5.iterator()
        Lb1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r3.next()
            com.facebook.aura.login.nativeflow.HatchSavedAccount r0 = (com.facebook.aura.login.nativeflow.HatchSavedAccount) r0
            com.facebook.aura.login.nativeflow.HatchMuseProfile r2 = r0.museProfile
            if (r2 == 0) goto Lb1
            java.lang.String r1 = r0.savedAccountId
            X.HxE r0 = new X.HxE
            r0.<init>(r1, r2)
            r4.add(r0)
            goto Lb1
        Lcc:
            java.util.Map r5 = X.AGH.A06(r4)
            return r5
        Ld1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Ld6:
            java.lang.String r1 = com.facebook.aura.login.nativeflow.NativeLoginOneTapKt.errorType(r0)
            java.lang.String r0 = "Saved accounts could not be read for Muse profiles: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "NativeLoginRememberedAccounts"
            X.CFK.A06(r0, r1)
        Le5:
            X.9jH r5 = X.AGH.A0E()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.museProfilesForPicker(java.util.List, X.G0V, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshLinkedAccounts(java.lang.String r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125631
            if (r0 == 0) goto L22
            r4 = r10
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$refreshLinkedAccounts$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125631) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            java.lang.Object r8 = r4.L$0
            java.lang.String r8 = (java.lang.String) r8
            goto L4e
        L22:
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$refreshLinkedAccounts$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$refreshLinkedAccounts$1
            r4.<init>(r10)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            boolean r0 = X.C7BY.A0j(r9)
            if (r0 != 0) goto La9
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r7.isRememberDeviceEnabled
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto La9
            X.G0V<java.lang.String, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse>>, java.lang.Object> r1 = r7.lookUpMetaAccount     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r4.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r0 = 0
            r4.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.lang.Object r1 = r1.invoke(r9, r4)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r1 != r3) goto L51
            return r3
        L4e:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
        L51:
            X.HsJ r1 = (X.HsJ) r1     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.lang.Object r2 = r1.value     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            boolean r1 = r2 instanceof X.C10571Hud     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r0 = 0
            if (r1 == 0) goto L5b
            r2 = r0
        L5b:
            com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse r2 = (com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse) r2     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r2 == 0) goto L9c
            java.util.List<com.facebook.aura.login.nativeflow.HatchSsoMetaAccount> r0 = r2.metaAccounts     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r0 == 0) goto L9c
            java.lang.Object r6 = X.AbstractC0878AGe.A0K(r0)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            com.facebook.aura.login.nativeflow.HatchSsoMetaAccount r6 = (com.facebook.aura.login.nativeflow.HatchSsoMetaAccount) r6     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r6 == 0) goto L9c
            com.facebook.aura.login.credentials.AuraRememberedAccountsStore r5 = r7.store     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.util.List<com.facebook.aura.login.nativeflow.HatchSsoLinkedAccount> r0 = r6.linkedAccounts     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.util.Iterator r3 = r0.iterator()     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
        L77:
            boolean r0 = r3.hasNext()     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r0 == 0) goto L92
            java.lang.Object r0 = r3.next()     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            com.facebook.aura.login.nativeflow.HatchSsoLinkedAccount r0 = (com.facebook.aura.login.nativeflow.HatchSsoLinkedAccount) r0     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            java.lang.String r2 = r0.profilePicUrl     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            if (r2 == 0) goto L77
            java.lang.String r1 = r0.platform     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            com.facebook.aura.login.credentials.AuraRememberedLinkedAccount r0 = new com.facebook.aura.login.credentials.AuraRememberedLinkedAccount     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r4.add(r0)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            goto L77
        L92:
            java.util.List<com.facebook.aura.login.nativeflow.HatchSsoLinkedAccount> r0 = r6.linkedAccounts     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            int r0 = r0.size()     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            r5.updateLinkedAccounts(r8, r4, r0)     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            goto La9
        L9c:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L9f java.lang.Exception -> La1
            return r3
        L9f:
            r0 = move-exception
            throw r0
        La1:
            r2 = move-exception
            java.lang.String r1 = "Remembered account facepile could not be refreshed"
            java.lang.String r0 = "NativeLoginRememberedAccounts"
            X.CFK.A0A(r0, r1, r2)
        La9:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.refreshLinkedAccounts(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Boolean rememberDeviceValueOnScreen(Boolean bool) {
        if (AnonymousClass003.A1Y(this.isRememberDeviceEnabled)) {
            return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveAccountAfterLogin(java.lang.String r6, java.lang.String r7, X.G0W<? super java.lang.String, ? super java.lang.String, ? super X.HtJ<? super X.HsJ<java.lang.String>>, ? extends java.lang.Object> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125641
            if (r0 == 0) goto L59
            r4 = r9
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$saveAccountAfterLogin$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.C125641) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L6c
            java.lang.Object r0 = r4.L$0
            java.lang.String r6 = X.C3cG.A0d(r0, r1)
        L23:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r1 = r1.value
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            java.lang.String r2 = "NativeLoginRememberedAccounts"
            if (r0 != 0) goto L71
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L7a
            goto L5f
        L34:
            X.Hwg.A00(r1)
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5.isRememberDeviceEnabled
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto L7a
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r5.aymhDeviceId
            java.lang.Object r1 = r0.invoke()
            if (r1 == 0) goto L7a
            r4.L$0 = r6
            r0 = 0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.label = r2
            java.lang.Object r1 = r8.invoke(r7, r1, r4)
            if (r1 != r3) goto L23
            return r3
        L59:
            com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$saveAccountAfterLogin$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts$saveAccountAfterLogin$1
            r4.<init>(r9)
            goto L12
        L5f:
            com.facebook.aura.login.credentials.AuraRememberedAccountsStore r0 = r5.store     // Catch: java.lang.RuntimeException -> L65
            r0.updateSavedAccountId(r6, r1)     // Catch: java.lang.RuntimeException -> L65
            goto L7a
        L65:
            r1 = move-exception
            java.lang.String r0 = "Saved account id could not be stored"
            X.CFK.A0A(r2, r0, r1)
            goto L7a
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L71:
            java.lang.String r1 = com.facebook.aura.login.nativeflow.NativeLoginOneTapKt.errorType(r0)
            java.lang.String r0 = "Account could not be saved: "
            X.C3cG.A1G(r0, r1, r2)
        L7a:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts.saveAccountAfterLogin(java.lang.String, java.lang.String, X.G0W, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginRememberedAccounts(AuraRememberedAccountsStore auraRememberedAccountsStore, Function0<Boolean> function0, G0V<? super String, ? super HtJ<? super HsJ<HatchSsoAccountInfoResponse>>, ? extends Object> g0v, Function0<String> function02) {
        AnonymousClass005.A14(auraRememberedAccountsStore, function0, g0v, function02);
        this.store = auraRememberedAccountsStore;
        this.isRememberDeviceEnabled = function0;
        this.lookUpMetaAccount = g0v;
        this.aymhDeviceId = function02;
    }

    public /* synthetic */ NativeLoginRememberedAccounts(AuraRememberedAccountsStore auraRememberedAccountsStore, Function0 function0, G0V g0v, Function0 function02, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraRememberedAccountsStore.device : auraRememberedAccountsStore, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 4) != 0 ? new AnonymousClass2(null) : g0v, (i & 8) != 0 ? new AnonymousClass3(HatchTempTokenProvider.INSTANCE) : function02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginRememberedAccounts() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }
}
