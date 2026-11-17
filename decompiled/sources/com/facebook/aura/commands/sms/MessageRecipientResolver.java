package com.facebook.aura.commands.sms;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06G;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.aura.commands.core.PhoneNumberHeuristicsKt;
import com.facebook.aura.commands.sms.MessageRecipientResolver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MessageRecipientResolver {
    public static final MessageRecipientResolver INSTANCE = new MessageRecipientResolver();
    public static final Comparator<PhoneRow> PHONE_PREFERENCE;

    public interface NameMatch {

        public final class Candidates extends C06G implements NameMatch {
            public final List<ContactCandidate> candidates;

            public Candidates(List<ContactCandidate> list) {
                C7384Etj.A0Y(list, 0);
                this.candidates = list;
            }

            public final Candidates copy(List<ContactCandidate> list) {
                C7384Etj.A0Y(list, 0);
                return new Candidates(list);
            }

            public static /* synthetic */ Candidates copy$default(Candidates candidates, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = candidates.candidates;
                }
                C7384Etj.A0Y(list, 0);
                return new Candidates(list);
            }

            public final List<ContactCandidate> component1() {
                return this.candidates;
            }

            public final List<ContactCandidate> getCandidates() {
                return this.candidates;
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

        public final class None implements NameMatch {
            public static final None INSTANCE = new None();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 86064023;
            }
        }
    }

    public final class PhoneRow {
        public final long id;
        public final boolean isMobile;
        public final boolean isPrimary;
        public final boolean isSuperPrimary;
        public final String number;

        public PhoneRow(String str, boolean z, boolean z2, boolean z3, long j) {
            C7384Etj.A0Y(str, 0);
            this.number = str;
            this.isSuperPrimary = z;
            this.isPrimary = z2;
            this.isMobile = z3;
            this.id = j;
        }

        public final long getId() {
            return this.id;
        }

        public final String getNumber() {
            return this.number;
        }

        public final boolean isMobile() {
            return this.isMobile;
        }

        public final boolean isPrimary() {
            return this.isPrimary;
        }

        public final boolean isSuperPrimary() {
            return this.isSuperPrimary;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.MessageRecipientResolver$resolve$2", f = "MessageRecipientResolver.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.MessageRecipientResolver$resolve$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RecipientResolution>, Object> {
        public final /* synthetic */ String $contactIdsCsv;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $recipientsCsv;
        public final /* synthetic */ boolean $resolveName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Context context, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$recipientsCsv = str;
            this.$contactIdsCsv = str2;
            this.$context = context;
            this.$resolveName = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$recipientsCsv, this.$contactIdsCsv, this.$context, this.$resolveName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MessageRecipientResolver messageRecipientResolver = MessageRecipientResolver.INSTANCE;
            List listSplitCsv = messageRecipientResolver.splitCsv(this.$recipientsCsv);
            List listSplitCsv2 = messageRecipientResolver.splitCsv(this.$contactIdsCsv);
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it = listSplitCsv.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (PhoneNumberHeuristicsKt.looksLikePhoneNumber(strA0j) || messageRecipientResolver.looksLikeEmail(strA0j)) {
                    arrayListA0h.add(strA0j);
                } else {
                    arrayListA0h2.add(strA0j);
                }
            }
            boolean z = false;
            boolean zA1M = AnonymousClass002.A1M(this.$context.checkSelfPermission("android.permission.READ_CONTACTS"));
            ArrayList arrayListA0h3 = C3cG.A0h();
            ArrayList arrayListA0h4 = C3cG.A0h();
            if (!arrayListA0h2.isEmpty()) {
                if (!this.$resolveName) {
                    arrayListA0h4.addAll(arrayListA0h2);
                } else if (zA1M) {
                    Iterator it2 = arrayListA0h2.iterator();
                    while (it2.hasNext()) {
                        String strA0j2 = AnonymousClass005.A0j(it2);
                        NameMatch nameMatchMatchContactsByName = messageRecipientResolver.matchContactsByName(this.$context, strA0j2);
                        if (nameMatchMatchContactsByName instanceof NameMatch.Candidates) {
                            arrayListA0h3.add(new AmbiguousNameMatch(strA0j2, ((NameMatch.Candidates) nameMatchMatchContactsByName).candidates));
                        } else {
                            if (!C7384Etj.areEqual(nameMatchMatchContactsByName, NameMatch.None.INSTANCE)) {
                                throw C3cG.A0q();
                            }
                            arrayListA0h4.add(strA0j2);
                        }
                    }
                } else {
                    z = true;
                    arrayListA0h4.addAll(arrayListA0h2);
                }
            }
            ArrayList arrayListA0h5 = C3cG.A0h();
            ArrayList arrayListA0h6 = C3cG.A0h();
            if (!listSplitCsv2.isEmpty()) {
                if (zA1M) {
                    Iterator it3 = listSplitCsv2.iterator();
                    while (it3.hasNext()) {
                        String strA0j3 = AnonymousClass005.A0j(it3);
                        String strPhoneForLookupKey = messageRecipientResolver.phoneForLookupKey(this.$context, strA0j3);
                        if (strPhoneForLookupKey == null) {
                            arrayListA0h6.add(strA0j3);
                        } else {
                            arrayListA0h5.add(strPhoneForLookupKey);
                        }
                    }
                } else {
                    z = true;
                }
            }
            String strDefaultRegion = PhoneNormalizer.INSTANCE.defaultRegion(this.$context);
            ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
            Iterator it4 = arrayListA0h.iterator();
            while (it4.hasNext()) {
                arrayListA0m.add(messageRecipientResolver.canonicalAddress(AnonymousClass005.A0j(it4), strDefaultRegion));
            }
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h5);
            Iterator it5 = arrayListA0h5.iterator();
            while (it5.hasNext()) {
                arrayListA0m2.add(messageRecipientResolver.canonicalAddress(AnonymousClass005.A0j(it5), strDefaultRegion));
            }
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0m2, arrayListA0m);
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            ArrayList arrayListA0h7 = C3cG.A0h();
            Iterator it6 = arrayListA0P.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                if (linkedHashSetA0k.add(next)) {
                    arrayListA0h7.add(next);
                }
            }
            return new RecipientResolution(arrayListA0h7, arrayListA0h4, arrayListA0h3, z, arrayListA0h6);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RecipientResolution> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String phoneForLookupKey(Context context, String str) {
        Long lValueOf;
        Cursor cursorQuery;
        try {
            cursorQuery = context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, "lookup = ?", new String[]{str}, null);
        } catch (Exception e) {
            CFK.A08(MessageRecipientResolverKt.TAG, "Failed to resolve contact_id", e);
        }
        if (cursorQuery != null) {
            try {
                lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(0)) : null;
                cursorQuery.close();
            } finally {
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return primaryNumberForContactId(context, lValueOf.longValue());
        }
        return null;
    }

    private final String primaryNumberForContactId(Context context, long j) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data2", "is_super_primary", "is_primary", "_id"}, "contact_id = ?", new String[]{String.valueOf(j)}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                String strPreferredNumber = preferredNumber(cursorQuery);
                cursorQuery.close();
                return strPreferredNumber;
            } finally {
            }
        } catch (Exception e) {
            CFK.A08(MessageRecipientResolverKt.TAG, "Failed to read contact phone", e);
            return null;
        }
    }

    public final String canonicalAddress(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return !looksLikeEmail(str) ? PhoneNormalizer.INSTANCE.toE164(str, str2) : str;
    }

    static {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.sms.MessageRecipientResolver$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t2).isSuperPrimary).compareTo(Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t).isSuperPrimary));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.commands.sms.MessageRecipientResolver$special$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t2).isPrimary).compareTo(Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t).isPrimary)) : iCompare;
            }
        };
        final Comparator comparator3 = new Comparator() { // from class: com.facebook.aura.commands.sms.MessageRecipientResolver$special$$inlined$thenByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t2).isMobile).compareTo(Boolean.valueOf(((MessageRecipientResolver.PhoneRow) t).isMobile)) : iCompare;
            }
        };
        PHONE_PREFERENCE = new Comparator() { // from class: com.facebook.aura.commands.sms.MessageRecipientResolver$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator3.compare(t, t2);
                return iCompare == 0 ? C60Q.A01(Long.valueOf(((MessageRecipientResolver.PhoneRow) t).id), ((MessageRecipientResolver.PhoneRow) t2).id) : iCompare;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean looksLikeEmail(String str) {
        int iA08 = C7BY.A08(str, '@', 0);
        if (iA08 > 0) {
            C7384Etj.A0Y(str, 0);
            if (iA08 == C7BY.A09(str, '@', str.length() - 1)) {
                String strSubstring = str.substring(iA08 + 1);
                if (C7BY.A0k(strSubstring, '.') && !C7BY.A0m(strSubstring, '.') && !C7BY.A0l(strSubstring, '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NameMatch matchContactsByName(Context context, String str) {
        MessageRecipientResolver messageRecipientResolver;
        String strPrimaryNumberForContactId;
        ArrayList arrayListA0h = C3cG.A0h();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id", "lookup", "display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("lookup");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("display_name");
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        String string = cursorQuery.getString(columnIndexOrThrow2);
                        if (string != null && (strPrimaryNumberForContactId = (messageRecipientResolver = INSTANCE).primaryNumberForContactId(context, j)) != null && linkedHashSetA0k.add(messageRecipientResolver.digitsOnly(strPrimaryNumberForContactId))) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow3);
                            if (string2 == null || C7BY.A0j(string2)) {
                                string2 = str;
                            }
                            arrayListA0h.add(new ContactCandidate(string2, strPrimaryNumberForContactId, string));
                        }
                    }
                    cursorQuery.close();
                } finally {
                }
            }
            if (arrayListA0h.isEmpty()) {
                return NameMatch.None.INSTANCE;
            }
            final String strA0l = AnonymousClass002.A0l(str);
            return new NameMatch.Candidates(AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.commands.sms.MessageRecipientResolver$matchContactsByName$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    String str2 = ((ContactCandidate) t2).name;
                    String str3 = strA0l;
                    return Boolean.valueOf(AbstractC2159Azp.A12(str2, str3, true)).compareTo(Boolean.valueOf(AbstractC2159Azp.A12(((ContactCandidate) t).name, str3, true)));
                }
            }));
        } catch (Exception e) {
            CFK.A08(MessageRecipientResolverKt.TAG, "Failed to match contacts by name", e);
            return NameMatch.None.INSTANCE;
        }
    }

    private final String preferredNumber(Cursor cursor) throws IllegalArgumentException {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("data1");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data2");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("is_super_primary");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("is_primary");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("_id");
        PhoneRow phoneRow = null;
        while (cursor.moveToNext()) {
            String string = cursor.getString(columnIndexOrThrow);
            if (string != null && !C7BY.A0j(string)) {
                PhoneRow phoneRow2 = new PhoneRow(string, AnonymousClass002.A1L(cursor.getInt(columnIndexOrThrow3)), AnonymousClass002.A1L(cursor.getInt(columnIndexOrThrow4)), AnonymousClass002.A1Q(cursor.getInt(columnIndexOrThrow2), 2), cursor.getLong(columnIndexOrThrow5));
                if (phoneRow == null || PHONE_PREFERENCE.compare(phoneRow2, phoneRow) < 0) {
                    phoneRow = phoneRow2;
                }
            }
        }
        if (phoneRow != null) {
            return phoneRow.number;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> splitCsv(String str) {
        List listA0e = C7BY.A0e(str, ",");
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0e);
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C7BY.A0b(it));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0i.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it2);
        }
        return arrayListA0h;
    }

    private final String digitsOnly(String str) {
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        String string = sbA0w.toString();
        return string.length() != 0 ? string : str;
    }

    public final Object resolve(Context context, String str, String str2, boolean z, HtJ<? super RecipientResolution> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, context, z, null));
    }
}
