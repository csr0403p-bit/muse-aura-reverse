package com.facebook.aura.share.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C7384Etj;
import X.DFI;
import com.facebook.aura.pairs.ConnectionsItemShareActionProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ItemShareActions {
    public static final ItemShareActions INSTANCE = new ItemShareActions();

    public final List<ItemShareAction> forItem(ShareableItem shareableItem) {
        C7384Etj.A0Y(shareableItem, 0);
        if (shareableItem.id.length() == 0) {
            return C0881AGi.A00;
        }
        DFI dfi = new DFI(new int[]{0}, 1);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dfi.iterator();
        while (it.hasNext()) {
            int iA0F = AnonymousClass001.A0F(it.next());
            if (iA0F != 0) {
                throw AnonymousClass005.A0c(iA0F);
            }
            ItemShareAction itemShareActionAction = ConnectionsItemShareActionProvider.INSTANCE.action(shareableItem);
            if (itemShareActionAction != null) {
                arrayList.add(itemShareActionAction);
            }
        }
        return arrayList;
    }
}
