package com.facebook.aura.partners.voice.screen;

import X.AIC;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1741Ape;
import X.C1743Apg;
import X.C1HY;
import X.C1er;
import X.C78N;
import X.C78e;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceAnnouncementEffectsKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceAnnouncementViewModel voiceAnnouncementViewModel, int i) {
            super(2);
            this.$viewModel = voiceAnnouncementViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceAnnouncementEffectsKt.ShowSheetOnForeground(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$StartCallOnTalk$2, reason: invalid class name and case insensitive filesystem */
    public final class C131792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131792(VoiceAnnouncementViewModel voiceAnnouncementViewModel, int i) {
            super(2);
            this.$viewModel = voiceAnnouncementViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceAnnouncementEffectsKt.StartCallOnTalk(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$VoiceAnnouncementEffects$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, int i, int i2) {
            super(2);
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
            VoiceAnnouncementEffectsKt.VoiceAnnouncementEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShowSheetOnForeground(VoiceAnnouncementViewModel voiceAnnouncementViewModel, BFM bfm, int i) {
        bfm.AgG(-1838967951);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceAnnouncementViewModel, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            View viewA0J = AnonymousClass001.A0J(bfm);
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            C1741Ape c1741Ape = C1743Apg.A01(bfm).A02;
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            Object[] objArr = {voiceAnnouncementViewModel, auraNavigatorA0b, c1hy, hatchSidePanelController};
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceAnnouncementViewModel)), AnonymousClass005.A1X(bfm, axnA0Y, auraNavigatorA0b, AnonymousClass005.A1S(bfm, c1hy, viewA0J, hatchSidePanelController), bfm.A65(c1741Ape)));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1(c1hy, viewA0J, hatchSidePanelController, c1741Ape, axnA0Y, auraNavigatorA0b, voiceAnnouncementViewModel, contextA0H, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceAnnouncementViewModel, i);
        }
    }

    public static final void StartCallOnTalk(VoiceAnnouncementViewModel voiceAnnouncementViewModel, BFM bfm, int i) {
        bfm.AgG(501306922);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceAnnouncementViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            int i2 = iA05 & 14;
            boolean z2 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceAnnouncementViewModel));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new VoiceAnnouncementEffectsKt$StartCallOnTalk$callStarter$1$1(voiceAnnouncementViewModel);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
            boolean z3 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceAnnouncementViewModel));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceAnnouncementEffectsKt$StartCallOnTalk$callStarter$2$1(voiceAnnouncementViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean z4 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceAnnouncementViewModel));
            Object objAaT3 = bfm.AaT();
            if (z4 || objAaT3 == C78N.A00) {
                objAaT3 = new VoiceAnnouncementEffectsKt$StartCallOnTalk$callStarter$3$1(voiceAnnouncementViewModel);
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA00 = C1er.A00(bfm, VoiceCallStarterKt.rememberConversationCallStarter(null, true, function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), bfm, 54, 0));
            if (i2 != 4 && ((iA05 & 8) == 0 || !bfm.A67(voiceAnnouncementViewModel))) {
                z = false;
            }
            boolean zA65 = bfm.A65(mutableStateA00) | z;
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == C78N.A00) {
                objAaT4 = new VoiceAnnouncementEffectsKt$StartCallOnTalk$1$1(voiceAnnouncementViewModel, mutableStateA00, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, voiceAnnouncementViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131792(voiceAnnouncementViewModel, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceAnnouncementEffects(com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel r4, X.BFM r5, int r6, int r7) {
        /*
            r0 = 166624592(0x9ee7d50, float:5.741426E-33)
            r5.AgG(r0)
            r0 = r6 & 6
            r2 = 2
            if (r0 != 0) goto L66
            r0 = r7 & 1
            if (r0 != 0) goto L16
            boolean r0 = X.AnonymousClass004.A1X(r4, r5, r6)
            r3 = 4
            if (r0 != 0) goto L17
        L16:
            r3 = 2
        L17:
            r3 = r3 | r6
        L18:
            r0 = r3 & 3
            r1 = 0
            boolean r0 = X.AnonymousClass002.A1P(r0, r2)
            boolean r0 = X.AnonymousClass001.A1b(r0, r5, r3)
            if (r0 == 0) goto L62
            r5.Afy()
            r0 = r6 & 1
            if (r0 == 0) goto L59
            boolean r0 = r5.AEk()
            if (r0 != 0) goto L59
            r5.Afo()
            r0 = r7 & 1
            if (r0 == 0) goto L3b
        L39:
            r3 = r3 & (-15)
        L3b:
            r5.AAb()
            int r2 = com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel.$stable
            r1 = r3 & 14
            r0 = r2 | r1
            ShowSheetOnForeground(r4, r5, r0)
            r2 = r2 | r1
            StartCallOnTalk(r4, r5, r2)
        L4b:
            X.BBb r1 = r5.AAc()
            if (r1 == 0) goto L58
            com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$VoiceAnnouncementEffects$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$VoiceAnnouncementEffects$1
            r0.<init>(r4, r6, r7)
            r1.A06 = r0
        L58:
            return
        L59:
            r0 = r7 & 1
            if (r0 == 0) goto L3b
            com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel r4 = com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModelKt.voiceAnnouncementViewModel(r5, r1)
            goto L39
        L62:
            r5.Afo()
            goto L4b
        L66:
            r3 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt.VoiceAnnouncementEffects(com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel, X.BFM, int, int):void");
    }
}
