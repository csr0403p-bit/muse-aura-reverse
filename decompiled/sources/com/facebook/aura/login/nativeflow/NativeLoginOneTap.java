package com.facebook.aura.login.nativeflow;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C10543Hqv;
import X.C3cG;
import X.C7384Etj;
import X.C7438Evz;
import X.CFK;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.HzP;
import com.facebook.aura.login.credentials.AuraOneTapLogin;
import com.facebook.aura.login.credentials.AuraOneTapLoginStore;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginOneTap {
    public static final Companion Companion = new Companion();
    public static final Object storeLock = C3cG.A0T();
    public final Function0<String> aymhDeviceId;
    public final Function0<Boolean> isRememberDeviceEnabled;
    public final AuraOneTapLoginStore logins;
    public volatile String redeemedAbraUserId;
    public final AuraRememberedAccountsStore rememberedAccounts;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<String> {
        public AnonymousClass1(Object obj) {
            super(0, obj, HatchTempTokenProvider.class, "idForAymh", "idForAymh()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((HatchTempTokenProvider) this.receiver).idForAymh();
        }
    }

    public interface Attempt {

        public final class LoggedIn extends C06G implements Attempt {
            public final HatchAuthCredentials credentials;

            public LoggedIn(HatchAuthCredentials hatchAuthCredentials) {
                C7384Etj.A0Y(hatchAuthCredentials, 0);
                this.credentials = hatchAuthCredentials;
            }

            public final LoggedIn copy(HatchAuthCredentials hatchAuthCredentials) {
                C7384Etj.A0Y(hatchAuthCredentials, 0);
                return new LoggedIn(hatchAuthCredentials);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof LoggedIn) && C7384Etj.areEqual(this.credentials, ((LoggedIn) obj).credentials));
            }

            public static /* synthetic */ LoggedIn copy$default(LoggedIn loggedIn, HatchAuthCredentials hatchAuthCredentials, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchAuthCredentials = loggedIn.credentials;
                }
                C7384Etj.A0Y(hatchAuthCredentials, 0);
                return new LoggedIn(hatchAuthCredentials);
            }

            public final HatchAuthCredentials component1() {
                return this.credentials;
            }

            public final HatchAuthCredentials getCredentials() {
                return this.credentials;
            }

            public int hashCode() {
                return this.credentials.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class SendCode extends C06G implements Attempt {
            public final HatchSavedAccount card;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof SendCode) && C7384Etj.areEqual(this.card, ((SendCode) obj).card));
            }

            public /* synthetic */ SendCode(HatchSavedAccount hatchSavedAccount, int i, C06H c06h) {
                this((i & 1) != 0 ? null : hatchSavedAccount);
            }

            public static /* synthetic */ SendCode copy$default(SendCode sendCode, HatchSavedAccount hatchSavedAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchSavedAccount = sendCode.card;
                }
                return new SendCode(hatchSavedAccount);
            }

            public final HatchSavedAccount component1() {
                return this.card;
            }

            public final SendCode copy(HatchSavedAccount hatchSavedAccount) {
                return new SendCode(hatchSavedAccount);
            }

            public final HatchSavedAccount getCard() {
                return this.card;
            }

            public int hashCode() {
                return AnonymousClass006.A0D(this.card);
            }

            public String toString() {
                return super.toString();
            }

            public SendCode(HatchSavedAccount hatchSavedAccount) {
                this.card = hatchSavedAccount;
            }

            public SendCode() {
                this(null);
            }
        }
    }

    public final class Companion {
        public final Object getStoreLock() {
            return NativeLoginOneTap.storeLock;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginOneTap", f = "NativeLoginOneTap.kt", l = {132}, m = "afterLogin", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$afterLogin$1, reason: invalid class name and case insensitive filesystem */
    public final class C125481 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C125481(HtJ<? super C125481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginOneTap.this.afterLogin(null, false, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginOneTap", f = "NativeLoginOneTap.kt", l = {192, 202}, m = "forgetSavedAccount", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$forgetSavedAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C125491 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C125491(HtJ<? super C125491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginOneTap.this.forgetSavedAccount(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginOneTap", f = "NativeLoginOneTap.kt", l = {69, 81}, m = HatchStartupPoints.SURFACE_LOGIN, v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$login$1, reason: invalid class name and case insensitive filesystem */
    public final class C125501 extends HzP {
        public Object L$0;
        public Object L$1;
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

        public C125501(HtJ<? super C125501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginOneTap.this.login(null, null, null, null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$login$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$login$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$removeAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C125511 extends AbstractC7559F3s implements G0U<String, Unit> {
        public static final C125511 INSTANCE = new C125511();

        public C125511() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginOneTap", f = "NativeLoginOneTap.kt", l = {218}, m = "removeCrossAppAccount", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOneTap$removeCrossAppAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C125521 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C125521(HtJ<? super C125521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginOneTap.this.removeCrossAppAccount(null, null, this);
        }
    }

    public final void endAttempt() {
        this.redeemedAbraUserId = null;
    }

    public final boolean isOneTapLogin(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equals(this.redeemedAbraUserId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean removeAccount(String str, G0U<? super String, Unit> g0u) {
        boolean zA1a = AnonymousClass002.A1a(str, g0u);
        synchronized (storeLock) {
            if (forget(str)) {
                try {
                    C10543Hqv c10543HqvA0z = C3cG.A0z();
                    if (this.rememberedAccounts.remove(str, new NativeLoginOneTap$removeAccount$savedAccountId$1$1(c10543HqvA0z))) {
                        AuraRememberedAccount auraRememberedAccount = (AuraRememberedAccount) c10543HqvA0z.element;
                        String str2 = auraRememberedAccount != null ? auraRememberedAccount.savedAccountId : null;
                        if (str2 != null) {
                            g0u.invoke(str2);
                        }
                        return zA1a;
                    }
                } catch (RuntimeException e) {
                    CFK.A0A(NativeLoginOneTapKt.TAG, "Remembered account could not be removed", e);
                }
            }
            return false;
        }
    }

    private final void dropLoginsOfForgottenAccounts() {
        synchronized (storeLock) {
            Set<String> setRememberedIds = rememberedIds();
            if (setRememberedIds != null) {
                try {
                    this.logins.retainOnly(setRememberedIds);
                } catch (RuntimeException e) {
                    CFK.A0A(NativeLoginOneTapKt.TAG, "Stale one-tap logins could not be dropped", e);
                }
            }
        }
    }

    private final boolean forget(String str) {
        try {
            return this.logins.remove(str);
        } catch (RuntimeException e) {
            CFK.A0A(NativeLoginOneTapKt.TAG, "One-tap login could not be deleted", e);
            return false;
        }
    }

    public static final Attempt login$failed(AuraOneTapLogin auraOneTapLogin, G0U<? super Throwable, Unit> g0u, Throwable th, HatchSavedAccount hatchSavedAccount) {
        if (auraOneTapLogin != null) {
            g0u.invoke(th);
        }
        return new Attempt.SendCode(hatchSavedAccount);
    }

    public static /* synthetic */ Attempt login$failed$default(AuraOneTapLogin auraOneTapLogin, G0U g0u, Throwable th, HatchSavedAccount hatchSavedAccount, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchSavedAccount = null;
        }
        if (auraOneTapLogin != null) {
            g0u.invoke(th);
        }
        return new Attempt.SendCode(hatchSavedAccount);
    }

    private final Set<String> rememberedIds() {
        try {
            List<AuraRememberedAccount> all = this.rememberedAccounts.getAll();
            ArrayList arrayListA0i = AnonymousClass003.A0i(all);
            Iterator<AuraRememberedAccount> it = all.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().abraUserId);
            }
            return AbstractC0878AGe.A0g(arrayListA0i);
        } catch (RuntimeException e) {
            CFK.A0A(NativeLoginOneTapKt.TAG, "Remembered accounts could not be read", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean removeAccount$default(NativeLoginOneTap nativeLoginOneTap, String str, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C125511.INSTANCE;
        }
        return nativeLoginOneTap.removeAccount(str, g0u);
    }

    private final boolean removeRecordOfSavedAccount(String str) {
        AuraRememberedAccount next;
        synchronized (storeLock) {
            try {
                Iterator<AuraRememberedAccount> it = this.rememberedAccounts.getAll().iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                } while (!C7384Etj.areEqual(next.savedAccountId, str));
                AuraRememberedAccount auraRememberedAccount = next;
                if (auraRememberedAccount == null) {
                    return true;
                }
                return removeAccount(auraRememberedAccount.abraUserId, C125511.INSTANCE);
            } catch (RuntimeException e) {
                CFK.A0A(NativeLoginOneTapKt.TAG, "Remembered accounts could not be read", e);
                return false;
            }
        }
    }

    private final AuraOneTapLogin storedLogin(String str) {
        try {
            return this.logins.get(str);
        } catch (RuntimeException e) {
            CFK.A0A(NativeLoginOneTapKt.TAG, "One-tap login could not be read", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object afterLogin(java.lang.Boolean r7, boolean r8, java.lang.String r9, java.lang.String r10, X.G0W<? super java.lang.String, ? super java.lang.String, ? super X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchDblProvision>>, ? extends java.lang.Object> r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOneTap.afterLogin(java.lang.Boolean, boolean, java.lang.String, java.lang.String, X.G0W, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object forgetSavedAccount(java.lang.String r9, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>>, ? extends java.lang.Object> r10, X.G0W<? super java.lang.String, ? super java.lang.String, ? super X.HtJ<? super X.HsJ<kotlin.Unit>>, ? extends java.lang.Object> r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.login.nativeflow.NativeLoginOneTap.C125491
            if (r0 == 0) goto Lb3
            r5 = r12
            com.facebook.aura.login.nativeflow.NativeLoginOneTap$forgetSavedAccount$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginOneTap.C125491) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r4 = "NativeLoginOneTap"
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L58
            if (r0 != r3) goto Lba
            X.Hwg.A00(r2)
        L25:
            X.HsJ r2 = (X.HsJ) r2
            java.lang.Object r0 = r2.value
            java.lang.Throwable r0 = X.HsJ.A00(r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = com.facebook.aura.login.nativeflow.NativeLoginOneTapKt.errorType(r0)
            java.lang.String r0 = "Saved account card could not be removed: "
        L35:
            X.C3cG.A1G(r0, r1, r4)
        L38:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L3b:
            X.Hwg.A00(r2)
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r8.aymhDeviceId
            java.lang.Object r7 = r0.invoke()
            if (r7 == 0) goto L38
            r5.L$0 = r9
            r0 = 0
            r5.L$1 = r0
            r5.L$2 = r11
            r5.L$3 = r7
            r5.label = r1
            java.lang.Object r2 = r10.invoke(r7, r5)
            if (r2 != r6) goto L63
            return r6
        L58:
            java.lang.Object r7 = r5.L$3
            java.lang.Object r11 = r5.L$2
            X.G0W r11 = (X.G0W) r11
            java.lang.Object r9 = r5.L$0
            X.Hwg.A00(r2)
        L63:
            X.HsJ r2 = (X.HsJ) r2
            java.lang.Object r1 = r2.value
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lac
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r8 = r1.iterator()
        L73:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r2 = r8.next()
            r1 = r2
            com.facebook.aura.login.nativeflow.HatchSavedAccount r1 = (com.facebook.aura.login.nativeflow.HatchSavedAccount) r1
            java.lang.String r0 = r1.savedAccountId
            boolean r0 = X.C7384Etj.areEqual(r0, r9)
            if (r0 == 0) goto L73
            java.lang.String r0 = r1.accountCuid
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L73
        L90:
            com.facebook.aura.login.nativeflow.HatchSavedAccount r2 = (com.facebook.aura.login.nativeflow.HatchSavedAccount) r2
            if (r2 == 0) goto L38
            java.lang.String r1 = r2.accountCuid
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.label = r3
            java.lang.Object r2 = r11.invoke(r1, r7, r5)
            if (r2 != r6) goto L25
            return r6
        Laa:
            r2 = 0
            goto L90
        Lac:
            java.lang.String r1 = com.facebook.aura.login.nativeflow.NativeLoginOneTapKt.errorType(r0)
            java.lang.String r0 = "Saved accounts could not be read to remove a card: "
            goto L35
        Lb3:
            com.facebook.aura.login.nativeflow.NativeLoginOneTap$forgetSavedAccount$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginOneTap$forgetSavedAccount$1
            r5.<init>(r12)
            goto L12
        Lba:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOneTap.forgetSavedAccount(java.lang.String, X.G0V, X.G0W, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object login(java.lang.String r14, java.lang.String r15, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>>, ? extends java.lang.Object> r16, X.G2j<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>>, ? extends java.lang.Object> r17, X.G0U<? super java.lang.Boolean, kotlin.Unit> r18, X.G0U<? super java.lang.Throwable, kotlin.Unit> r19, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginOneTap.Attempt> r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOneTap.login(java.lang.String, java.lang.String, X.G0V, X.G2j, X.G0U, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeCrossAppAccount(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r8, X.G2j<? super com.facebook.aura.login.nativeflow.HatchSsoSourceApp, ? super java.lang.String, ? super java.lang.String, ? super X.HtJ<? super X.HsJ<java.lang.String>>, ? extends java.lang.Object> r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginOneTap.C125521
            if (r0 == 0) goto L56
            r6 = r10
            com.facebook.aura.login.nativeflow.NativeLoginOneTap$removeCrossAppAccount$1 r6 = (com.facebook.aura.login.nativeflow.NativeLoginOneTap.C125521) r6
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
            r4 = 1
            if (r0 == 0) goto L37
            if (r0 != r4) goto L5c
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r1 = r1.value
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L61
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L71
            boolean r0 = r7.removeRecordOfSavedAccount(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L37:
            X.Hwg.A00(r1)
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r7.aymhDeviceId
            java.lang.Object r3 = r0.invoke()
            if (r3 == 0) goto L70
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r2 = r8.sourceApp
            java.lang.String r1 = r8.accessToken
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r1 = r9.invoke(r2, r1, r3, r6)
            if (r1 != r5) goto L20
            return r5
        L56:
            com.facebook.aura.login.nativeflow.NativeLoginOneTap$removeCrossAppAccount$1 r6 = new com.facebook.aura.login.nativeflow.NativeLoginOneTap$removeCrossAppAccount$1
            r6.<init>(r10)
            goto L12
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L61:
            java.lang.String r1 = com.facebook.aura.login.nativeflow.NativeLoginOneTapKt.errorType(r0)
            java.lang.String r0 = "Cross-app account could not be removed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "NativeLoginOneTap"
            X.CFK.A06(r0, r1)
        L70:
            r4 = 0
        L71:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOneTap.removeCrossAppAccount(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount, X.G2j, X.HtJ):java.lang.Object");
    }

    public NativeLoginOneTap(AuraOneTapLoginStore auraOneTapLoginStore, AuraRememberedAccountsStore auraRememberedAccountsStore, Function0<Boolean> function0, Function0<String> function02) {
        AnonymousClass005.A14(auraOneTapLoginStore, auraRememberedAccountsStore, function0, function02);
        this.logins = auraOneTapLoginStore;
        this.rememberedAccounts = auraRememberedAccountsStore;
        this.isRememberDeviceEnabled = function0;
        this.aymhDeviceId = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object login$default(NativeLoginOneTap nativeLoginOneTap, String str, String str2, G0V g0v, G2j g2j, G0U g0u, G0U g0u2, HtJ htJ, int i, Object obj) {
        String strA0s = AnonymousClass006.A0s(i, str2);
        if ((i & 16) != 0) {
            g0u = AnonymousClass2.INSTANCE;
        }
        if ((i & 32) != 0) {
            g0u2 = AnonymousClass3.INSTANCE;
        }
        return nativeLoginOneTap.login(str, strA0s, g0v, g2j, g0u, g0u2, htJ);
    }

    public /* synthetic */ NativeLoginOneTap(AuraOneTapLoginStore auraOneTapLoginStore, AuraRememberedAccountsStore auraRememberedAccountsStore, Function0 function0, Function0 function02, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraOneTapLoginStore.device : auraOneTapLoginStore, (i & 2) != 0 ? AuraRememberedAccountsStore.device : auraRememberedAccountsStore, function0, (i & 8) != 0 ? new AnonymousClass1(HatchTempTokenProvider.INSTANCE) : function02);
    }
}
