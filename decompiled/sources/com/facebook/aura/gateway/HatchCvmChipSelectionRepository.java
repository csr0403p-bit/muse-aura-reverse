package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.C3UX;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.gateway.store.HatchCvmChipClaim;
import com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition;
import com.facebook.aura.gateway.store.HatchCvmChipClaimStore;
import com.facebook.aura.gateway.store.HatchCvmChipSelectionBudget;
import java.security.SecureRandom;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchCvmChipSelectionRepository {
    public static final int $stable = 0;
    public static final long ACCEPTED_REBID_INTERVAL_MS = 60000;
    public static final String EVENT_CVM_CHIP_BID = "cvm_chip_selection_bid";
    public static final long MAX_ALLOWLIST_AGE_MS = 259200000;
    public static final int MAX_CANDIDATE_CHIPS = 30;
    public static final int NONCE_LENGTH_BYTES = 16;
    public static final String REASON_BUDGET_EXHAUSTED = "budget_exhausted";
    public static final String REASON_CLAIM_WRITE_FAILED = "claim_write_failed";
    public static final String REASON_NO_ALLOWLIST = "no_allowlist";
    public static final String TAG = "HatchCvmChipSelectionRepository";
    public static final HatchCvmChipSelectionRepository INSTANCE = new HatchCvmChipSelectionRepository();
    public static final SecureRandom SECURE_RANDOM = new SecureRandom();

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmChipSelectionRepository$bid$2", f = "HatchCvmChipSelectionRepository.kt", l = {69, 435}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmChipSelectionRepository$bid$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCvmChipSelectionOutcome>, Object> {
        public final /* synthetic */ String $attemptId;
        public final /* synthetic */ byte[] $hostData;
        public final /* synthetic */ boolean $logsBudgetStop;
        public final /* synthetic */ HatchCvmChipPinPurpose $purpose;
        public final /* synthetic */ HatchCvmChipBidTrigger $trigger;
        public final /* synthetic */ String $vmId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byte[] bArr, String str, String str2, HatchCvmChipPinPurpose hatchCvmChipPinPurpose, HatchCvmChipBidTrigger hatchCvmChipBidTrigger, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$hostData = bArr;
            this.$attemptId = str;
            this.$vmId = str2;
            this.$purpose = hatchCvmChipPinPurpose;
            this.$trigger = hatchCvmChipBidTrigger;
            this.$logsBudgetStop = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$hostData, this.$attemptId, this.$vmId, this.$purpose, this.$trigger, this.$logsBudgetStop, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmChipSelectionRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchCvmChipSelectionOutcome> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmChipSelectionRepository", f = "HatchCvmChipSelectionRepository.kt", l = {432}, m = "fetchVerifiedAllowlist", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return HatchCvmChipSelectionRepository.this.fetchVerifiedAllowlist(null, this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchCvmChipSelectionRepository$mintNonce$1, reason: invalid class name and case insensitive filesystem */
    public final class C120611 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final C120611 INSTANCE = new C120611();

        public C120611() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Integer.valueOf(b & 255));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmChipSelectionRepository", f = "HatchCvmChipSelectionRepository.kt", l = {195}, m = "resolveClaim", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmChipSelectionRepository$resolveClaim$1, reason: invalid class name and case insensitive filesystem */
    public final class C120621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C120621(HtJ<? super C120621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCvmChipSelectionRepository.this.resolveClaim(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logBidOutcome(HatchCvmChipSelectionResponseClass hatchCvmChipSelectionResponseClass) {
        HatchClientCvmOutcome hatchClientCvmOutcome;
        int iOrdinal;
        if (hatchCvmChipSelectionResponseClass == null || (iOrdinal = hatchCvmChipSelectionResponseClass.ordinal()) == -1) {
            hatchClientCvmOutcome = HatchClientCvmOutcome.FAILURE;
        } else if (iOrdinal == 1) {
            hatchClientCvmOutcome = HatchClientCvmOutcome.SUCCESS;
        } else {
            if (iOrdinal == 2) {
                return;
            }
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 0) {
                throw C3cG.A0q();
            }
            hatchClientCvmOutcome = HatchClientCvmOutcome.FAILURE;
        }
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBid(hatchClientCvmOutcome);
    }

    public final boolean isStoppedByBudget(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, String str, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(hatchCvmChipPinPurpose, str, str2);
        if (storedClaimForAttempt(str, str2) == null && HatchCvmChipSelectionBudget.INSTANCE.isSpent(hatchCvmChipPinPurpose, str)) {
            return zA1Z;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCvmChipSelectionResponseClass.values().length];
            try {
                AnonymousClass002.A13(HatchCvmChipSelectionResponseClass.ACCEPTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCvmChipSelectionResponseClass.STAND_DOWN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCvmChipSelectionResponseClass.RETRY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCvmChipSelectionResponseClass.FATAL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchCvmChipSelectionResponseClass.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchVerifiedAllowlist(java.lang.String r14, X.HtJ<? super com.facebook.aura.gateway.ChipAllowlistFetch> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchCvmChipSelectionRepository.AnonymousClass1
            if (r0 == 0) goto Lb4
            r12 = r15
            com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$1 r12 = (com.facebook.aura.gateway.HatchCvmChipSelectionRepository.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L8d
            if (r1 != r0) goto Lbb
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L22:
            java.lang.Throwable r1 = X.HsJ.A00(r3)
            java.lang.String r4 = "HatchCvmChipSelectionRepository"
            if (r1 == 0) goto L2f
            java.lang.String r0 = "Chip allowlist fetch failed"
            X.CFK.A0A(r4, r0, r1)
        L2f:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L34
            r3 = 0
        L34:
            com.facebook.aura.gateway.ChipAllowlistResponseJson r3 = (com.facebook.aura.gateway.ChipAllowlistResponseJson) r3
            java.lang.String r1 = "no_allowlist"
            if (r3 == 0) goto L64
            com.facebook.aura.gateway.noise.carrier.HatchChipAllowlistVerifier r5 = com.facebook.aura.gateway.noise.carrier.HatchChipAllowlistVerifier.INSTANCE
            java.lang.String r6 = r3.chip_allowlist
            java.lang.String r7 = r3.proof_signature
            java.lang.String r8 = r3.proof_serialized_message
            java.lang.String r9 = r3.next_proof_signature
            java.lang.String r10 = r3.next_proof_serialized_message
            boolean r0 = com.facebook.aura.common.prefs.HatchDeveloperPrefs.cachedIsFeedEnabled
            com.facebook.aura.gateway.noise.carrier.HatchChipAllowlistTransparencyPolicy r11 = com.facebook.aura.gateway.noise.carrier.HatchChipAllowlistTransparencyPolicy.STAGING
            r12 = 259200000(0xf731400, double:1.280618154E-315)
            com.facebook.aura.gateway.noise.carrier.HatchChipAllowlistVerdict r5 = r5.verify(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r5.rejection
            int r0 = r2.length()
            if (r0 <= 0) goto L6a
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Chip allowlist rejected: %s"
            X.CFK.A0H(r4, r0, r1)
            java.lang.String r1 = r5.rejection
        L64:
            com.facebook.aura.gateway.ChipAllowlistFetch$Unavailable r2 = new com.facebook.aura.gateway.ChipAllowlistFetch$Unavailable
            r2.<init>(r1)
            return r2
        L6a:
            java.lang.String[] r0 = r5.chipIds
            int r0 = r0.length
            if (r0 == 0) goto L64
            java.lang.Integer r2 = X.C3cG.A0R(r0)
            java.lang.String r1 = r3.version
            java.lang.String r0 = "Chip allowlist verified: chips=%d version=%s"
            X.CFK.A02(r2, r1, r4, r0)
            java.lang.String[] r0 = r5.chipIds
            java.util.List r2 = X.BFI.A0G(r0)
            java.lang.String r0 = r3.version
            com.facebook.aura.gateway.HatchChipAllowlist r1 = new com.facebook.aura.gateway.HatchChipAllowlist
            r1.<init>(r2, r0)
            com.facebook.aura.gateway.ChipAllowlistFetch$Verified r0 = new com.facebook.aura.gateway.ChipAllowlistFetch$Verified
            r0.<init>(r1)
            return r0
        L8d:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$CvmChipAllowlist r6 = new com.facebook.aura.network.api.StefiHatchPath$CvmChipAllowlist
            r6.<init>(r14)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.L$5 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r3 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L22
            return r2
        Lb4:
            com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$1 r12 = new com.facebook.aura.gateway.HatchCvmChipSelectionRepository$fetchVerifiedAllowlist$1
            r12.<init>(r15)
            goto L12
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmChipSelectionRepository.fetchVerifiedAllowlist(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void logBidFailure(String str) {
        HatchAppEventLogger.INSTANCE.logEvent(EVENT_CVM_CHIP_BID, HatchSurface.STATUS.getValue(), null, HatchEventType.STATUS_CHECK.getValue(), EVENT_CVM_CHIP_BID, AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str), null);
    }

    private final String mintNonce() {
        byte[] bArr = new byte[16];
        SECURE_RANDOM.nextBytes(bArr);
        return BFI.A0C("", C120611.INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveClaim(com.facebook.aura.common.HatchCvmChipPinPurpose r15, java.lang.String r16, java.lang.String r17, com.facebook.aura.gateway.HatchCvmChipBidTrigger r18, com.facebook.aura.gateway.ChipBudgetLogging r19, X.HtJ<? super com.facebook.aura.gateway.ResolvedChipClaim> r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmChipSelectionRepository.resolveClaim(com.facebook.aura.common.HatchCvmChipPinPurpose, java.lang.String, java.lang.String, com.facebook.aura.gateway.HatchCvmChipBidTrigger, com.facebook.aura.gateway.ChipBudgetLogging, X.HtJ):java.lang.Object");
    }

    private final HatchCvmChipClaim storedClaimForAttempt(String str, String str2) {
        HatchCvmChipClaim hatchCvmChipClaim = HatchCvmChipClaimStore.INSTANCE.read(str);
        if ((hatchCvmChipClaim != null ? hatchCvmChipClaim.getPurpose() : null) != HatchCvmChipPinPurpose.HARD_REPLACEMENT || !C7384Etj.areEqual(hatchCvmChipClaim.attemptId, str2)) {
            return null;
        }
        if (hatchCvmChipClaim.disposition != HatchCvmChipClaimDisposition.FATAL || hatchCvmChipClaim.bidsWithHostData) {
            return hatchCvmChipClaim;
        }
        CFK.A02(str2, HatcheryVMIdUtilsKt.vmIdForLog(str), TAG, "CVM chip-selection: discarding FATAL claim from a bid without host_data: attempt=%s vm=%s");
        return null;
    }

    private final ResolvedChipClaim stopOnSpentBudget(String str, ChipBudgetLogging chipBudgetLogging) {
        CFK.A0H(TAG, "bid: chip-selection budget spent for attempt %s; not bidding", str);
        logBidFailure(REASON_BUDGET_EXHAUSTED);
        chipBudgetLogging.budgetExhausted(null);
        return null;
    }

    public final Object bid(String str, String str2, byte[] bArr, HatchCvmChipPinPurpose hatchCvmChipPinPurpose, HatchCvmChipBidTrigger hatchCvmChipBidTrigger, boolean z, HtJ<? super HatchCvmChipSelectionOutcome> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(bArr, str2, str, hatchCvmChipPinPurpose, hatchCvmChipBidTrigger, z, null));
    }
}
