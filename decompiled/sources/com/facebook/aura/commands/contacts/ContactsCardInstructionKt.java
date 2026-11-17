package com.facebook.aura.commands.contacts;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class ContactsCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.contacts.ContactsCardInstructionKt$contactsCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ List<ContactsCardItemInput> $contacts;

        /* renamed from: com.facebook.aura.commands.contacts.ContactsCardInstructionKt$contactsCardEnvelope$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00621 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<ContactsCardItemInput> $contacts;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<ContactsCardItemInput> it = this.$contacts.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new ContactsCardInstructionKt$contactsCardEnvelope$1$1$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00621(List<ContactsCardItemInput> list) {
                super(1);
                this.$contacts = list;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
                invoke2(c7pd);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            C7384Etj.A0Y(c2nw, 0);
            C7qW.A06("action", this.$action, c2nw);
            C7qW.A07(HatchNodeCardJsonKt.TYPE_CONTACTS, new C00621(this.$contacts), c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, List<ContactsCardItemInput> list) {
            super(1);
            this.$action = str;
            this.$contacts = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static final String contactsCardEnvelope(String str, List<ContactsCardItemInput> list) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(list, 1);
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_CONTACTS, null, null, null, new AnonymousClass1(str, list));
    }
}
