package com.facebook.aura.gateway;

import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.gateway.intf.LinkedDeviceVm;
import com.facebook.aura.gateway.intf.LinkedDeviceVmSource;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.gateway.store.VmEntryV2JsonKt;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchVmRepository {
    public static final int $stable = 0;
    public static final HatchVmRepository INSTANCE = new HatchVmRepository();

    public final class ExistingVmFetch implements InterfaceC7549F2g {
        public final SingleFlight singleFlight;

        public ExistingVmFetch(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        }

        @Override // X.InterfaceC7549F2g
        public void clearUserData() {
            this.singleFlight.clearAndCancelAll();
        }

        public final SingleFlight getSingleFlight() {
            return this.singleFlight;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {1054, 485}, m = "enableVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$enableVm$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.enableVm(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {309, 311}, m = "fetchAndCacheExistingVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$fetchAndCacheExistingVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121321 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121321(HtJ<? super C121321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.fetchAndCacheExistingVm(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {324}, m = "fetchExistingVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121331 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121331(HtJ<? super C121331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.fetchExistingVm(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {MC.mwa_accounts_center_3p_link.__CONFIG__, 407, HatchTransportHttpDataSourceKt.HTTP_RANGE_NOT_SATISFIABLE, 434}, m = "fetchOrLeaseReplacementVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$fetchOrLeaseReplacementVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121341 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C121341(HtJ<? super C121341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.fetchOrLeaseReplacementVm(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {785}, m = "handleVmResponse", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$handleVmResponse$1, reason: invalid class name and case insensitive filesystem */
    public final class C121351 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C121351(HtJ<? super C121351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.handleVmResponse(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {501}, m = "leaseAndCacheVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121361 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121361(HtJ<? super C121361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.leaseAndCacheVm(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {536}, m = "replaceAndCacheVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121371 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C121371(HtJ<? super C121371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.replaceAndCacheVm(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {685, 687}, m = "requestAndCacheVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$requestAndCacheVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121381 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C121381(HtJ<? super C121381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.requestAndCacheVm(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository", f = "HatchVmRepository.kt", l = {910, 913}, m = "saveForRestart", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmRepository$saveForRestart$1, reason: invalid class name and case insensitive filesystem */
    public final class C121391 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121391(HtJ<? super C121391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRepository.this.saveForRestart(null, null, this);
        }
    }

    private final FetchAndCacheLeasedVmResult.Failure missingAccessTokenFailure(AbstractC3358CGz abstractC3358CGz) {
        String str = CH0.A01((CH0) abstractC3358CGz).A04;
        if (str != null && str.length() != 0) {
            return null;
        }
        CFK.A04(HatchVmRepositoryKt.TAG, "No access token available, skipping VM request");
        HatchVmAvailabilityStore.Companion.getInstance(abstractC3358CGz).clearError();
        return new FetchAndCacheLeasedVmResult.Failure(HatchVmRepositoryKt.ERROR_TYPE_MISSING_ACCESS_TOKEN, "missing_user_access_token", null, null, null, null, false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestAndCacheVm(X.AbstractC3358CGz r11, com.facebook.aura.gateway.VmFetchSource r12, X.G0U<? super X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>>, ? extends java.lang.Object> r13, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r14) {
        /*
            r10 = this;
            r8 = r12
            r6 = r11
            boolean r0 = r14 instanceof com.facebook.aura.gateway.HatchVmRepository.C121381
            if (r0 == 0) goto L71
            r9 = r14
            com.facebook.aura.gateway.HatchVmRepository$requestAndCacheVm$1 r9 = (com.facebook.aura.gateway.HatchVmRepository.C121381) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r9.label = r2
        L14:
            java.lang.Object r0 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r4 = r9.label
            r2 = 2
            r1 = 1
            if (r4 == 0) goto L26
            if (r4 == r1) goto L41
            if (r4 != r2) goto L77
            X.Hwg.A00(r0)
        L25:
            return r0
        L26:
            X.Hwg.A00(r0)
            com.facebook.aura.gateway.HatchVmAvailabilityStore$Companion r0 = com.facebook.aura.gateway.HatchVmAvailabilityStore.Companion
            com.facebook.aura.gateway.HatchVmAvailabilityStore r7 = r0.getInstance(r11)
            r9.L$0 = r11
            r9.L$1 = r12
            r0 = 0
            r9.L$2 = r0
            r9.L$3 = r7
            r9.label = r1
            java.lang.Object r0 = r13.invoke(r9)
            if (r0 != r3) goto L4f
            return r3
        L41:
            java.lang.Object r7 = r9.L$3
            com.facebook.aura.gateway.HatchVmAvailabilityStore r7 = (com.facebook.aura.gateway.HatchVmAvailabilityStore) r7
            java.lang.Object r8 = r9.L$1
            com.facebook.aura.gateway.VmFetchSource r8 = (com.facebook.aura.gateway.VmFetchSource) r8
            java.lang.Object r1 = r9.L$0
            X.CGz r6 = X.C60O.A0D(r1, r0)
        L4f:
            X.HsJ r0 = (X.HsJ) r0
            java.lang.Object r5 = r0.value
            java.lang.Throwable r1 = X.HsJ.A00(r5)
            if (r1 != 0) goto L7c
            com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson r5 = (com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson) r5
            com.facebook.aura.gateway.HatchVmRepository r4 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r9.L$4 = r0
            r9.label = r2
            java.lang.Object r0 = r4.handleVmResponse(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L25
            return r3
        L71:
            com.facebook.aura.gateway.HatchVmRepository$requestAndCacheVm$1 r9 = new com.facebook.aura.gateway.HatchVmRepository$requestAndCacheVm$1
            r9.<init>(r14)
            goto L14
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7c:
            com.facebook.aura.gateway.HatchVmRepository r0 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r3 = r0.handleVmFailure(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.requestAndCacheVm(X.CGz, com.facebook.aura.gateway.VmFetchSource, X.G0U, X.HtJ):java.lang.Object");
    }

    public final Set<String> cachedConfidentialVmUrls(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        List<VmEntryV2Json> listDecodeCachedVmList = VmEntryV2JsonKt.decodeCachedVmList(HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getCachedVmListJson());
        ArrayList arrayListA0h = C3cG.A0h();
        for (VmEntryV2Json vmEntryV2Json : listDecodeCachedVmList) {
            if (HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json.vm_type) == HatchlingVmType.HATCH_CVM) {
                arrayListA0h.add(vmEntryV2Json);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            String strA0l = AnonymousClass002.A0l(((VmEntryV2Json) it.next()).vm_ws_url);
            if (strA0l.length() > 0) {
                arrayListA0h2.add(strA0l);
            }
        }
        return AbstractC0878AGe.A0g(arrayListA0h2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* renamed from: destroyAndReleaseVm-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m964destroyAndReleaseVmgIAlus(java.lang.String r14, X.HtJ<? super X.HsJ<java.lang.Boolean>> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm$1
            if (r0 == 0) goto L69
            r15 = r3
            com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm$1 r15 = (com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm$1) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r1 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r11 = 1
            if (r0 == 0) goto L31
            if (r0 != r11) goto L6f
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L22:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L30
            com.facebook.aura.gateway.DestroyAndReleaseVMResponseJson r1 = (com.facebook.aura.gateway.DestroyAndReleaseVMResponseJson) r1
            boolean r0 = r1.success
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L30:
            return r1
        L31:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r1)
            com.facebook.aura.network.api.StefiHatchPath$DestroyAndReleaseVm r7 = com.facebook.aura.network.api.StefiHatchPath.DestroyAndReleaseVm.INSTANCE
            com.facebook.aura.gateway.DestroyAndReleaseVMRequestJson r8 = new com.facebook.aura.gateway.DestroyAndReleaseVMRequestJson
            r8.<init>(r14)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Long r14 = X.C3cG.A0S(r0)
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r6 = 0
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.L$6 = r12
            r15.I$0 = r11
            r15.I$1 = r6
            r15.label = r11
            r13 = r6
            java.lang.Object r1 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L22
            return r2
        L69:
            com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm$1 r15 = new com.facebook.aura.gateway.HatchVmRepository$destroyAndReleaseVm$1
            r15.<init>(r13, r3)
            goto L13
        L6f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m964destroyAndReleaseVmgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LinkedDeviceVm.values().length];
            try {
                AnonymousClass005.A0v(LinkedDeviceVm.CURRENT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(LinkedDeviceVm.NONE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LinkedDeviceVm.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchlingVmType.values().length];
            try {
                AnonymousClass005.A0v(HatchlingVmType.HATCH_CVM, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchlingVmType.HATCH_VM, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final Throwable asReplaceRefusalOrSelf(Throwable th) {
        HatchProblemJson hatchProblemJsonHatchProblemOf;
        return (!(th instanceof NetworkException) || th == null || (hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(th.getMessage())) == null) ? th : (HatchVmRepositoryKt.TERMINAL_REPLACE_REFUSALS.contains(hatchProblemJsonHatchProblemOf.type) || HatchVmRepositoryKt.CVM_COLD_LEASE_VM_LIMIT.equals(hatchProblemJsonHatchProblemOf.error_code)) ? new VmReplaceRefusedException(hatchProblemJsonHatchProblemOf.type) : th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchExistingVm(X.AbstractC3358CGz r7, com.facebook.aura.gateway.VmFetchSource r8, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchVmRepository.C121331
            if (r0 == 0) goto L5b
            r5 = r9
            com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$1 r5 = (com.facebook.aura.gateway.HatchVmRepository.C121331) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L61
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult>"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
        L2b:
            return r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r0 = r6.missingAccessTokenFailure(r7)
            if (r0 != 0) goto L2b
            com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$fetch$1 r1 = new com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$fetch$1
            r1.<init>(r7)
            java.lang.Class<com.facebook.aura.gateway.HatchVmRepository$ExistingVmFetch> r0 = com.facebook.aura.gateway.HatchVmRepository.ExistingVmFetch.class
            java.lang.Object r0 = r7.A03(r0, r1)
            com.facebook.aura.gateway.HatchVmRepository$ExistingVmFetch r0 = (com.facebook.aura.gateway.HatchVmRepository.ExistingVmFetch) r0
            com.facebook.aura.common.coroutines.SingleFlight r2 = r0.singleFlight
            r0 = 0
            com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$result$1 r1 = new com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$result$1
            r1.<init>(r7, r8, r0)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L5b:
            com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$1 r5 = new com.facebook.aura.gateway.HatchVmRepository$fetchExistingVm$1
            r5.<init>(r9)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.fetchExistingVm(X.CGz, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b A[LOOP:2: B:105:0x0285->B:107:0x028b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e7 A[PHI: r1 r3 r8
  0x03e7: PHI (r1v38 com.facebook.aura.gateway.HatchlingVmType) = 
  (r1v64 com.facebook.aura.gateway.HatchlingVmType)
  (r1v65 com.facebook.aura.gateway.HatchlingVmType)
  (r1v66 com.facebook.aura.gateway.HatchlingVmType)
 binds: [B:153:0x03fd, B:143:0x03d7, B:147:0x03e5] A[DONT_GENERATE, DONT_INLINE]
  0x03e7: PHI (r3v5 ??) = (r3v7 ??), (r3v8 ??), (r3v8 ??) binds: [B:153:0x03fd, B:143:0x03d7, B:147:0x03e5] A[DONT_GENERATE, DONT_INLINE]
  0x03e7: PHI (r8v6 java.lang.Object) = (r8v19 java.lang.Object), (r8v20 java.lang.Object), (r8v21 java.lang.Object) binds: [B:153:0x03fd, B:143:0x03d7, B:147:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c A[LOOP:0: B:91:0x0246->B:93:0x024c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0267  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.facebook.aura.gateway.HatchVmRepository] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.facebook.aura.gateway.HatchVmState] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleVmResponse(com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson r20, X.AbstractC3358CGz r21, com.facebook.aura.gateway.HatchVmAvailabilityStore r22, com.facebook.aura.gateway.VmFetchSource r23, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r24) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.handleVmResponse(com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson, X.CGz, com.facebook.aura.gateway.HatchVmAvailabilityStore, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: leaseConfidentialVm-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m960leaseConfidentialVmgIAlus(X.AbstractC3358CGz r6, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchVmRepository$leaseConfidentialVm$1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.gateway.HatchVmRepository$leaseConfidentialVm$1 r4 = (com.facebook.aura.gateway.HatchVmRepository$leaseConfidentialVm$1) r4
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
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L29
            goto L24
        L1e:
            com.facebook.aura.gateway.HatchVmRepository$leaseConfidentialVm$1 r4 = new com.facebook.aura.gateway.HatchVmRepository$leaseConfidentialVm$1
            r4.<init>(r5, r7)
            goto L12
        L24:
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.CancellationException -> L50
            goto L42
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L3d java.util.concurrent.CancellationException -> L50
            r4.label = r1     // Catch: java.lang.Throwable -> L3d java.util.concurrent.CancellationException -> L50
            java.lang.Object r3 = com.facebook.aura.gateway.HatchColdCvmLeaseKt.leaseCvmCold(r6, r4)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.CancellationException -> L50
            if (r3 != r2) goto L42
            return r2
        L3d:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        L42:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 == 0) goto L4f
            java.lang.String r1 = "HatchVmRepository"
            java.lang.String r0 = "Cold CVM lease failed"
            X.CFK.A0A(r1, r0, r2)
        L4f:
            return r3
        L50:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m960leaseConfidentialVmgIAlus(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* renamed from: leaseVm-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m961leaseVmgIAlus(com.facebook.aura.gateway.HatchlingVmType r22, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r23) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m961leaseVmgIAlus(com.facebook.aura.gateway.HatchlingVmType, X.HtJ):java.lang.Object");
    }

    private final LinkedDeviceVmSource linkedDeviceVmSource() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* renamed from: replaceVm-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m962replaceVmBWLJW6A(X.AbstractC3358CGz r22, java.lang.String r23, com.facebook.aura.gateway.HatchlingVmType r24, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m962replaceVmBWLJW6A(X.CGz, java.lang.String, com.facebook.aura.gateway.HatchlingVmType, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: requestFetchVms-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m963requestFetchVmsIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.gateway.HatchVmRepository$requestFetchVms$1
            if (r0 == 0) goto L45
            r12 = r14
            com.facebook.aura.gateway.HatchVmRepository$requestFetchVms$1 r12 = (com.facebook.aura.gateway.HatchVmRepository$requestFetchVms$1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L22
            if (r1 != r0) goto L4b
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            return r0
        L22:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$FetchVms r6 = com.facebook.aura.network.api.StefiHatchPath.FetchVms.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.gateway.HatchVmRepository$requestFetchVms-IoAF18A$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.gateway.HatchVmRepository$requestFetchVmsIoAF18A$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L21
            return r2
        L45:
            com.facebook.aura.gateway.HatchVmRepository$requestFetchVms$1 r12 = new com.facebook.aura.gateway.HatchVmRepository$requestFetchVms$1
            r12.<init>(r13, r14)
            goto L12
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m963requestFetchVmsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b5 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveForRestart(com.facebook.aura.gateway.store.HatchGatewayPrefsStore r13, com.facebook.aura.gateway.GatewayVmCredential r14, X.HtJ<? super java.lang.Boolean> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchVmRepository.C121391
            if (r0 == 0) goto Lb8
            r7 = r15
            com.facebook.aura.gateway.HatchVmRepository$saveForRestart$1 r7 = (com.facebook.aura.gateway.HatchVmRepository.C121391) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r8 = 2
            r12 = 0
            r6 = 1
            if (r1 == 0) goto L87
            if (r1 == r6) goto L71
            if (r1 != r8) goto Lc4
            int r5 = r7.I$2
            int r10 = r7.I$1
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r14 = r7.L$1
            com.facebook.aura.gateway.GatewayVmCredential r14 = (com.facebook.aura.gateway.GatewayVmCredential) r14
            java.lang.Object r13 = r7.L$0
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r13 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r13
            X.Hwg.A00(r0)
        L36:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L41
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L41:
            int r0 = r5 + 1
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "HatchVmRepository"
            java.lang.String r0 = "Could not save the new VM's credentials, attempt %d"
            X.CFK.A0H(r1, r0, r2)
            int r5 = r10 + 1
            if (r5 >= r4) goto Lbf
            if (r5 <= 0) goto L92
            r10 = 200(0xc8, double:9.9E-322)
            long r0 = (long) r5
            long r0 = r0 * r10
            r7.L$0 = r13
            r7.L$1 = r14
            r7.L$2 = r3
            r7.I$0 = r4
            r7.I$1 = r5
            r7.I$2 = r5
            r7.label = r6
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r9) goto L92
            return r9
        L71:
            int r5 = r7.I$2
            int r10 = r7.I$1
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r14 = r7.L$1
            com.facebook.aura.gateway.GatewayVmCredential r14 = (com.facebook.aura.gateway.GatewayVmCredential) r14
            java.lang.Object r13 = r7.L$0
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r13 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r13
            X.Hwg.A00(r0)
            goto L93
        L87:
            X.Hwg.A00(r0)
            java.lang.String r0 = r14.wsUrl
            java.lang.String r3 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            r4 = 3
            r5 = 0
        L92:
            r10 = r5
        L93:
            X.HwK r1 = X.HwK.A00
            X.78T r0 = X.AnonymousClass001.A0y()
            X.78T r2 = X.C78W.A02(r1, r0)
            r1 = 0
            com.facebook.aura.gateway.HatchVmRepository$saveForRestart$2$saved$1 r0 = new com.facebook.aura.gateway.HatchVmRepository$saveForRestart$2$saved$1
            r0.<init>(r3, r14, r13, r1)
            r7.L$0 = r13
            r7.L$1 = r14
            r7.L$2 = r3
            r7.I$0 = r4
            r7.I$1 = r10
            r7.I$2 = r5
            r7.label = r8
            java.lang.Object r0 = X.GAo.A00(r7, r2, r0)
            if (r0 != r9) goto L36
            return r9
        Lb8:
            com.facebook.aura.gateway.HatchVmRepository$saveForRestart$1 r7 = new com.facebook.aura.gateway.HatchVmRepository$saveForRestart$1
            r7.<init>(r15)
            goto L12
        Lbf:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            return r9
        Lc4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.saveForRestart(com.facebook.aura.gateway.store.HatchGatewayPrefsStore, com.facebook.aura.gateway.GatewayVmCredential, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enableVm(X.AbstractC3358CGz r16, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.EnableVmResult> r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.enableVm(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCacheExistingVm(X.AbstractC3358CGz r7, com.facebook.aura.gateway.VmFetchSource r8, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchVmRepository.C121321
            if (r0 == 0) goto L26
            r5 = r9
            com.facebook.aura.gateway.HatchVmRepository$fetchAndCacheExistingVm$1 r5 = (com.facebook.aura.gateway.HatchVmRepository.C121321) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r0 = 2
            r1 = 1
            if (r2 == 0) goto L31
            if (r2 == r1) goto L42
            if (r2 != r0) goto L2c
            java.lang.Object r3 = r5.L$2
            X.Hwg.A00(r4)
            return r3
        L26:
            com.facebook.aura.gateway.HatchVmRepository$fetchAndCacheExistingVm$1 r5 = new com.facebook.aura.gateway.HatchVmRepository$fetchAndCacheExistingVm$1
            r5.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r4)
            r5.L$0 = r7
            r0 = 0
            r5.L$1 = r0
            r5.label = r1
            java.lang.Object r4 = r6.fetchExistingVm(r7, r8, r5)
            if (r4 != r3) goto L45
            return r3
        L42:
            X.Hwg.A00(r4)
        L45:
            r3 = r4
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r3 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r3
            r3.asFailure()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.fetchAndCacheExistingVm(X.CGz, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* renamed from: fetchLiveVmHosts-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m965fetchLiveVmHostsIoAF18A(X.HtJ<? super X.HsJ<? extends java.util.Set<java.lang.String>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchVmRepository$fetchLiveVmHosts$1
            if (r0 == 0) goto L55
            r4 = r6
            com.facebook.aura.gateway.HatchVmRepository$fetchLiveVmHosts$1 r4 = (com.facebook.aura.gateway.HatchVmRepository$fetchLiveVmHosts$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto L60
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L5f
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            java.lang.String r0 = r0.vm_ws_url
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractVmHost(r0)
            if (r0 == 0) goto L31
            r2.add(r0)
            goto L31
        L49:
            X.Hwg.A00(r3)
            r4.label = r0
            java.lang.Object r1 = r5.m966fetchLiveVmsIoAF18A(r4)
            if (r1 != r2) goto L21
            return r2
        L55:
            com.facebook.aura.gateway.HatchVmRepository$fetchLiveVmHosts$1 r4 = new com.facebook.aura.gateway.HatchVmRepository$fetchLiveVmHosts$1
            r4.<init>(r5, r6)
            goto L12
        L5b:
            java.util.Set r1 = X.AbstractC0878AGe.A0g(r2)
        L5f:
            return r1
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m965fetchLiveVmHostsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* renamed from: fetchLiveVms-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m966fetchLiveVmsIoAF18A(X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.gateway.store.VmEntryV2Json>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchVmRepository$fetchLiveVms$1
            if (r0 == 0) goto L58
            r4 = r6
            com.facebook.aura.gateway.HatchVmRepository$fetchLiveVms$1 r4 = (com.facebook.aura.gateway.HatchVmRepository$fetchLiveVms$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L4c
            if (r1 != r0) goto L6a
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L21:
            java.lang.Throwable r1 = X.HsJ.A00(r2)
            if (r1 != 0) goto L65
            com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson r2 = (com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson) r2
            java.util.List<com.facebook.aura.gateway.store.VmEntryV2Json> r1 = r2.vm_list
            if (r1 == 0) goto L5e
            java.lang.String r0 = r2.error_title
            if (r0 == 0) goto L37
            int r0 = r0.length()
            if (r0 != 0) goto L5e
        L37:
            java.lang.String r0 = r2.error_summary
            if (r0 == 0) goto L41
            int r0 = r0.length()
            if (r0 != 0) goto L5e
        L41:
            java.lang.String r0 = r2.backend_error_code
            if (r0 == 0) goto L4b
            int r0 = r0.length()
            if (r0 != 0) goto L5e
        L4b:
            return r1
        L4c:
            X.Hwg.A00(r2)
            r4.label = r0
            java.lang.Object r2 = r5.m963requestFetchVmsIoAF18A(r4)
            if (r2 != r3) goto L21
            return r3
        L58:
            com.facebook.aura.gateway.HatchVmRepository$fetchLiveVms$1 r4 = new com.facebook.aura.gateway.HatchVmRepository$fetchLiveVms$1
            r4.<init>(r5, r6)
            goto L12
        L5e:
            java.lang.String r0 = "fetch_vms returned no inventory"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
        L65:
            X.Hud r1 = X.C3cG.A0s(r1)
            return r1
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.m966fetchLiveVmsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchOrLeaseReplacementVm(X.AbstractC3358CGz r18, com.facebook.aura.gateway.VmFetchSource r19, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.fetchOrLeaseReplacementVm(X.CGz, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object leaseAndCacheVm(X.AbstractC3358CGz r6, com.facebook.aura.gateway.HatchlingVmType r7, com.facebook.aura.gateway.VmFetchSource r8, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchVmRepository.C121361
            if (r0 == 0) goto L48
            r4 = r9
            com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$1 r4 = (com.facebook.aura.gateway.HatchVmRepository.C121361) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4e
            java.lang.Object r8 = r4.L$2
            com.facebook.aura.gateway.VmFetchSource r8 = (com.facebook.aura.gateway.VmFetchSource) r8
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r1 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r1
            r5.logLeaseOutcome(r1, r8)
            return r1
        L2a:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r1 = r5.missingAccessTokenFailure(r6)
            if (r1 != 0) goto L24
            r1 = 0
            com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$result$1 r0 = new com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$result$1
            r0.<init>(r7, r6, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r8
            r4.label = r2
            java.lang.Object r1 = r5.requestAndCacheVm(r6, r8, r0, r4)
            if (r1 != r3) goto L24
            return r3
        L48:
            com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$1 r4 = new com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$1
            r4.<init>(r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.leaseAndCacheVm(X.CGz, com.facebook.aura.gateway.HatchlingVmType, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    public final Object prefetchVmForPreconnect(AbstractC3358CGz abstractC3358CGz, HtJ<? super FetchAndCacheLeasedVmResult> htJ) {
        return fetchAndCacheExistingVm(abstractC3358CGz, VmFetchSource.PRECONNECT_PREFETCH, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replaceAndCacheVm(X.AbstractC3358CGz r12, java.lang.String r13, com.facebook.aura.gateway.HatchlingVmType r14, com.facebook.aura.gateway.VmFetchSource r15, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchVmRepository.C121371
            if (r0 == 0) goto L5d
            r4 = r3
            com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$1 r4 = (com.facebook.aura.gateway.HatchVmRepository.C121371) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L63
            java.lang.Object r15 = r4.L$3
            com.facebook.aura.gateway.VmFetchSource r15 = (com.facebook.aura.gateway.VmFetchSource) r15
            X.Hwg.A00(r1)
        L26:
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r1 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r1
        L28:
            r11.logLeaseOutcome(r1, r15)
            return r1
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r0 = r11.missingAccessTokenFailure(r12)
            if (r0 == 0) goto L46
            java.lang.String r3 = r0.errorMessage
            r4 = 0
            java.lang.String r2 = "VmReplaceNotSent"
            r9 = 0
            r8 = 0
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r1 = new com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure
            r5 = r4
            r6 = r4
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L28
        L46:
            r1 = 0
            com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$result$2 r0 = new com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$result$2
            r0.<init>(r12, r13, r14, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r1
            r4.L$3 = r15
            r4.label = r2
            java.lang.Object r1 = r11.requestAndCacheVm(r12, r15, r0, r4)
            if (r1 != r3) goto L26
            return r3
        L5d:
            com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$1 r4 = new com.facebook.aura.gateway.HatchVmRepository$replaceAndCacheVm$1
            r4.<init>(r3)
            goto L14
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.replaceAndCacheVm(X.CGz, java.lang.String, com.facebook.aura.gateway.HatchlingVmType, com.facebook.aura.gateway.VmFetchSource, X.HtJ):java.lang.Object");
    }

    public abstract class EnableVmResult {
        public static final int $stable = 8;

        public final class Failure extends EnableVmResult {
            public static final int $stable = 0;
            public final String errorMessage;
            public final String errorType;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failure) {
                        Failure failure = (Failure) obj;
                        if (!C7384Etj.areEqual(this.errorType, failure.errorType) || !C7384Etj.areEqual(this.errorMessage, failure.errorMessage)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failure.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = failure.errorMessage;
                }
                AnonymousClass003.A0u(str, str2);
                return new Failure(str, str2);
            }

            public final String component1() {
                return this.errorType;
            }

            public final String component2() {
                return this.errorMessage;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String getErrorType() {
                return this.errorType;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.errorMessage, AnonymousClass001.A0G(this.errorType));
            }

            public Failure(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                this.errorType = str;
                this.errorMessage = str2;
            }

            public final Failure copy(String str, String str2) {
                AnonymousClass003.A0u(str, str2);
                return new Failure(str, str2);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends EnableVmResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public String toString() {
                return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
            }

            public int hashCode() {
                return -1607057709;
            }
        }

        public /* synthetic */ EnableVmResult(C06H c06h) {
        }

        public EnableVmResult() {
        }
    }

    public abstract class FetchAndCacheLeasedVmResult {
        public static final int $stable = 8;

        public final class Failure extends FetchAndCacheLeasedVmResult {
            public static final int $stable = 0;
            public final String errorMessage;
            public final String errorSummary;
            public final String errorTitle;
            public final String errorType;
            public final boolean isTerminal;
            public final long retryAfterMs;
            public final Integer validCredentialCount;
            public final Integer validUrlCount;

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String getErrorSummary() {
                return this.errorSummary;
            }

            public final String getErrorTitle() {
                return this.errorTitle;
            }

            public final String getErrorType() {
                return this.errorType;
            }

            public final long getRetryAfterMs() {
                return this.retryAfterMs;
            }

            public final Integer getValidCredentialCount() {
                return this.validCredentialCount;
            }

            public final Integer getValidUrlCount() {
                return this.validUrlCount;
            }

            public final boolean isRetryable() {
                if (!this.isTerminal) {
                    String str = this.errorType;
                    if (!HatchVmRepositoryKt.ERROR_TYPE_VM_UNAVAILABLE.equals(str) && !HatchVmRepositoryKt.ERROR_TYPE_MISSING_ACCESS_TOKEN.equals(str)) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean isTerminal() {
                return this.isTerminal;
            }

            public Failure(String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, long j) {
                AnonymousClass003.A0u(str, str2);
                this.errorType = str;
                this.errorMessage = str2;
                this.validUrlCount = num;
                this.validCredentialCount = num2;
                this.errorTitle = str3;
                this.errorSummary = str4;
                this.isTerminal = z;
                this.retryAfterMs = j;
            }

            public /* synthetic */ Failure(String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z, long j, int i, C06H c06h) {
                this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0L : j);
            }
        }

        public final class NoVms extends FetchAndCacheLeasedVmResult {
            public static final int $stable = 0;
            public static final NoVms INSTANCE = new NoVms();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NoVms);
            }

            public String toString() {
                return "NoVms";
            }

            public int hashCode() {
                return -187854167;
            }
        }

        /* loaded from: classes5.dex */
        public final class Success extends FetchAndCacheLeasedVmResult {
            public static final int $stable = 0;
            public final String fallbackBackendErrorCode;
            public final String selectedVmId;
            public final Boolean selectedVmStarting;
            public final HatchVmState selectedVmState;
            public final HatchlingVmType selectedVmType;
            public final int validCredentialCount;
            public final int validUrlCount;

            public final String getFallbackBackendErrorCode() {
                return this.fallbackBackendErrorCode;
            }

            public final String getSelectedVmId() {
                return this.selectedVmId;
            }

            public final Boolean getSelectedVmStarting() {
                return this.selectedVmStarting;
            }

            public final HatchVmState getSelectedVmState() {
                return this.selectedVmState;
            }

            public final HatchlingVmType getSelectedVmType() {
                return this.selectedVmType;
            }

            public final int getValidCredentialCount() {
                return this.validCredentialCount;
            }

            public final int getValidUrlCount() {
                return this.validUrlCount;
            }

            public Success(int i, int i2, String str, Boolean bool, HatchVmState hatchVmState, String str2, HatchlingVmType hatchlingVmType) {
                this.validUrlCount = i;
                this.validCredentialCount = i2;
                this.fallbackBackendErrorCode = str;
                this.selectedVmStarting = bool;
                this.selectedVmState = hatchVmState;
                this.selectedVmId = str2;
                this.selectedVmType = hatchlingVmType;
            }

            public /* synthetic */ Success(int i, int i2, String str, Boolean bool, HatchVmState hatchVmState, String str2, HatchlingVmType hatchlingVmType, int i3, C06H c06h) {
                this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : hatchVmState, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : hatchlingVmType);
            }
        }

        public final Failure asFailure() {
            if (this instanceof Failure) {
                return (Failure) this;
            }
            if (equals(NoVms.INSTANCE)) {
                return new Failure(HatchVmRepositoryKt.ERROR_TYPE_NO_VALID_VM_URL, HatchVmRepositoryKt.ERROR_MESSAGE_EMPTY_VM_LIST, 0, 0, null, null, false, 0L);
            }
            if (this instanceof Success) {
                return null;
            }
            throw C3cG.A0q();
        }

        public /* synthetic */ FetchAndCacheLeasedVmResult(C06H c06h) {
        }

        public FetchAndCacheLeasedVmResult() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Failure handleVmFailure(java.lang.Throwable r11, com.facebook.aura.gateway.HatchVmAvailabilityStore r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository.handleVmFailure(java.lang.Throwable, com.facebook.aura.gateway.HatchVmAvailabilityStore):com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure");
    }

    private final void logLeaseOutcome(FetchAndCacheLeasedVmResult fetchAndCacheLeasedVmResult, VmFetchSource vmFetchSource) {
        FetchAndCacheLeasedVmResult.Failure failureAsFailure = fetchAndCacheLeasedVmResult.asFailure();
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.ONBOARDING.getValue();
        String value2 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), failureAsFailure == null ? "success" : "error");
        c0924AIaA0u.put(HatchMetadataKey.ENTRY_POINT.getValue(), vmFetchSource.getValue());
        if (failureAsFailure != null) {
            c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON.getValue(), failureAsFailure.errorType);
        }
        hatchAppEventLogger.logEvent("lease_vm", value, null, value2, "lease_vm", AIW.A0K(c0924AIaA0u), null);
    }

    public final HatchlingVmType serverStatedVmType$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AbstractC3358CGz abstractC3358CGz, String str) {
        VmEntryV2Json next;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        Iterator<VmEntryV2Json> it = VmEntryV2JsonKt.decodeCachedVmList(HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getCachedVmListJson()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(HatcheryVMIdUtilsKt.extractHatcheryVMId(next.vm_ws_url))) {
                break;
            }
        }
        VmEntryV2Json vmEntryV2Json = next;
        if (vmEntryV2Json != null) {
            return HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json.vm_type);
        }
        return null;
    }
}
