package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C01N;
import X.C0CD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.onboarding.OnboardingTask;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $cardClock;
    public final /* synthetic */ Function0<Float> $exitProgress;
    public final /* synthetic */ AT5<Float, AOW> $headerClock;
    public final /* synthetic */ List<OnboardingTask> $ideas;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<String, Unit> $onIdeaSelected;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ String $selectedIdeaId;
    public final /* synthetic */ String $sentMessageId;

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Float> $exitProgress;
        public final /* synthetic */ AT5<Float, AOW> $headerClock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Float> function0, AT5<Float, AOW> at5) {
            super(3);
            this.$exitProgress = function0;
            this.$headerClock = at5;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d46);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d45);
                BS0 bs0 = BRg.A00;
                BRg bRgA07 = C3U4.A07(bs0, AuraDimensKt.SpacingMicro);
                boolean zA65 = bfm.A65(this.$exitProgress);
                Function0<Float> function0 = this.$exitProgress;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                OnboardingUiFlowNameKt.OnboardingUiFlowHeader(strA01, strA012, AnonymousClass001.A0W(bRgA07, objAaT), 930, this.$headerClock, bfm, 35840, 0);
                C01N.A05(bfm, bs0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0) {
            super(3);
            this.$onRetry = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                boolean zA65 = bfm.A65(this.$onRetry);
                Function0<Unit> function0 = this.$onRetry;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$4$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                OnboardingErrorStateKt.OnboardingErrorState((Function0) objAaT, null, null, bfm, 0, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("header", null, B1V.A01(new AnonymousClass1(this.$exitProgress, this.$headerClock), 1137320265, true));
        if (this.$ideas.isEmpty()) {
            if (this.$isLoading) {
                c0cd.APJ(AuraButtonKt.LOADING_TAG, null, ComposableSingletons$OnboardingUiFlowIdeasKt.f199lambda$1304287672);
                return;
            } else {
                c0cd.APJ("error", null, B1V.A01(new AnonymousClass4(this.$onRetry), 2064490152, true));
                return;
            }
        }
        final List<OnboardingTask> list = this.$ideas;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final String str = this.$selectedIdeaId;
        final String str2 = this.$sentMessageId;
        final Function0<Float> function0 = this.$exitProgress;
        final AT5<Float, AOW> at5 = this.$cardClock;
        final G0U<String, Unit> g0u = this.$onIdeaSelected;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                OnboardingTask onboardingTask = (OnboardingTask) list.get(i);
                bfm.AgE(907833982);
                boolean zAreEqual = C7384Etj.areEqual(onboardingTask.id, str);
                BS0 bs0 = BRg.A00;
                String str3 = str2;
                if (!C7384Etj.areEqual(onboardingTask.id, str)) {
                    str3 = null;
                }
                BRg bRgMessageTransition = HatchSharedElementKt.messageTransition(bs0, str3, "reply", bfm, 390);
                boolean zA1P = AnonymousClass003.A1P(bfm, str, function0, AnonymousClass002.A1V(bfm, onboardingTask, bfm.A67(at5), (((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A63(i)) || (iA0d & 48) == 32));
                Object objAaT = bfm.AaT();
                if (zA1P || objAaT == C78N.A00) {
                    objAaT = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$2$1(at5, i, onboardingTask, str, function0);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0W = AnonymousClass001.A0W(bRgMessageTransition, objAaT);
                boolean zA1R = AnonymousClass001.A1R(bfm, g0u, bfm.A67(onboardingTask));
                Object objAaT2 = bfm.AaT();
                if (zA1R || objAaT2 == C78N.A00) {
                    objAaT2 = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$3$1(onboardingTask, g0u);
                    bfm.Ai0(objAaT2);
                }
                OnboardingUiFlowIdeasKt.OnboardingUiFlowIdeaCard(onboardingTask, zAreEqual, (Function0) objAaT2, bRgA0W, bfm, 0, 0);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1(List<OnboardingTask> list, boolean z, Function0<Float> function0, AT5<Float, AOW> at5, String str, String str2, AT5<Float, AOW> at52, G0U<? super String, Unit> g0u, Function0<Unit> function02) {
        super(1);
        this.$ideas = list;
        this.$isLoading = z;
        this.$exitProgress = function0;
        this.$headerClock = at5;
        this.$selectedIdeaId = str;
        this.$sentMessageId = str2;
        this.$cardClock = at52;
        this.$onIdeaSelected = g0u;
        this.$onRetry = function02;
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, OnboardingTask, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        public final Object invoke(int i, OnboardingTask onboardingTask) {
            C7384Etj.A0Y(onboardingTask, 1);
            return onboardingTask.id;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, OnboardingTask onboardingTask) {
            AnonymousClass005.A0w(num);
            OnboardingTask onboardingTask2 = onboardingTask;
            C7384Etj.A0Y(onboardingTask2, 1);
            return onboardingTask2.id;
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
