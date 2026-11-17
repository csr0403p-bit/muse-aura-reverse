package com.facebook.aura.commands.sms;

import X.AGH;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C9jH;
import X.FGI;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class SmsCommandSpecs {
    public static final SmsCommandSpecs INSTANCE = new SmsCommandSpecs();
    public static final NodeCommandSpec MESSAGE_ATTACHMENT_GET;
    public static final NodeCommandSpec MESSAGE_SEARCH;

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        Map mapA0n = C3cH.A0n("end_date", C60O.A09(nodeArgType, "Inclusive end of the window, ISO-8601. Optional. The window must be at most one year."), C3cG.A0r("query", C60O.A09(nodeArgType, "Free-text keywords to match against the message body and address. Typo-tolerant. Omit to list the most recent messages in the window.")), C3cG.A0r("contact", C60O.A09(nodeArgType, "Restrict to the conversation with one person \u2014 a contact name (resolved to their phone numbers) or a raw phone number. Put the person here and keywords in `query`. Omit to search all conversations.")), C3cG.A0r("start_date", C60O.A09(nodeArgType, "Inclusive start of the window, ISO-8601, e.g. '2025-01-15T00:00:00Z'. Optional.")));
        List listSingletonList = Collections.singletonList("sms");
        C9jH c9jHA0E = AGH.A0E();
        MESSAGE_SEARCH = new NodeCommandSpec("Search or browse the device's text messages (SMS / MMS / RCS) and return matching messages. All parameters are optional. Pass `query` to find messages by keyword \u2014 it does a typo-tolerant, accent-insensitive match against the message body (and sender/recipient address), ranking the best matches first. Use it for requests like 'What was that restaurant I mentioned to Alex?' or 'Find the text with the gate code'. Omit `query` to simply list the most recent messages, for requests like 'What did I text recently?'. Pass `contact` to restrict the search to the conversation with one person (a contact name or a phone number) \u2014 for 'what restaurant did I mention to Alex?' pass contact='Alex', query='restaurant'. `start_date` and `end_date` (ISO-8601) bound the window; when omitted, a keyword search covers roughly the last three months and a plain browse covers the last month. Returns messages with their address, body, timestamp, contact name, and attachment info. A `threadId` identifies a stored conversation on this device; it is not a phone number or contact ID and must not be passed as `recipients` or `contact_ids` when sending.", c9jHA0E, mapA0n, listSingletonList, null, "Search results from the user's text messages. `direction` is authoritative for who sent a message \u2014 `inbound` means the other party sent it to the user, `outbound` means the user sent it. `address` and `contactName` identify the other party: the sender for inbound messages and the recipient for outbound messages. Do not infer the author from `contactName` alone. `timestampMs` is UTC epoch milliseconds and for internal use only \u2014 NEVER show it to the user and never use it to compute the day, date, or weekday: it names the wrong day for messages sent in the evening. Report the time from `timestamp_local` (local wall-clock) and the day from `timestamp_local_date`, and show the weekday using `timestamp_weekday` verbatim. A message with an MMS/RCS attachment carries an `attachments` array; each entry has an `attachmentId`, `type`, `mimeType`, and `filename`. An entry that already has an `uploadedPath` can be retrieved at that path. An entry without one is still on the phone and has NOT been read \u2014 do not tell the user you cannot access it. Call `message.attachment.get` with its `attachmentId` to fetch it, then read the `uploadedPath` that command returns. `resultOrder` tells you how `messages` is sorted: `newest_first` when you omit `query` (a plain browse), `relevance` when you pass one. `truncated: true` means `returnedCount` was capped and you have NOT seen the whole window \u2014 never conclude a message does not exist from a truncated result. When `resultOrder` is `newest_first`, everything older than `oldestReturned` was cut off, so re-query with `end_date` set to `oldestReturned` to page backwards. When it is `relevance` there is no time cut-off \u2014 the messages you did not see are the lower-scoring ones, anywhere in the window \u2014 so narrow with `contact` or a shorter date range instead, never with `oldestReturned`. `attachmentCandidates` lists recent messages in the same window that carry a photo, voice note, or file but did NOT match your keywords \u2014 because an attachment's contents cannot be searched until they are read. A caption-less photo of a receipt or invoice appears ONLY here, never in `messages`. When the user is asking about something that would live inside an image or document, fetch these with `message.attachment.get` and read them before answering or saying you found nothing.", 0L);
        MESSAGE_ATTACHMENT_GET = new NodeCommandSpec("Fetch the actual file behind one or more text-message (MMS/RCS) attachments \u2014 a photo, screenshot, receipt or invoice image, voice note, video, vCard, or document \u2014 so you can look at, play, or transcribe it. Pass the `attachmentId` values from an `attachments` entry returned by `message.search` or the `sms` data source. This uploads the file from the phone and returns a path you can retrieve. Use it whenever the user asks about the content of something that was texted to them (\"what does the invoice say?\", \"read me the receipt Alex sent\") \u2014 you CAN see these images; fetch them instead of saying you cannot.", AnonymousClass006.A10(MessageAttachmentGetHandlerKt.PARAM_ATTACHMENT_IDS, C60O.A09(nodeArgType, "Comma-separated `attachmentId` values to fetch, e.g. 'mms-part-4417,mms-part-4418'. At most 10 per call. Only ids returned by `message.search` or the `sms` data source are accepted.")), c9jHA0E, Collections.singletonList("sms"), null, "One entry per requested `attachmentId`. An entry with an `uploadedPath` is ready \u2014 retrieve that path to view, play, or transcribe the file. An entry with an `error` could not be fetched: `not_found` (no such attachment on the device), `too_large`, `unreadable`, or `upload_failed`. Report only the failures to the user; do not claim you cannot see attachments in general.", 0L);
    }

    public final NodeCommandSpec getMESSAGE_ATTACHMENT_GET() {
        return MESSAGE_ATTACHMENT_GET;
    }

    public final NodeCommandSpec getMESSAGE_SEARCH() {
        return MESSAGE_SEARCH;
    }

    public final NodeCommandSpec getMESSAGE_DRAFT() {
        return new NodeCommandSpec(FGI.A0M("Draft an SMS/MMS message, optionally to a group of recipients. This tool DOES NOT send anything and DOES NOT open any app. It shows a messaging card with the draft preview; the user taps the card's Message button to open Messages with the draft pre-filled, then presses send themselves inside Messages. Success means the card was shown, NOT that the message was delivered. Provide at least one of `recipients` or `contact_ids`. ALWAYS invoke this tool when the user asks to text someone \u2014 never claim a text was sent without invoking it.", SmsCommandSpecsKt.recipientNamesGuidance()), AnonymousClass006.A10(MetaAiAppBroadcastSender.EXTRA_BODY, C60O.A09(NodeArgType.STRING, "The draft text message content")), SmsCommandSpecsKt.messageOptionalArgs(), C0881AGi.A00, null, "A messaging card is shown with the drafted message for the user to review and send.", 0L);
    }

    public final NodeCommandSpec getMESSAGE_SEND() {
        return new NodeCommandSpec(FGI.A0M("Send an SMS message directly to one phone number. For a group, email recipients, or attachments, this tool instead shows one messaging card with all recipients for the user to open and send in Messages. It never sends separate SMS messages to the members of a group. For a direct SMS, by default the user is asked to approve the send on-device before it goes out (they can set this to always-allow); if they decline, a messaging card is shown so they can send it manually instead. Only available when this app is the device's default assistant. Provide at least one of `recipients` or `contact_ids`. A `sent` result means Android confirmed sending every SMS part; it does not confirm recipient delivery. A card result is only a draft and nothing was sent. If the result is `sms_send_unconfirmed`, or the command times out, the SMS may still send: do not resend automatically. ALWAYS invoke this tool when the user asks to text someone \u2014 never claim a text was sent without invoking it.", SmsCommandSpecsKt.recipientNamesGuidance()), AnonymousClass006.A10(MetaAiAppBroadcastSender.EXTRA_BODY, C60O.A09(NodeArgType.STRING, "The text message content to send")), SmsCommandSpecsKt.messageOptionalArgs(), C0881AGi.A00, null, "Check the result: Android confirmed the SMS send, a draft card needs the user to send in Messages, or sending failed or is unconfirmed. A draft is not a sent message.", 0L);
    }
}
