package com.facebook.aura.partners.voice.screen;

import X.AFz;
import X.AKL;
import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.BO6;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.screen.VoiceNuxSheetViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchVoiceNuxSheetKt {
    public static final float VOICE_NUX_ARTWORK_HEIGHT = 54.0f;
    public static final float VOICE_NUX_FALLBACK_ARTWORK_CANVAS_FRACTION = 0.46203703f;
    public static final float VOICE_NUX_LOTTIE_MARK_CANVAS_FRACTION = 0.37777779f;
    public static final float VOICE_NUX_LOTTIE_CANVAS_SIZE = 54.0f / 0.37777779f;
    public static final float VOICE_NUX_FALLBACK_CANVAS_SIZE = 54.0f / 0.46203703f;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$HatchVoiceNuxContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $canContinue;
        public final /* synthetic */ Map<String, String> $metadata;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onNotNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Boolean> function03, int i, int i2) {
            super(2);
            this.$metadata = map;
            this.$onContinue = function0;
            this.$onNotNow = function02;
            this.$modifier = bRg;
            this.$canContinue = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceNuxSheetKt.HatchVoiceNuxContent(this.$metadata, this.$onContinue, this.$onNotNow, this.$modifier, this.$canContinue, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$4, reason: invalid class name and case insensitive filesystem */
    public final class C131614 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BO6<String, String> $callAttribution;
        public final /* synthetic */ String $callEntryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131614(String str, String str2, BO6<String, String> bo6, BRg bRg, int i, int i2) {
            super(2);
            this.$threadId = str;
            this.$callEntryPoint = str2;
            this.$callAttribution = bo6;
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
            HatchVoiceNuxSheetKt.HatchVoiceNuxSheet(this.$threadId, this.$callEntryPoint, this.$callAttribution, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Boolean> $canContinue;
        public final /* synthetic */ VoiceNuxInteraction $loggingState;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onNotNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Boolean> function0, VoiceNuxInteraction voiceNuxInteraction, Function0<Unit> function02, Function0<Unit> function03) {
            super(2);
            this.$canContinue = function0;
            this.$loggingState = voiceNuxInteraction;
            this.$onContinue = function02;
            this.$onNotNow = function03;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onContinue, AnonymousClass001.A1T(bfm, this.$loggingState, bfm.A65(this.$canContinue)));
                Function0<Boolean> function0 = this.$canContinue;
                VoiceNuxInteraction voiceNuxInteraction = this.$loggingState;
                Function0<Unit> function02 = this.$onContinue;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchVoiceNuxSheetKt$VoiceNuxContent$2$1$1(function0, voiceNuxInteraction, function02);
                    bfm.Ai0(objAaT);
                }
                Function0 function03 = (Function0) objAaT;
                boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onNotNow, AnonymousClass001.A1T(bfm, this.$loggingState, bfm.A65(this.$canContinue)));
                Function0<Boolean> function04 = this.$canContinue;
                VoiceNuxInteraction voiceNuxInteraction2 = this.$loggingState;
                Function0<Unit> function05 = this.$onNotNow;
                Object objAaT2 = bfm.AaT();
                if (zA1R2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchVoiceNuxSheetKt$VoiceNuxContent$2$2$1(function04, voiceNuxInteraction2, function05);
                    bfm.Ai0(objAaT2);
                }
                HatchVoiceNuxSheetKt.VoiceNuxFooter(function03, (Function0) objAaT2, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $canContinue;
        public final /* synthetic */ VoiceNuxInteraction $loggingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onNotNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VoiceNuxInteraction voiceNuxInteraction, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Boolean> function03, int i, int i2) {
            super(2);
            this.$loggingState = voiceNuxInteraction;
            this.$onContinue = function0;
            this.$onNotNow = function02;
            this.$modifier = bRg;
            this.$canContinue = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceNuxSheetKt.VoiceNuxContent(this.$loggingState, this.$onContinue, this.$onNotNow, this.$modifier, this.$canContinue, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxFeatureList$2, reason: invalid class name and case insensitive filesystem */
    public final class C131622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131622(BRg bRg, int i, int i2) {
            super(2);
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
            HatchVoiceNuxSheetKt.VoiceNuxFeatureList(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C131632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onNotNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131632(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onContinue = function0;
            this.$onNotNow = function02;
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
            HatchVoiceNuxSheetKt.VoiceNuxFooter(this.$onContinue, this.$onNotNow, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxHero$2, reason: invalid class name and case insensitive filesystem */
    public final class C131642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131642(BRg bRg, int i, int i2) {
            super(2);
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
            HatchVoiceNuxSheetKt.VoiceNuxHero(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$VoiceNuxRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C131653 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ AVy $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131653(AVy aVy, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$icon = aVy;
            this.$title = str;
            this.$body = str2;
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
            HatchVoiceNuxSheetKt.VoiceNuxRow(this.$icon, this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchVoiceNuxContent(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Boolean> function03, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        Function0<Boolean> function04 = function03;
        AnonymousClass003.A0x(function0, function02);
        bfm.AgG(1439463000);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(map, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function04);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchVoiceNuxSheetKt$HatchVoiceNuxContent$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function04 = (Function0) objAaT;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, bfm.A6v(AKL.A00));
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new VoiceNuxInteraction(map);
                bfm.Ai0(objAaT2);
            }
            VoiceNuxInteraction voiceNuxInteraction = (VoiceNuxInteraction) objAaT2;
            Unit unit = Unit.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA00, voiceNuxInteraction);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new HatchVoiceNuxSheetKt$HatchVoiceNuxContent$2$1(voiceNuxInteraction, mutableStateA00);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, unit);
            boolean zA67 = bfm.A67(abstractC3358CGzA0h) | AnonymousClass003.A1C(iA05);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new HatchVoiceNuxSheetKt$HatchVoiceNuxContent$3$1(abstractC3358CGzA0h, function0);
                bfm.Ai0(objAaT4);
            }
            VoiceNuxContent(voiceNuxInteraction, (Function0) objAaT4, function02, bRg2, function04, bfm, AnonymousClass003.A07(iA05, VoiceNuxInteraction.$stable | (iA05 & 896)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(map, function0, function02, bRg2, function04, i, i2);
        }
    }

    public static final void HatchVoiceNuxSheet(String str, String str2, BO6<String, String> bo6, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(bo6, 2);
        bfm.AgG(-473364148);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bo6);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceNuxSheetViewModel.Factory factory = new VoiceNuxSheetViewModel.Factory(AnonymousClass002.A0h(bfm), str, new VoiceCallStart(VoiceCallEntryPoint.Companion.fromValue(str2), bo6));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            VoiceNuxSheetViewModel voiceNuxSheetViewModel = (VoiceNuxSheetViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(VoiceNuxSheetViewModel.class));
            MutableState mutableStateA00 = C1er.A00(bfm, bfm.A6v(AuraNavigatorKt.LocalNavigator));
            MutableState mutableStateA002 = C1er.A00(bfm, bfm.A6v(AKL.A00));
            MutableState mutableStateA003 = C1er.A00(bfm, new HatchVoiceNuxSheetKey(str, str2, bo6));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new VoiceNuxInteraction(voiceNuxSheetViewModel.logMetadata);
                bfm.Ai0(objAaT);
            }
            VoiceNuxInteraction voiceNuxInteraction = (VoiceNuxInteraction) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA1T = AnonymousClass004.A1T(bfm, voiceNuxInteraction, voiceNuxSheetViewModel, AnonymousClass005.A1R(bfm, mutableStateA002, mutableStateA00, mutableStateA003));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$1$1(voiceNuxInteraction, voiceNuxSheetViewModel, mutableStateA002, mutableStateA00, mutableStateA003);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            boolean zA1N = AnonymousClass003.A1N(bfm, voiceNuxSheetViewModel, mutableStateA00);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$2$1(voiceNuxSheetViewModel, mutableStateA00);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, voiceNuxSheetViewModel, mutableStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1N2 || objAaT4 == obj) {
                objAaT4 = new HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$3$1(voiceNuxSheetViewModel, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            VoiceNuxContent(voiceNuxInteraction, function0, (Function0) objAaT4, bRg2, null, bfm, VoiceNuxInteraction.$stable | (iA0d & 7168), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131614(str, str2, bo6, bRg2, i, i2);
        }
    }

    public static final void VoiceNuxContent(VoiceNuxInteraction voiceNuxInteraction, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Boolean> function03, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        Function0<Boolean> function04 = function03;
        bfm.AgG(1398345213);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceNuxInteraction, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function04);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchVoiceNuxSheetKt$VoiceNuxContent$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function04 = (Function0) objAaT;
            }
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchVoiceNuxSheetKt$VoiceNuxContent$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, VoiceNuxAnalytics.INSTANCE.impression(bRg2, voiceNuxInteraction.metadata, (String) AFz.A03(bfm, (Function0) objAaT2, objArr)), null, null, B1V.A00(bfm, new AnonymousClass2(function04, voiceNuxInteraction, function0, function02), -1782992092), null, null, false, true, false, null, ComposableSingletons$HatchVoiceNuxSheetKt.f220lambda$822307872, bfm, 100687872, 48, 1773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(voiceNuxInteraction, function0, function02, bRg2, function04, i, i2);
        }
    }

    public static final void VoiceNuxFooter(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-465809348);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRg2.then(c1062ATq), AuraDimensKt.SpacingLarge, 0.0f), 0.0f, AuraDimensKt.SpacingSmall, 0.0f, AuraDimensKt.SpacingLargePlusMicro);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicroPlusNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12067a);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0v, null, AbstractC07539Wl.A00(c1062ATq, "hatch-voice-nux-continue-button"), null, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201301);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120705), null, AbstractC07539Wl.A00(c1062ATq, "hatch-voice-nux-not-now-button"), AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 9) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131632(function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceNuxHero(X.BRg r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt.VoiceNuxHero(X.BRg, X.BFM, int, int):void");
    }

    public static final void VoiceNuxRow(AVy aVy, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1985724304);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aVy, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchVoiceNuxSheetKt$VoiceNuxRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0Y(bRgA0R, objAaT, true), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVy, AuraIconSize.SMALL, null, C06G.A0C(bfm), null, bfm, ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | AnonymousClass001.A04(), 33);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA05 >> 3) & 14, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingMicro).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA05 >> 6) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131653(aVy, str, str2, bRg2, i, i2);
        }
    }

    public static final void VoiceNuxFeatureList(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-739860587);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.phonehandset_outline_24_wght500, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120679);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120678);
            int i4 = AVy.$stable;
            VoiceNuxRow(aVyA00, strA01, strA012, null, bfm, i4, 8);
            VoiceNuxRow(BOf.A00(bfm, R.drawable.microphone_outline_24_wght500, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120676), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120675), null, bfm, i4, 8);
            VoiceNuxRow(BOf.A00(bfm, R.drawable.gestureindexsquigglerh_outline_24_wght500, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120674), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120673), null, bfm, i4, 8);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131622(bRg, i, i2);
        }
    }

    public static final /* synthetic */ Activity access$HatchVoiceNuxContent$lambda$1(C1BO c1bo) {
        return (Activity) c1bo.getValue();
    }

    public static final /* synthetic */ AuraNavigator access$HatchVoiceNuxSheet$lambda$0(C1BO c1bo) {
        return (AuraNavigator) c1bo.getValue();
    }

    public static final /* synthetic */ Activity access$HatchVoiceNuxSheet$lambda$1(C1BO c1bo) {
        return (Activity) c1bo.getValue();
    }

    public static final /* synthetic */ HatchVoiceNuxSheetKey access$HatchVoiceNuxSheet$lambda$2(C1BO c1bo) {
        return (HatchVoiceNuxSheetKey) c1bo.getValue();
    }

    public static final String voiceNuxTitle(BFM bfm, int i) {
        return AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120677);
    }
}
