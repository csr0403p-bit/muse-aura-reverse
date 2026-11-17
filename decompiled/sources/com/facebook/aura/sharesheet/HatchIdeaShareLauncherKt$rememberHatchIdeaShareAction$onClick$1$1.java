package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.explore.view.cards.IdeaIcon;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.toast.api.ToastApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1 extends AbstractC7559F3s implements G0U<IdeaIcon, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ IdeaCardsDataSource $dataSource;
    public final /* synthetic */ IdeaCard $idea;
    public final /* synthetic */ MutableState<Boolean> $isPreparing;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SingleFlight $singleFlight;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1", f = "HatchIdeaShareLauncher.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ IdeaCardsDataSource $dataSource;
        public final /* synthetic */ IdeaCard $idea;
        public final /* synthetic */ MutableState<Boolean> $isPreparing;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ SingleFlight $singleFlight;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1", f = "HatchIdeaShareLauncher.kt", l = {94}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03581 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ C3UX $coroutineScope;
            public final /* synthetic */ IdeaCardsDataSource $dataSource;
            public final /* synthetic */ IdeaCard $idea;
            public final /* synthetic */ MutableState<Boolean> $isPreparing;
            public final /* synthetic */ AuraNavigator $navigator;
            public Object L$0;
            public Object L$1;
            public int label;

            /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03591 extends AbstractC7559F3s implements Function0<Unit> {
                public final /* synthetic */ Context $context;
                public final /* synthetic */ C3UX $coroutineScope;
                public final /* synthetic */ IdeaCardsDataSource $dataSource;
                public final /* synthetic */ C10543Hqv<HoC> $fallbackJob;
                public final /* synthetic */ IdeaCard $idea;

                @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1", f = "HatchIdeaShareLauncher.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C03601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ Context $context;
                    public final /* synthetic */ IdeaCardsDataSource $dataSource;
                    public final /* synthetic */ IdeaCard $idea;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C03601(IdeaCardsDataSource ideaCardsDataSource, IdeaCard ideaCard, Context context, HtJ<? super C03601> htJ) {
                        super(2, htJ);
                        this.$dataSource = ideaCardsDataSource;
                        this.$idea = ideaCard;
                        this.$context = context;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new C03601(this.$dataSource, this.$idea, this.$context, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i = this.label;
                        try {
                            if (i == 0) {
                                Hwg.A00(obj);
                                HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1 hatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1 = new HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1(this.$dataSource, this.$idea, this.$context, null);
                                this.label = 1;
                                obj = GAX.A01(this, hatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1$1$1$1$1$completed$1, 60000L);
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
                                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
                            }
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception unused) {
                            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return ((C03601) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03591(C10543Hqv<HoC> c10543Hqv, C3UX c3ux, IdeaCardsDataSource ideaCardsDataSource, IdeaCard ideaCard, Context context) {
                    super(0);
                    this.$fallbackJob = c10543Hqv;
                    this.$coroutineScope = c3ux;
                    this.$dataSource = ideaCardsDataSource;
                    this.$idea = ideaCard;
                    this.$context = context;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [T, X.Hqc] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$fallbackJob.element = AnonymousClass001.A11(new C03601(this.$dataSource, this.$idea, this.$context, null), this.$coroutineScope);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03581(MutableState<Boolean> mutableState, IdeaCardsDataSource ideaCardsDataSource, IdeaCard ideaCard, AuraNavigator auraNavigator, C3UX c3ux, Context context, HtJ<? super C03581> htJ) {
                super(1, htJ);
                this.$isPreparing = mutableState;
                this.$dataSource = ideaCardsDataSource;
                this.$idea = ideaCard;
                this.$navigator = auraNavigator;
                this.$coroutineScope = c3ux;
                this.$context = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03581(this.$isPreparing, this.$dataSource, this.$idea, this.$navigator, this.$coroutineScope, this.$context, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        MutableState.A09(true, this.$isPreparing);
                        IdeaSharing ideaSharing = this.$dataSource.sharingOverrides.getValue().get(this.$idea.ideaCardId);
                        if (ideaSharing == null) {
                            ideaSharing = this.$idea.sharing;
                        }
                        if (!ideaSharing.getCanShare()) {
                            return Unit.INSTANCE;
                        }
                        C10543Hqv c10543Hqv = new C10543Hqv();
                        AuraNavigator auraNavigator = this.$navigator;
                        ShareType shareType = ShareType.IDEA;
                        IdeaCard ideaCard = this.$idea;
                        HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, null, null, null, null, null, null, ideaCard.ideaCardId, null, null, null, new C03591(c10543Hqv, this.$coroutineScope, this.$dataSource, ideaCard, this.$context));
                        HoC hoC = (HoC) c10543Hqv.element;
                        if (hoC != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (hoC.APQ(this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    MutableState.A09(false, this.$isPreparing);
                    return Unit.INSTANCE;
                } finally {
                    MutableState.A09(false, this.$isPreparing);
                }
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C03581) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleFlight singleFlight, IdeaCard ideaCard, MutableState<Boolean> mutableState, IdeaCardsDataSource ideaCardsDataSource, AuraNavigator auraNavigator, C3UX c3ux, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$singleFlight = singleFlight;
            this.$idea = ideaCard;
            this.$isPreparing = mutableState;
            this.$dataSource = ideaCardsDataSource;
            this.$navigator = auraNavigator;
            this.$coroutineScope = c3ux;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$singleFlight, this.$idea, this.$isPreparing, this.$dataSource, this.$navigator, this.$coroutineScope, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlight singleFlight = this.$singleFlight;
                IdeaCard ideaCard = this.$idea;
                String str = ideaCard.ideaCardId;
                C03581 c03581 = new C03581(this.$isPreparing, this.$dataSource, ideaCard, this.$navigator, this.$coroutineScope, this.$context, null);
                this.label = 1;
                if (singleFlight.invoke(str, c03581, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1(C3UX c3ux, SingleFlight singleFlight, IdeaCard ideaCard, MutableState<Boolean> mutableState, IdeaCardsDataSource ideaCardsDataSource, AuraNavigator auraNavigator, Context context) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$singleFlight = singleFlight;
        this.$idea = ideaCard;
        this.$isPreparing = mutableState;
        this.$dataSource = ideaCardsDataSource;
        this.$navigator = auraNavigator;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaIcon ideaIcon) {
        C3UX c3ux = this.$coroutineScope;
        AnonymousClass001.A1J(new AnonymousClass1(this.$singleFlight, this.$idea, this.$isPreparing, this.$dataSource, this.$navigator, c3ux, this.$context, null), c3ux);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaIcon ideaIcon) {
        invoke2(ideaIcon);
        return Unit.INSTANCE;
    }
}
