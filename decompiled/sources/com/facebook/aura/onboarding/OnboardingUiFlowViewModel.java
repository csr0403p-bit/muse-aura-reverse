package com.facebook.aura.onboarding;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.BLL;
import X.BQI;
import X.C0943AIw;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C7LE;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.onboarding.OnboardingUiFlowEffect;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.utils.HatchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowViewModel extends AEs {
    public final C3Em<OnboardingUiFlowEffect> _effects;
    public final BLG<OnboardingUiFlowUiState> _uiState;
    public final OnboardingCompletionRepository completionRepository;
    public HoC connectedTrackingJob;
    public final HatchConnectorCatalogRepository connectorCatalog;
    public final C22I<OnboardingUiFlowEffect> effects;
    public final OnboardingGreetingVideo greetingVideo;
    public final OnboardingIdentityRepository identityRepository;
    public final OnboardingTasksRepository tasksRepository;
    public final C1BN<OnboardingUiFlowUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$1", f = "OnboardingUiFlowViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final OnboardingUiFlowViewModel onboardingUiFlowViewModel = OnboardingUiFlowViewModel.this;
                C1BN<BQI<String>> c1bn = onboardingUiFlowViewModel.connectorCatalog.connectingIds;
                C20Z<? super BQI<String>> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.1.1
                    public final Object emit(BQI<String> bqi, HtJ<? super Unit> htJ) {
                        OnboardingUiFlowUiState value;
                        BLG<OnboardingUiFlowUiState> blg = onboardingUiFlowViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, false, null, null, null, null, false, false, false, null, null, bqi, null, 24575, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((BQI<String>) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$2", f = "OnboardingUiFlowViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AuraUserData> c1bn = AuraViewerDataProvider.Companion.getInstance(OnboardingUiFlowViewModel.this.userSession).userData;
                final OnboardingUiFlowViewModel onboardingUiFlowViewModel = OnboardingUiFlowViewModel.this;
                C20Z<? super AuraUserData> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.2.1
                    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.user.provider.AuraUserData r20, X.HtJ<? super kotlin.Unit> r21) {
                        /*
                            r19 = this;
                            r5 = 0
                            r0 = r20
                            if (r20 == 0) goto L4e
                            java.lang.String r0 = r0.profileName
                            if (r0 == 0) goto L4e
                            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
                            if (r1 == 0) goto L4e
                            r0 = 32
                            java.lang.String r3 = X.C7BY.A0S(r1, r1, r0)
                        L15:
                            r0 = r19
                            com.facebook.aura.onboarding.OnboardingUiFlowViewModel r0 = r1
                            X.BLG<com.facebook.aura.onboarding.OnboardingUiFlowUiState> r2 = r0._uiState
                        L1b:
                            java.lang.Object r1 = r2.getValue()
                            r4 = r1
                            com.facebook.aura.onboarding.OnboardingUiFlowUiState r4 = (com.facebook.aura.onboarding.OnboardingUiFlowUiState) r4
                            if (r3 == 0) goto L2b
                            int r0 = r3.length()
                            r6 = r3
                            if (r0 > 0) goto L2c
                        L2b:
                            r6 = r5
                        L2c:
                            r20 = 32765(0x7ffd, float:4.5914E-41)
                            r8 = 0
                            r7 = r5
                            r9 = r5
                            r10 = r5
                            r11 = r5
                            r12 = r5
                            r13 = r8
                            r14 = r8
                            r15 = r8
                            r16 = r5
                            r17 = r5
                            r18 = r5
                            r19 = r5
                            r21 = r5
                            com.facebook.aura.onboarding.OnboardingUiFlowUiState r0 = com.facebook.aura.onboarding.OnboardingUiFlowUiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                            boolean r0 = r2.A6e(r1, r0)
                            if (r0 == 0) goto L1b
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L4e:
                            r3 = r5
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.AnonymousClass2.AnonymousClass1.emit(com.facebook.aura.user.provider.AuraUserData, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AuraUserData) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$3", f = "OnboardingUiFlowViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingUiFlowViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            OnboardingUiFlowUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(1500L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BLG<OnboardingUiFlowUiState> blg = OnboardingUiFlowViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, true, null, null, null, null, false, false, false, null, null, null, null, 32759, null)));
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<OnboardingUiFlowViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public OnboardingUiFlowViewModel create() {
            return new OnboardingUiFlowViewModel(this.userSession, OnboardingIdentityRepository.Companion.getInstance(), OnboardingTasksRepository.Companion.getInstance(), OnboardingCompletionRepository.Companion.getInstance());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$complete$2", f = "OnboardingUiFlowViewModel.kt", l = {302, 304, 323}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$complete$2, reason: invalid class name and case insensitive filesystem */
    public final class C127922 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ OnboardingTask $idea;
        public final /* synthetic */ String $messageText;
        public final /* synthetic */ OnboardingUiFlowUiState $state;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ OnboardingUiFlowViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127922(OnboardingTask onboardingTask, Context context, OnboardingUiFlowViewModel onboardingUiFlowViewModel, String str, OnboardingUiFlowUiState onboardingUiFlowUiState, HtJ<? super C127922> htJ) {
            super(2, htJ);
            this.$idea = onboardingTask;
            this.$context = context;
            this.this$0 = onboardingUiFlowViewModel;
            this.$messageText = str;
            this.$state = onboardingUiFlowUiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127922(this.$idea, this.$context, this.this$0, this.$messageText, this.$state, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011c -> B:8:0x0017). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0130 -> B:8:0x0017). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.C127922.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127922) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$loadIdeas$2", f = "OnboardingUiFlowViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$loadIdeas$2, reason: invalid class name and case insensitive filesystem */
    public final class C127932 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C127932(HtJ<? super C127932> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new C127932(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingUiFlowViewModel.this.new C127932(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            OnboardingUiFlowUiState value;
            OnboardingUiFlowUiState onboardingUiFlowUiState;
            Object suggestedTasks = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(suggestedTasks);
                OnboardingUiFlowViewModel onboardingUiFlowViewModel = OnboardingUiFlowViewModel.this;
                OnboardingTasksRepository onboardingTasksRepository = onboardingUiFlowViewModel.tasksRepository;
                AbstractC3358CGz abstractC3358CGz = onboardingUiFlowViewModel.userSession;
                this.label = 1;
                suggestedTasks = onboardingTasksRepository.getSuggestedTasks(abstractC3358CGz, this);
                if (suggestedTasks == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(suggestedTasks);
            }
            List list = (List) suggestedTasks;
            BLG<OnboardingUiFlowUiState> blg = OnboardingUiFlowViewModel.this._uiState;
            do {
                value = blg.getValue();
                onboardingUiFlowUiState = value;
            } while (!blg.A6e(value, list == null ? OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiState, null, null, null, false, null, null, null, null, false, false, false, null, null, null, null, 32511, null) : OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiState, null, null, null, false, null, null, AGI.A07(list), null, false, false, false, null, null, null, null, 32447, null)));
            if (list != null) {
                OnboardingUiFlowViewModel.this.trackConnectedConnectors(list);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$loadIdentity$1", f = "OnboardingUiFlowViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$loadIdentity$1, reason: invalid class name and case insensitive filesystem */
    public final class C127941 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C127941(HtJ<? super C127941> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new C127941(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingUiFlowViewModel.this.new C127941(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            OnboardingUiFlowUiState value;
            OnboardingUiFlowUiState onboardingUiFlowUiState;
            OnboardingAvatarOption onboardingAvatarOption;
            String str;
            OnboardingUiFlowUiState value2;
            Object identity = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(identity);
                OnboardingUiFlowViewModel onboardingUiFlowViewModel = OnboardingUiFlowViewModel.this;
                OnboardingIdentityRepository onboardingIdentityRepository = onboardingUiFlowViewModel.identityRepository;
                AbstractC3358CGz abstractC3358CGz = onboardingUiFlowViewModel.userSession;
                this.label = 1;
                identity = onboardingIdentityRepository.getIdentity(abstractC3358CGz, this);
                if (identity == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(identity);
            }
            OnboardingIdentity onboardingIdentity = (OnboardingIdentity) identity;
            if (onboardingIdentity == null) {
                BLG<OnboardingUiFlowUiState> blg = OnboardingUiFlowViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, OnboardingUiFlowUiState.copy$default(value2, null, null, null, true, null, null, null, null, false, false, false, null, null, null, null, 32759, null)));
            } else {
                List<String> list = onboardingIdentity.assistantNames;
                ArrayList arrayListA0h = C3cG.A0h();
                for (String str2 : list) {
                    AnonymousClass006.A1F(str2, str2, arrayListA0h);
                }
                List listA0m = C3cG.A0m(arrayListA0h);
                OnboardingAvatarOption onboardingAvatarOption2 = (OnboardingAvatarOption) AbstractC0878AGe.A0G(onboardingIdentity.avatars);
                if (onboardingAvatarOption2 != null) {
                    HatchIdentityProvider.Companion.getInstance(OnboardingUiFlowViewModel.this.userSession).prefetchAvatar(onboardingAvatarOption2.uri);
                }
                BLG<OnboardingUiFlowUiState> blg2 = OnboardingUiFlowViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    onboardingUiFlowUiState = value;
                    onboardingAvatarOption = (OnboardingAvatarOption) AbstractC0878AGe.A0G(onboardingIdentity.avatars);
                    str = onboardingUiFlowUiState.agentName;
                    if (str.length() == 0 && (str = (String) AbstractC0878AGe.A0G(listA0m)) == null) {
                        str = "";
                    }
                } while (!blg2.A6e(value, OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiState, null, null, onboardingAvatarOption, true, str, AGI.A07(listA0m), null, null, false, false, false, null, null, null, null, 32707, null)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$onFinish$2", f = "OnboardingUiFlowViewModel.kt", l = {260}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$onFinish$2, reason: invalid class name and case insensitive filesystem */
    public final class C127952 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127952(String str, HtJ<? super C127952> htJ) {
            super(2, htJ);
            this.$connectorId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingUiFlowViewModel.this.new C127952(this.$connectorId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Em<OnboardingUiFlowEffect> c3Em = OnboardingUiFlowViewModel.this._effects;
                OnboardingUiFlowEffect.OpenConnector openConnector = new OnboardingUiFlowEffect.OpenConnector(this.$connectorId);
                this.label = 1;
                if (c3Em.emit(openConnector, this) == enumC10460Hji) {
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
            return ((C127952) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel", f = "OnboardingUiFlowViewModel.kt", l = {360}, m = "submitIdea", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$submitIdea$1, reason: invalid class name and case insensitive filesystem */
    public final class C127961 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C127961(HtJ<? super C127961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingUiFlowViewModel.this.submitIdea(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1", f = "OnboardingUiFlowViewModel.kt", l = {193}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1, reason: invalid class name and case insensitive filesystem */
    public final class C127971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<String> $connectorIds;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ OnboardingUiFlowViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127971(List<String> list, OnboardingUiFlowViewModel onboardingUiFlowViewModel, HtJ<? super C127971> htJ) {
            super(2, htJ);
            this.$connectorIds = list;
            this.this$0 = onboardingUiFlowViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C127971 c127971 = new C127971(this.$connectorIds, this.this$0, htJ);
            c127971.L$0 = obj;
            return c127971;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (HatchUtils.INSTANCE.isAgentOnboardingConnectorStepEnabled()) {
                    List<String> list = this.$connectorIds;
                    OnboardingUiFlowViewModel onboardingUiFlowViewModel = this.this$0;
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (String str : list) {
                        if (onboardingUiFlowViewModel.connectorCatalog.getCachedConnector(str) == null) {
                            arrayListA0h.add(str);
                        }
                    }
                    OnboardingUiFlowViewModel onboardingUiFlowViewModel2 = this.this$0;
                    Iterator it = arrayListA0h.iterator();
                    while (it.hasNext()) {
                        AnonymousClass001.A1J(new OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1(onboardingUiFlowViewModel2, AnonymousClass005.A0j(it), null), c3ux);
                    }
                }
                List<String> list2 = this.$connectorIds;
                OnboardingUiFlowViewModel onboardingUiFlowViewModel3 = this.this$0;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayListA0i.add(onboardingUiFlowViewModel3.connectorCatalog.observeConnector(AnonymousClass005.A0j(it2)));
                }
                OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1 onboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1 = new OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayListA0i).toArray(new C20Q[0]), this.$connectorIds);
                final OnboardingUiFlowViewModel onboardingUiFlowViewModel4 = this.this$0;
                C20Z<? super BQI<? extends String>> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.trackConnectedConnectors.1.5
                    public final Object emit(BQI<String> bqi, HtJ<? super Unit> htJ) {
                        OnboardingUiFlowUiState value;
                        BLG<OnboardingUiFlowUiState> blg = onboardingUiFlowViewModel4._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, false, null, null, null, null, false, false, false, null, bqi, null, null, 28671, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((BQI<String>) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (onboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1.collect(c20z, this) == enumC10460Hji) {
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
            return ((C127971) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnboardingUiFlowViewModel(AbstractC3358CGz abstractC3358CGz, OnboardingIdentityRepository onboardingIdentityRepository, OnboardingTasksRepository onboardingTasksRepository, OnboardingCompletionRepository onboardingCompletionRepository) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AnonymousClass005.A11(onboardingIdentityRepository, onboardingTasksRepository, onboardingCompletionRepository, 1);
        this.userSession = abstractC3358CGz;
        this.identityRepository = onboardingIdentityRepository;
        this.tasksRepository = onboardingTasksRepository;
        this.completionRepository = onboardingCompletionRepository;
        this.greetingVideo = new OnboardingGreetingVideo(OnboardingAssetPrefetchRepo.Companion.getInstance().greetingVideoUrl());
        OnboardingUiFlowStep onboardingUiFlowStep = OnboardingUiFlowStep.NAME;
        AHI ahi = AHI.A01;
        C0943AIw c0943AIw = C0943AIw.A03;
        C9286GCn c9286GCnA14 = C3cG.A14(new OnboardingUiFlowUiState(onboardingUiFlowStep, null, null, false, "", ahi, ahi, null, true, false, false, null, c0943AIw, c0943AIw, c0943AIw));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 0);
        this._effects = c9290GCr;
        this.effects = C3pd.A00(c9290GCr);
        this.connectorCatalog = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
        loadIdentity();
        loadIdeas();
        GAo.A02(num, c6ys, new AnonymousClass3(null), AEu.A00(this));
    }

    public final void onAgentNameChange(String str) {
        OnboardingUiFlowUiState value;
        OnboardingUiFlowUiState onboardingUiFlowUiState;
        StringBuilder sbA0w;
        C7384Etj.A0Y(str, 0);
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            onboardingUiFlowUiState = value;
            sbA0w = C60O.A0w();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!C7LE.A00(cCharAt)) {
                    sbA0w.append(cCharAt);
                }
            }
        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiState, null, null, null, false, sbA0w.toString(), null, null, null, false, false, false, null, null, null, null, 32751, null)));
    }

    public final void onIdeaSelected(String str) {
        OnboardingUiFlowUiState value;
        OnboardingUiFlowUiState onboardingUiFlowUiStateCopy$default;
        C7384Etj.A0Y(str, 0);
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            onboardingUiFlowUiStateCopy$default = value;
            if (!onboardingUiFlowUiStateCopy$default.isSubmitting && !onboardingUiFlowUiStateCopy$default.isCompleted) {
                onboardingUiFlowUiStateCopy$default = OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiStateCopy$default, null, null, null, false, null, null, null, str, false, false, false, null, null, null, null, 32639, null);
            }
        } while (!blg.A6e(value, onboardingUiFlowUiStateCopy$default));
    }

    public final void onNameSuggestionSelected(String str) {
        OnboardingUiFlowUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, false, str, null, null, null, false, false, false, null, null, null, null, 32751, null)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingUiFlowStep.values().length];
            try {
                AnonymousClass002.A13(OnboardingUiFlowStep.NAME, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(OnboardingUiFlowStep.IDEAS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void complete(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingTask onboardingTask, Context context, String str) {
        OnboardingUiFlowUiState value;
        if (onboardingUiFlowUiState.isSubmitting || onboardingUiFlowUiState.isCompleted) {
            return;
        }
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, false, null, null, null, null, false, true, false, null, null, null, null, 32255, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C127922(onboardingTask, context, this, str, onboardingUiFlowUiState, null), AEu.A00(this));
    }

    public static /* synthetic */ void complete$default(OnboardingUiFlowViewModel onboardingUiFlowViewModel, OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingTask onboardingTask, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            onboardingTask = null;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        onboardingUiFlowViewModel.complete(onboardingUiFlowUiState, onboardingTask, context, str);
    }

    private final void loadIdeas() {
        OnboardingUiFlowUiState value;
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, null, null, null, false, null, null, null, null, true, false, false, null, null, null, null, 32511, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C127932(null), AEu.A00(this));
    }

    private final void logSkipClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_TASKS, HatchScreen.ONBOARDING_TASKS, HatchComponent.CONTINUE_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.ACTION.getValue(), "skip"), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persistCompletion() {
        try {
            OnboardingStateManager companion = OnboardingStateManager.Companion.getInstance(this.userSession);
            companion.markCompleted();
            companion.clearSelectedVariant();
        } catch (Exception e) {
            CFK.A0A("OnboardingUiFlow", "Failed to persist completed onboarding", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitIdea(android.content.Context r42, com.facebook.aura.onboarding.OnboardingTask r43, java.lang.String r44, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r45, X.HtJ<? super java.lang.Boolean> r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingUiFlowViewModel.submitIdea(android.content.Context, com.facebook.aura.onboarding.OnboardingTask, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    public final C22I<OnboardingUiFlowEffect> getEffects() {
        return this.effects;
    }

    public final OnboardingGreetingVideo getGreetingVideo() {
        return this.greetingVideo;
    }

    public final C1BN<OnboardingUiFlowUiState> getUiState() {
        return this.uiState;
    }

    public final boolean onBack() {
        OnboardingUiFlowUiState value;
        int iOrdinal = this._uiState.getValue().step.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        OnboardingUiFlowStep onboardingUiFlowStep = OnboardingUiFlowStep.NAME;
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(value, onboardingUiFlowStep, null, null, false, null, null, null, null, false, false, false, null, null, null, null, 32766, null)));
        return true;
    }

    public final void onContinueFromName() {
        OnboardingUiFlowUiState value;
        OnboardingUiFlowUiState onboardingUiFlowUiStateCopy$default;
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            onboardingUiFlowUiStateCopy$default = value;
            if (onboardingUiFlowUiStateCopy$default.step == OnboardingUiFlowStep.NAME && (!C7BY.A0j(onboardingUiFlowUiStateCopy$default.agentName))) {
                onboardingUiFlowUiStateCopy$default = OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiStateCopy$default, OnboardingUiFlowStep.IDEAS, null, null, false, null, null, null, null, false, false, false, null, null, null, null, 32766, null);
            }
        } while (!blg.A6e(value, onboardingUiFlowUiStateCopy$default));
    }

    public final void onFinish(Context context, String str) {
        OnboardingUiFlowUiState value;
        OnboardingUiFlowUiState onboardingUiFlowUiState;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        OnboardingUiFlowUiState value2 = this._uiState.getValue();
        OnboardingTask selectedIdea = value2.getSelectedIdea();
        if (selectedIdea != null) {
            String pendingConnectorId = value2.getPendingConnectorId();
            if (pendingConnectorId == null) {
                complete(value2, selectedIdea, context.getApplicationContext(), str);
                return;
            }
            BLG<OnboardingUiFlowUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                onboardingUiFlowUiState = value;
            } while (!blg.A6e(value, OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiState, null, null, null, zA1b, null, null, null, null, zA1b, zA1b, zA1b, null, null, null, AGI.A09(BGK.A02(selectedIdea.id, onboardingUiFlowUiState.connectorPresentedIdeaIds)), 16383, null)));
            AnonymousClass001.A1J(new C127952(pendingConnectorId, null), AEu.A00(this));
        }
    }

    public final void onRegenerateName() {
        OnboardingUiFlowUiState value;
        OnboardingUiFlowUiState onboardingUiFlowUiStateCopy$default;
        BLG<OnboardingUiFlowUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            onboardingUiFlowUiStateCopy$default = value;
            AHD<String> ahd = onboardingUiFlowUiStateCopy$default.nameSuggestions;
            if (!ahd.isEmpty()) {
                String str = onboardingUiFlowUiStateCopy$default.agentName;
                StringBuilder sbA0w = C60O.A0w();
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (!C7LE.A00(cCharAt)) {
                        sbA0w.append(cCharAt);
                    }
                }
                String string = sbA0w.toString();
                Iterator it = ahd.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    String strA0j = AnonymousClass005.A0j(it);
                    StringBuilder sbA0w2 = C60O.A0w();
                    for (int i3 = 0; i3 < strA0j.length(); i3++) {
                        char cCharAt2 = strA0j.charAt(i3);
                        if (!C7LE.A00(cCharAt2)) {
                            sbA0w2.append(cCharAt2);
                        }
                    }
                    if (sbA0w2.toString().equals(string)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                onboardingUiFlowUiStateCopy$default = OnboardingUiFlowUiState.copy$default(onboardingUiFlowUiStateCopy$default, null, null, null, false, (String) ahd.get((i2 + 1) % ahd.size()), null, null, null, false, false, false, null, null, null, null, 32751, null);
            }
        } while (!blg.A6e(value, onboardingUiFlowUiStateCopy$default));
    }

    private final void loadIdentity() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C127941(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackConnectedConnectors(List<OnboardingTask> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<OnboardingTask> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().connectorId;
            if (str != null) {
                arrayListA0h.add(str);
            }
        }
        List listA0m = C3cG.A0m(arrayListA0h);
        HtJ htJA13 = AnonymousClass006.A13(this.connectedTrackingJob);
        if (listA0m.isEmpty()) {
            return;
        }
        this.connectedTrackingJob = AnonymousClass001.A11(new C127971(listA0m, this, htJA13), AEu.A00(this));
    }

    public final void onSkip() {
        logSkipClick();
        complete(this._uiState.getValue(), null, null, "");
    }

    public final void retryIdeas() {
        loadIdeas();
    }
}
