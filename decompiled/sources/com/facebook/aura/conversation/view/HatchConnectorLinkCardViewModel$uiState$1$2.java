package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.C20Z;
import X.G0W;
import X.HtJ;
import X.HxE;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$uiState$1$2", f = "HatchConnectorLinkCardViewModel.kt", l = {79, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorLinkCardViewModel$uiState$1$2 extends AbstractC07127nr implements G0W<C20Z<? super ConnectorCardState>, HxE<? extends Skill, ? extends Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $id;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ HatchConnectorLinkCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorLinkCardViewModel$uiState$1$2(HatchConnectorLinkCardViewModel hatchConnectorLinkCardViewModel, String str, HtJ<? super HatchConnectorLinkCardViewModel$uiState$1$2> htJ) {
        super(3, htJ);
        this.this$0 = hatchConnectorLinkCardViewModel;
        this.$id = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(C20Z<? super ConnectorCardState> c20z, HxE<? extends Skill, ? extends Boolean> hxE, HtJ<? super Unit> htJ) {
        return invoke2(c20z, (HxE<Skill, Boolean>) hxE, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r7 = r8.L$0
            X.20Z r7 = (X.C20Z) r7
            java.lang.Object r1 = r8.L$1
            X.HxE r1 = (X.HxE) r1
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L4f
            if (r0 != r5) goto L72
            java.lang.Object r2 = X.AnonymousClass001.A0q(r9)
        L18:
            com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r1 = r8.this$0
            boolean r0 = r2 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L29
            com.facebook.aura.skills.model.Skill r2 = (com.facebook.aura.skills.model.Skill) r2
            X.BLG<java.lang.String> r1 = r1.observedConnectorId
            java.lang.String r0 = r2.id
            r1.Af8(r0)
        L29:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L2c:
            X.Hwg.A00(r9)
            A r2 = r1.first
            com.facebook.aura.skills.model.Skill r2 = (com.facebook.aura.skills.model.Skill) r2
            B r0 = r1.second
            boolean r3 = X.AnonymousClass001.A1X(r0)
            com.facebook.aura.conversation.view.ConnectorCardState r1 = com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModelKt.toCardState(r2)
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.L$2 = r2
            r8.Z$0 = r3
            r8.label = r4
            java.lang.Object r0 = r7.emit(r1, r8)
            if (r0 != r6) goto L56
            return r6
        L4f:
            boolean r3 = r8.Z$0
            java.lang.Object r2 = r8.L$2
            X.Hwg.A00(r9)
        L56:
            if (r2 != 0) goto L29
            if (r3 == 0) goto L29
            com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r0 = r8.this$0
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r2 = r0.repository
            java.lang.String r1 = r8.$id
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.L$2 = r0
            r8.Z$0 = r3
            r8.label = r5
            java.lang.Object r2 = r2.m2119fetchConnectorgIAlus(r1, r8)
            if (r2 != r6) goto L18
            return r6
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$uiState$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C20Z<? super ConnectorCardState> c20z, HxE<Skill, Boolean> hxE, HtJ<? super Unit> htJ) {
        HatchConnectorLinkCardViewModel$uiState$1$2 hatchConnectorLinkCardViewModel$uiState$1$2 = new HatchConnectorLinkCardViewModel$uiState$1$2(this.this$0, this.$id, htJ);
        hatchConnectorLinkCardViewModel$uiState$1$2.L$0 = c20z;
        hatchConnectorLinkCardViewModel$uiState$1$2.L$1 = hxE;
        return hatchConnectorLinkCardViewModel$uiState$1$2.invokeSuspend(Unit.INSTANCE);
    }
}
