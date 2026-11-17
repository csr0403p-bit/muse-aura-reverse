package com.facebook.aura.commands.sms;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BFI;
import X.C06G;
import X.C0881AGi;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.core.NodeTextRelevanceScorer;
import com.facebook.aura.commands.sms.SmsSearchMatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class SmsSearchMatcher {
    public static final double WEIGHT_ADDRESS = 1.0d;
    public static final double WEIGHT_ATTACHMENT = 1.5d;
    public static final double WEIGHT_BODY = 3.0d;
    public static final double WEIGHT_CONTACT_NAME = 2.0d;
    public static final SmsSearchMatcher INSTANCE = new SmsSearchMatcher();
    public static final Map<String, String> ATTACHMENT_SYNONYMS = AGH.A0D(C3cG.A0r("image", "image photo picture pic screenshot scan"), C3cG.A0r("video", "video clip movie recording"), C3cG.A0r("audio", "audio voice note voicemail recording"), C3cG.A0r("contact", "contact card vcard"), C3cG.A0r("text", "text file document"), C3cG.A0r(DeviceSmsReaderKt.ATTACHMENT_OTHER, "file attachment document"));

    public final class ScoredMessage extends C06G {
        public final SearchableMessage message;
        public final double score;

        public ScoredMessage(SearchableMessage searchableMessage, double d) {
            C7384Etj.A0Y(searchableMessage, 0);
            this.message = searchableMessage;
            this.score = d;
        }

        public final ScoredMessage copy(SearchableMessage searchableMessage, double d) {
            C7384Etj.A0Y(searchableMessage, 0);
            return new ScoredMessage(searchableMessage, d);
        }

        public static /* synthetic */ ScoredMessage copy$default(ScoredMessage scoredMessage, SearchableMessage searchableMessage, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                searchableMessage = scoredMessage.message;
            }
            if ((i & 2) != 0) {
                d = scoredMessage.score;
            }
            C7384Etj.A0Y(searchableMessage, 0);
            return new ScoredMessage(searchableMessage, d);
        }

        public final SearchableMessage component1() {
            return this.message;
        }

        public final double component2() {
            return this.score;
        }

        public final SearchableMessage getMessage() {
            return this.message;
        }

        public final double getScore() {
            return this.score;
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

    public final class SearchableMessage extends C06G {
        public final long dateMs;
        public final List<NodeTextRelevanceScorer.WeightedField> fields;
        public final CanonicalSmsMessage message;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchableMessage copy$default(SearchableMessage searchableMessage, CanonicalSmsMessage canonicalSmsMessage, List list, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                canonicalSmsMessage = searchableMessage.message;
            }
            if ((i & 2) != 0) {
                list = searchableMessage.fields;
            }
            if ((i & 4) != 0) {
                j = searchableMessage.dateMs;
            }
            return searchableMessage.copy(canonicalSmsMessage, list, j);
        }

        public final CanonicalSmsMessage component1() {
            return this.message;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> component2() {
            return this.fields;
        }

        public final long component3() {
            return this.dateMs;
        }

        public final long getDateMs() {
            return this.dateMs;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> getFields() {
            return this.fields;
        }

        public final CanonicalSmsMessage getMessage() {
            return this.message;
        }

        public SearchableMessage(CanonicalSmsMessage canonicalSmsMessage, List<NodeTextRelevanceScorer.WeightedField> list, long j) {
            AnonymousClass003.A0u(canonicalSmsMessage, list);
            this.message = canonicalSmsMessage;
            this.fields = list;
            this.dateMs = j;
        }

        public final SearchableMessage copy(CanonicalSmsMessage canonicalSmsMessage, List<NodeTextRelevanceScorer.WeightedField> list, long j) {
            AnonymousClass003.A0u(canonicalSmsMessage, list);
            return new SearchableMessage(canonicalSmsMessage, list, j);
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

    /* renamed from: com.facebook.aura.commands.sms.SmsSearchMatcher$attachmentText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<SmsAttachment, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(SmsAttachment smsAttachment) {
            C7384Etj.A0Y(smsAttachment, 0);
            String str = SmsSearchMatcher.ATTACHMENT_SYNONYMS.get(smsAttachment.type);
            if (str == null) {
                str = smsAttachment.type;
            }
            List listAsList = Arrays.asList(str, C7BY.A0Q(smsAttachment.mimeType, "", '/'), smsAttachment.filename);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                AnonymousClass007.A19(arrayListA0h, it);
            }
            return AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", arrayListA0h, null);
        }
    }

    public final SearchableMessage searchableOf(CanonicalSmsMessage canonicalSmsMessage) {
        C7384Etj.A0Y(canonicalSmsMessage, 0);
        NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
        return new SearchableMessage(canonicalSmsMessage, BFI.A0F(new NodeTextRelevanceScorer.WeightedField[]{nodeTextRelevanceScorer.field(canonicalSmsMessage.body, 3.0d), nodeTextRelevanceScorer.field(canonicalSmsMessage.contactName, 2.0d), nodeTextRelevanceScorer.field(attachmentText(canonicalSmsMessage), 1.5d), nodeTextRelevanceScorer.field(canonicalSmsMessage.address, 1.0d)}), canonicalSmsMessage.timestampMs);
    }

    private final String attachmentText(CanonicalSmsMessage canonicalSmsMessage) {
        if (!canonicalSmsMessage.attachments.isEmpty()) {
            String strA0l = AnonymousClass002.A0l(AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, canonicalSmsMessage.attachments, AnonymousClass1.INSTANCE));
            if (strA0l.length() > 0) {
                return strA0l;
            }
        }
        return null;
    }

    private final Comparator<ScoredMessage> rankOrder(final long j) {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.sms.SmsSearchMatcher$rankOrder$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Double.valueOf(((SmsSearchMatcher.ScoredMessage) t2).score).compareTo(Double.valueOf(((SmsSearchMatcher.ScoredMessage) t).score));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.commands.sms.SmsSearchMatcher$rankOrder$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                long j2 = ((SmsSearchMatcher.ScoredMessage) t).message.dateMs;
                long j3 = j;
                return C60Q.A01(Long.valueOf(Math.abs(j2 - j3)), Math.abs(((SmsSearchMatcher.ScoredMessage) t2).message.dateMs - j3));
            }
        };
        return new Comparator() { // from class: com.facebook.aura.commands.sms.SmsSearchMatcher$rankOrder$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((SmsSearchMatcher.ScoredMessage) t).message.message.messageId, ((SmsSearchMatcher.ScoredMessage) t2).message.message.messageId) : iCompare;
            }
        };
    }

    private final double scoreMessage(List<String> list, String str, SearchableMessage searchableMessage) {
        return NodeTextRelevanceScorer.INSTANCE.score(list, str, searchableMessage.fields, 3.0d);
    }

    public final List<CanonicalSmsMessage> rank(String str, List<SearchableMessage> list, int i, long j) {
        AnonymousClass003.A0u(str, list);
        if (i > 0) {
            NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
            List<String> list2 = nodeTextRelevanceScorer.tokenize(str);
            if (!list2.isEmpty()) {
                String strNormalize = nodeTextRelevanceScorer.normalize(str);
                ArrayList arrayListA0h = C3cG.A0h();
                for (SearchableMessage searchableMessage : list) {
                    double dScoreMessage = INSTANCE.scoreMessage(list2, strNormalize, searchableMessage);
                    if (dScoreMessage > 0.0d) {
                        arrayListA0h.add(new ScoredMessage(searchableMessage, dScoreMessage));
                    }
                }
                List listA0a = AbstractC0878AGe.A0a(AbstractC0878AGe.A0c(arrayListA0h, rankOrder(j)), i);
                ArrayList arrayListA0i = AnonymousClass003.A0i(listA0a);
                Iterator it = listA0a.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((ScoredMessage) it.next()).message.message);
                }
                return arrayListA0i;
            }
        }
        return C0881AGi.A00;
    }
}
