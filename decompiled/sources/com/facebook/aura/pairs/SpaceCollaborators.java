package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.HxE;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class SpaceCollaborators {
    public static final int $stable = 8;
    public final List<SpaceAccessRequest> accessRequests;
    public final List<SpaceCollaborator> collaborators;
    public final Set<String> principals;
    public final JsonElement revision;

    /* JADX WARN: Multi-variable type inference failed */
    public final SpaceCollaboratorsUpdateJson update(String str, HxE<String, ? extends SpaceRole> hxE, List<String> list) {
        SpaceRole spaceRole;
        C7384Etj.A0Y(list, 2);
        List<SpaceCollaborator> list2 = this.collaborators;
        ArrayList arrayListA0h = C3cG.A0h();
        for (SpaceCollaborator spaceCollaborator : list2) {
            AnonymousClass006.A1O(spaceCollaborator.principal, str, spaceCollaborator, arrayListA0h);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            String str2 = ((SpaceCollaborator) it.next()).principal;
            String wire = null;
            if (hxE != null && C7384Etj.areEqual(hxE.first, str2) && (spaceRole = (SpaceRole) hxE.second) != null) {
                wire = spaceRole.getWire();
            }
            arrayListA0m.add(new SpaceCollaboratorUpdateJson(str2, wire));
        }
        Set<String> set = this.principals;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C60R.A1P(arrayListA0h2, it2, set);
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h2);
        Iterator it3 = arrayListA0h2.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(new SpaceCollaboratorUpdateJson(AnonymousClass005.A0j(it3), SpaceRole.USE.getWire()));
        }
        return new SpaceCollaboratorsUpdateJson(AbstractC0878AGe.A0P(arrayListA0m2, arrayListA0m), this.revision);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpaceCollaboratorsUpdateJson update$default(SpaceCollaborators spaceCollaborators, String str, HxE hxE, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            hxE = null;
        }
        return spaceCollaborators.update(str, hxE, C3cI.A12(list, i));
    }

    public final List<SpaceAccessRequest> getAccessRequests() {
        return this.accessRequests;
    }

    public final List<SpaceCollaborator> getCollaborators() {
        return this.collaborators;
    }

    public final Set<String> getPrincipals() {
        return this.principals;
    }

    public final JsonElement getRevision() {
        return this.revision;
    }

    public SpaceCollaborators(List<SpaceCollaborator> list, List<SpaceAccessRequest> list2, JsonElement jsonElement) {
        AnonymousClass003.A0u(list, list2);
        this.collaborators = list;
        this.accessRequests = list2;
        this.revision = jsonElement;
        HashSet hashSetA13 = C60O.A13();
        Iterator<SpaceCollaborator> it = list.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().principal);
        }
        this.principals = hashSetA13;
    }
}
