package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAppsSectionKt$AppsSection$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
    public final /* synthetic */ ConnectedDeviceSections $sections;
    public final /* synthetic */ MutableState<Boolean> $showInactive$delegate;

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$AppsSection$2$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectedDeviceSections $sections;
        public final /* synthetic */ MutableState<Boolean> $showInactive$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectedDeviceSections connectedDeviceSections, MutableState<Boolean> mutableState) {
            super(3);
            this.$sections = connectedDeviceSections;
            this.$showInactive$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                int size = this.$sections.inactiveApps.size();
                boolean zA65 = bfm.A65(this.$showInactive$delegate);
                MutableState<Boolean> mutableState = this.$showInactive$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchAppsSectionKt$AppsSection$2$1$1$2$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchAppsSectionKt.ShowInactiveAppsRow(size, (Function0) objAaT, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        boolean zA0A = MutableState.A0A((MutableState) this.$showInactive$delegate);
        ConnectedDeviceSections connectedDeviceSections = this.$sections;
        List listA0P = connectedDeviceSections.apps;
        if (zA0A) {
            listA0P = AbstractC0878AGe.A0P(connectedDeviceSections.inactiveApps, listA0P);
        }
        G0U<NodeListEntry, Unit> g0u = this.$onDeviceClick;
        Iterator it = listA0P.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchAppsSectionKt$AppsSection$2$1$1$1$1((NodeListEntry) it.next(), g0u), -1262360841);
        }
        if (MutableState.A0A((MutableState) this.$showInactive$delegate) || this.$sections.inactiveApps.isEmpty()) {
            return;
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$sections, this.$showInactive$delegate), 323981591);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAppsSectionKt$AppsSection$2$1$1(ConnectedDeviceSections connectedDeviceSections, MutableState<Boolean> mutableState, G0U<? super NodeListEntry, Unit> g0u) {
        super(1);
        this.$sections = connectedDeviceSections;
        this.$showInactive$delegate = mutableState;
        this.$onDeviceClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
