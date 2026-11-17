package com.facebook.aura.explore.repo;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.model.IdeaSharing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class IdeaCardDetailMergeKt {
    public static final IdeaCardDetail mergeServerFields(IdeaCardDetail ideaCardDetail, IdeaCardDetail ideaCardDetail2) {
        IdeaCardItem ideaCardItemCopy$default;
        AnonymousClass003.A0u(ideaCardDetail, ideaCardDetail2);
        AHD<IdeaCardItem> ahd = ideaCardDetail2.items;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(ahd));
        for (Object obj : ahd) {
            linkedHashMap.put(((IdeaCardItem) obj).itemId, obj);
        }
        AHD<IdeaCardItem> ahd2 = ideaCardDetail.items;
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd2);
        Iterator it = ahd2.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(((IdeaCardItem) it.next()).itemId);
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0m);
        IdeaSharing ideaSharing = ideaCardDetail2.sharing;
        String str = ideaCardDetail.previewImageUrl;
        if (str == null) {
            str = ideaCardDetail2.previewImageUrl;
        }
        String str2 = ideaCardDetail.actionLabel;
        if (str2.length() == 0) {
            str2 = ideaCardDetail2.actionLabel;
        }
        AHD<IdeaCardItem> ahd3 = ideaCardDetail.items;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd3);
        for (IdeaCardItem ideaCardItem : ahd3) {
            IdeaCardItem ideaCardItem2 = (IdeaCardItem) linkedHashMap.get(ideaCardItem.itemId);
            if (ideaCardItem2 == null || (ideaCardItemCopy$default = IdeaCardItem.copy$default(ideaCardItem, null, null, ideaCardItem2.selectable, ideaCardItem2.isSelected, null, null, null, null, null, null, 1011, null)) == null) {
                ideaCardItemCopy$default = ideaCardItem;
            }
            arrayListA0m2.add(ideaCardItemCopy$default);
        }
        AHD<IdeaCardItem> ahd4 = ideaCardDetail2.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : ahd4) {
            if (!setA0g.contains(((IdeaCardItem) obj2).itemId)) {
                arrayList.add(obj2);
            }
        }
        return IdeaCardDetail.copy$default(ideaCardDetail, null, ideaSharing, null, null, null, null, null, str, null, null, null, null, null, str2, AGI.A07(AbstractC0878AGe.A0P(arrayList, arrayListA0m2)), null, 40829, null);
    }
}
