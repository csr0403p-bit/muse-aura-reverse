package com.facebook.aura.model;

import X.C0881AGi;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchAttachmentPresentationKt {
    public static final List<HatchAttachmentFile> attachmentFiles(HatchPresentationData hatchPresentationData) {
        HatchAttachmentFile hatchAttachmentFile;
        C7384Etj.A0Y(hatchPresentationData, 0);
        if (hatchPresentationData instanceof FilePresentationData) {
            hatchAttachmentFile = ((FilePresentationData) hatchPresentationData).file;
        } else {
            if (hatchPresentationData instanceof ImageGalleryPresentationData) {
                return ((ImageGalleryPresentationData) hatchPresentationData).images;
            }
            if (hatchPresentationData instanceof VideoPresentationData) {
                return ((VideoPresentationData) hatchPresentationData).videos;
            }
            if (hatchPresentationData instanceof AudioPresentationData) {
                hatchAttachmentFile = ((AudioPresentationData) hatchPresentationData).audio;
            } else {
                if (!(hatchPresentationData instanceof SlidesPresentationData)) {
                    if (hatchPresentationData instanceof GenericListPresentationData) {
                        List<GenericListRow> list = ((GenericListPresentationData) hatchPresentationData).list.items;
                        ArrayList arrayList = new ArrayList();
                        Iterator<GenericListRow> it = list.iterator();
                        while (it.hasNext()) {
                            HatchAttachmentFile hatchAttachmentFile2 = it.next().file;
                            if (hatchAttachmentFile2 != null) {
                                arrayList.add(hatchAttachmentFile2);
                            }
                        }
                        return arrayList;
                    }
                    if ((hatchPresentationData instanceof AvatarSharePresentationData) || (hatchPresentationData instanceof WidgetPresentationData) || (hatchPresentationData instanceof SpaceProposalPresentationData) || (hatchPresentationData instanceof SpaceBuildCompletedPresentationData) || (hatchPresentationData instanceof ShoppingResultsPresentationData) || (hatchPresentationData instanceof ShoppingCartPresentationData) || (hatchPresentationData instanceof BrowserTaskPresentationData) || (hatchPresentationData instanceof TextWithButtonPresentationData) || (hatchPresentationData instanceof ScheduledTaskCreatedPresentationData) || (hatchPresentationData instanceof ExternalLinkPresentationData) || (hatchPresentationData instanceof InternalLinkActionCardPresentationData) || (hatchPresentationData instanceof UnrenderablePresentationData)) {
                        return C0881AGi.A00;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                hatchAttachmentFile = ((SlidesPresentationData) hatchPresentationData).deck;
            }
        }
        return Collections.singletonList(hatchAttachmentFile);
    }
}
