package com.facebook.aura.conversation.view;

import X.A3q;
import X.AHD;
import X.AKL;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0v2;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11S;
import X.C1326AhD;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YD;
import X.C1er;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UX;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.repo.HatchFeedbackConfig;
import com.facebook.aura.conversation.repo.HatchFeedbackConfigStore;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchFeedbackSheetKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $comment$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Boolean> $didSubmitSucceed$delegate;
        public final /* synthetic */ AHD<String> $feedbackOptions;
        public final /* synthetic */ boolean $hasSelection;
        public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ FeedbackMode $mode;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ MutableState<Set<Integer>> $selectedIndices$delegate;
        public final /* synthetic */ View $toastParentView;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, AHD<String> ahd, FeedbackMode feedbackMode, C3UX c3ux, AbstractC3358CGz abstractC3358CGz, String str, View view, Context context, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, MutableState<Set<Integer>> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            super(2);
            this.$hasSelection = z;
            this.$feedbackOptions = ahd;
            this.$mode = feedbackMode;
            this.$scope = c3ux;
            this.$userSession = abstractC3358CGz;
            this.$messageId = str;
            this.$toastParentView = view;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$isSubmitting$delegate = mutableState;
            this.$selectedIndices$delegate = mutableState2;
            this.$comment$delegate = mutableState3;
            this.$didSubmitSucceed$delegate = mutableState4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r49, int r50) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFeedbackSheetKt.AnonymousClass2.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ MutableState<String> $comment$delegate;
        public final /* synthetic */ AHD<String> $feedbackOptions;
        public final /* synthetic */ String $question;
        public final /* synthetic */ MutableState<Set<Integer>> $selectedIndices$delegate;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraTypography auraTypography, AuraColors auraColors, String str, AHD<String> ahd, MutableState<Set<Integer>> mutableState, MutableState<String> mutableState2) {
            super(3);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$question = str;
            this.$feedbackOptions = ahd;
            this.$selectedIndices$delegate = mutableState;
            this.$comment$delegate = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                String str = this.$question;
                AHD<String> ahd = this.$feedbackOptions;
                MutableState<Set<Integer>> mutableState = this.$selectedIndices$delegate;
                MutableState<String> mutableState2 = this.$comment$delegate;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                } else {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                    G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                    C1822Arm c1822Arm = auraTypography.subheadlineRegular;
                    long j2 = auraColors.secondaryText;
                    float f = AuraDimensKt.SpacingLarge;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A07(bs0, f), j2, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    float f2 = AuraDimensKt.SpacingMedium;
                    C01N.A08(bfm, bs0, f2);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -191868491);
                    int i3 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            String str2 = (String) next;
                            if (i3 != 0) {
                                bfm.AgE(-84126886);
                                AuraDividerKt.AuraRowDivider(C3U4.A07(bs0, f), bfm, 0, 0);
                            } else {
                                bfm.AgE(-84034630);
                            }
                            BBI.A0R(bbi, false);
                            boolean zContains = mutableState.getValue().contains(Integer.valueOf(i3));
                            C1YD c1yd = new C1YD(1);
                            boolean zA63 = bfm.A63(i3);
                            Object objAaT = bfm.AaT();
                            if (zA63 || objAaT == C78N.A00) {
                                objAaT = new HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$1$1$1$1(i3, mutableState);
                                bfm.Ai0(objAaT);
                            }
                            BRg bRgA0B = C3U4.A0B(C0v2.A01(c1062ATq, c1yd, (G0U) objAaT, zContains, true), f, f2);
                            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                            int iA0D2 = AnonymousClass001.A0D(bbi);
                            AKQ akqA043 = BBI.A04(bbi);
                            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                            BPg.A02(bfm, akqA043, g0v2);
                            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                            BPg.A02(bfm, bRgA013, g0vA0u);
                            C90m c90m = C90m.A00;
                            C1822Arm c1822Arm2 = auraTypography.bodyRegular;
                            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0O(c90m, bs0, true), auraColors.primaryText, c1822Arm2, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                            AuraIconKt.m2567AuraIconFHprtrg(C11S.A00(bs0, AnonymousClass006.A00(zContains ? 1 : 0)), BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_checkmark_outline_24, 0), AuraIconSize.SMALL, null, auraColors.link, null, bfm, AnonymousClass001.A04(), 32);
                            BBI.A0R(bbi, true);
                            i3 = i4;
                        }
                    }
                    boolean zA1V = AnonymousClass003.A1V(bbi);
                    C01N.A08(bfm, bs0, f2);
                    String strA05 = MutableState.A05(mutableState2);
                    C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, auraColors.primaryText, 0L, 0L, 0L);
                    C1326AhD c1326AhD = new C1326AhD(auraColors.link);
                    BRg bRgA07 = C3U4.A07(bs0, f);
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = new HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$2$1(mutableState2);
                        bfm.Ai0(objAaT2);
                    }
                    AbstractC1874Aso.A03(null, null, null, bfm, bRgA07, c1326AhD, c1822ArmA00, null, strA05, (G0U) objAaT2, null, B1V.A00(bfm, new HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$3(auraColors, auraTypography, mutableState2), -1099686615), 0, 0, 100663344, 196608, 16088, false, false, zA1V);
                    BBI.A0R(bbi, zA1V);
                    return;
                }
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ FeedbackMode $mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FeedbackMode feedbackMode, String str, int i) {
            super(2);
            this.$mode = feedbackMode;
            this.$messageId = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFeedbackSheetKt.HatchFeedbackSheet(this.$mode, this.$messageId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchFeedbackSheet(FeedbackMode feedbackMode, String str, BFM bfm, int i) {
        Window window;
        View decorView;
        int i2;
        boolean zA1a = AnonymousClass002.A1a(feedbackMode, str);
        bfm.AgG(-48810733);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, feedbackMode) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            View viewA0J = AnonymousClass001.A0J(bfm);
            Context contextA0O = AnonymousClass003.A0O(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA1K = AnonymousClass003.A1K(bfm, activity, viewA0J);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    viewA0J = decorView;
                }
                bfm.Ai0(viewA0J);
                objAaT = viewA0J;
            }
            View view = (View) objAaT;
            FeedbackMode feedbackMode2 = FeedbackMode.GOOD;
            if (feedbackMode == feedbackMode2) {
                bfm.AgE(337555910);
                i2 = R.string._name_removed__res_0x7f1209da;
            } else {
                bfm.AgE(337557925);
                i2 = R.string._name_removed__res_0x7f1209d8;
            }
            String strA0e = AnonymousClass003.A0e(bfm, i2);
            HatchFeedbackConfig hatchFeedbackConfig = (HatchFeedbackConfig) C1BO.A07(bfm, HatchFeedbackConfigStore.Companion.getInstance(abstractC3358CGzA0h).config);
            AHD<String> ahd = feedbackMode == feedbackMode2 ? hatchFeedbackConfig.goodOptions : hatchFeedbackConfig.badOptions;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, A3q.A00);
            }
            MutableState mutableState = (MutableState) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState2 = (MutableState) objAaT3;
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            MutableState mutableState4 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            boolean z = !((Set) mutableState.getValue()).isEmpty();
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, zA1a ? 1 : 0);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(MutableState.A0A(mutableState4)));
            MutableState mutableStateA002 = C1er.A00(bfm, activity);
            Unit unit = Unit.INSTANCE;
            boolean zA1K2 = AnonymousClass003.A1K(bfm, mutableStateA002, mutableStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1K2 || objAaT4 == obj) {
                objAaT4 = new HatchFeedbackSheetKt$HatchFeedbackSheet$1$1(mutableStateA002, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, unit);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, c1110AYwA00, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209de), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209dd), null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass2(z, ahd, feedbackMode, c3ux, abstractC3358CGzA0h, str, view, contextA0O, auraNavigatorA0b, mutableState3, mutableState, mutableState2, mutableState4), 688475450), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(auraTypographyA0f, auraColorsA0c, strA0e, ahd, mutableState, mutableState2), 451451382), bfm, 24582, 48, 2018);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(feedbackMode, str, i);
        }
    }

    public static final /* synthetic */ Activity access$HatchFeedbackSheet$lambda$14(C1BO c1bo) {
        return (Activity) c1bo.getValue();
    }

    public static final /* synthetic */ Set access$HatchFeedbackSheet$lambda$2(MutableState mutableState) {
        return (Set) mutableState.getValue();
    }
}
