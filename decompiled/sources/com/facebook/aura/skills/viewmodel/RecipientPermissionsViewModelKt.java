package com.facebook.aura.skills.viewmodel;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.C3cG;
import X.C3cH;
import com.facebook.aura.skills.repo.RecipientPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class RecipientPermissionsViewModelKt {
    public static final AHD<RecipientPermissionGroup> toGroups(Collection<RecipientPermission> collection) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (RecipientPermission recipientPermission : collection) {
            String str = recipientPermission.actionKey;
            Object objA0h = linkedHashMapA0j.get(str);
            if (objA0h == null) {
                objA0h = C3cG.A0h();
                linkedHashMapA0j.put(str, objA0h);
            }
            ((List) objA0h).add(recipientPermission);
        }
        ArrayList arrayList = new ArrayList(linkedHashMapA0j.size());
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String str2 = (String) entryA0l.getKey();
            List list = (List) entryA0l.getValue();
            arrayList.add(new RecipientPermissionGroup(str2, ((RecipientPermission) AbstractC0878AGe.A0F(list)).actionLabel, AGI.A0C(list)));
        }
        return AGI.A0C(arrayList);
    }
}
