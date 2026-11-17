package com.facebook.aura.commands.sms;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class RecipientResolution extends C06G {
    public final List<AmbiguousNameMatch> ambiguous;
    public final boolean contactsPermissionDenied;
    public final List<String> droppedInvalid;
    public final List<String> recipients;
    public final List<String> unresolvedContactIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecipientResolution copy$default(RecipientResolution recipientResolution, List list, List list2, List list3, boolean z, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recipientResolution.recipients;
        }
        if ((i & 2) != 0) {
            list2 = recipientResolution.droppedInvalid;
        }
        if ((i & 4) != 0) {
            list3 = recipientResolution.ambiguous;
        }
        if ((i & 8) != 0) {
            z = recipientResolution.contactsPermissionDenied;
        }
        if ((i & 16) != 0) {
            list4 = recipientResolution.unresolvedContactIds;
        }
        return recipientResolution.copy(list, list2, list3, z, list4);
    }

    public final List<String> component1() {
        return this.recipients;
    }

    public final List<String> component2() {
        return this.droppedInvalid;
    }

    public final List<AmbiguousNameMatch> component3() {
        return this.ambiguous;
    }

    public final boolean component4() {
        return this.contactsPermissionDenied;
    }

    public final List<String> component5() {
        return this.unresolvedContactIds;
    }

    public final List<AmbiguousNameMatch> getAmbiguous() {
        return this.ambiguous;
    }

    public final boolean getContactsPermissionDenied() {
        return this.contactsPermissionDenied;
    }

    public final List<String> getDroppedInvalid() {
        return this.droppedInvalid;
    }

    public final List<String> getRecipients() {
        return this.recipients;
    }

    public final List<String> getUnresolvedContactIds() {
        return this.unresolvedContactIds;
    }

    public RecipientResolution(List<String> list, List<String> list2, List<AmbiguousNameMatch> list3, boolean z, List<String> list4) {
        AnonymousClass005.A0x(list, list2, list3);
        C7384Etj.A0Y(list4, 4);
        this.recipients = list;
        this.droppedInvalid = list2;
        this.ambiguous = list3;
        this.contactsPermissionDenied = z;
        this.unresolvedContactIds = list4;
    }

    public final RecipientResolution copy(List<String> list, List<String> list2, List<AmbiguousNameMatch> list3, boolean z, List<String> list4) {
        AnonymousClass005.A0x(list, list2, list3);
        C7384Etj.A0Y(list4, 4);
        return new RecipientResolution(list, list2, list3, z, list4);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientResolution(List list, List list2, List list3, boolean z, List list4, int i, C06H c06h) {
        this(list, C3cI.A11(list2, i), C3cI.A12(list3, i), C3cG.A1K(i & 8, z), (i & 16) != 0 ? C0881AGi.A00 : list4);
    }
}
