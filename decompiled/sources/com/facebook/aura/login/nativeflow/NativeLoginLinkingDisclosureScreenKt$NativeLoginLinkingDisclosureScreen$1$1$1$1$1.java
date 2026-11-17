package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C10G;
import X.C1D8;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ NativeLoginLinkingDisclosureUiState $state;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginLinkingDisclosureUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState) {
            super(3);
            this.$state = nativeLoginLinkingDisclosureUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$state.account;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1$1$1$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                NativeLoginAccountRowKt.NativeLoginAccountRow(nativeLoginAccountUiModel, (Function0) objAaT, C10G.A02, false, false, C1D8.A00(AnonymousClass002.A0d(bfm).sectionCornerRadius), null, false, bfm, NativeLoginAccountUiModel.$stable | 12607920, 72);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$state), 14943961);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1$1$1$1$1(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState) {
        super(1);
        this.$state = nativeLoginLinkingDisclosureUiState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
