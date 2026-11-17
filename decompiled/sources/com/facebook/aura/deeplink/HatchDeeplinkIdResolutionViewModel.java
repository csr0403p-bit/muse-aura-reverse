package com.facebook.aura.deeplink;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.HwN;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchDeeplinkIdResolutionViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ResolvedPrompt> _resolvedPrompt;
    public HoC promptResolutionJob;
    public final C1BN<ResolvedPrompt> resolvedPrompt;

    public final class Factory extends AuraViewModelFactory<HatchDeeplinkIdResolutionViewModel> {
        public static final int $stable = 8;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new HatchDeeplinkIdResolutionViewModel();
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchDeeplinkIdResolutionViewModel create() {
            return new HatchDeeplinkIdResolutionViewModel();
        }
    }

    public final class ResolvedPrompt extends C06G {
        public static final int $stable = 0;
        public final HatchComposerEntryPoint entryPoint;
        public final String expectedComposerText;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ResolvedPrompt) {
                    ResolvedPrompt resolvedPrompt = (ResolvedPrompt) obj;
                    if (!C7384Etj.areEqual(this.text, resolvedPrompt.text) || this.entryPoint != resolvedPrompt.entryPoint || !C7384Etj.areEqual(this.expectedComposerText, resolvedPrompt.expectedComposerText)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ResolvedPrompt copy$default(ResolvedPrompt resolvedPrompt, String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolvedPrompt.text;
            }
            if ((i & 2) != 0) {
                hatchComposerEntryPoint = resolvedPrompt.entryPoint;
            }
            if ((i & 4) != 0) {
                str2 = resolvedPrompt.expectedComposerText;
            }
            return resolvedPrompt.copy(str, hatchComposerEntryPoint, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final HatchComposerEntryPoint component2() {
            return this.entryPoint;
        }

        public final String component3() {
            return this.expectedComposerText;
        }

        public final HatchComposerEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final String getExpectedComposerText() {
            return this.expectedComposerText;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.expectedComposerText, (AnonymousClass001.A0G(this.text) + AnonymousClass006.A0D(this.entryPoint)) * 31);
        }

        public ResolvedPrompt(String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2) {
            AnonymousClass003.A0v(str, str2);
            this.text = str;
            this.entryPoint = hatchComposerEntryPoint;
            this.expectedComposerText = str2;
        }

        public final ResolvedPrompt copy(String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2) {
            AnonymousClass003.A0v(str, str2);
            return new ResolvedPrompt(str, hatchComposerEntryPoint, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel$resolvePromptId$1", f = "HatchDeeplinkIdResolutionViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel$resolvePromptId$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $expectedComposerText;
        public final /* synthetic */ HatchPendingMessage.PendingComposerPromptId $pendingPrompt;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPendingMessage.PendingComposerPromptId pendingComposerPromptId, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$pendingPrompt = pendingComposerPromptId;
            this.$expectedComposerText = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeeplinkIdResolutionViewModel.this.new AnonymousClass1(this.$pendingPrompt, this.$expectedComposerText, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1 hatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1 = new HatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1(this.$pendingPrompt, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0s, hatchDeeplinkIdResolutionViewModel$resolvePromptId$1$prompt$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String str = (String) obj;
            if (str != null) {
                AnonymousClass002.A1I(HatchDeeplinkIdResolutionViewModel.this._resolvedPrompt, new ResolvedPrompt(str, this.$pendingPrompt.entryPoint, this.$expectedComposerText));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onResolvedPromptConsumed(ResolvedPrompt resolvedPrompt) {
        C7384Etj.A0Y(resolvedPrompt, 0);
        C9286GCn.A00(resolvedPrompt, HwN.A01, (C9286GCn) this._resolvedPrompt);
    }

    public final void cancelPromptIdResolution() {
        HoC hoC = this.promptResolutionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.promptResolutionJob = null;
        this._resolvedPrompt.Af8(null);
    }

    public final C1BN<ResolvedPrompt> getResolvedPrompt() {
        return this.resolvedPrompt;
    }

    public HatchDeeplinkIdResolutionViewModel() {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        this._resolvedPrompt = c9286GCn;
        this.resolvedPrompt = new C3Pi(null, c9286GCn);
    }

    public final void resolvePromptId(HatchPendingMessage.PendingComposerPromptId pendingComposerPromptId, String str) {
        AnonymousClass003.A0u(pendingComposerPromptId, str);
        HtJ htJA13 = AnonymousClass006.A13(this.promptResolutionJob);
        this._resolvedPrompt.Af8(htJA13);
        this.promptResolutionJob = AnonymousClass001.A11(new AnonymousClass1(pendingComposerPromptId, str, htJA13), AEu.A00(this));
    }
}
