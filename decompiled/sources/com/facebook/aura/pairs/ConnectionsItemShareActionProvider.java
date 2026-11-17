package com.facebook.aura.pairs;

import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.key.ConnectionsShareSheetKey;
import com.facebook.aura.share.api.ItemShareAction;
import com.facebook.aura.share.api.ItemShareActionProvider;
import com.facebook.aura.share.api.ShareableItem;
import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes.dex */
public final class ConnectionsItemShareActionProvider implements ItemShareActionProvider {
    public static final int $stable = 0;
    public static final ConnectionsItemShareActionProvider INSTANCE = new ConnectionsItemShareActionProvider();

    @Override // com.facebook.aura.share.api.ItemShareActionProvider
    public ItemShareAction action(ShareableItem shareableItem) {
        C7384Etj.A0Y(shareableItem, 0);
        if (HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
            return new ItemShareAction(R.string._name_removed__res_0x7f12081f, R.drawable.aura_connections_outline_24, new ConnectionsShareSheetKey(shareableItem.kind.getWire(), shareableItem.id, shareableItem.title), HatchComponent.SHARE_TO_CONNECTIONS_BUTTON);
        }
        return null;
    }
}
