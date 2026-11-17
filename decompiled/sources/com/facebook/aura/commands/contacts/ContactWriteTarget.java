package com.facebook.aura.commands.contacts;

/* loaded from: classes3.dex */
public final class ContactWriteTarget {
    public final long contactId;
    public final String lookupKey;
    public final long rawContactId;

    public final long getContactId() {
        return this.contactId;
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final long getRawContactId() {
        return this.rawContactId;
    }

    public ContactWriteTarget(long j, long j2, String str) {
        this.contactId = j;
        this.rawContactId = j2;
        this.lookupKey = str;
    }
}
