package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchNodeDebugScreenKt$CommandsSection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ NodeCommandId $command;
    public final /* synthetic */ String $subtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeDebugScreenKt$CommandsSection$1$1$1$1(String str, NodeCommandId nodeCommandId) {
        super(3);
        this.$subtitle = str;
        this.$command = nodeCommandId;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        AuraCardContent auraCardContent;
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            String str = this.$subtitle;
            int length = str.length();
            String commandId = this.$command.getCommandId();
            if (length > 0) {
                ApQ apQA0X = AnonymousClass005.A0X(str);
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                auraCardContent = new AuraCardContent(commandId, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            } else {
                C0953AJg c0953AJgA002 = C0953AJg.A00();
                long j2 = B6A.A07;
                auraCardContent = new AuraCardContent(commandId, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA002, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j2, j2, (C1YL) null);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, none, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262128);
            return;
        }
        bfm.Afo();
    }
}
