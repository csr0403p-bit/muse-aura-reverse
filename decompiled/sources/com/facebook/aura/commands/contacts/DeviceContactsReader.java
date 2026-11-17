package com.facebook.aura.commands.contacts;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0881AGi;
import X.C0KA;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class DeviceContactsReader {
    public static final DeviceContactsReader INSTANCE = new DeviceContactsReader();
    public static final long START_ID = 0;

    public final class ContactPage extends C06G {
        public final List<CanonicalContact> contacts;
        public final boolean hasMore;
        public final long lastId;

        public ContactPage(List<CanonicalContact> list, long j, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.contacts = list;
            this.lastId = j;
            this.hasMore = z;
        }

        public final ContactPage copy(List<CanonicalContact> list, long j, boolean z) {
            C7384Etj.A0Y(list, 0);
            return new ContactPage(list, j, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ContactPage) {
                    ContactPage contactPage = (ContactPage) obj;
                    if (!C7384Etj.areEqual(this.contacts, contactPage.contacts) || this.lastId != contactPage.lastId || this.hasMore != contactPage.hasMore) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContactPage copy$default(ContactPage contactPage, List list, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = contactPage.contacts;
            }
            if ((i & 2) != 0) {
                j = contactPage.lastId;
            }
            if ((i & 4) != 0) {
                z = contactPage.hasMore;
            }
            return contactPage.copy(list, j, z);
        }

        public final List<CanonicalContact> component1() {
            return this.contacts;
        }

        public final long component2() {
            return this.lastId;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final List<CanonicalContact> getContacts() {
            return this.contacts;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final long getLastId() {
            return this.lastId;
        }

        public int hashCode() {
            return C0KA.A00(C60R.A00(this.lastId, AnonymousClass005.A0E(this.contacts)), this.hasMore);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ContactRow extends C06G {
        public final String displayName;
        public final long id;
        public final String lookupKey;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ContactRow) {
                    ContactRow contactRow = (ContactRow) obj;
                    if (this.id != contactRow.id || !C7384Etj.areEqual(this.displayName, contactRow.displayName) || !C7384Etj.areEqual(this.lookupKey, contactRow.lookupKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ContactRow copy$default(ContactRow contactRow, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = contactRow.id;
            }
            if ((i & 2) != 0) {
                str = contactRow.displayName;
            }
            if ((i & 4) != 0) {
                str2 = contactRow.lookupKey;
            }
            return contactRow.copy(j, str, str2);
        }

        public final long component1() {
            return this.id;
        }

        public final String component2() {
            return this.displayName;
        }

        public final String component3() {
            return this.lookupKey;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final long getId() {
            return this.id;
        }

        public final String getLookupKey() {
            return this.lookupKey;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.lookupKey, AnonymousClass005.A0I(this.displayName, AnonymousClass002.A0A(this.id) * 31));
        }

        public ContactRow(long j, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            this.id = j;
            this.displayName = str;
            this.lookupKey = str2;
        }

        public final ContactRow copy(long j, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
            return new ContactRow(j, str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.DeviceContactsReader$countContacts$2", f = "DeviceContactsReader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.DeviceContactsReader$countContacts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return new AnonymousClass2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Cursor cursorQuery = this.$context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
            if (cursorQuery == null) {
                throw new ContactsProviderUnavailableException("countContacts");
            }
            try {
                int count = cursorQuery.getCount();
                cursorQuery.close();
                return C3cG.A0R(count);
            } finally {
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.DeviceContactsReader$countContactsChangedSince$2", f = "DeviceContactsReader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.DeviceContactsReader$countContactsChangedSince$2, reason: invalid class name and case insensitive filesystem */
    public final class C111122 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $sinceMs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111122(Context context, long j, HtJ<? super C111122> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$sinceMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111122(this.$context, this.$sinceMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Cursor cursorQuery = this.$context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, "contact_last_updated_timestamp > ?", C60Q.A1a(this.$sinceMs), null);
            if (cursorQuery == null) {
                throw new ContactsProviderUnavailableException("countContactsChangedSince");
            }
            try {
                int count = cursorQuery.getCount();
                cursorQuery.close();
                return C3cG.A0R(count);
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ((C111122) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.DeviceContactsReader$readContactPage$2", f = "DeviceContactsReader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.DeviceContactsReader$readContactPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C111132 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ContactPage>, Object> {
        public final /* synthetic */ long $afterId;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ int $limit;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111132(Context context, long j, int i, HtJ<? super C111132> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$afterId = j;
            this.$limit = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111132(this.$context, this.$afterId, this.$limit, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return DeviceContactsReader.INSTANCE.readPage(this.$context, this.$afterId, this.$limit);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ContactPage> htJ) {
            return ((C111132) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String inClause(String str, List<Long> list) {
        return FGI.A0d(str, " IN (", C3cH.A0e(",", list), ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.facebook.aura.commands.contacts.DeviceContactsReader] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final ContactPage readPage(Context context, long j, int i) {
        ?? A0m;
        String str;
        String str2;
        String string;
        long j2 = j;
        ContentResolver contentResolver = context.getContentResolver();
        Resources resources = context.getResources();
        ArrayList arrayListA0h = C3cG.A0h();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Cursor cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter(PhotosSearchHandlerKt.PARAM_LIMIT, String.valueOf(i)).build(), new String[]{"_id", "display_name", "lookup"}, "_id > ?", C60Q.A1a(j2), "_id ASC");
        if (cursorQuery == null) {
            throw new ContactsProviderUnavailableException(FGI.A0J("readPage(after=", j2, ")"));
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("display_name");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("lookup");
            int i2 = 0;
            while (i2 < i) {
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                i2++;
                j2 = cursorQuery.getLong(columnIndexOrThrow);
                String string2 = cursorQuery.getString(columnIndexOrThrow3);
                if (string2 != null && (string = cursorQuery.getString(columnIndexOrThrow2)) != null && !C7BY.A0j(string) && linkedHashSetA0k.add(string2)) {
                    arrayListA0h.add(new ContactRow(j2, string, string2));
                }
            }
            cursorQuery.close();
            boolean zA1Q = AnonymousClass002.A1Q(i2, i);
            if (arrayListA0h.isEmpty()) {
                A0m = C0881AGi.A00;
            } else {
                ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    arrayListA0m.add(Long.valueOf(((ContactRow) it.next()).id));
                }
                C7384Etj.A0X(resources);
                Map<Long, List<ContactPhone>> mapBatchQueryPhones = batchQueryPhones(contentResolver, resources, arrayListA0m);
                Map<Long, List<ContactEmail>> mapBatchQueryEmails = batchQueryEmails(contentResolver, resources, arrayListA0m);
                Map<Long, List<ContactAddress>> mapBatchQueryAddresses = batchQueryAddresses(contentResolver, resources, arrayListA0m);
                Map<Long, HxE<String, String>> mapBatchQueryOrganizations = batchQueryOrganizations(contentResolver, arrayListA0m);
                Map<Long, String> mapBatchQueryNotes = batchQueryNotes(contentResolver, arrayListA0m);
                Map<Long, String> mapBatchQueryBirthdays = batchQueryBirthdays(contentResolver, arrayListA0m);
                A0m = AnonymousClass002.A0m(arrayListA0h);
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    ContactRow contactRow = (ContactRow) it2.next();
                    HxE hxE = (HxE) C60Q.A0a(mapBatchQueryOrganizations, contactRow.id);
                    String str3 = contactRow.lookupKey;
                    String str4 = contactRow.displayName;
                    if (hxE != null) {
                        str = (String) hxE.first;
                        str2 = (String) hxE.second;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    List list = (List) C60Q.A0a(mapBatchQueryPhones, contactRow.id);
                    if (list == null) {
                        list = C0881AGi.A00;
                    }
                    List list2 = (List) C60Q.A0a(mapBatchQueryEmails, contactRow.id);
                    if (list2 == null) {
                        list2 = C0881AGi.A00;
                    }
                    List list3 = (List) C60Q.A0a(mapBatchQueryAddresses, contactRow.id);
                    if (list3 == null) {
                        list3 = C0881AGi.A00;
                    }
                    A0m.add(new CanonicalContact(str3, str4, str, str2, list, list2, list3, (String) C60Q.A0a(mapBatchQueryBirthdays, contactRow.id), (String) C60Q.A0a(mapBatchQueryNotes, contactRow.id), null));
                }
            }
            return new ContactPage(A0m, j2, zA1Q);
        } finally {
        }
    }

    private final Map<Long, List<ContactAddress>> batchQueryAddresses(ContentResolver contentResolver, Resources resources, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, new String[]{"contact_id", "data2", "data3", "data4", "data7", "data8", "data9", "data10"}, inClause("contact_id", list), null, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data2");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data3");
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("data4");
                int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("data7");
                int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("data8");
                int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("data9");
                int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("data10");
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(resources, cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3)).toString();
                    List list2 = (List) C60R.A0Z(Long.valueOf(j), linkedHashMapA0j);
                    String string2 = cursorQuery.getString(columnIndexOrThrow4);
                    if (string2 == null || C7BY.A0j(string2)) {
                        string2 = null;
                    }
                    String string3 = cursorQuery.getString(columnIndexOrThrow5);
                    if (string3 == null || C7BY.A0j(string3)) {
                        string3 = null;
                    }
                    String string4 = cursorQuery.getString(columnIndexOrThrow6);
                    if (string4 == null || C7BY.A0j(string4)) {
                        string4 = null;
                    }
                    String string5 = cursorQuery.getString(columnIndexOrThrow7);
                    if (string5 == null || C7BY.A0j(string5)) {
                        string5 = null;
                    }
                    String string6 = cursorQuery.getString(columnIndexOrThrow8);
                    if (string6 == null || C7BY.A0j(string6)) {
                        string6 = null;
                    }
                    list2.add(new ContactAddress(string, string2, string3, string4, string5, string6));
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    private final Map<Long, String> batchQueryBirthdays(ContentResolver contentResolver, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, FGI.A0M("mimetype = ? AND data2 = ? AND ", inClause("contact_id", list)), new String[]{"vnd.android.cursor.item/contact_event", "3"}, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                while (true) {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string != null) {
                        String str = C7BY.A0j(string) ? null : string;
                        if (str != null) {
                            linkedHashMapA0j.put(Long.valueOf(j), str);
                        }
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    private final Map<Long, List<ContactEmail>> batchQueryEmails(ContentResolver contentResolver, Resources resources, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3"}, inClause("contact_id", list), null, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data2");
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("data3");
                while (true) {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string != null) {
                        String str = C7BY.A0j(string) ? null : string;
                        if (str != null) {
                            ((List) C60R.A0Z(Long.valueOf(j), linkedHashMapA0j)).add(new ContactEmail(ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)).toString(), str));
                        }
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    private final Map<Long, String> batchQueryNotes(ContentResolver contentResolver, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1"}, FGI.A0M("mimetype = ? AND ", inClause("contact_id", list)), new String[]{"vnd.android.cursor.item/note"}, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                while (true) {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string != null) {
                        String str = C7BY.A0j(string) ? null : string;
                        if (str != null) {
                            linkedHashMapA0j.put(Long.valueOf(j), str);
                        }
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    private final Map<Long, HxE<String, String>> batchQueryOrganizations(ContentResolver contentResolver, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data4"}, FGI.A0M("mimetype = ? AND ", inClause("contact_id", list)), new String[]{"vnd.android.cursor.item/organization"}, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data4");
                while (true) {
                    String str = null;
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string == null || C7BY.A0j(string)) {
                        string = null;
                    }
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    if (string2 != null && !C7BY.A0j(string2)) {
                        str = string2;
                    }
                    if (string != null || str != null) {
                        linkedHashMapA0j.put(Long.valueOf(j), C3cG.A0r(string, str));
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    private final Map<Long, List<ContactPhone>> batchQueryPhones(ContentResolver contentResolver, Resources resources, List<Long> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3"}, inClause("contact_id", list), null, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data2");
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("data3");
                while (true) {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string != null) {
                        String str = C7BY.A0j(string) ? null : string;
                        if (str != null) {
                            ((List) C60R.A0Z(Long.valueOf(j), linkedHashMapA0j)).add(new ContactPhone(ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)).toString(), str));
                        }
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    public final Object countContacts(Context context, HtJ<? super Integer> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, null));
    }

    public final Object countContactsChangedSince(Context context, long j, HtJ<? super Integer> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111122(context, j, null));
    }

    public final Object readContactPage(Context context, long j, int i, HtJ<? super ContactPage> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111132(context, j, i, null));
    }
}
