package com.facebook.aura.commands.sms;

import X.AnonymousClass002;
import X.C3cG;
import X.C3cH;
import X.C4JM;
import X.C60O;
import X.C9Y;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class SmsCommandSpecsKt {
    public static final int MAX_ATTACHMENT_FETCH = 10;
    public static final String RECIPIENTS_BASE = "Who to send to. Two accepted shapes: a comma-separated list of raw phone numbers (e.g. \"+15551234567\") / email addresses, or a JSON array of objects that may also carry a name, e.g. '[{\"address\":\"+15551234567\",\"name\":\"Natasha\"}]'. `name` is only a display label for the card and never changes who is messaged \u2014 the message is always addressed by `address` \u2014 and whether to set it depends on this device's Contacts permission, covered next. Values that are neither a phone number nor an email are treated as contact names only when `resolve_name` is true; otherwise the entire request is rejected. Every recipient must resolve before anything is sent. For a known contact prefer `contact_ids`. Pass this parameter as a string, not a JSON array. Never use a message ID or thread ID as an address.";
    public static final String RECIPIENTS_CONTACTS_DENIED = " This device has NOT granted Contacts permission, so the card CANNOT look a number up \u2014 always use the object form and set `name` whenever you know whose number it is, including when you referred to them by name or relationship earlier in the conversation.";
    public static final String RECIPIENTS_CONTACTS_GRANTED = " This device HAS granted Contacts permission, so the card labels recipients from the address book on its own and `name` can only hurt: it is ignored for an address the book recognises, and a named phone number the book does not recognise is refused as `unverified_contact_name` with nothing sent \u2014 a number you recall from memory or an earlier chat may be stale or belong to someone else, and the user cannot tell from the card. Leave `name` unset. Send a number the user gave you directly as a bare address, and reach a person the user named by passing their `platform_id` in `contact_ids`.";
    public static final String SMS_PERMISSION_DENIED_MESSAGE = "SMS permission is not granted. The user can enable it in the app settings under Device Permissions, or in the system Settings app under App Permissions.";

    public static final Map<String, NodeArgSpec> messageOptionalArgs() {
        NodeArgType nodeArgType = NodeArgType.STRING;
        return C3cH.A0n(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, C60O.A09(NodeArgType.STRING, "JSON array string of files to attach, each an object with a `path` (a workspace file path) and optional `file_name` and `mime_type` \u2014 e.g. '[{\"path\":\"workspace/user/files/photo.jpg\",\"mime_type\":\"image/jpeg\"}]'. Attaching files turns the draft into an MMS. Entries without a `path` are skipped; a value with no usable entries, such as a bare file path, is rejected and nothing is sent."), C3cG.A0r("recipients", C60O.A09(nodeArgType, RECIPIENTS_BASE.concat(contactsGranted() ? RECIPIENTS_CONTACTS_GRANTED : RECIPIENTS_CONTACTS_DENIED))), C3cG.A0r("contact_ids", C60O.A09(nodeArgType, "A string containing comma-separated contact ids (the `platform_id` returned by contacts.search) to resolve to phone numbers. Use for contacts the user picked or that were disambiguated after an ambiguous name match. Do not pass an array, message IDs, or thread IDs. If any ID cannot be resolved, nothing is sent; look up the contacts again.")), C3cG.A0r("resolve_name", C60O.A09(NodeArgType.BOOLEAN, "When true, non-phone/non-email values in `recipients` are looked up as contact names. A name is never messaged directly: every match is returned for the user to pick from, or \u2014 when only one contact matched \u2014 to confirm, after which you call again with that `contact_id` in `contact_ids`. Name matching is fuzzy, so a single match is not proof it is the right person.")));
    }

    public static final boolean contactsGranted() {
        return AnonymousClass002.A1M(C4JM.A00().checkSelfPermission("android.permission.READ_CONTACTS"));
    }

    public static final String recipientNamesGuidance() {
        return contactsGranted() ? " The card names every recipient from the device address book itself, so do NOT set `name` on `recipients`: it is ignored for anyone the address book recognises, and for anyone it does not the send is refused rather than going out under a name nothing confirms. To message a person the user named, pass their `platform_id` in `contact_ids`." : " IMPORTANT: this device has NOT granted Contacts permission, so the card cannot turn a phone number into a name on its own. Whenever you know who a number belongs to \u2014 including when you referred to them by name or relationship in your reply (\"your wife\", \"Natasha\") \u2014 pass `recipients` in its object form so the name rides along with the number, e.g. recipients='[{\"address\":\"+15551234567\",\"name\":\"Natasha\"}]'. Using the bare comma-separated form instead shows the user a phone number with no name.";
    }
}
