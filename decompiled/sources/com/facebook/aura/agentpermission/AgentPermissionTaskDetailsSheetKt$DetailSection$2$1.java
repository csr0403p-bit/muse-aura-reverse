package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionTaskDetailsSheetKt$DetailSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $body;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$DetailSection$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$body = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                long jA08 = C06G.A08(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(this.$body, C3U4.A09(C10G.A02, 16.0f), jA08, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$body), 1545688548);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionTaskDetailsSheetKt$DetailSection$2$1(String str) {
        super(1);
        this.$body = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
