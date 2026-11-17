package com.facebook.aura.commands.sms;

import X.AnonymousClass003;
import X.C06G;

/* loaded from: classes3.dex */
public final class UnconfirmedName extends C06G {
    public final String address;
    public final String claimedName;

    public static /* synthetic */ UnconfirmedName copy$default(UnconfirmedName unconfirmedName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unconfirmedName.claimedName;
        }
        if ((i & 2) != 0) {
            str2 = unconfirmedName.address;
        }
        AnonymousClass003.A0u(str, str2);
        return new UnconfirmedName(str, str2);
    }

    public final String component1() {
        return this.claimedName;
    }

    public final String component2() {
        return this.address;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getClaimedName() {
        return this.claimedName;
    }

    public UnconfirmedName(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.claimedName = str;
        this.address = str2;
    }

    public final UnconfirmedName copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new UnconfirmedName(str, str2);
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
}
