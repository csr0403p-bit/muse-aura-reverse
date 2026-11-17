package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C3cG;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import com.facebook.aura.subscription.view.AuraSubscriptionSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AssistVoicePrerequisiteSheetKt {

    /* renamed from: com.facebook.aura.assist.AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AssistVoiceNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ AuraNavKey $sheet;

        /* renamed from: com.facebook.aura.assist.AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ AssistVoiceNavigator $navigator;
            public final /* synthetic */ Function0<Unit> $onContinue;
            public final /* synthetic */ AuraNavKey $sheet;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AuraNavKey auraNavKey, AssistVoiceNavigator assistVoiceNavigator, Function0<Unit> function0) {
                super(3);
                this.$sheet = auraNavKey;
                this.$navigator = assistVoiceNavigator;
                this.$onContinue = function0;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                VoiceUi ui;
                if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                AuraNavKey auraNavKey = this.$sheet;
                if (auraNavKey instanceof HatchVoiceNuxSheetKey) {
                    bfm.AgE(-855677964);
                    VoiceIntegration integration = Voice.INSTANCE.getIntegration();
                    if (integration == null || (ui = integration.getUi()) == null) {
                        bfm.AgE(-756213107);
                    } else {
                        bfm.AgE(-855677964);
                        boolean zA1R = AnonymousClass001.A1R(bfm, this.$onContinue, bfm.A67(this.$navigator));
                        AssistVoiceNavigator assistVoiceNavigator = this.$navigator;
                        Function0<Unit> function0 = this.$onContinue;
                        Object objAaT = bfm.AaT();
                        if (zA1R || objAaT == C78N.A00) {
                            objAaT = new AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$2$1$1(assistVoiceNavigator, function0);
                            bfm.Ai0(objAaT);
                        }
                        Function0<Unit> function02 = (Function0) objAaT;
                        boolean zA67 = bfm.A67(this.$navigator);
                        AssistVoiceNavigator assistVoiceNavigator2 = this.$navigator;
                        Object objAaT2 = bfm.AaT();
                        if (zA67 || objAaT2 == C78N.A00) {
                            objAaT2 = new AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$2$2$1(assistVoiceNavigator2);
                            bfm.Ai0(objAaT2);
                        }
                        ui.CallNuxContent(function02, (Function0) objAaT2, BRg.A00, bfm, 384);
                    }
                    AnonymousClass002.A19(bfm);
                } else {
                    if (auraNavKey instanceof AuraSubscriptionSheetKey) {
                        bfm.AgE(-855668063);
                        AuraSubscriptionSheetKey auraSubscriptionSheetKey = (AuraSubscriptionSheetKey) this.$sheet;
                        AuraSubscriptionSheetKt.AuraSubscriptionSheet(auraSubscriptionSheetKey.initialPage, new SubscriptionAttribution(auraSubscriptionSheetKey.entryPoint, auraSubscriptionSheetKey.canonicalNmeEntryPoint), null, bfm, 0, 4);
                        AnonymousClass001.A1D(bfm);
                        return;
                    }
                    bfm.AgE(-755698351);
                }
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AssistVoiceNavigator assistVoiceNavigator, AuraNavKey auraNavKey, Function0<Unit> function0) {
            super(2);
            this.$modifier = bRg;
            this.$navigator = assistVoiceNavigator;
            this.$sheet = auraNavKey;
            this.$onContinue = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRg = this.$modifier;
                boolean zA67 = bfm.A67(this.$navigator);
                AssistVoiceNavigator assistVoiceNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$1$1(assistVoiceNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(bRg, (Function0) objAaT, null, null, 0L, false, false, B1V.A00(bfm, new AnonymousClass2(this.$sheet, this.$navigator, this.$onContinue), -1578542287), bfm, 12582912, 124);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AssistVoiceNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AssistVoiceNavigator assistVoiceNavigator, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$navigator = assistVoiceNavigator;
            this.$onContinue = function0;
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
            AssistVoicePrerequisiteSheetKt.AssistVoicePrerequisiteSheet(this.$navigator, this.$onContinue, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistVoicePrerequisiteSheet(AssistVoiceNavigator assistVoiceNavigator, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        BRg bRg2 = bRg;
        AnonymousClass003.A0u(assistVoiceNavigator, function0);
        bfm.AgG(966085738);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(assistVoiceNavigator, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavKey sheet = assistVoiceNavigator.getSheet();
            if (sheet == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$sheet$1(assistVoiceNavigator, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            AnonymousClass006.A15(bfm, AuraNavigatorKt.LocalNavigator.A04(assistVoiceNavigator), new AnonymousClass1(bRg2, assistVoiceNavigator, sheet, function0), 1040855338);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(assistVoiceNavigator, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }
}
