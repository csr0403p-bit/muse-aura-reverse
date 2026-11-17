package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0W;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareRecipientsSection$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ G0U<HatchShareRecipient, Unit> $onRecipientClick;
    public final /* synthetic */ HatchShareRecipient $recipient;
    public final /* synthetic */ Map<String, HatchRecipientSendState> $sendStates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetKt$HatchShareRecipientsSection$1$1(Map<String, ? extends HatchRecipientSendState> map, HatchShareRecipient hatchShareRecipient, G0U<? super HatchShareRecipient, Unit> g0u) {
        super(3);
        this.$sendStates = map;
        this.$recipient = hatchShareRecipient;
        this.$onRecipientClick = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        Function0 function0;
        HatchShareAppTarget hatchShareAppTarget;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchRecipientSendState hatchRecipientSendState = this.$sendStates.get(HatchShareSheetModelsKt.getKey(this.$recipient));
            if (hatchRecipientSendState == null) {
                hatchRecipientSendState = HatchRecipientSendState.IDLE;
            }
            if (this.$onRecipientClick != null && hatchRecipientSendState != HatchRecipientSendState.SENDING && hatchRecipientSendState != HatchRecipientSendState.SENT && ((hatchShareAppTarget = this.$recipient.appTarget) == HatchShareAppTarget.INSTAGRAM || hatchShareAppTarget == HatchShareAppTarget.MESSENGER)) {
                bfm.AgE(-1736332718);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$recipient, bfm.A65(this.$onRecipientClick));
                G0U<HatchShareRecipient, Unit> g0u = this.$onRecipientClick;
                HatchShareRecipient hatchShareRecipient = this.$recipient;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchShareSheetKt$HatchShareRecipientsSection$1$1$onClick$1$1(g0u, hatchShareRecipient);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                AnonymousClass002.A19(bfm);
            } else {
                AnonymousClass004.A1A(bfm, -1736271059);
                function0 = null;
            }
            HatchShareSheetKt.HatchShareRecipientRow(this.$recipient, hatchRecipientSendState, function0, null, bfm, HatchShareRecipient.$stable, 8);
            return;
        }
        bfm.Afo();
    }
}
