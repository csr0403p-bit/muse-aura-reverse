package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EIT implements InterfaceC6590EIi {
    public final String identityHash;
    public final String legacyIdentityHash;
    public final int version;

    public static EIs A00(String str, String str2, String str3, int i) {
        return new EIs(str, str2, str3, i, 1, true);
    }

    public static void A01(String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(str, new EIs(str, str2, null, 1, 1, true));
    }

    public static void A02(String str, AbstractCollection abstractCollection, List list, List list2) {
        abstractCollection.add(new C6595EIw(str, false, list, list2));
    }

    public abstract void createAllTables(EJV ejv);

    public abstract void dropAllTables(EJV ejv);

    public abstract void onCreate(EJV ejv);

    public abstract void onOpen(EJV ejv);

    public abstract void onPostMigrate(EJV ejv);

    public abstract void onPreMigrate(EJV ejv);

    public abstract C6587EIf onValidateSchema(EJV ejv);

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public EIT(int i, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }
}
