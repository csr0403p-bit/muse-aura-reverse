package com.facebook.aura.commands.contacts;

import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.contacts.ContactsDataSource;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy", f = "ContactsDataSource.kt", l = {308}, m = "page", v = 2)
/* loaded from: classes3.dex */
public final class ContactsDataSource$ContactsBackfillStrategy$page$1 extends HzP {
    public int I$0;
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContactsDataSource.ContactsBackfillStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsDataSource$ContactsBackfillStrategy$page$1(ContactsDataSource.ContactsBackfillStrategy contactsBackfillStrategy, HtJ<? super ContactsDataSource$ContactsBackfillStrategy$page$1> htJ) {
        super(htJ);
        this.this$0 = contactsBackfillStrategy;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.page(0L, 0, this);
    }
}
