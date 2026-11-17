package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.login.nativeflow.HatchReTos;
import com.facebook.aura.login.nativeflow.HatchReTosKt;
import com.facebook.aura.login.nativeflow.HatchReTosScreen;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.user.repo.AuraUserRepository;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchReTosViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final AuraActivationRepository activationRepository;
    public final C1BN<UiState> uiState;
    public final AuraUserRepository userRepository;
    public final AuraViewerDataProvider viewerDataProvider;

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchReTosViewModel$1", f = "HatchReTosViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchReTosViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchReTosViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchReTosViewModel hatchReTosViewModel = HatchReTosViewModel.this;
                C20Q c20qA01 = GDB.A01(new HatchReTosViewModel$1$invokeSuspend$$inlined$map$1(hatchReTosViewModel.viewerDataProvider.userData));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.activation.model.HatchReTosViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        UiState value;
                        HatchReTosViewModel hatchReTosViewModel2 = hatchReTosViewModel;
                        BLG<UiState> blg = hatchReTosViewModel2._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, hatchReTosViewModel2.stateFor(str, value)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return HatchReTosViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public interface Content {

        public final class Screen extends C06G implements Content {
            public final HatchReTos reTos;

            public Screen(HatchReTos hatchReTos) {
                C7384Etj.A0Y(hatchReTos, 0);
                this.reTos = hatchReTos;
            }

            public final Screen copy(HatchReTos hatchReTos) {
                C7384Etj.A0Y(hatchReTos, 0);
                return new Screen(hatchReTos);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Screen) && C7384Etj.areEqual(this.reTos, ((Screen) obj).reTos));
            }

            public static /* synthetic */ Screen copy$default(Screen screen, HatchReTos hatchReTos, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchReTos = screen.reTos;
                }
                C7384Etj.A0Y(hatchReTos, 0);
                return new Screen(hatchReTos);
            }

            public final HatchReTos component1() {
                return this.reTos;
            }

            public final HatchReTos getReTos() {
                return this.reTos;
            }

            public int hashCode() {
                return this.reTos.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Unreadable implements Content {
            public static final Unreadable INSTANCE = new Unreadable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unreadable);
            }

            public String toString() {
                return "Unreadable";
            }

            public int hashCode() {
                return 1680017850;
            }
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchReTosViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchReTosViewModel create() {
            return new HatchReTosViewModel(AuraViewerDataProvider.Companion.getInstance(this.userSession), AuraActivationRepository.Companion.getInstance(this.userSession), AuraUserRepository.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final AHD<Boolean> accepted;
        public final boolean allAccepted;
        public final boolean confirmEnabled;
        public final Content content;
        public final boolean isLoading;

        public UiState(Content content, AHD<Boolean> ahd, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(ahd, 1);
            this.content = content;
            this.accepted = ahd;
            this.allAccepted = z;
            this.confirmEnabled = z2;
            this.isLoading = z3;
        }

        public final UiState copy(Content content, AHD<Boolean> ahd, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(ahd, 1);
            return new UiState(content, ahd, z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.content, uiState.content) || !C7384Etj.areEqual(this.accepted, uiState.accepted) || this.allAccepted != uiState.allAccepted || this.confirmEnabled != uiState.confirmEnabled || this.isLoading != uiState.isLoading) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, Content content, AHD ahd, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                content = uiState.content;
            }
            if ((i & 2) != 0) {
                ahd = uiState.accepted;
            }
            if ((i & 4) != 0) {
                z = uiState.allAccepted;
            }
            if ((i & 8) != 0) {
                z2 = uiState.confirmEnabled;
            }
            if ((i & 16) != 0) {
                z3 = uiState.isLoading;
            }
            return uiState.copy(content, ahd, z, z2, z3);
        }

        public final Content component1() {
            return this.content;
        }

        public final AHD<Boolean> component2() {
            return this.accepted;
        }

        public final boolean component3() {
            return this.allAccepted;
        }

        public final boolean component4() {
            return this.confirmEnabled;
        }

        public final boolean component5() {
            return this.isLoading;
        }

        public final AHD<Boolean> getAccepted() {
            return this.accepted;
        }

        public final boolean getAllAccepted() {
            return this.allAccepted;
        }

        public final boolean getConfirmEnabled() {
            return this.confirmEnabled;
        }

        public final Content getContent() {
            return this.content;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.accepted, AnonymousClass006.A0D(this.content) * 31), this.allAccepted), this.confirmEnabled), this.isLoading);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(Content content, AHD ahd, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
            this((i & 1) != 0 ? null : content, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), C3cI.A1S(i, z3));
        }

        public UiState() {
            this(null, AHI.A01, false, false, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchReTosViewModel$onConfirm$2", f = "HatchReTosViewModel.kt", l = {130, 133, 138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchReTosViewModel$onConfirm$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchReTos $reTos;
        public int label;

        /* renamed from: com.facebook.aura.activation.model.HatchReTosViewModel$onConfirm$2$WhenMappings */
        /* loaded from: classes4.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuraActivationRepository.ReTosAcceptResult.values().length];
                try {
                    AnonymousClass002.A13(AuraActivationRepository.ReTosAcceptResult.ACCEPTED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AuraActivationRepository.ReTosAcceptResult.STALE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(AuraActivationRepository.ReTosAcceptResult.FAILED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchReTos hatchReTos, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$reTos = hatchReTos;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchReTosViewModel.this.new AnonymousClass2(this.$reTos, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            ArrayList arrayListA0i;
            BLG<UiState> blg;
            UiState value3;
            UiState uiState3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraActivationRepository auraActivationRepository = HatchReTosViewModel.this.activationRepository;
                    String str = this.$reTos.contentVersion;
                    this.label = 1;
                    obj = auraActivationRepository.acceptReTos(str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        blg = HatchReTosViewModel.this._uiState;
                        do {
                            value3 = blg.getValue();
                            uiState3 = value3;
                        } while (!blg.A6e(value3, uiState3.copy(uiState3.content, uiState3.accepted, uiState3.allAccepted, uiState3.confirmEnabled, false)));
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                int iOrdinal = ((AuraActivationRepository.ReTosAcceptResult) obj).ordinal();
                if (iOrdinal == 0) {
                    HatchReTosViewModel.this.logAcceptOutcome(HatchReTosViewModelKt.RESULT_ACCEPTED);
                    HatchReTosViewModel hatchReTosViewModel = HatchReTosViewModel.this;
                    this.label = 2;
                    if (hatchReTosViewModel.refetchOrReportFailure(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else if (iOrdinal == 1) {
                    HatchReTosViewModel.this.logAcceptOutcome(HatchReTosViewModelKt.RESULT_STALE_VERSION);
                    HatchReTosViewModel hatchReTosViewModel2 = HatchReTosViewModel.this;
                    BLG<UiState> blg2 = hatchReTosViewModel2._uiState;
                    do {
                        value2 = blg2.getValue();
                        uiState2 = value2;
                        AHD<Boolean> ahd = uiState2.accepted;
                        arrayListA0i = AnonymousClass003.A0i(ahd);
                        Iterator it = ahd.iterator();
                        while (it.hasNext()) {
                            it.next();
                            arrayListA0i.add(false);
                        }
                    } while (!blg2.A6e(value2, hatchReTosViewModel2.withAccepted(uiState2, AGI.A07(arrayListA0i))));
                    HatchReTosViewModel hatchReTosViewModel3 = HatchReTosViewModel.this;
                    this.label = 3;
                    if (hatchReTosViewModel3.refetchOrReportFailure(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    HatchReTosViewModel.this.logAcceptOutcome("error");
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
                }
                blg = HatchReTosViewModel.this._uiState;
                do {
                    value3 = blg.getValue();
                    uiState3 = value3;
                } while (!blg.A6e(value3, uiState3.copy(uiState3.content, uiState3.accepted, uiState3.allAccepted, uiState3.confirmEnabled, false)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<UiState> blg3 = HatchReTosViewModel.this._uiState;
                do {
                    value = blg3.getValue();
                    uiState = value;
                } while (!blg3.A6e(value, uiState.copy(uiState.content, uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchReTosViewModel$onRetry$2", f = "HatchReTosViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchReTosViewModel$onRetry$2, reason: invalid class name and case insensitive filesystem */
    public final class C106782 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C106782(HtJ<? super C106782> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchReTosViewModel.this.new C106782(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchReTosViewModel hatchReTosViewModel = HatchReTosViewModel.this;
                    this.label = 1;
                    if (hatchReTosViewModel.refetchOrReportFailure(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                BLG<UiState> blg = HatchReTosViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                    uiState2 = value2;
                } while (!blg.A6e(value2, uiState2.copy(uiState2.content, uiState2.accepted, uiState2.allAccepted, uiState2.confirmEnabled, false)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<UiState> blg2 = HatchReTosViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    uiState = value;
                } while (!blg2.A6e(value, uiState.copy(uiState.content, uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchReTosViewModel.this.new C106782(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchReTosViewModel", f = "HatchReTosViewModel.kt", l = {166, 169}, m = "refetchOrReportFailure", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchReTosViewModel$refetchOrReportFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C106791 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C106791(HtJ<? super C106791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchReTosViewModel.this.refetchOrReportFailure(this);
        }
    }

    public HatchReTosViewModel(AuraViewerDataProvider auraViewerDataProvider, AuraActivationRepository auraActivationRepository, AuraUserRepository auraUserRepository) {
        AnonymousClass005.A10(auraViewerDataProvider, auraActivationRepository, auraUserRepository);
        this.viewerDataProvider = auraViewerDataProvider;
        this.activationRepository = auraActivationRepository;
        this.userRepository = auraUserRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(null, AHI.A01, false, false, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        AnonymousClass001.A1I(C3cG.A0v(), new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiState stateFor(String str, UiState uiState) {
        UiState uiStateCopy;
        AHD<Boolean> ahdA07;
        Content.Unreadable unreadable;
        if (str == null) {
            unreadable = null;
        } else {
            HatchReTos reTos = HatchReTosKt.parseReTos(str);
            if (reTos != null) {
                HatchReTosScreen hatchReTosScreen = reTos.screen;
                int size = hatchReTosScreen instanceof HatchReTosScreen.Itemized ? ((HatchReTosScreen.Itemized) hatchReTosScreen).consent.items.size() : 0;
                uiStateCopy = uiState.copy(new Content.Screen(reTos), uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, uiState.isLoading);
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(false);
                }
                ahdA07 = AGI.A07(arrayList);
                return withAccepted(uiStateCopy, ahdA07);
            }
            CFK.A04(HatchReTosViewModelKt.TAG, "re-ToS block could not be drawn; holding the error screen");
            unreadable = Content.Unreadable.INSTANCE;
        }
        uiStateCopy = uiState.copy(unreadable, uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, uiState.isLoading);
        ahdA07 = AHI.A01;
        return withAccepted(uiStateCopy, ahdA07);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.model.HatchReTosViewModel.UiState withAccepted(com.facebook.aura.activation.model.HatchReTosViewModel.UiState r8, X.AHD<java.lang.Boolean> r9) {
        /*
            r7 = this;
            r6 = r9
            boolean r0 = r9.isEmpty()
            r3 = 1
            if (r0 != 0) goto L56
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L42
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L42
        L12:
            r7 = 1
        L13:
            r4 = r8
            com.facebook.aura.activation.model.HatchReTosViewModel$Content r2 = r8.content
            boolean r0 = r2 instanceof com.facebook.aura.activation.model.HatchReTosViewModel.Content.Screen
            r1 = 0
            if (r0 == 0) goto L25
            com.facebook.aura.activation.model.HatchReTosViewModel$Content$Screen r2 = (com.facebook.aura.activation.model.HatchReTosViewModel.Content.Screen) r2
            if (r2 == 0) goto L25
            com.facebook.aura.login.nativeflow.HatchReTos r0 = r2.reTos
            if (r0 == 0) goto L25
            com.facebook.aura.login.nativeflow.HatchReTosScreen r1 = r0.screen
        L25:
            boolean r0 = r1 instanceof com.facebook.aura.login.nativeflow.HatchReTosScreen.Itemized
            if (r0 == 0) goto L38
            com.facebook.aura.login.nativeflow.HatchReTosScreen$Itemized r1 = (com.facebook.aura.login.nativeflow.HatchReTosScreen.Itemized) r1
            if (r1 == 0) goto L38
            com.facebook.aura.login.nativeflow.HatchItemizedConsent r0 = r1.consent
            if (r0 == 0) goto L38
            boolean r0 = r0.allowsConfirm(r9)
            r8 = 1
            if (r0 == r3) goto L39
        L38:
            r8 = 0
        L39:
            com.facebook.aura.activation.model.HatchReTosViewModel$Content r5 = r4.content
            boolean r9 = r4.isLoading
            com.facebook.aura.activation.model.HatchReTosViewModel$UiState r0 = r4.copy(r5, r6, r7, r8, r9)
            return r0
        L42:
            java.util.Iterator r1 = r9.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L46
        L56:
            r7 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchReTosViewModel.withAccepted(com.facebook.aura.activation.model.HatchReTosViewModel$UiState, X.AHD):com.facebook.aura.activation.model.HatchReTosViewModel$UiState");
    }

    public final void onTosTokenTap(String str) {
        C7384Etj.A0Y(str, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, HatchComponent.TOS_DISCLOSURE_LINK, null, AnonymousClass007.A0c(HatchMetadataKey.TOS_KIND, str), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAcceptOutcome(String str) {
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, HatchComponent.RETOS_ACCEPT_OUTCOME, null, AnonymousClass007.A0c(HatchMetadataKey.RESULT, str), null);
    }

    private final void logToggle(boolean z, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, hatchComponent, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refetchOrReportFailure(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.activation.model.HatchReTosViewModel.C106791
            if (r0 == 0) goto L4f
            r6 = r8
            com.facebook.aura.activation.model.HatchReTosViewModel$refetchOrReportFailure$1 r6 = (com.facebook.aura.activation.model.HatchReTosViewModel.C106791) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L55
            X.Hwg.A00(r5)
        L24:
            if (r5 != 0) goto L2e
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131888921(0x7f120b19, float:1.941249E38)
            r1.showToast(r0)
        L2e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L31:
            X.Hwg.A00(r5)
            com.facebook.aura.user.repo.AuraUserRepository r0 = r7.userRepository
            r6.label = r1
            java.lang.Object r5 = r0.fetchUser(r3, r6)
            if (r5 != r4) goto L42
            return r4
        L3f:
            X.Hwg.A00(r5)
        L42:
            if (r5 != 0) goto L2e
            com.facebook.aura.user.repo.AuraUserRepository r0 = r7.userRepository
            r6.label = r2
            java.lang.Object r5 = r0.fetchUser(r3, r6)
            if (r5 != r4) goto L24
            return r4
        L4f:
            com.facebook.aura.activation.model.HatchReTosViewModel$refetchOrReportFailure$1 r6 = new com.facebook.aura.activation.model.HatchReTosViewModel$refetchOrReportFailure$1
            r6.<init>(r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchReTosViewModel.refetchOrReportFailure(X.HtJ):java.lang.Object");
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onAgreeToAllToggled(boolean z) {
        UiState value;
        UiState uiState;
        ArrayList arrayList;
        logToggle(z, HatchComponent.ITEMIZED_CONSENT_AGREE_ALL_TOGGLE);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
            int size = uiState.accepted.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Boolean.valueOf(z));
            }
        } while (!blg.A6e(value, withAccepted(uiState, AGI.A07(arrayList))));
    }

    public final void onConfirm() {
        Content.Screen screen;
        HatchReTos hatchReTos;
        HatchComponent hatchComponent;
        UiState value;
        UiState uiState;
        UiState value2 = this._uiState.getValue();
        Content content = value2.content;
        if (!(content instanceof Content.Screen) || (screen = (Content.Screen) content) == null || (hatchReTos = screen.reTos) == null || value2.isLoading) {
            return;
        }
        HatchReTosScreen hatchReTosScreen = hatchReTos.screen;
        boolean z = hatchReTosScreen instanceof HatchReTosScreen.Itemized;
        if (!z || ((HatchReTosScreen.Itemized) hatchReTosScreen).consent.allowsConfirm(value2.accepted)) {
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.ONBOARDING;
            HatchSubsurface hatchSubsurface = HatchSubsurface.ONBOARDING_POST_AUTH;
            HatchScreen hatchScreen = HatchScreen.ONBOARDING_RETOS;
            if (hatchReTosScreen instanceof HatchReTosScreen.Prose) {
                hatchComponent = HatchComponent.CONFIRM_BUTTON;
            } else {
                if (!z) {
                    throw C3cG.A0q();
                }
                hatchComponent = HatchComponent.ITEMIZED_CONSENT_CONFIRM_BUTTON;
            }
            hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, null, null);
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
                uiState = value;
            } while (!blg.A6e(value, uiState.copy(uiState.content, uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, true)));
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(hatchReTos, null), AEu.A00(this));
        }
    }

    public final void onItemToggled(int i, boolean z) {
        UiState value;
        UiState uiStateWithAccepted;
        logToggle(z, HatchComponent.ITEMIZED_CONSENT_ITEM_TOGGLE);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiStateWithAccepted = value;
            if (i >= 0 && i < uiStateWithAccepted.accepted.size()) {
                AHD<Boolean> ahd = uiStateWithAccepted.accepted;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                int i2 = 0;
                for (Object obj : ahd) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    boolean zA1X = AnonymousClass001.A1X(obj);
                    if (i2 == i) {
                        zA1X = z;
                    }
                    arrayListA0i.add(Boolean.valueOf(zA1X));
                    i2 = i3;
                }
                uiStateWithAccepted = withAccepted(uiStateWithAccepted, AGI.A07(arrayListA0i));
            }
        } while (!blg.A6e(value, uiStateWithAccepted));
    }

    public final void onRetry() {
        UiState value;
        UiState uiState;
        if (this._uiState.getValue().isLoading) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.content, uiState.accepted, uiState.allAccepted, uiState.confirmEnabled, true)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106782(null), AEu.A00(this));
    }
}
