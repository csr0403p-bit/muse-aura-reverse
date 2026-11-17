package com.facebook.aura.commands.sms;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RequestedRecipient extends C06G {
    public final String address;
    public final String name;

    public RequestedRecipient(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.address = str;
        this.name = str2;
    }

    public final RequestedRecipient copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new RequestedRecipient(str, str2);
    }

    public static /* synthetic */ RequestedRecipient copy$default(RequestedRecipient requestedRecipient, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestedRecipient.address;
        }
        if ((i & 2) != 0) {
            str2 = requestedRecipient.name;
        }
        C7384Etj.A0Y(str, 0);
        return new RequestedRecipient(str, str2);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
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

    public /* synthetic */ RequestedRecipient(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
