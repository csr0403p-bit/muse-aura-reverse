package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeCopy;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final AuraActivationRepository activationRepository;
    public final SingleFlight loadSingleFlight;
    public final C1BN<UiState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchRedeemInviteCodeViewModel> {
        public final String initialCode;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.initialCode = str;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchRedeemInviteCodeViewModel create() {
            return new HatchRedeemInviteCodeViewModel(AuraActivationRepository.Companion.getInstance(this.userSession), this.userSession, this.initialCode);
        }
    }

    public interface RedeemPhase {

        public final class Entry extends C06G implements RedeemPhase {
            public final HatchRedeemInviteCodeCopy copy;
            public final HatchRedeemInviteCodeSuccessCopy successCopy;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Entry) {
                        Entry entry = (Entry) obj;
                        if (!C7384Etj.areEqual(this.copy, entry.copy) || !C7384Etj.areEqual(this.successCopy, entry.successCopy)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Entry copy$default(Entry entry, HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchRedeemInviteCodeCopy = entry.copy;
                }
                if ((i & 2) != 0) {
                    hatchRedeemInviteCodeSuccessCopy = entry.successCopy;
                }
                AnonymousClass003.A0u(hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
                return new Entry(hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
            }

            public final HatchRedeemInviteCodeCopy component1() {
                return this.copy;
            }

            public final HatchRedeemInviteCodeSuccessCopy component2() {
                return this.successCopy;
            }

            public final HatchRedeemInviteCodeCopy getCopy() {
                return this.copy;
            }

            public final HatchRedeemInviteCodeSuccessCopy getSuccessCopy() {
                return this.successCopy;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.successCopy, AnonymousClass005.A0E(this.copy));
            }

            public Entry(HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
                AnonymousClass003.A0u(hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
                this.copy = hatchRedeemInviteCodeCopy;
                this.successCopy = hatchRedeemInviteCodeSuccessCopy;
            }

            public final Entry copy(HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
                AnonymousClass003.A0u(hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
                return new Entry(hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class LoadFailed implements RedeemPhase {
            public static final LoadFailed INSTANCE = new LoadFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadFailed);
            }

            public String toString() {
                return "LoadFailed";
            }

            public int hashCode() {
                return -771844447;
            }
        }

        public final class Loading implements RedeemPhase {
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return 145475614;
            }
        }

        public final class Redeemed extends C06G implements RedeemPhase {
            public final HatchRedeemInviteCodeSuccessCopy successCopy;

            public Redeemed(HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
                C7384Etj.A0Y(hatchRedeemInviteCodeSuccessCopy, 0);
                this.successCopy = hatchRedeemInviteCodeSuccessCopy;
            }

            public final Redeemed copy(HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
                C7384Etj.A0Y(hatchRedeemInviteCodeSuccessCopy, 0);
                return new Redeemed(hatchRedeemInviteCodeSuccessCopy);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Redeemed) && C7384Etj.areEqual(this.successCopy, ((Redeemed) obj).successCopy));
            }

            public static /* synthetic */ Redeemed copy$default(Redeemed redeemed, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchRedeemInviteCodeSuccessCopy = redeemed.successCopy;
                }
                C7384Etj.A0Y(hatchRedeemInviteCodeSuccessCopy, 0);
                return new Redeemed(hatchRedeemInviteCodeSuccessCopy);
            }

            public final HatchRedeemInviteCodeSuccessCopy component1() {
                return this.successCopy;
            }

            public final HatchRedeemInviteCodeSuccessCopy getSuccessCopy() {
                return this.successCopy;
            }

            public int hashCode() {
                return this.successCopy.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class UiState extends C06G {
        public final InviteCodeError error;
        public final String inviteCode;
        public final boolean isLoading;
        public final RedeemPhase phase;

        public UiState() {
            this("", false, null, RedeemPhase.Loading.INSTANCE);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.inviteCode, uiState.inviteCode) || this.isLoading != uiState.isLoading || !C7384Etj.areEqual(this.error, uiState.error) || !C7384Etj.areEqual(this.phase, uiState.phase)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, boolean z, InviteCodeError inviteCodeError, RedeemPhase redeemPhase, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.inviteCode;
            }
            if ((i & 2) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 4) != 0) {
                inviteCodeError = uiState.error;
            }
            if ((i & 8) != 0) {
                redeemPhase = uiState.phase;
            }
            AnonymousClass003.A0w(str, redeemPhase);
            return new UiState(str, z, inviteCodeError, redeemPhase);
        }

        public final String component1() {
            return this.inviteCode;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final InviteCodeError component3() {
            return this.error;
        }

        public final RedeemPhase component4() {
            return this.phase;
        }

        public final InviteCodeError getError() {
            return this.error;
        }

        public final String getInviteCode() {
            return this.inviteCode;
        }

        public final RedeemPhase getPhase() {
            return this.phase;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.phase, (C0KA.A01(AnonymousClass001.A0G(this.inviteCode), this.isLoading) + AnonymousClass006.A0D(this.error)) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final UiState copy(String str, boolean z, InviteCodeError inviteCodeError, RedeemPhase redeemPhase) {
            AnonymousClass003.A0w(str, redeemPhase);
            return new UiState(str, z, inviteCodeError, redeemPhase);
        }

        public String toString() {
            return super.toString();
        }

        public UiState(String str, boolean z, InviteCodeError inviteCodeError, RedeemPhase redeemPhase) {
            AnonymousClass003.A0w(str, redeemPhase);
            this.inviteCode = str;
            this.isLoading = z;
            this.error = inviteCodeError;
            this.phase = redeemPhase;
        }

        public /* synthetic */ UiState(String str, boolean z, InviteCodeError inviteCodeError, RedeemPhase redeemPhase, int i, C06H c06h) {
            this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : inviteCodeError, (i & 8) != 0 ? RedeemPhase.Loading.INSTANCE : redeemPhase);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$loadInvitePage$1", f = "HatchRedeemInviteCodeViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$loadInvitePage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$loadInvitePage$1$1", f = "HatchRedeemInviteCodeViewModel.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$loadInvitePage$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00081 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchRedeemInviteCodeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00081(HatchRedeemInviteCodeViewModel hatchRedeemInviteCodeViewModel, HtJ<? super C00081> htJ) {
                super(1, htJ);
                this.this$0 = hatchRedeemInviteCodeViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00081(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C00081(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    X.Hji r8 = X.EnumC10460Hji.A02
                    int r0 = r9.label
                    r7 = 1
                    if (r0 == 0) goto L55
                    if (r0 != r7) goto L86
                    X.Hwg.A00(r10)
                Lc:
                    com.facebook.aura.activation.data.HatchInvitePage r10 = (com.facebook.aura.activation.data.HatchInvitePage) r10
                    if (r10 == 0) goto L4b
                    com.facebook.aura.activation.data.HatchRedeemInviteCodeCopy r2 = r10.redeemScreen
                    com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy r1 = r10.redeemSuccessScreen
                    if (r2 == 0) goto L4b
                    if (r1 == 0) goto L4b
                    boolean r0 = r10.hasRedeemedInviteCode
                    if (r0 == 0) goto L45
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Redeemed r6 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Redeemed
                    r6.<init>(r1)
                L21:
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase r6 = (com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.RedeemPhase) r6
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r0 = r9.this$0
                    X.BLG<com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState> r5 = r0._uiState
                L27:
                    java.lang.Object r4 = r5.getValue()
                    r0 = r4
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r0 = (com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.UiState) r0
                    java.lang.String r3 = r0.inviteCode
                    boolean r2 = r0.isLoading
                    com.facebook.aura.activation.model.InviteCodeError r1 = r0.error
                    X.AnonymousClass003.A0w(r3, r6)
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r0 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState
                    r0.<init>(r3, r2, r1, r6)
                    boolean r0 = r5.A6e(r4, r0)
                    if (r0 == 0) goto L27
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                L45:
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Entry r6 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Entry
                    r6.<init>(r2, r1)
                    goto L21
                L4b:
                    java.lang.String r1 = "HatchRedeemInviteCodeViewModel"
                    java.lang.String r0 = "Invite page copy unavailable, showing the retry state"
                    X.CFK.A06(r1, r0)
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$LoadFailed r6 = com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.RedeemPhase.LoadFailed.INSTANCE
                    goto L21
                L55:
                    X.Hwg.A00(r10)
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r0 = r9.this$0
                    X.BLG<com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState> r6 = r0._uiState
                L5c:
                    java.lang.Object r5 = r6.getValue()
                    r0 = r5
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r0 = (com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.UiState) r0
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Loading r4 = com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.RedeemPhase.Loading.INSTANCE
                    java.lang.String r3 = r0.inviteCode
                    boolean r2 = r0.isLoading
                    com.facebook.aura.activation.model.InviteCodeError r1 = r0.error
                    X.AnonymousClass003.A0w(r3, r4)
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r0 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState
                    r0.<init>(r3, r2, r1, r4)
                    boolean r0 = r6.A6e(r5, r0)
                    if (r0 == 0) goto L5c
                    com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r0 = r9.this$0
                    com.facebook.aura.activation.repo.AuraActivationRepository r0 = r0.activationRepository
                    r9.label = r7
                    java.lang.Object r10 = r0.fetchInvitePage(r9)
                    if (r10 != r8) goto Lc
                    return r8
                L86:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.AnonymousClass1.C00081.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchRedeemInviteCodeViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchRedeemInviteCodeViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchRedeemInviteCodeViewModel hatchRedeemInviteCodeViewModel = HatchRedeemInviteCodeViewModel.this;
                SingleFlight singleFlight = hatchRedeemInviteCodeViewModel.loadSingleFlight;
                C00081 c00081 = new C00081(hatchRedeemInviteCodeViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c00081, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$onConfirmClick$2", f = "HatchRedeemInviteCodeViewModel.kt", l = {148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$onConfirmClick$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $code;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$code = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchRedeemInviteCodeViewModel.this.new AnonymousClass2(this.$code, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r7 = 0
                java.lang.String r6 = "HatchRedeemInviteCodeViewModel"
                r3 = 1
                if (r0 == 0) goto L12
                if (r0 != r3) goto Ld
                goto L25
            Ld:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L12:
                X.Hwg.A00(r9)
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r0 = com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.this     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                com.facebook.aura.activation.repo.AuraActivationRepository r2 = r0.activationRepository     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                java.lang.String r1 = r8.$code     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                r8.label = r3     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                r0 = 0
                java.lang.Object r9 = r2.redeemInviteCode(r1, r3, r0, r8)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                if (r9 != r4) goto L28
                return r4
            L25:
                X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
            L28:
                com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult r9 = (com.facebook.aura.activation.repo.AuraActivationRepository.RedeemInviteCodeResult) r9     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L89
                if (r9 == 0) goto L42
                boolean r0 = r9.success
                if (r0 != 0) goto L46
                java.lang.String r0 = r9.error
                java.lang.String r0 = com.facebook.aura.activation.repo.InviteCodeServerErrorKt.parseInviteCodeServerErrorMessage(r0)
                com.facebook.aura.activation.model.InviteCodeError$Invalid r7 = new com.facebook.aura.activation.model.InviteCodeError$Invalid
                r7.<init>(r0)
                goto L44
            L3c:
                r1 = move-exception
                java.lang.String r0 = "Invite code redemption threw"
                X.CFK.A08(r6, r0, r1)
            L42:
                com.facebook.aura.activation.model.InviteCodeError$Generic r7 = com.facebook.aura.activation.model.InviteCodeError.Generic.INSTANCE
            L44:
                com.facebook.aura.activation.model.InviteCodeError r7 = (com.facebook.aura.activation.model.InviteCodeError) r7
            L46:
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r0 = com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.this
                X.BLG<com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState> r5 = r0._uiState
            L4a:
                java.lang.Object r4 = r5.getValue()
                r1 = r4
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r1 = (com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.UiState) r1
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase r3 = r1.phase
                if (r7 != 0) goto L62
                boolean r0 = r3 instanceof com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.RedeemPhase.Entry
                if (r0 == 0) goto L62
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Entry r3 = (com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.RedeemPhase.Entry) r3
                com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy r0 = r3.successCopy
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Redeemed r3 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$RedeemPhase$Redeemed
                r3.<init>(r0)
            L62:
                java.lang.String r2 = r1.inviteCode
                r1 = 0
                X.AnonymousClass003.A0w(r2, r3)
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState r0 = new com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel$UiState
                r0.<init>(r2, r1, r7, r3)
                boolean r0 = r5.A6e(r4, r0)
                if (r0 == 0) goto L4a
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel r1 = com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.this
                if (r7 != 0) goto L86
                java.lang.String r0 = "success"
            L79:
                com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.access$logRedemptionResult(r1, r0)
                if (r7 != 0) goto L83
                java.lang.String r0 = "Invite code redeemed from settings"
                X.CFK.A05(r6, r0)
            L83:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L86:
                java.lang.String r0 = "error"
                goto L79
            L89:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onInviteCodeChange(String str) {
        String strNormalizeInviteCodeInput;
        UiState value;
        UiState uiState;
        UiState uiState2;
        C7384Etj.A0Y(str, 0);
        if (this._uiState.getValue().isLoading || (strNormalizeInviteCodeInput = InviteCodeKt.normalizeInviteCodeInput(str)) == null) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
            if (strNormalizeInviteCodeInput.equals(uiState.inviteCode)) {
                uiState2 = uiState;
            } else {
                boolean z = uiState.isLoading;
                RedeemPhase redeemPhase = uiState.phase;
                C7384Etj.A0Y(redeemPhase, 3);
                uiState2 = new UiState(strNormalizeInviteCodeInput, z, null, redeemPhase);
            }
        } while (!blg.A6e(value, uiState2));
        String str2 = uiState.inviteCode;
        if (strNormalizeInviteCodeInput.length() != 6 || str2.length() >= 6) {
            return;
        }
        onConfirmClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logRedemptionResult(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.REDEEM_INVITE_CODE, HatchScreen.REDEEM_INVITE_CODE, HatchComponent.INVITE_CODE_FORM, null, AnonymousClass007.A0c(HatchMetadataKey.RESULT, str), null);
    }

    private final void logSubmit() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.REDEEM_INVITE_CODE, HatchScreen.REDEEM_INVITE_CODE, HatchComponent.INVITE_CODE_FORM, null, null, null);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onConfirmClick() {
        UiState value;
        String str;
        RedeemPhase redeemPhase;
        UiState value2 = this._uiState.getValue();
        String str2 = value2.inviteCode;
        if (value2.isLoading || !(value2.phase instanceof RedeemPhase.Entry) || str2.length() < 6) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            str = uiState.inviteCode;
            redeemPhase = uiState.phase;
            AnonymousClass003.A0w(str, redeemPhase);
        } while (!blg.A6e(value, new UiState(str, true, null, redeemPhase)));
        logSubmit();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str2, null), AEu.A00(this));
    }

    public HatchRedeemInviteCodeViewModel(AuraActivationRepository auraActivationRepository, AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1b = AnonymousClass004.A1b(auraActivationRepository, abstractC3358CGz);
        this.activationRepository = auraActivationRepository;
        this.loadSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, zA1b);
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(str != null ? str.toUpperCase(Locale.ROOT) : "", zA1b, null, RedeemPhase.Loading.INSTANCE));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        loadInvitePage();
    }

    private final void loadInvitePage() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final void onRetryClick() {
        loadInvitePage();
    }
}
