package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHI;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import com.facebook.aura.explore.repo.IdeaCardDetail;
import com.facebook.aura.explore.repo.IdeaCardItem;
import com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.IdeaWidgetItemData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class IdeaWidgetSeedKt {
    public static final SeededIdeaDetail seededIdeaDetailFromWidget(IdeaWidgetData ideaWidgetData, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(ideaWidgetData, abstractC3358CGz);
        String str = ideaWidgetData.ideaId;
        IdeaSharing ideaSharing = ideaWidgetData.sharing;
        String str2 = ideaWidgetData.title;
        String str3 = ideaWidgetData.summary;
        String str4 = ideaWidgetData.rationale;
        String str5 = ideaWidgetData.previewImageUrl;
        HatchThumbnailDisplaySize hatchThumbnailDisplaySize = HatchThumbnailDisplaySize.MEDIUM;
        String strResolveIdeaPreviewImageUrl = IdeaPreviewImageUrlsKt.resolveIdeaPreviewImageUrl(str5, abstractC3358CGz, hatchThumbnailDisplaySize);
        String str6 = ideaWidgetData.categoryLabel;
        String str7 = ideaWidgetData.dateLabel;
        List<IdeaWidgetItemData> list = ideaWidgetData.items;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (IdeaWidgetItemData ideaWidgetItemData : list) {
            String str8 = ideaWidgetItemData.id;
            String str9 = ideaWidgetItemData.kind;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = ideaWidgetItemData.title;
            String str11 = ideaWidgetItemData.summary;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = str9;
            String str13 = str11;
            arrayListA0i.add(new IdeaCardItem(str8, str12, zA1a, false, str10, str13, ideaWidgetItemData.buildSummary, IdeaPreviewImageUrlsKt.resolveIdeaPreviewImageUrl(ideaWidgetItemData.previewImageUrl, abstractC3358CGz, hatchThumbnailDisplaySize), ideaWidgetItemData.detailDescription, ""));
        }
        return new SeededIdeaDetail(new IdeaCardDetail(str, ideaSharing, str2, str3, null, str4, null, strResolveIdeaPreviewImageUrl, null, null, str6, str7, AHI.A01, "", AGI.A07(arrayListA0i), null), ideaWidgetData.showDoItButton);
    }
}
