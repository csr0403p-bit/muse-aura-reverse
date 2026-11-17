package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class NativeLoginPrefetch implements SignOutCleanupHandler {
    public static final BLG<Boolean> _hasLocalAccounts;
    public static long completedAtMs;
    public static final C1BN<Boolean> hasLocalAccounts;
    public static InterfaceC10560Hsz<NativeLoginPickerPayload> pending;
    public static final NativeLoginPrefetch INSTANCE = new NativeLoginPrefetch();
    public static final Object lock = C3cG.A0T();

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {226}, m = "awaitOrNull", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$awaitOrNull$1, reason: invalid class name */
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
            return NativeLoginPrefetch.this.awaitOrNull(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {203}, m = "mintTempToken", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$mintTempToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C125571 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C125571(HtJ<? super C125571> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginPrefetch.this.mintTempToken(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {138, 138}, m = "pickerPayload", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$pickerPayload$1, reason: invalid class name and case insensitive filesystem */
    public final class C125581 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C125581(HtJ<? super C125581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginPrefetch.this.pickerPayload(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {103}, m = "prime", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$1, reason: invalid class name and case insensitive filesystem */
    public final class C125591 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125591(HtJ<? super C125591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginPrefetch.this.prime(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2", f = "NativeLoginPrefetch.kt", l = {105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ InterfaceC10560Hsz<NativeLoginPickerPayload> $deferred;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2$1", f = "NativeLoginPrefetch.kt", l = {104}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    NativeLoginPrefetch nativeLoginPrefetch = NativeLoginPrefetch.INSTANCE;
                    this.label = 1;
                    if (nativeLoginPrefetch.mintTempToken(this) == enumC10460Hji) {
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

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, InterfaceC10560Hsz<NativeLoginPickerPayload> interfaceC10560Hsz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$deferred = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$deferred, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass001.A1J(new AnonymousClass1(null), c3ux);
                NativeLoginPrefetch nativeLoginPrefetch = NativeLoginPrefetch.INSTANCE;
                Context context = this.$context;
                this.L$0 = null;
                this.label = 1;
                obj = nativeLoginPrefetch.resolvePicker(context, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            NativeLoginPickerPayload nativeLoginPickerPayload = (NativeLoginPickerPayload) obj;
            if (nativeLoginPickerPayload.info != null || nativeLoginPickerPayload.accountsByRef.isEmpty()) {
                Object obj2 = NativeLoginPrefetch.lock;
                InterfaceC10560Hsz<NativeLoginPickerPayload> interfaceC10560Hsz = this.$deferred;
                synchronized (obj2) {
                    if (NativeLoginPrefetch.pending == interfaceC10560Hsz) {
                        NativeLoginPrefetch.completedAtMs = SystemClock.elapsedRealtime();
                    }
                }
                C3cG.A1F(this.$deferred, nativeLoginPickerPayload);
            } else {
                NativeLoginPrefetch.INSTANCE.drop(this.$deferred);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginPrefetch", f = "NativeLoginPrefetch.kt", l = {141, 155}, m = "resolvePicker", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPrefetch$resolvePicker$1, reason: invalid class name and case insensitive filesystem */
    public final class C125601 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C125601(HtJ<? super C125601> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginPrefetch.this.resolvePicker(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: accountInfo-BWLJW6A$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1303xbd8257f5(java.util.List<com.facebook.aura.login.nativeflow.HatchSsoAccountInfoRequest> r12, java.lang.String r13, java.util.List<java.lang.String> r14, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse>> r15) {
        /*
            r11 = this;
            r9 = r14
            r8 = r13
            r6 = r12
            boolean r0 = r15 instanceof com.facebook.aura.login.nativeflow.NativeLoginPrefetch$accountInfo$1
            if (r0 == 0) goto L9a
            r10 = r15
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$accountInfo$1 r10 = (com.facebook.aura.login.nativeflow.NativeLoginPrefetch$accountInfo$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r10.label = r2
        L15:
            java.lang.Object r5 = r10.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r2 = 3
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 == r0) goto L40
            if (r1 == r4) goto L69
            if (r1 != r2) goto La1
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r5)
            com.facebook.aura.login.nativeflow.HatchAuthApi r5 = com.facebook.aura.login.nativeflow.HatchAuthApi.INSTANCE
            r10.L$0 = r12
            r10.L$1 = r13
            r10.L$2 = r14
            r10.label = r0
            r7 = 0
            java.lang.Object r1 = r5.m1266ssoAccountPickerInfoyxL6bBk(r6, r7, r8, r9, r10)
            if (r1 != r3) goto L50
            return r3
        L40:
            java.lang.Object r9 = r10.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r10.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r10.L$0
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L50:
            boolean r0 = com.facebook.aura.network.hatchauth.HatchAuthErrorKt.sessionExpired(r1)
            if (r0 == 0) goto L2a
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.INSTANCE
            r10.L$0 = r6
            r10.L$1 = r8
            r10.L$2 = r9
            r10.L$3 = r1
            r10.label = r4
            java.lang.Object r7 = r0.m1272getIoAF18A(r10)
            if (r7 != r3) goto L7b
            return r3
        L69:
            java.lang.Object r1 = r10.L$3
            java.lang.Object r9 = r10.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r10.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r10.L$0
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = X.AnonymousClass001.A0q(r5)
        L7b:
            boolean r0 = r7 instanceof X.C10571Hud
            if (r0 == 0) goto L80
            r7 = 0
        L80:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L2a
            com.facebook.aura.login.nativeflow.HatchAuthApi r5 = com.facebook.aura.login.nativeflow.HatchAuthApi.INSTANCE
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.L$4 = r0
            r10.label = r2
            java.lang.Object r1 = r5.m1266ssoAccountPickerInfoyxL6bBk(r6, r7, r8, r9, r10)
            if (r1 != r3) goto L2a
            return r3
        L9a:
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$accountInfo$1 r10 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$accountInfo$1
            r10.<init>(r11, r15)
            goto L15
        La1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.m1303xbd8257f5(java.util.List, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        _hasLocalAccounts = c9286GCnA13;
        hasLocalAccounts = C3cG.A11(c9286GCnA13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: accountInfo-BWLJW6A$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api$default, reason: not valid java name */
    public static /* synthetic */ Object m1302x3a77b892(NativeLoginPrefetch nativeLoginPrefetch, List list, String str, List list2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return nativeLoginPrefetch.m1303xbd8257f5(list, str, list2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitOrNull(X.InterfaceC10560Hsz<com.facebook.aura.login.nativeflow.NativeLoginPickerPayload> r6, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginPickerPayload> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.login.nativeflow.NativeLoginPrefetch.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$awaitOrNull$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginPrefetch.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L2d
            if (r2 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$awaitOrNull$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$awaitOrNull$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L3d
            return r0
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            r0 = 0
            r4.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L3d
            r4.label = r1     // Catch: java.util.concurrent.CancellationException -> L3d
            java.lang.Object r0 = X.C3cG.A0W(r6, r4)     // Catch: java.util.concurrent.CancellationException -> L3d
            if (r0 != r3) goto L3c
            return r3
        L3c:
            return r0
        L3d:
            X.C3cG.A1H(r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.awaitOrNull(X.Hsz, X.HtJ):java.lang.Object");
    }

    private final List<String> drawnSavedAccountIds() {
        try {
            List<AuraRememberedAccount> listAccountsForPicker = new NativeLoginRememberedAccounts(null, null, null, null, 15, null).accountsForPicker();
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<AuraRememberedAccount> it = listAccountsForPicker.iterator();
            while (it.hasNext()) {
                String str = it.next().savedAccountId;
                if (str != null) {
                    arrayListA0h.add(str);
                }
            }
            return arrayListA0h;
        } catch (RuntimeException e) {
            CFK.A0K(NativeLoginPrefetchKt.TAG, e, "Remembered accounts could not be read for drawn saved-card ids");
            return C0881AGi.A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drop(InterfaceC10560Hsz<NativeLoginPickerPayload> interfaceC10560Hsz) {
        synchronized (lock) {
            if (pending == interfaceC10560Hsz) {
                pending = null;
                completedAtMs = 0L;
            }
        }
        interfaceC10560Hsz.A5w(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintTempToken(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125571
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$mintTempToken$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125571) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$mintTempToken$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$mintTempToken$1
            r4.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L3b java.util.concurrent.CancellationException -> L46
            goto L43
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.INSTANCE     // Catch: java.lang.Exception -> L3b java.util.concurrent.CancellationException -> L46
            r4.label = r1     // Catch: java.lang.Exception -> L3b java.util.concurrent.CancellationException -> L46
            java.lang.Object r0 = r0.m1272getIoAF18A(r4)     // Catch: java.lang.Exception -> L3b java.util.concurrent.CancellationException -> L46
            if (r0 != r2) goto L43
            return r2
        L3b:
            r2 = move-exception
            java.lang.String r1 = "Temp token prefetch failed"
            java.lang.String r0 = "NativeLoginPrefetch"
            X.CFK.A0K(r0, r2, r1)
        L43:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L46:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.mintTempToken(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolvePicker(android.content.Context r12, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginPickerPayload> r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.resolvePicker(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final InterfaceC10560Hsz<NativeLoginPickerPayload> takePending() {
        synchronized (lock) {
            InterfaceC10560Hsz<NativeLoginPickerPayload> interfaceC10560Hsz = pending;
            if (interfaceC10560Hsz == null) {
                return null;
            }
            long j = completedAtMs;
            pending = null;
            completedAtMs = 0L;
            if (j != 0) {
                if (C3cG.A04(j) > 30000) {
                    return null;
                }
            }
            return interfaceC10560Hsz;
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        InterfaceC10560Hsz<NativeLoginPickerPayload> interfaceC10560Hsz;
        synchronized (lock) {
            interfaceC10560Hsz = pending;
            pending = null;
            completedAtMs = 0L;
        }
        _hasLocalAccounts.Af8(null);
        if (interfaceC10560Hsz != null) {
            interfaceC10560Hsz.A5w(null);
        }
    }

    public final C1BN<Boolean> getHasLocalAccounts() {
        return hasLocalAccounts;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pickerPayload(android.content.Context r7, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginPickerPayload> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125581
            if (r0 == 0) goto L4d
            r5 = r8
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$pickerPayload$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125581) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L38
            if (r0 != r2) goto L53
            X.Hwg.A00(r4)
        L23:
            return r4
        L24:
            X.Hwg.A00(r4)
            X.Hsz r0 = r6.takePending()
            if (r0 == 0) goto L41
            r5.L$0 = r7
            r5.label = r1
            java.lang.Object r4 = r6.awaitOrNull(r0, r5)
            if (r4 != r3) goto L3f
            return r3
        L38:
            java.lang.Object r7 = r5.L$0
            android.content.Context r7 = (android.content.Context) r7
            X.Hwg.A00(r4)
        L3f:
            if (r4 != 0) goto L23
        L41:
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r4 = r6.resolvePicker(r7, r5)
            if (r4 != r3) goto L23
            return r3
        L4d:
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$pickerPayload$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$pickerPayload$1
            r5.<init>(r8)
            goto L12
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.pickerPayload(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prime(android.content.Context r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125591
            if (r0 == 0) goto L22
            r6 = r9
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$1 r6 = (com.facebook.aura.login.nativeflow.NativeLoginPrefetch.C125591) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L2c
            java.lang.Object r3 = r6.L$1
            X.Hsz r3 = (X.InterfaceC10560Hsz) r3
            goto L28
        L22:
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$1 r6 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$1
            r6.<init>(r9)
            goto L12
        L28:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L62
            goto L5f
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r1)
            java.lang.Object r2 = com.facebook.aura.login.nativeflow.NativeLoginPrefetch.lock
            monitor-enter(r2)
            X.Hsz<com.facebook.aura.login.nativeflow.NativeLoginPickerPayload> r0 = com.facebook.aura.login.nativeflow.NativeLoginPrefetch.pending     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L3f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
            return r5
        L3f:
            r1 = 0
            X.GAt r3 = new X.GAt     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch.pending = r3     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
            com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext r0 = com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.INSTANCE
            r0.beginPrefetchFlow()
            com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2 r0 = new com.facebook.aura.login.nativeflow.NativeLoginPrefetch$prime$2     // Catch: java.lang.Throwable -> L62
            r0.<init>(r8, r3, r1)     // Catch: java.lang.Throwable -> L62
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L62
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L62
            r6.label = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = X.Hxb.A00(r0, r6)     // Catch: java.lang.Throwable -> L62
            if (r0 != r5) goto L5f
            return r5
        L5f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L62:
            r0 = move-exception
            r7.drop(r3)
            throw r0
        L67:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPrefetch.prime(android.content.Context, X.HtJ):java.lang.Object");
    }
}
