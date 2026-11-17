package com.facebook.aura.share.view;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.B6A;
import X.BFM;
import X.BOf;
import X.BRg;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.share.api.ItemShareAction;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ItemShareMenuEntries {
    public static final int $stable = 0;
    public final List<ItemShareAction> actions;
    public final String contentType;
    public final int firstId;
    public final ItemShareLogContext logContext;

    /* renamed from: items-dhasg_w, reason: not valid java name */
    public final List<AuraContextMenuItem> m1991itemsdhasg_w(B6A b6a, BFM bfm, int i, int i2) {
        B6A b6a2 = b6a;
        if ((i2 & 1) != 0) {
            b6a2 = null;
        }
        bfm.AgE(-1604729572);
        List<ItemShareAction> list = this.actions;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        int i3 = 0;
        for (ItemShareAction itemShareAction : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ItemShareAction itemShareAction2 = itemShareAction;
            arrayListA0i.add(new AuraContextMenuItem(i3 + this.firstId, AbstractC2271BQs.A01(bfm, itemShareAction2.labelRes), null, BOf.A00(bfm, itemShareAction2.iconRes, 0), b6a2, null, false, false, false, true, false, BRg.A00, 1, 1));
            i3 = i4;
        }
        AnonymousClass001.A1D(bfm);
        return arrayListA0i;
    }

    public final AuraNavKey onItemClick(int i) {
        ItemShareAction itemShareAction = (ItemShareAction) AbstractC0878AGe.A0A(i - this.firstId, this.actions);
        if (itemShareAction == null) {
            return null;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        ItemShareLogContext itemShareLogContext = this.logContext;
        HatchSurface hatchSurface = itemShareLogContext.surface;
        HatchSubsurface hatchSubsurface = itemShareLogContext.subsurface;
        HatchScreen hatchScreen = itemShareLogContext.screen;
        HatchComponent hatchComponent = itemShareAction.logComponent;
        String str = this.contentType;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, str != null ? AnonymousClass007.A0c(HatchMetadataKey.SHARE_CONTENT_TYPE, str) : null, null);
        return itemShareAction.destination;
    }

    public ItemShareMenuEntries(List<ItemShareAction> list, int i, String str, ItemShareLogContext itemShareLogContext) {
        AnonymousClass003.A0w(list, itemShareLogContext);
        this.actions = list;
        this.firstId = i;
        this.contentType = str;
        this.logContext = itemShareLogContext;
    }
}
