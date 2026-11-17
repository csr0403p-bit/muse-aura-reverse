package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C3U4;
import X.G0V;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $subjectLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$3(String str) {
        super(2);
        this.$subjectLabel = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(this.$subjectLabel, C3U4.A0C(BRg.A00, AuraDimensKt.SpacingLarge, 0.0f, AuraDimensKt.SpacingSmall, 0.0f), 0L, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            return;
        }
        bfm.Afo();
    }
}
