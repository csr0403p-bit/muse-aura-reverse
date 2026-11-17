package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpaceProposalCardKt$HatchSpaceProposalCard$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $markBuilding;
    public final /* synthetic */ G0U<String, Unit> $onSendMessage;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        SpaceCardAnalytics.INSTANCE.logBuildSpaceClick(this.$presentationId, this.$threadLogMetadata);
        G0U<String, Unit> g0u = this.$markBuilding;
        if (g0u != null) {
            g0u.invoke(this.$presentationId);
        }
        G0U<String, Unit> g0u2 = this.$onSendMessage;
        if (g0u2 != null) {
            g0u2.invoke(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceProposalCardKt$HatchSpaceProposalCard$1$1(String str, Map<String, String> map, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$presentationId = str;
        this.$threadLogMetadata = map;
        this.$markBuilding = g0u;
        this.$onSendMessage = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
