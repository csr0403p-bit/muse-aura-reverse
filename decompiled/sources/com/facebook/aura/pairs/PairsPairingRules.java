package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06827l3;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.navigation.key.PairsRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PairsPairingRules {
    public static final int $stable = 0;
    public static final PairsPairingRules INSTANCE = new PairsPairingRules();

    public final boolean confirmsByItself(PairsRole pairsRole, PairsContact pairsContact, String str) {
        boolean zA1a = AnonymousClass002.A1a(pairsRole, pairsContact);
        if (str != null && namesMatch(str, pairsContact.displayName)) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = pairsRole.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != zA1a) {
                    throw C3cG.A0q();
                }
            } else if (pairsContact.level == PairsLevel.ASK_FIRST) {
            }
            return zA1a;
        }
        return false;
    }

    public final String expectedName(PairsContact pairsContact, PairsRole pairsRole, PairsHubSnapshot pairsHubSnapshot) {
        PairsInvitePreview pairsInvitePreview;
        boolean zA1Z = AnonymousClass005.A1Z(pairsContact, pairsRole, pairsHubSnapshot);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = pairsRole.ordinal();
        if (iOrdinal == 0) {
            PairsInviteRecord pairsInviteRecordClaimedInvite = claimedInvite(pairsContact, pairsHubSnapshot);
            if (pairsInviteRecordClaimedInvite == null || !pairsHubSnapshot.mintedInviteIds.contains(pairsInviteRecordClaimedInvite.id)) {
                return null;
            }
            return pairsInviteRecordClaimedInvite.label;
        }
        if (iOrdinal != zA1Z) {
            throw C3cG.A0q();
        }
        PairsRelationship pairsRelationship = pairsContact.relationship;
        PairsHeldInvite pairsHeldInviteHeldInvite = heldInvite(pairsRelationship != null ? pairsRelationship.generationId : null, pairsHubSnapshot);
        if (pairsHeldInviteHeldInvite == null || (pairsInvitePreview = pairsHeldInviteHeldInvite.preview) == null) {
            return null;
        }
        return pairsInvitePreview.displayName;
    }

    public final List<String> generationsToConfirm(PairsHubSnapshot pairsHubSnapshot) {
        String str;
        C7384Etj.A0Y(pairsHubSnapshot, 0);
        List<PairsContact> list = pairsHubSnapshot.contacts;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PairsContact pairsContact : list) {
            PairsContact pairsContact2 = pairsContact;
            PairsPairingRules pairsPairingRules = INSTANCE;
            if (pairsPairingRules.isConfirmable(pairsContact2, pairsHubSnapshot.access) && (pairsPairingRules.appConfirms(pairsContact2, pairsHubSnapshot) || (pairsPairingRules.role(pairsContact2, pairsHubSnapshot) == PairsRole.RECEIVER && pairsPairingRules.confirmsByItself(pairsContact2, pairsHubSnapshot)))) {
                arrayListA0h.add(pairsContact);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            PairsRelationship pairsRelationship = ((PairsContact) it.next()).relationship;
            if (pairsRelationship != null && (str = pairsRelationship.generationId) != null) {
                arrayListA0h2.add(str);
            }
        }
        return arrayListA0h2;
    }

    public final List<PairsInboxRequest> inboxRequests(PairsHubSnapshot pairsHubSnapshot, long j) {
        C7384Etj.A0Y(pairsHubSnapshot, 0);
        if (!pairsHubSnapshot.access.canAcceptInvites) {
            return C0881AGi.A00;
        }
        List<PairsInboxRequest> list = pairsHubSnapshot.inboxRequests;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PairsInboxRequest pairsInboxRequest : list) {
            if (pairsInboxRequest.expiresAtMs > j) {
                arrayListA0h.add(pairsInboxRequest);
            }
        }
        return arrayListA0h;
    }

    public final boolean needsOwnerConfirmation(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        boolean zA1a = AnonymousClass002.A1a(pairsContact, pairsHubSnapshot);
        if (!isConfirmable(pairsContact, pairsHubSnapshot.access) || confirmsByItself(pairsContact, pairsHubSnapshot) || appConfirms(pairsContact, pairsHubSnapshot)) {
            return false;
        }
        return zA1a;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsRole.values().length];
            try {
                AnonymousClass002.A13(PairsRole.INVITER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsRole.RECEIVER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String canonicalName(String str) {
        List listA05 = C06827l3.A02("\\s+").A05(str);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return AnonymousClass001.A0u(C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h));
    }

    private final PairsInviteRecord claimedInvite(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        PairsInviteRecord next;
        Iterator<PairsInviteRecord> it = pairsHubSnapshot.invites.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PairsInviteRecord pairsInviteRecord = next;
            if (C7384Etj.areEqual(pairsInviteRecord.claimedByMuse, pairsContact.museId)) {
                long j = pairsInviteRecord.expiresAtMs;
                Long l = pairsContact.requestExpiresAtMs;
                if (l != null && j == l.longValue()) {
                    break;
                }
            }
        }
        return next;
    }

    private final PairsHeldInvite heldInvite(String str, PairsHubSnapshot pairsHubSnapshot) {
        PairsHeldInvite next;
        Iterator<PairsHeldInvite> it = pairsHubSnapshot.heldInvites.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.generationId, str)) {
                break;
            }
        }
        return next;
    }

    private final boolean isConfirmable(PairsContact pairsContact, PairsAccess pairsAccess) {
        return pairsAccess.canConfirmSafetyCode && pairsContact.relationshipState == PairsRelationshipState.AWAITING_SAS && !pairsContact.sasConfirmedLocal;
    }

    private final boolean appConfirms(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        PairsRole pairsRoleRole = role(pairsContact, pairsHubSnapshot);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = pairsRoleRole.ordinal();
        if (iOrdinal == 0) {
            PairsInviteRecord pairsInviteRecordClaimedInvite = claimedInvite(pairsContact, pairsHubSnapshot);
            return pairsInviteRecordClaimedInvite != null && pairsInviteRecordClaimedInvite.sentOnMuse;
        }
        if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        Set<String> set = pairsHubSnapshot.acceptedRequestGenerations;
        PairsRelationship pairsRelationship = pairsContact.relationship;
        return AbstractC0878AGe.A0k(set, pairsRelationship != null ? pairsRelationship.generationId : null);
    }

    private final boolean namesMatch(String str, String str2) {
        String strCanonicalName = canonicalName(str);
        return strCanonicalName.length() > 0 && strCanonicalName.equals(canonicalName(str2));
    }

    public final PairsRole role(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        AnonymousClass003.A0u(pairsContact, pairsHubSnapshot);
        PairsRelationship pairsRelationship = pairsContact.relationship;
        return (heldInvite(pairsRelationship != null ? pairsRelationship.generationId : null, pairsHubSnapshot) != null || claimedInvite(pairsContact, pairsHubSnapshot) == null) ? PairsRole.RECEIVER : PairsRole.INVITER;
    }

    private final boolean confirmsByItself(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        PairsRole pairsRoleRole = role(pairsContact, pairsHubSnapshot);
        return confirmsByItself(pairsRoleRole, pairsContact, expectedName(pairsContact, pairsRoleRole, pairsHubSnapshot));
    }
}
