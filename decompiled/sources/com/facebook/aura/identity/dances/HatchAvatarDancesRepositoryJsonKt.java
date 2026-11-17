package com.facebook.aura.identity.dances;

import X.AGI;
import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchAttachmentPresentationJsonKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes.dex */
public abstract class HatchAvatarDancesRepositoryJsonKt {
    public static final AHD<HatchAvatarDance> toAvatarDances(List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : list) {
            int i = HatchAttachmentFile.$stable;
            HatchAttachmentFile attachmentFile = HatchAttachmentPresentationJsonKt.parseAttachmentFile(jsonElement);
            if (attachmentFile != null) {
                arrayList.add(attachmentFile);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AnonymousClass006.A1P(((HatchAttachmentFile) obj).label, obj, hashSet, arrayList2);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) it.next();
            arrayListA0i.add(new HatchAvatarDance(hatchAttachmentFile.label, hatchAttachmentFile));
        }
        return AGI.A07(arrayListA0i);
    }
}
