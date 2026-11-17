package com.facebook.aura.commands.contacts;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06G;
import X.C0881AGi;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.core.NodeTextRelevanceScorer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class ContactsSearchMatcher {
    public static final ContactsSearchMatcher INSTANCE = new ContactsSearchMatcher();
    public static final int MIN_PREFIX_TERM_LENGTH = 2;
    public static final double WEIGHT_ADDRESS = 1.0d;
    public static final double WEIGHT_EMAIL = 1.5d;
    public static final double WEIGHT_JOB_TITLE = 1.5d;
    public static final double WEIGHT_NAME = 3.0d;
    public static final double WEIGHT_NOTE = 1.0d;
    public static final double WEIGHT_ORGANIZATION = 2.0d;
    public static final double WEIGHT_PHONE = 0.5d;

    public final class PreparedQuery extends C06G {
        public final String phrase;
        public final List<String> terms;

        public static /* synthetic */ PreparedQuery copy$default(PreparedQuery preparedQuery, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = preparedQuery.terms;
            }
            if ((i & 2) != 0) {
                str = preparedQuery.phrase;
            }
            AnonymousClass003.A0u(list, str);
            return new PreparedQuery(list, str);
        }

        public final List<String> component1() {
            return this.terms;
        }

        public final String component2() {
            return this.phrase;
        }

        public final String getPhrase() {
            return this.phrase;
        }

        public final List<String> getTerms() {
            return this.terms;
        }

        public PreparedQuery(List<String> list, String str) {
            AnonymousClass003.A0u(list, str);
            this.terms = list;
            this.phrase = str;
        }

        public final PreparedQuery copy(List<String> list, String str) {
            AnonymousClass003.A0u(list, str);
            return new PreparedQuery(list, str);
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

    public final class SearchableContact extends C06G {
        public final CanonicalContact contact;
        public final List<NodeTextRelevanceScorer.WeightedField> fields;

        public static /* synthetic */ SearchableContact copy$default(SearchableContact searchableContact, CanonicalContact canonicalContact, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                canonicalContact = searchableContact.contact;
            }
            if ((i & 2) != 0) {
                list = searchableContact.fields;
            }
            AnonymousClass003.A0u(canonicalContact, list);
            return new SearchableContact(canonicalContact, list);
        }

        public final CanonicalContact component1() {
            return this.contact;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> component2() {
            return this.fields;
        }

        public final CanonicalContact getContact() {
            return this.contact;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> getFields() {
            return this.fields;
        }

        public SearchableContact(CanonicalContact canonicalContact, List<NodeTextRelevanceScorer.WeightedField> list) {
            AnonymousClass003.A0u(canonicalContact, list);
            this.contact = canonicalContact;
            this.fields = list;
        }

        public final SearchableContact copy(CanonicalContact canonicalContact, List<NodeTextRelevanceScorer.WeightedField> list) {
            AnonymousClass003.A0u(canonicalContact, list);
            return new SearchableContact(canonicalContact, list);
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

    /* loaded from: classes5.dex */
    public final class TopMatches {
        public final PriorityQueue<ScoredContact> heap;
        public final int limit;
        public final Comparator<ScoredContact> weakestFirst;

        public final void offer(CanonicalContact canonicalContact, double d) {
            C7384Etj.A0Y(canonicalContact, 0);
            if (this.limit <= 0 || d <= 0.0d) {
                return;
            }
            ScoredContact scoredContact = new ScoredContact(canonicalContact, d);
            if (this.heap.size() >= this.limit) {
                if (this.weakestFirst.compare(scoredContact, this.heap.peek()) <= 0) {
                    return;
                } else {
                    this.heap.poll();
                }
            }
            this.heap.add(scoredContact);
        }

        public final List<CanonicalContact> result() {
            List listA0c = AbstractC0878AGe.A0c(this.heap, ContactsSearchMatcherKt.rankOrder());
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
            Iterator it = listA0c.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((ScoredContact) it.next()).contact);
            }
            return arrayListA0i;
        }

        public TopMatches(int i) {
            this.limit = i;
            Comparator<ScoredContact> comparatorReversed = ContactsSearchMatcherKt.rankOrder().reversed();
            C7384Etj.A0U(comparatorReversed);
            this.weakestFirst = comparatorReversed;
            this.heap = new PriorityQueue<>(i < 1 ? 1 : i, comparatorReversed);
        }
    }

    /* renamed from: com.facebook.aura.commands.contacts.ContactsSearchMatcher$searchableOf$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ContactEmail, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(ContactEmail contactEmail) {
            ContactEmail contactEmail2 = contactEmail;
            C7384Etj.A0Y(contactEmail2, 0);
            return contactEmail2.value;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(ContactEmail contactEmail) {
            C7384Etj.A0Y(contactEmail, 0);
            return contactEmail.value;
        }
    }

    /* renamed from: com.facebook.aura.commands.contacts.ContactsSearchMatcher$searchableOf$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ContactAddress, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(ContactAddress contactAddress) {
            C7384Etj.A0Y(contactAddress, 0);
            return ContactsSearchMatcher.INSTANCE.searchableText(contactAddress);
        }
    }

    /* renamed from: com.facebook.aura.commands.contacts.ContactsSearchMatcher$searchableOf$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<ContactPhone, CharSequence> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(ContactPhone contactPhone) {
            ContactPhone contactPhone2 = contactPhone;
            C7384Etj.A0Y(contactPhone2, 0);
            return contactPhone2.value;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(ContactPhone contactPhone) {
            C7384Etj.A0Y(contactPhone, 0);
            return contactPhone.value;
        }
    }

    public final boolean matchesDisplayName(PreparedQuery preparedQuery, CanonicalContact canonicalContact) {
        boolean zA1a = AnonymousClass002.A1a(preparedQuery, canonicalContact);
        List<String> list = NodeTextRelevanceScorer.INSTANCE.tokenize(canonicalContact.displayName);
        if (!list.isEmpty()) {
            List<String> list2 = preparedQuery.terms;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return false;
                    }
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String strA0j2 = AnonymousClass005.A0j(it2);
                        if (C7384Etj.areEqual(strA0j2, strA0j) || (strA0j.length() >= 2 && AnonymousClass005.A1a(strA0j2, strA0j))) {
                            break;
                        }
                    }
                }
            }
            return zA1a;
        }
        return false;
    }

    public final PreparedQuery prepare(String str) {
        C7384Etj.A0Y(str, 0);
        NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
        List<String> list = nodeTextRelevanceScorer.tokenize(str);
        if (list.isEmpty()) {
            return null;
        }
        return new PreparedQuery(list, nodeTextRelevanceScorer.normalize(str));
    }

    public final SearchableContact searchableOf(CanonicalContact canonicalContact) {
        C7384Etj.A0Y(canonicalContact, 0);
        NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
        return new SearchableContact(canonicalContact, BFI.A0F(new NodeTextRelevanceScorer.WeightedField[]{nodeTextRelevanceScorer.field(canonicalContact.displayName, 3.0d), nodeTextRelevanceScorer.field(canonicalContact.organization, 2.0d), nodeTextRelevanceScorer.field(AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", canonicalContact.emails, AnonymousClass1.INSTANCE), 1.5d), nodeTextRelevanceScorer.field(canonicalContact.jobTitle, 1.5d), nodeTextRelevanceScorer.field(canonicalContact.note, 1.0d), nodeTextRelevanceScorer.field(AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", canonicalContact.addresses, AnonymousClass2.INSTANCE), 1.0d), nodeTextRelevanceScorer.field(AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", canonicalContact.phones, AnonymousClass3.INSTANCE), 0.5d)}));
    }

    private final double scoreContact(List<String> list, String str, SearchableContact searchableContact) {
        return NodeTextRelevanceScorer.INSTANCE.score(list, str, searchableContact.fields, 3.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String searchableText(ContactAddress contactAddress) {
        return C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, BFI.A0F(new String[]{contactAddress.street, contactAddress.city, contactAddress.state, contactAddress.country}));
    }

    public final List<CanonicalContact> rank(String str, List<SearchableContact> list, int i) {
        AnonymousClass003.A0u(str, list);
        PreparedQuery preparedQueryPrepare = prepare(str);
        if (preparedQueryPrepare == null) {
            return C0881AGi.A00;
        }
        TopMatches topMatches = new TopMatches(i);
        for (SearchableContact searchableContact : list) {
            topMatches.offer(searchableContact.contact, INSTANCE.score(preparedQueryPrepare, searchableContact));
        }
        return topMatches.result();
    }

    public final double score(PreparedQuery preparedQuery, SearchableContact searchableContact) {
        AnonymousClass003.A0u(preparedQuery, searchableContact);
        return scoreContact(preparedQuery.terms, preparedQuery.phrase, searchableContact);
    }
}
