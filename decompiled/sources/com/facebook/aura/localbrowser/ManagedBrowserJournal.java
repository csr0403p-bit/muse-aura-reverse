package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC0903AHf;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.BV3;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C9258GBl;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2261BLa;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class ManagedBrowserJournal {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_RECORDS = 4096;
    public volatile boolean closed;
    public final String executorId;
    public volatile boolean healthy;
    public final Database helper;
    public boolean initialized;
    public final InterfaceC2261BLa mutex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Claim {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Claim[] $VALUES;
        public static final Claim CLAIMED;
        public static final Claim DUPLICATE;
        public static final Claim FULL;
        public static final Claim UNAVAILABLE;

        static {
            Claim claim = new Claim("CLAIMED", 0);
            CLAIMED = claim;
            Claim claim2 = new Claim("DUPLICATE", 1);
            DUPLICATE = claim2;
            Claim claim3 = new Claim("FULL", 2);
            FULL = claim3;
            Claim claim4 = new Claim("UNAVAILABLE", 3);
            UNAVAILABLE = claim4;
            Claim[] claimArr = {claim, claim2, claim3, claim4};
            $VALUES = claimArr;
            $ENTRIES = C3cG.A0w(claimArr);
        }

        public static Ey9<Claim> getEntries() {
            return $ENTRIES;
        }

        public static Claim valueOf(String str) {
            return (Claim) Enum.valueOf(Claim.class, str);
        }

        public static Claim[] values() {
            return (Claim[]) $VALUES.clone();
        }

        public Claim(String str, int i) {
        }
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final String path(Context context, String str) {
            AnonymousClass003.A0u(context, str);
            byte[] bArrA1T = C3cH.A1T(str);
            C7384Etj.A0U(bArrA1T);
            String absolutePath = C3cG.A0O(context.getNoBackupFilesDir(), FGI.A0U("managed_browser_", BFI.A0C("", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserJournal$Companion$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return C3cJ.A0K(Integer.valueOf(((Number) obj).byteValue() & 255));
                }
            }, bArrA1T), ".db")).getAbsolutePath();
            C7384Etj.A0U(absolutePath);
            return absolutePath;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.localbrowser.ManagedBrowserJournal$access$2", f = "ManagedBrowserJournal.kt", l = {221}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserJournal$access$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<SQLiteDatabase, T> $action;
        public final /* synthetic */ T $unavailable;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(T t, G0U<? super SQLiteDatabase, ? extends T> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$unavailable = t;
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ManagedBrowserJournal.this.new AnonymousClass2(this.$unavailable, this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261BLa interfaceC2261BLa;
            ManagedBrowserJournal managedBrowserJournal;
            Object objInvoke;
            G0U<SQLiteDatabase, T> g0u;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ManagedBrowserJournal managedBrowserJournal2 = ManagedBrowserJournal.this;
                interfaceC2261BLa = managedBrowserJournal2.mutex;
                managedBrowserJournal = managedBrowserJournal2;
                objInvoke = this.$unavailable;
                g0u = this.$action;
                this.L$0 = interfaceC2261BLa;
                this.L$1 = managedBrowserJournal2;
                this.L$2 = objInvoke;
                this.L$3 = g0u;
                this.label = 1;
                if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                g0u = (G0U) this.L$3;
                objInvoke = this.L$2;
                managedBrowserJournal = (ManagedBrowserJournal) this.L$1;
                interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                Hwg.A00(obj);
            }
            try {
                if (managedBrowserJournal.isHealthy()) {
                    try {
                        SQLiteDatabase writableDatabase = managedBrowserJournal.helper.getWritableDatabase();
                        if (!managedBrowserJournal.initialized) {
                            writableDatabase.delete("outcomes", "executor != ?", new String[]{managedBrowserJournal.executorId});
                            managedBrowserJournal.initialized = true;
                        }
                        C7384Etj.A0X(writableDatabase);
                        objInvoke = g0u.invoke(writableDatabase);
                    } catch (RuntimeException e) {
                        managedBrowserJournal.disable(e);
                    }
                }
                return objInvoke;
            } finally {
                interfaceC2261BLa.Ahe(null);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.ManagedBrowserJournal$clear$2", f = "ManagedBrowserJournal.kt", l = {221}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserJournal$clear$2, reason: invalid class name and case insensitive filesystem */
    public final class C124952 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C124952(HtJ<? super C124952> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ManagedBrowserJournal.this.new C124952(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ManagedBrowserJournal.this.new C124952(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ManagedBrowserJournal managedBrowserJournal;
            InterfaceC2261BLa interfaceC2261BLa;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                managedBrowserJournal = ManagedBrowserJournal.this;
                interfaceC2261BLa = managedBrowserJournal.mutex;
                this.L$0 = interfaceC2261BLa;
                this.L$1 = managedBrowserJournal;
                this.label = 1;
                if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                managedBrowserJournal = (ManagedBrowserJournal) this.L$1;
                interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                Hwg.A00(obj);
            }
            try {
                managedBrowserJournal.closed = true;
                try {
                    try {
                        managedBrowserJournal.helper.getWritableDatabase().delete("outcomes", "executor = ?", new String[]{managedBrowserJournal.executorId});
                    } catch (SQLiteException e) {
                        managedBrowserJournal.disable(e);
                    }
                    interfaceC2261BLa.Ahe(null);
                    return Unit.INSTANCE;
                } finally {
                }
            } catch (Throwable th) {
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }
    }

    public static final Claim claim$lambda$0(ManagedBrowserJournal managedBrowserJournal, ManagedBrowserFenceJson managedBrowserFenceJson, boolean z, SQLiteDatabase sQLiteDatabase) throws SQLException {
        C7384Etj.A0Y(sQLiteDatabase, 3);
        Cursor cursorQuery = sQLiteDatabase.query("outcomes", new String[]{"operation"}, "executor = ? AND operation = ?", new String[]{managedBrowserJournal.executorId, managedBrowserFenceJson.operation_id}, null, null, null, "1");
        try {
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            cursorQuery.close();
            if (zMoveToFirst) {
                return Claim.DUPLICATE;
            }
            cursorQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM outcomes", null);
            cursorQuery.moveToFirst();
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            if (j >= (z ? 1 : 0) + 4096) {
                return Claim.FULL;
            }
            ManagedBrowserReplyJson managedBrowserReplyJson = new ManagedBrowserReplyJson(managedBrowserFenceJson, "unknown", null, null, null, null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("executor", managedBrowserJournal.executorId);
            contentValues.put("operation", managedBrowserFenceJson.operation_id);
            contentValues.put("task_binding", managedBrowserFenceJson.binding.task_binding_id);
            contentValues.put("receipt", HatchJsonKt.HatchJson.A02(managedBrowserReplyJson, ManagedBrowserReplyJson$$serializer.INSTANCE));
            sQLiteDatabase.insertOrThrow("outcomes", null, contentValues);
            return Claim.CLAIMED;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disable(RuntimeException runtimeException) {
        this.healthy = false;
        IllegalStateException illegalStateExceptionA0Q = C3cG.A0Q("Managed browser journal unavailable");
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        C7384Etj.A0U(stackTrace);
        illegalStateExceptionA0Q.setStackTrace((StackTraceElement[]) (24 >= stackTrace.length ? BFI.A0G(stackTrace) : Arrays.asList(AbstractC0903AHf.A08(stackTrace, 0, 24))).toArray(new StackTraceElement[0]));
        CFK.A08("ManagedBrowserJournal", "Durable receipts disabled", illegalStateExceptionA0Q);
    }

    private final ManagedBrowserReplyJson find(SQLiteDatabase sQLiteDatabase, String str) {
        ManagedBrowserReplyJson managedBrowserReplyJson;
        Cursor cursorQuery = sQLiteDatabase.query("outcomes", new String[]{"receipt"}, "executor = ? AND operation = ?", new String[]{this.executorId, str}, null, null, null, "1");
        try {
            if (cursorQuery.moveToFirst()) {
                try {
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    ManagedBrowserReplyJson$$serializer managedBrowserReplyJson$$serializer = ManagedBrowserReplyJson$$serializer.INSTANCE;
                    String string = cursorQuery.getString(0);
                    C7384Etj.A0U(string);
                    managedBrowserReplyJson = (ManagedBrowserReplyJson) c9sU.A00(string, managedBrowserReplyJson$$serializer);
                } catch (SerializationException unused) {
                }
            } else {
                managedBrowserReplyJson = null;
            }
            cursorQuery.close();
            return managedBrowserReplyJson;
        } finally {
        }
    }

    public static final ManagedBrowserReplyJson outcome$lambda$0(ManagedBrowserJournal managedBrowserJournal, String str, SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 2);
        return managedBrowserJournal.find(sQLiteDatabase, str);
    }

    public static final boolean retireBinding$lambda$0(ManagedBrowserJournal managedBrowserJournal, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 3);
        sQLiteDatabase.delete("outcomes", "executor = ? AND task_binding = ? AND operation != ?", new String[]{managedBrowserJournal.executorId, str, str2});
        return true;
    }

    public static final boolean settle$lambda$0(ManagedBrowserJournal managedBrowserJournal, ManagedBrowserReplyJson managedBrowserReplyJson, SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 2);
        ManagedBrowserReplyJson managedBrowserReplyJsonFind = managedBrowserJournal.find(sQLiteDatabase, managedBrowserReplyJson.fence.operation_id);
        if (managedBrowserReplyJsonFind != null && C7384Etj.areEqual(managedBrowserReplyJsonFind.fence, managedBrowserReplyJson.fence) && "unknown".equals(managedBrowserReplyJsonFind.effect)) {
            ContentValues contentValues = new ContentValues();
            ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson = managedBrowserReplyJson.receipt;
            ManagedBrowserActionReceiptJson managedBrowserActionReceiptJsonCopy$default = managedBrowserActionReceiptJson != null ? ManagedBrowserActionReceiptJson.copy$default(managedBrowserActionReceiptJson, 0, null, null, null, null, null, 0L, 0L, null, 255, null) : null;
            ManagedBrowserFenceJson managedBrowserFenceJson = managedBrowserReplyJson.fence;
            String str = managedBrowserReplyJson.effect;
            ManagedBrowserDocumentJson managedBrowserDocumentJson = managedBrowserReplyJson.document;
            ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson = managedBrowserReplyJson.control;
            String str2 = managedBrowserReplyJson.assistance;
            AnonymousClass003.A0u(managedBrowserFenceJson, str);
            contentValues.put("receipt", HatchJsonKt.HatchJson.A02(new ManagedBrowserReplyJson(managedBrowserFenceJson, str, managedBrowserDocumentJson, managedBrowserControlReceiptJson, managedBrowserActionReceiptJsonCopy$default, null, str2), ManagedBrowserReplyJson$$serializer.INSTANCE));
            if (sQLiteDatabase.update("outcomes", contentValues, "executor = ? AND operation = ?", new String[]{managedBrowserJournal.executorId, managedBrowserReplyJson.fence.operation_id}) == 1) {
                return true;
            }
        }
        return false;
    }

    public final class Database extends SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) throws SQLException {
            C7384Etj.A0Y(sQLiteDatabase, 0);
            sQLiteDatabase.execSQL(BV3.A00(41));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            C7384Etj.A0Y(sQLiteDatabase, 0);
            sQLiteDatabase.execSQL("CREATE TABLE outcomes (executor TEXT NOT NULL, operation TEXT NOT NULL, task_binding TEXT NOT NULL, receipt TEXT NOT NULL, PRIMARY KEY (executor, operation))");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
            C7384Etj.A0Y(sQLiteDatabase, 0);
            if (i != 1 || i2 != 2) {
                throw C3cG.A0Q("Check failed.");
            }
            sQLiteDatabase.execSQL("ALTER TABLE outcomes ADD COLUMN task_binding TEXT NOT NULL DEFAULT ''");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Database(Context context, String str) {
            super(context, ManagedBrowserJournal.Companion.path(context, str), (SQLiteDatabase.CursorFactory) null, 2);
            AnonymousClass003.A0u(context, str);
        }
    }

    private final String encode(ManagedBrowserReplyJson managedBrowserReplyJson) {
        return HatchJsonKt.HatchJson.A02(managedBrowserReplyJson, ManagedBrowserReplyJson$$serializer.INSTANCE);
    }

    public final Object claim(final ManagedBrowserFenceJson managedBrowserFenceJson, final boolean z, HtJ<? super Claim> htJ) {
        return access(Claim.UNAVAILABLE, new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserJournal$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return ManagedBrowserJournal.claim$lambda$0(this.f$0, managedBrowserFenceJson, z, (SQLiteDatabase) obj);
            }
        }, htJ);
    }

    public final boolean isHealthy() {
        return this.healthy && !this.closed;
    }

    public final Object outcome(final String str, HtJ<? super ManagedBrowserReplyJson> htJ) {
        return access(null, new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserJournal$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return ManagedBrowserJournal.outcome$lambda$0(this.f$0, str, (SQLiteDatabase) obj);
            }
        }, htJ);
    }

    public ManagedBrowserJournal(Context context, String str, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(context, str, str2);
        this.executorId = str2;
        this.mutex = new C9258GBl();
        this.helper = new Database(AnonymousClass001.A0I(context), str);
        this.healthy = zA1Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object access(T t, G0U<? super SQLiteDatabase, ? extends T> g0u, HtJ<? super T> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(t, g0u, null));
    }

    public final Object clear(HtJ<? super Unit> htJ) {
        Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C124952(null));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object retireBinding(final String str, final String str2, HtJ<? super Boolean> htJ) {
        return access(AnonymousClass001.A0h(), new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserJournal$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserJournal.retireBinding$lambda$0(this.f$0, str, str2, (SQLiteDatabase) obj));
            }
        }, htJ);
    }

    public final Object settle(final ManagedBrowserReplyJson managedBrowserReplyJson, HtJ<? super Boolean> htJ) {
        return access(AnonymousClass001.A0h(), new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserJournal$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserJournal.settle$lambda$0(this.f$0, managedBrowserReplyJson, (SQLiteDatabase) obj));
            }
        }, htJ);
    }
}
