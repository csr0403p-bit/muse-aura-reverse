package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06827l3;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.pairs.ConnectionsSheetItem;
import com.facebook.aura.pairs.ConnectionsUiState;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ConnectionsViewModelKt {
    public static final C06827l3 COMBINING_MARKS = C06827l3.A02("\\p{Mn}+");
    public static final String INVITE_LINK_ACTION_KEY = "invite-link";
    public static final int MAX_SEARCH_LENGTH = 100;
    public static final int MIN_SEARCH_LENGTH = 2;
    public static final long SEARCH_DEBOUNCE_MS = 300;
    public static final String TAG = "ConnectionsViewModel";

    public static final boolean isOpenable(ConnectionsActivity connectionsActivity) {
        C7384Etj.A0Y(connectionsActivity, 0);
        ConnectionsSharedFile connectionsSharedFile = connectionsActivity.file;
        return ((connectionsSharedFile == null || connectionsSharedFile.workspacePath == null) && connectionsActivity.link == null && connectionsActivity.receivedShareId == null && getSpaceSlugToResolve(connectionsActivity) == null && connectionsActivity.destination == null) ? false : true;
    }

    public static final boolean matches(PairsSuggestion pairsSuggestion, List<String> list) {
        boolean zA1a = AnonymousClass002.A1a(pairsSuggestion, list);
        if (!list.isEmpty()) {
            String strNormalizedForSearch = normalizedForSearch(C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, pairsSuggestion.searchableNames));
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (!C7BY.A0q(strNormalizedForSearch, AnonymousClass005.A0j(it), false)) {
                        return false;
                    }
                }
            }
        }
        return zA1a;
    }

    public static final List<String> searchTerms(String str) {
        C7384Etj.A0Y(str, 0);
        List listA05 = C06827l3.A02("\\s+").A05(normalizedForSearch(str));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA05);
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C7BY.A0a(AnonymousClass005.A0j(it), '@'));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0i.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it2);
        }
        return arrayListA0h;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsError.values().length];
            try {
                AnonymousClass002.A13(PairsError.NOT_FOUND, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsError.CONFLICT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PairsError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int copyLinkMessage(PairsError pairsError) {
        return pairsError == PairsError.CONFLICT ? R.string._name_removed__res_0x7f120d73 : R.string._name_removed__res_0x7f120d5a;
    }

    public static final String getSpaceSlugToResolve(ConnectionsActivity connectionsActivity) {
        String str;
        ConnectionsSharedSpace connectionsSharedSpace = connectionsActivity.space;
        if (connectionsSharedSpace == null || (str = connectionsSharedSpace.slug) == null || (connectionsActivity.destination instanceof PeerSpaceScreenKey)) {
            return null;
        }
        return str;
    }

    public static final ConnectionsSheetItem item(ConnectionsUiState.Loaded loaded, ConnectionsSheetSubject connectionsSheetSubject) {
        Object next;
        Object next2;
        ConnectionsSheetItem group = null;
        if (connectionsSheetSubject instanceof ConnectionsSheetSubject.Person) {
            Iterator it = loaded.connections.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (C7384Etj.areEqual(((ConnectionsPerson) next2).contact.museId, ((ConnectionsSheetSubject.Person) connectionsSheetSubject).museId)) {
                    break;
                }
            }
            ConnectionsPerson connectionsPerson = (ConnectionsPerson) next2;
            if (connectionsPerson != null) {
                group = new ConnectionsSheetItem.Person(connectionsPerson);
            }
        } else {
            if (!(connectionsSheetSubject instanceof ConnectionsSheetSubject.Group)) {
                throw C3cG.A0q();
            }
            Iterator it2 = loaded.groups.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (C7384Etj.areEqual(((ConnectionsGroup) next).connectionId, ((ConnectionsSheetSubject.Group) connectionsSheetSubject).connectionId)) {
                    break;
                }
            }
            ConnectionsGroup connectionsGroup = (ConnectionsGroup) next;
            if (connectionsGroup != null) {
                group = new ConnectionsSheetItem.Group(connectionsGroup);
            }
        }
        return group;
    }

    public static final String normalizedForSearch(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKD);
        C7384Etj.A0U(strNormalize);
        return C60Q.A0j(COMBINING_MARKS.A03(strNormalize, ""));
    }

    public static final int cancelMessage(PairsError pairsError) {
        int iOrdinal = pairsError.ordinal();
        return iOrdinal != 1 ? iOrdinal != 3 ? iOrdinal != 0 ? R.string._name_removed__res_0x7f120d55 : R.string._name_removed__res_0x7f120d9f : R.string._name_removed__res_0x7f120d87 : R.string._name_removed__res_0x7f120d88;
    }
}
