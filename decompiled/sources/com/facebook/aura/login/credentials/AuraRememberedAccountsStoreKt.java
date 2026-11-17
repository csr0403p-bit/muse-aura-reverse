package com.facebook.aura.login.credentials;

import X.AbstractC0878AGe;
import X.AbstractC7531Ezs;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraRememberedAccountsStoreKt {
    public static final String KEY_ALIAS = "hatch_remembered_accounts_store";
    public static final String KEY_ORDER = "order";
    public static final String KEY_RECORD_PREFIX = "record.";
    public static final String KEY_VERSION = "version";
    public static final int LEGACY_MAX_LINKED_ACCOUNTS = 3;
    public static final int MAX_REMEMBERED_ACCOUNTS = 5;
    public static final int MAX_REMEMBERED_LINKED_ACCOUNTS = 7;
    public static final int SCHEMA_VERSION = 3;
    public static final String TAG = "AuraRememberedAccountsStore";
    public static final String UNCONSENTED_STORE_KEY = "native_login_local_saved_accounts";

    /* renamed from: com.facebook.aura.login.credentials.AuraRememberedAccountsStoreKt$readSealedOrder$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ C4oT $this_readSealedOrder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C4oT c4oT) {
            super(0);
            this.$this_readSealedOrder = c4oT;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            if (this.$this_readSealedOrder.getInt("version", 0) != 3) {
                return null;
            }
            String string = this.$this_readSealedOrder.getString(AuraRememberedAccountsStoreKt.KEY_ORDER, null);
            return string == null ? "" : string;
        }
    }

    public static final String orNullIfBlank(String str) {
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    public static final <T> T readOrNullOnWrongType(Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        try {
            return function0.invoke();
        } catch (RuntimeException e) {
            if ((e instanceof ClassCastException) || (e.getCause() instanceof ClassCastException)) {
                return null;
            }
            throw e;
        }
    }

    public static final List<RecordSlot> decodeOrder(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int i = dataInputStream.readInt();
            if (i < 0 || i >= 6) {
                throw new IOException(FGI.A0H("Unexpected order size ", i));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String utf = dataInputStream.readUTF();
                C7384Etj.A0U(utf);
                String utf2 = dataInputStream.readUTF();
                C7384Etj.A0U(utf2);
                arrayList.add(new RecordSlot(utf, utf2));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass006.A1P(((RecordSlot) next).slot, next, hashSet, arrayListA0h);
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                AnonymousClass006.A1P(((RecordSlot) next2).abraUserId, next2, hashSet2, arrayListA0h2);
            }
            dataInputStream.close();
            return arrayListA0h2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static final AuraRememberedAccount decodeRecord(byte[] bArr) throws IOException {
        int i;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            String utf = dataInputStream.readUTF();
            String optionalUTF = readOptionalUTF(dataInputStream);
            String optionalUTF2 = readOptionalUTF(dataInputStream);
            String optionalUTF3 = readOptionalUTF(dataInputStream);
            String optionalUTF4 = readOptionalUTF(dataInputStream);
            String optionalUTF5 = readOptionalUTF(dataInputStream);
            int i2 = dataInputStream.readInt();
            int i3 = dataInputStream.readInt();
            if (i3 < 0 || i3 >= 4) {
                throw new IOException(FGI.A0H("Unexpected facepile size ", i3));
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                String optionalUTF6 = readOptionalUTF(dataInputStream);
                String utf2 = dataInputStream.readUTF();
                C7384Etj.A0X(utf2);
                arrayList.add(new AuraRememberedLinkedAccount(optionalUTF6, utf2));
            }
            String optionalUTF7 = dataInputStream.available() > 0 ? readOptionalUTF(dataInputStream) : null;
            if (dataInputStream.available() > 0) {
                i = dataInputStream.readInt();
                if (i < 0 || i >= 5) {
                    throw new IOException(FGI.A0H("Unexpected extra facepile size ", i));
                }
            } else {
                i = 0;
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (int i5 = 0; i5 < i; i5++) {
                String optionalUTF8 = readOptionalUTF(dataInputStream);
                String utf3 = dataInputStream.readUTF();
                C7384Etj.A0U(utf3);
                arrayList2.add(new AuraRememberedLinkedAccount(optionalUTF8, utf3));
            }
            C7384Etj.A0X(utf);
            AuraRememberedAccount auraRememberedAccountNormalized = normalized(new AuraRememberedAccount(utf, optionalUTF, optionalUTF2, optionalUTF3, optionalUTF4, optionalUTF5, AbstractC0878AGe.A0P(arrayList2, arrayList), i2, optionalUTF7));
            dataInputStream.close();
            return auraRememberedAccountNormalized;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static final byte[] encodeOrder(List<RecordSlot> list) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(list.size());
            for (RecordSlot recordSlot : list) {
                dataOutputStream.writeUTF(recordSlot.slot);
                dataOutputStream.writeUTF(recordSlot.abraUserId);
            }
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7384Etj.A0U(byteArray);
            return byteArray;
        } finally {
        }
    }

    public static final byte[] encodeRecord(AuraRememberedAccount auraRememberedAccount) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF(auraRememberedAccount.abraUserId);
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.metaAccountId);
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.contactPoint);
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.name);
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.username);
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.profilePictureUrl);
            dataOutputStream.writeInt(auraRememberedAccount.linkedAccountCount);
            List<AuraRememberedLinkedAccount> listA0a = AbstractC0878AGe.A0a(auraRememberedAccount.linkedAccounts, 3);
            dataOutputStream.writeInt(listA0a.size());
            for (AuraRememberedLinkedAccount auraRememberedLinkedAccount : listA0a) {
                writeOptionalUTF(dataOutputStream, auraRememberedLinkedAccount.platform);
                dataOutputStream.writeUTF(auraRememberedLinkedAccount.profilePictureUrl);
            }
            writeOptionalUTF(dataOutputStream, auraRememberedAccount.savedAccountId);
            List<AuraRememberedLinkedAccount> listA0Z = AbstractC0878AGe.A0Z(auraRememberedAccount.linkedAccounts, 3);
            dataOutputStream.writeInt(listA0Z.size());
            for (AuraRememberedLinkedAccount auraRememberedLinkedAccount2 : listA0Z) {
                writeOptionalUTF(dataOutputStream, auraRememberedLinkedAccount2.platform);
                dataOutputStream.writeUTF(auraRememberedLinkedAccount2.profilePictureUrl);
            }
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7384Etj.A0U(byteArray);
            return byteArray;
        } finally {
        }
    }

    public static final AuraRememberedAccount mergedOnto(AuraRememberedAccount auraRememberedAccount, AuraRememberedAccount auraRememberedAccount2) {
        String str = auraRememberedAccount.abraUserId;
        String str2 = auraRememberedAccount.metaAccountId;
        String str3 = null;
        if (str2 == null) {
            str2 = auraRememberedAccount2 != null ? auraRememberedAccount2.metaAccountId : null;
        }
        String str4 = auraRememberedAccount.contactPoint;
        if (str4 == null) {
            str4 = auraRememberedAccount2 != null ? auraRememberedAccount2.contactPoint : null;
        }
        String str5 = auraRememberedAccount.name;
        if (str5 == null) {
            str5 = auraRememberedAccount2 != null ? auraRememberedAccount2.name : null;
        }
        String str6 = auraRememberedAccount.username;
        if (str6 == null) {
            str6 = auraRememberedAccount2 != null ? auraRememberedAccount2.username : null;
        }
        String str7 = auraRememberedAccount.profilePictureUrl;
        if (str7 == null) {
            str7 = auraRememberedAccount2 != null ? auraRememberedAccount2.profilePictureUrl : null;
        }
        List list = auraRememberedAccount.linkedAccounts;
        if (list.isEmpty() && (auraRememberedAccount2 == null || (list = auraRememberedAccount2.linkedAccounts) == null)) {
            list = C0881AGi.A00;
        }
        int i = auraRememberedAccount.linkedAccounts.isEmpty() ? auraRememberedAccount2 != null ? auraRememberedAccount2.linkedAccountCount : 0 : auraRememberedAccount.linkedAccountCount;
        String str8 = auraRememberedAccount.savedAccountId;
        if (str8 != null) {
            str3 = str8;
        } else if (auraRememberedAccount2 != null) {
            str3 = auraRememberedAccount2.savedAccountId;
        }
        return new AuraRememberedAccount(str, str2, str4, str5, str6, str7, list, i, str3);
    }

    public static final AuraRememberedAccount normalized(AuraRememberedAccount auraRememberedAccount) {
        if (C7BY.A0j(auraRememberedAccount.abraUserId)) {
            return null;
        }
        List<AuraRememberedLinkedAccount> list = auraRememberedAccount.linkedAccounts;
        ArrayList<AuraRememberedLinkedAccount> arrayListA0h = C3cG.A0h();
        for (AuraRememberedLinkedAccount auraRememberedLinkedAccount : list) {
            if (!C7BY.A0j(auraRememberedLinkedAccount.profilePictureUrl)) {
                arrayListA0h.add(auraRememberedLinkedAccount);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        for (AuraRememberedLinkedAccount auraRememberedLinkedAccount2 : arrayListA0h) {
            String strOrNullIfBlank = orNullIfBlank(auraRememberedLinkedAccount2.platform);
            String str = auraRememberedLinkedAccount2.profilePictureUrl;
            C7384Etj.A0Y(str, 1);
            arrayListA0i.add(new AuraRememberedLinkedAccount(strOrNullIfBlank, str));
        }
        List listA0a = AbstractC0878AGe.A0a(arrayListA0i, 7);
        return new AuraRememberedAccount(auraRememberedAccount.abraUserId, orNullIfBlank(auraRememberedAccount.metaAccountId), orNullIfBlank(auraRememberedAccount.contactPoint), orNullIfBlank(auraRememberedAccount.name), orNullIfBlank(auraRememberedAccount.username), orNullIfBlank(auraRememberedAccount.profilePictureUrl), listA0a, Math.max(auraRememberedAccount.linkedAccountCount, listA0a.size()), orNullIfBlank(auraRememberedAccount.savedAccountId));
    }

    public static final String readSealedOrder(C4oT c4oT) {
        return (String) readOrNullOnWrongType(new AnonymousClass1(c4oT));
    }

    public static final String readOptionalUTF(DataInputStream dataInputStream) {
        if (dataInputStream.readBoolean()) {
            return dataInputStream.readUTF();
        }
        return null;
    }

    public static final void writeOptionalUTF(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBoolean(AnonymousClass002.A1X(str));
        if (str != null) {
            dataOutputStream.writeUTF(str);
        }
    }
}
