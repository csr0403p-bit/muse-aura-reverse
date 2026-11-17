package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchDeeplinkIdResolutionEffectKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchDeeplinkIdResolutionEffectKt$HatchDeeplinkIdResolutionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchConversationViewModel $conversationViewModel;
        public final /* synthetic */ HatchDeeplinkIdResolutionViewModel $idResolutionViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConversationViewModel hatchConversationViewModel, HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel, int i) {
            super(2);
            this.$conversationViewModel = hatchConversationViewModel;
            this.$idResolutionViewModel = hatchDeeplinkIdResolutionViewModel;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeeplinkIdResolutionEffectKt.HatchDeeplinkIdResolutionEffect(this.$conversationViewModel, this.$idResolutionViewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final HatchDeeplinkIdResolutionViewModel rememberHatchDeeplinkIdResolutionViewModel(BFM bfm, int i) {
        HatchDeeplinkIdResolutionViewModel.Factory factory = new HatchDeeplinkIdResolutionViewModel.Factory();
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (HatchDeeplinkIdResolutionViewModel) AnonymousClass004.A14(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchDeeplinkIdResolutionViewModel.class);
        }
        throw AnonymousClass001.A0o();
    }

    public static final void HatchDeeplinkIdResolutionEffect(HatchConversationViewModel hatchConversationViewModel, HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel, BFM bfm, int i) {
        AnonymousClass003.A0u(hatchConversationViewModel, hatchDeeplinkIdResolutionViewModel);
        bfm.AgG(-1606115346);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchConversationViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDeeplinkIdResolutionViewModel, bfm, i) ? 1 : 0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            C1BO c1boA02 = C2CK.A02(bfm, hatchDeeplinkIdResolutionViewModel.resolvedPrompt);
            Object value = c1boA02.getValue();
            boolean zA65 = bfm.A65(c1boA02) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchConversationViewModel)));
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDeeplinkIdResolutionViewModel))) {
                z = true;
            }
            boolean z2 = zA65 | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchDeeplinkIdResolutionEffectKt$HatchDeeplinkIdResolutionEffect$1$1(c1boA02, hatchConversationViewModel, hatchDeeplinkIdResolutionViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, value, hatchConversationViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchConversationViewModel, hatchDeeplinkIdResolutionViewModel, i);
        }
    }

    public static final /* synthetic */ HatchDeeplinkIdResolutionViewModel.ResolvedPrompt access$HatchDeeplinkIdResolutionEffect$lambda$0(C1BO c1bo) {
        return (HatchDeeplinkIdResolutionViewModel.ResolvedPrompt) c1bo.getValue();
    }
}
