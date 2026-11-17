package com.facebook.aura.assist;

import X.AGH;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.EnumC3085Bxl;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.NudgeContent;
import com.facebook.aura.nudge.NudgeExpiry;
import com.facebook.aura.nudge.NudgeOutcome;
import com.facebook.aura.nudge.NudgePolicy;
import com.facebook.aura.nudge.NudgePresentation;
import com.facebook.aura.nudge.NudgeSurface;
import com.facebook.aura.utils.HatchDefaultAssistantUtils;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DefaultAssistantNudge implements ConversationNudge {
    public static final String id = "default_assistant";
    public static final int priority = 10;
    public static final DefaultAssistantNudge INSTANCE = new DefaultAssistantNudge();
    public static final NudgePolicy policy = new NudgePolicy(3, 7, new NudgeExpiry(60000, true), true);
    public static final Set<NudgeSurface> surfaces = BFI.A0H(new NudgeSurface[]{NudgeSurface.PHONE, NudgeSurface.WATCH});

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Function0<Unit> rememberAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        C7384Etj.A0Y(g0u, 0);
        bfm.AgE(942187865);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
        EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA00, contextA0H);
        Object objAaT2 = bfm.AaT();
        if (zA1J || objAaT2 == obj) {
            objAaT2 = new DefaultAssistantNudge$rememberAction$1$1(contextA0H, mutableState, mutableStateA00);
            bfm.Ai0(objAaT2);
        }
        C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT2, 6, 2);
        boolean zA1N = AnonymousClass003.A1N(bfm, contextA0H, mutableStateA00);
        Object objAaT3 = bfm.AaT();
        if (zA1N || objAaT3 == obj) {
            objAaT3 = new DefaultAssistantNudge$rememberAction$2$1(contextA0H, mutableState, mutableStateA00);
            bfm.Ai0(objAaT3);
        }
        Function0<Unit> function0 = (Function0) objAaT3;
        AnonymousClass001.A1D(bfm);
        return function0;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public String getId() {
        return id;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgePolicy getPolicy() {
        return policy;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public int getPriority() {
        return priority;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Set<NudgeSurface> getSurfaces() {
        return surfaces;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // com.facebook.aura.nudge.ConversationNudge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isEligible(android.content.Context r1, X.AbstractC3358CGz r2, X.HtJ<? super java.lang.Boolean> r3) {
        /*
            r0 = this;
            com.facebook.aura.utils.HatchDefaultAssistantUtils r0 = com.facebook.aura.utils.HatchDefaultAssistantUtils.INSTANCE
            boolean r0 = r0.shouldShowDefaultAssistantPrompt(r1)
            if (r0 == 0) goto L11
            com.facebook.aura.assist.status.HatchDefaultAssistantStatus r0 = com.facebook.aura.assist.status.HatchDefaultAssistantStatus.INSTANCE
            boolean r1 = r0.isAssistantRoleAvailable(r1)
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.DefaultAssistantNudge.isEligible(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void onDeclined() {
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void onReset() {
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onShown() {
        HatchDefaultAssistantUtils.INSTANCE.recordDefaultAssistantPromptShown();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* synthetic */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i);
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgeContent content(BFM bfm, int i) {
        bfm.AgE(-561914240);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h).aiIdentityName;
            bfm.Ai0(objAaT);
        }
        C1BO c1boA02 = C2CK.A02(bfm, (C1BN) objAaT);
        NudgeContent nudgeContent = new NudgeContent(R.drawable.phone_android_wght400_outline_24, AnonymousClass001.A0t(bfm, c1boA02.getValue(), R.string._name_removed__res_0x7f1208ce), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208cd), 2, AnonymousClass001.A0t(bfm, c1boA02.getValue(), R.string._name_removed__res_0x7f1208cc), 3, true, null, NudgePresentation.CARD, null);
        AnonymousClass001.A1D(bfm);
        return nudgeContent;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Map<String, String> logMetadata() {
        return AGH.A0E();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i, i2);
    }
}
