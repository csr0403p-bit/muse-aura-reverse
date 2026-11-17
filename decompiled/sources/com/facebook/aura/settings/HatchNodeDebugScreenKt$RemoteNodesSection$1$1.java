package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchNodeDebugScreenKt$RemoteNodesSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ String $localNodeId;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ AHD<NodeListEntry> $remoteNodes;

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$RemoteNodesSection$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onRefresh;

        /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$RemoteNodesSection$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ boolean $isLoading;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z) {
                super(2);
                this.$isLoading = z;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    if (this.$isLoading) {
                        bfm.AgE(-1399837963);
                        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0S(BRg.A00), null, 0L, bfm, 6, 6);
                    } else {
                        bfm.AgE(-1399755937);
                        AnonymousClass007.A11(bfm, AuraCardDefaults.INSTANCE, R.drawable.arrow_clockwise_outline);
                    }
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, boolean z) {
            super(3);
            this.$onRefresh = function0;
            this.$isLoading = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d11);
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(strA01, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), clickable, B1V.A00(bfm, new AnonymousClass1(this.$isLoading), 1738931075), null, this.$onRefresh, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (!this.$remoteNodes.isEmpty() || this.$isLoading) {
            AHD<NodeListEntry> ahd = this.$remoteNodes;
            String str = this.$localNodeId;
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AnonymousClass005.A0u(hatchSectionScope, new HatchNodeDebugScreenKt$RemoteNodesSection$1$1$1$1(str, (NodeListEntry) it.next()), -1575360984);
            }
        } else {
            hatchSectionScope.item(ComposableSingletons$HatchNodeDebugScreenKt.f239lambda$1600117972);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$onRefresh, this.$isLoading), -60702553);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeDebugScreenKt$RemoteNodesSection$1$1(AHD<NodeListEntry> ahd, boolean z, String str, Function0<Unit> function0) {
        super(1);
        this.$remoteNodes = ahd;
        this.$isLoading = z;
        this.$localNodeId = str;
        this.$onRefresh = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
