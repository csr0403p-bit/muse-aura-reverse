package com.facebook.aura.commands.contacts;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ContactsCardInstructionKt$contactsCardEnvelope$1$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ ContactsCardItemInput $contact;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        String str = this.$contact.name;
        if (str != null && str.length() > 0) {
            C7qW.A06("name", str, c2nw);
        }
        String str2 = this.$contact.number;
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        C7qW.A06("number", str2, c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsCardInstructionKt$contactsCardEnvelope$1$1$1$1(ContactsCardItemInput contactsCardItemInput) {
        super(1);
        this.$contact = contactsCardItemInput;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
