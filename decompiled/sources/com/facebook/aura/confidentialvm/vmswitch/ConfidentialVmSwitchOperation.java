package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.VmFetchSource;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore;
import com.facebook.aura.onboarding.OnboardingStateManager;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchOperation implements InterfaceC7549F2g {
    public static final int MAX_ATTEMPTS = 3;
    public static final long RETRY_DELAY_MS = 1000;
    public static final String TAG = "ConfidentialVmSwitchOperation";
    public final SingleFlight singleFlight;
    public final HatchVmTypeSwitchCheckpointStore store;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<FailureReason> NOT_RETRYABLE_REASONS = BFI.A0H(new FailureReason[]{FailureReason.CREDENTIALS_NOT_SAVED, FailureReason.REPLACE_REFUSED});

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason CHECKPOINT_FAILED;
        public static final FailureReason CREDENTIALS_NOT_SAVED;
        public static final FailureReason NO_CURRENT_VM;
        public static final FailureReason REPLACE_FAILED;
        public static final FailureReason REPLACE_REFUSED;

        static {
            FailureReason failureReason = new FailureReason("NO_CURRENT_VM", 0);
            NO_CURRENT_VM = failureReason;
            FailureReason failureReason2 = new FailureReason("REPLACE_FAILED", 1);
            REPLACE_FAILED = failureReason2;
            FailureReason failureReason3 = new FailureReason("REPLACE_REFUSED", 2);
            REPLACE_REFUSED = failureReason3;
            FailureReason failureReason4 = new FailureReason("CHECKPOINT_FAILED", 3);
            CHECKPOINT_FAILED = failureReason4;
            FailureReason failureReason5 = new FailureReason("CREDENTIALS_NOT_SAVED", 4);
            CREDENTIALS_NOT_SAVED = failureReason5;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public FailureReason(String str, int i) {
        }
    }

    public interface Outcome {

        public final class Failed extends C06G implements Outcome {
            public final FailureReason reason;

            public Failed(FailureReason failureReason) {
                C7384Etj.A0Y(failureReason, 0);
                this.reason = failureReason;
            }

            public final Failed copy(FailureReason failureReason) {
                C7384Etj.A0Y(failureReason, 0);
                return new Failed(failureReason);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && this.reason == ((Failed) obj).reason);
            }

            public static /* synthetic */ Failed copy$default(Failed failed, FailureReason failureReason, int i, Object obj) {
                if ((i & 1) != 0) {
                    failureReason = failed.reason;
                }
                C7384Etj.A0Y(failureReason, 0);
                return new Failed(failureReason);
            }

            public final FailureReason component1() {
                return this.reason;
            }

            public final FailureReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Switched extends C06G implements Outcome {
            public final HatchlingVmType vmType;

            public Switched(HatchlingVmType hatchlingVmType) {
                C7384Etj.A0Y(hatchlingVmType, 0);
                this.vmType = hatchlingVmType;
            }

            public final Switched copy(HatchlingVmType hatchlingVmType) {
                C7384Etj.A0Y(hatchlingVmType, 0);
                return new Switched(hatchlingVmType);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Switched) && this.vmType == ((Switched) obj).vmType);
            }

            public static /* synthetic */ Switched copy$default(Switched switched, HatchlingVmType hatchlingVmType, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchlingVmType = switched.vmType;
                }
                C7384Etj.A0Y(hatchlingVmType, 0);
                return new Switched(hatchlingVmType);
            }

            public final HatchlingVmType component1() {
                return this.vmType;
            }

            public final HatchlingVmType getVmType() {
                return this.vmType;
            }

            public int hashCode() {
                return this.vmType.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$canSwitch$2", f = "ConfidentialVmSwitchOperation.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$canSwitch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmSwitchOperation.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ConfidentialVmSwitchOperation.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objCurrentVmHost;
            Object objM965fetchLiveVmHostsIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                Hwg.A00(obj);
                objCurrentVmHost = ConfidentialVmSwitchOperation.this.currentVmHost();
                if (objCurrentVmHost != null) {
                    HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                    this.L$0 = objCurrentVmHost;
                    this.label = 1;
                    objM965fetchLiveVmHostsIoAF18A = hatchVmRepository.m965fetchLiveVmHostsIoAF18A(this);
                    if (objM965fetchLiveVmHostsIoAF18A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objCurrentVmHost = this.L$0;
            objM965fetchLiveVmHostsIoAF18A = AnonymousClass001.A0q(obj);
            if (objM965fetchLiveVmHostsIoAF18A instanceof C10571Hud) {
                objM965fetchLiveVmHostsIoAF18A = null;
            }
            Set set = (Set) objM965fetchLiveVmHostsIoAF18A;
            if (set != null && set.contains(objCurrentVmHost)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation", f = "ConfidentialVmSwitchOperation.kt", l = {104, 105, 107, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 114, 126, 127, 130, 132, 134, 143, 146, 147, 151, 164}, m = "continueSwitch", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$continueSwitch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchOperation.this.continueSwitch(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation", f = "ConfidentialVmSwitchOperation.kt", l = {83, 91}, m = "continueWithRetries", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$continueWithRetries$1, reason: invalid class name and case insensitive filesystem */
    public final class C113191 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113191(HtJ<? super C113191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchOperation.this.continueWithRetries(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation", f = "ConfidentialVmSwitchOperation.kt", l = {207}, m = "exclusive", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$1, reason: invalid class name and case insensitive filesystem */
    public final class C113201<T> extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113201(HtJ<? super C113201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchOperation.this.exclusive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation", f = "ConfidentialVmSwitchOperation.kt", l = {185}, m = "isLive", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$isLive$1, reason: invalid class name and case insensitive filesystem */
    public final class C113211 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113211(HtJ<? super C113211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchOperation.this.isLive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation", f = "ConfidentialVmSwitchOperation.kt", l = {173}, m = "refuse", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$refuse$1, reason: invalid class name and case insensitive filesystem */
    public final class C113221 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C113221(HtJ<? super C113221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchOperation.this.refuse(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$resume$2", f = "ConfidentialVmSwitchOperation.kt", l = {73}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$resume$2, reason: invalid class name and case insensitive filesystem */
    public final class C113232 extends AbstractC07127nr implements G0U<HtJ<? super Outcome>, Object> {
        public Object L$0;
        public int label;

        public C113232(HtJ<? super C113232> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmSwitchOperation.this.new C113232(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Outcome> htJ) {
            return ConfidentialVmSwitchOperation.this.new C113232(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (ConfidentialVmSwitchOperation.this.store.read() == null) {
                    return null;
                }
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation = ConfidentialVmSwitchOperation.this;
                this.L$0 = null;
                this.label = 1;
                obj = confidentialVmSwitchOperation.continueWithRetries(this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$switchTo$2", f = "ConfidentialVmSwitchOperation.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$switchTo$2, reason: invalid class name and case insensitive filesystem */
    public final class C113242 extends AbstractC07127nr implements G0U<HtJ<? super Outcome>, Object> {
        public final /* synthetic */ HatchlingVmType $targetVmType;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113242(HatchlingVmType hatchlingVmType, HtJ<? super C113242> htJ) {
            super(1, htJ);
            this.$targetVmType = hatchlingVmType;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmSwitchOperation.this.new C113242(this.$targetVmType, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r3 = 1
                if (r0 == 0) goto Ld
                if (r0 != r3) goto L59
                X.Hwg.A00(r7)
            Lc:
                return r7
            Ld:
                X.Hwg.A00(r7)
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.this
                java.lang.String r5 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.access$currentEnvId(r0)
                if (r5 != 0) goto L21
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.FailureReason.NO_CURRENT_VM
            L1c:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$Outcome r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.access$failed(r1, r0)
                return r7
            L21:
                X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpoint.$childSerializers
                com.facebook.aura.gateway.HatchlingVmType r2 = r6.$targetVmType
                com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM
                if (r2 != r0) goto L32
                com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
                boolean r1 = r0.isViewerEmployee()
                r0 = 1
                if (r1 != 0) goto L33
            L32:
                r0 = 0
            L33:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpoint r1 = new com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpoint
                r1.<init>(r5, r2, r0)
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.this
                com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore r0 = r0.store
                boolean r0 = r0.write(r1)
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.this
                if (r0 != 0) goto L4b
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.FailureReason.CHECKPOINT_FAILED
                goto L1c
            L4b:
                r0 = 0
                r6.L$0 = r0
                r6.L$1 = r0
                r6.label = r3
                java.lang.Object r7 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.access$continueWithRetries(r1, r6)
                if (r7 != r4) goto Lc
                return r4
            L59:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113242.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Outcome> htJ) {
            return ((C113242) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$switchToLeasedVm$2, reason: invalid class name and case insensitive filesystem */
    public final class C113252 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public static final C113252 INSTANCE = new C113252();

        public C113252() {
            super(1);
        }

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, AnonymousClass001.A0i(), null, false, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16777199, null);
        }
    }

    public final Object canSwitch(HtJ<? super Boolean> htJ) {
        return exclusive(new AnonymousClass2(null), htJ);
    }

    public final Object resume(HtJ<? super Outcome> htJ) {
        return exclusive(new C113232(null), htJ);
    }

    public final Object switchTo(HatchlingVmType hatchlingVmType, HtJ<? super Outcome> htJ) {
        return exclusive(new C113242(hatchlingVmType, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209 A[PHI: r0
  0x0209: PHI (r0v64 java.lang.Object) = (r0v1 java.lang.Object), (r0v65 java.lang.Object) binds: [B:100:0x0206, B:97:0x0201] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object continueSwitch(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome> r17) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.continueSwitch(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:22:0x0049, B:30:0x0067], limit reached: 36 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0064 -> B:12:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object continueWithRetries(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113191
            if (r0 == 0) goto L6e
            r8 = r11
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$continueWithRetries$1 r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113191) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r2 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L69
            if (r0 == r5) goto L35
            if (r0 != r7) goto L74
            int r4 = r8.I$0
            X.Hwg.A00(r2)
        L26:
            int r4 = r4 + 1
            r8.L$0 = r6
            r8.I$0 = r4
            r8.label = r5
            java.lang.Object r2 = r10.continueSwitch(r8)
            if (r2 != r9) goto L3a
            return r9
        L35:
            int r4 = r8.I$0
            X.Hwg.A00(r2)
        L3a:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$Outcome r2 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome) r2
            boolean r0 = r2 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome.Switched
            if (r0 != 0) goto L79
            r0 = 3
            if (r4 >= r0) goto L79
            java.util.Set<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason> r1 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.NOT_RETRYABLE_REASONS
            boolean r0 = r2 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome.Failed
            if (r0 == 0) goto L67
            r0 = r2
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$Outcome$Failed r0 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome.Failed) r0
            if (r0 == 0) goto L67
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason r0 = r0.reason
        L50:
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 != 0) goto L79
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = (long) r4
            long r0 = r0 * r2
            r8.L$0 = r6
            r8.I$0 = r4
            r8.label = r7
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            if (r0 != r9) goto L26
            return r9
        L67:
            r0 = r6
            goto L50
        L69:
            X.Hwg.A00(r2)
            r4 = 0
            goto L26
        L6e:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$continueWithRetries$1 r8 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$continueWithRetries$1
            r8.<init>(r11)
            goto L12
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.continueWithRetries(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentEnvId() {
        String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession);
        if (strA0a == null || C7BY.A0j(strA0a)) {
            return null;
        }
        return strA0a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentVmHost() {
        return HatcheryVMIdUtilsKt.extractVmHost(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object exclusive(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r7, X.HtJ<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113201
            if (r0 == 0) goto L44
            r5 = r8
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113201) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L4a
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<T of com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.exclusive>"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            return r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.singleFlight
            r0 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$result$1 r1 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$result$1
            r1.<init>(r7, r0)
            r5.L$0 = r0
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L44:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$exclusive$1
            r5.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.exclusive(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isLive(java.lang.String r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113211
            if (r0 == 0) goto L66
            r4 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$isLive$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113211) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L56
            if (r0 != r2) goto L6c
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r3 = 0
            if (r0 == 0) goto L2b
            r1 = r3
        L2b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L65
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3f
        L39:
            r2 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3f:
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.store.VmEntryV2Json r0 = (com.facebook.aura.gateway.store.VmEntryV2Json) r0
            boolean r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.hasEnvId(r0, r6)
            if (r0 == 0) goto L43
            goto L3a
        L56:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository r0 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            r4.L$0 = r6
            r4.label = r2
            java.lang.Object r1 = r0.m966fetchLiveVmsIoAF18A(r4)
            if (r1 != r3) goto L25
        L65:
            return r3
        L66:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$isLive$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$isLive$1
            r4.<init>(r7)
            goto L12
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.isLive(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object leaseTarget(HatchlingVmType hatchlingVmType, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
        return HatchVmRepository.INSTANCE.leaseAndCacheVm(this.userSession, hatchlingVmType, VmFetchSource.CONFIDENTIAL_VM_SWITCH, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refuse(boolean r6, X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113221
            if (r0 == 0) goto L4a
            r4 = r7
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$refuse$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.C113221) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L50
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore r0 = r5.store
            boolean r0 = r0.clear()
            if (r0 != 0) goto L2f
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.FailureReason.CHECKPOINT_FAILED
        L2a:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$Outcome r0 = r5.failed(r0)
            return r0
        L2f:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$FailureReason r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.FailureReason.REPLACE_REFUSED
            goto L2a
        L32:
            X.Hwg.A00(r1)
            if (r6 == 0) goto L20
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$Companion r1 = com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.Companion
            X.CGz r0 = r5.userSession
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r0 = r1.getInstance(r0)
            r4.Z$0 = r6
            r4.label = r2
            java.lang.Object r0 = r0.clearAllConversations(r4)
            if (r0 != r3) goto L20
            return r3
        L4a:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$refuse$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$refuse$1
            r4.<init>(r7)
            goto L12
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.refuse(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object switchToLeasedVm(HatchlingVmType hatchlingVmType, HtJ<? super Unit> htJ) {
        HatchGatewayPrefsStore.Companion.getInstance(this.userSession).clearForInProcessVmSwitch();
        if (!ConfidentialVmSetupGate.Companion.getInstance(this.userSession).markSelected(hatchlingVmType)) {
            CFK.A0H(TAG, "Could not persist the %s selection after the switch", hatchlingVmType);
        }
        OnboardingStateManager.Companion.getInstance(this.userSession).markCompleted();
        AuraViewerDataProvider.Companion.getInstance(this.userSession).atomicUpdate(C113252.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.singleFlight.clearAndCancelAll();
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ConfidentialVmSwitchOperation getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmSwitchOperation) abstractC3358CGz.A03(ConfidentialVmSwitchOperation.class, new ConfidentialVmSwitchOperation$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmSwitchOperation(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.store = new HatchVmTypeSwitchCheckpointStore(((CH0) abstractC3358CGz).A01);
        this.singleFlight = C3cH.A0M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Outcome failed(FailureReason failureReason) {
        CFK.A0H(TAG, "VM switch stopped: %s", failureReason);
        return new Outcome.Failed(failureReason);
    }

    public /* synthetic */ ConfidentialVmSwitchOperation(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
