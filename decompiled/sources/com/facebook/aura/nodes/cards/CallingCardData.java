package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CallingCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String contactName;
    public final String phoneNumber;

    public CallingCardData(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.phoneNumber = str;
        this.contactName = str2;
    }

    public final CallingCardData copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CallingCardData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallingCardData) {
                CallingCardData callingCardData = (CallingCardData) obj;
                if (!C7384Etj.areEqual(this.phoneNumber, callingCardData.phoneNumber) || !C7384Etj.areEqual(this.contactName, callingCardData.contactName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallingCardData copy$default(CallingCardData callingCardData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callingCardData.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = callingCardData.contactName;
        }
        C7384Etj.A0Y(str, 0);
        return new CallingCardData(str, str2);
    }

    public final String component1() {
        return this.phoneNumber;
    }

    public final String component2() {
        return this.contactName;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.phoneNumber) + AnonymousClass006.A0G(this.contactName);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallingCardData(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
