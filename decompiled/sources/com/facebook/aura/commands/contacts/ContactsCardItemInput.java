package com.facebook.aura.commands.contacts;

import X.C06H;

/* loaded from: classes3.dex */
public final class ContactsCardItemInput {
    public final String name;
    public final String number;

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public ContactsCardItemInput(String str, String str2) {
        this.name = str;
        this.number = str2;
    }

    public /* synthetic */ ContactsCardItemInput(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ContactsCardItemInput() {
        this(null, null);
    }
}
