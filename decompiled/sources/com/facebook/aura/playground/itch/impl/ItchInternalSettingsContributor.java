package com.facebook.aura.playground.itch.impl;

import com.facebook.aura.playground.intf.InternalPlaygroundSettingsContributor;
import com.facebook.aura.playground.intf.InternalPlaygroundSettingsRow;
import com.facebook.aura.playground.navigation.key.ItchScreenKey;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ItchInternalSettingsContributor implements InternalPlaygroundSettingsContributor {
    public static final ItchInternalSettingsContributor INSTANCE = new ItchInternalSettingsContributor();

    @Override // com.facebook.aura.playground.intf.InternalPlaygroundSettingsContributor
    public List<InternalPlaygroundSettingsRow> rows() {
        return Collections.singletonList(new InternalPlaygroundSettingsRow("playground:itch", "Itch", ItchScreenKey.INSTANCE, null, null, "Itch playground"));
    }
}
