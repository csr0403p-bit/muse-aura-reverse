package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$openDevice$1$1 extends AbstractC7559F3s implements G0U<NodeListEntry, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        int iOrdinal = this.$viewModel.resolveDeviceNavigation$fbandroid_express_aura_java_com_facebook_aura_settings_settings(nodeListEntry).ordinal();
        if (iOrdinal == 0) {
            MetaAiLauncherKt.launchMetaAiGlassesTab(this.$context, nodeListEntry.nodeId);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.$onDeviceClick.invoke(nodeListEntry);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectedDeviceNavigation.values().length];
            try {
                AnonymousClass002.A13(ConnectedDeviceNavigation.META_AI, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectedDeviceNavigation.DETAILS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$openDevice$1$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, Context context, G0U<? super NodeListEntry, Unit> g0u) {
        super(1);
        this.$viewModel = hatchConnectedDevicesViewModel;
        this.$context = context;
        this.$onDeviceClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NodeListEntry nodeListEntry) {
        invoke2(nodeListEntry);
        return Unit.INSTANCE;
    }
}
