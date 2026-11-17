package com.facebook.aura.commands.contacts;

import X.AGH;
import X.AnonymousClass006;
import X.C60O;
import X.C9jH;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ContactsCommandSpecs {
    public static final NodeCommandSpec CONTACTS_CREATE;
    public static final NodeCommandSpec CONTACTS_DELETE;
    public static final NodeCommandSpec CONTACTS_SEARCH;
    public static final NodeCommandSpec CONTACTS_UPDATE;
    public static final ContactsCommandSpecs INSTANCE = new ContactsCommandSpecs();

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        Map mapA10 = AnonymousClass006.A10("query", C60O.A09(nodeArgType, "Free-text keywords to match against the contact's name, organization, job title, email, note, address, and phone. Typo-tolerant."));
        List listSingletonList = Collections.singletonList(HatchNodeCardJsonKt.TYPE_CONTACTS);
        C9jH c9jHA0E = AGH.A0E();
        CONTACTS_SEARCH = new NodeCommandSpec("Search the device's contacts by keyword and return matching people. `query` is required \u2014 it does a typo-tolerant, accent-insensitive match across the contact's name, organization, job title, email, note, postal address, and phone number, and ranks the best matches first. Use it for requests like 'What's Sarah's number?', 'Find my dentist's contact', 'Who do I know at Acme?'. Prefer this over reading the full contacts data source when looking for specific people \u2014 it returns a small ranked result instead of the entire address book.", mapA10, c9jHA0E, listSingletonList, null, "Search results from the user's contacts, best match first. Ranking is fuzzy and matches organization, job title, email, note, address, and phone as well as the name, so the top result is a guess, not an answer \u2014 never treat it as the person the user meant just because it ranked first. `requiresUserChoice: true` means several saved people genuinely share the name that was searched for, and they are listed in `nameMatches`. When you see it, show the user those people by `displayName` and ask which one they mean. Where two of them share a `displayName` they are different people, so add something that tells them apart \u2014 the phone number, or the organization. Do NOT pick one yourself, and do not message or call anyone until they have answered. Once they choose, pass that person's `platformId` as `contact_ids` to `message.draft`, `message.send`, or the calling flow \u2014 never re-search by name. `nameMatchesTruncated: true` means `nameMatches` was capped and holds only some of the `nameMatchTotal` people who share that name \u2014 say so when you present the list, and ask the user for a fuller name to search instead of implying these are all of them.", 0L);
        CONTACTS_CREATE = new NodeCommandSpec("Create one or more device contacts silently after user approval. Use this only when the user asks to save people or businesses to contacts. Always pass contacts_json as a JSON array string, even for one contact. Each object must include display_name and may include phone_number, phone_label, email, email_label, organization, job_title, or note. Do not call contacts.create once per contact when the user asks to create multiple contacts; batching keeps this as one user-approved action. This writes directly to the Android Contacts provider; it does not open the Contacts app.", AnonymousClass006.A10("contacts_json", C60O.A09(nodeArgType, "JSON array string of contact objects. Use an array with one object for one contact, or many objects for many contacts. Do not send multiple contacts.create calls for one multi-contact user request.")), c9jHA0E, Collections.singletonList(HatchNodeCardJsonKt.TYPE_CONTACTS), null, "Confirmation that the contact was created.", 0L);
        CONTACTS_UPDATE = new NodeCommandSpec("Update one or more existing device contacts silently after user approval. Use this only when the user explicitly asks to change saved contacts. Always pass updates_json as a JSON array string, even for one contact. Each update object must include either platform_id from the contacts data source's platformId field or raw_contact_id returned by contacts.create, plus at least one replacement field such as display_name, phone_number, email, organization, job_title, or note. Do not call contacts.update once per contact when the user asks to update multiple contacts; batching keeps this as one user-approved action. This writes directly to the Android Contacts provider; it does not open the Contacts app.", AnonymousClass006.A10("updates_json", C60O.A09(nodeArgType, "JSON array string of update objects. Use an array with one object for one contact, or many objects for many contacts. Each object must include platform_id or raw_contact_id and at least one replacement field. Do not send multiple contacts.update calls for one multi-contact user request.")), c9jHA0E, Collections.singletonList(HatchNodeCardJsonKt.TYPE_CONTACTS), null, "Confirmation that the contact was updated.", 0L);
        CONTACTS_DELETE = new NodeCommandSpec("Delete one or more existing device contacts silently after user approval. Use this only when the user explicitly asks to remove saved contacts. Always pass targets_json as a JSON array string, even for one contact. Each target object must include either platform_id from the contacts data source's platformId field or raw_contact_id returned by contacts.create. Do not call contacts.delete once per contact when the user asks to delete multiple contacts; batching keeps this as one user-approved action. This writes directly to the Android Contacts provider; it does not open the Contacts app.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of target objects. Use an array with one object for one contact, or many objects for many contacts. Each object must include platform_id or raw_contact_id. Do not send multiple contacts.delete calls for one multi-contact user request.")), c9jHA0E, Collections.singletonList(HatchNodeCardJsonKt.TYPE_CONTACTS), null, "Confirmation that the contact was deleted.", 0L);
    }

    public final NodeCommandSpec getCONTACTS_CREATE() {
        return CONTACTS_CREATE;
    }

    public final NodeCommandSpec getCONTACTS_DELETE() {
        return CONTACTS_DELETE;
    }

    public final NodeCommandSpec getCONTACTS_SEARCH() {
        return CONTACTS_SEARCH;
    }

    public final NodeCommandSpec getCONTACTS_UPDATE() {
        return CONTACTS_UPDATE;
    }
}
