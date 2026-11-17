package com.facebook.aura.feedback.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.feedback.FeedbackEntityType;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.feedback.view.HatchFeedbackViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedbackWriteSheetKt {
    public static final int REASON_INPUT_MAX_LINES = 6;

    /* renamed from: com.facebook.aura.feedback.view.FeedbackWriteSheetKt$FeedbackWriteSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FeedbackWriteSheetKey $navKey;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AtomicBoolean $submitted;
        public final /* synthetic */ String $trimmedReason;
        public final /* synthetic */ HatchFeedbackViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, FeedbackWriteSheetKey feedbackWriteSheetKey, AtomicBoolean atomicBoolean, HatchFeedbackViewModel hatchFeedbackViewModel, AuraNavigator auraNavigator) {
            super(2);
            this.$trimmedReason = str;
            this.$navKey = feedbackWriteSheetKey;
            this.$submitted = atomicBoolean;
            this.$viewModel = hatchFeedbackViewModel;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                String str = this.$trimmedReason;
                FeedbackWriteSheetKey feedbackWriteSheetKey = this.$navKey;
                AtomicBoolean atomicBoolean = this.$submitted;
                HatchFeedbackViewModel hatchFeedbackViewModel = this.$viewModel;
                AuraNavigator auraNavigator = this.$navigator;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202a3);
                boolean zA1N = AnonymousClass002.A1N(str.length());
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
                boolean zA1S = AnonymousClass004.A1S(bfm, str, auraNavigator, AnonymousClass005.A1S(bfm, feedbackWriteSheetKey, atomicBoolean, hatchFeedbackViewModel));
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new FeedbackWriteSheetKt$FeedbackWriteSheet$2$1$1$1(feedbackWriteSheetKey, atomicBoolean, hatchFeedbackViewModel, str, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleA0h, auraButtonSize, null, false, false, zA1N, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingMedium, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.feedback.view.FeedbackWriteSheetKt$FeedbackWriteSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $reason$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableState<String> mutableState) {
            super(3);
            this.$reason$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                String strA05 = MutableState.A05(this.$reason$delegate);
                BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingLarge);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$FeedbackWriteSheetKt.f58lambda$1192276375;
                MutableState<String> mutableState = this.$reason$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new FeedbackWriteSheetKt$FeedbackWriteSheet$3$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraTextInputKt.AuraTextInput(strA05, null, bRgA07, g0v, null, null, null, null, false, 6, 0, null, null, null, null, false, false, false, false, null, (G0U) objAaT, bfm, 805309440, 0, 6, 1048050);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.feedback.view.FeedbackWriteSheetKt$FeedbackWriteSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ FeedbackWriteSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FeedbackWriteSheetKey feedbackWriteSheetKey, int i) {
            super(2);
            this.$navKey = feedbackWriteSheetKey;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            FeedbackWriteSheetKt.FeedbackWriteSheet(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void FeedbackWriteSheet(FeedbackWriteSheetKey feedbackWriteSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(feedbackWriteSheetKey, 0);
        bfm.AgG(-1371375526);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, feedbackWriteSheetKey) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchFeedbackViewModel.Factory factory = new HatchFeedbackViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchFeedbackViewModel hatchFeedbackViewModel = (HatchFeedbackViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchFeedbackViewModel.class));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState = (MutableState) objAaT;
            String strA06 = MutableState.A06(mutableState);
            boolean zA65 = bfm.A65(feedbackWriteSheetKey);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new AtomicBoolean(false);
                bfm.Ai0(objAaT2);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT2;
            boolean zA1S = AnonymousClass005.A1S(bfm, atomicBoolean, auraNavigatorA0b, feedbackWriteSheetKey);
            Object objAaT3 = bfm.AaT();
            if (zA1S || objAaT3 == obj) {
                objAaT3 = new FeedbackWriteSheetKt$FeedbackWriteSheet$1$1(atomicBoolean, auraNavigatorA0b, feedbackWriteSheetKey);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A19(bfm, objAaT3, auraNavigatorA0b, feedbackWriteSheetKey);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029f), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass2(strA06, feedbackWriteSheetKey, atomicBoolean, hatchFeedbackViewModel, auraNavigatorA0b), 5926465), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(mutableState), 1172158973), bfm, 24582, 48, 2022);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(feedbackWriteSheetKey, i);
        }
    }

    public static final void logIdeaWriteSheetClosed(FeedbackWriteSheetKey feedbackWriteSheetKey) {
        if (C7384Etj.areEqual(feedbackWriteSheetKey.entityType, FeedbackEntityType.IDEA)) {
            IdeaFeedbackAnalytics.INSTANCE.logWriteSheetDismiss$fbandroid_express_aura_java_com_facebook_aura_feedback_view_view(feedbackWriteSheetKey.entityId);
        }
    }

    public static final void logIdeaWriteSheetSubmitClick(FeedbackWriteSheetKey feedbackWriteSheetKey) {
        if (C7384Etj.areEqual(feedbackWriteSheetKey.entityType, FeedbackEntityType.IDEA)) {
            IdeaFeedbackAnalytics.INSTANCE.logWrittenSubmitClick$fbandroid_express_aura_java_com_facebook_aura_feedback_view_view(feedbackWriteSheetKey.entityId);
        }
    }

    public static final FeedbackVerdict verdictFor(String str) {
        FeedbackVerdict next;
        Iterator<FeedbackVerdict> it = FeedbackVerdict.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), str)) {
                break;
            }
        }
        FeedbackVerdict feedbackVerdict = next;
        return feedbackVerdict == null ? FeedbackVerdict.DOWN : feedbackVerdict;
    }
}
