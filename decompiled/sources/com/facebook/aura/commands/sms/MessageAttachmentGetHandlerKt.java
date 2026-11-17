package com.facebook.aura.commands.sms;

/* loaded from: classes3.dex */
public abstract class MessageAttachmentGetHandlerKt {
    public static final String ERROR_INVALID_ID = "invalid_attachment_id";
    public static final String ERROR_NOT_FOUND = "not_found";
    public static final String MISSING_IDS_MESSAGE = "`attachment_ids` is required \u2014 pass the `attachmentId` values from an `attachments` entry returned by message.search or the sms data source.";
    public static final String PARAM_ATTACHMENT_IDS = "attachment_ids";
    public static final String TAG = "MessageAttachmentGetHandler";
    public static final String TOO_MANY_IDS_MESSAGE = "At most 10 attachments can be fetched per call. Split the request.";
}
