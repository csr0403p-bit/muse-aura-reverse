package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1SA;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.gating.VoiceAnnouncementCopy;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchVoiceAnnouncementSheetKt {
    public static final int NUX_FADE_IN_DELAY_MS = 175;
    public static final int NUX_FADE_IN_MS = 120;
    public static final int NUX_FADE_OUT_MS = 80;
    public static final String VOICE_LEARN_MORE_URL = "https://www.meta.com/help/superintelligence/1331373868832401/";

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ VoiceAnnouncementInteraction $interaction;
        public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
        public final /* synthetic */ boolean $replacesVoiceNux;
        public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(boolean z, VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<? extends AuraNavigator> c1bo, C1BO<AuraSheetState> c1bo2, VoiceAnnouncementInteraction voiceAnnouncementInteraction) {
            super(2);
            this.$replacesVoiceNux = z;
            this.$viewModel = voiceAnnouncementViewModel;
            this.$navigator$delegate = c1bo;
            this.$sheetState$delegate = c1bo2;
            this.$interaction = voiceAnnouncementInteraction;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean z = this.$replacesVoiceNux;
                VoiceAnnouncementViewModel voiceAnnouncementViewModel = this.$viewModel;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$interaction, AnonymousClass001.A1U(bfm, this.$replacesVoiceNux, bfm.A67(voiceAnnouncementViewModel) | AnonymousClass001.A1R(bfm, this.$sheetState$delegate, bfm.A65(this.$navigator$delegate))));
                VoiceAnnouncementViewModel voiceAnnouncementViewModel2 = this.$viewModel;
                boolean z2 = this.$replacesVoiceNux;
                VoiceAnnouncementInteraction voiceAnnouncementInteraction = this.$interaction;
                C1BO<AuraNavigator> c1bo = this.$navigator$delegate;
                C1BO<AuraSheetState> c1bo2 = this.$sheetState$delegate;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$1$1(voiceAnnouncementViewModel2, z2, voiceAnnouncementInteraction, c1bo, c1bo2);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                VoiceAnnouncementViewModel voiceAnnouncementViewModel3 = this.$viewModel;
                boolean zA67 = bfm.A67(voiceAnnouncementViewModel3) | AnonymousClass001.A1T(bfm, this.$interaction, bfm.A65(this.$navigator$delegate));
                VoiceAnnouncementInteraction voiceAnnouncementInteraction2 = this.$interaction;
                VoiceAnnouncementViewModel voiceAnnouncementViewModel4 = this.$viewModel;
                C1BO<AuraNavigator> c1bo3 = this.$navigator$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$2$1(voiceAnnouncementInteraction2, voiceAnnouncementViewModel4, c1bo3);
                    bfm.Ai0(objAaT2);
                }
                HatchVoiceAnnouncementSheetKt.VoiceAnnouncementFooter(z, function0, (Function0) objAaT2, null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$17, reason: invalid class name */
    public final class AnonymousClass17 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(BRg bRg, VoiceAnnouncementViewModel voiceAnnouncementViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = voiceAnnouncementViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceAnnouncementSheetKt.HatchVoiceAnnouncementSheet(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, VoiceAnnouncementViewModel voiceAnnouncementViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = voiceAnnouncementViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceAnnouncementSheetKt.HatchVoiceAnnouncementSheet(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$VoiceAnnouncementContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C131522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceAnnouncementCopy $copy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $replacesVoiceNux;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131522(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$copy = voiceAnnouncementCopy;
            this.$replacesVoiceNux = z;
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
            HatchVoiceAnnouncementSheetKt.VoiceAnnouncementContent(this.$copy, this.$replacesVoiceNux, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$VoiceAnnouncementFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C131532 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onNotNow;
        public final /* synthetic */ Function0<Unit> $onTalk;
        public final /* synthetic */ boolean $replacesVoiceNux;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131532(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$replacesVoiceNux = z;
            this.$onTalk = function0;
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
            HatchVoiceAnnouncementSheetKt.VoiceAnnouncementFooter(this.$replacesVoiceNux, this.$onTalk, this.$onNotNow, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$VoiceAnnouncementMicDisclosure$2, reason: invalid class name and case insensitive filesystem */
    public final class C131542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131542(BRg bRg, int i, int i2) {
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
            HatchVoiceAnnouncementSheetKt.VoiceAnnouncementMicDisclosure(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$VoiceAnnouncementPromo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceAnnouncementCopy $copy;
        public final /* synthetic */ boolean $replacesVoiceNux;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z) {
            super(3);
            this.$copy = voiceAnnouncementCopy;
            this.$replacesVoiceNux = z;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchVoiceAnnouncementSheetKt.VoiceAnnouncementContent(this.$copy, this.$replacesVoiceNux, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$VoiceAnnouncementPromo$2, reason: invalid class name and case insensitive filesystem */
    public final class C131552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceAnnouncementCopy $copy;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ boolean $replacesVoiceNux;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131552(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z, String str, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$copy = voiceAnnouncementCopy;
            this.$replacesVoiceNux = z;
            this.$presentationId = str;
            this.$footer = g0v;
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
            HatchVoiceAnnouncementSheetKt.VoiceAnnouncementPromo(this.$copy, this.$replacesVoiceNux, this.$presentationId, this.$footer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceAnnouncementCopy.values().length];
            try {
                AnonymousClass002.A13(VoiceAnnouncementCopy.HEAR_THAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceAnnouncementCopy.TURN_IT_UP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceAnnouncementCopy.NOW_HAS_A_VOICE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchVoiceAnnouncementSheet(X.BRg r26, com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt.HatchVoiceAnnouncementSheet(X.BRg, com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel, X.BFM, int, int):void");
    }

    public static final void VoiceAnnouncementContent(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1945444920);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, voiceAnnouncementCopy) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(bRg2.then(c1062ATq), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            boolean z2 = auraTheme.getColors(bfm, 6).isLight;
            int i4 = R.drawable.voice_announcement_art_dark;
            if (z2) {
                i4 = R.drawable.voice_announcement_art;
            }
            C1SA.A00(bfm, null, C11U.A03(BJe.A00(c1062ATq, 1.7020202f, false), auraTheme.getShapes(bfm, 6).large), null, BOf.A00(bfm, i4, 0), B18.A00, null, 0.0f, AVy.$stable | 24624, 104);
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, getTitleRes(voiceAnnouncementCopy));
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingMedium, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchVoiceAnnouncementSheetKt$VoiceAnnouncementContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, HatchAppName.value, bodyRes(voiceAnnouncementCopy, z)), C3U4.A04(c1062ATq, AuraDimensKt.SpacingXsmall), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131522(voiceAnnouncementCopy, z, bRg2, i, i2);
        }
    }

    public static final void VoiceAnnouncementFooter(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(1413080902);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLargePlusMicro;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRgThen, f, 0.0f), 0.0f, AuraDimensKt.SpacingSmall, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingMicroPlusNano), bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(965090520);
                VoiceAnnouncementMicDisclosure(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
                bfm.AgE(965203453);
                strA0s = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12067a);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(965134726);
                BBI.A0R(bbi, false);
                bfm.AgE(965313069);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120640);
            }
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, AbstractC07539Wl.A00(c1062ATq, "hatch-voice-announcement-talk-button"), null, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0n << 9) & 57344, 0, 134201301);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120705), null, AbstractC07539Wl.A00(c1062ATq, "hatch-voice-announcement-not-now-button"), AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0n << 6) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131532(z, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void VoiceAnnouncementMicDisclosure(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1932719595);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12063c);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, strA012);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = HatchLinkTextKt.withLinkedArguments(strA01, Collections.singletonList(C3cG.A0r(strA012, VOICE_LEARN_MORE_URL)));
                bfm.Ai0(objAaT);
            }
            HxE hxE = (HxE) objAaT;
            String str = (String) hxE.first;
            List list = (List) hxE.second;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            HatchLinkTextKt.m1188HatchLinkText10k_G_c(str, list, C3U4.A0C(AnonymousClass001.A0R(bRg2), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingXsmall), C3cH.A0E(bfm, auraTheme), C3cH.A07(bfm, auraTheme), C3cH.A0F(3), null, false, bfm, 0, 192);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131542(bRg2, i, i2);
        }
    }

    public static final void VoiceAnnouncementPromo(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z, String str, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1192115362);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, voiceAnnouncementCopy) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, g0v);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, VoiceAnnouncementAnalytics.INSTANCE.impression(bRg2, str), null, null, g0v, null, null, false, true, false, null, B1V.A00(bfm, new AnonymousClass1(voiceAnnouncementCopy, z), 445271579), bfm, ((iA08 << 3) & 57344) | 100663296, 48, 1773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131552(voiceAnnouncementCopy, z, str, g0v, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ AuraNavigator access$HatchVoiceAnnouncementSheet$lambda$0(C1BO c1bo) {
        return (AuraNavigator) c1bo.getValue();
    }

    public static final /* synthetic */ Activity access$HatchVoiceAnnouncementSheet$lambda$2(C1BO c1bo) {
        return (Activity) c1bo.getValue();
    }

    public static final /* synthetic */ AuraSheetState access$HatchVoiceAnnouncementSheet$lambda$3(C1BO c1bo) {
        return (AuraSheetState) c1bo.getValue();
    }

    public static final int bodyRes(VoiceAnnouncementCopy voiceAnnouncementCopy, boolean z) {
        int iOrdinal = voiceAnnouncementCopy.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return z ? R.string._name_removed__res_0x7f120638 : R.string._name_removed__res_0x7f12063a;
        }
        if (iOrdinal == 2) {
            return z ? R.string._name_removed__res_0x7f120639 : R.string._name_removed__res_0x7f12063b;
        }
        throw C3cG.A0q();
    }

    public static final int getTitleRes(VoiceAnnouncementCopy voiceAnnouncementCopy) {
        int iOrdinal = voiceAnnouncementCopy.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f12063d;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f12063f;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f12063e;
        }
        throw C3cG.A0q();
    }
}
