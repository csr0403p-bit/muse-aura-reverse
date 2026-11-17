package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.TaskConnectorPermissionsScreenKey;
import com.facebook.aura.navigation.key.TaskPermissionsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class TaskPermissionsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final TaskPermissionsEntryProvider INSTANCE = new TaskPermissionsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<TaskPermissionsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$TaskPermissionsEntryProviderKt.f190lambda$1733021147;
        c5rn.A00(new G0U<TaskPermissionsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.TaskPermissionsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(TaskPermissionsScreenKey taskPermissionsScreenKey) {
                return taskPermissionsScreenKey.toString();
            }
        }, new G0U<TaskPermissionsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.TaskPermissionsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(TaskPermissionsScreenKey taskPermissionsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(TaskPermissionsScreenKey taskPermissionsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(TaskPermissionsScreenKey.class));
        G0W<TaskConnectorPermissionsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$TaskPermissionsEntryProviderKt.lambda$1639670593;
        c5rn.A00(new G0U<TaskConnectorPermissionsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.TaskPermissionsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey) {
                return taskConnectorPermissionsScreenKey.toString();
            }
        }, new G0U<TaskConnectorPermissionsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.TaskPermissionsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(TaskConnectorPermissionsScreenKey.class));
    }
}
