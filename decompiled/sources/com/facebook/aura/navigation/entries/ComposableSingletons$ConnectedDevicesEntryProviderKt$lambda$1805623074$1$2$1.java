package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DeviceDetailsScreenKey;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1$2$1 extends AbstractC7559F3s implements G0U<NodeListEntry, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        AuraNavigator auraNavigator = this.$navigator;
        String str = nodeListEntry.nodeId;
        String str2 = nodeListEntry.displayName;
        if (str2.length() == 0) {
            str2 = str;
        }
        auraNavigator.navigate((AuraNavKey) new DeviceDetailsScreenKey(str, str2), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NodeListEntry nodeListEntry) {
        invoke2(nodeListEntry);
        return Unit.INSTANCE;
    }
}
