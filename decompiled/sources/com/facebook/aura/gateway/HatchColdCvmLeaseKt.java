package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFI;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.gateway.store.HatchCvmChipClaimStore;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public abstract class HatchColdCvmLeaseKt {
    public static final String COLD_LEASE_CVM_NOT_READY = "cold_lease_cvm_not_ready";
    public static final long DEFAULT_LOST_BID_RESEND_INTERVAL_MS = 30000;
    public static final String KEY_IDEMPOTENCY_KEY = "idempotency_key";
    public static final long POLL_INTERVAL_MS = 3000;
    public static final long READY_TIMEOUT_MS = 240000;
    public static final String TAG = "HatchColdCvmLease";
    public static final Set<HatchVmState> PENDING_FIRST_LAUNCH_STATES = BFI.A0H(new HatchVmState[]{HatchVmState.CREATING, HatchVmState.CVM_AWAITING_DST_VM_CHIP_SELECTION});
    public static final Set<HatchVmState> UNRESUMABLE_STATES = BFI.A0H(new HatchVmState[]{HatchVmState.DELETING, HatchVmState.ERROR, HatchVmState.DISABLED, HatchVmState.CVM_DST_VM_FAILED_TO_START});

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {88}, m = "awaitColdCvmLaunch", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$awaitColdCvmLaunch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchColdCvmLeaseKt.awaitColdCvmLaunch(null, null, false, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {24}, m = "leaseCvmCold", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$1, reason: invalid class name and case insensitive filesystem */
    public final class C120551 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnonymousClass006.A0m(HatchColdCvmLeaseKt.leaseCvmCold(null, this));
        }

        public C120551(HtJ<? super C120551> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$2", f = "HatchColdCvmLease.kt", l = {24}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>> htJ) {
            return new AnonymousClass2(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objLeaseCvmColdOnIo;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                objLeaseCvmColdOnIo = HatchColdCvmLeaseKt.leaseCvmColdOnIo(abstractC3358CGz, this);
                if (objLeaseCvmColdOnIo == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objLeaseCvmColdOnIo = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objLeaseCvmColdOnIo);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>> htJ) {
            return invoke2(c3ux, (HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {29, 35, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, 58}, m = "leaseCvmColdOnIo", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmColdOnIo$1, reason: invalid class name and case insensitive filesystem */
    public final class C120561 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objLeaseCvmColdOnIo = HatchColdCvmLeaseKt.leaseCvmColdOnIo(null, this);
            return objLeaseCvmColdOnIo != EnumC10460Hji.A02 ? C3cG.A0t(objLeaseCvmColdOnIo) : objLeaseCvmColdOnIo;
        }

        public C120561(HtJ<? super C120561> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {239}, m = "listedVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C120571 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchColdCvmLeaseKt.listedVm(null, this);
        }

        public C120571(HtJ<? super C120571> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {64}, m = "pendingColdLeasedVmId", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$pendingColdLeasedVmId$1, reason: invalid class name and case insensitive filesystem */
    public final class C120581 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchColdCvmLeaseKt.pendingColdLeasedVmId(this);
        }

        public C120581(HtJ<? super C120581> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {107, 111, 125, 122, 138, 145, 150, 160}, m = "pollColdCvmLaunch", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$pollColdCvmLaunch$1, reason: invalid class name and case insensitive filesystem */
    public final class C120591 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchColdCvmLeaseKt.pollColdCvmLaunch(null, null, null, false, this);
        }

        public C120591(HtJ<? super C120591> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchColdCvmLeaseKt", f = "HatchColdCvmLease.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS, 172}, m = "resendLostBid", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchColdCvmLeaseKt$resendLostBid$1, reason: invalid class name and case insensitive filesystem */
    public final class C120601 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchColdCvmLeaseKt.resendLostBid(null, null, null, this);
        }

        public C120601(HtJ<? super C120601> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resendLostBid(X.AbstractC3358CGz r10, com.facebook.aura.gateway.HatchCvmChipBudgetGate r11, java.lang.String r12, X.HtJ<? super com.facebook.aura.gateway.HatchCvmChipSelectionOutcome> r13) throws java.lang.Throwable {
        /*
            r7 = r12
            r6 = r11
            boolean r0 = r13 instanceof com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120601
            if (r0 == 0) goto L27
            r11 = r13
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$resendLostBid$1 r11 = (com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120601) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r9 = r11.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r5 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L32
            if (r0 == r3) goto L62
            if (r0 != r5) goto L2d
            X.Hwg.A00(r9)
            return r9
        L27:
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$resendLostBid$1 r11 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$resendLostBid$1
            r11.<init>(r13)
            goto L14
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r9)
            com.facebook.aura.gateway.store.HatchCvmChipClaimStore r0 = com.facebook.aura.gateway.store.HatchCvmChipClaimStore.INSTANCE
            com.facebook.aura.gateway.store.HatchCvmChipClaim r1 = r0.read(r12)
            if (r1 == 0) goto L8c
            boolean r0 = r1.getAwaitsBidAnswer()
            if (r0 == 0) goto L8c
            java.lang.String r8 = r1.attemptId
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$Companion r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.Companion
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = r0.getInstance(r10)
            r11.L$0 = r2
            r11.L$1 = r2
            r11.L$2 = r2
            r11.L$3 = r2
            r11.L$4 = r6
            r11.L$5 = r12
            r11.L$6 = r8
            r11.label = r3
            java.lang.Object r9 = r0.deriveHostData(r12, r11)
            if (r9 != r4) goto L71
        L61:
            return r4
        L62:
            java.lang.Object r8 = r11.L$6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r11.L$5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r11.L$4
            com.facebook.aura.gateway.HatchCvmChipBudgetGate r6 = (com.facebook.aura.gateway.HatchCvmChipBudgetGate) r6
            X.Hwg.A00(r9)
        L71:
            byte[] r9 = (byte[]) r9
            com.facebook.aura.common.HatchCvmChipPinPurpose r10 = com.facebook.aura.common.HatchCvmChipPinPurpose.PROVISIONING
            r11.L$0 = r2
            r11.L$1 = r2
            r11.L$2 = r2
            r11.L$3 = r2
            r11.L$4 = r2
            r11.L$5 = r2
            r11.L$6 = r2
            r11.label = r5
            java.lang.Object r0 = r6.bid(r7, r8, r9, r10, r11)
            if (r0 == r4) goto L61
            return r0
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.resendLostBid(X.CGz, com.facebook.aura.gateway.HatchCvmChipBudgetGate, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchVmState.values().length];
            try {
                AnonymousClass002.A13(HatchVmState.CVM_AWAITING_DST_VM_CHIP_SELECTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchVmState.CVM_LOCKED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.aura.gateway.HatchCvmChipBudgetGate] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitColdCvmLaunch(X.AbstractC3358CGz r5, java.lang.String r6, boolean r7, X.HtJ<? super com.facebook.aura.gateway.store.VmEntryV2Json> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchColdCvmLeaseKt.AnonymousClass1
            if (r0 == 0) goto L26
            r4 = r8
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$awaitColdCvmLaunch$1 r4 = (com.facebook.aura.gateway.HatchColdCvmLeaseKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L30
            java.lang.Object r1 = r4.L$2
            com.facebook.aura.gateway.HatchCvmChipBudgetGate r1 = (com.facebook.aura.gateway.HatchCvmChipBudgetGate) r1
            java.lang.Object r6 = r4.L$1
            java.lang.String r6 = (java.lang.String) r6
            goto L2c
        L26:
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$awaitColdCvmLaunch$1 r4 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$awaitColdCvmLaunch$1
            r4.<init>(r8)
            goto L12
        L2c:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r0)
            com.facebook.aura.gateway.HatchCvmReplaceReadPolicy$Companion r0 = com.facebook.aura.gateway.HatchCvmReplaceReadPolicy.Companion
            com.facebook.aura.gateway.HatchCvmReplaceReadPolicy r0 = r0.getInstance(r5)
            r0.rearm(r6)
            com.facebook.aura.gateway.HatchCvmChipBudgetGate$Companion r0 = com.facebook.aura.gateway.HatchCvmChipBudgetGate.Companion
            com.facebook.aura.gateway.HatchCvmChipBudgetGate r1 = r0.getInstance(r5)
            r1.beginSetup(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L63
            r4.L$1 = r6     // Catch: java.lang.Throwable -> L63
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L63
            r4.Z$0 = r7     // Catch: java.lang.Throwable -> L63
            r4.label = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = pollColdCvmLaunch(r5, r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L63
            if (r0 != r3) goto L5c
            return r3
        L5c:
            r1.release(r6)
            r1.endSetup(r6)
            return r0
        L63:
            r0 = move-exception
            r1.release(r6)
            r1.endSetup(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.awaitColdCvmLaunch(X.CGz, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    public static final boolean canFinishColdLaunch(VmEntryV2Json vmEntryV2Json) {
        if (HatchlingVmType.Companion.fromResponseWire(vmEntryV2Json.vm_type) != HatchlingVmType.HATCH_CVM) {
            return false;
        }
        HatchVmState hatchVmStateFromWire = HatchVmState.Companion.fromWire(vmEntryV2Json.vm_state);
        return PENDING_FIRST_LAUNCH_STATES.contains(hatchVmStateFromWire) || (!UNRESUMABLE_STATES.contains(hatchVmStateFromWire) && HatchCvmChipClaimStore.INSTANCE.canFinishEnrollment(vmEntryV2Json.vm_id));
    }

    public static final boolean isConfidentiallyConnectedTo(AbstractC3358CGz abstractC3358CGz, String str) {
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        return companion.hasConnectedTo(str) && HatchGatewayConnectionStateKt.isConfidentiallyReady(companion.gatewayState.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object leaseCvmCold(X.AbstractC3358CGz r6, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120551
            if (r0 == 0) goto L3a
            r5 = r7
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$1 r5 = (com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120551) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$2 r0 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$2
            r0.<init>(r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$1 r5 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$leaseCvmCold$1
            r5.<init>(r7)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.leaseCvmCold(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object leaseCvmColdOnIo(X.AbstractC3358CGz r11, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson>> r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.leaseCvmColdOnIo(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object listedVm(java.lang.String r12, X.HtJ<? super com.facebook.aura.gateway.store.VmEntryV2Json> r13) {
        /*
            boolean r0 = r13 instanceof com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120571
            if (r0 == 0) goto L86
            r11 = r13
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$1 r11 = (com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120571) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r3 = r11.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r11.label
            r0 = 1
            if (r2 == 0) goto L61
            if (r2 != r0) goto L8d
            java.lang.Object r12 = r11.L$0
            java.lang.Object r2 = X.AnonymousClass001.A0q(r3)
        L23:
            boolean r0 = r2 instanceof X.C10571Hud
            r1 = 0
            if (r0 == 0) goto L29
            r2 = r1
        L29:
            com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson r2 = (com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson) r2
            if (r2 == 0) goto L8c
            java.util.List<com.facebook.aura.gateway.store.VmEntryV2Json> r0 = r2.vm_list
            if (r0 == 0) goto L8c
            java.util.Iterator r4 = r0.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.facebook.aura.gateway.store.VmEntryV2Json r2 = (com.facebook.aura.gateway.store.VmEntryV2Json) r2
            java.lang.String r0 = r2.vm_ws_url
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = r2.vm_auth_token
            if (r0 == 0) goto L35
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = r2.vm_ws_url
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            boolean r0 = X.C7384Etj.areEqual(r0, r12)
            if (r0 == 0) goto L35
            return r3
        L61:
            com.facebook.aura.network.http.HatchHttpApi r2 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$FetchVms r5 = com.facebook.aura.network.api.StefiHatchPath.FetchVms.INSTANCE
            com.facebook.aura.network.http.RequestType r6 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$$inlined$executeStefiRequest-bMdYcbs$default$1 r3 = com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r4 = 0
            r11.L$0 = r12
            r7 = 0
            r11.L$1 = r7
            r11.L$2 = r7
            r11.L$3 = r7
            r11.L$4 = r7
            r11.L$5 = r7
            r11.label = r0
            r8 = r7
            r10 = r9
            java.lang.Object r2 = r2.m1596executeBodylessStefiRequestWithtZkwj4A(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 != r1) goto L23
            return r1
        L86:
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$1 r11 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$listedVm$1
            r11.<init>(r13)
            goto L12
        L8c:
            return r1
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.listedVm(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object pendingColdLeasedVmId(X.HtJ<? super java.lang.String> r5) {
        /*
            boolean r0 = r5 instanceof com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120581
            if (r0 == 0) goto L61
            r4 = r5
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$pendingColdLeasedVmId$1 r4 = (com.facebook.aura.gateway.HatchColdCvmLeaseKt.C120581) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L67
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r3 = 0
            if (r0 == 0) goto L27
            r1 = r3
        L27:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L60
            java.util.Iterator r2 = r1.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            boolean r0 = canFinishColdLaunch(r0)
            if (r0 == 0) goto L2f
        L42:
            com.facebook.aura.gateway.store.VmEntryV2Json r1 = (com.facebook.aura.gateway.store.VmEntryV2Json) r1
            if (r1 == 0) goto L60
            java.lang.String r1 = r1.vm_id
            if (r1 == 0) goto L60
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L60
            return r1
        L51:
            r1 = r3
            goto L42
        L53:
            X.Hwg.A00(r2)
            com.facebook.aura.gateway.HatchVmRepository r0 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r4.label = r1
            java.lang.Object r1 = r0.m966fetchLiveVmsIoAF18A(r4)
            if (r1 != r3) goto L21
        L60:
            return r3
        L61:
            com.facebook.aura.gateway.HatchColdCvmLeaseKt$pendingColdLeasedVmId$1 r4 = new com.facebook.aura.gateway.HatchColdCvmLeaseKt$pendingColdLeasedVmId$1
            r4.<init>(r5)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.pendingColdLeasedVmId(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:101:0x0303, B:94:0x02d3], limit reached: 107 */
    /* JADX WARN: Path cross not found for [B:66:0x0241, B:74:0x025a], limit reached: 107 */
    /* JADX WARN: Path cross not found for [B:94:0x02d3, B:101:0x0303], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0300 -> B:14:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object pollColdCvmLaunch(X.AbstractC3358CGz r25, com.facebook.aura.gateway.HatchCvmChipBudgetGate r26, java.lang.String r27, boolean r28, X.HtJ<? super com.facebook.aura.gateway.store.VmEntryV2Json> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchColdCvmLeaseKt.pollColdCvmLaunch(X.CGz, com.facebook.aura.gateway.HatchCvmChipBudgetGate, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }
}
