package com.facebook.aura.iap;

import X.AIW;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06G;
import X.C0924AIa;
import X.C10606Hye;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4JM;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7Bm;
import X.C9698Ge3;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.EnumC10621Hzf;
import X.EnumC9704GeI;
import X.EnumC9706GeK;
import X.F31;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GBL;
import X.HVs;
import X.Hm1;
import X.Hm8;
import X.Hnw;
import X.Hs0;
import X.Hs4;
import X.Hs8;
import X.HtJ;
import X.Hvy;
import X.Hwg;
import X.Hx5;
import X.HyP;
import X.Hyl;
import X.HzP;
import X.Hzd;
import X.Hzk;
import X.InterfaceC10512HoG;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.components.reactions.AuraLightningLatchKt;
import com.facebook.graphql.enums.EnumHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class HatchSubscriptionPurchase {
    public static final HatchSubscriptionPurchase INSTANCE = new HatchSubscriptionPurchase();
    public static final Set<EnumC9704GeI> PENDING_RESULT_CODES = BFI.A0H(new EnumC9704GeI[]{EnumC9704GeI.A0I, EnumC9704GeI.A0J});
    public static final String SUBSCRIPTION_PRODUCT_TYPE = "NME_SUBSCRIPTION";
    public static final String TAG = "HatchSubscriptionPurchase";

    public final class PurchaseResultCompleter {
        public final G0U<Function0<Unit>, Unit> dispatchOnUiThread;
        public boolean hasDeliveredResult;
        public final G0U<Result, Unit> onResult;

        public final void finish(Result result) {
            C7384Etj.A0Y(result, 0);
            this.dispatchOnUiThread.invoke(new HatchSubscriptionPurchase$PurchaseResultCompleter$finish$1(this, result));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PurchaseResultCompleter(G0U<? super Function0<Unit>, Unit> g0u, G0U<? super Result, Unit> g0u2) {
            AnonymousClass003.A0u(g0u, g0u2);
            this.dispatchOnUiThread = g0u;
            this.onResult = g0u2;
        }
    }

    public interface Result {

        public final class Canceled implements Result {
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Canceled);
            }

            public String toString() {
                return "Canceled";
            }

            public int hashCode() {
                return -957494604;
            }
        }

        public final class Failed extends C06G implements Result {
            public final String reason;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.reason, ((Failed) obj).reason));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.reason;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Pending extends C06G implements Result {
            public final String reason;

            public Pending(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final Pending copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Pending(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Pending) && C7384Etj.areEqual(this.reason, ((Pending) obj).reason));
            }

            public static /* synthetic */ Pending copy$default(Pending pending, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pending.reason;
                }
                C7384Etj.A0Y(str, 0);
                return new Pending(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success implements Result {
            public static final Success INSTANCE = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public String toString() {
                return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
            }

            public int hashCode() {
                return -370062712;
            }
        }

        public final class Unavailable implements Result {
            public static final Unavailable INSTANCE = new Unavailable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unavailable);
            }

            public String toString() {
                return "Unavailable";
            }

            public int hashCode() {
                return -942729131;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.iap.HatchSubscriptionPurchase", f = "HatchSubscriptionPurchase.kt", l = {AuraLightningLatchKt.LIGHTNING_TOTAL_MS}, m = "recordPurchaseStartAttribution", v = 2)
    /* renamed from: com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$1, reason: invalid class name and case insensitive filesystem */
    public final class C122321 extends HzP {
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

        public C122321(HtJ<? super C122321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSubscriptionPurchase.this.recordPurchaseStartAttribution(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.iap.HatchSubscriptionPurchase$storeCountry$2", f = "HatchSubscriptionPurchase.kt", l = {450}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.iap.HatchSubscriptionPurchase$storeCountry$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchIapUserSession $iapUserSession;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchIapUserSession hatchIapUserSession, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$iapUserSession = hatchIapUserSession;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$iapUserSession, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchIapUserSession hatchIapUserSession = this.$iapUserSession;
                Context context = this.$context;
                this.L$0 = hatchIapUserSession;
                this.L$1 = context;
                this.label = 1;
                final GBL gblA04 = C7Bm.A04(this);
                hatchIapUserSession.preWarm(context, new Hnw(), new Hyl() { // from class: com.facebook.aura.iap.HatchSubscriptionPurchase$storeCountry$2$1$1
                    @Override // X.Hyl
                    public final void onPreWarmComplete(HyP hyP) {
                        Hs4 hs4;
                        C7384Etj.A0Y(hyP, 0);
                        if (gblA04.isActive()) {
                            Hm1<String> hm1 = gblA04;
                            String str = null;
                            if ((hyP instanceof Hs4) && (hs4 = (Hs4) hyP) != null) {
                                str = hs4.A00;
                            }
                            hm1.resumeWith(str);
                        }
                    }
                });
                obj = gblA04.A0F();
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordPurchaseStartAttribution(java.lang.String r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.iap.HatchSubscriptionPurchase.C122321
            if (r0 == 0) goto L21
            r15 = r3
            com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$1 r15 = (com.facebook.aura.iap.HatchSubscriptionPurchase.C122321) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r3 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            java.lang.String r1 = "HatchSubscriptionPurchase"
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 != r6) goto L27
            goto L5d
        L21:
            com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$1 r15 = new com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$1
            r15.<init>(r3)
            goto L13
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            com.facebook.aura.iap.IapStefiPath$SubscriptionPurchaseStartAttribution r7 = com.facebook.aura.iap.IapStefiPath.SubscriptionPurchaseStartAttribution.INSTANCE     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            com.facebook.aura.iap.PurchaseStartAttributionRequestJson r8 = new com.facebook.aura.iap.PurchaseStartAttributionRequestJson     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r8.<init>(r14)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            X.9jH r10 = X.C9jH.A00     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.iap.HatchSubscriptionPurchase$recordPurchaseStartAttribution$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r13 = 0
            r12 = 0
            r15.L$0 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.L$1 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.L$2 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.L$3 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.L$4 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.L$5 = r12     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.I$0 = r6     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.I$1 = r13     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r15.label = r6     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            r11 = r6
            r14 = r12
            java.lang.Object r0 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            if (r0 != r2) goto L61
            return r2
        L5d:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
        L61:
            boolean r0 = r0 instanceof X.C10571Hud     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            if (r0 == 0) goto L70
            java.lang.String r0 = "purchase_start attribution failed; continuing purchase (reason=request_failure)"
            X.CFK.A06(r1, r0)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L73
            goto L70
        L6b:
            java.lang.String r0 = "purchase_start attribution failed; continuing purchase (reason=unexpected_failure)"
            X.CFK.A06(r1, r0)
        L70:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L73:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.iap.HatchSubscriptionPurchase.recordPurchaseStartAttribution(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void launch(FragmentActivity fragmentActivity, String str, String str2, G0U<? super Result, Unit> g0u) {
        AnonymousClass005.A0y(fragmentActivity, str, g0u);
        launchPurchase(fragmentActivity, str, str, EnumC10621Hzf.A03, Hs8.A03, SUBSCRIPTION_PRODUCT_TYPE, str2, g0u);
    }

    public final void launchTopUp(FragmentActivity fragmentActivity, String str, String str2, String str3, G0U<? super Result, Unit> g0u) {
        AnonymousClass005.A0x(fragmentActivity, str, str2);
        C7384Etj.A0Y(g0u, 4);
        launchPurchase(fragmentActivity, str, str2, EnumC10621Hzf.A02, Hs8.A02, resolveProductType(str3, "META_AI_CREDIT"), null, g0u);
    }

    private final void launchPurchase(final FragmentActivity fragmentActivity, final String str, final String str2, EnumC10621Hzf enumC10621Hzf, final Hs8 hs8, final String str3, final String str4, final G0U<? super Result, Unit> g0u) {
        final String str5 = hs8 == Hs8.A03 ? "purchase_subscription" : "purchase_topup";
        final HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(fragmentActivity);
        if (scoped != null) {
            scoped.fetchProductDetails(enumC10621Hzf == EnumC10621Hzf.A02 ? Collections.singletonList(str) : null, enumC10621Hzf == EnumC10621Hzf.A03 ? Collections.singletonList(str) : null, enumC10621Hzf, false, null, str3, new Hvy() { // from class: com.facebook.aura.iap.HatchSubscriptionPurchase.launchPurchase.1

                @DebugMetadata(c = "com.facebook.aura.iap.HatchSubscriptionPurchase$launchPurchase$1$2", f = "HatchSubscriptionPurchase.kt", l = {252}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.iap.HatchSubscriptionPurchase$launchPurchase$1$2, reason: invalid class name */
                public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ String $purchaseEntrypoint;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
                        super(2, htJ);
                        this.$purchaseEntrypoint = str;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new AnonymousClass2(this.$purchaseEntrypoint, htJ);
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return new AnonymousClass2(this.$purchaseEntrypoint, htJ).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i = this.label;
                        if (i == 0) {
                            Hwg.A00(obj);
                            HatchSubscriptionPurchase hatchSubscriptionPurchase = HatchSubscriptionPurchase.INSTANCE;
                            String str = this.$purchaseEntrypoint;
                            this.label = 1;
                            if (hatchSubscriptionPurchase.recordPurchaseStartAttribution(str, this) == enumC10460Hji) {
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

                @Override // X.Hvy
                public /* bridge */ void onResponseWithError(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map, Hzd hzd) throws JSONException {
                    AnonymousClass002.A1B(interfaceC10512HoG, 1, map);
                    onResponse(interfaceC10512HoG, enumC9704GeI, map);
                }

                @Override // X.Hvy
                public final void onResponse(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map) throws JSONException {
                    G0U<Result, Unit> g0u2;
                    String strA0j;
                    AnonymousClass003.A0v(interfaceC10512HoG, map);
                    EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
                    if (enumC9706GeKAJk != EnumC9706GeK.A0H || (enumC9704GeI != null && enumC9704GeI.isError)) {
                        String str6 = str5;
                        String strName = enumC9706GeKAJk.name();
                        CFK.A06(HatchSubscriptionPurchase.TAG, FGI.A0j(str6, " failed: ", strName, " (", HatchSubscriptionPurchase.INSTANCE.productDetailsFailureDetail(enumC9704GeI, Collections.singletonList(str)), ")"));
                        g0u2 = g0u;
                        if (enumC9704GeI == null || (strA0j = C60Q.A0j(enumC9704GeI.name())) == null) {
                            strA0j = C60Q.A0j(strName);
                        }
                    } else {
                        C10606Hye c10606Hye = map.get(str);
                        if (c10606Hye != null) {
                            final String str7 = c10606Hye.A03;
                            if (str7 != null && str7.length() != 0) {
                                Hs8 hs82 = hs8;
                                String str8 = str2;
                                Hm8 hm8 = c10606Hye.A01;
                                C9698Ge3 c9698Ge3 = new C9698Ge3(hs82, null, null, str7, null, str8, hm8.A00, hm8.A01, str3, null);
                                String str9 = str4;
                                if (str9 != null) {
                                    String str10 = c9698Ge3.A01;
                                    JSONObject jSONObject = str10 == null ? new JSONObject() : new JSONObject(str10);
                                    jSONObject.put(HatchSubscriptionPurchaseKt.PURCHASE_ENTRYPOINT_PAYLOAD_KEY, str9);
                                    c9698Ge3.A01 = jSONObject.toString();
                                }
                                final HatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1 hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1 = new HatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1(new PurchaseResultCompleter(new HatchSubscriptionPurchase$launchPurchase$1$resultCompleter$1(fragmentActivity.getMainExecutor()), g0u));
                                if (str4 != null) {
                                    AnonymousClass001.A1J(new AnonymousClass2(str4, null), F31.A00(fragmentActivity));
                                }
                                try {
                                    HatchIapUserSession hatchIapUserSession = scoped;
                                    FragmentActivity fragmentActivity2 = fragmentActivity;
                                    final String str11 = str5;
                                    final String str12 = str2;
                                    hatchIapUserSession.launchPurchaseFlow(fragmentActivity2, c9698Ge3, new Hx5() { // from class: com.facebook.aura.iap.HatchSubscriptionPurchase.launchPurchase.1.3
                                        @Override // X.Hx5
                                        public /* bridge */ void onPurchaseFailed(EnumC9704GeI enumC9704GeI2, Hzd hzd) {
                                            C7384Etj.A0Y(enumC9704GeI2, 1);
                                            onPurchaseFinished(enumC9704GeI2);
                                        }

                                        @Override // X.Hx5
                                        public void onPurchaseFinished(EnumC9704GeI enumC9704GeI2) {
                                            G0U g0u3;
                                            Result failed;
                                            C7384Etj.A0Y(enumC9704GeI2, 0);
                                            if (enumC9704GeI2 == EnumC9704GeI.A0Q) {
                                                ((G0U) hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1).invoke(Result.Canceled.INSTANCE);
                                                return;
                                            }
                                            if (HatchSubscriptionPurchase.PENDING_RESULT_CODES.contains(enumC9704GeI2)) {
                                                g0u3 = (G0U) hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1;
                                                failed = new Result.Pending(C60Q.A0j(enumC9704GeI2.name()));
                                            } else {
                                                String str13 = str11;
                                                String strName2 = enumC9704GeI2.name();
                                                CFK.A06(HatchSubscriptionPurchase.TAG, FGI.A0l(str13, " failed: ", strName2, " (id=", str12, " sku=", str7, ")"));
                                                g0u3 = (G0U) hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1;
                                                failed = new Result.Failed(C60Q.A0j(strName2));
                                            }
                                            g0u3.invoke(failed);
                                        }

                                        @Override // X.Hx5
                                        public void onPurchaseSuccessful(Hs0 hs0) {
                                            ((G0U) hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1).invoke(Result.Success.INSTANCE);
                                        }
                                    }, null, null);
                                    return;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Exception unused) {
                                    CFK.A06(HatchSubscriptionPurchase.TAG, FGI.A0j(str5, " failed: launch_exception (id=", str2, " sku=", str7, ")"));
                                    hatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1.invoke((HatchSubscriptionPurchase$launchPurchase$1$finishPurchase$1) new Result.Failed("launch_exception"));
                                    return;
                                }
                            }
                            strA0j = "empty_sku";
                        } else {
                            strA0j = "no_product_details";
                        }
                        CFK.A06(HatchSubscriptionPurchase.TAG, FGI.A0l(str5, " failed: ", strA0j, " (id=", str, " returned=", AbstractC06907md.A01(",", map.keySet(), null), ")"));
                        g0u2 = g0u;
                    }
                    g0u2.invoke(new Result.Failed(strA0j));
                }

                public /* bridge */ void onResponse(InterfaceC10512HoG interfaceC10512HoG, Map<String, C10606Hye> map) {
                    Hzk.A00(interfaceC10512HoG, this, map);
                }
            });
        } else {
            CFK.A06(TAG, FGI.A0d(str5, " failed: no_iap_session (id=", str, ")"));
            g0u.invoke(Result.Unavailable.INSTANCE);
        }
    }

    private final String resolveProductType(String str, String str2) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            Locale locale = Locale.ROOT;
            C7384Etj.A0V(locale);
            String upperCase = strA0l.toUpperCase(locale);
            if (upperCase.length() != 0) {
                HVs hVs = HVs.A02;
                Enum enumA00 = EnumHelper.A00(upperCase, hVs);
                C7384Etj.A0U(enumA00);
                if (enumA00 != hVs) {
                    return upperCase;
                }
                CFK.A06(TAG, FGI.A0d("Unrecognized catalog product type ", upperCase, "; quoting as ", str2));
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchTierPrice tierPrice(C10606Hye c10606Hye) {
        String str = c10606Hye.A04;
        if (str.length() == 0) {
            return null;
        }
        String str2 = c10606Hye.A05;
        String str3 = C7BY.A0j(str2) ? null : str2;
        return new HatchTierPrice(str, HatchSubscriptionPurchaseKt.playMicrosToHundredths(c10606Hye.A00, str3), str3);
    }

    public final Object fetchPrices(Context context, List<String> list, HtJ<? super Map<String, HatchTierPrice>> htJ) {
        return fetchPlayPrices(context, list, EnumC10621Hzf.A03, SUBSCRIPTION_PRODUCT_TYPE, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchPlayPrices(Context context, final List<String> list, EnumC10621Hzf enumC10621Hzf, String str, HtJ<? super Map<String, HatchTierPrice>> htJ) {
        if (!list.isEmpty()) {
            HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(context);
            if (scoped != null) {
                String str2 = GBL.__redex_internal_original_name;
                final GBL gbl = new GBL(1, C7Bm.A02(htJ));
                gbl.A0I();
                List<String> list2 = null;
                if (enumC10621Hzf == EnumC10621Hzf.A02) {
                    list2 = list;
                }
                scoped.fetchProductDetails(list2, enumC10621Hzf == EnumC10621Hzf.A03 ? list : null, enumC10621Hzf, true, null, str, new Hvy() { // from class: com.facebook.aura.iap.HatchSubscriptionPurchase$fetchPlayPrices$2$1
                    @Override // X.Hvy
                    public /* bridge */ void onResponseWithError(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map, Hzd hzd) {
                        AnonymousClass002.A1B(interfaceC10512HoG, 1, map);
                        onResponse(interfaceC10512HoG, enumC9704GeI, map);
                    }

                    @Override // X.Hvy
                    public final void onResponse(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map) {
                        AnonymousClass003.A0v(interfaceC10512HoG, map);
                        if (gbl.isActive()) {
                            EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
                            if (enumC9706GeKAJk != EnumC9706GeK.A0H || (enumC9704GeI != null && enumC9704GeI.isError)) {
                                CFK.A06(HatchSubscriptionPurchase.TAG, FGI.A0h("fetch_play_prices failed: ", enumC9706GeKAJk.name(), " (", HatchSubscriptionPurchase.INSTANCE.productDetailsFailureDetail(enumC9704GeI, list), ")"));
                                gbl.resumeWith(C9jH.A00);
                                return;
                            }
                            C0924AIa c0924AIaA0u = C3cG.A0u();
                            Iterator itA0n = AnonymousClass002.A0n(map);
                            while (itA0n.hasNext()) {
                                Map.Entry entryA0l = C3cH.A0l(itA0n);
                                Object key = entryA0l.getKey();
                                HatchTierPrice hatchTierPriceTierPrice = HatchSubscriptionPurchase.INSTANCE.tierPrice((C10606Hye) entryA0l.getValue());
                                if (hatchTierPriceTierPrice != null) {
                                    c0924AIaA0u.put(key, hatchTierPriceTierPrice);
                                }
                            }
                            C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
                            if (c0924AIaA0K.size() < list.size()) {
                                String str3 = c0924AIaA0K.isEmpty() ? "no_prices_returned" : "partial_prices";
                                int size = list.size();
                                int size2 = c0924AIaA0K.size();
                                List<String> list3 = list;
                                ArrayList arrayListA0h = C3cG.A0h();
                                for (String str4 : list3) {
                                    if (!c0924AIaA0K.containsKey(str4)) {
                                        arrayListA0h.add(str4);
                                    }
                                }
                                String strA0e = C3cH.A0e(",", arrayListA0h);
                                StringBuilder sbA0x = C3cI.A0x("fetch_play_prices failed: ", str3);
                                sbA0x.append(" (requested=");
                                sbA0x.append(size);
                                sbA0x.append(" priced=");
                                sbA0x.append(size2);
                                sbA0x.append(" missing=");
                                CFK.A06(HatchSubscriptionPurchase.TAG, C60P.A1M(strA0e, ")", sbA0x));
                            }
                            gbl.resumeWith(c0924AIaA0K);
                        }
                    }

                    public /* bridge */ void onResponse(InterfaceC10512HoG interfaceC10512HoG, Map<String, C10606Hye> map) {
                        Hzk.A00(interfaceC10512HoG, this, map);
                    }
                });
                return gbl.A0F();
            }
            CFK.A06(TAG, C60O.A0r("fetch_play_prices failed: no_iap_session (ids=", C3cH.A0e(",", list)));
        }
        return C9jH.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String productDetailsFailureDetail(EnumC9704GeI enumC9704GeI, List<String> list) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(FGI.A0M("ids=", C3cH.A0e(",", list)));
        if (enumC9704GeI != null) {
            sbA0w.append(FGI.A0M(" resultCode=", enumC9704GeI.name()));
        }
        return sbA0w.toString();
    }

    private final String reason(EnumC9704GeI enumC9704GeI) {
        return C60Q.A0j(enumC9704GeI.name());
    }

    public final Object fetchTopUpPrices(List<String> list, String str, HtJ<? super Map<String, HatchTierPrice>> htJ) {
        return fetchPlayPrices(C4JM.A00(), list, EnumC10621Hzf.A02, resolveProductType(str, "META_AI_CREDIT"), htJ);
    }

    public final Object storeCountry(HtJ<? super String> htJ) {
        Application applicationA00 = C4JM.A00();
        HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(applicationA00);
        if (scoped == null || scoped.getUseIacOverIap()) {
            return null;
        }
        return GAX.A01(htJ, new AnonymousClass2(scoped, applicationA00, null), 2000L);
    }
}
