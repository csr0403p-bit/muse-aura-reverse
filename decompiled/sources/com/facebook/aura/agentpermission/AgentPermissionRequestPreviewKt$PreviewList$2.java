package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionRequestPreviewKt$PreviewList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList $block;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionRequestPreviewKt$PreviewList$2(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList itemList, C1822Arm c1822Arm, long j, int i) {
        super(2);
        this.$block = itemList;
        this.$textStyle = c1822Arm;
        this.$textColor = j;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AgentPermissionRequestPreviewKt.m178PreviewListXOJAsU(this.$block, this.$textStyle, this.$textColor, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
