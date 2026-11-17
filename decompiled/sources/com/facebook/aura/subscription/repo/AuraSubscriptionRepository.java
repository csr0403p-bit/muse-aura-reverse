package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0851A5x;
import X.C10571Hud;
import X.C10650I0u;
import X.C1BN;
import X.C27k;
import X.C2zT;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.C8j4;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GCV;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.HzR;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.repo.RefreshCommand;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isSettlingPurchase;
    public final BLG<Boolean> _provisioningPollExhausted;
    public final BLG<Boolean> _refreshQueued;
    public final BLG<SubscriptionDetailsState> _subscriptionDetailsState;
    public final Function0<Long> clockMs;
    public volatile boolean isCleared;
    public volatile boolean isNameSatisfied;
    public final C1BN<Boolean> isSettlingPurchase;
    public volatile Long lastFetchedAtMs;
    public final AtomicReference<PendingPurchase> pendingPurchase;
    public final C1BN<Boolean> provisioningPollExhausted;
    public final HzR<RefreshCommand> refreshCommands;
    public final C3UX scope;
    public final C1BN<SubscriptionDetailsState> subscriptionDetailsState;
    public final AbstractC3358CGz userSession;
    public final SingleFlight viewerCatalogFetch;

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$1", f = "AuraSubscriptionRepository.kt", l = {189, 194, 194, 201, 202, 211}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraSubscriptionRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x013a: INSTANCE_OF (r0 I:boolean) = (r5 I:??[OBJECT, ARRAY]) (LINE:314) com.facebook.aura.subscription.repo.RefreshCommand$PostPurchase, block:B:65:0x013a */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:20:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011a -> B:20:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x011c -> B:20:0x0067). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$3", f = "AuraSubscriptionRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = AuraSubscriptionRepository.this.new AnonymousClass3(htJ);
            anonymousClass3.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (z) {
                AuraSubscriptionRepository.this.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
            }
            return Unit.INSTANCE;
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }
    }

    public final class PendingPurchase extends C06G {
        public final String name;
        public final String tierId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingPurchase) {
                    PendingPurchase pendingPurchase = (PendingPurchase) obj;
                    if (!C7384Etj.areEqual(this.tierId, pendingPurchase.tierId) || !C7384Etj.areEqual(this.name, pendingPurchase.name)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingPurchase copy$default(PendingPurchase pendingPurchase, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingPurchase.tierId;
            }
            if ((i & 2) != 0) {
                str2 = pendingPurchase.name;
            }
            return new PendingPurchase(str, str2);
        }

        public final String component1() {
            return this.tierId;
        }

        public final String component2() {
            return this.name;
        }

        public final PendingPurchase copy(String str, String str2) {
            return new PendingPurchase(str, str2);
        }

        public final String getName() {
            return this.name;
        }

        public final String getTierId() {
            return this.tierId;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.tierId) * 31) + AnonymousClass005.A0H(this.name);
        }

        public PendingPurchase(String str, String str2) {
            this.tierId = str;
            this.name = str2;
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {477}, m = "activateComplimentarySubscription", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$activateComplimentarySubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C141391 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C141391(HtJ<? super C141391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.activateComplimentarySubscription(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {HatchMessageShareDocumentRenderer.MIN_IMAGE_HEIGHT_PX, 635}, m = "awaitProvisioned", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$awaitProvisioned$1, reason: invalid class name and case insensitive filesystem */
    public final class C141401 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C141401(HtJ<? super C141401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.awaitProvisioned(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$cancelSubscriptionAsync$1", f = "AuraSubscriptionRepository.kt", l = {465}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$cancelSubscriptionAsync$1, reason: invalid class name and case insensitive filesystem */
    public final class C141411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C141411(HtJ<? super C141411> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionRepository.this.new C141411(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return AuraSubscriptionRepository.this.new C141411(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2259applyChange0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraSubscriptionRepository.this;
                this.label = 1;
                objM2259applyChange0E7RQCE = auraSubscriptionRepository.m2259applyChange0E7RQCE(AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL, true, this);
                if (objM2259applyChange0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM2259applyChange0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0P(objM2259applyChange0E7RQCE instanceof C10571Hud);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$drainCreditUsageAsync$1", f = "AuraSubscriptionRepository.kt", l = {438}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$drainCreditUsageAsync$1, reason: invalid class name and case insensitive filesystem */
    public final class C141421 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ int $percentUsed;
        public final /* synthetic */ CreditQuotaType $quotaType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141421(CreditQuotaType creditQuotaType, int i, HtJ<? super C141421> htJ) {
            super(2, htJ);
            this.$quotaType = creditQuotaType;
            this.$percentUsed = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionRepository.this.new C141421(this.$quotaType, this.$percentUsed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraSubscriptionRepository.this;
                CreditQuotaType creditQuotaType = this.$quotaType;
                int i2 = this.$percentUsed;
                this.label = 1;
                obj = auraSubscriptionRepository.postCreditDrain(creditQuotaType, i2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj == null) {
                return null;
            }
            AuraSubscriptionRepository.this.refresh();
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ((C141421) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {HtmlPdfRenderer.PAGE_HEIGHT}, m = "fetchPaymentPortalUrl", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$1, reason: invalid class name and case insensitive filesystem */
    public final class C141431 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C141431(HtJ<? super C141431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.fetchPaymentPortalUrl(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {379}, m = "fetchSubscriptionCatalog", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C141441 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C141441(HtJ<? super C141441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.fetchSubscriptionCatalog(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {839}, m = "fetchSubscriptionDetailsState", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$1, reason: invalid class name and case insensitive filesystem */
    public final class C141451 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C141451(HtJ<? super C141451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.fetchSubscriptionDetailsState(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {430}, m = "fetchTopUpCatalog", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchTopUpCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C141461 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C141461(HtJ<? super C141461> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.fetchTopUpCatalog(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {414}, m = "fetchViewerCatalog", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C141471 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C141471(HtJ<? super C141471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.fetchViewerCatalog(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {HtmlPdfRenderer.PAGE_HEIGHT}, m = "postCreditDrain", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$1, reason: invalid class name and case insensitive filesystem */
    public final class C141481 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C141481(HtJ<? super C141481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.postCreditDrain(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$reactivateSubscriptionAsync$1", f = "AuraSubscriptionRepository.kt", l = {470}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$reactivateSubscriptionAsync$1, reason: invalid class name and case insensitive filesystem */
    public final class C141491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C141491(HtJ<? super C141491> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionRepository.this.new C141491(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return AuraSubscriptionRepository.this.new C141491(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2259applyChange0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraSubscriptionRepository.this;
                this.label = 1;
                objM2259applyChange0E7RQCE = auraSubscriptionRepository.m2259applyChange0E7RQCE(AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_REACTIVATE, true, this);
                if (objM2259applyChange0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM2259applyChange0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0P(objM2259applyChange0E7RQCE instanceof C10571Hud);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {604, 609}, m = "reconcile", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$reconcile$1, reason: invalid class name and case insensitive filesystem */
    public final class C141501 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C141501(HtJ<? super C141501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.reconcile(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {870}, m = "redeemComplimentarySubscription", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$redeemComplimentarySubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C141511 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C141511(HtJ<? super C141511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.redeemComplimentarySubscription(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {292}, m = "refreshInternal", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$refreshInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C141521 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C141521(HtJ<? super C141521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.refreshInternal(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {HtmlPdfRenderer.PAGE_HEIGHT}, m = "saveViewerName", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$1, reason: invalid class name and case insensitive filesystem */
    public final class C141531 extends HzP {
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

        public C141531(HtJ<? super C141531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.saveViewerName(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {870}, m = "submitSubscriptionCallback", v = 2)
    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C141541 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C141541(HtJ<? super C141541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionRepository.this.submitSubscriptionCallback(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* renamed from: postSubscriptionChange-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2260postSubscriptionChange0E7RQCE(java.lang.String r15, boolean r16, X.HtJ<? super X.HsJ<com.facebook.aura.subscription.repo.ViewerChangeResponseJson>> r17) {
        /*
            r14 = this;
            r1 = r15
            r5 = r17
            boolean r0 = r5 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange$1
            if (r0 == 0) goto L7c
            r3 = r5
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange$1 r3 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange$1) r3
            int r4 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L7c
            int r4 = r4 - r2
            r3.label = r4
        L15:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L82
            java.lang.Object r1 = r3.L$0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = X.AnonymousClass001.A0q(r5)
        L28:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 == 0) goto L3d
            r0 = 18
            java.lang.String r0 = X.C60N.A00(r0)
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "subscription_change"
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r2, r1)
        L3d:
            return r3
        L3e:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r5)
            boolean r0 = com.facebook.aura.subscription.repo.SubscriptionBillingCapabilityKt.usesIacBilling()
            com.facebook.aura.subscription.repo.SubscriptionStefiPath$ViewerChange r9 = new com.facebook.aura.subscription.repo.SubscriptionStefiPath$ViewerChange
            r9.<init>(r0)
            com.facebook.aura.subscription.repo.ViewerChangeRequestJson r10 = new com.facebook.aura.subscription.repo.ViewerChangeRequestJson
            r10.<init>(r15)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r8 = 0
            r3.L$0 = r15
            r14 = 0
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r3.L$4 = r14
            r3.L$5 = r14
            r13 = r16
            r3.Z$0 = r13
            r3.Z$1 = r13
            r3.I$0 = r8
            r3.label = r2
            r15 = r8
            r16 = r14
            r17 = r3
            java.lang.Object r3 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != r4) goto L28
            return r4
        L7c:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange$1 r3 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postSubscriptionChange$1
            r3.<init>(r14, r5)
            goto L15
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.m2260postSubscriptionChange0E7RQCE(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.isCleared = true;
        this.refreshCommands.A6R(null);
        Hxb.A03(null, this.scope);
        this._subscriptionDetailsState.Af8(SubscriptionDetailsState.Unresolved.INSTANCE);
        AnonymousClass001.A1E(this._refreshQueued, null, false);
        AnonymousClass001.A1E(this._isSettlingPurchase, null, false);
        AnonymousClass001.A1E(this._provisioningPollExhausted, null, false);
        this.pendingPurchase.set(null);
        this.lastFetchedAtMs = null;
        this.isNameSatisfied = false;
    }

    public final C27k<Integer> drainCreditUsageAsync(CreditQuotaType creditQuotaType, int i) {
        C7384Etj.A0Y(creditQuotaType, 0);
        return AnonymousClass001.A10(new C141421(creditQuotaType, i, null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPaymentPortalUrl(X.HtJ<? super java.lang.String> r14) {
        /*
            r13 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141431
            if (r0 == 0) goto L63
            r14 = r3
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$1 r14 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141431) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L34
            if (r0 != r10) goto L70
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L23:
            java.lang.Throwable r1 = X.HsJ.A00(r0)
            if (r1 != 0) goto L6a
            com.facebook.aura.subscription.repo.ViewerPaymentPortalResponseJson r0 = (com.facebook.aura.subscription.repo.ViewerPaymentPortalResponseJson) r0
            java.lang.String r1 = r0.url
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L69
            return r11
        L34:
            com.facebook.aura.network.http.HatchHttpApi r2 = X.C60O.A06(r2)
            com.facebook.aura.subscription.repo.SubscriptionStefiPath$ViewerPaymentPortal r6 = com.facebook.aura.subscription.repo.SubscriptionStefiPath.ViewerPaymentPortal.INSTANCE
            java.lang.String r0 = "hatch://settings?section=subscriptions"
            com.facebook.aura.subscription.repo.ViewerPaymentPortalRequestJson r7 = new com.facebook.aura.subscription.repo.ViewerPaymentPortalRequestJson
            r7.<init>(r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r5 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.I$0 = r10
            r14.I$1 = r5
            r14.label = r10
            r12 = r5
            r13 = r11
            java.lang.Object r0 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L23
            return r1
        L63:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$1 r14 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchPaymentPortalUrl$1
            r14.<init>(r3)
            goto L13
        L69:
            return r1
        L6a:
            java.lang.String r0 = "fetch_payment_portal"
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r1, r11)
            return r11
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.fetchPaymentPortalUrl(X.HtJ):java.lang.Object");
    }

    public final void markNameSatisfied() {
        this.isNameSatisfied = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[PHI: r2
  0x0079: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:31:0x008a, B:24:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveViewerName(java.lang.String r13, java.lang.String r14, X.HtJ<? super com.facebook.aura.subscription.repo.SaveViewerNameResult> r15) {
        /*
            r12 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141531
            if (r0 == 0) goto L5d
            r15 = r3
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$1 r15 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141531) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r2 = r15.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 != r6) goto L97
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L22:
            java.lang.Throwable r4 = X.HsJ.A00(r0)
            if (r4 != 0) goto L63
            com.facebook.aura.subscription.repo.SaveViewerNameResult$Success r0 = com.facebook.aura.subscription.repo.SaveViewerNameResult.Success.INSTANCE
            return r0
        L2b:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r2)
            com.facebook.aura.subscription.repo.SubscriptionStefiPath$SetViewerName r7 = com.facebook.aura.subscription.repo.SubscriptionStefiPath.SetViewerName.INSTANCE
            com.facebook.aura.subscription.repo.ViewerNameRequestJson r8 = new com.facebook.aura.subscription.repo.ViewerNameRequestJson
            r8.<init>(r13, r14)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r13 = 0
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.L$6 = r12
            r15.I$0 = r6
            r15.I$1 = r13
            r15.label = r6
            r11 = r6
            r14 = r12
            java.lang.Object r0 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r1) goto L22
            return r1
        L5d:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$1 r15 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$saveViewerName$1
            r15.<init>(r3)
            goto L13
        L63:
            java.lang.String r0 = "save_viewer_name"
            r1 = 0
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r4, r1)
            com.facebook.aura.subscription.repo.HatchApiErrorJson r3 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.serverErrorBody(r4)
            if (r3 == 0) goto L89
            java.lang.String r2 = r3.detail
            if (r2 == 0) goto L89
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L89
        L79:
            java.lang.String r1 = r3.type
        L7b:
            java.lang.String r0 = "invalidName"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8d
            com.facebook.aura.subscription.repo.SaveViewerNameResult$InvalidName r0 = new com.facebook.aura.subscription.repo.SaveViewerNameResult$InvalidName
            r0.<init>(r2)
            return r0
        L89:
            r2 = r1
            if (r3 == 0) goto L7b
            goto L79
        L8d:
            java.lang.String r1 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.nameFailureReason(r4, r3)
            com.facebook.aura.subscription.repo.SaveViewerNameResult$Failed r0 = new com.facebook.aura.subscription.repo.SaveViewerNameResult$Failed
            r0.<init>(r2, r1)
            return r0
        L97:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.saveViewerName(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final AuraSubscriptionRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AuraSubscriptionRepository) abstractC3358CGz.A03(AuraSubscriptionRepository.class, new AuraSubscriptionRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public final AuraSubscriptionRepository createForTest(AbstractC3358CGz abstractC3358CGz, C3UX c3ux, Function0<Long> function0) {
            AnonymousClass005.A0x(abstractC3358CGz, c3ux, function0);
            return new AuraSubscriptionRepository(abstractC3358CGz, c3ux, function0);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* renamed from: applyChange-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2259applyChange0E7RQCE(java.lang.String r6, boolean r7, X.HtJ<? super X.HsJ<com.facebook.aura.subscription.repo.ViewerChangeResponseJson>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository$applyChange$1
            if (r0 == 0) goto L5e
            r4 = r8
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$applyChange$1 r4 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository$applyChange$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L4d
            if (r0 != r1) goto L64
            java.lang.Object r4 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r1 = r4 instanceof X.C10571Hud
            r0 = 0
            r3 = r4
            if (r1 == 0) goto L28
            r3 = r0
        L28:
            com.facebook.aura.subscription.repo.ViewerChangeResponseJson r3 = (com.facebook.aura.subscription.repo.ViewerChangeResponseJson) r3
            if (r3 == 0) goto L4c
            com.facebook.aura.subscription.repo.ViewerSubscriptionResponseJson r0 = r3.subscription
            if (r0 == 0) goto L49
            com.facebook.aura.subscription.repo.SubscriptionDetails r0 = r0.toDomain()
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r2 = new com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success
            r2.<init>(r0)
            X.HzR<com.facebook.aura.subscription.repo.RefreshCommand> r1 = r5.refreshCommands
            com.facebook.aura.subscription.repo.RefreshCommand$ApplyDetails r0 = new com.facebook.aura.subscription.repo.RefreshCommand$ApplyDetails
            r0.<init>(r2)
            r1.AhZ(r0)
            boolean r0 = r3.needsReread()
            if (r0 == 0) goto L4c
        L49:
            r5.refresh()
        L4c:
            return r4
        L4d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.Z$0 = r7
            r4.label = r1
            java.lang.Object r4 = r5.m2260postSubscriptionChange0E7RQCE(r6, r7, r4)
            if (r4 != r2) goto L21
            return r2
        L5e:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$applyChange$1 r4 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$applyChange$1
            r4.<init>(r5, r8)
            goto L12
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.m2259applyChange0E7RQCE(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDetailsAfterFetch(SubscriptionDetailsState subscriptionDetailsState) {
        String str;
        SubscriptionDetailsState success = subscriptionDetailsState;
        PendingPurchase pendingPurchase = this.pendingPurchase.get();
        boolean zIsSettledAfterPurchase = AuraSubscriptionRepositoryKt.isSettledAfterPurchase(success, pendingPurchase != null ? pendingPurchase.tierId : null);
        BLG<SubscriptionDetailsState> blg = this._subscriptionDetailsState;
        if (!zIsSettledAfterPurchase && pendingPurchase != null && (str = pendingPurchase.tierId) != null && (success instanceof SubscriptionDetailsState.Success)) {
            SubscriptionDetails subscriptionDetails = ((SubscriptionDetailsState.Success) success).details;
            if (!subscriptionDetails.isPaidTier) {
                HatchSubscriptionStatus hatchSubscriptionStatus = HatchSubscriptionStatus.PROVISIONING;
                String str2 = pendingPurchase.name;
                if (str2 == null) {
                    str2 = subscriptionDetails.planName;
                }
                success = new SubscriptionDetailsState.Success(SubscriptionDetails.copy$default(subscriptionDetails, null, null, null, hatchSubscriptionStatus, str2, str, null, true, false, false, null, null, 0, false, null, null, null, null, null, null, null, 0L, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -252154041, 63, null));
            }
        }
        blg.Af8(success);
    }

    private final void applyDetailsFetchResult(SubscriptionDetailsState subscriptionDetailsState) {
        if (subscriptionDetailsState != null) {
            applyDetailsAfterFetch(subscriptionDetailsState);
            this.lastFetchedAtMs = this.clockMs.invoke();
        } else if (this._subscriptionDetailsState.getValue() instanceof SubscriptionDetailsState.Unresolved) {
            this._subscriptionDetailsState.Af8(SubscriptionDetailsState.Failed.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitProvisioned(com.facebook.aura.subscription.repo.SubscriptionDetailsState r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141401
            if (r0 == 0) goto Lba
            r6 = r13
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$awaitProvisioned$1 r6 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141401) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lba
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r10 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L61
            if (r0 == r4) goto L52
            if (r0 != r5) goto Lc1
            int r1 = r6.I$1
            int r9 = r6.I$0
            java.lang.Object r3 = r6.L$2
            X.Hqv r3 = (X.C10543Hqv) r3
            java.lang.Object r8 = r6.L$1
            X.Hqv r8 = (X.C10543Hqv) r8
            X.Hwg.A00(r10)
        L2f:
            if (r10 != 0) goto L33
            T r10 = r8.element
        L33:
            r3.element = r10
            T r0 = r8.element
            com.facebook.aura.subscription.repo.SubscriptionDetailsState r0 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r0
            boolean r0 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.isProvisioning(r0)
            if (r0 == 0) goto L4f
            int r1 = r1 + 1
            if (r1 < r9) goto L81
            X.BLG<java.lang.Boolean> r0 = r11._provisioningPollExhausted
            X.AnonymousClass004.A1D(r4, r0)
            java.lang.String r1 = "AuraSubscriptionRepository"
            java.lang.String r0 = "Provisioning poll exhausted; agreement still PROVISIONING"
            X.CFK.A06(r1, r0)
        L4f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L51:
            return r7
        L52:
            int r2 = r6.I$2
            int r1 = r6.I$1
            int r9 = r6.I$0
            java.lang.Object r8 = r6.L$1
            X.Hqv r8 = (X.C10543Hqv) r8
            X.Hwg.A00(r10)
            r3 = r8
            goto L9c
        L61:
            X.Hwg.A00(r10)
            boolean r0 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.isProvisioning(r12)
            if (r0 == 0) goto L4f
            X.BLG<java.lang.Boolean> r0 = r11._isSettlingPurchase
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto L4f
            X.BLG<java.lang.Boolean> r1 = r11._provisioningPollExhausted
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
            X.Hqv r8 = X.C3cG.A0z()
            r8.element = r12
            r9 = 9
            r1 = 0
        L81:
            long r2 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.postPurchaseBackoffMs(r1)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r8
            r6.L$2 = r0
            r6.I$0 = r9
            r6.I$1 = r1
            r6.I$2 = r1
            r6.label = r4
            java.lang.Object r0 = X.C7Bq.A01(r2, r6)
            if (r0 == r7) goto L51
            r3 = r8
            r2 = r1
        L9c:
            X.BLG<java.lang.Boolean> r0 = r11._isSettlingPurchase
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto L4f
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r8
            r6.L$2 = r8
            r6.I$0 = r9
            r6.I$1 = r1
            r6.I$2 = r2
            r6.label = r5
            java.lang.Object r10 = r11.refreshInternal(r6)
            if (r10 != r7) goto L2f
            return r7
        Lba:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$awaitProvisioned$1 r6 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$awaitProvisioned$1
            r6.<init>(r13)
            goto L12
        Lc1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.awaitProvisioned(com.facebook.aura.subscription.repo.SubscriptionDetailsState, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchViewerCatalog(boolean r8, X.HtJ<? super com.facebook.aura.subscription.repo.ViewerCatalogResponseJson> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141471
            if (r0 == 0) goto L47
            r6 = r9
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$1 r6 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141471) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L4d
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2d
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            if (r1 == 0) goto L2d
            T r3 = r1.value
        L2d:
            return r3
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.viewerCatalogFetch
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1 r0 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1
            r0.<init>(r8, r3)
            r6.Z$0 = r8
            r6.label = r4
            java.lang.Object r1 = r2.invoke(r1, r0, r6)
            if (r1 != r5) goto L21
            return r5
        L47:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$1 r6 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$1
            r6.<init>(r9)
            goto L12
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.fetchViewerCatalog(boolean, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object fetchViewerCatalog$default(AuraSubscriptionRepository auraSubscriptionRepository, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auraSubscriptionRepository.isOnConfidentialVm();
        }
        return auraSubscriptionRepository.fetchViewerCatalog(z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postCreditDrain(com.facebook.aura.subscription.repo.CreditQuotaType r15, int r16, X.HtJ<? super java.lang.Integer> r17) {
        /*
            r14 = this;
            r3 = r16
            r6 = r17
            r1 = r15
            boolean r0 = r6 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141481
            if (r0 == 0) goto L75
            r4 = r6
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$1 r4 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141481) r4
            int r5 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L75
            int r5 = r5 - r2
            r4.label = r5
        L17:
            java.lang.Object r5 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r13 = 1
            if (r0 == 0) goto L3b
            if (r0 != r13) goto L8e
            int r3 = r4.I$0
            java.lang.Object r1 = r4.L$0
            com.facebook.aura.subscription.repo.CreditQuotaType r1 = (com.facebook.aura.subscription.repo.CreditQuotaType) r1
            java.lang.Object r0 = X.AnonymousClass001.A0q(r5)
        L2c:
            java.lang.Throwable r4 = X.HsJ.A00(r0)
            if (r4 != 0) goto L7b
            com.facebook.aura.subscription.repo.CreditDrainResponseJson r0 = (com.facebook.aura.subscription.repo.CreditDrainResponseJson) r0
            int r0 = r0.wallets_drained
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            return r0
        L3b:
            X.Hwg.A00(r5)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.subscription.repo.SubscriptionStefiPath$CreditDrain r9 = com.facebook.aura.subscription.repo.SubscriptionStefiPath.CreditDrain.INSTANCE
            java.lang.String r0 = r15.getWireValue()
            com.facebook.aura.subscription.repo.CreditDrainRequestJson r10 = new com.facebook.aura.subscription.repo.CreditDrainRequestJson
            r10.<init>(r0, r3)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r8 = 0
            r4.L$0 = r15
            r14 = 0
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.I$0 = r3
            r4.I$1 = r13
            r4.I$2 = r8
            r4.label = r13
            r15 = r8
            r16 = r14
            r17 = r4
            java.lang.Object r0 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 != r2) goto L2c
            return r2
        L75:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$1 r4 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$postCreditDrain$1
            r4.<init>(r6)
            goto L17
        L7b:
            java.lang.String r2 = r1.getWireValue()
            java.lang.String r1 = "quota="
            java.lang.String r0 = " percent="
            java.lang.String r1 = X.FGI.A0V(r1, r2, r0, r3)
            java.lang.String r0 = "credit_drain"
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r4, r1)
            r0 = 0
            return r0
        L8e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.postCreditDrain(com.facebook.aura.subscription.repo.CreditQuotaType, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b0 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c8 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcile(X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.reconcile(X.HtJ):java.lang.Object");
    }

    /* renamed from: refreshIfStale-LRDsOJo$default, reason: not valid java name */
    public static /* synthetic */ void m2261refreshIfStaleLRDsOJo$default(AuraSubscriptionRepository auraSubscriptionRepository, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS;
        }
        auraSubscriptionRepository.m2262refreshIfStaleLRDsOJo(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshInternal(X.HtJ<? super com.facebook.aura.subscription.repo.SubscriptionDetailsState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141521
            if (r0 == 0) goto L34
            r4 = r6
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$refreshInternal$1 r4 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141521) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L3e
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState r3 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r3
            boolean r0 = r5.isCleared
            if (r0 == 0) goto L3a
            r3 = 0
            return r3
        L28:
            X.Hwg.A00(r3)
            r4.label = r0
            java.lang.Object r3 = r5.fetchSubscriptionDetailsState(r4)
            if (r3 != r2) goto L20
            return r2
        L34:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$refreshInternal$1 r4 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$refreshInternal$1
            r4.<init>(r6)
            goto L12
        L3a:
            r5.applyDetailsFetchResult(r3)
            return r3
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.refreshInternal(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withdrawHomeLinkClaim() {
        SubscriptionManagementActions subscriptionManagementActions;
        SubscriptionDetails currentSubscriptionDetails = getCurrentSubscriptionDetails();
        if (currentSubscriptionDetails == null || (subscriptionManagementActions = currentSubscriptionDetails.managementActions) == null) {
            return;
        }
        BLG<SubscriptionDetailsState> blg = this._subscriptionDetailsState;
        AHD<SubscriptionManagementCta> ahd = subscriptionManagementActions.rows;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (!AuraSubscriptionRepositoryKt.isHomeLinkClaim((SubscriptionManagementCta) obj)) {
                arrayListA0h.add(obj);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        SubscriptionManagementCta subscriptionManagementCta = subscriptionManagementActions.primaryCta;
        if (subscriptionManagementCta == null || AuraSubscriptionRepositoryKt.isHomeLinkClaim(subscriptionManagementCta)) {
            subscriptionManagementCta = null;
        }
        C7384Etj.A0Y(ahdA07, 0);
        AnonymousClass001.A1E(blg, null, new SubscriptionDetailsState.Success(SubscriptionDetails.copy$default(currentSubscriptionDetails, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, null, null, null, null, null, 0L, false, false, null, null, null, new SubscriptionManagementActions(ahdA07, subscriptionManagementCta), null, null, false, null, null, null, null, null, null, null, -134217729, 63, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object activateComplimentarySubscription(java.lang.String r6, X.HtJ<? super com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141391
            if (r0 == 0) goto L3a
            r4 = r7
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$activateComplimentarySubscription$1 r4 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141391) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L45
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r0)
            if (r0 != 0) goto L40
            com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult$Redeemed r2 = com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult.Redeemed.INSTANCE
            return r2
        L2a:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            r0 = 0
            java.lang.Object r0 = r5.m2259applyChange0E7RQCE(r6, r0, r4)
            if (r0 != r2) goto L21
            return r2
        L3a:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$activateComplimentarySubscription$1 r4 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$activateComplimentarySubscription$1
            r4.<init>(r7)
            goto L12
        L40:
            com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult r2 = com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.redeemFailureOutcome(r0)
            return r2
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.activateComplimentarySubscription(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C27k<Boolean> cancelSubscriptionAsync() {
        return AnonymousClass001.A10(new C141411(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSubscriptionCatalog(boolean r6, X.HtJ<? super com.facebook.aura.subscription.repo.SubscriptionCatalog> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141441
            if (r0 == 0) goto L37
            r4 = r7
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionCatalog$1 r4 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141441) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3f
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.subscription.repo.ViewerCatalogResponseJson r3 = (com.facebook.aura.subscription.repo.ViewerCatalogResponseJson) r3
            if (r3 == 0) goto L3d
            com.facebook.aura.subscription.repo.SubscriptionCatalog r2 = r3.toCatalog()
            return r2
        L29:
            X.Hwg.A00(r3)
            r4.Z$0 = r6
            r4.label = r0
            java.lang.Object r3 = r5.fetchViewerCatalog(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L37:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionCatalog$1 r4 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionCatalog$1
            r4.<init>(r7)
            goto L12
        L3d:
            r2 = 0
            return r2
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.fetchSubscriptionCatalog(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSubscriptionDetailsState(X.HtJ<? super com.facebook.aura.subscription.repo.SubscriptionDetailsState> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141451
            if (r0 == 0) goto L5d
            r12 = r14
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$1 r12 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141451) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L6a
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r2 = X.HsJ.A00(r0)
            if (r2 != 0) goto L63
            com.facebook.aura.subscription.repo.ViewerSubscriptionResponseJson r0 = (com.facebook.aura.subscription.repo.ViewerSubscriptionResponseJson) r0
            com.facebook.aura.subscription.repo.SubscriptionDetails r0 = r0.toDomain()
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r2 = new com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success
            r2.<init>(r0)
            return r2
        L33:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            boolean r0 = com.facebook.aura.subscription.repo.SubscriptionBillingCapabilityKt.usesIacBilling()
            com.facebook.aura.network.api.StefiHatchPath$ViewerSubscription r6 = new com.facebook.aura.network.api.StefiHatchPath$ViewerSubscription
            r6.<init>(r0)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r1
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L21
            return r2
        L5d:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$1 r12 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchSubscriptionDetailsState$1
            r12.<init>(r14)
            goto L12
        L63:
            java.lang.String r1 = "fetch_subscription"
            r0 = 0
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r1, r2, r0)
            return r0
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.fetchSubscriptionDetailsState(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchTopUpCatalog(X.HtJ<? super com.facebook.aura.subscription.repo.TopUpCatalog> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141461
            if (r0 == 0) goto L3a
            r5 = r7
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchTopUpCatalog$1 r5 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141461) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 0
            r0 = 1
            if (r2 == 0) goto L2a
            if (r2 != r0) goto L40
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.subscription.repo.ViewerCatalogResponseJson r4 = (com.facebook.aura.subscription.repo.ViewerCatalogResponseJson) r4
            if (r4 == 0) goto L29
            com.facebook.aura.subscription.repo.TopUpCatalog r1 = r4.toTopUpCatalog()
        L29:
            return r1
        L2a:
            X.Hwg.A00(r4)
            r5.label = r0
            boolean r0 = r6.isOnConfidentialVm()
            java.lang.Object r4 = r6.fetchViewerCatalog(r0, r5)
            if (r4 != r3) goto L21
            return r3
        L3a:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchTopUpCatalog$1 r5 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchTopUpCatalog$1
            r5.<init>(r7)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.fetchTopUpCatalog(X.HtJ):java.lang.Object");
    }

    public final boolean getCanStartPurchase() {
        if (!AnonymousClass003.A1Z(this._isSettlingPurchase)) {
            SubscriptionDetails currentSubscriptionDetails = getCurrentSubscriptionDetails();
            if ((currentSubscriptionDetails != null ? currentSubscriptionDetails.subscriptionStatus : null) != HatchSubscriptionStatus.PROVISIONING) {
                return true;
            }
        }
        return false;
    }

    public final SubscriptionDetails getCurrentSubscriptionDetails() {
        SubscriptionDetailsState.Success success;
        SubscriptionDetailsState value = this._subscriptionDetailsState.getValue();
        if (!(value instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) value) == null) {
            return null;
        }
        return success.details;
    }

    public final C1BN<Boolean> getProvisioningPollExhausted() {
        return this.provisioningPollExhausted;
    }

    public final C1BN<SubscriptionDetailsState> getSubscriptionDetailsState() {
        return this.subscriptionDetailsState;
    }

    public final boolean isNameSatisfied() {
        return this.isNameSatisfied;
    }

    public final boolean isOnConfidentialVm() {
        return ConfidentialSessionGate.Companion.getInstance(this.userSession).isConfidentialVm();
    }

    public final C1BN<Boolean> isSettlingPurchase() {
        return this.isSettlingPurchase;
    }

    public final void notifyHomeLinkOrderPlaced() {
        if (this.isCleared) {
            return;
        }
        this.refreshCommands.AhZ(RefreshCommand.WithdrawHomeLinkClaim.INSTANCE);
    }

    public final void notifyPurchaseCompleted(String str, String str2) {
        BLG<Boolean> blg = this._isSettlingPurchase;
        Boolean boolA0h = AnonymousClass001.A0h();
        if (C9286GCn.A00(boolA0h, AnonymousClass001.A0i(), (C9286GCn) blg)) {
            this.pendingPurchase.set(new PendingPurchase(str, str2));
            if (this.refreshCommands.AhZ(RefreshCommand.PostPurchase.INSTANCE) instanceof C2zT) {
                this.pendingPurchase.set(null);
                AnonymousClass001.A1E(this._isSettlingPurchase, null, boolA0h);
            }
        }
    }

    public final C27k<Boolean> reactivateSubscriptionAsync() {
        return AnonymousClass001.A10(new C141491(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object redeemComplimentarySubscription(X.HtJ<? super com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult> r25) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.redeemComplimentarySubscription(X.HtJ):java.lang.Object");
    }

    public final void refresh() {
        if (C9286GCn.A00(AnonymousClass001.A0h(), AnonymousClass001.A0i(), (C9286GCn) this._refreshQueued)) {
            this.refreshCommands.AhZ(RefreshCommand.Refresh.INSTANCE);
        }
    }

    /* renamed from: refreshIfStale-LRDsOJo, reason: not valid java name */
    public final void m2262refreshIfStaleLRDsOJo(long j) {
        Long l = this.lastFetchedAtMs;
        if (l == null || C8j4.A0Q(this.clockMs) - l.longValue() >= C0851A5x.A02(j)) {
            refresh();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitSubscriptionCallback(java.lang.String r24, X.HtJ<? super kotlin.Unit> r25) {
        /*
            r23 = this;
            r1 = r24
            r5 = r25
            boolean r0 = r5 instanceof com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141541
            r6 = r23
            if (r0 == 0) goto L28
            r0 = r5
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$1 r0 = (com.facebook.aura.subscription.repo.AuraSubscriptionRepository.C141541) r0
            int r4 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L28
            int r4 = r4 - r3
            r0.label = r4
        L18:
            java.lang.Object r4 = r0.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r3 = r0.label
            r15 = 1
            if (r3 == 0) goto L37
            if (r3 != r15) goto L32
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            goto L2e
        L28:
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$1 r0 = new com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$1
            r0.<init>(r5)
            goto L18
        L2e:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L91
            goto L9d
        L32:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L37:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> L91
            com.facebook.aura.subscription.repo.SubscriptionJarvisPath$SubscriptionCallback r7 = com.facebook.aura.subscription.repo.SubscriptionJarvisPath.SubscriptionCallback.INSTANCE     // Catch: java.lang.Exception -> L91
            com.facebook.aura.subscription.repo.SubscriptionCallbackRequestJson r8 = new com.facebook.aura.subscription.repo.SubscriptionCallbackRequestJson     // Catch: java.lang.Exception -> L91
            r8.<init>(r1)     // Catch: java.lang.Exception -> L91
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> L91
            X.CGz r10 = r6.userSession     // Catch: java.lang.Exception -> L91
            r6 = 0
            X.HxE[] r13 = new X.HxE[r6]     // Catch: java.lang.Exception -> L91
            java.util.Set r14 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> L91
            X.9jH r17 = X.C9jH.A00     // Catch: java.lang.Exception -> L91
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE     // Catch: java.lang.Exception -> L91
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$submitSubscriptionCallback$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE     // Catch: java.lang.Exception -> L91
            r0.L$0 = r1     // Catch: java.lang.Exception -> L91
            r11 = 0
            r0.L$1 = r11     // Catch: java.lang.Exception -> L91
            r0.L$2 = r11     // Catch: java.lang.Exception -> L91
            r0.L$3 = r11     // Catch: java.lang.Exception -> L91
            r0.L$4 = r11     // Catch: java.lang.Exception -> L91
            r0.L$5 = r11     // Catch: java.lang.Exception -> L91
            r0.L$6 = r11     // Catch: java.lang.Exception -> L91
            r0.L$7 = r11     // Catch: java.lang.Exception -> L91
            r0.L$8 = r11     // Catch: java.lang.Exception -> L91
            r0.I$0 = r15     // Catch: java.lang.Exception -> L91
            r0.I$1 = r15     // Catch: java.lang.Exception -> L91
            r0.I$2 = r6     // Catch: java.lang.Exception -> L91
            r0.I$3 = r15     // Catch: java.lang.Exception -> L91
            r0.I$4 = r6     // Catch: java.lang.Exception -> L91
            r0.I$5 = r6     // Catch: java.lang.Exception -> L91
            r0.I$6 = r6     // Catch: java.lang.Exception -> L91
            r0.label = r15     // Catch: java.lang.Exception -> L91
            r12 = r11
            r16 = r15
            r18 = r11
            r19 = r6
            r20 = r15
            r21 = r6
            r22 = r6
            r23 = r11
            r24 = r6
            r25 = r0
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Exception -> L91
            if (r0 != r2) goto L9d
            return r2
        L91:
            r2 = move-exception
            java.lang.String r0 = "result="
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "subscription_callback"
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r2, r1)
        L9d:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.submitSubscriptionCallback(java.lang.String, X.HtJ):java.lang.Object");
    }

    public AuraSubscriptionRepository(AbstractC3358CGz abstractC3358CGz, C3UX c3ux, Function0<Long> function0) {
        this.userSession = abstractC3358CGz;
        this.scope = c3ux;
        this.clockMs = function0;
        this._refreshQueued = C3cG.A14(false);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isSettlingPurchase = c9286GCnA14;
        this.isSettlingPurchase = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._provisioningPollExhausted = c9286GCnA142;
        this.provisioningPollExhausted = C3cG.A11(c9286GCnA142);
        Integer num = C79.A00;
        this.refreshCommands = new GCV(Integer.MAX_VALUE, null);
        C9286GCn c9286GCnA01 = HnJ.A01(SubscriptionDetailsState.Unresolved.INSTANCE);
        this._subscriptionDetailsState = c9286GCnA01;
        this.subscriptionDetailsState = C3cG.A11(c9286GCnA01);
        this.pendingPurchase = new AtomicReference<>(null);
        C8j3.A1I(num, new AnonymousClass1(null), c3ux);
        C3pU.A02(c3ux, new C10650I0u(new AnonymousClass3(null), GDB.A01(new AuraSubscriptionRepository$special$$inlined$map$1(HatchGatewayConnection.Companion.getInstance(abstractC3358CGz).getAgentStatusEvents())), 5));
        this.viewerCatalogFetch = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String bugReportSummary() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository.bugReportSummary():java.lang.String");
    }

    public final boolean isOutOfVoiceCredits() {
        SubscriptionDetails currentSubscriptionDetails = getCurrentSubscriptionDetails();
        return currentSubscriptionDetails != null && currentSubscriptionDetails.isOutOfCredits && HatchUtil.INSTANCE.isSubscriptionEnabled();
    }

    public /* synthetic */ AuraSubscriptionRepository(AbstractC3358CGz abstractC3358CGz, C3UX c3ux, Function0 function0, C06H c06h) {
        this(abstractC3358CGz, c3ux, function0);
    }
}
