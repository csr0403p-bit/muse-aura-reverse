package com.facebook.aura.assist;

import X.AKH;
import X.AKJ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.vds.compose.theme.root.AuraRootKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistIdentityHost$createView$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ComposeView $composeView;
    public final /* synthetic */ AssistIdentityHost this$0;

    /* renamed from: com.facebook.aura.assist.AssistIdentityHost$createView$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ComposeView $composeView;
        public final /* synthetic */ AssistIdentityHost this$0;

        /* renamed from: com.facebook.aura.assist.AssistIdentityHost$createView$2$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ ComposeView $composeView;
            public final /* synthetic */ AssistIdentityHost this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ComposeView composeView, AssistIdentityHost assistIdentityHost) {
                super(2);
                this.$composeView = composeView;
                this.this$0 = assistIdentityHost;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.this$0, bfm.A67(this.$composeView));
                    ComposeView composeView = this.$composeView;
                    AssistIdentityHost assistIdentityHost = this.this$0;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new AssistIdentityHost$createView$2$1$2$1$1$1(composeView, assistIdentityHost);
                        bfm.Ai0(objAaT);
                    }
                    HatchAssistVoiceModeKt.AssistVoiceCallEndedEffect((Function0) objAaT, bfm, 0);
                    AssistIdentityStateKt.AssistIdentityTransitionEffect(this.this$0.onCollapsed, bfm, 0);
                    AssistIdentityHost assistIdentityHost2 = this.this$0;
                    AssistIdentityState assistIdentityState = assistIdentityHost2.state;
                    Function0<Unit> function0 = assistIdentityHost2.onRestore;
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$composeView, bfm.A67(assistIdentityHost2));
                    AssistIdentityHost assistIdentityHost3 = this.this$0;
                    ComposeView composeView2 = this.$composeView;
                    Object objAaT2 = bfm.AaT();
                    if (zA1T2 || objAaT2 == C78N.A00) {
                        objAaT2 = new AssistIdentityHost$createView$2$1$2$1$2$1(assistIdentityHost3, composeView2);
                        bfm.Ai0(objAaT2);
                    }
                    AssistSessionIdentityKt.AssistSessionIdentity(assistIdentityState, function0, (G0U) objAaT2, null, bfm, AssistIdentityState.$stable, 8);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AssistIdentityHost assistIdentityHost, ComposeView composeView) {
            super(2);
            this.this$0 = assistIdentityHost;
            this.$composeView = composeView;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AKJ<AuraNavigator> akjA04 = AuraNavigatorKt.LocalNavigator.A04(NoOpAssistNavigator.INSTANCE);
                AKH<AssistIdentityState> akh = AssistIdentityStateKt.LocalAssistIdentityState;
                AssistIdentityHost assistIdentityHost = this.this$0;
                AKJ<AssistIdentityState> akjA042 = akh.A04(assistIdentityHost.state);
                AKH<AbstractC3358CGz> akh2 = LocalUserSessionKt.LocalUserSession;
                AbstractC3358CGz abstractC3358CGz = assistIdentityHost.userSession;
                AnonymousClass003.A0p(bfm, new AnonymousClass1(this.$composeView, assistIdentityHost), new AKJ[]{akjA04, akjA042, akh2.A04(abstractC3358CGz), LocalUserSessionKt.LocalUserSessionOrNull.A04(abstractC3358CGz)}, -1984959545);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityHost$createView$2$1(AssistIdentityHost assistIdentityHost, ComposeView composeView) {
        super(2);
        this.this$0 = assistIdentityHost;
        this.$composeView = composeView;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zIsInteractive = this.this$0.state.isInteractive();
            Boolean boolValueOf = Boolean.valueOf(zIsInteractive);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$composeView, AnonymousClass001.A1T(bfm, this.this$0, bfm.A66(zIsInteractive)));
            AssistIdentityHost assistIdentityHost = this.this$0;
            ComposeView composeView = this.$composeView;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AssistIdentityHost$createView$2$1$1$1(zIsInteractive, assistIdentityHost, composeView);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            AuraRootKt.AuraRoot(null, null, B1V.A00(bfm, new AnonymousClass2(this.this$0, this.$composeView), 1312180359), bfm, 384, 3);
            return;
        }
        bfm.Afo();
    }
}
