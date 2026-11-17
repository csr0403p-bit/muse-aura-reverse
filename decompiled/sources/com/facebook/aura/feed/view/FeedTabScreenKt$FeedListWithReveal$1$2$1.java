package com.facebook.aura.feed.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1805ArO;
import X.C1Cd;
import X.C3U4;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedListWithReveal$1$2$1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismissEditor;
    public final /* synthetic */ G0U<C1805ArO, Unit> $onPromptTextChange;
    public final /* synthetic */ Function0<Unit> $onSavePrompt;
    public final /* synthetic */ boolean $promptSaveEnabled;
    public final /* synthetic */ C1805ArO $promptText;

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedListWithReveal$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismissEditor;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onPromptTextChange;
        public final /* synthetic */ Function0<Unit> $onSavePrompt;
        public final /* synthetic */ boolean $promptSaveEnabled;
        public final /* synthetic */ C1805ArO $promptText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$promptText = c1805ArO;
            this.$onPromptTextChange = g0u;
            this.$promptSaveEnabled = z;
            this.$onDismissEditor = function0;
            this.$onSavePrompt = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0N = C06G.A0N(bfm, bs0);
                C1805ArO c1805ArO = this.$promptText;
                G0U<C1805ArO, Unit> g0u = this.$onPromptTextChange;
                boolean z = this.$promptSaveEnabled;
                Function0<Unit> function0 = this.$onDismissEditor;
                Function0<Unit> function02 = this.$onSavePrompt;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0N);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingMedium;
                FeedInstructionsEditorKt.FeedInstructionsEditCard(c1805ArO, g0u, C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, FeedTabScreenKt.FeedEditTopSpacing, 0.0f, 0.0f), bfm, 0, 0);
                FeedInstructionsEditorKt.FeedInstructionsButtons(z, function0, function02, C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                C01N.A03(bfm, bbi, bs0, FeedTabScreenKt.FeedRevealSpacing);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedListWithReveal$1$2$1(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(3);
        this.$promptText = c1805ArO;
        this.$onPromptTextChange = g0u;
        this.$promptSaveEnabled = z;
        this.$onDismissEditor = function0;
        this.$onSavePrompt = function02;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AnonymousClass002.A0x(bfm, AuraThemeMode.DARK, B1V.A00(bfm, new AnonymousClass1(this.$promptText, this.$onPromptTextChange, this.$promptSaveEnabled, this.$onDismissEditor, this.$onSavePrompt), 219527251), 390);
        } else {
            bfm.Afo();
        }
    }
}
