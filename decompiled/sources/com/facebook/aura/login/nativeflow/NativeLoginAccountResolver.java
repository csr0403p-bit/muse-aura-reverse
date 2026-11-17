package com.facebook.aura.login.nativeflow;

import X.A3q;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC6666EOb;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BV5;
import X.C0881AGi;
import X.C27k;
import X.C2FI;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9X;
import X.CFK;
import X.ENw;
import X.EP0;
import X.EP1;
import X.EPC;
import X.EPL;
import X.EPP;
import X.EPY;
import X.EPi;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import android.content.Context;
import com.facebook.aura.analytics.accesslibrary.AuraAccessLibraryLogger;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class NativeLoginAccountResolver {
    public static final NativeLoginAccountResolver INSTANCE = new NativeLoginAccountResolver();

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchFxAccounts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() throws JSONException {
            C9X.A03(this.$context.getApplicationContext());
            return C9X.A01("xapp.e2e.tokens", false, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchFxAccounts$4", f = "NativeLoginAccountResolver.kt", l = {178}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchFxAccounts$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0U<HtJ<? super List<? extends SsoCandidate>>, Object> {
        public final /* synthetic */ Context $context;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, HtJ<? super AnonymousClass4> htJ) {
            super(1, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass4(this.$context, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super List<SsoCandidate>> htJ) {
            return new AnonymousClass4(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NativeLoginAccountResolver nativeLoginAccountResolver;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                nativeLoginAccountResolver = NativeLoginAccountResolver.INSTANCE;
                Context context = this.$context;
                LinkedHashSet linkedHashSetA02 = BGK.A02(EP0.A0D, BGK.A01(EP0.A03, EP0.A01));
                this.L$0 = nativeLoginAccountResolver;
                this.label = 1;
                obj = nativeLoginAccountResolver.fetchV2Credentials(context, linkedHashSetA02, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                nativeLoginAccountResolver = (NativeLoginAccountResolver) this.L$0;
                Hwg.A00(obj);
            }
            return nativeLoginAccountResolver.v2Candidates((List) obj);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super List<? extends SsoCandidate>> htJ) {
            return invoke2((HtJ<? super List<SsoCandidate>>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchFxAccounts$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<List<? extends SsoCandidate>> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends SsoCandidate> invoke() {
            NativeLoginAccountResolver nativeLoginAccountResolver = NativeLoginAccountResolver.INSTANCE;
            return nativeLoginAccountResolver.legacyCandidates(nativeLoginAccountResolver.fetchLegacyItems(this.$context));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchSsoAccounts$2", f = "NativeLoginAccountResolver.kt", l = {155, 158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchSsoAccounts$2, reason: invalid class name and case insensitive filesystem */
    public final class C125122 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AHD<? extends NativeLoginSsoAccount>>, Object> {
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125122(Context context, HtJ<? super C125122> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C125122 c125122 = new C125122(this.$context, htJ);
            c125122.L$0 = obj;
            return c125122;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA01;
            Collection collection;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1 nativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1 = new NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1(this.$context, null);
                objA01 = GAo.A01(C79.A00, C6ys.A00, nativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1, c3ux);
                NativeLoginAccountResolver nativeLoginAccountResolver = NativeLoginAccountResolver.INSTANCE;
                Context context = this.$context;
                this.L$0 = null;
                this.L$1 = objA01;
                this.label = 1;
                obj = nativeLoginAccountResolver.fetchFxAccounts(context, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    collection = (Collection) this.L$3;
                    Hwg.A00(obj);
                    return AGI.A07(AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(obj), collection));
                }
                objA01 = (C27k) this.L$1;
                Hwg.A00(obj);
            }
            collection = (Collection) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = collection;
            this.label = 2;
            obj = C3cG.A0W(objA01, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            return AGI.A07(AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(obj), collection));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super AHD<NativeLoginSsoAccount>> htJ) {
            return ((C125122) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super AHD<? extends NativeLoginSsoAccount>> htJ) {
            return invoke2(c3ux, (HtJ<? super AHD<NativeLoginSsoAccount>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver", f = "NativeLoginAccountResolver.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "fetchV2Credentials", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchV2Credentials$1, reason: invalid class name */
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
            return NativeLoginAccountResolver.this.fetchV2Credentials(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver", f = "NativeLoginAccountResolver.kt", l = {252}, m = "fetchWhatsAppAccount", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C125131 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C125131(HtJ<? super C125131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginAccountResolver.this.fetchWhatsAppAccount(null, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$merge$1, reason: invalid class name and case insensitive filesystem */
    public final class C125151 extends AbstractC7559F3s implements G0U<SsoCandidate, Comparable<?>> {
        public static final C125151 INSTANCE = new C125151();

        public C125151() {
            super(1);
        }

        @Override // X.G0U
        public final Comparable<?> invoke(SsoCandidate ssoCandidate) {
            C7384Etj.A0Y(ssoCandidate, 0);
            return Boolean.valueOf(AnonymousClass006.A1Z(ssoCandidate.sourceApp, HatchSsoSourceApp.META));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$merge$2, reason: invalid class name and case insensitive filesystem */
    public final class C125162 extends AbstractC7559F3s implements G0U<SsoCandidate, Comparable<?>> {
        public static final C125162 INSTANCE = new C125162();

        public C125162() {
            super(1);
        }

        @Override // X.G0U
        public final Comparable<?> invoke(SsoCandidate ssoCandidate) {
            C7384Etj.A0Y(ssoCandidate, 0);
            return Boolean.valueOf(!ssoCandidate.isActive);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$merge$3, reason: invalid class name and case insensitive filesystem */
    public final class C125173 extends AbstractC7559F3s implements G0U<SsoCandidate, Comparable<?>> {
        public static final C125173 INSTANCE = new C125173();

        public C125173() {
            super(1);
        }

        @Override // X.G0U
        public final Comparable<?> invoke(SsoCandidate ssoCandidate) {
            C7384Etj.A0Y(ssoCandidate, 0);
            return Integer.valueOf(ssoCandidate.sourceApp.ordinal());
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$merge$4, reason: invalid class name and case insensitive filesystem */
    public final class C125184 extends AbstractC7559F3s implements G0U<SsoCandidate, Comparable<?>> {
        public static final C125184 INSTANCE = new C125184();

        public C125184() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Comparable<?> invoke(SsoCandidate ssoCandidate) {
            SsoCandidate ssoCandidate2 = ssoCandidate;
            C7384Etj.A0Y(ssoCandidate2, 0);
            return ssoCandidate2.userId;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Comparable<?> invoke2(SsoCandidate ssoCandidate) {
            C7384Etj.A0Y(ssoCandidate, 0);
            return ssoCandidate.userId;
        }
    }

    public final List<SsoCandidate> e2eCandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(boolean z, Function0<String> function0) {
        String strInvoke;
        C7384Etj.A0Y(function0, 1);
        if (z && (strInvoke = function0.invoke()) != null) {
            try {
                List<SsoCandidate> e2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api = parseE2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(strInvoke);
                if (!e2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api.isEmpty()) {
                    return e2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api;
                }
            } catch (Exception e) {
                CFK.A0K(NativeLoginAccountResolverKt.TAG, e, "E2E token parse failed; falling back to production readers");
                return null;
            }
        }
        return null;
    }

    public final Object fetchSsoAccounts(Context context, HtJ<? super AHD<NativeLoginSsoAccount>> htJ) {
        return Hxb.A00(new C125122(context, null), htJ);
    }

    public final <S> NativeLoginPickerRows<S> pickerRows(List<AuraRememberedAccount> list, List<? extends S> list2, int i, Set<String> set, Map<String, HatchMuseProfile> map) {
        C7384Etj.A0Y(list, 0);
        AnonymousClass005.A12(list2, set, map, 1);
        ArrayList arrayListA0h = C3cG.A0h();
        for (AuraRememberedAccount auraRememberedAccount : list) {
            String str = auraRememberedAccount.savedAccountId;
            if (str == null || !set.contains(str)) {
                arrayListA0h.add(auraRememberedAccount);
            }
        }
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            AuraRememberedAccount auraRememberedAccount2 = (AuraRememberedAccount) obj;
            String str2 = auraRememberedAccount2.metaAccountId;
            if (str2 == null) {
                str2 = auraRememberedAccount2.abraUserId;
            }
            if (hashSetA13.add(str2)) {
                arrayListA0h2.add(obj);
            }
        }
        List listA0a = AbstractC0878AGe.A0a(arrayListA0h2, i);
        int size = i - listA0a.size();
        if (size < 0) {
            size = 0;
        }
        return new NativeLoginPickerRows<>(listA0a, AbstractC0878AGe.A0a(list2, size), map);
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchFxAccounts$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC6666EOb.A00());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AbstractC6666EOb.A00());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EPY> fetchLegacyItems(Context context) {
        EPP epp = new EPP();
        epp.A03 = new AuraAccessLibraryLogger();
        EPC epc = new EPC(epp);
        try {
            ArrayList arrayListA0E = epc.A0E(context, "hatch_native_login", NativeLoginAccountResolverKt.LEGACY_CONTENT_PROVIDER_SSO_SOURCES);
            List<EPL> list = NativeLoginAccountResolverKt.LEGACY_ACCOUNT_SWITCHER_SSO_SOURCES;
            AnonymousClass003.A0u(context, list);
            return AbstractC0878AGe.A0P(epc.A07(context, BV5.A0j(), "hatch_native_login", list), arrayListA0E);
        } catch (Exception e) {
            CFK.A0K(NativeLoginAccountResolverKt.TAG, e, "SSO v1 account fetch failed");
            return C0881AGi.A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchV2Credentials(android.content.Context r10, java.util.Set<? extends X.EP0> r11, X.HtJ<? super java.util.List<X.ENw>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.AnonymousClass1
            if (r0 == 0) goto L1e
            r8 = r12
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchV2Credentials$1 r8 = (com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L51
        L1e:
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchV2Credentials$1 r8 = new com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchV2Credentials$1
            r8.<init>(r12)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            X.EOB r4 = X.EOB.A05     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            X.EP1 r1 = X.EP1.A03     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            X.EP1 r0 = X.EP1.A04     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            X.EP1[] r0 = new X.EP1[]{r1, r0}     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            java.util.Set r1 = X.BFI.A0H(r0)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            r0 = 0
            X.EOH r9 = new X.EOH     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            r9.<init>(r1, r0)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            java.lang.String r6 = "hatch_native_login"
            r8.L$0 = r0     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            r8.L$1 = r0     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            r8.label = r2     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            r5 = r10
            r7 = r11
            java.lang.Object r1 = r4.A02(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            if (r1 != r3) goto L54
            return r3
        L51:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
        L54:
            X.EOM r1 = (X.EOM) r1     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            java.util.List<X.ENw> r3 = r1.A01     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L64
            return r3
        L59:
            r2 = move-exception
            java.lang.String r1 = "SSO account fetch failed"
            java.lang.String r0 = "NativeLoginAccountResolver"
            X.CFK.A0K(r0, r2, r1)
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L64:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.fetchV2Credentials(android.content.Context, java.util.Set, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.HoC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchWhatsAppAccount(final android.content.Context r8, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginSsoAccount> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.C125131
            if (r0 == 0) goto L64
            r6 = r9
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$1 r6 = (com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.C125131) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 != r5) goto L6a
            java.lang.Object r4 = r6.L$1
            X.HoC r4 = (X.HoC) r4
            X.Hwg.A00(r0)
        L24:
            boolean r1 = r4.AOG()
            if (r1 != 0) goto L31
            java.lang.String r2 = "NativeLoginAccountResolver"
            java.lang.String r1 = "WhatsApp auth bundle read timed out"
            X.CFK.A06(r2, r1)
        L31:
            return r0
        L32:
            X.Hwg.A00(r0)
            boolean r0 = com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt.isWhatsAppSsoEnabled()
            r3 = 0
            if (r0 != 0) goto L3d
            return r3
        L3d:
            X.GAt r4 = new X.GAt
            r4.<init>(r3)
            X.F0C r0 = com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt.whatsAppReadExecutor$delegate
            java.util.concurrent.Executor r1 = X.F0C.A06(r0)
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$2 r0 = new com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$2
            r0.<init>()
            r1.execute(r0)
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$account$1 r2 = new com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$account$1
            r2.<init>(r4, r3)
            r6.L$0 = r3
            r6.L$1 = r4
            r6.label = r5
            r0 = 1750(0x6d6, double:8.646E-321)
            java.lang.Object r0 = X.GAX.A01(r6, r2, r0)
            if (r0 != r7) goto L24
            return r7
        L64:
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$1 r6 = new com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchWhatsAppAccount$1
            r6.<init>(r9)
            goto L12
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.fetchWhatsAppAccount(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final AHD<NativeLoginSsoAccount> merge(List<SsoCandidate> list) {
        List listA0c = AbstractC0878AGe.A0c(list, new C2FI(new G0U[]{C125151.INSTANCE, C125162.INSTANCE, C125173.INSTANCE, C125184.INSTANCE}));
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0c) {
            SsoCandidate ssoCandidate = (SsoCandidate) obj;
            if (hashSetA13.add(new HxE(ssoCandidate.sourceApp, ssoCandidate.userId))) {
                arrayListA0h.add(obj);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            SsoCandidate ssoCandidate2 = (SsoCandidate) it.next();
            arrayListA0i.add(new NativeLoginSsoAccount(ssoCandidate2.userId, ssoCandidate2.sourceApp, ssoCandidate2.accessToken));
        }
        return AGI.A07(arrayListA0i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeLoginPickerRows pickerRows$default(NativeLoginAccountResolver nativeLoginAccountResolver, List list, List list2, int i, Set set, Map map, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            set = A3q.A00;
        }
        return nativeLoginAccountResolver.pickerRows(list, list2, i, set, C3cH.A0o(map, i2 & 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:3:0x0005, B:4:0x000b, B:6:0x001d, B:7:0x001f, B:75:0x015e, B:86:0x0182, B:88:0x018a, B:90:0x019d, B:92:0x01a4, B:94:0x01ac, B:96:0x01b7, B:99:0x01be, B:100:0x01c1, B:102:0x01c3, B:78:0x0163, B:80:0x0167, B:81:0x0171, B:83:0x0175, B:104:0x01c9, B:105:0x01cd, B:8:0x0026, B:10:0x0030, B:11:0x0035, B:13:0x0040, B:14:0x0043, B:20:0x005e, B:67:0x0146, B:71:0x014d, B:72:0x0150, B:16:0x0049, B:18:0x0051, B:19:0x0056, B:74:0x0152), top: B:110:0x0005, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:3:0x0005, B:4:0x000b, B:6:0x001d, B:7:0x001f, B:75:0x015e, B:86:0x0182, B:88:0x018a, B:90:0x019d, B:92:0x01a4, B:94:0x01ac, B:96:0x01b7, B:99:0x01be, B:100:0x01c1, B:102:0x01c3, B:78:0x0163, B:80:0x0167, B:81:0x0171, B:83:0x0175, B:104:0x01c9, B:105:0x01cd, B:8:0x0026, B:10:0x0030, B:11:0x0035, B:13:0x0040, B:14:0x0043, B:20:0x005e, B:67:0x0146, B:71:0x014d, B:72:0x0150, B:16:0x0049, B:18:0x0051, B:19:0x0056, B:74:0x0152), top: B:110:0x0005, inners: #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.login.nativeflow.NativeLoginSsoAccount readWhatsAppAccount(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.readWhatsAppAccount(android.content.Context):com.facebook.aura.login.nativeflow.NativeLoginSsoAccount");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveSsoAccounts$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(java.util.List<com.facebook.aura.login.nativeflow.SsoCandidate> r6, kotlin.jvm.functions.Function0<java.lang.Boolean> r7, X.G0U<? super X.HtJ<? super java.util.List<com.facebook.aura.login.nativeflow.SsoCandidate>>, ? extends java.lang.Object> r8, kotlin.jvm.functions.Function0<? extends java.util.List<com.facebook.aura.login.nativeflow.SsoCandidate>> r9, X.HtJ<? super X.AHD<com.facebook.aura.login.nativeflow.NativeLoginSsoAccount>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$resolveSsoAccounts$1
            if (r0 == 0) goto L52
            r4 = r10
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$resolveSsoAccounts$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$resolveSsoAccounts$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L58
            java.lang.Object r5 = r4.L$4
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver r5 = (com.facebook.aura.login.nativeflow.NativeLoginAccountResolver) r5
            X.Hwg.A00(r3)
        L24:
            java.util.List r3 = (java.util.List) r3
        L26:
            X.AHD r0 = r5.merge(r3)
            return r0
        L2b:
            X.Hwg.A00(r3)
            if (r6 != 0) goto L50
            boolean r0 = X.AnonymousClass003.A1Y(r7)
            if (r0 == 0) goto L4a
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r5
            r4.label = r1
            java.lang.Object r3 = r8.invoke(r4)
            if (r3 != r2) goto L24
            return r2
        L4a:
            java.lang.Object r6 = r9.invoke()
            java.util.List r6 = (java.util.List) r6
        L50:
            r3 = r6
            goto L26
        L52:
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$resolveSsoAccounts$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$resolveSsoAccounts$1
            r4.<init>(r5, r10)
            goto L12
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.resolveSsoAccounts$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(java.util.List, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchFxAccounts(Context context, HtJ<? super AHD<NativeLoginSsoAccount>> htJ) {
        return resolveSsoAccounts$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(e2eCandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(C9X.A04(), new AnonymousClass2(context)), AnonymousClass3.INSTANCE, new AnonymousClass4(context, null), new AnonymousClass5(context), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SsoCandidate> legacyCandidates(List<EPY> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (EPY epy : list) {
            HatchSsoSourceApp ssoSourceApp = NativeLoginAccountResolverKt.toSsoSourceApp(epy.A05);
            if (ssoSourceApp != null) {
                String str = epy.A02;
                if (!C7BY.A0j(str)) {
                    arrayListA0h.add(new SsoCandidate(epy.A03, ssoSourceApp, str, epy.A06 == EPi.A02));
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SsoCandidate> v2Candidates(List<ENw> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (ENw eNw : list) {
            HatchSsoSourceApp ssoSourceApp = NativeLoginAccountResolverKt.toSsoSourceApp(eNw.A03);
            if (ssoSourceApp != null) {
                String str = eNw.A01;
                if (!C7BY.A0j(str)) {
                    arrayListA0h.add(new SsoCandidate(eNw.A02, ssoSourceApp, str, AnonymousClass002.A1Z(eNw.A04, EP1.A03)));
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.login.nativeflow.SsoCandidate> parseE2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List r0 = X.AbstractC5224Ddh.A01(r7)
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r7 = r0.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r6 = r7.next()
            X.EOZ r6 = (X.EOZ) r6
            java.lang.String r1 = r6.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1436108013: goto L33;
                case 28903346: goto L28;
                case 497130182: goto L25;
                case 1539093419: goto L22;
                default: goto L21;
            }
        L21:
            goto Lc
        L22:
            java.lang.String r0 = "barcelona"
            goto L2a
        L25:
            java.lang.String r0 = "facebook"
            goto L35
        L28:
            java.lang.String r0 = "instagram"
        L2a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r4 = com.facebook.aura.login.nativeflow.HatchSsoSourceApp.INSTAGRAM
            goto L3d
        L33:
            java.lang.String r0 = "messenger"
        L35:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r4 = com.facebook.aura.login.nativeflow.HatchSsoSourceApp.FACEBOOK
        L3d:
            java.lang.String r3 = r6.A03
            if (r3 == 0) goto Lc
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto Lc
            java.lang.String r2 = r6.A00
            if (r2 == 0) goto Lc
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto Lc
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L6f
            java.lang.String r0 = com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt.ACTIVE_CREDENTIAL_SOURCE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            java.lang.String r0 = com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt.INACTIVE_CREDENTIAL_SOURCE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            r1 = 0
        L66:
            com.facebook.aura.login.nativeflow.SsoCandidate r0 = new com.facebook.aura.login.nativeflow.SsoCandidate
            r0.<init>(r3, r4, r2, r1)
            r5.add(r0)
            goto Lc
        L6f:
            r1 = 1
            goto L66
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.parseE2ECandidates$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(java.lang.String):java.util.List");
    }
}
