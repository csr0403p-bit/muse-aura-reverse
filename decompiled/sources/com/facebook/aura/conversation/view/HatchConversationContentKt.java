package com.facebook.aura.conversation.view;

import X.AKL;
import X.AKQ;
import X.AQI;
import X.AQJ;
import X.ASj;
import X.AbstractC04540eo;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC1360Ahl;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0dx;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1Cd;
import X.C1D8;
import X.C1b8;
import X.C1er;
import X.C28s;
import X.C2HU;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchPendingFileAction;
import com.facebook.aura.conversation.viewmodel.HatchPendingFileActionType;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.AuraTerminalBackHandlerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConversationContentKt {
    public static final long COMPOSER_HINT_FOCUS_DELAY_MS = 700;
    public static final String CONNECTION_ERROR_IMPRESSION_KEY = "chat_connection_error";

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$ComposerLaunchRequestEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConsumed;
        public final /* synthetic */ Function0<Unit> $onDictation;
        public final /* synthetic */ Function0<Unit> $onKeyboard;
        public final /* synthetic */ ComposerLaunchAction $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ComposerLaunchAction composerLaunchAction, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$request = composerLaunchAction;
            this.$onKeyboard = function0;
            this.$onDictation = function02;
            this.$onConsumed = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationContentKt.ComposerLaunchRequestEffect(this.$request, this.$onKeyboard, this.$onDictation, this.$onConsumed, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$ConversationHapticsEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C114092 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114092(HatchConversationViewModel hatchConversationViewModel, int i) {
            super(2);
            this.$viewModel = hatchConversationViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationContentKt.ConversationHapticsEffect(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$DictationBackHandler$2, reason: invalid class name and case insensitive filesystem */
    public final class C114102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isDictating;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114102(boolean z, int i) {
            super(2);
            this.$isDictating = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationContentKt.DictationBackHandler(this.$isDictating, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationComposerLayout$2, reason: invalid class name and case insensitive filesystem */
    public final class C114112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $composer;
        public final /* synthetic */ G0W<Integer, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114112(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super Integer, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$composer = g0v;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationContentKt.HatchConversationComposerLayout(this.$modifier, this.$composer, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchPendingFileActionPill$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<HatchPendingFileAction> $lastAction$delegate;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchPendingFileActionPill$4$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchPendingFileActionType.values().length];
                try {
                    AnonymousClass002.A13(HatchPendingFileActionType.SHARE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchPendingFileActionType.SAVE_TO_DRIVE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchPendingFileActionType.DOWNLOAD, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(HatchPendingFileActionType.DOWNLOAD_AS_PDF, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(HatchPendingFileActionType.DOWNLOAD_AS_HTML, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MutableState<HatchPendingFileAction> mutableState) {
            super(3);
            this.$lastAction$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            int i2;
            C7384Etj.A0Y(c1Cd, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchPendingFileAction value = this.$lastAction$delegate.getValue();
                if (value != null) {
                    bfm.AgE(1456974374);
                    int iOrdinal = value.type.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal == 4) {
                                        bfm.AgE(-1338452613);
                                        i2 = R.string._name_removed__res_0x7f120abb;
                                    } else {
                                        throw AnonymousClass005.A0k(bfm, -1338474053);
                                    }
                                } else {
                                    bfm.AgE(-1338457542);
                                    i2 = R.string._name_removed__res_0x7f120abc;
                                }
                            } else {
                                bfm.AgE(-1338462376);
                                i2 = R.string._name_removed__res_0x7f120aba;
                            }
                        } else {
                            bfm.AgE(-1338467108);
                            i2 = R.string._name_removed__res_0x7f120abe;
                        }
                    } else {
                        bfm.AgE(-1338472004);
                        i2 = R.string._name_removed__res_0x7f120abd;
                    }
                    String strA0t = AnonymousClass001.A0t(bfm, value.fileName, i2);
                    BBI bbi = (BBI) bfm;
                    BBI.A0R(bbi, false);
                    BS0 bs0 = BRg.A00;
                    BRg bRgA0B = C3U4.A0B(C1b8.A03(AbstractC04540eo.A00(C3U4.A09(bs0, 6.0f), C1D8.A00(20.0f), 4.0f, 28, 0L, 0L), C1D8.A00(20.0f), C06G.A0B(bfm)), 16.0f, 10.0f);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = HatchConversationContentKt$HatchPendingFileActionPill$4$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
                    InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 16.0f), null, 0L, bfm, 6, 6);
                    C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                    AuraTextKt.m2639AuraTextUY9GdpU(strA0t, C10G.A0D(bs0, Float.NaN, 240.0f), C06G.A0C(bfm), c1822ArmA0Y, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306416, 6, 14832);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(1458558102);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchPendingFileActionPill$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchPendingFileAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchPendingFileAction hatchPendingFileAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = hatchPendingFileAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationContentKt.HatchPendingFileActionPill(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchConversationComposerLayout(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super Integer, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1742590783);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1C = AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchConversationContentKt$HatchConversationComposerLayout$1$1(g0v, g0w);
                bfm.Ai0(objAaT);
            }
            AbstractC1360Ahl.A01(bRg2, (G0V) objAaT, bfm, iA0d & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114112(bRg2, g0v, g0w, i, i2);
        }
    }

    public static final ContentItem buildLocalImageContentItem(String str) {
        return new ContentItem(C7BY.A0R(str, str, '/'), ContentType.Image.INSTANCE, null, str, null, null, null, null, null, false, null, null, null, null, null);
    }

    public static final void HatchPendingFileActionPill(HatchPendingFileAction hatchPendingFileAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1462461756);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchPendingFileAction, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchPendingFileAction));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new HatchConversationContentKt$HatchPendingFileActionPill$1$1(hatchPendingFileAction, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, hatchPendingFileAction);
            boolean zA1X = AnonymousClass002.A1X(hatchPendingFileAction);
            C28s c28s = C2HU.A01;
            AQI aqiA0P = AnonymousClass003.A0P(c28s, 150, 0);
            ASj aSj = new ASj(c28s, 200, 0);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchConversationContentKt$HatchPendingFileActionPill$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AQI aqiA00 = aqiA0P.A00(AbstractC1011APs.A09(aSj, (G0U) objAaT3));
            AQJ aqjA0E = AbstractC1011APs.A0E(new ASj(c28s, 150, 0));
            ASj aSj2 = new ASj(c28s, 200, 0);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = HatchConversationContentKt$HatchPendingFileActionPill$3$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            AbstractC04661Bq.A08(aqiA00, aqjA0E.A00(AbstractC1011APs.A0I(aSj2, (G0U) objAaT4)), bfm, bRg2, null, B1V.A00(bfm, new AnonymousClass4(mutableState), -1789100308), (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 200064, 16, zA1X);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchPendingFileAction, bRg2, i, i2);
        }
    }

    public static final void logSelectionReplyClick(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.REPLY_BUTTON, null, map, null);
    }

    public static final void ComposerLaunchRequestEffect(ComposerLaunchAction composerLaunchAction, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(1046390328);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(composerLaunchAction)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            MutableState mutableStateA002 = C1er.A00(bfm, function02);
            MutableState mutableStateA003 = C1er.A00(bfm, function03);
            boolean zA1P = AnonymousClass003.A1P(bfm, mutableStateA002, mutableStateA003, bfm.A65(mutableStateA00) | AnonymousClass001.A1M(iA0D));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = new HatchConversationContentKt$ComposerLaunchRequestEffect$1$1(composerLaunchAction, mutableStateA00, mutableStateA002, mutableStateA003);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, composerLaunchAction);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(composerLaunchAction, function0, function02, function03, i);
        }
    }

    public static final void ConversationHapticsEffect(HatchConversationViewModel hatchConversationViewModel, BFM bfm, int i) {
        bfm.AgG(-998588049);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchConversationViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchConversationViewModel))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, c0dxA0T, bfm.A67(activity), z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchConversationContentKt$ConversationHapticsEffect$1$1(hatchConversationViewModel, activity, c0dxA0T, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, hatchConversationViewModel, c0dxA0T, activity, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114092(hatchConversationViewModel, i);
        }
    }

    public static final void DictationBackHandler(boolean z, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c114102;
        bfm.AgG(1211798324);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 3, 2), bfm, iA0n)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            if (activity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c114102 = new HatchConversationContentKt$DictationBackHandler$activity$1(z, i);
                    bBbAAc.A06 = c114102;
                }
                return;
            }
            boolean zA67 = bfm.A67(activity);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConversationContentKt$DictationBackHandler$1$1(activity);
                bfm.Ai0(objAaT);
            }
            AuraTerminalBackHandlerKt.AuraTerminalBackHandler(z, (Function0) objAaT, bfm, iA0n & 14, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114102 = new C114102(z, i);
            bBbAAc.A06 = c114102;
        }
    }

    public static final /* synthetic */ HatchConversationUiState access$HatchConversationContent_4y9YqzQ$lambda$1(C1BO c1bo) {
        return (HatchConversationUiState) c1bo.getValue();
    }

    public static final /* synthetic */ G0U access$HatchConversationContent_4y9YqzQ$lambda$27(MutableState mutableState) {
        return (G0U) mutableState.getValue();
    }

    public static final /* synthetic */ HatchPendingFileAction access$HatchPendingFileActionPill$lambda$1(MutableState mutableState) {
        return (HatchPendingFileAction) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.file.view.api.ContentItem buildLocalFileContentItem(android.content.Context r14, java.lang.String r15) {
        /*
            android.content.ContentResolver r6 = r14.getContentResolver()
            r3 = r15
            android.net.Uri r7 = android.net.Uri.parse(r15)
            r5 = 0
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11)
            if (r2 == 0) goto L34
            java.lang.String r0 = "_display_name"
            int r1 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2e
            if (r1 < 0) goto L2e
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)
            throw r0
        L2e:
            r1 = r5
        L2f:
            r2.close()
            if (r1 != 0) goto L3a
        L34:
            r0 = 47
            java.lang.String r1 = X.C7BY.A0R(r15, r15, r0)
        L3a:
            com.facebook.aura.file.view.api.ContentTypeDetector r0 = com.facebook.aura.file.view.api.ContentTypeDetector.INSTANCE
            com.facebook.aura.file.view.api.ContentType r2 = r0.fromFileName(r1)
            boolean r0 = r2.isMedia()
            r4 = r5
            if (r0 == 0) goto L48
            r4 = r15
        L48:
            r10 = 0
            com.facebook.aura.file.view.api.ContentItem r0 = new com.facebook.aura.file.view.api.ContentItem
            r6 = r5
            r7 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt.buildLocalFileContentItem(android.content.Context, java.lang.String):com.facebook.aura.file.view.api.ContentItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0424  */
    /* renamed from: HatchConversationContent-4y9YqzQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m546HatchConversationContent4y9YqzQ(com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r83, float r84, float r85, X.BRg r86, X.G0U<? super java.lang.String, kotlin.Unit> r87, X.G0U<? super java.lang.String, kotlin.Unit> r88, X.G0U<? super java.lang.String, kotlin.Unit> r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, com.facebook.aura.conversation.view.HighlightRequest r91, kotlin.jvm.functions.Function0<kotlin.Unit> r92, kotlin.jvm.functions.Function0<kotlin.Unit> r93, X.G0U<? super X.G0U<? super java.lang.String, kotlin.Unit>, kotlin.Unit> r94, kotlin.jvm.functions.Function0<kotlin.Unit> r95, kotlin.jvm.functions.Function0<kotlin.Unit> r96, kotlin.jvm.functions.Function0<kotlin.Unit> r97, kotlin.jvm.functions.Function0<kotlin.Unit> r98, X.BRg r99, java.lang.String r100, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r101, boolean r102, boolean r103, com.facebook.aura.model.HatchMessageChannel r104, boolean r105, X.C20Q<kotlin.Unit> r106, X.BFM r107, int r108, int r109, int r110, int r111) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt.m546HatchConversationContent4y9YqzQ(com.facebook.aura.conversation.viewmodel.HatchConversationViewModel, float, float, X.BRg, X.G0U, X.G0U, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.conversation.view.HighlightRequest, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, X.G0V, boolean, boolean, com.facebook.aura.model.HatchMessageChannel, boolean, X.20Q, X.BFM, int, int, int, int):void");
    }
}
